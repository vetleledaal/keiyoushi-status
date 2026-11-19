package xyz.nulldev.androidcompat.activity

import android.app.Activity
import android.content.ComponentName
import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import mu.KotlinLogging
import java.util.concurrent.CopyOnWriteArrayList

/**
 * Hosts headless [Activity] instances launched through [Context.startActivity].
 *
 * There is no manifest to read and no package manager to ask, so a component is
 * resolved by class name. Registered class loaders are searched first, which is
 * how an extension's own component classes are found, then the host class loader.
 * A component that resolves nowhere is reported as an [UnsupportedOperationException]
 * naming the component: a launch this harness cannot host must fail loudly at the
 * call site instead of returning silently and leaving the caller to wait for a
 * result that can never arrive.
 *
 * Lifecycle callbacks run on the thread pumping the main looper, which is the same
 * thread a [android.os.ResultReceiver] posts its result to.
 */
class ActivitySupport {
    private val logger = KotlinLogging.logger {}
    private val classLoaders = CopyOnWriteArrayList<ClassLoader>()

    /**
     * Register a class loader to resolve components from, keeping registration order.
     *
     * @param classLoader The class loader to search for component classes.
     */
    fun registerClassLoader(classLoader: ClassLoader) {
        if (classLoaders.addIfAbsent(classLoader)) {
            logger.debug { "Registered activity component class loader: $classLoader" }
        }
    }

    /**
     * Launch the activity named by the intent's component.
     *
     * @param context The context the activity runs in.
     * @param intent The launch intent, which must name an explicit component.
     * @param options Unused; no window or transition options exist here.
     * @throws UnsupportedOperationException when the component is missing or implicit.
     */
    @Suppress("UNUSED_PARAMETER")
    fun startActivity(context: Context, intent: Intent, options: Bundle? = null) {
        val component = intent.component
            ?: throw unsupported("Intent without a component", intent.component)
        val activityClass = resolveActivityClass(component)
            ?: throw unsupported("Cannot resolve activity class", component)
        val activity = runCatching { activityClass.getDeclaredConstructor().newInstance() }
            .getOrElse { throw unsupported("Cannot instantiate activity: ${it.message}", component) }
        if (activity !is Activity) {
            throw unsupported("${component.className} is not an Activity", component)
        }

        logger.debug { "Starting activity: ${component.flattenToString()}" }

        activity.attach(context)
        activity.setIntent(intent)
        onMainLooper {
            activity.performCreate(null)
            activity.performStart()
            activity.performResume()
        }
    }

    /**
     * Resolve the activity class named by [component], or null when no registered
     * class loader defines it.
     */
    private fun resolveActivityClass(component: ComponentName): Class<*>? {
        val className = component.className
        if (className.isEmpty()) return null
        return (classLoaders.asSequence() + hostClassLoader())
            .mapNotNull { classLoader ->
                runCatching { Class.forName(className, false, classLoader) }.getOrNull()
            }
            .firstOrNull()
    }

    private fun hostClassLoader(): ClassLoader = ActivitySupport::class.java.classLoader

    private fun unsupported(reason: String, component: ComponentName?): UnsupportedOperationException {
        val described = component?.flattenToString() ?: "<no component>"
        logger.warn { "Unsupported activity launch: $reason ($described)" }
        return UnsupportedOperationException("Unsupported activity launch: $described: $reason")
    }

    /**
     * Run [block] on the thread pumping the main looper, inline when this thread is
     * that thread. The main looper is prepared by the runtime; when nothing has
     * prepared it yet there is no loop to post to, so [block] runs inline.
     */
    private fun onMainLooper(block: () -> Unit) {
        val mainLooper = Looper.getMainLooper()
        if (mainLooper == null) {
            logger.warn { "No main looper is prepared; running activity lifecycle inline" }
            block()
            return
        }
        if (mainLooper.thread == Thread.currentThread()) {
            block()
            return
        }
        Handler(mainLooper).post(block)
    }
}