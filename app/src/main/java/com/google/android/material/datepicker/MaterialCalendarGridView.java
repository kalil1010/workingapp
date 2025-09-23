package com.google.android.material.datepicker;

import android.R;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Adapter;
import android.widget.GridView;
import android.widget.ListAdapter;
import p028K.AbstractC0241P;
import p045Q.C0444h;

/* loaded from: classes.dex */
final class MaterialCalendarGridView extends GridView {

    /* renamed from: a */
    public final boolean f3159a;

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        AbstractC0830v.m2099c(null);
        if (C0820l.m2088C(getContext(), R.attr.windowFullscreen)) {
            setNextFocusLeftId(tkbmmn.ghwbbf.irvjzy.R.id.cancel_button);
            setNextFocusRightId(tkbmmn.ghwbbf.irvjzy.R.id.confirm_button);
        }
        this.f3159a = C0820l.m2088C(getContext(), tkbmmn.ghwbbf.irvjzy.R.attr.nestedScrollable);
        AbstractC0241P.m701m(this, new C0444h(4));
    }

    /* renamed from: a */
    public final C0823o m2081a() {
        return (C0823o) super.getAdapter();
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    public final Adapter getAdapter() {
        return (C0823o) super.getAdapter();
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ((C0823o) super.getAdapter()).notifyDataSetChanged();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        C0823o c0823o = (C0823o) super.getAdapter();
        c0823o.getClass();
        int iMax = Math.max(c0823o.m2094a(), getFirstVisiblePosition());
        int iMin = Math.min(c0823o.m2096c(), getLastVisiblePosition());
        c0823o.getItem(iMax);
        c0823o.getItem(iMin);
        throw null;
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    public final void onFocusChanged(boolean z2, int i2, Rect rect) {
        if (!z2) {
            super.onFocusChanged(false, i2, rect);
            return;
        }
        if (i2 == 33) {
            setSelection(((C0823o) super.getAdapter()).m2096c());
        } else if (i2 == 130) {
            setSelection(((C0823o) super.getAdapter()).m2094a());
        } else {
            super.onFocusChanged(true, i2, rect);
        }
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i2, KeyEvent keyEvent) {
        if (!super.onKeyDown(i2, keyEvent)) {
            return false;
        }
        if (getSelectedItemPosition() == -1 || getSelectedItemPosition() >= ((C0823o) super.getAdapter()).m2094a()) {
            return true;
        }
        if (19 != i2) {
            return false;
        }
        setSelection(((C0823o) super.getAdapter()).m2094a());
        return true;
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    public final void onMeasure(int i2, int i3) {
        if (!this.f3159a) {
            super.onMeasure(i2, i3);
            return;
        }
        super.onMeasure(i2, View.MeasureSpec.makeMeasureSpec(16777215, Integer.MIN_VALUE));
        getLayoutParams().height = getMeasuredHeight();
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    public final void setSelection(int i2) {
        if (i2 < ((C0823o) super.getAdapter()).m2094a()) {
            super.setSelection(((C0823o) super.getAdapter()).m2094a());
        } else {
            super.setSelection(i2);
        }
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    public final ListAdapter getAdapter() {
        return (C0823o) super.getAdapter();
    }

    @Override // android.widget.AdapterView
    public final void setAdapter(ListAdapter listAdapter) {
        if (!(listAdapter instanceof C0823o)) {
            throw new IllegalArgumentException(String.format("%1$s must have its Adapter set to a %2$s", MaterialCalendarGridView.class.getCanonicalName(), C0823o.class.getCanonicalName()));
        }
        super.setAdapter(listAdapter);
    }
}
