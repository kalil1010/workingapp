package androidx.emoji2.text;

import java.util.concurrent.ThreadPoolExecutor;
import p011D1.C0121k;
import p033L1.AbstractC0364l;

/* renamed from: androidx.emoji2.text.k */
/* loaded from: classes.dex */
public final class C0672k extends AbstractC0364l {

    /* renamed from: f */
    public final /* synthetic */ AbstractC0364l f2403f;

    /* renamed from: g */
    public final /* synthetic */ ThreadPoolExecutor f2404g;

    public C0672k(AbstractC0364l abstractC0364l, ThreadPoolExecutor threadPoolExecutor) {
        this.f2403f = abstractC0364l;
        this.f2404g = threadPoolExecutor;
    }

    @Override // p033L1.AbstractC0364l
    /* renamed from: U */
    public final void mo1020U(Throwable th) {
        ThreadPoolExecutor threadPoolExecutor = this.f2404g;
        try {
            this.f2403f.mo1020U(th);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }

    @Override // p033L1.AbstractC0364l
    /* renamed from: X */
    public final void mo1023X(C0121k c0121k) {
        ThreadPoolExecutor threadPoolExecutor = this.f2404g;
        try {
            this.f2403f.mo1023X(c0121k);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }
}
