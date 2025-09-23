package p108k;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: k.b */
/* loaded from: classes.dex */
public final class ThreadFactoryC1182b implements ThreadFactory {

    /* renamed from: a */
    public final AtomicInteger f4805a = new AtomicInteger(0);

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread thread = new Thread(runnable);
        thread.setName("arch_disk_io_" + this.f4805a.getAndIncrement());
        return thread;
    }
}
