package androidx.emoji2.text;

import android.util.SparseArray;
import java.nio.ByteBuffer;
import p063W.C0551a;

/* renamed from: androidx.emoji2.text.m */
/* loaded from: classes.dex */
public final class C0674m {

    /* renamed from: a */
    public int f2409a = 1;

    /* renamed from: b */
    public final C0677p f2410b;

    /* renamed from: c */
    public C0677p f2411c;

    /* renamed from: d */
    public C0677p f2412d;

    /* renamed from: e */
    public int f2413e;

    /* renamed from: f */
    public int f2414f;

    public C0674m(C0677p c0677p) {
        this.f2410b = c0677p;
        this.f2411c = c0677p;
    }

    /* renamed from: a */
    public final int m1633a(int i2) {
        SparseArray sparseArray = this.f2411c.f2424a;
        C0677p c0677p = sparseArray == null ? null : (C0677p) sparseArray.get(i2);
        int i3 = 1;
        int i4 = 2;
        if (this.f2409a == 2) {
            if (c0677p != null) {
                this.f2411c = c0677p;
                this.f2414f++;
            } else if (i2 == 65038) {
                m1634b();
            } else if (i2 != 65039) {
                C0677p c0677p2 = this.f2411c;
                if (c0677p2.f2425b != null) {
                    i4 = 3;
                    if (this.f2414f != 1) {
                        this.f2412d = c0677p2;
                        m1634b();
                    } else if (m1635c()) {
                        this.f2412d = this.f2411c;
                        m1634b();
                    } else {
                        m1634b();
                    }
                } else {
                    m1634b();
                }
            }
            i3 = i4;
        } else if (c0677p == null) {
            m1634b();
        } else {
            this.f2409a = 2;
            this.f2411c = c0677p;
            this.f2414f = 1;
            i3 = i4;
        }
        this.f2413e = i2;
        return i3;
    }

    /* renamed from: b */
    public final void m1634b() {
        this.f2409a = 1;
        this.f2411c = this.f2410b;
        this.f2414f = 0;
    }

    /* renamed from: c */
    public final boolean m1635c() {
        C0551a c0551aM1632b = this.f2411c.f2425b.m1632b();
        int iM610a = c0551aM1632b.m610a(6);
        return !(iM610a == 0 || ((ByteBuffer) c0551aM1632b.f806d).get(iM610a + c0551aM1632b.f803a) == 0) || this.f2413e == 65039;
    }
}
