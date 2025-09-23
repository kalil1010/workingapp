package androidx.emoji2.text;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import p020H.RunnableC0171a;
import p033L1.AbstractC0364l;
import p119o.C1241c;

/* renamed from: androidx.emoji2.text.j */
/* loaded from: classes.dex */
public final class C0671j {

    /* renamed from: i */
    public static final Object f2393i = new Object();

    /* renamed from: j */
    public static volatile C0671j f2394j;

    /* renamed from: a */
    public final ReentrantReadWriteLock f2395a;

    /* renamed from: b */
    public final C1241c f2396b;

    /* renamed from: c */
    public volatile int f2397c;

    /* renamed from: d */
    public final Handler f2398d;

    /* renamed from: e */
    public final C0667f f2399e;

    /* renamed from: f */
    public final InterfaceC0670i f2400f;

    /* renamed from: g */
    public final int f2401g;

    /* renamed from: h */
    public final C0665d f2402h;

    public C0671j(C0676o c0676o) {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.f2395a = reentrantReadWriteLock;
        this.f2397c = 3;
        InterfaceC0670i interfaceC0670i = (InterfaceC0670i) c0676o.f2391b;
        this.f2400f = interfaceC0670i;
        int i2 = c0676o.f2390a;
        this.f2401g = i2;
        this.f2402h = (C0665d) c0676o.f2392c;
        this.f2398d = new Handler(Looper.getMainLooper());
        this.f2396b = new C1241c();
        C0667f c0667f = new C0667f(this);
        this.f2399e = c0667f;
        reentrantReadWriteLock.writeLock().lock();
        if (i2 == 0) {
            try {
                this.f2397c = 0;
            } catch (Throwable th) {
                this.f2395a.writeLock().unlock();
                throw th;
            }
        }
        reentrantReadWriteLock.writeLock().unlock();
        if (m1626b() == 0) {
            try {
                interfaceC0670i.mo17d(new C0666e(c0667f));
            } catch (Throwable th2) {
                m1628d(th2);
            }
        }
    }

    /* renamed from: a */
    public static C0671j m1625a() {
        C0671j c0671j;
        synchronized (f2393i) {
            try {
                c0671j = f2394j;
                if (!(c0671j != null)) {
                    throw new IllegalStateException("EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK's manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message.");
                }
            } finally {
            }
        }
        return c0671j;
    }

    /* renamed from: b */
    public final int m1626b() {
        this.f2395a.readLock().lock();
        try {
            return this.f2397c;
        } finally {
            this.f2395a.readLock().unlock();
        }
    }

    /* renamed from: c */
    public final void m1627c() {
        if (!(this.f2401g == 1)) {
            throw new IllegalStateException("Set metadataLoadStrategy to LOAD_STRATEGY_MANUAL to execute manual loading");
        }
        if (m1626b() == 1) {
            return;
        }
        this.f2395a.writeLock().lock();
        try {
            if (this.f2397c == 0) {
                return;
            }
            this.f2397c = 0;
            this.f2395a.writeLock().unlock();
            C0667f c0667f = this.f2399e;
            C0671j c0671j = c0667f.f2387a;
            try {
                c0671j.f2400f.mo17d(new C0666e(c0667f));
            } catch (Throwable th) {
                c0671j.m1628d(th);
            }
        } finally {
            this.f2395a.writeLock().unlock();
        }
    }

    /* renamed from: d */
    public final void m1628d(Throwable th) {
        ArrayList arrayList = new ArrayList();
        this.f2395a.writeLock().lock();
        try {
            this.f2397c = 2;
            arrayList.addAll(this.f2396b);
            this.f2396b.clear();
            this.f2395a.writeLock().unlock();
            this.f2398d.post(new RunnableC0171a(arrayList, this.f2397c, th));
        } catch (Throwable th2) {
            this.f2395a.writeLock().unlock();
            throw th2;
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:61:0x00d7
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.checkLoopExits(LoopRegionMaker.java:225)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeLoopRegion(LoopRegionMaker.java:195)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:62)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:89)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeEndlessLoop(LoopRegionMaker.java:281)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:64)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:89)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:95)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:101)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:95)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:95)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:101)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:95)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:95)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:95)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:48)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0094 A[Catch: all -> 0x0076, TryCatch #0 {all -> 0x0076, blocks: (B:32:0x005a, B:35:0x005f, B:37:0x0063, B:39:0x0070, B:44:0x0083, B:46:0x008d, B:48:0x0090, B:50:0x0094, B:52:0x00a4, B:53:0x00a7, B:55:0x00b4, B:58:0x00bc, B:63:0x00db, B:69:0x00e7, B:72:0x00f3, B:73:0x00fd, B:74:0x010c, B:76:0x0113, B:77:0x0118, B:79:0x0123, B:81:0x012a, B:83:0x012e, B:85:0x0134, B:87:0x0138, B:90:0x0140, B:93:0x014c, B:94:0x0151, B:96:0x015f, B:42:0x0079), top: B:115:0x005a }] */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.CharSequence m1629e(java.lang.CharSequence r12, int r13, int r14) {
        /*
            Method dump skipped, instructions count: 406
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.emoji2.text.C0671j.m1629e(java.lang.CharSequence, int, int):java.lang.CharSequence");
    }

    /* renamed from: f */
    public final void m1630f(AbstractC0669h abstractC0669h) {
        AbstractC0364l.m1010q(abstractC0669h, "initCallback cannot be null");
        this.f2395a.writeLock().lock();
        try {
            if (this.f2397c == 1 || this.f2397c == 2) {
                this.f2398d.post(new RunnableC0171a(Arrays.asList(abstractC0669h), this.f2397c, (Throwable) null));
            } else {
                this.f2396b.add(abstractC0669h);
            }
            this.f2395a.writeLock().unlock();
        } catch (Throwable th) {
            this.f2395a.writeLock().unlock();
            throw th;
        }
    }
}
