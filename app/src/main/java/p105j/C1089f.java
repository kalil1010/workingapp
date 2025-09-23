package p105j;

import android.content.Context;
import android.view.View;
import p080b1.C0770h;
import p102i.AbstractC1014t;
import p102i.C1017w;
import p102i.MenuC1006l;
import p102i.SubMenuC0994E;
import tkbmmn.ghwbbf.irvjzy.R;

/* renamed from: j.f */
/* loaded from: classes.dex */
public final class C1089f extends C1017w {

    /* renamed from: l */
    public final /* synthetic */ int f4504l = 0;

    /* renamed from: m */
    public final /* synthetic */ C1104k f4505m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1089f(C1104k c1104k, Context context, MenuC1006l menuC1006l, View view) {
        super(R.attr.actionOverflowMenuStyle, context, view, menuC1006l, true);
        this.f4505m = c1104k;
        this.f4324f = 8388613;
        C0770h c0770h = c1104k.f4553x;
        this.f4326h = c0770h;
        AbstractC1014t abstractC1014t = this.f4327i;
        if (abstractC1014t != null) {
            abstractC1014t.mo2544k(c0770h);
        }
    }

    @Override // p102i.C1017w
    /* renamed from: c */
    public final void mo2595c() {
        switch (this.f4504l) {
            case 0:
                C1104k c1104k = this.f4505m;
                c1104k.f4550u = null;
                c1104k.f4554y = 0;
                super.mo2595c();
                break;
            default:
                C1104k c1104k2 = this.f4505m;
                MenuC1006l menuC1006l = c1104k2.f4532c;
                if (menuC1006l != null) {
                    menuC1006l.m2572c(true);
                }
                c1104k2.f4549t = null;
                super.mo2595c();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1089f(C1104k c1104k, Context context, SubMenuC0994E subMenuC0994E, View view) {
        super(R.attr.actionOverflowMenuStyle, context, view, subMenuC0994E, false);
        this.f4505m = c1104k;
        if ((subMenuC0994E.f4184A.f4304x & 32) != 32) {
            View view2 = c1104k.f4539j;
            this.f4323e = view2 == null ? (View) c1104k.f4537h : view2;
        }
        C0770h c0770h = c1104k.f4553x;
        this.f4326h = c0770h;
        AbstractC1014t abstractC1014t = this.f4327i;
        if (abstractC1014t != null) {
            abstractC1014t.mo2544k(c0770h);
        }
    }
}
