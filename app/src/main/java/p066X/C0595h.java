package p066X;

import android.widget.EditText;
import androidx.emoji2.text.AbstractC0669h;
import java.lang.ref.WeakReference;

/* renamed from: X.h */
/* loaded from: classes.dex */
public final class C0595h extends AbstractC0669h {

    /* renamed from: a */
    public final WeakReference f1902a;

    public C0595h(EditText editText) {
        this.f1902a = new WeakReference(editText);
    }

    @Override // androidx.emoji2.text.AbstractC0669h
    /* renamed from: a */
    public final void mo1397a() {
        C0596i.m1402a((EditText) this.f1902a.get(), 1);
    }
}
