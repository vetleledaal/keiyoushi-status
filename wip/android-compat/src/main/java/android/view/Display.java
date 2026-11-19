package android.view;

import android.util.DisplayMetrics;

public class Display {
    private final int width;
    private final int height;
    private final int densityDpi;

    public Display(int width, int height, int densityDpi) {
        this.width = width;
        this.height = height;
        this.densityDpi = densityDpi;
    }

    public void getMetrics(DisplayMetrics metrics) {
        metrics.widthPixels = width;
        metrics.heightPixels = height;
        metrics.densityDpi = densityDpi;
        metrics.density = densityDpi / 160f;
        metrics.scaledDensity = metrics.density;
        metrics.xdpi = densityDpi;
        metrics.ydpi = densityDpi;
    }
}
