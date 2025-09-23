package p020H;

import java.util.concurrent.ThreadFactory;

/* renamed from: H.j */
/* loaded from: classes.dex */
public final class ThreadFactoryC0180j implements ThreadFactory {
    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        return new C0179i(runnable);
    }
}
