package p020H;

import androidx.emoji2.text.AbstractC0669h;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.datepicker.C0818j;
import java.util.ArrayList;
import java.util.List;
import p001A0.C0004c;
import p003B.AbstractC0046b;
import p033L1.AbstractC0364l;
import p094f0.AbstractC0911J;

/* renamed from: H.a */
/* loaded from: classes.dex */
public final class RunnableC0171a implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f628a;

    /* renamed from: b */
    public final int f629b;

    /* renamed from: c */
    public final Object f630c;

    public /* synthetic */ RunnableC0171a(Object obj, int i2, int i3) {
        this.f628a = i3;
        this.f630c = obj;
        this.f629b = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AbstractC0911J abstractC0911J;
        switch (this.f628a) {
            case 0:
                AbstractC0046b abstractC0046b = (AbstractC0046b) ((C0004c) this.f630c).f7b;
                if (abstractC0046b != null) {
                    abstractC0046b.mo172g(this.f629b);
                    break;
                }
                break;
            case 1:
                ArrayList arrayList = (ArrayList) this.f630c;
                int size = arrayList.size();
                int i2 = 0;
                if (this.f629b == 1) {
                    while (i2 < size) {
                        ((AbstractC0669h) arrayList.get(i2)).mo1397a();
                        i2++;
                    }
                    break;
                } else {
                    while (i2 < size) {
                        ((AbstractC0669h) arrayList.get(i2)).getClass();
                        i2++;
                    }
                    break;
                }
            default:
                RecyclerView recyclerView = ((C0818j) this.f630c).f3191Y;
                if (!recyclerView.f2844v && (abstractC0911J = recyclerView.f2827m) != null) {
                    abstractC0911J.mo1874x0(recyclerView, this.f629b);
                    break;
                }
                break;
        }
    }

    public RunnableC0171a(List list, int i2, Throwable th) {
        this.f628a = 1;
        AbstractC0364l.m1010q(list, "initCallbacks cannot be null");
        this.f630c = new ArrayList(list);
        this.f629b = i2;
    }
}
