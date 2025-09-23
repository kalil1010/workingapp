package p002A1;

import android.os.Trace;
import androidx.emoji2.text.C0671j;
import p017G.AbstractC0160i;

/* renamed from: A1.v */
/* loaded from: classes.dex */
public final class RunnableC0040v implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f91a;

    public /* synthetic */ RunnableC0040v(int i2) {
        this.f91a = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f91a) {
            case 0:
                AbstractC0018M.f36b.m137u();
                return;
            default:
                try {
                    int i2 = AbstractC0160i.f538a;
                    Trace.beginSection("EmojiCompat.EmojiCompatInitializer.run");
                    if (C0671j.f2394j != null) {
                        C0671j.m1625a().m1627c();
                    }
                    Trace.endSection();
                    return;
                } catch (Throwable th) {
                    int i3 = AbstractC0160i.f538a;
                    Trace.endSection();
                    throw th;
                }
        }
    }
}
