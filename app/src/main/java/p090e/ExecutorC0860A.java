package p090e;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import p002A1.RunnableC0026h;

/* renamed from: e.A */
/* loaded from: classes.dex */
public final class ExecutorC0860A implements Executor {

    /* renamed from: a */
    public final Object f3523a = new Object();

    /* renamed from: b */
    public final ArrayDeque f3524b = new ArrayDeque();

    /* renamed from: c */
    public final ExecutorC0861B f3525c;

    /* renamed from: d */
    public Runnable f3526d;

    public ExecutorC0860A(ExecutorC0861B executorC0861B) {
        this.f3525c = executorC0861B;
    }

    /* renamed from: a */
    public final void m2182a() {
        synchronized (this.f3523a) {
            try {
                Runnable runnable = (Runnable) this.f3524b.poll();
                this.f3526d = runnable;
                if (runnable != null) {
                    this.f3525c.execute(runnable);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        synchronized (this.f3523a) {
            try {
                this.f3524b.add(new RunnableC0026h(this, 4, runnable));
                if (this.f3526d == null) {
                    m2182a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
