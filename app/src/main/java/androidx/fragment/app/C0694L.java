package androidx.fragment.app;

import java.io.Writer;

/* renamed from: androidx.fragment.app.L */
/* loaded from: classes.dex */
public final class C0694L extends Writer {

    /* renamed from: a */
    public final StringBuilder f2520a = new StringBuilder(128);

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        m1717g();
    }

    @Override // java.io.Writer, java.io.Flushable
    public final void flush() {
        m1717g();
    }

    /* renamed from: g */
    public final void m1717g() {
        StringBuilder sb = this.f2520a;
        if (sb.length() > 0) {
            sb.toString();
            sb.delete(0, sb.length());
        }
    }

    @Override // java.io.Writer
    public final void write(char[] cArr, int i2, int i3) {
        for (int i4 = 0; i4 < i3; i4++) {
            char c3 = cArr[i2 + i4];
            if (c3 == '\n') {
                m1717g();
            } else {
                this.f2520a.append(c3);
            }
        }
    }
}
