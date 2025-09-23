package p064W0;

import android.content.Context;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.EditText;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import p002A1.C0013H;
import p031L.C0341k;

/* renamed from: W0.p */
/* loaded from: classes.dex */
public abstract class AbstractC0570p {

    /* renamed from: a */
    public final TextInputLayout f1801a;

    /* renamed from: b */
    public final C0569o f1802b;

    /* renamed from: c */
    public final Context f1803c;

    /* renamed from: d */
    public final CheckableImageButton f1804d;

    public AbstractC0570p(C0569o c0569o) {
        this.f1801a = c0569o.f1779a;
        this.f1802b = c0569o;
        this.f1803c = c0569o.getContext();
        this.f1804d = c0569o.f1785g;
    }

    /* renamed from: a */
    public void mo1333a() {
    }

    /* renamed from: b */
    public void mo1372b() {
    }

    /* renamed from: c */
    public int mo1334c() {
        return 0;
    }

    /* renamed from: d */
    public int mo1335d() {
        return 0;
    }

    /* renamed from: e */
    public View.OnFocusChangeListener mo1336e() {
        return null;
    }

    /* renamed from: f */
    public View.OnClickListener mo1337f() {
        return null;
    }

    /* renamed from: g */
    public View.OnFocusChangeListener mo1338g() {
        return null;
    }

    /* renamed from: h */
    public C0013H mo1346h() {
        return null;
    }

    /* renamed from: i */
    public boolean mo1347i(int i2) {
        return true;
    }

    /* renamed from: j */
    public boolean mo1348j() {
        return false;
    }

    /* renamed from: k */
    public boolean mo1373k() {
        return this instanceof C0564j;
    }

    /* renamed from: l */
    public boolean mo1349l() {
        return false;
    }

    /* renamed from: m */
    public void mo1339m(EditText editText) {
    }

    /* renamed from: n */
    public void mo1350n(C0341k c0341k) {
    }

    /* renamed from: o */
    public void mo1351o(AccessibilityEvent accessibilityEvent) {
    }

    /* renamed from: p */
    public void mo1340p(boolean z2) {
    }

    /* renamed from: q */
    public final void m1374q() {
        this.f1802b.m1363f(false);
    }

    /* renamed from: r */
    public void mo1341r() {
    }

    /* renamed from: s */
    public void mo1342s() {
    }
}
