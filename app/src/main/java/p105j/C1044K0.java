package p105j;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;
import p102i.C1003i;
import p102i.C1008n;
import p102i.MenuC1006l;

/* renamed from: j.K0 */
/* loaded from: classes.dex */
public final class C1044K0 extends C1135u0 {

    /* renamed from: m */
    public final int f4385m;

    /* renamed from: n */
    public final int f4386n;

    /* renamed from: o */
    public InterfaceC1036G0 f4387o;

    /* renamed from: p */
    public C1008n f4388p;

    public C1044K0(Context context, boolean z2) {
        super(context, z2);
        if (1 == AbstractC1042J0.m2643a(context.getResources().getConfiguration())) {
            this.f4385m = 21;
            this.f4386n = 22;
        } else {
            this.f4385m = 22;
            this.f4386n = 21;
        }
    }

    @Override // p105j.C1135u0, android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        C1003i c1003i;
        int headersCount;
        int iPointToPosition;
        int i2;
        if (this.f4387o != null) {
            ListAdapter adapter = getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                headersCount = headerViewListAdapter.getHeadersCount();
                c1003i = (C1003i) headerViewListAdapter.getWrappedAdapter();
            } else {
                c1003i = (C1003i) adapter;
                headersCount = 0;
            }
            C1008n c1008nM2569b = (motionEvent.getAction() == 10 || (iPointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) == -1 || (i2 = iPointToPosition - headersCount) < 0 || i2 >= c1003i.getCount()) ? null : c1003i.getItem(i2);
            C1008n c1008n = this.f4388p;
            if (c1008n != c1008nM2569b) {
                MenuC1006l menuC1006l = c1003i.f4244a;
                if (c1008n != null) {
                    this.f4387o.mo1985k(menuC1006l, c1008n);
                }
                this.f4388p = c1008nM2569b;
                if (c1008nM2569b != null) {
                    this.f4387o.mo1983g(menuC1006l, c1008nM2569b);
                }
            }
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i2, KeyEvent keyEvent) {
        ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
        if (listMenuItemView != null && i2 == this.f4385m) {
            if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
            }
            return true;
        }
        if (listMenuItemView == null || i2 != this.f4386n) {
            return super.onKeyDown(i2, keyEvent);
        }
        setSelection(-1);
        ListAdapter adapter = getAdapter();
        (adapter instanceof HeaderViewListAdapter ? (C1003i) ((HeaderViewListAdapter) adapter).getWrappedAdapter() : (C1003i) adapter).f4244a.m2572c(false);
        return true;
    }

    public void setHoverListener(InterfaceC1036G0 interfaceC1036G0) {
        this.f4387o = interfaceC1036G0;
    }

    @Override // p105j.C1135u0, android.widget.AbsListView
    public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
        super.setSelector(drawable);
    }
}
