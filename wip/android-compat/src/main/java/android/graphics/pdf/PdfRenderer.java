package android.graphics.pdf;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.os.ParcelFileDescriptor;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.io.IOException;
import org.apache.pdfbox.Loader;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.rendering.ImageType;

public final class PdfRenderer implements AutoCloseable {
    private final PDDocument document;
    private boolean closed;

    public PdfRenderer(ParcelFileDescriptor input) throws IOException {
        if (input == null) {
            throw new NullPointerException("input");
        }
        document = Loader.loadPDF(input.getCompatFile());
    }

    public int getPageCount() {
        ensureOpen();
        return document.getNumberOfPages();
    }

    public boolean shouldScaleForPrinting() {
        return false;
    }

    public Page openPage(int index) {
        ensureOpen();
        if (index < 0 || index >= document.getNumberOfPages()) {
            throw new IllegalArgumentException("Page index out of range: " + index);
        }
        return new Page(index);
    }

    @Override
    public void close() {
        if (!closed) {
            closed = true;
            try {
                document.close();
            } catch (IOException exception) {
                throw new RuntimeException(exception);
            }
        }
    }

    private void ensureOpen() {
        if (closed) {
            throw new IllegalStateException("PdfRenderer is closed");
        }
    }

    public final class Page implements AutoCloseable {
        public static final int RENDER_MODE_FOR_DISPLAY = 1;
        public static final int RENDER_MODE_FOR_PRINT = 2;

        private final int index;
        private boolean closed;

        private Page(int index) {
            this.index = index;
        }

        public int getIndex() {
            return index;
        }

        public int getWidth() {
            return Math.round(document.getPage(index).getCropBox().getWidth());
        }

        public int getHeight() {
            return Math.round(document.getPage(index).getCropBox().getHeight());
        }

        public void render(Bitmap destination, Rect destinationClip, Matrix transform, int renderMode) {
            ensureOpen();
            if (destination == null) {
                throw new NullPointerException("destination");
            }
            if (transform != null) {
                throw new UnsupportedOperationException("PDF transform rendering is not supported");
            }
            try {
                float scale = Math.max(
                        destination.getWidth() / (float) getWidth(),
                        destination.getHeight() / (float) getHeight());
                BufferedImage rendered = new org.apache.pdfbox.rendering.PDFRenderer(document)
                        .renderImage(index, scale, ImageType.ARGB);
                int x = destinationClip == null ? 0 : destinationClip.left;
                int y = destinationClip == null ? 0 : destinationClip.top;
                int width = destinationClip == null
                        ? destination.getWidth()
                        : destinationClip.getWidth();
                int height = destinationClip == null
                        ? destination.getHeight()
                        : destinationClip.getHeight();
                Graphics2D graphics = destination.getImage().createGraphics();
                graphics.setRenderingHint(
                        RenderingHints.KEY_INTERPOLATION,
                        RenderingHints.VALUE_INTERPOLATION_BICUBIC);
                graphics.drawImage(rendered, x, y, width, height, null);
                graphics.dispose();
            } catch (IOException exception) {
                throw new RuntimeException(exception);
            }
        }

        @Override
        public void close() {
            closed = true;
        }

        private void ensureOpen() {
            if (closed) {
                throw new IllegalStateException("PDF page is closed");
            }
            PdfRenderer.this.ensureOpen();
        }
    }
}
