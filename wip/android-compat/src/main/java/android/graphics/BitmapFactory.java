package android.graphics;

import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import javax.imageio.ImageIO;

public final class BitmapFactory {
    private BitmapFactory() {
    }

    public static final class Options {
        public boolean inMutable;

        public Options() {
        }
    }

    public static Bitmap decodeStream(InputStream inputStream) {
        if (inputStream == null) {
            return null;
        }
        try {
            BufferedImage image = ImageIO.read(inputStream);
            return image == null ? null : new Bitmap(image);
        } catch (IOException exception) {
            return null;
        }
    }

    public static Bitmap decodeByteArray(byte[] data, int offset, int length) {
        if ((offset | length) < 0 || offset + length > data.length) {
            throw new ArrayIndexOutOfBoundsException();
        }
        return decodeStream(new ByteArrayInputStream(data, offset, length));
    }

    public static Bitmap decodeByteArray(byte[] data, int offset, int length, Options options) {
        return decodeByteArray(data, offset, length);
    }
}
