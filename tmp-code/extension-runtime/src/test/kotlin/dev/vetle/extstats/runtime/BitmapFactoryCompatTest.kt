package dev.vetle.extstats.runtime

import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.graphics.Canvas
import android.graphics.Rect
import android.graphics.RectF
import java.awt.image.BufferedImage
import java.io.ByteArrayInputStream
import java.io.ByteArrayOutputStream
import java.nio.file.Files
import javax.imageio.ImageIO
import kotlin.math.abs
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFailsWith
import kotlin.test.assertNull
import kotlin.test.assertTrue

class BitmapFactoryCompatTest {
    @Test
    fun `rect constructors preserve bounds`() {
        val rect = Rect(1, 2, 11, 22)
        val copy = Rect(rect)
        val emptyCopy = Rect(null)

        assertEquals(listOf(1, 2, 11, 22), listOf(rect.left, rect.top, rect.right, rect.bottom))
        assertEquals(listOf(1, 2, 11, 22), listOf(copy.left, copy.top, copy.right, copy.bottom))
        assertEquals(listOf(0, 0, 0, 0), listOf(emptyCopy.left, emptyCopy.top, emptyCopy.right, emptyCopy.bottom))
    }

    @Test
    fun `rectF constructors preserve bounds`() {
        val rect = RectF(1.5f, 2.5f, 11.5f, 22.5f)
        val copy = RectF(rect)
        val integerCopy = RectF(Rect(1, 2, 11, 22))
        val emptyCopy = RectF(null as RectF?)

        rect.set(3.5f, 4.5f, 13.5f, 24.5f)

        assertEquals(listOf(3.5f, 4.5f, 13.5f, 24.5f), listOf(rect.left, rect.top, rect.right, rect.bottom))
        assertEquals(listOf(1.5f, 2.5f, 11.5f, 22.5f), listOf(copy.left, copy.top, copy.right, copy.bottom))
        assertEquals(listOf(1f, 2f, 11f, 22f), listOf(integerCopy.left, integerCopy.top, integerCopy.right, integerCopy.bottom))
        assertEquals(listOf(0f, 0f, 0f, 0f), listOf(emptyCopy.left, emptyCopy.top, emptyCopy.right, emptyCopy.bottom))
    }

    @Test
    fun `canvas binds to a pixel-backed bitmap`() {
        val bitmap = Bitmap.createBitmap(2, 3, Bitmap.Config.ARGB_8888)

        Canvas(bitmap)
    }

    @Test
    fun `canvas save returns the previous save count`() {
        val canvas = Canvas(Bitmap.createBitmap(2, 3, Bitmap.Config.ARGB_8888))

        assertEquals(1, canvas.save())
        assertEquals(2, canvas.save())
    }

    @Test
    fun `canvas restore unwinds saved transforms`() {
        val canvas = Canvas(Bitmap.createBitmap(2, 3, Bitmap.Config.ARGB_8888))
        val graphicsField = Canvas::class.java.getDeclaredField("graphics").apply { isAccessible = true }

        canvas.translate(1f, 2f)
        canvas.save()
        canvas.translate(3f, 4f)
        canvas.save()
        canvas.scale(2f, 3f)

        canvas.restore()
        var transform = (graphicsField.get(canvas) as java.awt.Graphics2D).transform
        assertEquals(4.0, transform.translateX)
        assertEquals(6.0, transform.translateY)

        canvas.restore()
        transform = (graphicsField.get(canvas) as java.awt.Graphics2D).transform
        assertEquals(1.0, transform.translateX)
        assertEquals(2.0, transform.translateY)
        assertFailsWith<IllegalStateException> { canvas.restore() }
    }

    @Test
    fun `canvas translate offsets subsequent drawing coordinates`() {
        val canvas = Canvas(Bitmap.createBitmap(2, 3, Bitmap.Config.ARGB_8888))

        canvas.translate(1.5f, 0f)
        canvas.translate(0.5f, 2.5f)

        val graphicsField = Canvas::class.java.getDeclaredField("graphics").apply { isAccessible = true }
        val transform = (graphicsField.get(canvas) as java.awt.Graphics2D).transform
        assertEquals(2.0, transform.translateX)
        assertEquals(2.5, transform.translateY)
    }

