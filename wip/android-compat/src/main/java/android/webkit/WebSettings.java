/*
 * Copyright (C) 2008 The Android Open Source Project
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

package android.webkit;

public abstract class WebSettings {
    public abstract void setJavaScriptEnabled(boolean flag);

    public abstract boolean getJavaScriptEnabled();

    public abstract void setDomStorageEnabled(boolean flag);

    public abstract boolean getDomStorageEnabled();

    public abstract void setBlockNetworkImage(boolean flag);

    public abstract boolean getBlockNetworkImage();

    public abstract void setLoadWithOverviewMode(boolean overview);

    public abstract boolean getLoadWithOverviewMode();

    public abstract void setUseWideViewPort(boolean use);

    public abstract boolean getUseWideViewPort();

    public abstract void setUserAgentString(String ua);

    public abstract String getUserAgentString();
}
