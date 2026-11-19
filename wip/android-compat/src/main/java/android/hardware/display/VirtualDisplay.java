package android.hardware.display;

import android.view.Display;
import android.view.Surface;

public class VirtualDisplay {
    private final Display display;
    private final Surface surface;

    VirtualDisplay(Display display, Surface surface) {
        this.display = display;
        this.surface = surface;
    }

    public Display getDisplay() {
        return display;
    }

    public Surface getSurface() {
        return surface;
    }

    public void release() {
    }
}
