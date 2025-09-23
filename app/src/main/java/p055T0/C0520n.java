package p055T0;

import android.graphics.Canvas;
import android.graphics.Matrix;
import java.util.ArrayList;
import java.util.Iterator;
import p052S0.C0499a;

/* renamed from: T0.n */
/* loaded from: classes.dex */
public final class C0520n extends AbstractC0526t {

    /* renamed from: c */
    public final /* synthetic */ ArrayList f1661c;

    /* renamed from: d */
    public final /* synthetic */ Matrix f1662d;

    public C0520n(ArrayList arrayList, Matrix matrix) {
        this.f1661c = arrayList;
        this.f1662d = matrix;
    }

    @Override // p055T0.AbstractC0526t
    /* renamed from: a */
    public final void mo1303a(Matrix matrix, C0499a c0499a, int i2, Canvas canvas) {
        Iterator it = this.f1661c.iterator();
        while (it.hasNext()) {
            ((AbstractC0526t) it.next()).mo1303a(this.f1662d, c0499a, i2, canvas);
        }
    }
}
