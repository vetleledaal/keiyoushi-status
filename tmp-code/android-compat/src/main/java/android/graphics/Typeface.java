package android.graphics;

import java.util.Objects;

public final class Typeface {
    public static final int NORMAL = 0;
    public static final int BOLD = 1;
    public static final int ITALIC = 2;
    public static final int BOLD_ITALIC = 3;

    public static final Typeface DEFAULT = new Typeface("sans-serif", NORMAL);
    public static final Typeface DEFAULT_BOLD = new Typeface("sans-serif", BOLD);
    public static final Typeface SANS_SERIF = DEFAULT;
    public static final Typeface SERIF = new Typeface("serif", NORMAL);
    public static final Typeface MONOSPACE = new Typeface("monospace", NORMAL);

    private final String family;
    private final int style;

    private Typeface(String family, int style) {
        this.family = family;
        this.style = style;
    }

    public static Typeface create(String familyName, int style) {
        return new Typeface(familyName == null ? "sans-serif" : familyName, style);
    }

    public static Typeface create(Typeface family, int style) {
        return new Typeface(family == null ? "sans-serif" : family.family, style);
    }

    public static Typeface defaultFromStyle(int style) {
        return style == BOLD ? DEFAULT_BOLD : new Typeface("sans-serif", style);
    }

    public int getWeight() {
        return isBold() ? 700 : 400;
    }

    public int getStyle() {
        return style;
    }

    public boolean isBold() {
        return (style & BOLD) != 0;
    }

    public boolean isItalic() {
        return (style & ITALIC) != 0;
    }

    public String getCompatFamily() {
        return family;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Typeface typeface)) {
            return false;
        }
        return style == typeface.style && family.equals(typeface.family);
    }

    @Override
    public int hashCode() {
        return Objects.hash(family, style);
    }
}
