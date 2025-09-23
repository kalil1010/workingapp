package p105j;

import android.view.MenuItem;
import androidx.appcompat.widget.Toolbar;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import p006C.AbstractC0075g;
import p102i.InterfaceC1004j;
import p102i.MenuC1006l;

/* renamed from: j.f1 */
/* loaded from: classes.dex */
public final class C1091f1 implements InterfaceC1113n, InterfaceC1004j {

    /* renamed from: a */
    public final /* synthetic */ Toolbar f4506a;

    public /* synthetic */ C1091f1(Toolbar toolbar) {
        this.f4506a = toolbar;
    }

    @Override // p102i.InterfaceC1004j
    /* renamed from: c */
    public void mo1073c(MenuC1006l menuC1006l) {
        Toolbar toolbar = this.f4506a;
        C1104k c1104k = toolbar.f2217a.f2136t;
        if (c1104k == null || !c1104k.m2726i()) {
            Iterator it = ((CopyOnWriteArrayList) toolbar.f2206G.f46b).iterator();
            if (it.hasNext()) {
                throw AbstractC0075g.m235d(it);
            }
        }
    }

    @Override // p102i.InterfaceC1004j
    /* renamed from: h */
    public boolean mo1074h(MenuC1006l menuC1006l, MenuItem menuItem) {
        this.f4506a.getClass();
        return false;
    }
}
