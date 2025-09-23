package com.google.android.material.internal;

import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import p102i.InterfaceC0990A;
import p102i.MenuC1006l;

/* loaded from: classes.dex */
public class NavigationMenuView extends RecyclerView implements InterfaceC0990A {
    public NavigationMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        setLayoutManager(new LinearLayoutManager(1));
    }

    @Override // p102i.InterfaceC0990A
    /* renamed from: b */
    public final void mo1475b(MenuC1006l menuC1006l) {
    }

    public int getWindowAnimations() {
        return 0;
    }
}
