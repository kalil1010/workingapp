package p105j;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import androidx.appcompat.widget.Toolbar;

/* renamed from: j.m1 */
/* loaded from: classes.dex */
public final class C1112m1 implements InterfaceC1114n0 {

    /* renamed from: a */
    public Toolbar f4568a;

    /* renamed from: b */
    public int f4569b;

    /* renamed from: c */
    public View f4570c;

    /* renamed from: d */
    public Drawable f4571d;

    /* renamed from: e */
    public Drawable f4572e;

    /* renamed from: f */
    public Drawable f4573f;

    /* renamed from: g */
    public boolean f4574g;

    /* renamed from: h */
    public CharSequence f4575h;

    /* renamed from: i */
    public CharSequence f4576i;

    /* renamed from: j */
    public CharSequence f4577j;

    /* renamed from: k */
    public Window.Callback f4578k;

    /* renamed from: l */
    public boolean f4579l;

    /* renamed from: m */
    public C1104k f4580m;

    /* renamed from: n */
    public int f4581n;

    /* renamed from: o */
    public Drawable f4582o;

    /* renamed from: a */
    public final void m2728a(int i2) {
        View view;
        int i3 = this.f4569b ^ i2;
        this.f4569b = i2;
        if (i3 != 0) {
            if ((i3 & 4) != 0) {
                if ((i2 & 4) != 0) {
                    m2729b();
                }
                int i4 = this.f4569b & 4;
                Toolbar toolbar = this.f4568a;
                if (i4 != 0) {
                    Drawable drawable = this.f4573f;
                    if (drawable == null) {
                        drawable = this.f4582o;
                    }
                    toolbar.setNavigationIcon(drawable);
                } else {
                    toolbar.setNavigationIcon((Drawable) null);
                }
            }
            if ((i3 & 3) != 0) {
                m2730c();
            }
            int i5 = i3 & 8;
            Toolbar toolbar2 = this.f4568a;
            if (i5 != 0) {
                if ((i2 & 8) != 0) {
                    toolbar2.setTitle(this.f4575h);
                    toolbar2.setSubtitle(this.f4576i);
                } else {
                    toolbar2.setTitle((CharSequence) null);
                    toolbar2.setSubtitle((CharSequence) null);
                }
            }
            if ((i3 & 16) == 0 || (view = this.f4570c) == null) {
                return;
            }
            if ((i2 & 16) != 0) {
                toolbar2.addView(view);
            } else {
                toolbar2.removeView(view);
            }
        }
    }

    /* renamed from: b */
    public final void m2729b() {
        if ((this.f4569b & 4) != 0) {
            boolean zIsEmpty = TextUtils.isEmpty(this.f4577j);
            Toolbar toolbar = this.f4568a;
            if (zIsEmpty) {
                toolbar.setNavigationContentDescription(this.f4581n);
            } else {
                toolbar.setNavigationContentDescription(this.f4577j);
            }
        }
    }

    /* renamed from: c */
    public final void m2730c() {
        Drawable drawable;
        int i2 = this.f4569b;
        if ((i2 & 2) == 0) {
            drawable = null;
        } else if ((i2 & 1) == 0 || (drawable = this.f4572e) == null) {
            drawable = this.f4571d;
        }
        this.f4568a.setLogo(drawable);
    }
}
