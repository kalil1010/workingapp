package p066X;

import android.text.Editable;
import android.text.method.KeyListener;
import android.text.method.MetaKeyKeyListener;
import android.view.KeyEvent;
import android.view.View;
import p002A1.C0019a;
import p055T0.C0511e;

/* renamed from: X.e */
/* loaded from: classes.dex */
public final class C0592e implements KeyListener {

    /* renamed from: a */
    public final KeyListener f1896a;

    /* renamed from: b */
    public final C0511e f1897b;

    public C0592e(KeyListener keyListener) {
        C0511e c0511e = new C0511e(13);
        this.f1896a = keyListener;
        this.f1897b = c0511e;
    }

    @Override // android.text.method.KeyListener
    public final void clearMetaKeyState(View view, Editable editable, int i2) {
        this.f1896a.clearMetaKeyState(view, editable, i2);
    }

    @Override // android.text.method.KeyListener
    public final int getInputType() {
        return this.f1896a.getInputType();
    }

    @Override // android.text.method.KeyListener
    public final boolean onKeyDown(View view, Editable editable, int i2, KeyEvent keyEvent) {
        boolean z2;
        this.f1897b.getClass();
        if (i2 != 67 ? i2 != 112 ? false : C0019a.m53c(editable, keyEvent, true) : C0019a.m53c(editable, keyEvent, false)) {
            MetaKeyKeyListener.adjustMetaAfterKeypress(editable);
            z2 = true;
        } else {
            z2 = false;
        }
        return z2 || this.f1896a.onKeyDown(view, editable, i2, keyEvent);
    }

    @Override // android.text.method.KeyListener
    public final boolean onKeyOther(View view, Editable editable, KeyEvent keyEvent) {
        return this.f1896a.onKeyOther(view, editable, keyEvent);
    }

    @Override // android.text.method.KeyListener
    public final boolean onKeyUp(View view, Editable editable, int i2, KeyEvent keyEvent) {
        return this.f1896a.onKeyUp(view, editable, i2, keyEvent);
    }
}
