package p043P0;

import android.R;
import android.content.res.ColorStateList;
import p033L1.AbstractC0364l;
import p045Q.AbstractC0438b;
import p105j.C1027C;

/* renamed from: P0.a */
/* loaded from: classes.dex */
public final class C0432a extends C1027C {

    /* renamed from: g */
    public static final int[][] f1318g = {new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{R.attr.state_enabled, -16842912}, new int[]{-16842910, R.attr.state_checked}, new int[]{-16842910, -16842912}};

    /* renamed from: e */
    public ColorStateList f1319e;

    /* renamed from: f */
    public boolean f1320f;

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f1319e == null) {
            int iM983G = AbstractC0364l.m983G(this, tkbmmn.ghwbbf.irvjzy.R.attr.colorControlActivated);
            int iM983G2 = AbstractC0364l.m983G(this, tkbmmn.ghwbbf.irvjzy.R.attr.colorOnSurface);
            int iM983G3 = AbstractC0364l.m983G(this, tkbmmn.ghwbbf.irvjzy.R.attr.colorSurface);
            this.f1319e = new ColorStateList(f1318g, new int[]{AbstractC0364l.m990Q(iM983G3, iM983G, 1.0f), AbstractC0364l.m990Q(iM983G3, iM983G2, 0.54f), AbstractC0364l.m990Q(iM983G3, iM983G2, 0.38f), AbstractC0364l.m990Q(iM983G3, iM983G2, 0.38f)});
        }
        return this.f1319e;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f1320f && AbstractC0438b.m1102a(this) == null) {
            setUseMaterialThemeColors(true);
        }
    }

    public void setUseMaterialThemeColors(boolean z2) {
        this.f1320f = z2;
        if (z2) {
            AbstractC0438b.m1104c(this, getMaterialThemeColorsTintList());
        } else {
            AbstractC0438b.m1104c(this, null);
        }
    }
}
