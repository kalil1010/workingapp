package com.google.android.material.datepicker;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import p094f0.C0923W;

/* renamed from: com.google.android.material.datepicker.g */
/* loaded from: classes.dex */
public final class C0815g extends LinearLayoutManager {

    /* renamed from: E */
    public final /* synthetic */ int f3179E;

    /* renamed from: F */
    public final /* synthetic */ C0818j f3180F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0815g(C0818j c0818j, int i2, int i3) {
        super(i2);
        this.f3180F = c0818j;
        this.f3179E = i3;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /* renamed from: A0 */
    public final void mo1833A0(C0923W c0923w, int[] iArr) {
        int i2 = this.f3179E;
        C0818j c0818j = this.f3180F;
        if (i2 == 0) {
            iArr[0] = c0818j.f3191Y.getWidth();
            iArr[1] = c0818j.f3191Y.getWidth();
        } else {
            iArr[0] = c0818j.f3191Y.getHeight();
            iArr[1] = c0818j.f3191Y.getHeight();
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, p094f0.AbstractC0911J
    /* renamed from: x0 */
    public final void mo1874x0(RecyclerView recyclerView, int i2) {
        C0828t c0828t = new C0828t(recyclerView.getContext());
        c0828t.f4013a = i2;
        m2376y0(c0828t);
    }
}
