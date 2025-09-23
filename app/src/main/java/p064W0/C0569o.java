package p064W0;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import p002A1.C0013H;
import p002A1.C0027i;
import p006C.AbstractC0075g;
import p028K.AbstractC0241P;
import p031L.AccessibilityManagerTouchExplorationStateChangeListenerC0332b;
import p033L1.AbstractC0364l;
import p035M0.AbstractC0368A;
import p093e2.AbstractC0901d;
import p105j.C1081c0;
import tkbmmn.ghwbbf.irvjzy.R;

/* renamed from: W0.o */
/* loaded from: classes.dex */
public final class C0569o extends LinearLayout {

    /* renamed from: a */
    public final TextInputLayout f1779a;

    /* renamed from: b */
    public final FrameLayout f1780b;

    /* renamed from: c */
    public final CheckableImageButton f1781c;

    /* renamed from: d */
    public ColorStateList f1782d;

    /* renamed from: e */
    public PorterDuff.Mode f1783e;

    /* renamed from: f */
    public View.OnLongClickListener f1784f;

    /* renamed from: g */
    public final CheckableImageButton f1785g;

    /* renamed from: h */
    public final C0568n f1786h;

    /* renamed from: i */
    public int f1787i;

    /* renamed from: j */
    public final LinkedHashSet f1788j;

    /* renamed from: k */
    public ColorStateList f1789k;

    /* renamed from: l */
    public PorterDuff.Mode f1790l;

    /* renamed from: m */
    public int f1791m;

    /* renamed from: n */
    public ImageView.ScaleType f1792n;

    /* renamed from: o */
    public View.OnLongClickListener f1793o;

    /* renamed from: p */
    public CharSequence f1794p;

    /* renamed from: q */
    public final C1081c0 f1795q;

    /* renamed from: r */
    public boolean f1796r;

    /* renamed from: s */
    public EditText f1797s;

    /* renamed from: t */
    public final AccessibilityManager f1798t;

    /* renamed from: u */
    public C0013H f1799u;

    /* renamed from: v */
    public final C0565k f1800v;

