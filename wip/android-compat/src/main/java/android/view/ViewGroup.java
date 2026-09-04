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

import java.util.ArrayList;

public class ViewGroup extends View implements ViewParent {
    private final ArrayList<View> mChildren = new ArrayList<>();

    public static class LayoutParams {
        public int width;
        public int height;

        public LayoutParams(int width, int height) {
            this.width = width;
            this.height = height;
        }
    }

    public ViewGroup(Context context) {
        super(context);
    }

    public ViewGroup(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public ViewGroup(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public ViewGroup(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    /**
     * Add a child view. A view can only have one parent, so adding a view that
     * already has one detaches it from its previous parent first.
     *
     * @param child The view to add.
     */
    public void addView(View child) {
        if (child == null || mChildren.contains(child)) {
            return;
        }
        if (child.getParent() instanceof ViewGroup) {
            ((ViewGroup) child.getParent()).removeView(child);
        }
        mChildren.add(child);
        child.setParent(this);
    }

    /**
     * Remove a child view, detaching it from this group.
     *
     * @param child The view to remove.
     */
    public void removeView(View child) {
        if (mChildren.remove(child)) {
            child.setParent(null);
        }
    }

    /**
     * Return the number of child views.
     *
     * @return The child count.
     */
    public int getChildCount() {
        return mChildren.size();
    }

    /**
     * Return the child view at {@code index}.
     *
     * @param index The child index.
     * @return The child view.
     */
    public View getChildAt(int index) {
        return mChildren.get(index);
    }
}
