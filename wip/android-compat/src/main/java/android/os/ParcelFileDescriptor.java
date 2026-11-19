package android.os;

import java.io.Closeable;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;

public class ParcelFileDescriptor implements Parcelable, Closeable {
    public static final int MODE_READ_ONLY = 0x10000000;
    public static final int MODE_WRITE_ONLY = 0x20000000;
    public static final int MODE_READ_WRITE = 0x30000000;
    public static final int MODE_CREATE = 0x08000000;
    public static final int MODE_TRUNCATE = 0x04000000;
    public static final int MODE_WORLD_READABLE = 0x00000001;
    public static final int MODE_WORLD_WRITEABLE = 0x00000002;
    public static final int MODE_APPEND = 0x02000000;

    private final File file;
    private final Closeable stream;
    private final FileDescriptor descriptor;
    private boolean closed;

    private ParcelFileDescriptor(File file, Closeable stream, FileDescriptor descriptor) {
        this.file = file;
        this.stream = stream;
        this.descriptor = descriptor;
    }

    public static ParcelFileDescriptor open(File file, int mode) throws FileNotFoundException {
        boolean readable = (mode & MODE_READ_WRITE) == MODE_READ_ONLY
                || (mode & MODE_READ_WRITE) == MODE_READ_WRITE;
        boolean writable = (mode & MODE_READ_WRITE) == MODE_WRITE_ONLY
                || (mode & MODE_READ_WRITE) == MODE_READ_WRITE;

        if (readable && writable) {
            try {
                RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
                if ((mode & MODE_TRUNCATE) != 0) {
                    randomAccessFile.setLength(0);
                }
                if ((mode & MODE_APPEND) != 0) {
                    randomAccessFile.seek(randomAccessFile.length());
                }
                return new ParcelFileDescriptor(file, randomAccessFile, randomAccessFile.getFD());
            } catch (FileNotFoundException exception) {
                throw exception;
            } catch (IOException exception) {
                throw new FileNotFoundException(exception.getMessage());
            }
        }
        if (writable) {
            if ((mode & MODE_CREATE) != 0) {
                try {
                    file.getParentFile().mkdirs();
                    file.createNewFile();
                } catch (IOException exception) {
                    throw new FileNotFoundException(exception.getMessage());
                }
            }
            FileOutputStream output = new FileOutputStream(file, (mode & MODE_APPEND) != 0);
            try {
                return new ParcelFileDescriptor(file, output, output.getFD());
            } catch (IOException exception) {
                try {
                    output.close();
                } catch (IOException ignored) {
                }
                throw new FileNotFoundException(exception.getMessage());
            }
        }

        FileInputStream input = new FileInputStream(file);
        try {
            return new ParcelFileDescriptor(file, input, input.getFD());
        } catch (IOException exception) {
            try {
                input.close();
            } catch (IOException ignored) {
            }
            throw new FileNotFoundException(exception.getMessage());
        }
    }

    public FileDescriptor getFileDescriptor() {
        return descriptor;
    }

    public long getStatSize() {
        return file.length();
    }

    public File getCompatFile() {
        return file;
    }

    @Override
    public void close() throws IOException {
        if (!closed) {
            closed = true;
            stream.close();
        }
    }

    @Override
    public int describeContents() {
        return Parcelable.CONTENTS_FILE_DESCRIPTOR;
    }

    @Override
    public void writeToParcel(Parcel destination, int flags) {
        throw new UnsupportedOperationException("ParcelFileDescriptor parceling is not supported");
    }
}
