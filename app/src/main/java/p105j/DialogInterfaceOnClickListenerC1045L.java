package p105j;

import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.widget.ListAdapter;
import androidx.appcompat.app.AlertController$RecycleListView;
import p007C0.C0088f;
import p090e.C0870c;
import p090e.DialogC0873f;

/* renamed from: j.L */
/* loaded from: classes.dex */
public final class DialogInterfaceOnClickListenerC1045L implements InterfaceC1055Q, DialogInterface.OnClickListener {

    /* renamed from: a */
    public DialogC0873f f4389a;

    /* renamed from: b */
    public C1047M f4390b;

    /* renamed from: c */
    public CharSequence f4391c;

    /* renamed from: d */
    public final /* synthetic */ C1058S f4392d;

    public DialogInterfaceOnClickListenerC1045L(C1058S c1058s) {
        this.f4392d = c1058s;
    }

    @Override // p105j.InterfaceC1055Q
    /* renamed from: a */
    public final CharSequence mo2645a() {
        return this.f4391c;
    }

    @Override // p105j.InterfaceC1055Q
    /* renamed from: b */
    public final boolean mo2646b() {
        DialogC0873f dialogC0873f = this.f4389a;
        if (dialogC0873f != null) {
            return dialogC0873f.isShowing();
        }
        return false;
    }

    @Override // p105j.InterfaceC1055Q
    /* renamed from: c */
    public final void mo2647c(int i2) {
    }

    @Override // p105j.InterfaceC1055Q
    /* renamed from: d */
    public final int mo2648d() {
        return 0;
    }

    @Override // p105j.InterfaceC1055Q
    public final void dismiss() {
        DialogC0873f dialogC0873f = this.f4389a;
        if (dialogC0873f != null) {
            dialogC0873f.dismiss();
            this.f4389a = null;
        }
    }

    @Override // p105j.InterfaceC1055Q
    /* renamed from: e */
    public final void mo2649e(int i2, int i3) {
        if (this.f4390b == null) {
            return;
        }
        C1058S c1058s = this.f4392d;
        C0088f c0088f = new C0088f(c1058s.getPopupContext());
        CharSequence charSequence = this.f4391c;
        C0870c c0870c = (C0870c) c0088f.f208b;
        if (charSequence != null) {
            c0870c.f3571d = charSequence;
        }
        C1047M c1047m = this.f4390b;
        int selectedItemPosition = c1058s.getSelectedItemPosition();
        c0870c.f3574g = c1047m;
        c0870c.f3575h = this;
        c0870c.f3577j = selectedItemPosition;
        c0870c.f3576i = true;
        DialogC0873f dialogC0873fM281a = c0088f.m281a();
        this.f4389a = dialogC0873fM281a;
        AlertController$RecycleListView alertController$RecycleListView = dialogC0873fM281a.f3606f.f3582e;
        AbstractC1041J.m2642d(alertController$RecycleListView, i2);
        AbstractC1041J.m2641c(alertController$RecycleListView, i3);
        this.f4389a.show();
    }

    @Override // p105j.InterfaceC1055Q
    /* renamed from: h */
    public final void mo2650h(CharSequence charSequence) {
        this.f4391c = charSequence;
    }

    @Override // p105j.InterfaceC1055Q
    /* renamed from: j */
    public final int mo2651j() {
        return 0;
    }

    @Override // p105j.InterfaceC1055Q
    /* renamed from: l */
    public final void mo2652l(Drawable drawable) {
    }

    @Override // p105j.InterfaceC1055Q
    /* renamed from: m */
    public final void mo2653m(int i2) {
    }

    @Override // p105j.InterfaceC1055Q
    /* renamed from: n */
    public final Drawable mo2654n() {
        return null;
    }

    @Override // p105j.InterfaceC1055Q
    /* renamed from: o */
    public final void mo2630o(ListAdapter listAdapter) {
        this.f4390b = (C1047M) listAdapter;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i2) {
        C1058S c1058s = this.f4392d;
        c1058s.setSelection(i2);
        if (c1058s.getOnItemClickListener() != null) {
            c1058s.performItemClick(null, i2, this.f4390b.getItemId(i2));
        }
        dismiss();
    }

    @Override // p105j.InterfaceC1055Q
    /* renamed from: p */
    public final void mo2655p(int i2) {
    }
}
