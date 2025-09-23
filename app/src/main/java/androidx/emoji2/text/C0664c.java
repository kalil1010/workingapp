package androidx.emoji2.text;

import android.content.pm.PackageManager;
import android.content.pm.Signature;
import p055T0.C0511e;

/* renamed from: androidx.emoji2.text.c */
/* loaded from: classes.dex */
public final class C0664c extends C0511e {
    @Override // p055T0.C0511e
    /* renamed from: f */
    public final Signature[] mo1279f(PackageManager packageManager, String str) {
        return packageManager.getPackageInfo(str, 64).signatures;
    }
}
