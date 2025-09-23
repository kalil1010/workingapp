package p064W0;

import android.view.View;
import android.widget.AdapterView;
import androidx.appcompat.widget.SearchView;
import p105j.C1034F0;
import p105j.C1051O;
import p105j.C1058S;

/* renamed from: W0.t */
/* loaded from: classes.dex */
public final class C0574t implements AdapterView.OnItemClickListener {

    /* renamed from: a */
    public final /* synthetic */ int f1839a;

    /* renamed from: b */
    public final /* synthetic */ Object f1840b;

    public /* synthetic */ C0574t(int i2, Object obj) {
        this.f1839a = i2;
        this.f1840b = obj;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i2, long j2) {
        Object item;
        switch (this.f1839a) {
            case 0:
                C0576v c0576v = (C0576v) this.f1840b;
                if (i2 < 0) {
                    C1034F0 c1034f0 = c0576v.f1844e;
                    item = !c1034f0.f4376z.isShowing() ? null : c1034f0.f4353c.getSelectedItem();
                } else {
                    item = c0576v.getAdapter().getItem(i2);
                }
                C0576v.m1385a(c0576v, item);
                AdapterView.OnItemClickListener onItemClickListener = c0576v.getOnItemClickListener();
                C1034F0 c1034f02 = c0576v.f1844e;
                if (onItemClickListener != null) {
                    if (view == null || i2 < 0) {
                        view = c1034f02.f4376z.isShowing() ? c1034f02.f4353c.getSelectedView() : null;
                        i2 = !c1034f02.f4376z.isShowing() ? -1 : c1034f02.f4353c.getSelectedItemPosition();
                        j2 = !c1034f02.f4376z.isShowing() ? Long.MIN_VALUE : c1034f02.f4353c.getSelectedItemId();
                    }
                    onItemClickListener.onItemClick(c1034f02.f4353c, view, i2, j2);
                }
                c1034f02.dismiss();
                break;
            case 1:
                C1051O c1051o = (C1051O) this.f1840b;
                c1051o.f4411G.setSelection(i2);
                C1058S c1058s = c1051o.f4411G;
                if (c1058s.getOnItemClickListener() != null) {
                    c1058s.performItemClick(view, i2, c1051o.f4408D.getItemId(i2));
                }
                c1051o.dismiss();
                break;
            default:
                ((SearchView) this.f1840b).m1505p(i2);
                break;
        }
    }
}
