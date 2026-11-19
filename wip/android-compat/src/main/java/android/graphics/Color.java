package android.graphics;

public final class Color {
    private Color() {
    }

    public static int rgb(int red, int green, int blue) {
        return 0xff000000
                | ((red & 0xff) << 16)
                | ((green & 0xff) << 8)
                | (blue & 0xff);
    }
}
