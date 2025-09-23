package p050R1;

import p033L1.AbstractC0364l;

/* renamed from: R1.b */
/* loaded from: classes.dex */
public final class C0474b extends Thread {
    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        C0477e c0477eM1002i;
        while (true) {
            try {
                synchronized (C0477e.class) {
                    C0477e c0477e = C0477e.f1468j;
                    c0477eM1002i = AbstractC0364l.m1002i();
                    if (c0477eM1002i == C0477e.f1468j) {
                        C0477e.f1468j = null;
                        return;
                    }
                }
                if (c0477eM1002i != null) {
                    c0477eM1002i.mo492k();
                }
            } catch (InterruptedException unused) {
            }
        }
    }
}
