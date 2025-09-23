package p122p;

import java.util.concurrent.CancellationException;

/* renamed from: p.a */
/* loaded from: classes.dex */
public final class C1257a {

    /* renamed from: b */
    public static final C1257a f5115b;

    /* renamed from: c */
    public static final C1257a f5116c;

    /* renamed from: a */
    public final CancellationException f5117a;

    static {
        if (AbstractFutureC1263g.f5128d) {
            f5116c = null;
            f5115b = null;
        } else {
            f5116c = new C1257a(false, null);
            f5115b = new C1257a(true, null);
        }
    }

    public C1257a(boolean z2, CancellationException cancellationException) {
        this.f5117a = cancellationException;
    }
}
