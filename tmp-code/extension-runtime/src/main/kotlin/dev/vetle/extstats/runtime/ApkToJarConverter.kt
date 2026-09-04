package dev.vetle.extstats.runtime

import com.googlecode.d2j.dex.Dex2jar
import net.dongliu.apk.parser.ApkFile
import org.objectweb.asm.ClassReader
import org.objectweb.asm.ClassWriter
import org.objectweb.asm.Opcodes
import org.objectweb.asm.Type
import org.objectweb.asm.tree.ClassNode
import org.objectweb.asm.tree.FieldInsnNode
import org.objectweb.asm.tree.InsnNode
import org.objectweb.asm.tree.MethodInsnNode
import org.objectweb.asm.tree.MethodNode
import org.objectweb.asm.tree.TypeInsnNode
import org.objectweb.asm.tree.VarInsnNode
import java.net.URI
import java.nio.file.FileSystems
import java.nio.file.Files
import java.nio.file.Path

object ApkToJarConverter {
    fun convert(apk: Path, target: Path): Path {
        Files.createDirectories(target.parent)
        Files.deleteIfExists(target)
        val manifest = ApkFile(apk.toFile()).use { decodeTypedValues(it.manifestXml) }
        Dex2jar.from(apk.toFile())
            .dontSanitizeNames(true)
            .computeFrames(true)
            .to(target)
        FileSystems.newFileSystem(URI.create("jar:${target.toUri()}"), emptyMap<String, String>()).use { jar ->
            Files.writeString(jar.getPath("/AndroidManifest.xml"), manifest)
            repairObjectBackedCompanions(jar.getPath("/"))
        }
        return target
    }
}

