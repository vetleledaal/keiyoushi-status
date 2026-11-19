package android.util;

import java.io.Closeable;
import java.io.IOException;
import java.io.Reader;

public final class JsonReader implements Closeable {
    private final com.google.gson.stream.JsonReader delegate;

    public JsonReader(Reader in) {
        delegate = new com.google.gson.stream.JsonReader(in);
    }

    public void setLenient(boolean lenient) {
        delegate.setLenient(lenient);
    }

    public boolean isLenient() {
        return delegate.isLenient();
    }

    public void beginArray() throws IOException {
        delegate.beginArray();
    }

    public void endArray() throws IOException {
        delegate.endArray();
    }

    public void beginObject() throws IOException {
        delegate.beginObject();
    }

    public void endObject() throws IOException {
        delegate.endObject();
    }

    public boolean hasNext() throws IOException {
        return delegate.hasNext();
    }

    public JsonToken peek() throws IOException {
        return JsonToken.valueOf(delegate.peek().name());
    }

    public String nextName() throws IOException {
        return delegate.nextName();
    }

    public String nextString() throws IOException {
        return delegate.nextString();
    }

    public boolean nextBoolean() throws IOException {
        return delegate.nextBoolean();
    }

    public void nextNull() throws IOException {
        delegate.nextNull();
    }

    public double nextDouble() throws IOException {
        return delegate.nextDouble();
    }

    public long nextLong() throws IOException {
        return delegate.nextLong();
    }

    public int nextInt() throws IOException {
        return delegate.nextInt();
    }

    @Override
    public void close() throws IOException {
        delegate.close();
    }

    public void skipValue() throws IOException {
        delegate.skipValue();
    }

    @Override
    public String toString() {
        return delegate.toString();
    }
}
