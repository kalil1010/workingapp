package androidx.emoji2.text;

import java.nio.ByteBuffer;
import p011D1.C0121k;
import p063W.C0551a;
import p063W.C0552b;

/* renamed from: androidx.emoji2.text.l */
/* loaded from: classes.dex */
public final class C0673l {

    /* renamed from: d */
    public static final ThreadLocal f2405d = new ThreadLocal();

    /* renamed from: a */
    public final int f2406a;

    /* renamed from: b */
    public final C0121k f2407b;

    /* renamed from: c */
    public volatile int f2408c = 0;

    public C0673l(C0121k c0121k, int i2) {
        this.f2407b = c0121k;
        this.f2406a = i2;
    }

    /* renamed from: a */
    public final int m1631a(int i2) {
        C0551a c0551aM1632b = m1632b();
        int iM610a = c0551aM1632b.m610a(16);
        if (iM610a == 0) {
            return 0;
        }
        ByteBuffer byteBuffer = (ByteBuffer) c0551aM1632b.f806d;
        int i3 = iM610a + c0551aM1632b.f803a;
        return byteBuffer.getInt((i2 * 4) + byteBuffer.getInt(i3) + i3 + 4);
    }

    /* renamed from: b */
    public final C0551a m1632b() {
        ThreadLocal threadLocal = f2405d;
        C0551a c0551a = (C0551a) threadLocal.get();
        if (c0551a == null) {
            c0551a = new C0551a();
            threadLocal.set(c0551a);
        }
        C0552b c0552b = (C0552b) this.f2407b.f352a;
        int iM610a = c0552b.m610a(6);
        if (iM610a != 0) {
            int i2 = iM610a + c0552b.f803a;
            int i3 = (this.f2406a * 4) + ((ByteBuffer) c0552b.f806d).getInt(i2) + i2 + 4;
            int i4 = ((ByteBuffer) c0552b.f806d).getInt(i3) + i3;
            ByteBuffer byteBuffer = (ByteBuffer) c0552b.f806d;
            c0551a.f806d = byteBuffer;
            if (byteBuffer != null) {
                c0551a.f803a = i4;
                int i5 = i4 - byteBuffer.getInt(i4);
                c0551a.f804b = i5;
                c0551a.f805c = ((ByteBuffer) c0551a.f806d).getShort(i5);
                return c0551a;
            }
            c0551a.f803a = 0;
            c0551a.f804b = 0;
            c0551a.f805c = 0;
        }
        return c0551a;
    }

    public final String toString() {
        int i2;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(", id:");
        C0551a c0551aM1632b = m1632b();
        int iM610a = c0551aM1632b.m610a(4);
        sb.append(Integer.toHexString(iM610a != 0 ? ((ByteBuffer) c0551aM1632b.f806d).getInt(iM610a + c0551aM1632b.f803a) : 0));
        sb.append(", codepoints:");
        C0551a c0551aM1632b2 = m1632b();
        int iM610a2 = c0551aM1632b2.m610a(16);
        if (iM610a2 != 0) {
            int i3 = iM610a2 + c0551aM1632b2.f803a;
            i2 = ((ByteBuffer) c0551aM1632b2.f806d).getInt(((ByteBuffer) c0551aM1632b2.f806d).getInt(i3) + i3);
        } else {
            i2 = 0;
        }
        for (int i4 = 0; i4 < i2; i4++) {
            sb.append(Integer.toHexString(m1631a(i4)));
            sb.append(" ");
        }
        return sb.toString();
    }
}
