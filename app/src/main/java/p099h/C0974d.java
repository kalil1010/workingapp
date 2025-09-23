package p099h;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.view.LayoutInflater;
import tkbmmn.ghwbbf.irvjzy.R;

/* renamed from: h.d */
/* loaded from: classes.dex */
public final class C0974d extends ContextWrapper {

    /* renamed from: f */
    public static Configuration f4069f;

    /* renamed from: a */
    public int f4070a;

    /* renamed from: b */
    public Resources.Theme f4071b;

    /* renamed from: c */
    public LayoutInflater f4072c;

    /* renamed from: d */
    public Configuration f4073d;

    /* renamed from: e */
    public Resources f4074e;

    public C0974d(Context context, int i2) {
        super(context);
        this.f4070a = i2;
    }

    /* renamed from: a */
    public final void m2480a(Configuration configuration) {
        if (this.f4074e != null) {
            throw new IllegalStateException("getResources() or getAssets() has already been called");
        }
        if (this.f4073d != null) {
            throw new IllegalStateException("Override configuration has already been set");
        }
        this.f4073d = new Configuration(configuration);
    }

    @Override // android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    /* renamed from: b */
    public final void m2481b() {
        if (this.f4071b == null) {
            this.f4071b = getResources().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.f4071b.setTo(theme);
            }
        }
        this.f4071b.applyStyle(this.f4070a, true);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final AssetManager getAssets() {
        return getResources().getAssets();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    @Override // android.content.ContextWrapper, android.content.Context
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.content.res.Resources getResources() {
        /*
            r3 = this;
            android.content.res.Resources r0 = r3.f4074e
            if (r0 != 0) goto L38
            android.content.res.Configuration r0 = r3.f4073d
            if (r0 == 0) goto L32
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 26
            if (r1 < r2) goto L25
            android.content.res.Configuration r1 = p099h.C0974d.f4069f
            if (r1 != 0) goto L1c
            android.content.res.Configuration r1 = new android.content.res.Configuration
            r1.<init>()
            r2 = 0
            r1.fontScale = r2
            p099h.C0974d.f4069f = r1
        L1c:
            android.content.res.Configuration r1 = p099h.C0974d.f4069f
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L25
            goto L32
        L25:
            android.content.res.Configuration r0 = r3.f4073d
            android.content.Context r0 = p099h.AbstractC0973c.m2479a(r3, r0)
            android.content.res.Resources r0 = r0.getResources()
            r3.f4074e = r0
            goto L38
        L32:
            android.content.res.Resources r0 = super.getResources()
            r3.f4074e = r0
        L38:
            android.content.res.Resources r0 = r3.f4074e
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p099h.C0974d.getResources():android.content.res.Resources");
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Object getSystemService(String str) {
        if (!"layout_inflater".equals(str)) {
            return getBaseContext().getSystemService(str);
        }
        if (this.f4072c == null) {
            this.f4072c = LayoutInflater.from(getBaseContext()).cloneInContext(this);
        }
        return this.f4072c;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Resources.Theme getTheme() {
        Resources.Theme theme = this.f4071b;
        if (theme != null) {
            return theme;
        }
        if (this.f4070a == 0) {
            this.f4070a = R.style.Theme_AppCompat_Light;
        }
        m2481b();
        return this.f4071b;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void setTheme(int i2) {
        if (this.f4070a != i2) {
            this.f4070a = i2;
            m2481b();
        }
    }
}
