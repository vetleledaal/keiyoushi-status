package android.graphics;

import com.luciad.imageio.webp.CompressionType;
import com.luciad.imageio.webp.WebPWriteParam;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Iterator;
import javax.imageio.IIOImage;
import javax.imageio.ImageIO;
import javax.imageio.ImageWriteParam;
import javax.imageio.ImageWriter;
import javax.imageio.stream.ImageOutputStream;

public final class Bitmap {
    private final BufferedImage image;

    Bitmap(BufferedImage image) {
        this.image = image;
    }

    BufferedImage getImage() {
        return image;
    }

    public enum CompressFormat {
        JPEG,
        PNG,
        WEBP,
        WEBP_LOSSY,
        WEBP_LOSSLESS,
    }

    public enum Config {
        ALPHA_8,
        RGB_565,
        ARGB_4444,
        ARGB_8888,
        RGBA_F16,
        HARDWARE,
        RGBA_1010102,
    }

    public int getWidth() {
        return image.getWidth();
    }

    public int getHeight() {
        return image.getHeight();
    }

    public static Bitmap createBitmap(int width, int height, Config config) {
        if (width <= 0 || height <= 0) {
            throw new IllegalArgumentException("width and height must be > 0");
        }
        return new Bitmap(new BufferedImage(width, height, imageType(config)));
    }

    public static Bitmap createBitmap(Bitmap source, int x, int y, int width, int height) {
        if (x < 0 || y < 0 || width <= 0 || height <= 0 ||
                x + width > source.getWidth() || y + height > source.getHeight()) {
            throw new IllegalArgumentException("requested subset is outside the source bitmap");
        }
        BufferedImage subset = source.image.getSubimage(x, y, width, height);
        BufferedImage copy = new BufferedImage(width, height, subset.getType());
        copy.setData(subset.getData());
        return new Bitmap(copy);
    }

    public Bitmap copy(Config config, boolean mutable) {
        Bitmap copy = createBitmap(getWidth(), getHeight(), config);
        Graphics2D graphics = copy.image.createGraphics();
        graphics.drawImage(image, 0, 0, null);
        graphics.dispose();
        return copy;
    }

    public int getPixel(int x, int y) {
        checkPixel(x, y);
        return image.getRGB(x, y);
    }

    public void setPixel(int x, int y, int color) {
        checkPixel(x, y);
        image.setRGB(x, y, color);
    }

    public void getPixels(int[] pixels, int offset, int stride, int x, int y, int width, int height) {
        checkPixels(pixels, offset, stride, x, y, width, height);
        image.getRGB(x, y, width, height, pixels, offset, stride);
    }

    public void setPixels(int[] pixels, int offset, int stride, int x, int y, int width, int height) {
        if (width == 0 || height == 0) {
            return;
        }
        checkPixels(pixels, offset, stride, x, y, width, height);
        image.setRGB(x, y, width, height, pixels, offset, stride);
    }

    public boolean compress(CompressFormat format, int quality, OutputStream stream) {
        if (stream == null) {
            throw new NullPointerException("stream");
        }
        if (quality < 0 || quality > 100) {
            throw new IllegalArgumentException("quality must be 0..100");
        }

        String formatName = switch (format) {
            case PNG -> "png";
            case JPEG -> "jpg";
            case WEBP, WEBP_LOSSY -> "webp";
            case WEBP_LOSSLESS -> throw new IllegalArgumentException("unsupported compression format: " + format);
        };
        Iterator<ImageWriter> writers = ImageIO.getImageWritersByFormatName(formatName);
        if (!writers.hasNext()) {
            throw new IllegalStateException("no image writer for " + formatName);
        }

        ImageWriter writer = writers.next();
        BufferedImage outputImage = image;
        if (format == CompressFormat.JPEG && image.getType() != BufferedImage.TYPE_INT_RGB) {
            outputImage = new BufferedImage(getWidth(), getHeight(), BufferedImage.TYPE_INT_RGB);
            outputImage.getGraphics().drawImage(image, 0, 0, null);
        }

        try (ImageOutputStream imageOutput = ImageIO.createImageOutputStream(stream)) {
            writer.setOutput(imageOutput);
            ImageWriteParam params = writer.getDefaultWriteParam();
            if (format == CompressFormat.JPEG) {
                params.setCompressionMode(ImageWriteParam.MODE_EXPLICIT);
                params.setCompressionQuality(quality / 100.0f);
            } else if (params instanceof WebPWriteParam webPParams) {
                webPParams.setCompressionType(CompressionType.Lossy);
                webPParams.setCompressionQuality(quality / 100.0f);
                webPParams.setLowMemory(true);
            }
            writer.write(null, new IIOImage(outputImage, null, null), params);
            return true;
        } catch (IOException exception) {
            throw new RuntimeException(exception);
        } finally {
            writer.dispose();
        }
    }

    public void recycle() {
    }

    private void checkPixel(int x, int y) {
        if (x < 0 || y < 0 || x >= getWidth() || y >= getHeight()) {
            throw new IllegalArgumentException("pixel is outside the bitmap");
        }
    }

    private void checkPixels(int[] pixels, int offset, int stride, int x, int y, int width, int height) {
        if (x < 0 || y < 0 || width < 0 || height < 0 ||
                x + width > getWidth() || y + height > getHeight()) {
            throw new IllegalArgumentException("pixel region is outside the bitmap");
        }
        if (Math.abs(stride) < width) {
            throw new IllegalArgumentException("abs(stride) must be >= width");
        }
        int lastRow = offset + (height - 1) * stride;
        if (offset < 0 || offset + width > pixels.length || lastRow < 0 || lastRow + width > pixels.length) {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    private static int imageType(Config config) {
        return switch (config) {
            case ALPHA_8 -> BufferedImage.TYPE_BYTE_GRAY;
            case RGB_565 -> BufferedImage.TYPE_USHORT_565_RGB;
            case ARGB_8888 -> BufferedImage.TYPE_INT_ARGB;
            default -> throw new UnsupportedOperationException("unsupported bitmap config: " + config);
        };
    }
}
