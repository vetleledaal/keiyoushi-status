package android.hardware.display;

import android.view.Display;
import android.view.Surface;

public class DisplayManager {
    public static final int VIRTUAL_DISPLAY_FLAG_OWN_CONTENT_ONLY = 8;
    public static final int VIRTUAL_DISPLAY_FLAG_PRESENTATION = 2;

    public DisplayManager() {
    }

    public VirtualDisplay createVirtualDisplay(
        String name,
        int width,
        int height,
        int densityDpi,
        Surface surface,
        int flags
    ) {
        return new VirtualDisplay(new Display(width, height, densityDpi), surface);
    }
}
