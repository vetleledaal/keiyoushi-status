package android.graphics;

public class RectF {
    public float left;
    public float top;
    public float right;
    public float bottom;

    public RectF() {
    }

    public RectF(float left, float top, float right, float bottom) {
        this.left = left;
        this.top = top;
        this.right = right;
        this.bottom = bottom;
    }

    public RectF(RectF rect) {
        if (rect != null) {
            left = rect.left;
            top = rect.top;
            right = rect.right;
            bottom = rect.bottom;
        }
    }

    public RectF(Rect rect) {
        if (rect != null) {
            left = rect.left;
            top = rect.top;
            right = rect.right;
            bottom = rect.bottom;
        }
    }

    public void set(float left, float top, float right, float bottom) {
        this.left = left;
        this.top = top;
        this.right = right;
        this.bottom = bottom;
    }
}
