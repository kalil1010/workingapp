package com.google.android.material.datepicker;

import android.R;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.GridView;
import android.widget.ListAdapter;
import android.widget.Scroller;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import java.util.ArrayList;
import p005B1.ViewOnClickListenerC0066d;
import p010D0.C0107e;
import p020H.RunnableC0171a;
import p028K.AbstractC0241P;
import p045Q.C0444h;
import p080b1.C0770h;
import p094f0.C0930b0;
import p094f0.C0960y;

/* renamed from: com.google.android.material.datepicker.j */
/* loaded from: classes.dex */
public final class C0818j<S> extends AbstractC0827s {

    /* renamed from: S */
    public int f3185S;

    /* renamed from: T */
    public C0810b f3186T;

    /* renamed from: U */
    public C0822n f3187U;

    /* renamed from: V */
    public int f3188V;

    /* renamed from: W */
    public C0811c f3189W;

    /* renamed from: X */
    public RecyclerView f3190X;

    /* renamed from: Y */
    public RecyclerView f3191Y;

    /* renamed from: Z */
    public View f3192Z;

    /* renamed from: a0 */
    public View f3193a0;

    /* renamed from: b0 */
    public View f3194b0;

    /* renamed from: c0 */
    public View f3195c0;

    /* renamed from: A */
    public final void m2085A(int i2) {
        this.f3188V = i2;
        if (i2 == 2) {
            this.f3190X.getLayoutManager().mo1871n0(this.f3187U.f3227c - ((C0832x) this.f3190X.getAdapter()).f3247c.f3186T.f3162a.f3227c);
            this.f3194b0.setVisibility(0);
            this.f3195c0.setVisibility(8);
            this.f3192Z.setVisibility(8);
            this.f3193a0.setVisibility(8);
            return;
        }
        if (i2 == 1) {
            this.f3194b0.setVisibility(8);
            this.f3195c0.setVisibility(0);
            this.f3192Z.setVisibility(0);
            this.f3193a0.setVisibility(0);
            m2086z(this.f3187U);
        }
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0712o
    /* renamed from: l */
    public final void mo1742l(Bundle bundle) {
        super.mo1742l(bundle);
        if (bundle == null) {
            bundle = this.f2633f;
        }
        this.f3185S = bundle.getInt("THEME_RES_ID_KEY");
        if (bundle.getParcelable("GRID_SELECTOR_KEY") != null) {
            throw new ClassCastException();
        }
        this.f3186T = (C0810b) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        if (bundle.getParcelable("DAY_VIEW_DECORATOR_KEY") != null) {
            throw new ClassCastException();
        }
        this.f3187U = (C0822n) bundle.getParcelable("CURRENT_MONTH_KEY");
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0712o
    /* renamed from: m */
    public final View mo1757m(LayoutInflater layoutInflater, ViewGroup viewGroup) throws Resources.NotFoundException {
        int i2;
        int i3;
        C0960y c0960y;
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(m1754h(), this.f3185S);
        this.f3189W = new C0811c(contextThemeWrapper);
        LayoutInflater layoutInflaterCloneInContext = layoutInflater.cloneInContext(contextThemeWrapper);
        C0822n c0822n = this.f3186T.f3162a;
        if (C0820l.m2088C(contextThemeWrapper, R.attr.windowFullscreen)) {
            i2 = tkbmmn.ghwbbf.irvjzy.R.layout.mtrl_calendar_vertical;
            i3 = 1;
        } else {
            i2 = tkbmmn.ghwbbf.irvjzy.R.layout.mtrl_calendar_horizontal;
            i3 = 0;
        }
        View viewInflate = layoutInflaterCloneInContext.inflate(i2, viewGroup, false);
        Resources resources = m1758v().getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(tkbmmn.ghwbbf.irvjzy.R.dimen.mtrl_calendar_navigation_bottom_padding) + resources.getDimensionPixelOffset(tkbmmn.ghwbbf.irvjzy.R.dimen.mtrl_calendar_navigation_top_padding) + resources.getDimensionPixelSize(tkbmmn.ghwbbf.irvjzy.R.dimen.mtrl_calendar_navigation_height);
        int dimensionPixelSize = resources.getDimensionPixelSize(tkbmmn.ghwbbf.irvjzy.R.dimen.mtrl_calendar_days_of_week_height);
        int i4 = C0823o.f3232d;
        viewInflate.setMinimumHeight(dimensionPixelOffset + dimensionPixelSize + (resources.getDimensionPixelOffset(tkbmmn.ghwbbf.irvjzy.R.dimen.mtrl_calendar_month_vertical_padding) * (i4 - 1)) + (resources.getDimensionPixelSize(tkbmmn.ghwbbf.irvjzy.R.dimen.mtrl_calendar_day_height) * i4) + resources.getDimensionPixelOffset(tkbmmn.ghwbbf.irvjzy.R.dimen.mtrl_calendar_bottom_padding));
        GridView gridView = (GridView) viewInflate.findViewById(tkbmmn.ghwbbf.irvjzy.R.id.mtrl_calendar_days_of_week);
        AbstractC0241P.m701m(gridView, new C0444h(2));
        int i5 = this.f3186T.f3166e;
        gridView.setAdapter((ListAdapter) (i5 > 0 ? new C0813e(i5) : new C0813e()));
        gridView.setNumColumns(c0822n.f3228d);
        gridView.setEnabled(false);
        this.f3191Y = (RecyclerView) viewInflate.findViewById(tkbmmn.ghwbbf.irvjzy.R.id.mtrl_calendar_months);
        this.f3191Y.setLayoutManager(new C0815g(this, i3, i3));
        this.f3191Y.setTag("MONTHS_VIEW_GROUP_TAG");
        C0826r c0826r = new C0826r(contextThemeWrapper, this.f3186T, new C0770h(this));
        this.f3191Y.setAdapter(c0826r);
        int integer = contextThemeWrapper.getResources().getInteger(tkbmmn.ghwbbf.irvjzy.R.integer.mtrl_calendar_year_selector_span);
        RecyclerView recyclerView3 = (RecyclerView) viewInflate.findViewById(tkbmmn.ghwbbf.irvjzy.R.id.mtrl_calendar_year_selector_frame);
        this.f3190X = recyclerView3;
        if (recyclerView3 != null) {
            recyclerView3.setHasFixedSize(true);
            this.f3190X.setLayoutManager(new GridLayoutManager(integer));
            this.f3190X.setAdapter(new C0832x(this));
            this.f3190X.m1913g(new C0816h(this));
        }
        if (viewInflate.findViewById(tkbmmn.ghwbbf.irvjzy.R.id.month_navigation_fragment_toggle) != null) {
            MaterialButton materialButton = (MaterialButton) viewInflate.findViewById(tkbmmn.ghwbbf.irvjzy.R.id.month_navigation_fragment_toggle);
            materialButton.setTag("SELECTOR_TOGGLE_TAG");
            AbstractC0241P.m701m(materialButton, new C0107e(3, this));
            View viewFindViewById = viewInflate.findViewById(tkbmmn.ghwbbf.irvjzy.R.id.month_navigation_previous);
            this.f3192Z = viewFindViewById;
            viewFindViewById.setTag("NAVIGATION_PREV_TAG");
            View viewFindViewById2 = viewInflate.findViewById(tkbmmn.ghwbbf.irvjzy.R.id.month_navigation_next);
            this.f3193a0 = viewFindViewById2;
            viewFindViewById2.setTag("NAVIGATION_NEXT_TAG");
            this.f3194b0 = viewInflate.findViewById(tkbmmn.ghwbbf.irvjzy.R.id.mtrl_calendar_year_selector_frame);
            this.f3195c0 = viewInflate.findViewById(tkbmmn.ghwbbf.irvjzy.R.id.mtrl_calendar_day_selector_frame);
            m2085A(1);
            materialButton.setText(this.f3187U.m2092c());
            this.f3191Y.m1914h(new C0817i(this, c0826r, materialButton));
            materialButton.setOnClickListener(new ViewOnClickListenerC0066d(2, this));
            this.f3193a0.setOnClickListener(new ViewOnClickListenerC0814f(this, c0826r, 1));
            this.f3192Z.setOnClickListener(new ViewOnClickListenerC0814f(this, c0826r, 0));
        }
        if (!C0820l.m2088C(contextThemeWrapper, R.attr.windowFullscreen) && (recyclerView2 = (c0960y = new C0960y()).f4029a) != (recyclerView = this.f3191Y)) {
            C0930b0 c0930b0 = c0960y.f4030b;
            if (recyclerView2 != null) {
                ArrayList arrayList = recyclerView2.f2816g0;
                if (arrayList != null) {
                    arrayList.remove(c0930b0);
                }
                c0960y.f4029a.setOnFlingListener(null);
            }
            c0960y.f4029a = recyclerView;
            if (recyclerView != null) {
                if (recyclerView.getOnFlingListener() != null) {
                    throw new IllegalStateException("An instance of OnFlingListener already set.");
                }
                c0960y.f4029a.m1914h(c0930b0);
                c0960y.f4029a.setOnFlingListener(c0960y);
                new Scroller(c0960y.f4029a.getContext(), new DecelerateInterpolator());
                c0960y.m2472f();
            }
        }
        this.f3191Y.m1907b0(c0826r.f3241c.f3162a.m2093d(this.f3187U));
        AbstractC0241P.m701m(this.f3191Y, new C0444h(3));
        return viewInflate;
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0712o
    /* renamed from: q */
    public final void mo1746q(Bundle bundle) {
        bundle.putInt("THEME_RES_ID_KEY", this.f3185S);
        bundle.putParcelable("GRID_SELECTOR_KEY", null);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.f3186T);
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", null);
        bundle.putParcelable("CURRENT_MONTH_KEY", this.f3187U);
    }

    /* renamed from: z */
    public final void m2086z(C0822n c0822n) {
        C0826r c0826r = (C0826r) this.f3191Y.getAdapter();
        int iM2093d = c0826r.f3241c.f3162a.m2093d(c0822n);
        int iM2093d2 = iM2093d - c0826r.f3241c.f3162a.m2093d(this.f3187U);
        boolean z2 = Math.abs(iM2093d2) > 3;
        boolean z3 = iM2093d2 > 0;
        this.f3187U = c0822n;
        if (z2 && z3) {
            this.f3191Y.m1907b0(iM2093d - 3);
            this.f3191Y.post(new RunnableC0171a(this, iM2093d, 2));
        } else if (!z2) {
            this.f3191Y.post(new RunnableC0171a(this, iM2093d, 2));
        } else {
            this.f3191Y.m1907b0(iM2093d + 3);
            this.f3191Y.post(new RunnableC0171a(this, iM2093d, 2));
        }
    }
}
