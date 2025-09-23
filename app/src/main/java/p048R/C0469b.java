package p048R;

import android.database.DataSetObserver;
import p105j.C1034F0;
import p105j.ViewOnClickListenerC1076a1;

/* renamed from: R.b */
/* loaded from: classes.dex */
public final class C0469b extends DataSetObserver {

    /* renamed from: a */
    public final /* synthetic */ int f1448a;

    /* renamed from: b */
    public final /* synthetic */ Object f1449b;

    public /* synthetic */ C0469b(int i2, Object obj) {
        this.f1448a = i2;
        this.f1449b = obj;
    }

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        switch (this.f1448a) {
            case 0:
                ViewOnClickListenerC1076a1 viewOnClickListenerC1076a1 = (ViewOnClickListenerC1076a1) this.f1449b;
                viewOnClickListenerC1076a1.f1450a = true;
                viewOnClickListenerC1076a1.notifyDataSetChanged();
                break;
            default:
                C1034F0 c1034f0 = (C1034F0) this.f1449b;
                if (c1034f0.f4376z.isShowing()) {
                    c1034f0.mo2543i();
                    break;
                }
                break;
        }
    }

    @Override // android.database.DataSetObserver
    public final void onInvalidated() {
        switch (this.f1448a) {
            case 0:
                ViewOnClickListenerC1076a1 viewOnClickListenerC1076a1 = (ViewOnClickListenerC1076a1) this.f1449b;
                viewOnClickListenerC1076a1.f1450a = false;
                viewOnClickListenerC1076a1.notifyDataSetInvalidated();
                break;
            default:
                ((C1034F0) this.f1449b).dismiss();
                break;
        }
    }
}
