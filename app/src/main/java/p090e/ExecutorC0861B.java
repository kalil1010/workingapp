package p090e;

import java.util.concurrent.Executor;

/* renamed from: e.B */
/* loaded from: classes.dex */
public final class ExecutorC0861B implements Executor {
    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        new Thread(runnable).start();
    }
}
