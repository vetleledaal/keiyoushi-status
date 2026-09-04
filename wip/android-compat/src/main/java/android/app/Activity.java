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

package android.app;

import android.annotation.CallSuper;
import android.annotation.Nullable;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;

/**
 * Headless lifecycle host for an Activity subclass.
 *
 * <p>There is no window, no decor view, and no configuration change here, so this
 * class only carries what a hosted Activity can observe: the launch
 * {@link Intent}, the lifecycle callbacks, {@link #finish()}, and a content view
 * that is attached to a {@link ViewGroup} so that {@link View#getParent()} and
 * {@link ViewGroup#removeView(View)} behave as callers expect.
 *
 * <p>Lifecycle callbacks run on the thread that pumps the main looper, which is
 * where {@link #finish()} schedules {@code onDestroy}. An extension that waits on
 * a {@link android.os.ResultReceiver} therefore observes both its lifecycle calls
 * and its result callback on that one thread.
 *
 * <p>Instances are created by {@link Context#startActivity(Intent)}, which
 * attaches the base context and drives the lifecycle. Creating one directly
 * leaves it unattached, and touching the base context then fails.
 */
public class Activity extends ContextWrapper {
    /** Result code for {@link #finish()} without a result. */
    public static final int RESULT_CANCELED = 0;
    /** Result code for an activity that reports success. */
    public static final int RESULT_OK = -1;

    /** The intent this activity was launched with, never {@code null} once attached. */
    private Intent mIntent;
    private ViewGroup mContentParent;
    private View mContentView;
    private boolean mCreated;
    private boolean mStarted;
    private boolean mResumed;
    private boolean mFinished;
    private boolean mDestroyed;

    public Activity() {
        super(null);
    }

    // ------------------ Internal API ------------------

    /**
     * Set the base context for this activity. Called before the lifecycle runs.
     *
     * @param context The context this activity runs in.
     * @hide
     */
    public final void attach(Context context) {
        attachBaseContext(context);
    }

    /**
     * Run {@link #onCreate(Bundle)} followed by {@link #onStart()} and
     * {@link #onResume()}, once.
     *
     * @param savedInstanceState Always {@code null}; nothing saves instance state.
     * @hide
     */
    public final void performCreate(@Nullable Bundle savedInstanceState) {
        if (mCreated) {
            throw new IllegalStateException("Activity has already been created");
        }
        mCreated = true;
        onCreate(savedInstanceState);
    }

    /** @hide */
    public final void performStart() {
        if (!mStarted) {
            mStarted = true;
            onStart();
        }
    }

    /** @hide */
    public final void performResume() {
        if (!mResumed) {
            mResumed = true;
            onResume();
        }
    }

    /** @hide */
    public final void performPause() {
        if (mResumed) {
            mResumed = false;
            onPause();
        }
    }

    /** @hide */
    public final void performStop() {
        if (mStarted) {
            mStarted = false;
            onStop();
        }
    }

    /**
     * Run the teardown callbacks once, ending with {@link #onDestroy()}.
     *
     * @hide
     */
    public final void performDestroy() {
        if (mDestroyed) {
            return;
        }
        performPause();
        performStop();
        mDestroyed = true;
        if (mCreated) {
            onDestroy();
        }
    }

    // ------------------ Public API ------------------

    /**
     * Set the intent this activity runs with.
     *
     * @param intent The launch intent.
     */
    public void setIntent(Intent intent) {
        mIntent = intent;
    }

    /**
     * Return the intent this activity was launched with.
     *
     * @return The launch intent.
     */
    public Intent getIntent() {
        return mIntent;
    }

    /**
     * Read a string extra from the launch intent.
     *
     * @param name The extra name.
     * @return The extra value, or {@code null} when absent.
     */
    @Nullable
    public String getStringExtra(String name) {
        return mIntent == null ? null : mIntent.getStringExtra(name);
    }

    /**
     * Read a parcelable extra from the launch intent. Parcelables are stored by
     * reference here, so this returns the instance the caller passed in.
     *
     * @param name The extra name.
     * @return The extra value, or {@code null} when absent.
     */
    @Nullable
    public <T extends Parcelable> T getParcelableExtra(String name) {
        return mIntent == null ? null : mIntent.<T>getParcelableExtra(name);
    }

    /**
     * Finish this activity and end its lifecycle. {@link #onDestroy()} runs on the
     * thread pumping the main looper, or inline when this thread already pumps it.
     */
    public void finish() {
        if (mFinished) {
            return;
        }
        mFinished = true;
        if (!mCreated) {
            // Never created, so nothing tore down and nothing ever will.
            return;
        }
        final Looper mainLooper = Looper.getMainLooper();
        if (mainLooper != null && mainLooper.getThread() == Thread.currentThread()) {
            performDestroy();
        } else {
            new Handler(mainLooper).post(this::performDestroy);
        }
    }

    /**
     * Return whether {@link #finish()} has been called.
     *
     * @return True when this activity is finishing or already destroyed.
     */
    public boolean isFinishing() {
        return mFinished;
    }

    /**
     * Return whether this activity is being recreated for a new configuration.
     * Nothing recreates it here, so this is always false.
     *
     * @return False.
     */
    public boolean isChangingConfigurations() {
        return false;
    }

    /**
     * Set the content view, attaching it to a content parent so that
     * {@link View#getParent()} and {@link ViewGroup#removeView(View)} work.
     *
     * @param view The view to show, or {@code null} to clear the content view.
     */
    public void setContentView(View view) {
        if (mContentParent == null) {
            mContentParent = new ViewGroup(getBaseContext());
        }
        if (mContentView != null) {
            mContentParent.removeView(mContentView);
        }
        mContentView = view;
        if (view != null) {
            mContentParent.addView(view);
        }
    }

    /**
     * Called when the activity is starting. Subclasses must call through to
     * {@link #super.onCreate(Bundle)}.
     *
     * @param savedInstanceState Always {@code null}.
     */
    @CallSuper
    protected void onCreate(@Nullable Bundle savedInstanceState) {
    }

    /** Called when the activity becomes visible to the user. */
    protected void onStart() {
    }

    /** Called when the activity becomes interactive. */
    protected void onResume() {
    }

    /** Called when the activity is no longer interactive. */
    protected void onPause() {
    }

    /** Called when the activity is no longer visible. */
    protected void onStop() {
    }

    /** Called when the activity is no longer usable, releasing everything it holds. */
    protected void onDestroy() {
    }

    /**
     * Called when the activity is relaunched with a new intent.
     *
     * @param intent The new intent.
     */
    protected void onNewIntent(Intent intent) {
        setIntent(intent);
    }
}