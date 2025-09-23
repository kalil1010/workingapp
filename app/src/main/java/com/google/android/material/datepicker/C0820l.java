package com.google.android.material.datepicker;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC0709l;
import com.google.android.material.internal.CheckableImageButton;
import java.util.Calendar;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import p002A1.ViewOnClickListenerC0022d;
import p006C.AbstractC0069a;
import p023I0.ViewOnTouchListenerC0206a;
import p028K.AbstractC0230E;
import p028K.AbstractC0241P;
import p028K.AbstractC0250Z;
import p028K.C0294v0;
import p028K.C0296w0;
import p028K.C0298x0;
import p033L1.AbstractC0364l;
import p055T0.C0511e;
import p055T0.C0513g;
import p093e2.AbstractC0901d;
import p145x0.AbstractC1395a;
import tkbmmn.ghwbbf.irvjzy.R;

/* renamed from: com.google.android.material.datepicker.l */
/* loaded from: classes.dex */
public final class C0820l<S> extends DialogInterfaceOnCancelListenerC0709l {

    /* renamed from: A0 */
    public CharSequence f3199A0;

    /* renamed from: B0 */
    public CharSequence f3200B0;

    /* renamed from: e0 */
    public final LinkedHashSet f3201e0;

    /* renamed from: f0 */
    public final LinkedHashSet f3202f0;

    /* renamed from: g0 */
    public int f3203g0;

    /* renamed from: h0 */
    public AbstractC0827s f3204h0;

    /* renamed from: i0 */
    public C0810b f3205i0;

    /* renamed from: j0 */
    public C0818j f3206j0;

    /* renamed from: k0 */
    public int f3207k0;

    /* renamed from: l0 */
    public CharSequence f3208l0;

    /* renamed from: m0 */
    public boolean f3209m0;

    /* renamed from: n0 */
    public int f3210n0;

    /* renamed from: o0 */
    public int f3211o0;

    /* renamed from: p0 */
    public CharSequence f3212p0;

    /* renamed from: q0 */
    public int f3213q0;

    /* renamed from: r0 */
    public CharSequence f3214r0;

    /* renamed from: s0 */
    public int f3215s0;

    /* renamed from: t0 */
    public CharSequence f3216t0;

    /* renamed from: u0 */
    public int f3217u0;

    /* renamed from: v0 */
    public CharSequence f3218v0;

    /* renamed from: w0 */
    public TextView f3219w0;

    /* renamed from: x0 */
    public CheckableImageButton f3220x0;

    /* renamed from: y0 */
    public C0513g f3221y0;

    /* renamed from: z0 */
    public boolean f3222z0;

    public C0820l() {
        new LinkedHashSet();
        new LinkedHashSet();
        this.f3201e0 = new LinkedHashSet();
        this.f3202f0 = new LinkedHashSet();
    }

