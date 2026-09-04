package dev.vetle.extstats.runtime

import org.junit.jupiter.api.io.TempDir
import org.objectweb.asm.ClassReader
import org.objectweb.asm.ClassWriter
import org.objectweb.asm.Opcodes
import org.objectweb.asm.tree.ClassNode
import org.objectweb.asm.tree.MethodInsnNode
import org.objectweb.asm.tree.TypeInsnNode
import java.nio.file.Files
import java.nio.file.Path
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue

class ApkToJarConverterTest {
    @Test
    fun decodesAndroidTypedFloatManifestValues() {
        val manifest = """<meta-data android:value="{4:1070386381}" />"""

        assertEquals("""<meta-data android:value="1.6" />""", decodeTypedValues(manifest))
    }

    @Test
    fun repairsLegacyDex2jarBytecode(@TempDir tempDir: Path) {
        writeClass(tempDir, "Companion")
        writeClass(tempDir, "Owner") { writer ->
            writer.visitField(Opcodes.ACC_STATIC, "Companion", "LCompanion;", null, null).visitEnd()
            writer.visitMethod(Opcodes.ACC_STATIC, "<clinit>", "()V", null, null).apply {
                visitCode()
                visitTypeInsn(Opcodes.NEW, "java/lang/Object")
                visitInsn(Opcodes.DUP)
                visitMethodInsn(Opcodes.INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false)
                visitVarInsn(Opcodes.ASTORE, 0)
                visitVarInsn(Opcodes.ALOAD, 0)
                visitFieldInsn(Opcodes.PUTSTATIC, "Owner", "Companion", "LCompanion;")
                visitInsn(Opcodes.RETURN)
                visitMaxs(2, 1)
                visitEnd()
            }
            writer.visitMethod(Opcodes.ACC_STATIC, "filters", "()V", null, null).apply {
                visitCode()
                visitTypeInsn(Opcodes.NEW, "eu/kanade/tachiyomi/source/model/Filter${'$'}Group")
                visitInsn(Opcodes.DUP)
                visitInsn(Opcodes.ACONST_NULL)
                visitInsn(Opcodes.ACONST_NULL)
                visitMethodInsn(
                    Opcodes.INVOKESPECIAL,
                    "eu/kanade/tachiyomi/source/model/Filter${'$'}Group",
                    "<init>",
                    "(Ljava/lang/String;Ljava/util/List;)V",
                    false,
                )
                visitInsn(Opcodes.POP)
                visitInsn(Opcodes.RETURN)
                visitMaxs(4, 0)
                visitEnd()
            }
        }

        repairObjectBackedCompanions(tempDir)

        val owner = readClass(tempDir.resolve("Owner.class"))
        val allocatedTypes = owner.methods.flatMap { method ->
            method.instructions.toArray().filterIsInstance<TypeInsnNode>().map(TypeInsnNode::desc)
        }
        assertTrue("Companion" in allocatedTypes)
        assertTrue("dev/vetle/extstats/runtime/LegacyFilterGroup" in allocatedTypes)
        val companion = readClass(tempDir.resolve("Companion.class"))
        assertTrue(companion.methods.any { it.name == "<init>" && it.desc == "()V" })
        assertTrue(
            owner.methods.flatMap { it.instructions.toArray().filterIsInstance<MethodInsnNode>() }
                .none { it.owner == "eu/kanade/tachiyomi/source/model/Filter${'$'}Group" && it.name == "<init>" },
        )
    }

    @Test
    fun repairsDex2jarConstructorThatSkipsDirectSuperclass(@TempDir tempDir: Path) {
        writeClass(tempDir, "Ancestor")
        writeClass(tempDir, "Direct", superName = "Ancestor")
        writeClass(tempDir, "Child", superName = "Direct") { writer ->
            writer.visitMethod(Opcodes.ACC_PUBLIC, "<init>", "()V", null, null).apply {
                visitCode()
                visitVarInsn(Opcodes.ALOAD, 0)
                visitMethodInsn(Opcodes.INVOKESPECIAL, "Ancestor", "<init>", "()V", false)
                visitInsn(Opcodes.RETURN)
                visitMaxs(1, 1)
                visitEnd()
            }
        }

        repairObjectBackedCompanions(tempDir)

        assertEquals("Direct", constructorOwner(readClass(tempDir.resolve("Child.class"))))
        assertEquals("Ancestor", constructorOwner(readClass(tempDir.resolve("Direct.class"))))
    }

