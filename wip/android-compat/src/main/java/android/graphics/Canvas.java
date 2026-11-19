package android.graphics;

import java.awt.Graphics2D;
import java.awt.Color;
import java.awt.Font;
import java.awt.RenderingHints;
import java.awt.Shape;
import java.awt.geom.AffineTransform;
import java.awt.BasicStroke;
import java.awt.font.FontRenderContext;
import java.awt.font.GlyphVector;
import java.awt.font.TextAttribute;
import java.awt.font.TextLayout;
import java.awt.image.BufferedImage;
import java.text.AttributedString;
import java.util.ArrayDeque;
import java.util.Deque;

public final class Canvas {
    private Graphics2D graphics;
    private final Deque<Graphics2D> savedGraphics = new ArrayDeque<>();
    private final int width;
    private final int height;
    private int saveCount = 1;

    public Canvas(Bitmap bitmap) {
        if (bitmap == null) {
            throw new NullPointerException("bitmap");
        }
        width = bitmap.getWidth();
        height = bitmap.getHeight();
        graphics = bitmap.getImage().createGraphics();
    }

    public void drawColor(int color) {
        graphics.setColor(new Color(color, true));
        graphics.fillRect(0, 0, width, height);
    }

    public void drawText(String text, float x, float y, Paint paint) {
        if (text == null) {
            throw new NullPointerException("text");
        }
        if (paint == null) {
            throw new NullPointerException("paint");
        }
        if (text.isEmpty()) {
            return;
        }
        float textSize = paint.getTextSize();
        Typeface typeface = paint.getTypeface();
        Font font = typeface == null
                ? new Font(Font.SANS_SERIF, Font.PLAIN, Math.max(1, Math.round(textSize)))
                : typeface.getCompatFont(textSize);
        Graphics2D textGraphics = (Graphics2D) graphics.create();
        textGraphics.setRenderingHint(
                RenderingHints.KEY_TEXT_ANTIALIASING,
                paint.isAntiAlias() ? RenderingHints.VALUE_TEXT_ANTIALIAS_ON : RenderingHints.VALUE_TEXT_ANTIALIAS_OFF);
        textGraphics.setColor(new Color(paint.getColor(), true));

        FontRenderContext context = textGraphics.getFontRenderContext();
        AttributedString attributed = new AttributedString(text);
        attributed.addAttribute(TextAttribute.FONT, font);
        attributed.addAttribute(TextAttribute.LIGATURES, TextAttribute.LIGATURES_ON);
        TextLayout layout = new TextLayout(attributed.getIterator(), context);

        if (paint.getStyle() == Paint.Style.STROKE || paint.getStyle() == Paint.Style.FILL_AND_STROKE) {
            GlyphVector glyphs = font.createGlyphVector(context, text);
            Shape outline = glyphs.getOutline(x, y);
            AffineTransform transform = AffineTransform.getTranslateInstance(x, 0.0f);
            transform.scale(paint.getTextScaleX(), 1.0f);
            transform.translate(-x, 0.0f);
            outline = transform.createTransformedShape(outline);
            textGraphics.setStroke(new BasicStroke(
                    paint.getStrokeWidth(),
                    BasicStroke.CAP_BUTT,
                    paint.getStrokeJoin() == Paint.Join.ROUND
                            ? BasicStroke.JOIN_ROUND
                            : paint.getStrokeJoin() == Paint.Join.BEVEL
                                    ? BasicStroke.JOIN_BEVEL
                                    : BasicStroke.JOIN_MITER));
            textGraphics.draw(outline);
        }
        if (paint.getStyle() == Paint.Style.FILL || paint.getStyle() == Paint.Style.FILL_AND_STROKE) {
            AffineTransform transform = AffineTransform.getTranslateInstance(x, y);
            textGraphics.translate(x, y);
            textGraphics.scale(paint.getTextScaleX(), 1.0f);
            textGraphics.translate(-x, 0.0f);
            layout.draw(textGraphics, 0.0f, 0.0f);
        }
        textGraphics.dispose();
    }

    public int save() {
        int previousSaveCount = saveCount++;
        savedGraphics.push(graphics);
        graphics = (Graphics2D) graphics.create();
        return previousSaveCount;
    }

    public void restore() {
        if (savedGraphics.isEmpty()) {
            throw new IllegalStateException("Underflow in restore");
        }
        graphics.dispose();
        graphics = savedGraphics.pop();
        saveCount--;
    }

    public void translate(float dx, float dy) {
        graphics.translate(dx, dy);
    }

    public void rotate(float degrees) {
        graphics.rotate(Math.toRadians(degrees));
    }

    public void scale(float sx, float sy) {
        graphics.scale(sx, sy);
    }

    public void drawBitmap(Bitmap bitmap, float left, float top, Paint paint) {
        if (bitmap == null) {
            throw new NullPointerException("bitmap");
        }

        AffineTransform transform = AffineTransform.getTranslateInstance(left, top);
        graphics.drawImage(bitmap.getImage(), transform, null);
    }

    public void drawCompatText(TextLayout layout, float left, float baseline, int color, boolean antiAlias) {
        Graphics2D textGraphics = (Graphics2D) graphics.create();
        textGraphics.setColor(new Color(color, true));
        textGraphics.setRenderingHint(
                RenderingHints.KEY_TEXT_ANTIALIASING,
                antiAlias ? RenderingHints.VALUE_TEXT_ANTIALIAS_ON : RenderingHints.VALUE_TEXT_ANTIALIAS_OFF);
        layout.draw(textGraphics, left, baseline);
        textGraphics.dispose();
    }

    public void drawBitmap(Bitmap bitmap, Rect source, RectF destination, Paint paint) {
        if (bitmap == null) {
            throw new NullPointerException("bitmap");
        }
        if (destination == null) {
            throw new NullPointerException("destination");
        }

        drawBitmap(bitmap, source, destination.left, destination.top, destination.right, destination.bottom);
    }

    public void drawBitmap(Bitmap bitmap, Rect source, Rect destination, Paint paint) {
        if (bitmap == null) {
            throw new NullPointerException("bitmap");
        }
        if (destination == null) {
            throw new NullPointerException("destination");
        }

        drawBitmap(bitmap, source, destination.left, destination.top, destination.right, destination.bottom);
    }

    private void drawBitmap(Bitmap bitmap, Rect source, float left, float top, float right, float bottom) {
        BufferedImage image = bitmap.getImage();
        if (source != null) {
            image = image.getSubimage(source.left, source.top, source.getWidth(), source.getHeight());
        }

        AffineTransform transform = new AffineTransform();
        transform.translate(left, top);
        transform.scale(
                (right - left) / image.getWidth(),
                (bottom - top) / image.getHeight());
        graphics.drawImage(image, transform, null);
    }
}
