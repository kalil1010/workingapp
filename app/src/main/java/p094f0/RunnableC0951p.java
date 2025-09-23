package p094f0;

import android.os.Trace;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import p017G.AbstractC0160i;
import p035M0.C0369B;

/* renamed from: f0.p */
/* loaded from: classes.dex */
public final class RunnableC0951p implements Runnable {

    /* renamed from: e */
    public static final ThreadLocal f3972e = new ThreadLocal();

    /* renamed from: f */
    public static final C0369B f3973f = new C0369B(2);

    /* renamed from: a */
    public ArrayList f3974a;

    /* renamed from: b */
    public long f3975b;

    /* renamed from: c */
    public long f3976c;

    /* renamed from: d */
    public ArrayList f3977d;

    /* renamed from: c */
    public static AbstractC0926Z m2455c(RecyclerView recyclerView, int i2, long j2) {
        int iM106H = recyclerView.f2811e.m106H();
        for (int i3 = 0; i3 < iM106H; i3++) {
            AbstractC0926Z abstractC0926ZM1876I = RecyclerView.m1876I(recyclerView.f2811e.m105G(i3));
            if (abstractC0926ZM1876I.f3817c == i2 && !abstractC0926ZM1876I.m2399f()) {
                return null;
            }
        }
        C0917P c0917p = recyclerView.f2805b;
        try {
            recyclerView.m1896Q();
            AbstractC0926Z abstractC0926ZM2386i = c0917p.m2386i(i2, j2);
            if (abstractC0926ZM2386i != null) {
                if (!abstractC0926ZM2386i.m2398e() || abstractC0926ZM2386i.m2399f()) {
                    c0917p.m2378a(abstractC0926ZM2386i, false);
                } else {
                    c0917p.m2383f(abstractC0926ZM2386i.f3815a);
                }
            }
            recyclerView.m1897R(false);
            return abstractC0926ZM2386i;
        } catch (Throwable th) {
            recyclerView.m1897R(false);
            throw th;
        }
    }

    /* renamed from: a */
    public final void m2456a(RecyclerView recyclerView, int i2, int i3) {
        if (recyclerView.f2835q && this.f3975b == 0) {
            this.f3975b = recyclerView.getNanoTime();
            recyclerView.post(this);
        }
        C0949n c0949n = recyclerView.f2810d0;
        c0949n.f3963a = i2;
        c0949n.f3964b = i3;
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00c8  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m2457b(long r17) {
        /*
            Method dump skipped, instructions count: 326
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p094f0.RunnableC0951p.m2457b(long):void");
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            int i2 = AbstractC0160i.f538a;
            Trace.beginSection("RV Prefetch");
            ArrayList arrayList = this.f3974a;
            if (arrayList.isEmpty()) {
                this.f3975b = 0L;
                Trace.endSection();
                return;
            }
            int size = arrayList.size();
            long jMax = 0;
            for (int i3 = 0; i3 < size; i3++) {
                RecyclerView recyclerView = (RecyclerView) arrayList.get(i3);
                if (recyclerView.getWindowVisibility() == 0) {
                    jMax = Math.max(recyclerView.getDrawingTime(), jMax);
                }
            }
            if (jMax == 0) {
                this.f3975b = 0L;
                Trace.endSection();
            } else {
                m2457b(TimeUnit.MILLISECONDS.toNanos(jMax) + this.f3976c);
                this.f3975b = 0L;
                Trace.endSection();
            }
        } catch (Throwable th) {
            this.f3975b = 0L;
            int i4 = AbstractC0160i.f538a;
            Trace.endSection();
            throw th;
        }
    }
}
