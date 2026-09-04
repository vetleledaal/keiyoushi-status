package android.text;

import android.graphics.Canvas;
import android.graphics.Typeface;

import java.awt.Font;
import java.awt.font.FontRenderContext;
import java.awt.font.LineBreakMeasurer;
import java.awt.font.TextLayout;
import java.text.AttributedString;
import java.awt.font.TextAttribute;
import java.util.ArrayList;
import java.util.List;

public final class StaticLayout {
    private static final float DEFAULT_TEXT_SIZE = 16.0f;
    private static final int DEFAULT_TEXT_COLOR = 0xff000000;
    private static final FontRenderContext FONT_CONTEXT = new FontRenderContext(null, true, true);

    private final List<Line> lines;
    private final int height;

    public StaticLayout(
            CharSequence source,
            TextPaint paint,
            int width,
            Layout.Alignment alignment,
            float spacingMultiplier,
            float spacingAdd,
            boolean includePadding) {
        if (source == null) {
            throw new NullPointerException("source");
        }
        if (paint == null) {
            throw new NullPointerException("paint");
        }
        if (width < 0) {
            throw new IllegalArgumentException("Layout: " + width + " < 0");
        }

        float textSize = readTextSize(paint);
        int textColor = readTextColor(paint);
        boolean antiAlias = paint.isAntiAlias();
        lines = layout(source.toString(), width, textSize, textColor, paint.getTypeface(), antiAlias, spacingMultiplier, spacingAdd);
        height = lines.isEmpty() ? 0 : (int) Math.ceil(lines.get(lines.size() - 1).bottom());
    }

    public int getHeight() {
        return height;
    }

    public void draw(Canvas canvas) {
        if (canvas == null) {
            throw new NullPointerException("canvas");
        }
        for (Line line : lines) {
            canvas.drawCompatText(line.layout(), 0.0f, line.baseline(), line.color(), line.antiAlias());
        }
    }

    private static List<Line> layout(
            String text,
            int width,
            float textSize,
            int color,
            Typeface typeface,
            boolean antiAlias,
            float spacingMultiplier,
            float spacingAdd) {
        List<Line> result = new ArrayList<>();
        int fontStyle = typeface == null ? Font.PLAIN : typeface.getStyle();
        String fontFamily = typeface == null ? Font.SANS_SERIF : typeface.getCompatFamily();
        Font font = new Font(fontFamily, fontStyle, Math.max(1, Math.round(textSize)));
        float top = 0.0f;

        for (String paragraph : text.split("\\n", -1)) {
            if (paragraph.isEmpty()) {
                TextLayout emptyLayout = new TextLayout(" ", font, FONT_CONTEXT);
                top = addLine(result, emptyLayout, top, color, antiAlias, spacingMultiplier, spacingAdd);
                continue;
            }

            AttributedString attributed = new AttributedString(paragraph);
            attributed.addAttribute(TextAttribute.FONT, font);
            attributed.addAttribute(TextAttribute.LIGATURES, TextAttribute.LIGATURES_ON);
            LineBreakMeasurer measurer = new LineBreakMeasurer(attributed.getIterator(), FONT_CONTEXT);
            while (measurer.getPosition() < paragraph.length()) {
                int start = measurer.getPosition();
                TextLayout lineLayout = measurer.nextLayout(Math.max(1, width));
                int end = measurer.getPosition();
                top = addLine(
                        result,
                        lineLayout,
                        top,
                        color,
                    antiAlias,
                        spacingMultiplier,
                        spacingAdd);
            }
        }
        return result;
    }

    private static float addLine(
            List<Line> lines,
            TextLayout layout,
            float top,
            int color,
            boolean antiAlias,
            float spacingMultiplier,
            float spacingAdd) {
        float baseline = top + layout.getAscent();
        float naturalHeight = layout.getAscent() + layout.getDescent() + layout.getLeading();
        float lineHeight = naturalHeight * spacingMultiplier + spacingAdd;
        lines.add(new Line(layout, baseline, top + lineHeight, color, antiAlias));
        return top + lineHeight;
    }

    private static float readTextSize(TextPaint paint) {
        try {
            float textSize = paint.getTextSize();
            return textSize > 0.0f ? textSize : DEFAULT_TEXT_SIZE;
        } catch (RuntimeException error) {
            return DEFAULT_TEXT_SIZE;
        }
    }

    private static int readTextColor(TextPaint paint) {
        try {
            return paint.getColor();
        } catch (RuntimeException error) {
            return DEFAULT_TEXT_COLOR;
        }
    }

    private record Line(TextLayout layout, float baseline, float bottom, int color, boolean antiAlias) {
    }
}
