package p014E1;

import java.util.concurrent.ThreadFactory;

/* renamed from: E1.a */
/* loaded from: classes.dex */
public final class ThreadFactoryC0144a implements ThreadFactory {

    /* renamed from: a */
    public final /* synthetic */ String f493a;

    /* renamed from: b */
    public final /* synthetic */ boolean f494b;

    public ThreadFactoryC0144a(String str, boolean z2) {
        this.f493a = str;
        this.f494b = z2;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread thread = new Thread(runnable, this.f493a);
        thread.setDaemon(this.f494b);
        return thread;
    }
}