    @Test
    fun `canvas rotate transforms subsequent drawing coordinates around the origin`() {
        val canvas = Canvas(Bitmap.createBitmap(2, 3, Bitmap.Config.ARGB_8888))

        canvas.rotate(90f)

        val graphicsField = Canvas::class.java.getDeclaredField("graphics").apply { isAccessible = true }
        val transformed = (graphicsField.get(canvas) as java.awt.Graphics2D).transform.transform(
            java.awt.geom.Point2D.Double(1.0, 0.0),
            null,
        )
        assertEquals(0.0, transformed.x, 1e-10)
        assertEquals(1.0, transformed.y, 1e-10)
    }

    @Test
    fun `canvas scale transforms subsequent drawing coordinates around the origin`() {
        val canvas = Canvas(Bitmap.createBitmap(2, 3, Bitmap.Config.ARGB_8888))

        canvas.scale(2f, 3f)

        val graphicsField = Canvas::class.java.getDeclaredField("graphics").apply { isAccessible = true }
        val transformed = (graphicsField.get(canvas) as java.awt.Graphics2D).transform.transform(
            java.awt.geom.Point2D.Double(1.0, 2.0),
            null,
        )
        assertEquals(2.0, transformed.x, 1e-10)
        assertEquals(6.0, transformed.y, 1e-10)
    }

    @Test
    fun `canvas drawBitmap preserves size offset and active translation`() {
        val source = Bitmap.createBitmap(2, 2, Bitmap.Config.ARGB_8888).apply {
            setPixel(0, 0, 0xffff0000.toInt())
            setPixel(1, 0, 0xff00ff00.toInt())
            setPixel(0, 1, 0xff0000ff.toInt())
            setPixel(1, 1, 0xffffffff.toInt())
        }
        val destination = Bitmap.createBitmap(7, 6, Bitmap.Config.ARGB_8888)
        val canvas = Canvas(destination).apply { translate(2f, 1f) }
        val floatType = requireNotNull(Float::class.javaPrimitiveType)

        Canvas::class.java.getMethod(
            "drawBitmap",
            Bitmap::class.java,
            floatType,
            floatType,
            Class.forName("android.graphics.Paint"),
        ).invoke(canvas, source, 1f, 2f, null)

        assertEquals(0x00000000, destination.getPixel(2, 2))
        assertEquals(0xffff0000.toInt(), destination.getPixel(3, 3))
        assertEquals(0xff00ff00.toInt(), destination.getPixel(4, 3))
        assertEquals(0xff0000ff.toInt(), destination.getPixel(3, 4))
        assertEquals(0xffffffff.toInt(), destination.getPixel(4, 4))
        assertEquals(0x00000000, destination.getPixel(5, 4))
    }

    @Test
    fun `canvas drawBitmap crops source into rectF destination`() {
        val source = Bitmap.createBitmap(3, 2, Bitmap.Config.ARGB_8888).apply {
            setPixel(1, 0, 0xffff0000.toInt())
            setPixel(2, 0, 0xff00ff00.toInt())
            setPixel(1, 1, 0xff0000ff.toInt())
            setPixel(2, 1, 0xffffffff.toInt())
        }
        val destination = Bitmap.createBitmap(6, 4, Bitmap.Config.ARGB_8888)

        Canvas::class.java.methods.single { method ->
            method.name == "drawBitmap" && method.parameterTypes[2] == RectF::class.java
        }.invoke(Canvas(destination), source, Rect(1, 0, 3, 2), RectF(2f, 0f, 6f, 4f), null)

        assertEquals(0x00000000, destination.getPixel(1, 1))
        assertEquals(0xffff0000.toInt(), destination.getPixel(2, 0))
        assertEquals(0xff00ff00.toInt(), destination.getPixel(5, 0))
        assertEquals(0xff0000ff.toInt(), destination.getPixel(2, 3))
        assertEquals(0xffffffff.toInt(), destination.getPixel(5, 3))
    }

