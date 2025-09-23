package com.google.android.material.datepicker;

import android.graphics.Canvas;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import p094f0.AbstractC0908G;

/* renamed from: com.google.android.material.datepicker.h */
/* loaded from: classes.dex */
public final class C0816h extends AbstractC0908G {

    /* renamed from: a */
    public final /* synthetic */ C0818j f3181a;

    public C0816h(C0818j c0818j) {
        this.f3181a = c0818j;
        AbstractC0830v.m2099c(null);
        AbstractC0830v.m2099c(null);
    }

    @Override // p094f0.AbstractC0908G
    /* renamed from: b */
    public final void mo2082b(Canvas canvas, RecyclerView recyclerView) {
        if ((recyclerView.getAdapter() instanceof C0832x) && (recyclerView.getLayoutManager() instanceof GridLayoutManager)) {
            this.f3181a.getClass();
            throw null;
        }
    }
}
