package android.view;

import java.nio.ByteBuffer;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class Surface {
    private static final List<Surface> ACTIVE = new CopyOnWriteArrayList<>();

    private boolean valid = true;
    private FrameConsumer frameConsumer;

    public Surface() {
        ACTIVE.add(this);
    }

    public void setFrameConsumer(FrameConsumer frameConsumer) {
        this.frameConsumer = frameConsumer;
    }

    public static void publishFrame(ByteBuffer pixels, int width, int height) {
        for (Surface surface : ACTIVE) {
            if (surface.frameConsumer != null) {
                surface.frameConsumer.accept(pixels, width, height);
            }
        }
    }

    public void release() {
        valid = false;
        frameConsumer = null;
        ACTIVE.remove(this);
    }

    public boolean isValid() {
        return valid;
    }

    public interface FrameConsumer {
        void accept(ByteBuffer pixels, int width, int height);
    }
}
