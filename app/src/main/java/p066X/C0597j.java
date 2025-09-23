package p066X;

import android.graphics.Rect;
import android.text.method.TransformationMethod;
import android.view.View;
import androidx.emoji2.text.C0671j;

/* renamed from: X.j */
/* loaded from: classes.dex */
public final class C0597j implements TransformationMethod {

    /* renamed from: a */
    public final TransformationMethod f1906a;

    public C0597j(TransformationMethod transformationMethod) {
        this.f1906a = transformationMethod;
    }

    @Override // android.text.method.TransformationMethod
    public final CharSequence getTransformation(CharSequence charSequence, View view) {
        if (view.isInEditMode()) {
            return charSequence;
        }
        TransformationMethod transformationMethod = this.f1906a;
        if (transformationMethod != null) {
            charSequence = transformationMethod.getTransformation(charSequence, view);
        }
        if (charSequence == null || C0671j.m1625a().m1626b() != 1) {
            return charSequence;
        }
        C0671j c0671jM1625a = C0671j.m1625a();
        c0671jM1625a.getClass();
        return c0671jM1625a.m1629e(charSequence, 0, charSequence.length());
    }

    @Override // android.text.method.TransformationMethod
    public final void onFocusChanged(View view, CharSequence charSequence, boolean z2, int i2, Rect rect) {
        TransformationMethod transformationMethod = this.f1906a;
        if (transformationMethod != null) {
            transformationMethod.onFocusChanged(view, charSequence, z2, i2, rect);
        }
    }
}
