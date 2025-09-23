package p087d0;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Objects;

/* renamed from: d0.l */
/* loaded from: classes.dex */
public final class C0855l {

    /* renamed from: a */
    public final int f3510a;

    /* renamed from: b */
    public final int f3511b;

    /* renamed from: c */
    public final long f3512c;

    /* renamed from: d */
    public final long f3513d;

    public C0855l(int i2, int i3, long j2, long j3) {
        this.f3510a = i2;
        this.f3511b = i3;
        this.f3512c = j2;
        this.f3513d = j3;
    }

    /* renamed from: a */
    public static C0855l m2174a(File file) throws IOException {
        DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
        try {
            C0855l c0855l = new C0855l(dataInputStream.readInt(), dataInputStream.readInt(), dataInputStream.readLong(), dataInputStream.readLong());
            dataInputStream.close();
            return c0855l;
        } finally {
        }
    }

    /* renamed from: b */
    public final void m2175b(File file) throws IOException {
        file.delete();
        DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(file));
        try {
            dataOutputStream.writeInt(this.f3510a);
            dataOutputStream.writeInt(this.f3511b);
            dataOutputStream.writeLong(this.f3512c);
            dataOutputStream.writeLong(this.f3513d);
            dataOutputStream.close();
        } catch (Throwable th) {
            try {
                dataOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof C0855l)) {
            C0855l c0855l = (C0855l) obj;
            if (this.f3511b == c0855l.f3511b && this.f3512c == c0855l.f3512c && this.f3510a == c0855l.f3510a && this.f3513d == c0855l.f3513d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f3511b), Long.valueOf(this.f3512c), Integer.valueOf(this.f3510a), Long.valueOf(this.f3513d));
    }
}
