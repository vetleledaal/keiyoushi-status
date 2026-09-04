/*
 * Copyright (C) 2006 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package android.view;

import android.content.Context;
import android.util.AttributeSet;

public class View {
    private final Context context;
    private ViewGroup.LayoutParams layoutParams;
    private int measuredWidth;
    private int measuredHeight;
    private int left;
    private int top;
    private int right;
    private int bottom;

    public static class MeasureSpec {
        private static final int MODE_SHIFT = 30;
        private static final int MODE_MASK = 0x3 << MODE_SHIFT;

        public static final int UNSPECIFIED = 0 << MODE_SHIFT;
        public static final int EXACTLY = 1 << MODE_SHIFT;
        public static final int AT_MOST = 2 << MODE_SHIFT;

        public static int makeMeasureSpec(int size, int mode) {
            return (size & ~MODE_MASK) | (mode & MODE_MASK);
        }

        public static int getMode(int measureSpec) {
            return measureSpec & MODE_MASK;
        }

        public static int getSize(int measureSpec) {
            return measureSpec & ~MODE_MASK;
        }
    }

    public View(Context context) {
        this(context, null);
    }

    public View(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public View(Context context, AttributeSet attrs, int defStyleAttr) {
        this(context, attrs, defStyleAttr, 0);
    }

    public View(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        if (context == null) {
            throw new IllegalArgumentException("Invalid context argument");
        }
        this.context = context;
    }

    public final Context getContext() {
        return context;
    }

    public void setLayoutParams(ViewGroup.LayoutParams params) {
        layoutParams = params;
    }

    public ViewGroup.LayoutParams getLayoutParams() {
        return layoutParams;
    }

    public final void measure(int widthMeasureSpec, int heightMeasureSpec) {
        measuredWidth = MeasureSpec.getSize(widthMeasureSpec);
        measuredHeight = MeasureSpec.getSize(heightMeasureSpec);
    }

    public final int getMeasuredWidth() {
        return measuredWidth;
    }

    public final int getMeasuredHeight() {
        return measuredHeight;
    }

    public void layout(int left, int top, int right, int bottom) {
        this.left = left;
        this.top = top;
        this.right = right;
        this.bottom = bottom;
    }

    public final int getLeft() {
        return left;
    }

    public final int getTop() {
        return top;
    }

    public final int getRight() {
        return right;
    }

    public final int getBottom() {
        return bottom;
    }

    public final int getWidth() {
        return right - left;
    }

    public final int getHeight() {
        return bottom - top;
    }
}
