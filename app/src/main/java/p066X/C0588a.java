package p066X;

import android.text.Editable;
import androidx.emoji2.text.C0679r;

/* renamed from: X.a */
/* loaded from: classes.dex */
public final class C0588a extends Editable.Factory {

    /* renamed from: a */
    public static final Object f1887a = new Object();

    /* renamed from: b */
    public static volatile C0588a f1888b;

    /* renamed from: c */
    public static Class f1889c;

    @Override // android.text.Editable.Factory
    public final Editable newEditable(CharSequence charSequence) {
        Class cls = f1889c;
        return cls != null ? new C0679r(cls, charSequence) : super.newEditable(charSequence);
    }
}
