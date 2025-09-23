package p064W0;

import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import p002A1.ViewOnClickListenerC0022d;
import tkbmmn.ghwbbf.irvjzy.R;

/* renamed from: W0.w */
/* loaded from: classes.dex */
public final class C0577w extends AbstractC0570p {

    /* renamed from: e */
    public final int f1852e;

    /* renamed from: f */
    public EditText f1853f;

    /* renamed from: g */
    public final ViewOnClickListenerC0022d f1854g;

    public C0577w(C0569o c0569o, int i2) {
        super(c0569o);
        this.f1852e = R.drawable.design_password_eye;
        this.f1854g = new ViewOnClickListenerC0022d(4, this);
        if (i2 != 0) {
            this.f1852e = i2;
        }
    }

    @Override // p064W0.AbstractC0570p
    /* renamed from: b */
    public final void mo1372b() {
        m1374q();
    }

    @Override // p064W0.AbstractC0570p
    /* renamed from: c */
    public final int mo1334c() {
        return R.string.password_toggle_content_description;
    }

    @Override // p064W0.AbstractC0570p
    /* renamed from: d */
    public final int mo1335d() {
        return this.f1852e;
    }

    @Override // p064W0.AbstractC0570p
    /* renamed from: f */
    public final View.OnClickListener mo1337f() {
        return this.f1854g;
    }

    @Override // p064W0.AbstractC0570p
    /* renamed from: k */
    public final boolean mo1373k() {
        return true;
    }

    @Override // p064W0.AbstractC0570p
    /* renamed from: l */
    public final boolean mo1349l() {
        EditText editText = this.f1853f;
        return !(editText != null && (editText.getTransformationMethod() instanceof PasswordTransformationMethod));
    }

    @Override // p064W0.AbstractC0570p
    /* renamed from: m */
    public final void mo1339m(EditText editText) {
        this.f1853f = editText;
        m1374q();
    }

    @Override // p064W0.AbstractC0570p
    /* renamed from: r */
    public final void mo1341r() {
        EditText editText = this.f1853f;
        if (editText != null) {
            if (editText.getInputType() == 16 || editText.getInputType() == 128 || editText.getInputType() == 144 || editText.getInputType() == 224) {
                this.f1853f.setTransformationMethod(PasswordTransformationMethod.getInstance());
            }
        }
    }

    @Override // p064W0.AbstractC0570p
    /* renamed from: s */
    public final void mo1342s() {
        EditText editText = this.f1853f;
        if (editText != null) {
            editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }
}
