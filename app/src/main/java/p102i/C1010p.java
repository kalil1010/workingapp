package p102i;

import android.view.CollapsibleActionView;
import android.view.View;
import android.widget.FrameLayout;
import p099h.InterfaceC0972b;

/* renamed from: i.p */
/* loaded from: classes.dex */
public final class C1010p extends FrameLayout implements InterfaceC0972b {

    /* renamed from: a */
    public final CollapsibleActionView f4310a;

    /* JADX WARN: Multi-variable type inference failed */
    public C1010p(View view) {
        super(view.getContext());
        this.f4310a = (CollapsibleActionView) view;
        addView(view);
    }

    @Override // p099h.InterfaceC0972b
    /* renamed from: a */
    public final void mo1499a() {
        this.f4310a.onActionViewExpanded();
    }

    @Override // p099h.InterfaceC0972b
    /* renamed from: d */
    public final void mo1500d() {
        this.f4310a.onActionViewCollapsed();
    }
}
