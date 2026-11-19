package android.graphics;

import java.awt.Font;
import java.awt.font.FontRenderContext;
import java.awt.font.TextAttribute;
import java.awt.font.TextLayout;
import java.text.AttributedString;

public class Paint {
    public static final int ANTI_ALIAS_FLAG = 0x01;

    public enum Style {
        FILL,
        STROKE,
        FILL_AND_STROKE,
    }

    public enum Join {
        MITER,
        ROUND,
        BEVEL,
    }

    private int color = 0xff000000;
    private float textSize = 16.0f;
    private float textScaleX = 1.0f;
    private Typeface typeface;
    private boolean antiAlias;
    private Style style = Style.FILL;
    private Join strokeJoin = Join.MITER;
    private float strokeWidth = 1.0f;

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
        textScaleX = paint.textScaleX;
        typeface = paint.typeface;
        antiAlias = paint.antiAlias;
        style = paint.style;
        strokeJoin = paint.strokeJoin;
        strokeWidth = paint.strokeWidth;
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

    public float getTextScaleX() {
        return textScaleX;
    }

    public void setTextScaleX(float textScaleX) {
        this.textScaleX = textScaleX;
    }

    public float measureText(String text) {
        if (text == null) {
            throw new IllegalArgumentException("text cannot be null");
        }
        if (text.isEmpty()) {
            return 0.0f;
        }
        Font font = typeface == null
                ? new Font(Font.SANS_SERIF, Font.PLAIN, Math.max(1, Math.round(textSize)))
                : typeface.getCompatFont(textSize);
        AttributedString attributed = new AttributedString(text);
        attributed.addAttribute(TextAttribute.FONT, font);
        attributed.addAttribute(TextAttribute.LIGATURES, TextAttribute.LIGATURES_ON);
        TextLayout layout = new TextLayout(attributed.getIterator(), new FontRenderContext(null, true, true));
        return (float) layout.getAdvance() * textScaleX;
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

    public Style getStyle() {
        return style;
    }

    public void setStyle(Style style) {
        if (style == null) {
            throw new NullPointerException("style");
        }
        this.style = style;
    }

    public Join getStrokeJoin() {
        return strokeJoin;
    }

    public void setStrokeJoin(Join strokeJoin) {
        if (strokeJoin == null) {
            throw new NullPointerException("strokeJoin");
        }
        this.strokeJoin = strokeJoin;
    }

    public float getStrokeWidth() {
        return strokeWidth;
    }

    public void setStrokeWidth(float strokeWidth) {
        this.strokeWidth = strokeWidth;
    }
}
