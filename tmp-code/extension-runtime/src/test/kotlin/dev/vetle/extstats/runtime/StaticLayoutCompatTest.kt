package dev.vetle.extstats.runtime

import android.graphics.Bitmap
import android.graphics.Canvas
import java.awt.Color
import java.awt.Font
import java.awt.RenderingHints
import java.awt.font.FontRenderContext
import java.awt.font.TextAttribute
import java.awt.font.TextLayout
import java.awt.image.BufferedImage
import java.text.AttributedString
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertNotEquals
import kotlin.test.assertTrue

class StaticLayoutCompatTest {
    @Test
    fun `reached layout reports height and draws text`() {
        val paintType = Class.forName("android.text.TextPaint")
        val alignmentType = Class.forName("android.text.Layout\$Alignment")
        val paint = paintType.getConstructor().newInstance().apply {
            paintType.getMethod("setColor", Integer.TYPE).invoke(this, 0xff000000.toInt())
            paintType.getMethod("setTextSize", Float::class.javaPrimitiveType).invoke(this, 30f)
            paintType.getMethod("setAntiAlias", Boolean::class.javaPrimitiveType).invoke(this, true)
        }
        val alignment = alignmentType.getField("ALIGN_NORMAL").get(null)
        val layoutType = Class.forName("android.text.StaticLayout")
        val layout = layoutType.getConstructor(
            CharSequence::class.java,
            paintType,
            Integer.TYPE,
            alignmentType,
            Float::class.javaPrimitiveType,
            Float::class.javaPrimitiveType,
            Boolean::class.javaPrimitiveType,
        ).newInstance("first line\nsecond line", paint, 120, alignment, 1.1f, 2f, true)

        val height = layoutType.getMethod("getHeight").invoke(layout) as Int
        val bitmap = Bitmap.createBitmap(140, height + 10, Bitmap.Config.ARGB_8888)
        val canvas = Canvas(bitmap)
        Canvas::class.java.getMethod("drawColor", Integer.TYPE).invoke(canvas, 0xffffffff.toInt())
        layoutType.getMethod("draw", Canvas::class.java).invoke(layout, canvas)

        assertTrue(height > 0)
        assertTrue((0 until bitmap.height).any { y -> (0 until bitmap.width).any { x -> bitmap.getPixel(x, y) == 0xffffffff.toInt() } })
        assertTrue((0 until bitmap.height).any { y -> (0 until bitmap.width).any { x -> bitmap.getPixel(x, y) != 0xffffffff.toInt() } })
    }

    @Test
    fun `reached heading preserves bold weight and fi shaping`() {
        val normal = renderHeading("Alfie", "DEFAULT")
        val bold = renderHeading("Alfie", "DEFAULT_BOLD")

        assertNotEquals(pixels(normal), pixels(bold))
        assertEquals(ligatureReferencePixels("Alfie"), pixels(bold))
    }

    private fun renderHeading(text: String, typefaceField: String): Bitmap {
        val paintType = Class.forName("android.text.TextPaint")
        val typefaceType = Class.forName("android.graphics.Typeface")
        val paint = paintType.getConstructor().newInstance().apply {
            paintType.getMethod("setColor", Integer.TYPE).invoke(this, 0xff000000.toInt())
            paintType.getMethod("setTextSize", Float::class.javaPrimitiveType).invoke(this, 30f)
            paintType.getMethod("setTypeface", typefaceType).invoke(this, typefaceType.getField(typefaceField).get(null))
            paintType.getMethod("setAntiAlias", Boolean::class.javaPrimitiveType).invoke(this, true)
        }
        val alignmentType = Class.forName("android.text.Layout\$Alignment")
        val layoutType = Class.forName("android.text.StaticLayout")
        val layout = layoutType.getConstructor(
            CharSequence::class.java,
            paintType,
            Integer.TYPE,
            alignmentType,
            Float::class.javaPrimitiveType,
            Float::class.javaPrimitiveType,
            Boolean::class.javaPrimitiveType,
        ).newInstance(text, paint, 200, alignmentType.getField("ALIGN_NORMAL").get(null), 1f, 0f, true)
        val bitmap = Bitmap.createBitmap(200, 60, Bitmap.Config.ARGB_8888)
        val canvas = Canvas(bitmap)
        Canvas::class.java.getMethod("drawColor", Integer.TYPE).invoke(canvas, 0xffffffff.toInt())
        layoutType.getMethod("draw", Canvas::class.java).invoke(layout, canvas)
        return bitmap
    }

    private fun pixels(bitmap: Bitmap): List<Int> = buildList {
        for (y in 0 until bitmap.height) {
            for (x in 0 until bitmap.width) {
                add(bitmap.getPixel(x, y))
            }
        }
    }

    private fun ligatureReferencePixels(text: String): List<Int> {
        val image = BufferedImage(200, 60, BufferedImage.TYPE_INT_ARGB)
        val graphics = image.createGraphics()
        graphics.color = Color.WHITE
        graphics.fillRect(0, 0, image.width, image.height)
        graphics.color = Color.BLACK
        graphics.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON)
        val attributed = AttributedString(text).apply {
            addAttribute(TextAttribute.FONT, Font(Font.SANS_SERIF, Font.BOLD, 30))
            addAttribute(TextAttribute.LIGATURES, TextAttribute.LIGATURES_ON)
        }
        val layout = TextLayout(attributed.iterator, FontRenderContext(null, true, true))
        layout.draw(graphics, 0f, layout.ascent)
        graphics.dispose()
        return image.getRGB(0, 0, image.width, image.height, null, 0, image.width).toList()
    }
}
