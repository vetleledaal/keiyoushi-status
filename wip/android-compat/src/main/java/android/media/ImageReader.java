package android.media;

import android.graphics.PixelFormat;
import android.os.Handler;
import android.view.Surface;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.Deque;

public final class ImageReader implements AutoCloseable {
    public interface OnImageAvailableListener {
        void onImageAvailable(ImageReader reader);
    }

    private final int width;
    private final int height;
    private final int format;
    private final int maxImages;
    private final Surface surface = new Surface();
    private final Deque<Image> images = new ArrayDeque<>();
    private OnImageAvailableListener listener;
    private Handler handler;
    private boolean closed;

    private ImageReader(int width, int height, int format, int maxImages) {
        if (width <= 0 || height <= 0 || maxImages <= 0) {
            throw new IllegalArgumentException("width, height, and maxImages must be positive");
        }
        this.width = width;
        this.height = height;
        this.format = format;
        this.maxImages = maxImages;
        surface.setFrameConsumer((pixels, frameWidth, frameHeight) -> {
            if (frameWidth <= 0 || frameHeight <= 0) return;
            ByteBuffer frame = ByteBuffer.allocate(width * height * 4);
            ByteBuffer source = pixels.duplicate();
            int copyWidth = Math.min(width, frameWidth);
            int copyHeight = Math.min(height, frameHeight);
            byte[] pixel = new byte[4];
            for (int y = 0; y < copyHeight; y++) {
                for (int x = 0; x < copyWidth; x++) {
                    source.position((y * frameWidth + x) * 4);
                    source.get(pixel);
                    int destination = (y * width + x) * 4;
                    frame.put(destination, pixel[2]);
                    frame.put(destination + 1, pixel[1]);
                    frame.put(destination + 2, pixel[0]);
                    frame.put(destination + 3, pixel[3]);
                }
            }
            frame.rewind();
            publishFrame(frame);
        });
    }

    public static ImageReader newInstance(int width, int height, int format, int maxImages) {
        return new ImageReader(width, height, format, maxImages);
    }

    public static ImageReader newInstance(int width, int height, int format, int maxImages, long usage) {
        return newInstance(width, height, format, maxImages);
    }

    public int getWidth() { return width; }
    public int getHeight() { return height; }
    public int getImageFormat() { return format; }
    public int getMaxImages() { return maxImages; }
    public Surface getSurface() { return surface; }

    public synchronized Image acquireLatestImage() {
        while (!images.isEmpty()) {
            Image image = images.removeLast();
            while (!images.isEmpty()) images.removeFirst();
            return image;
        }
        return null;
    }

    public synchronized Image acquireNextImage() {
        return images.pollFirst();
    }

    public void setOnImageAvailableListener(OnImageAvailableListener listener, Handler handler) {
        this.listener = listener;
        this.handler = handler;
    }

    public synchronized void publishFrame(ByteBuffer pixels) {
        if (closed) return;
        if (images.size() >= maxImages) images.removeFirst();
        images.addLast(new BufferedImage(width, height, format, pixels));
        OnImageAvailableListener callback = listener;
        Handler callbackHandler = handler;
        if (callback != null) {
            if (callbackHandler != null) callbackHandler.post(() -> callback.onImageAvailable(this));
            else callback.onImageAvailable(this);
        }
    }

    public void discardFreeBuffers() {
        images.clear();
    }

    @Override
    public synchronized void close() {
        closed = true;
        images.clear();
        surface.release();
    }

    private static final class BufferedImage extends Image {
        private final ByteBuffer pixels;
        private final Plane[] planes;
        private final int width;
        private final int height;
        private final int format;

        private BufferedImage(int width, int height, int format, ByteBuffer pixels) {
            this.width = width;
            this.height = height;
            this.format = format;
            this.pixels = pixels.asReadOnlyBuffer();
            planes = new Plane[] {
                new Plane() {
                    @Override public int getRowStride() { return width * 4; }
                    @Override public int getPixelStride() { return 4; }
                    @Override public ByteBuffer getBuffer() { return BufferedImage.this.pixels.duplicate(); }
                }
            };
        }

        @Override public int getFormat() { return format; }
        @Override public int getWidth() { return width; }
        @Override public int getHeight() { return height; }
        @Override public long getTimestamp() { return System.nanoTime(); }
        @Override public Plane[] getPlanes() { return planes; }
        @Override public void close() { }
    }
}
