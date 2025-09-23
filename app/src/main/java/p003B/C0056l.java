package p003B;

import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;

/* renamed from: B.l */
/* loaded from: classes.dex */
public final class C0056l {

    /* renamed from: a */
    public final ColorStateList f129a;

    /* renamed from: b */
    public final Configuration f130b;

    /* renamed from: c */
    public final int f131c;

    public C0056l(ColorStateList colorStateList, Configuration configuration, Resources.Theme theme) {
        this.f129a = colorStateList;
        this.f130b = configuration;
        this.f131c = theme == null ? 0 : theme.hashCode();
    }
}
