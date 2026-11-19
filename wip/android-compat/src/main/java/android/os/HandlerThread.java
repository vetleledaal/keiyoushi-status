package android.os;

public class HandlerThread extends Thread {
    private final Object looperLock = new Object();
    private int priority = Thread.NORM_PRIORITY;
    private Looper looper;
    private int threadId = -1;

    public HandlerThread(String name) {
        super(name);
    }

    public HandlerThread(String name, int priority) {
        this(name);
        this.priority = priority;
    }

    public Looper getLooper() {
        if (!isAlive()) {
            return null;
        }
        synchronized (looperLock) {
            boolean interrupted = false;
            while (isAlive() && looper == null) {
                try {
                    looperLock.wait();
                } catch (InterruptedException exception) {
                    interrupted = true;
                }
            }
            if (interrupted) {
                interrupt();
            }
            return looper;
        }
    }

    protected void onLooperPrepared() {
    }

    @Override
    public void run() {
        threadId = (int) getId();
        Looper.prepare();
        setPriority(priority);
        synchronized (looperLock) {
            looper = Looper.myLooper();
            looperLock.notifyAll();
        }
        onLooperPrepared();
        Looper.loop();
        threadId = -1;
    }

    public int getThreadId() {
        return threadId;
    }

    public boolean quit() {
        Looper currentLooper = looper;
        if (currentLooper != null) {
            currentLooper.quit();
            return true;
        }
        return false;
    }

    public boolean quitSafely() {
        Looper currentLooper = looper;
        if (currentLooper != null) {
            currentLooper.quitSafely();
            return true;
        }
        return false;
    }
}