    @Test
    fun repairsObjectPassedAsUniqueInterfaceImplementation(@TempDir tempDir: Path) {
        writeClass(tempDir, "Contract", access = Opcodes.ACC_PUBLIC or Opcodes.ACC_INTERFACE)
        writeClass(tempDir, "Implementation", interfaces = arrayOf("Contract"))
        writeClass(tempDir, "Owner") { writer ->
            writer.visitMethod(Opcodes.ACC_STATIC, "consume", "(LContract;)V", null, null).apply {
                visitCode()
                visitInsn(Opcodes.RETURN)
                visitMaxs(0, 1)
                visitEnd()
            }
            writer.visitMethod(Opcodes.ACC_STATIC, "create", "()V", null, null).apply {
                visitCode()
                visitTypeInsn(Opcodes.NEW, "java/lang/Object")
                visitInsn(Opcodes.DUP)
                visitMethodInsn(Opcodes.INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false)
                visitMethodInsn(Opcodes.INVOKESTATIC, "Owner", "consume", "(LContract;)V", false)
                visitInsn(Opcodes.RETURN)
                visitMaxs(2, 0)
                visitEnd()
            }
        }

        repairObjectBackedCompanions(tempDir)

        val owner = readClass(tempDir.resolve("Owner.class"))
        assertTrue(
            owner.methods.flatMap { it.instructions.toArray().filterIsInstance<TypeInsnNode>() }
                .any { it.desc == "Implementation" },
        )
        assertEquals("java/lang/Object", constructorOwner(readClass(tempDir.resolve("Implementation.class"))))
    }

    @Test
    fun repairsDex2jarInterfaceDefaultMethodReference(@TempDir tempDir: Path) {
        writeClass(tempDir, "ConcreteOwner")
        writeClass(tempDir, "Implementation") { writer ->
            writer.visitMethod(Opcodes.ACC_PUBLIC, "callDefault", "()V", null, null).apply {
                visitCode()
                visitVarInsn(Opcodes.ALOAD, 0)
                visitMethodInsn(
                    Opcodes.INVOKESPECIAL,
                    "Contract",
                    "defaultMethod",
                    "()V",
                    false,
                )
                visitVarInsn(Opcodes.ALOAD, 0)
                visitMethodInsn(
                    Opcodes.INVOKESPECIAL,
                    "ConcreteOwner",
                    "method",
                    "()V",
                    false,
                )
                visitInsn(Opcodes.RETURN)
                visitMaxs(1, 1)
                visitEnd()
            }
        }

        val externalInterface = ClassNode().apply {
            name = "Contract"
            access = Opcodes.ACC_PUBLIC or Opcodes.ACC_INTERFACE
        }
        repairObjectBackedCompanions(tempDir) { name -> externalInterface.takeIf { name == it.name } }

        val invocations = readClass(tempDir.resolve("Implementation.class")).methods.single { it.name == "callDefault" }
            .instructions.toArray().filterIsInstance<MethodInsnNode>()
        assertTrue(invocations.single { it.owner == "Contract" }.itf)
        assertTrue(!invocations.single { it.owner == "ConcreteOwner" }.itf)
    }

    private fun constructorOwner(classNode: ClassNode) = classNode.methods.single { it.name == "<init>" }
        .instructions.toArray().filterIsInstance<MethodInsnNode>().single { it.name == "<init>" }.owner

    private fun writeClass(
        tempDir: Path,
        name: String,
        superName: String = "java/lang/Object",
        access: Int = Opcodes.ACC_PUBLIC,
        interfaces: Array<String>? = null,
        body: (ClassWriter) -> Unit = {},
    ) {
        val writer = ClassWriter(0)
        writer.visit(Opcodes.V17, access, name, null, superName, interfaces)
        body(writer)
        writer.visitEnd()
        Files.write(tempDir.resolve("$name.class"), writer.toByteArray())
    }

    private fun readClass(path: Path) = ClassNode().also { ClassReader(Files.readAllBytes(path)).accept(it, 0) }
}