    /* renamed from: B */
    public static int m2087B(Context context) throws Resources.NotFoundException {
        Resources resources = context.getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_content_padding);
        Calendar calendarM2098b = AbstractC0830v.m2098b();
        calendarM2098b.set(5, 1);
        Calendar calendarM2097a = AbstractC0830v.m2097a(calendarM2098b);
        calendarM2097a.get(2);
        calendarM2097a.get(1);
        int maximum = calendarM2097a.getMaximum(7);
        calendarM2097a.getActualMaximum(5);
        calendarM2097a.getTimeInMillis();
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.mtrl_calendar_day_width) * maximum;
        return ((maximum - 1) * resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_month_horizontal_padding)) + dimensionPixelSize + (dimensionPixelOffset * 2);
    }

    /* renamed from: C */
    public static boolean m2088C(Context context, int i2) throws Resources.NotFoundException {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(AbstractC0364l.m997d0(context, R.attr.materialCalendarStyle, C0818j.class.getCanonicalName()).data, new int[]{i2});
        boolean z2 = typedArrayObtainStyledAttributes.getBoolean(0, false);
        typedArrayObtainStyledAttributes.recycle();
        return z2;
    }

    /* renamed from: A */
    public final void m2089A() {
        if (this.f2633f.getParcelable("DATE_SELECTOR_KEY") != null) {
            throw new ClassCastException();
        }
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0709l, androidx.fragment.app.AbstractComponentCallbacksC0712o
    /* renamed from: l */
    public final void mo1742l(Bundle bundle) throws Resources.NotFoundException {
        super.mo1742l(bundle);
        if (bundle == null) {
            bundle = this.f2633f;
        }
        this.f3203g0 = bundle.getInt("OVERRIDE_THEME_RES_ID");
        if (bundle.getParcelable("DATE_SELECTOR_KEY") != null) {
            throw new ClassCastException();
        }
        this.f3205i0 = (C0810b) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        if (bundle.getParcelable("DAY_VIEW_DECORATOR_KEY") != null) {
            throw new ClassCastException();
        }
        this.f3207k0 = bundle.getInt("TITLE_TEXT_RES_ID_KEY");
        this.f3208l0 = bundle.getCharSequence("TITLE_TEXT_KEY");
        this.f3210n0 = bundle.getInt("INPUT_MODE_KEY");
        this.f3211o0 = bundle.getInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY");
        this.f3212p0 = bundle.getCharSequence("POSITIVE_BUTTON_TEXT_KEY");
        this.f3213q0 = bundle.getInt("POSITIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY");
        this.f3214r0 = bundle.getCharSequence("POSITIVE_BUTTON_CONTENT_DESCRIPTION_KEY");
        this.f3215s0 = bundle.getInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY");
        this.f3216t0 = bundle.getCharSequence("NEGATIVE_BUTTON_TEXT_KEY");
        this.f3217u0 = bundle.getInt("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY");
        this.f3218v0 = bundle.getCharSequence("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_KEY");
        CharSequence text = this.f3208l0;
        if (text == null) {
            text = m1758v().getResources().getText(this.f3207k0);
        }
        this.f3199A0 = text;
        if (text != null) {
            CharSequence[] charSequenceArrSplit = TextUtils.split(String.valueOf(text), "\n");
            if (charSequenceArrSplit.length > 1) {
                text = charSequenceArrSplit[0];
            }
        } else {
            text = null;
        }
        this.f3200B0 = text;
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0712o
    /* renamed from: m */
    public final View mo1757m(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(this.f3209m0 ? R.layout.mtrl_picker_fullscreen : R.layout.mtrl_picker_dialog, viewGroup);
        Context context = viewInflate.getContext();
        if (this.f3209m0) {
            viewInflate.findViewById(R.id.mtrl_calendar_frame).setLayoutParams(new LinearLayout.LayoutParams(m2087B(context), -2));
        } else {
            viewInflate.findViewById(R.id.mtrl_calendar_main_pane).setLayoutParams(new LinearLayout.LayoutParams(m2087B(context), -1));
        }
        TextView textView = (TextView) viewInflate.findViewById(R.id.mtrl_picker_header_selection_text);
        WeakHashMap weakHashMap = AbstractC0241P.f815a;
        textView.setAccessibilityLiveRegion(1);
        this.f3220x0 = (CheckableImageButton) viewInflate.findViewById(R.id.mtrl_picker_header_toggle);
        this.f3219w0 = (TextView) viewInflate.findViewById(R.id.mtrl_picker_title_text);
        this.f3220x0.setTag("TOGGLE_BUTTON_TAG");
        CheckableImageButton checkableImageButton = this.f3220x0;
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{android.R.attr.state_checked}, AbstractC0901d.m2321x(context, R.drawable.material_ic_calendar_black_24dp));
        stateListDrawable.addState(new int[0], AbstractC0901d.m2321x(context, R.drawable.material_ic_edit_black_24dp));
        checkableImageButton.setImageDrawable(stateListDrawable);
        this.f3220x0.setChecked(this.f3210n0 != 0);
        AbstractC0241P.m701m(this.f3220x0, null);
        CheckableImageButton checkableImageButton2 = this.f3220x0;
        this.f3220x0.setContentDescription(this.f3210n0 == 1 ? checkableImageButton2.getContext().getString(R.string.mtrl_picker_toggle_to_calendar_input_mode) : checkableImageButton2.getContext().getString(R.string.mtrl_picker_toggle_to_text_input_mode));
        this.f3220x0.setOnClickListener(new ViewOnClickListenerC0022d(5, this));
        m2089A();
        throw null;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0709l, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        Iterator it = this.f3201e0.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnCancelListener) it.next()).onCancel(dialogInterface);
        }
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0709l, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        Iterator it = this.f3202f0.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnDismissListener) it.next()).onDismiss(dialogInterface);
        }
        ViewGroup viewGroup = (ViewGroup) this.f2616E;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        super.onDismiss(dialogInterface);
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0709l, androidx.fragment.app.AbstractComponentCallbacksC0712o
    /* renamed from: q */
    public final void mo1746q(Bundle bundle) {
        super.mo1746q(bundle);
        bundle.putInt("OVERRIDE_THEME_RES_ID", this.f3203g0);
        bundle.putParcelable("DATE_SELECTOR_KEY", null);
        C0810b c0810b = this.f3205i0;
        C0809a c0809a = new C0809a();
        int i2 = C0809a.f3160b;
        int i3 = C0809a.f3160b;
        long j2 = c0810b.f3162a.f3230f;
        long j3 = c0810b.f3163b.f3230f;
        c0809a.f3161a = Long.valueOf(c0810b.f3165d.f3230f);
        C0818j c0818j = this.f3206j0;
        C0822n c0822n = c0818j == null ? null : c0818j.f3187U;
        if (c0822n != null) {
            c0809a.f3161a = Long.valueOf(c0822n.f3230f);
        }
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable("DEEP_COPY_VALIDATOR_KEY", c0810b.f3164c);
        C0822n c0822nM2091b = C0822n.m2091b(j2);
        C0822n c0822nM2091b2 = C0822n.m2091b(j3);
        C0812d c0812d = (C0812d) bundle2.getParcelable("DEEP_COPY_VALIDATOR_KEY");
        Long l2 = c0809a.f3161a;
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", new C0810b(c0822nM2091b, c0822nM2091b2, c0812d, l2 == null ? null : C0822n.m2091b(l2.longValue()), c0810b.f3166e));
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", null);
        bundle.putInt("TITLE_TEXT_RES_ID_KEY", this.f3207k0);
        bundle.putCharSequence("TITLE_TEXT_KEY", this.f3208l0);
        bundle.putInt("INPUT_MODE_KEY", this.f3210n0);
        bundle.putInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY", this.f3211o0);
        bundle.putCharSequence("POSITIVE_BUTTON_TEXT_KEY", this.f3212p0);
        bundle.putInt("POSITIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY", this.f3213q0);
        bundle.putCharSequence("POSITIVE_BUTTON_CONTENT_DESCRIPTION_KEY", this.f3214r0);
        bundle.putInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY", this.f3215s0);
        bundle.putCharSequence("NEGATIVE_BUTTON_TEXT_KEY", this.f3216t0);
        bundle.putInt("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY", this.f3217u0);
        bundle.putCharSequence("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_KEY", this.f3218v0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0709l, androidx.fragment.app.AbstractComponentCallbacksC0712o
    /* renamed from: r */
    public final void mo1747r() throws Resources.NotFoundException {
        C0294v0 c0296w0;
        C0294v0 c0296w02;
        super.mo1747r();
        Dialog dialog = this.f2595a0;
        if (dialog == null) {
            throw new IllegalStateException("DialogFragment " + this + " does not have a Dialog.");
        }
        Window window = dialog.getWindow();
        if (this.f3209m0) {
            window.setLayout(-1, -1);
            window.setBackgroundDrawable(this.f3221y0);
            if (!this.f3222z0) {
                View viewFindViewById = m1759w().findViewById(R.id.fullscreen_header);
                ColorStateList colorStateListM2319u = AbstractC0901d.m2319u(viewFindViewById.getBackground());
                Integer numValueOf = colorStateListM2319u != null ? Integer.valueOf(colorStateListM2319u.getDefaultColor()) : null;
                int i2 = Build.VERSION.SDK_INT;
                boolean z2 = false;
                boolean z3 = numValueOf == null || numValueOf.intValue() == 0;
                int iM982F = AbstractC0364l.m982F(window.getContext(), android.R.attr.colorBackground, -16777216);
                if (z3) {
                    numValueOf = Integer.valueOf(iM982F);
                }
                if (i2 >= 30) {
                    AbstractC0250Z.m725a(window, false);
                } else {
                    View decorView = window.getDecorView();
                    decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 1792);
                }
                window.getContext();
                int iM195d = i2 < 27 ? AbstractC0069a.m195d(AbstractC0364l.m982F(window.getContext(), android.R.attr.navigationBarColor, -16777216), 128) : 0;
                window.setStatusBarColor(0);
                window.setNavigationBarColor(iM195d);
                boolean z4 = AbstractC0364l.m988N(0) || AbstractC0364l.m988N(numValueOf.intValue());
                C0511e c0511e = new C0511e(window.getDecorView());
                int i3 = Build.VERSION.SDK_INT;
                if (i3 >= 30) {
                    C0298x0 c0298x0 = new C0298x0(window.getInsetsController(), c0511e);
                    c0298x0.f919o = window;
                    c0296w0 = c0298x0;
                } else {
                    c0296w0 = i3 >= 26 ? new C0296w0(window, c0511e) : new C0294v0(window, c0511e);
                }
                c0296w0.mo826D(z4);
                boolean zM988N = AbstractC0364l.m988N(iM982F);
                if (AbstractC0364l.m988N(iM195d) || (iM195d == 0 && zM988N)) {
                    z2 = true;
                }
                C0511e c0511e2 = new C0511e(window.getDecorView());
                int i4 = Build.VERSION.SDK_INT;
                if (i4 >= 30) {
                    C0298x0 c0298x02 = new C0298x0(window.getInsetsController(), c0511e2);
                    c0298x02.f919o = window;
                    c0296w02 = c0298x02;
                } else {
                    c0296w02 = i4 >= 26 ? new C0296w0(window, c0511e2) : new C0294v0(window, c0511e2);
                }
                c0296w02.mo828C(z2);
                C0819k c0819k = new C0819k(viewFindViewById, viewFindViewById.getLayoutParams().height, viewFindViewById.getPaddingTop());
                WeakHashMap weakHashMap = AbstractC0241P.f815a;
                AbstractC0230E.m638u(viewFindViewById, c0819k);
                this.f3222z0 = true;
            }
        } else {
            window.setLayout(-2, -2);
            int dimensionPixelOffset = m1758v().getResources().getDimensionPixelOffset(R.dimen.mtrl_calendar_dialog_background_inset);
            Rect rect = new Rect(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
            window.setBackgroundDrawable(new InsetDrawable((Drawable) this.f3221y0, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset));
            View decorView2 = window.getDecorView();
            Dialog dialog2 = this.f2595a0;
            if (dialog2 == null) {
                throw new IllegalStateException("DialogFragment " + this + " does not have a Dialog.");
            }
            decorView2.setOnTouchListener(new ViewOnTouchListenerC0206a(dialog2, rect));
        }
        m1758v();
        int i5 = this.f3203g0;
        if (i5 == 0) {
            m2089A();
            throw null;
        }
        m2089A();
        C0810b c0810b = this.f3205i0;
        C0818j c0818j = new C0818j();
        Bundle bundle = new Bundle();
        bundle.putInt("THEME_RES_ID_KEY", i5);
        bundle.putParcelable("GRID_SELECTOR_KEY", null);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", c0810b);
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", null);
        bundle.putParcelable("CURRENT_MONTH_KEY", c0810b.f3165d);
        c0818j.m1761y(bundle);
        this.f3206j0 = c0818j;
        AbstractC0827s abstractC0827s = c0818j;
        if (this.f3210n0 == 1) {
            m2089A();
            C0810b c0810b2 = this.f3205i0;
            AbstractC0827s c0821m = new C0821m();
            Bundle bundle2 = new Bundle();
            bundle2.putInt("THEME_RES_ID_KEY", i5);
            bundle2.putParcelable("DATE_SELECTOR_KEY", null);
            bundle2.putParcelable("CALENDAR_CONSTRAINTS_KEY", c0810b2);
            c0821m.m1761y(bundle2);
            abstractC0827s = c0821m;
        }
        this.f3204h0 = abstractC0827s;
        this.f3219w0.setText((this.f3210n0 == 1 && m1758v().getResources().getConfiguration().orientation == 2) ? this.f3200B0 : this.f3199A0);
        m2089A();
        throw null;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0709l, androidx.fragment.app.AbstractComponentCallbacksC0712o
    /* renamed from: s */
    public final void mo1748s() {
        this.f3204h0.f3244R.clear();
        super.mo1748s();
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0709l
    /* renamed from: z */
    public final Dialog mo1751z() {
        Context contextM1758v = m1758v();
        m1758v();
        int i2 = this.f3203g0;
        if (i2 == 0) {
            m2089A();
            throw null;
        }
        Dialog dialog = new Dialog(contextM1758v, i2);
        Context context = dialog.getContext();
        this.f3209m0 = m2088C(context, android.R.attr.windowFullscreen);
        this.f3221y0 = new C0513g(context, null, R.attr.materialCalendarStyle, R.style.Widget_MaterialComponents_MaterialCalendar);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, AbstractC1395a.f6043l, R.attr.materialCalendarStyle, R.style.Widget_MaterialComponents_MaterialCalendar);
        int color = typedArrayObtainStyledAttributes.getColor(1, 0);
        typedArrayObtainStyledAttributes.recycle();
        this.f3221y0.m1288h(context);
        this.f3221y0.m1290j(ColorStateList.valueOf(color));
        C0513g c0513g = this.f3221y0;
        View decorView = dialog.getWindow().getDecorView();
        WeakHashMap weakHashMap = AbstractC0241P.f815a;
        c0513g.m1289i(AbstractC0230E.m626i(decorView));
        return dialog;
    }
}
