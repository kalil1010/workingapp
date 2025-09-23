package p064W0;

import android.text.Editable;
import p035M0.AbstractC0397z;

/* renamed from: W0.k */
/* loaded from: classes.dex */
public final class C0565k extends AbstractC0397z {

    /* renamed from: a */
    public final /* synthetic */ C0569o f1771a;

    public C0565k(C0569o c0569o) {
        this.f1771a = c0569o;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        this.f1771a.m1359b().mo1333a();
    }

    @Override // p035M0.AbstractC0397z, android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        this.f1771a.m1359b().mo1372b();
    }
}
