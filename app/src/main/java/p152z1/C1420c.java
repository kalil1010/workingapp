package p152z1;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayDeque;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: z1.c */
/* loaded from: classes.dex */
public final class C1420c extends InputStream {

    /* renamed from: d */
    public static final Logger f6107d = Logger.getLogger("net.sf.scuba");

    /* renamed from: a */
    public final DataInputStream f6108a;

    /* renamed from: b */
    public C1419b f6109b;

    /* renamed from: c */
    public C1419b f6110c;

    public C1420c(ByteArrayInputStream byteArrayInputStream) throws IOException {
        try {
            byteArrayInputStream.available();
        } catch (IOException e3) {
            f6107d.log(Level.WARNING, "Exception reading from stream", (Throwable) e3);
        }
        this.f6108a = new DataInputStream(byteArrayInputStream);
        this.f6109b = new C1419b(new ArrayDeque(), true, false, false);
        this.f6110c = null;
    }

    @Override // java.io.InputStream
    public final int available() {
        return this.f6108a.available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f6108a.close();
    }

    /* renamed from: g */
    public final int m3200g() throws IOException {
        int i2;
        DataInputStream dataInputStream = this.f6108a;
        if (!this.f6109b.f6105c) {
            throw new IllegalStateException("Not at start of length");
        }
        int unsignedByte = dataInputStream.readUnsignedByte();
        if ((unsignedByte & 128) == 0) {
            i2 = 1;
        } else {
            int i3 = unsignedByte & 127;
            int unsignedByte2 = 0;
            i2 = 1;
            for (int i4 = 0; i4 < i3; i4++) {
                i2++;
                unsignedByte2 = (unsignedByte2 << 8) | dataInputStream.readUnsignedByte();
            }
            unsignedByte = unsignedByte2;
        }
        C1419b c1419b = this.f6109b;
        ArrayDeque arrayDeque = c1419b.f6103a;
        if (unsignedByte < 0) {
            StringBuilder sb = new StringBuilder("Cannot set negative length (length = ");
            sb.append(unsignedByte);
            sb.append(", 0x");
            sb.append(Integer.toHexString(unsignedByte));
            sb.append(" for tag ");
            if (arrayDeque.isEmpty()) {
                throw new IllegalStateException("Tag not yet read.");
            }
            sb.append(Integer.toHexString(((C1418a) arrayDeque.peek()).f6100a));
            sb.append(").");
            throw new IllegalArgumentException(sb.toString());
        }
        C1418a c1418a = (C1418a) arrayDeque.pop();
        if (!arrayDeque.isEmpty()) {
            ((C1418a) arrayDeque.peek()).f6102c += i2;
        }
        c1418a.f6101b = unsignedByte;
        arrayDeque.push(c1418a);
        c1419b.f6104b = false;
        c1419b.f6105c = false;
        c1419b.f6106d = true;
        return unsignedByte;
    }

    /* renamed from: h */
    public final int m3201h() throws IOException {
        DataInputStream dataInputStream = this.f6108a;
        C1419b c1419b = this.f6109b;
        if (!c1419b.f6104b && !c1419b.f6106d) {
            throw new IllegalStateException("Not at start of tag");
        }
        int unsignedByte = dataInputStream.readUnsignedByte();
        int i2 = 1;
        while (true) {
            if (unsignedByte != 0 && unsignedByte != 255) {
                break;
            }
            unsignedByte = dataInputStream.readUnsignedByte();
            i2++;
        }
        if ((unsignedByte & 31) == 31) {
            int unsignedByte2 = dataInputStream.readUnsignedByte();
            while (true) {
                i2++;
                if ((unsignedByte2 & 128) != 128) {
                    break;
                }
                unsignedByte = (unsignedByte << 8) | (unsignedByte2 & 127);
                unsignedByte2 = dataInputStream.readUnsignedByte();
            }
            unsignedByte = (unsignedByte2 & 127) | (unsignedByte << 8);
        }
        C1419b c1419b2 = this.f6109b;
        c1419b2.getClass();
        C1418a c1418a = new C1418a(unsignedByte, Integer.MAX_VALUE, 0);
        ArrayDeque arrayDeque = c1419b2.f6103a;
        if (!arrayDeque.isEmpty()) {
            ((C1418a) arrayDeque.peek()).f6102c += i2;
        }
        arrayDeque.push(c1418a);
        c1419b2.f6104b = false;
        c1419b2.f6105c = true;
        c1419b2.f6106d = false;
        return unsignedByte;
    }

    /* renamed from: i */
    public final byte[] m3202i() throws IOException {
        C1419b c1419b = this.f6109b;
        if (!c1419b.f6106d) {
            throw new IllegalStateException("Not yet processing value!");
        }
        ArrayDeque arrayDeque = c1419b.f6103a;
        if (arrayDeque.isEmpty()) {
            throw new IllegalStateException("Length not yet known.");
        }
        int i2 = ((C1418a) arrayDeque.peek()).f6101b;
        byte[] bArr = new byte[i2];
        this.f6108a.readFully(bArr);
        this.f6109b.m3199a(i2);
        return bArr;
    }

    @Override // java.io.InputStream
    public final synchronized void mark(int i2) {
        this.f6108a.mark(i2);
        this.f6110c = new C1419b(this.f6109b);
    }

    @Override // java.io.InputStream
    public final boolean markSupported() {
        return this.f6108a.markSupported();
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        int i2 = this.f6108a.read();
        if (i2 < 0) {
            return -1;
        }
        this.f6109b.m3199a(1);
        return i2;
    }

    @Override // java.io.InputStream
    public final synchronized void reset() {
        if (!this.f6108a.markSupported()) {
            throw new IOException("mark/reset not supported");
        }
        this.f6108a.reset();
        this.f6109b = this.f6110c;
        this.f6110c = null;
    }

    @Override // java.io.InputStream
    public final long skip(long j2) throws IOException {
        if (j2 <= 0) {
            return 0L;
        }
        long jSkip = this.f6108a.skip(j2);
        this.f6109b.m3199a((int) jSkip);
        return jSkip;
    }

    public final String toString() {
        return this.f6109b.f6103a.toString();
    }
}
