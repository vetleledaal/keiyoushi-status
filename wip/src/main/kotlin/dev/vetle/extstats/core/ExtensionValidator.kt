package dev.vetle.extstats.core

import kotlinx.coroutines.channels.Channel

interface ExtensionProbe {
    val name: String

    suspend fun validate(config: ValidationConfig): ProbeValidationResult
}

class ExtensionValidator(
    poolSize: Int = 20,
    private val probeFactory: ((String) -> ExtensionProbe)? = null,
) : AutoCloseable {
    private val validatedPoolSize = poolSize.also { require(it > 0) { "Extension validator pool size must be positive" } }
    private val processes = lazy {
        if (probeFactory == null) {
            List(validatedPoolSize) { cacheShard ->
                ExtensionProbeProcess(ExtensionProbeProcess.defaultCommand(cacheShard), persistent = true)
            }
        } else {
            emptyList()
        }
    }
    private val availableProcesses = lazy {
        Channel<ExtensionProbeProcess>(validatedPoolSize).also { channel ->
            processes.value.forEach { process -> channel.trySend(process).getOrThrow() }
        }
    }

    suspend fun validate(config: ValidationConfig): ValidationResult {
        probeFactory?.let { factory -> return validate(config, factory(config.extensionName)) }
        val process = availableProcesses.value.receive()
        return try {
            validate(config, SuwayomiExtensionProbe(config.extensionName, runProcess = process::run))
        } finally {
            availableProcesses.value.send(process)
        }
    }

    private suspend fun validate(
        config: ValidationConfig,
        probe: ExtensionProbe,
    ): ValidationResult {
        val probeResult = probe.validate(config)
        return ValidationResult(
            extensionName = config.extensionName,
            checks = probeResult.checks,
            evidence = probeResult.evidence?.copy(sourceTheme = config.theme),
            artifactType = config.artifactType,
        )
    }

    override fun close() {
        if (availableProcesses.isInitialized()) availableProcesses.value.close()
        if (processes.isInitialized()) processes.value.forEach(ExtensionProbeProcess::close)
    }
}
