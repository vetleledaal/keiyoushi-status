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

package android.os;

/**
 * Used to send the result of an operation back to whoever started it.
 *
 * <p>There is no other process here, so a receiver never travels over a
 * {@link Parcel}: {@code Intent.putExtra(name, receiver)} and
 * {@code getParcelableExtra(name)} hand over the very instance that was passed in.
 * What the platform contract does define is the two delivery paths of
 * {@link #send}: it posts to the {@link Handler} given at construction time, and
 * calls {@link #onReceiveResult} inline when no handler was supplied.
 */
public class ResultReceiver implements Parcelable {
    /**
     * The handler the result is posted to, or {@code null} when the result is
     * delivered inline on the sending thread.
     */
    private final Handler mHandler;

    /**
     * Use the supplied {@link Handler} to deliver results.
     *
     * @param handler The {@link Handler} to deliver the result on, or {@code null}
     *                to receive it inline on the sending thread.
     */
    public ResultReceiver(Handler handler) {
        mHandler = handler;
    }

    /**
     * Deliver {@code resultCode} and {@code resultData} to this receiver.
     *
     * <p>The result is posted to the receiver's {@link Handler} when one was
     * supplied, so a receiver on another thread is still called on that handler's
     * thread even though both live in this process. Without a handler there is
     * nowhere to post to and {@link #onReceiveResult} runs inline.
     */
    public final void send(int resultCode, Bundle resultData) {
        if (mHandler != null) {
            mHandler.post(() -> onReceiveResult(resultCode, resultData));
        } else {
            onReceiveResult(resultCode, resultData);
        }
    }

    /**
     * Called to deliver a result. By default, the result is ignored.
     *
     * @param resultCode The result code from the receiver.
     * @param resultData The result data from the receiver, may be {@code null}.
     */
    protected void onReceiveResult(int resultCode, Bundle resultData) {
    }

    @Override
    public int describeContents() {
        return 0;
    }

    /**
     * Not implemented: a result is never marshalled between processes here.
     *
     * @throws UnsupportedOperationException always.
     */
    @Override
    public void writeToParcel(Parcel dest, int flags) {
        throw new UnsupportedOperationException("ResultReceiver cannot be marshalled");
    }

    public static final Creator<ResultReceiver> CREATOR = new Creator<ResultReceiver>() {
        @Override
        public ResultReceiver createFromParcel(Parcel source) {
            throw new UnsupportedOperationException("ResultReceiver cannot be marshalled");
        }

        @Override
        public ResultReceiver[] newArray(int size) {
            return new ResultReceiver[size];
        }
    };
}