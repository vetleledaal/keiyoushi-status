package android.content.res;

import android.util.DisplayMetrics;
import android.util.AttributeSet;
import android.graphics.drawable.Drawable;

public class Resources {
    private static final Resources SYSTEM = new Resources();

    private final DisplayMetrics displayMetrics;
    private final Configuration configuration;

    public Resources() {
        displayMetrics = new DisplayMetrics();
        configuration = new Configuration();
    }

    public static Resources getSystem() {
        return SYSTEM;
    }

    public DisplayMetrics getDisplayMetrics() {
        return displayMetrics;
    }

    public Configuration getConfiguration() {
        return configuration;
    }

    public CharSequence getText(int id) throws NotFoundException {
        throw new NotFoundException(id);
    }

    public String getResourceName(int id) throws NotFoundException {
        throw new NotFoundException(id);
    }

    public int getColor(int id, Theme theme) throws NotFoundException {
        throw new NotFoundException(id);
    }

    public Drawable getDrawable(int id, Theme theme) throws NotFoundException {
        throw new NotFoundException(id);
    }

    public ColorStateList getColorStateList(int id, Theme theme) throws NotFoundException {
        throw new NotFoundException(id);
    }

    public class Theme {
        public TypedArray obtainStyledAttributes(int[] attrs) {
            return null;
        }

        public TypedArray obtainStyledAttributes(int id, int[] attrs) {
            return null;
        }

        public TypedArray obtainStyledAttributes(AttributeSet set, int[] attrs, int defStyleAttr, int defStyleRes) {
            return null;
        }
    }

    public static class NotFoundException extends RuntimeException {
        public NotFoundException(int id) {
            super("Resource not found: " + id);
        }
    }
}
