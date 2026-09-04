package xyz.nulldev.androidcompat

import org.kodein.di.DI
import org.kodein.di.conf.global
import xyz.nulldev.androidcompat.config.ApplicationInfoConfigModule
import xyz.nulldev.androidcompat.config.FilesConfigModule
import xyz.nulldev.androidcompat.config.SystemConfigModule
import xyz.nulldev.ts.config.GlobalConfigManager

/**
 * Initializes the Android compatibility module
 */
class AndroidCompatInitializer {
    fun init() {
        DI.global.addImport(AndroidCompatModule().create())

        //Register config modules
        GlobalConfigManager.registerModules(
            FilesConfigModule.register(GlobalConfigManager.config),
            ApplicationInfoConfigModule.register(GlobalConfigManager.config),
            SystemConfigModule.register(GlobalConfigManager.config)
        )

        // Set some properties extensions use
        System.setProperty("http.agent", "Mozilla/5.0 (Linux; Android 10; K) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/149.0.0.0 Mobile Safari/537.36")
    }
}
