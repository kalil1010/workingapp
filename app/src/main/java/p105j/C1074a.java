package p105j;

import androidx.appcompat.widget.ActionBarContextView;
import p028K.InterfaceC0249Y;

/* renamed from: j.a */
/* loaded from: classes.dex */
public final class C1074a implements InterfaceC0249Y {

    /* renamed from: a */
    public boolean f4463a = false;

    /* renamed from: b */
    public int f4464b;

    /* renamed from: c */
    public final /* synthetic */ ActionBarContextView f4465c;

    public C1074a(ActionBarContextView actionBarContextView) {
        this.f4465c = actionBarContextView;
    }

    @Override // p028K.InterfaceC0249Y
    /* renamed from: a */
    public final void mo722a() {
        if (this.f4463a) {
            return;
        }
        ActionBarContextView actionBarContextView = this.f4465c;
        actionBarContextView.f2089f = null;
        super/*android.view.View*/.setVisibility(this.f4464b);
    }

    @Override // p028K.InterfaceC0249Y
    /* renamed from: d */
    public final void mo723d() {
        this.f4463a = true;
    }

    @Override // p028K.InterfaceC0249Y
    /* renamed from: g */
    public final void mo724g() {
        super/*android.view.View*/.setVisibility(0);
        this.f4463a = false;
    }
}
