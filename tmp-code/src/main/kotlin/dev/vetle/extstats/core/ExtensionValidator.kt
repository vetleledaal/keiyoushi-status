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
    private val processes =
        if (probeFactory == null) {
            List(validatedPoolSize) { cacheShard ->
                ExtensionProbeProcess(ExtensionProbeProcess.defaultCommand(cacheShard), persistent = true)
            }
        } else {
            emptyList()
        }
    private val availableProcesses =
        Channel<ExtensionProbeProcess>(validatedPoolSize).also { channel ->
            processes.forEach { process -> channel.trySend(process).getOrThrow() }
        }

    suspend fun validate(config: ValidationConfig): ValidationResult {
        probeFactory?.let { factory -> return validate(config, factory(config.extensionName)) }
        val process = availableProcesses.receive()
        return try {
            validate(config, SuwayomiExtensionProbe(config.extensionName, runProcess = process::run))
        } finally {
            availableProcesses.send(process)
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
            evidence = probeResult.evidence,
            artifactType = config.artifactType,
        )
    }

    override fun close() {
        availableProcesses.close()
        processes.forEach(ExtensionProbeProcess::close)
    }
}
