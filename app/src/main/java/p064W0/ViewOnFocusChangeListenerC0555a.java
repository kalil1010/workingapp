package p064W0;

import android.view.View;

/* renamed from: W0.a */
/* loaded from: classes.dex */
public final /* synthetic */ class ViewOnFocusChangeListenerC0555a implements View.OnFocusChangeListener {

    /* renamed from: a */
    public final /* synthetic */ int f1736a;

    /* renamed from: b */
    public final /* synthetic */ AbstractC0570p f1737b;

    public /* synthetic */ ViewOnFocusChangeListenerC0555a(AbstractC0570p abstractC0570p, int i2) {
        this.f1736a = i2;
        this.f1737b = abstractC0570p;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z2) {
        switch (this.f1736a) {
            case 0:
                C0558d c0558d = (C0558d) this.f1737b;
                c0558d.m1343t(c0558d.m1344u());
                break;
            default:
                C0564j c0564j = (C0564j) this.f1737b;
                c0564j.f1764l = z2;
                c0564j.m1374q();
                if (!z2) {
                    c0564j.m1352t(false);
                    c0564j.f1765m = false;
                    break;
                }
                break;
        }
    }
}
