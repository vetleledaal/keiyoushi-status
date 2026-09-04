package android.graphics;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class Rect {
    public int left;
    public int top;
    public int right;
    public int bottom;

    private static final class UnflattenHelper {
        private static final Pattern FLATTENED_PATTERN = Pattern.compile(
                "(-?\\d+) (-?\\d+) (-?\\d+) (-?\\d+)");

        static Matcher getMatcher(String value) {
            return FLATTENED_PATTERN.matcher(value);
        }
    }

    public Rect() {
    }

    public Rect(int left, int top, int right, int bottom) {
        this.left = left;
        this.top = top;
        this.right = right;
        this.bottom = bottom;
    }

    public Rect(Rect rect) {
        if (rect != null) {
            left = rect.left;
            top = rect.top;
            right = rect.right;
            bottom = rect.bottom;
        }
    }

    public void set(int left, int top, int right, int bottom) {
        this.left = left;
        this.top = top;
        this.right = right;
        this.bottom = bottom;
    }

    public void set(Rect rect) {
        left = rect.left;
        top = rect.top;
        right = rect.right;
        bottom = rect.bottom;
    }

    public final int getWidth() {
        return right - left;
    }

    public final int getHeight() {
        return bottom - top;
    }

    public static Rect unflattenFromString(String value) {
        if (value.isEmpty()) {
            return null;
        }

        Matcher matcher = UnflattenHelper.getMatcher(value);
        if (!matcher.matches()) {
            return null;
        }

        return new Rect(
                Integer.parseInt(matcher.group(1)),
                Integer.parseInt(matcher.group(2)),
                Integer.parseInt(matcher.group(3)),
                Integer.parseInt(matcher.group(4)));
    }

    public String toShortString() {
        return toShortString(new StringBuilder(32));
    }

    public String toShortString(StringBuilder builder) {
        builder.setLength(0);
        builder.append('[').append(left).append(',').append(top)
                .append("][").append(right).append(',').append(bottom).append(']');
        return builder.toString();
    }

    public String flattenToString() {
        return left + " " + top + " " + right + " " + bottom;
    }

    public void writeToParcel(Parcel out, int flags) {
        out.writeInt(left);
        out.writeInt(top);
        out.writeInt(right);
        out.writeInt(bottom);
    }

    public static final Parcelable.Creator<Rect> CREATOR = new Parcelable.Creator<>() {
        @Override
        public Rect createFromParcel(Parcel in) {
            Rect rect = new Rect();
            rect.readFromParcel(in);
            return rect;
        }

        @Override
        public Rect[] newArray(int size) {
            return new Rect[size];
        }
    };

    public void readFromParcel(Parcel in) {
        left = in.readInt();
        top = in.readInt();
        right = in.readInt();
        bottom = in.readInt();
    }
}