internal fun repairObjectBackedCompanions(
    root: Path,
    externalClass: (String) -> ClassNode? = ::readRuntimeClass,
) {
    val classes = Files.walk(root).use { paths ->
        paths.filter { Files.isRegularFile(it) && it.toString().endsWith(".class") }
            .toList()
            .associateWith { path -> ClassNode().also { ClassReader(Files.readAllBytes(path)).accept(it, 0) } }
    }
    val classesByName = classes.values.associateBy(ClassNode::name)
    val changed = mutableSetOf<ClassNode>()

    classes.values.forEach { owner ->
        owner.methods.filter { it.name == "<init>" && it.desc == "()V" }.forEach { method ->
            val constructor = method.instructions.toArray().filterIsInstance<MethodInsnNode>()
                .firstOrNull { it.opcode == Opcodes.INVOKESPECIAL && it.name == "<init>" }
                ?: return@forEach
            if (constructor.owner == owner.superName) return@forEach
            val directSuper = classesByName[owner.superName] ?: return@forEach
            val targetsAncestor = generateSequence(directSuper) { classesByName[it.superName] }
                .any { it.name == constructor.owner }
            if (!targetsAncestor) return@forEach

            if (directSuper.methods.none { it.name == "<init>" && it.desc == "()V" }) {
                directSuper.methods.add(noArgConstructor(directSuper.superName))
                changed += directSuper
            }
            constructor.owner = directSuper.name
            changed += owner
        }
        owner.methods.forEach { method ->
            val instructions = method.instructions.toArray()
            instructions.forEachIndexed { index, instruction ->
                if (
                    instruction !is TypeInsnNode || instruction.opcode != Opcodes.NEW ||
                    instruction.desc != FILTER_GROUP
                ) {
                    return@forEachIndexed
                }
                val constructor = instructions.drop(index + 1).take(8)
                    .filterIsInstance<MethodInsnNode>()
                    .firstOrNull { it.opcode == Opcodes.INVOKESPECIAL && it.owner == FILTER_GROUP && it.name == "<init>" }
                    ?: return@forEachIndexed
                instruction.desc = LEGACY_FILTER_GROUP
                constructor.owner = LEGACY_FILTER_GROUP
                changed += owner
            }
            instructions.toList().windowed(4).forEach { allocationInstructions ->
                val allocation = allocationInstructions[0] as? TypeInsnNode ?: return@forEach
                val duplicate = allocationInstructions[1] as? InsnNode ?: return@forEach
                val constructor = allocationInstructions[2] as? MethodInsnNode ?: return@forEach
                val consumer = allocationInstructions[3] as? MethodInsnNode ?: return@forEach
                if (
                    allocation.opcode != Opcodes.NEW || allocation.desc != "java/lang/Object" ||
                    duplicate.opcode != Opcodes.DUP ||
                    constructor.opcode != Opcodes.INVOKESPECIAL || constructor.owner != "java/lang/Object" ||
                    constructor.name != "<init>" || constructor.desc != "()V"
                ) {
                    return@forEach
                }

                val argumentTypes = Type.getArgumentTypes(consumer.desc)
                val expectedType = argumentTypes.lastOrNull()?.takeIf { it.sort == Type.OBJECT } ?: return@forEach
                val implementations = classes.values.filter { expectedType.internalName in it.interfaces }
                if (implementations.size != 1) return@forEach

                val implementation = implementations.single()
                allocation.desc = implementation.name
                constructor.owner = implementation.name
                if (implementation.methods.none { it.name == "<init>" && it.desc == "()V" }) {
                    implementation.methods.add(noArgConstructor(implementation.superName))
                    changed += implementation
                }
                changed += owner
            }
            instructions.filterIsInstance<MethodInsnNode>().forEach { invocation ->
                val invocationOwner = classesByName[invocation.owner] ?: externalClass(invocation.owner) ?: return@forEach
                if (invocationOwner.access and Opcodes.ACC_INTERFACE == 0 || invocation.itf) return@forEach

                invocation.itf = true
                changed += owner
            }
        }
        owner.methods.filter { it.name == "<clinit>" }.forEach { method ->
            val methodInstructions = method.instructions.toArray().toList()
            val allocations = methodInstructions.windowed(4).mapNotNull { instructions ->
                (instructions[3] as? FieldInsnNode)?.let { assignment -> instructions to assignment }
            } + methodInstructions.windowed(6).mapNotNull { instructions ->
                val store = instructions[3] as? VarInsnNode ?: return@mapNotNull null
                val load = instructions[4] as? VarInsnNode ?: return@mapNotNull null
                val assignment = instructions[5] as? FieldInsnNode ?: return@mapNotNull null
                (instructions.take(3) + assignment).toTypedArray().takeIf {
                    store.opcode == Opcodes.ASTORE && load.opcode == Opcodes.ALOAD && store.`var` == load.`var`
                }?.toList()?.let { it to assignment }
            }
            allocations.forEach { (instructions, assignment) ->
                val allocation = instructions[0] as? TypeInsnNode ?: return@forEach
                val duplicate = instructions[1] as? InsnNode ?: return@forEach
                val constructor = instructions[2] as? MethodInsnNode ?: return@forEach
                if (
                    allocation.opcode != Opcodes.NEW || allocation.desc != "java/lang/Object" ||
                    duplicate.opcode != Opcodes.DUP ||
                    constructor.opcode != Opcodes.INVOKESPECIAL || constructor.owner != "java/lang/Object" ||
                    constructor.name != "<init>" || constructor.desc != "()V" ||
                    assignment.opcode != Opcodes.PUTSTATIC || assignment.owner != owner.name
                ) {
                    return@forEach
                }

                val fieldType = Type.getType(assignment.desc)
                if (fieldType.sort != Type.OBJECT) return@forEach
                val companion = classesByName[fieldType.internalName] ?: return@forEach
                allocation.desc = companion.name
                constructor.owner = companion.name
                if (companion.methods.none { it.name == "<init>" && it.desc == "()V" }) {
                    companion.methods.add(noArgConstructor("java/lang/Object"))
                    changed += companion
                }
                changed += owner
            }
        }
    }

    classes.forEach { (path, classNode) ->
        if (classNode in changed) {
            val writer = ClassWriter(ClassWriter.COMPUTE_MAXS)
            classNode.accept(writer)
            Files.write(path, writer.toByteArray())
        }
    }
}

private fun readRuntimeClass(internalName: String): ClassNode? =
    ApkToJarConverter::class.java.classLoader.getResourceAsStream("$internalName.class")?.use { input ->
        ClassNode().also { ClassReader(input).accept(it, ClassReader.SKIP_CODE) }
    }

private fun noArgConstructor(superName: String) = MethodNode(Opcodes.ACC_PUBLIC, "<init>", "()V", null, null).apply {
    instructions.add(VarInsnNode(Opcodes.ALOAD, 0))
    instructions.add(MethodInsnNode(Opcodes.INVOKESPECIAL, superName, "<init>", "()V", false))
    instructions.add(InsnNode(Opcodes.RETURN))
}

internal fun decodeTypedValues(manifest: String): String = TYPED_FLOAT.replace(manifest) { match ->
    Float.fromBits(match.groupValues[1].toInt()).toString()
}

private val TYPED_FLOAT = Regex("""\{4:(\d+)}""")
private const val FILTER_GROUP = "eu/kanade/tachiyomi/source/model/Filter${'$'}Group"
private const val LEGACY_FILTER_GROUP = "dev/vetle/extstats/runtime/LegacyFilterGroup"
