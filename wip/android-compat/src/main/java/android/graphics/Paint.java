package android.graphics;

public class Paint {
    public static final int ANTI_ALIAS_FLAG = 0x01;

    private int color = 0xff000000;
    private float textSize = 16.0f;
    private Typeface typeface;
    private boolean antiAlias;

    public Paint() {
    }

    public Paint(int flags) {
        antiAlias = (flags & ANTI_ALIAS_FLAG) != 0;
    }

    public Paint(Paint paint) {
        set(paint);
    }

    public void set(Paint paint) {
        color = paint.color;
        textSize = paint.textSize;
        typeface = paint.typeface;
        antiAlias = paint.antiAlias;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }

    public float getTextSize() {
        return textSize;
    }

    public void setTextSize(float textSize) {
        this.textSize = textSize;
    }

    public Typeface setTypeface(Typeface typeface) {
        Typeface previous = this.typeface;
        this.typeface = typeface;
        return previous;
    }

    public Typeface getTypeface() {
        return typeface;
    }

    public void setAntiAlias(boolean antiAlias) {
        this.antiAlias = antiAlias;
    }

    public boolean isAntiAlias() {
        return antiAlias;
    }
}
