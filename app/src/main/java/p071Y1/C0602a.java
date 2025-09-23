package p071Y1;

import java.io.Serializable;
import java.io.Writer;

/* renamed from: Y1.a */
/* loaded from: classes.dex */
public final class C0602a extends Writer implements Serializable {

    /* renamed from: a */
    public final StringBuilder f1911a = new StringBuilder(4);

    @Override // java.io.Writer, java.lang.Appendable
    public final Writer append(char c3) {
        this.f1911a.append(c3);
        return this;
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // java.io.Writer, java.io.Flushable
    public final void flush() {
    }

    public final String toString() {
        return this.f1911a.toString();
    }

    @Override // java.io.Writer
    public final void write(String str) {
        if (str != null) {
            this.f1911a.append(str);
        }
    }

    @Override // java.io.Writer, java.lang.Appendable
    public final Appendable append(char c3) {
        this.f1911a.append(c3);
        return this;
    }

    @Override // java.io.Writer
    public final void write(char[] cArr, int i2, int i3) {
        if (cArr != null) {
            this.f1911a.append(cArr, i2, i3);
        }
    }

    @Override // java.io.Writer, java.lang.Appendable
    public final Writer append(CharSequence charSequence) {
        this.f1911a.append(charSequence);
        return this;
    }

    @Override // java.io.Writer, java.lang.Appendable
    public final Appendable append(CharSequence charSequence) {
        this.f1911a.append(charSequence);
        return this;
    }

    @Override // java.io.Writer, java.lang.Appendable
    public final Writer append(CharSequence charSequence, int i2, int i3) {
        this.f1911a.append(charSequence, i2, i3);
        return this;
    }

    @Override // java.io.Writer, java.lang.Appendable
    public final Appendable append(CharSequence charSequence, int i2, int i3) {
        this.f1911a.append(charSequence, i2, i3);
        return this;
    }
}
