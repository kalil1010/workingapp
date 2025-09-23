package p087d0;

import android.content.Context;

/* renamed from: d0.g */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0850g implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f3507a;

    /* renamed from: b */
    public final /* synthetic */ Context f3508b;

    public /* synthetic */ RunnableC0850g(Context context, int i2) {
        this.f3507a = i2;
        this.f3508b = context;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0072  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() throws android.content.pm.PackageManager.NameNotFoundException, java.io.IOException {
        /*
            r11 = this;
            int r0 = r11.f3507a
            switch(r0) {
                case 0: goto L9b;
                case 1: goto L8d;
                default: goto L5;
            }
        L5:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 33
            r2 = 1
            if (r0 < r1) goto L8a
            android.content.ComponentName r0 = new android.content.ComponentName
            android.content.Context r1 = r11.f3508b
            java.lang.String r3 = "androidx.appcompat.app.AppLocalesMetadataHolderService"
            r0.<init>(r1, r3)
            android.content.pm.PackageManager r3 = r1.getPackageManager()
            int r3 = r3.getComponentEnabledSetting(r0)
            if (r3 == r2) goto L8a
            boolean r3 = p017G.AbstractC0153b.m418a()
            java.lang.String r4 = "locale"
            if (r3 == 0) goto L61
            o.c r3 = p090e.AbstractC0878k.f3619g
            java.util.Iterator r3 = r3.iterator()
        L2d:
            r5 = r3
            o.g r5 = (p119o.C1245g) r5
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L4f
            java.lang.Object r5 = r5.next()
            java.lang.ref.WeakReference r5 = (java.lang.ref.WeakReference) r5
            java.lang.Object r5 = r5.get()
            e.k r5 = (p090e.AbstractC0878k) r5
            if (r5 == 0) goto L2d
            e.u r5 = (p090e.LayoutInflaterFactory2C0888u) r5
            android.content.Context r5 = r5.f3691k
            if (r5 == 0) goto L2d
            java.lang.Object r3 = r5.getSystemService(r4)
            goto L50
        L4f:
            r3 = 0
        L50:
            if (r3 == 0) goto L66
            android.os.LocaleList r3 = p090e.AbstractC0877j.m2225a(r3)
            G.g r5 = new G.g
            G.h r6 = new G.h
            r6.<init>(r3)
            r5.<init>(r6)
            goto L68
        L61:
            G.g r5 = p090e.AbstractC0878k.f3615c
            if (r5 == 0) goto L66
            goto L68
        L66:
            G.g r5 = p017G.C0158g.f535b
        L68:
            G.h r3 = r5.f536a
            android.os.LocaleList r3 = r3.f537a
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L83
            java.lang.String r3 = p093e2.AbstractC0901d.m2301i0(r1)
            java.lang.Object r4 = r1.getSystemService(r4)
            if (r4 == 0) goto L83
            android.os.LocaleList r3 = p090e.AbstractC0876i.m2224a(r3)
            p090e.AbstractC0877j.m2226b(r4, r3)
        L83:
            android.content.pm.PackageManager r1 = r1.getPackageManager()
            r1.setComponentEnabledSetting(r0, r2, r2)
        L8a:
            p090e.AbstractC0878k.f3618f = r2
            return
        L8d:
            d0.d r0 = new d0.d
            r0.<init>()
            b1.e r1 = p087d0.AbstractC0849f.f3497a
            r2 = 0
            android.content.Context r3 = r11.f3508b
            p087d0.AbstractC0849f.m2168s(r3, r0, r1, r2)
            return
        L9b:
            java.util.concurrent.ThreadPoolExecutor r4 = new java.util.concurrent.ThreadPoolExecutor
            java.util.concurrent.TimeUnit r9 = java.util.concurrent.TimeUnit.MILLISECONDS
            java.util.concurrent.LinkedBlockingQueue r10 = new java.util.concurrent.LinkedBlockingQueue
            r10.<init>()
            r6 = 1
            r7 = 0
            r5 = 0
            r4.<init>(r5, r6, r7, r9, r10)
            d0.g r0 = new d0.g
            android.content.Context r1 = r11.f3508b
            r2 = 1
            r0.<init>(r1, r2)
            r4.execute(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p087d0.RunnableC0850g.run():void");
    }
}
