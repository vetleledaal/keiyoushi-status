package android.content.res;

public class Configuration {
    public static final int UI_MODE_NIGHT_MASK = 0x30;
    public static final int UI_MODE_NIGHT_UNDEFINED = 0x00;
    public static final int UI_MODE_NIGHT_NO = 0x10;
    public static final int UI_MODE_NIGHT_YES = 0x20;

    public int uiMode = UI_MODE_NIGHT_NO;

    public Configuration() {
    }

    public Configuration(Configuration other) {
        uiMode = other.uiMode;
    }
}
