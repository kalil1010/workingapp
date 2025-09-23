package androidx.emoji2.text;

import java.util.ArrayList;
import p002A1.C0019a;
import p011D1.C0121k;
import p020H.RunnableC0171a;
import p033L1.AbstractC0364l;
import p055T0.C0511e;

/* renamed from: androidx.emoji2.text.e */
/* loaded from: classes.dex */
public final class C0666e extends AbstractC0364l {

    /* renamed from: f */
    public final /* synthetic */ C0667f f2386f;

    public C0666e(C0667f c0667f) {
        this.f2386f = c0667f;
    }

    @Override // p033L1.AbstractC0364l
    /* renamed from: U */
    public final void mo1020U(Throwable th) {
        this.f2386f.f2387a.m1628d(th);
    }

    @Override // p033L1.AbstractC0364l
    /* renamed from: X */
    public final void mo1023X(C0121k c0121k) {
        C0667f c0667f = this.f2386f;
        c0667f.f2389c = c0121k;
        c0667f.f2388b = new C0019a(c0667f.f2389c, new C0511e(15), c0667f.f2387a.f2402h);
        C0671j c0671j = c0667f.f2387a;
        c0671j.getClass();
        ArrayList arrayList = new ArrayList();
        c0671j.f2395a.writeLock().lock();
        try {
            c0671j.f2397c = 1;
            arrayList.addAll(c0671j.f2396b);
            c0671j.f2396b.clear();
            c0671j.f2395a.writeLock().unlock();
            c0671j.f2398d.post(new RunnableC0171a(arrayList, c0671j.f2397c, (Throwable) null));
        } catch (Throwable th) {
            c0671j.f2395a.writeLock().unlock();
            throw th;
        }
    }
}