    public C0569o(TextInputLayout textInputLayout, C0027i c0027i) throws Resources.NotFoundException {
        CharSequence text;
        super(textInputLayout.getContext());
        int i2 = 0;
        this.f1787i = 0;
        this.f1788j = new LinkedHashSet();
        this.f1800v = new C0565k(this);
        C0566l c0566l = new C0566l(this);
        this.f1798t = (AccessibilityManager) getContext().getSystemService("accessibility");
        this.f1779a = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388613));
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.f1780b = frameLayout;
        frameLayout.setVisibility(8);
        frameLayout.setLayoutParams(new LinearLayout.LayoutParams(-2, -1));
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(getContext());
        CheckableImageButton checkableImageButtonM1358a = m1358a(this, layoutInflaterFrom, R.id.text_input_error_icon);
        this.f1781c = checkableImageButtonM1358a;
        CheckableImageButton checkableImageButtonM1358a2 = m1358a(frameLayout, layoutInflaterFrom, R.id.text_input_end_icon);
        this.f1785g = checkableImageButtonM1358a2;
        this.f1786h = new C0568n(this, c0027i);
        C1081c0 c1081c0 = new C1081c0(getContext(), null);
        this.f1795q = c1081c0;
        TypedArray typedArray = (TypedArray) c0027i.f66c;
        if (typedArray.hasValue(38)) {
            this.f1782d = AbstractC0901d.m2316s(getContext(), c0027i, 38);
        }
        if (typedArray.hasValue(39)) {
            this.f1783e = AbstractC0368A.m1042g(typedArray.getInt(39, -1), null);
        }
        if (typedArray.hasValue(37)) {
            m1366i(c0027i.m100B(37));
        }
        checkableImageButtonM1358a.setContentDescription(getResources().getText(R.string.error_icon_content_description));
        WeakHashMap weakHashMap = AbstractC0241P.f815a;
        checkableImageButtonM1358a.setImportantForAccessibility(2);
        checkableImageButtonM1358a.setClickable(false);
        checkableImageButtonM1358a.setPressable(false);
        checkableImageButtonM1358a.setFocusable(false);
        if (!typedArray.hasValue(53)) {
            if (typedArray.hasValue(32)) {
                this.f1789k = AbstractC0901d.m2316s(getContext(), c0027i, 32);
            }
            if (typedArray.hasValue(33)) {
                this.f1790l = AbstractC0368A.m1042g(typedArray.getInt(33, -1), null);
            }
        }
        if (typedArray.hasValue(30)) {
            m1364g(typedArray.getInt(30, 0));
            if (typedArray.hasValue(27) && checkableImageButtonM1358a2.getContentDescription() != (text = typedArray.getText(27))) {
                checkableImageButtonM1358a2.setContentDescription(text);
            }
            checkableImageButtonM1358a2.setCheckable(typedArray.getBoolean(26, true));
        } else if (typedArray.hasValue(53)) {
            if (typedArray.hasValue(54)) {
                this.f1789k = AbstractC0901d.m2316s(getContext(), c0027i, 54);
            }
            if (typedArray.hasValue(55)) {
                this.f1790l = AbstractC0368A.m1042g(typedArray.getInt(55, -1), null);
            }
            m1364g(typedArray.getBoolean(53, false) ? 1 : 0);
            CharSequence text2 = typedArray.getText(51);
            if (checkableImageButtonM1358a2.getContentDescription() != text2) {
                checkableImageButtonM1358a2.setContentDescription(text2);
            }
        }
        int dimensionPixelSize = typedArray.getDimensionPixelSize(29, getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size));
        if (dimensionPixelSize < 0) {
            throw new IllegalArgumentException("endIconSize cannot be less than 0");
        }
        if (dimensionPixelSize != this.f1791m) {
            this.f1791m = dimensionPixelSize;
            checkableImageButtonM1358a2.setMinimumWidth(dimensionPixelSize);
            checkableImageButtonM1358a2.setMinimumHeight(dimensionPixelSize);
            checkableImageButtonM1358a.setMinimumWidth(dimensionPixelSize);
            checkableImageButtonM1358a.setMinimumHeight(dimensionPixelSize);
        }
        if (typedArray.hasValue(31)) {
            ImageView.ScaleType scaleTypeM1012t = AbstractC0364l.m1012t(typedArray.getInt(31, -1));
            this.f1792n = scaleTypeM1012t;
            checkableImageButtonM1358a2.setScaleType(scaleTypeM1012t);
            checkableImageButtonM1358a.setScaleType(scaleTypeM1012t);
        }
        c1081c0.setVisibility(8);
        c1081c0.setId(R.id.textinput_suffix_text);
        c1081c0.setLayoutParams(new LinearLayout.LayoutParams(-2, -2, 80.0f));
        c1081c0.setAccessibilityLiveRegion(1);
        c1081c0.setTextAppearance(typedArray.getResourceId(72, 0));
        if (typedArray.hasValue(73)) {
            c1081c0.setTextColor(c0027i.m99A(73));
        }
        CharSequence text3 = typedArray.getText(71);
        this.f1794p = TextUtils.isEmpty(text3) ? null : text3;
        c1081c0.setText(text3);
        m1371n();
        frameLayout.addView(checkableImageButtonM1358a2);
        addView(c1081c0);
        addView(frameLayout);
        addView(checkableImageButtonM1358a);
        textInputLayout.f3365e0.add(c0566l);
        if (textInputLayout.f3362d != null) {
            c0566l.m1354a(textInputLayout);
        }
        addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC0567m(i2, this));
    }

    /* renamed from: a */
    public final CheckableImageButton m1358a(ViewGroup viewGroup, LayoutInflater layoutInflater, int i2) {
        CheckableImageButton checkableImageButton = (CheckableImageButton) layoutInflater.inflate(R.layout.design_text_input_end_icon, viewGroup, false);
        checkableImageButton.setId(i2);
        if (AbstractC0901d.m2285P(getContext())) {
            ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).setMarginStart(0);
        }
        return checkableImageButton;
    }

    /* renamed from: b */
    public final AbstractC0570p m1359b() {
        AbstractC0570p c0559e;
        int i2 = this.f1787i;
        C0568n c0568n = this.f1786h;
        SparseArray sparseArray = c0568n.f1775a;
        AbstractC0570p abstractC0570p = (AbstractC0570p) sparseArray.get(i2);
        if (abstractC0570p != null) {
            return abstractC0570p;
        }
        C0569o c0569o = c0568n.f1776b;
        if (i2 == -1) {
            c0559e = new C0559e(c0569o, 0);
        } else if (i2 == 0) {
            c0559e = new C0559e(c0569o, 1);
        } else if (i2 == 1) {
            c0559e = new C0577w(c0569o, c0568n.f1778d);
        } else if (i2 == 2) {
            c0559e = new C0558d(c0569o);
        } else {
            if (i2 != 3) {
                throw new IllegalArgumentException(AbstractC0075g.m236e("Invalid end icon mode: ", i2));
            }
            c0559e = new C0564j(c0569o);
        }
        sparseArray.append(i2, c0559e);
        return c0559e;
    }

    /* renamed from: c */
    public final int m1360c() {
        int marginStart;
        if (m1361d() || m1362e()) {
            CheckableImageButton checkableImageButton = this.f1785g;
            marginStart = ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).getMarginStart() + checkableImageButton.getMeasuredWidth();
        } else {
            marginStart = 0;
        }
        WeakHashMap weakHashMap = AbstractC0241P.f815a;
        return this.f1795q.getPaddingEnd() + getPaddingEnd() + marginStart;
    }

    /* renamed from: d */
    public final boolean m1361d() {
        return this.f1780b.getVisibility() == 0 && this.f1785g.getVisibility() == 0;
    }

    /* renamed from: e */
    public final boolean m1362e() {
        return this.f1781c.getVisibility() == 0;
    }

    /* renamed from: f */
    public final void m1363f(boolean z2) {
        boolean z3;
        boolean zIsActivated;
        boolean z4;
        AbstractC0570p abstractC0570pM1359b = m1359b();
        boolean zMo1373k = abstractC0570pM1359b.mo1373k();
        CheckableImageButton checkableImageButton = this.f1785g;
        boolean z5 = true;
        if (!zMo1373k || (z4 = checkableImageButton.f3268d) == abstractC0570pM1359b.mo1349l()) {
            z3 = false;
        } else {
            checkableImageButton.setChecked(!z4);
            z3 = true;
        }
        if (!(abstractC0570pM1359b instanceof C0564j) || (zIsActivated = checkableImageButton.isActivated()) == abstractC0570pM1359b.mo1348j()) {
            z5 = z3;
        } else {
            checkableImageButton.setActivated(!zIsActivated);
        }
        if (z2 || z5) {
            AbstractC0364l.m994a0(this.f1779a, checkableImageButton, this.f1789k);
        }
    }

    /* renamed from: g */
    public final void m1364g(int i2) throws Resources.NotFoundException {
        if (this.f1787i == i2) {
            return;
        }
        AbstractC0570p abstractC0570pM1359b = m1359b();
        C0013H c0013h = this.f1799u;
        AccessibilityManager accessibilityManager = this.f1798t;
        if (c0013h != null && accessibilityManager != null) {
            accessibilityManager.removeTouchExplorationStateChangeListener(new AccessibilityManagerTouchExplorationStateChangeListenerC0332b(c0013h));
        }
        this.f1799u = null;
        abstractC0570pM1359b.mo1342s();
        this.f1787i = i2;
        Iterator it = this.f1788j.iterator();
        if (it.hasNext()) {
            throw AbstractC0075g.m235d(it);
        }
        m1365h(i2 != 0);
        AbstractC0570p abstractC0570pM1359b2 = m1359b();
        int iMo1335d = this.f1786h.f1777c;
        if (iMo1335d == 0) {
            iMo1335d = abstractC0570pM1359b2.mo1335d();
        }
        Drawable drawableM2321x = iMo1335d != 0 ? AbstractC0901d.m2321x(getContext(), iMo1335d) : null;
        CheckableImageButton checkableImageButton = this.f1785g;
        checkableImageButton.setImageDrawable(drawableM2321x);
        TextInputLayout textInputLayout = this.f1779a;
        if (drawableM2321x != null) {
            AbstractC0364l.m1001h(textInputLayout, checkableImageButton, this.f1789k, this.f1790l);
            AbstractC0364l.m994a0(textInputLayout, checkableImageButton, this.f1789k);
        }
        int iMo1334c = abstractC0570pM1359b2.mo1334c();
        CharSequence text = iMo1334c != 0 ? getResources().getText(iMo1334c) : null;
        if (checkableImageButton.getContentDescription() != text) {
            checkableImageButton.setContentDescription(text);
        }
        checkableImageButton.setCheckable(abstractC0570pM1359b2.mo1373k());
        if (!abstractC0570pM1359b2.mo1347i(textInputLayout.getBoxBackgroundMode())) {
            throw new IllegalStateException("The current box background mode " + textInputLayout.getBoxBackgroundMode() + " is not supported by the end icon mode " + i2);
        }
        abstractC0570pM1359b2.mo1341r();
        C0013H c0013hMo1346h = abstractC0570pM1359b2.mo1346h();
        this.f1799u = c0013hMo1346h;
        if (c0013hMo1346h != null && accessibilityManager != null) {
            WeakHashMap weakHashMap = AbstractC0241P.f815a;
            if (isAttachedToWindow()) {
                accessibilityManager.addTouchExplorationStateChangeListener(new AccessibilityManagerTouchExplorationStateChangeListenerC0332b(this.f1799u));
            }
        }
        View.OnClickListener onClickListenerMo1337f = abstractC0570pM1359b2.mo1337f();
        View.OnLongClickListener onLongClickListener = this.f1793o;
        checkableImageButton.setOnClickListener(onClickListenerMo1337f);
        AbstractC0364l.m998e0(checkableImageButton, onLongClickListener);
        EditText editText = this.f1797s;
        if (editText != null) {
            abstractC0570pM1359b2.mo1339m(editText);
            m1367j(abstractC0570pM1359b2);
        }
        AbstractC0364l.m1001h(textInputLayout, checkableImageButton, this.f1789k, this.f1790l);
        m1363f(true);
    }

    /* renamed from: h */
    public final void m1365h(boolean z2) throws Resources.NotFoundException {
        if (m1361d() != z2) {
            this.f1785g.setVisibility(z2 ? 0 : 8);
            m1368k();
            m1370m();
            this.f1779a.m2129q();
        }
    }

    /* renamed from: i */
    public final void m1366i(Drawable drawable) throws Resources.NotFoundException {
        CheckableImageButton checkableImageButton = this.f1781c;
        checkableImageButton.setImageDrawable(drawable);
        m1369l();
        AbstractC0364l.m1001h(this.f1779a, checkableImageButton, this.f1782d, this.f1783e);
    }

    /* renamed from: j */
    public final void m1367j(AbstractC0570p abstractC0570p) {
        if (this.f1797s == null) {
            return;
        }
        if (abstractC0570p.mo1336e() != null) {
            this.f1797s.setOnFocusChangeListener(abstractC0570p.mo1336e());
        }
        if (abstractC0570p.mo1338g() != null) {
            this.f1785g.setOnFocusChangeListener(abstractC0570p.mo1338g());
        }
    }

    /* renamed from: k */
    public final void m1368k() {
        this.f1780b.setVisibility((this.f1785g.getVisibility() != 0 || m1362e()) ? 8 : 0);
        setVisibility((m1361d() || m1362e() || !((this.f1794p == null || this.f1796r) ? 8 : false)) ? 0 : 8);
    }

    /* renamed from: l */
    public final void m1369l() throws Resources.NotFoundException {
        CheckableImageButton checkableImageButton = this.f1781c;
        Drawable drawable = checkableImageButton.getDrawable();
        TextInputLayout textInputLayout = this.f1779a;
        checkableImageButton.setVisibility((drawable != null && textInputLayout.f3374j.f1829q && textInputLayout.m2125m()) ? 0 : 8);
        m1368k();
        m1370m();
        if (this.f1787i != 0) {
            return;
        }
        textInputLayout.m2129q();
    }

    /* renamed from: m */
    public final void m1370m() throws Resources.NotFoundException {
        int paddingEnd;
        TextInputLayout textInputLayout = this.f1779a;
        if (textInputLayout.f3362d == null) {
            return;
        }
        if (m1361d() || m1362e()) {
            paddingEnd = 0;
        } else {
            EditText editText = textInputLayout.f3362d;
            WeakHashMap weakHashMap = AbstractC0241P.f815a;
            paddingEnd = editText.getPaddingEnd();
        }
        int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(R.dimen.material_input_text_to_prefix_suffix_padding);
        int paddingTop = textInputLayout.f3362d.getPaddingTop();
        int paddingBottom = textInputLayout.f3362d.getPaddingBottom();
        WeakHashMap weakHashMap2 = AbstractC0241P.f815a;
        this.f1795q.setPaddingRelative(dimensionPixelSize, paddingTop, paddingEnd, paddingBottom);
    }

    /* renamed from: n */
    public final void m1371n() {
        C1081c0 c1081c0 = this.f1795q;
        int visibility = c1081c0.getVisibility();
        int i2 = (this.f1794p == null || this.f1796r) ? 8 : 0;
        if (visibility != i2) {
            m1359b().mo1340p(i2 == 0);
        }
        m1368k();
        c1081c0.setVisibility(i2);
        this.f1779a.m2129q();
    }
}