    @Test
    fun `canvas drawBitmap crops source into rect destination`() {
        val source = Bitmap.createBitmap(3, 2, Bitmap.Config.ARGB_8888).apply {
            setPixel(1, 0, 0xffff0000.toInt())
            setPixel(2, 0, 0xff00ff00.toInt())
            setPixel(1, 1, 0xff0000ff.toInt())
            setPixel(2, 1, 0xffffffff.toInt())
        }
        val destination = Bitmap.createBitmap(6, 4, Bitmap.Config.ARGB_8888)

        Canvas::class.java.methods.single { method ->
            method.name == "drawBitmap" && method.parameterTypes[2] == Rect::class.java
        }.invoke(Canvas(destination), source, Rect(1, 0, 3, 2), Rect(2, 0, 6, 4), null)

        assertEquals(0x00000000, destination.getPixel(1, 1))
        assertEquals(0xffff0000.toInt(), destination.getPixel(2, 0))
        assertEquals(0xff00ff00.toInt(), destination.getPixel(5, 0))
        assertEquals(0xff0000ff.toInt(), destination.getPixel(2, 3))
        assertEquals(0xffffffff.toInt(), destination.getPixel(5, 3))
    }

    @Test
    fun `decodeStream returns a pixel-backed bitmap`() {
        val source = BufferedImage(3, 2, BufferedImage.TYPE_INT_ARGB)
        source.setRGB(1, 1, 0xff12ab34.toInt())
        val encoded = ByteArrayOutputStream().also { ImageIO.write(source, "png", it) }.toByteArray()

        val bitmap = BitmapFactory.decodeStream(ByteArrayInputStream(encoded))

        requireNotNull(bitmap)
        assertEquals(3, bitmap.width)
        assertEquals(2, bitmap.height)
        assertEquals(0xff12ab34.toInt(), bitmap.getPixel(1, 1))
    }

    @Test
    fun `decodeStream returns null for undecodable data`() {
        assertNull(BitmapFactory.decodeStream(ByteArrayInputStream("not an image".toByteArray())))
    }

    @Test
    fun `decodeByteArray accepts mutable options`() {
        val source = BufferedImage(3, 2, BufferedImage.TYPE_INT_ARGB)
        val encoded = ByteArrayOutputStream().also { ImageIO.write(source, "png", it) }.toByteArray()
        val options = BitmapFactory.Options()

        assertEquals(false, options.inMutable)
        options.inMutable = true

        val bitmap = BitmapFactory.decodeByteArray(encoded, 0, encoded.size, options)

        requireNotNull(bitmap)
        assertEquals(3, bitmap.width)
        assertEquals(2, bitmap.height)
    }

    @Test
    fun `compress writes lossy webp to the provided stream`() {
        val bitmap = Bitmap.createBitmap(512, 512, Bitmap.Config.ARGB_8888).apply {
            for (pixelY in 0 until height) {
                for (pixelX in 0 until width) {
                    setPixel(pixelX, pixelY, 0xff12ab34.toInt())
                }
            }
        }
        val encoded = Files.createTempFile("bitmap-compress-", ".webp")

        try {
            Files.newOutputStream(encoded).use { stream ->
                assertTrue(bitmap.compress(Bitmap.CompressFormat.WEBP, 80, stream))
            }

            val decoded = Files.newInputStream(encoded).use(BitmapFactory::decodeStream)
            requireNotNull(decoded)
            assertEquals(512, decoded.width)
            assertEquals(512, decoded.height)
            val decodedColor = decoded.getPixel(256, 256)
            assertEquals(0xff, decodedColor ushr 24)
            assertTrue(abs(((decodedColor ushr 16) and 0xff) - 0x12) <= 10)
            assertTrue(abs(((decodedColor ushr 8) and 0xff) - 0xab) <= 10)
            assertTrue(abs((decodedColor and 0xff) - 0x34) <= 10)
        } finally {
            Files.deleteIfExists(encoded)
        }
    }
}
