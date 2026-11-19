package dev.vetle.extstats.core

internal object TimingLog {
    inline fun <T> measure(
        stage: String,
        action: () -> T,
    ): T {
        System.err.println("[timing] $stage: started")
        val startedAt = System.nanoTime()
        try {
            return action()
        } finally {
            val elapsedMillis = (System.nanoTime() - startedAt) / 1_000_000
            System.err.println("[timing] $stage: $elapsedMillis ms")
        }
    }
}
