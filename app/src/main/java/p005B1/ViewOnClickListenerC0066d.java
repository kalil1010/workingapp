package p005B1;

import android.view.View;
import android.widget.Button;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;
import com.google.android.material.datepicker.C0818j;
import com.google.android.material.internal.NavigationMenuItemView;
import nfc.share.nfcshare.MainActivity;
import p002A1.AbstractC0018M;
import p002A1.AbstractC0020b;
import p002A1.C0016K;
import p002A1.C0038t;
import p002A1.C0039u;
import p035M0.C0380i;
import p035M0.C0388q;
import p073Z0.C0608d;
import p090e.C0872e;
import p099h.AbstractC0971a;
import p102i.C1008n;
import p105j.C1097h1;

/* renamed from: B1.d */
/* loaded from: classes.dex */
public final class ViewOnClickListenerC0066d implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ int f160a;

    /* renamed from: b */
    public final /* synthetic */ Object f161b;

    public /* synthetic */ ViewOnClickListenerC0066d(int i2, Object obj) {
        this.f160a = i2;
        this.f161b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        boolean z2 = true;
        Object obj = this.f161b;
        switch (this.f160a) {
            case 0:
                C0038t c0038t = C0068f.f166f;
                if (c0038t != null) {
                    C0016K c0016k = (C0016K) obj;
                    String strM44a = c0016k.m44a();
                    MainActivity mainActivity = c0038t.f81a;
                    mainActivity.f5000a0 = strM44a;
                    AbstractC0020b.m96j(mainActivity, c0016k.m44a());
                    AbstractC0020b.m94h(mainActivity, c0016k.f34f);
                    AbstractC0020b.m95i(mainActivity, c0016k.f32d);
                    C0608d c0608d = AbstractC0018M.f35a;
                    C0068f c0068f = mainActivity.f5001b0;
                    c0068f.f169e = mainActivity.f5000a0;
                    c0068f.f3738a.m2332b();
                    break;
                }
                break;
            case 1:
                NavigationMenuItemView navigationMenuItemView = (NavigationMenuItemView) view;
                C0388q c0388q = (C0388q) obj;
                C0380i c0380i = c0388q.f1227e;
                if (c0380i != null) {
                    c0380i.f1213e = true;
                }
                C1008n itemData = navigationMenuItemView.getItemData();
                boolean zM2577q = c0388q.f1225c.m2577q(itemData, c0388q, 0);
                if (itemData != null && itemData.isCheckable() && zM2577q) {
                    c0388q.f1227e.m1061h(itemData);
                } else {
                    z2 = false;
                }
                C0380i c0380i2 = c0388q.f1227e;
                if (c0380i2 != null) {
                    c0380i2.f1213e = false;
                }
                if (z2) {
                    c0388q.mo1064d();
                    break;
                }
                break;
            case 2:
                C0818j c0818j = (C0818j) obj;
                int i2 = c0818j.f3188V;
                if (i2 != 2) {
                    if (i2 == 1) {
                        c0818j.m2085A(2);
                        break;
                    }
                } else {
                    c0818j.m2085A(1);
                    break;
                }
                break;
            case 3:
                C0039u c0039u = (C0039u) obj;
                if (c0039u.f86e) {
                    DrawerLayout drawerLayout = c0039u.f83b;
                    int iM1596i = drawerLayout.m1596i(8388611);
                    View viewM1593f = drawerLayout.m1593f(8388611);
                    if ((viewM1593f != null ? DrawerLayout.m1587q(viewM1593f) : false) && iM1596i != 2) {
                        drawerLayout.m1591d();
                        break;
                    } else if (iM1596i != 1) {
                        drawerLayout.m1600s();
                        break;
                    }
                }
                break;
            case 4:
                C0872e c0872e = (C0872e) obj;
                Button button = c0872e.f3583f;
                c0872e.f3599v.obtainMessage(1, c0872e.f3579b).sendToTarget();
                break;
            case 5:
                ((AbstractC0971a) obj).mo2185a();
                break;
            default:
                C1097h1 c1097h1 = ((Toolbar) obj).f2211L;
                C1008n c1008n = c1097h1 == null ? null : c1097h1.f4511b;
                if (c1008n != null) {
                    c1008n.collapseActionView();
                    break;
                }
                break;
        }
    }
}
