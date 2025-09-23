package p105j;

import android.view.View;
import android.widget.AdapterView;
import androidx.appcompat.widget.SearchView;

/* renamed from: j.A0 */
/* loaded from: classes.dex */
public final class C1024A0 implements AdapterView.OnItemSelectedListener {

    /* renamed from: a */
    public final /* synthetic */ int f4334a;

    /* renamed from: b */
    public final /* synthetic */ Object f4335b;

    public /* synthetic */ C1024A0(int i2, Object obj) {
        this.f4334a = i2;
        this.f4335b = obj;
    }

    /* renamed from: a */
    private final void m2612a(AdapterView adapterView) {
    }

    /* renamed from: b */
    private final void m2613b(AdapterView adapterView) {
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i2, long j2) {
        C1135u0 c1135u0;
        switch (this.f4334a) {
            case 0:
                if (i2 != -1 && (c1135u0 = ((C1034F0) this.f4335b).f4353c) != null) {
                    c1135u0.setListSelectionHidden(false);
                    break;
                }
                break;
            default:
                ((SearchView) this.f4335b).m1506q(i2);
                break;
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
        int i2 = this.f4334a;
    }
}
