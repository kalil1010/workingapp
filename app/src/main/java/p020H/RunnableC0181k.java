package p020H;

import android.animation.ValueAnimator;
import android.os.Handler;
import android.view.View;
import androidx.fragment.app.C0696N;
import androidx.fragment.app.C0705h;
import java.util.ArrayList;
import p001A0.RunnableC0005d;
import p002A1.C0019a;
import p006C.AbstractC0075g;
import p028K.C0258d0;
import p028K.C0266h0;

/* renamed from: H.k */
/* loaded from: classes.dex */
public final class RunnableC0181k implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f651a = 0;

    /* renamed from: b */
    public Object f652b;

    /* renamed from: c */
    public Object f653c;

    /* renamed from: d */
    public Object f654d;

    public /* synthetic */ RunnableC0181k() {
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object objCall;
        switch (this.f651a) {
            case 0:
                try {
                    objCall = ((CallableC0174d) this.f652b).call();
                } catch (Exception unused) {
                    objCall = null;
                }
                ((Handler) this.f654d).post(new RunnableC0005d((C0175e) this.f653c, 6, objCall));
                break;
            case 1:
                C0258d0.m737h((View) this.f652b, (C0019a) this.f653c);
                ((ValueAnimator) this.f654d).start();
                break;
            default:
                ArrayList arrayList = (ArrayList) this.f652b;
                C0696N c0696n = (C0696N) this.f653c;
                if (arrayList.contains(c0696n)) {
                    arrayList.remove(c0696n);
                    ((C0705h) this.f654d).getClass();
                    AbstractC0075g.m232a(c0696n.f2526c.f2616E, c0696n.f2524a);
                    break;
                }
                break;
        }
    }

    public RunnableC0181k(C0705h c0705h, ArrayList arrayList, C0696N c0696n) {
        this.f654d = c0705h;
        this.f652b = arrayList;
        this.f653c = c0696n;
    }

    public RunnableC0181k(View view, C0266h0 c0266h0, C0019a c0019a, ValueAnimator valueAnimator) {
        this.f652b = view;
        this.f653c = c0019a;
        this.f654d = valueAnimator;
    }
}
