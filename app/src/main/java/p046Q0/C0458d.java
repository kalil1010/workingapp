package p046Q0;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.util.TypedValue;
import p003B.AbstractC0060p;
import p033L1.AbstractC0356d;
import p033L1.AbstractC0364l;
import p093e2.AbstractC0901d;
import p145x0.AbstractC1395a;

/* renamed from: Q0.d */
/* loaded from: classes.dex */
public final class C0458d {

    /* renamed from: a */
    public final ColorStateList f1368a;

    /* renamed from: b */
    public final String f1369b;

    /* renamed from: c */
    public final int f1370c;

    /* renamed from: d */
    public final int f1371d;

    /* renamed from: e */
    public final float f1372e;

    /* renamed from: f */
    public final float f1373f;

    /* renamed from: g */
    public final float f1374g;

    /* renamed from: h */
    public final boolean f1375h;

    /* renamed from: i */
    public final float f1376i;

    /* renamed from: j */
    public final ColorStateList f1377j;

    /* renamed from: k */
    public float f1378k;

    /* renamed from: l */
    public final int f1379l;

    /* renamed from: m */
    public boolean f1380m = false;

    /* renamed from: n */
    public Typeface f1381n;

    public C0458d(Context context, int i2) throws Resources.NotFoundException {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i2, AbstractC1395a.f6028B);
        this.f1378k = typedArrayObtainStyledAttributes.getDimension(0, 0.0f);
        this.f1377j = AbstractC0901d.m2318t(context, typedArrayObtainStyledAttributes, 3);
        AbstractC0901d.m2318t(context, typedArrayObtainStyledAttributes, 4);
        AbstractC0901d.m2318t(context, typedArrayObtainStyledAttributes, 5);
        this.f1370c = typedArrayObtainStyledAttributes.getInt(2, 0);
        this.f1371d = typedArrayObtainStyledAttributes.getInt(1, 1);
        int i3 = typedArrayObtainStyledAttributes.hasValue(12) ? 12 : 10;
        this.f1379l = typedArrayObtainStyledAttributes.getResourceId(i3, 0);
        this.f1369b = typedArrayObtainStyledAttributes.getString(i3);
        typedArrayObtainStyledAttributes.getBoolean(14, false);
        this.f1368a = AbstractC0901d.m2318t(context, typedArrayObtainStyledAttributes, 6);
        this.f1372e = typedArrayObtainStyledAttributes.getFloat(7, 0.0f);
        this.f1373f = typedArrayObtainStyledAttributes.getFloat(8, 0.0f);
        this.f1374g = typedArrayObtainStyledAttributes.getFloat(9, 0.0f);
        typedArrayObtainStyledAttributes.recycle();
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(i2, AbstractC1395a.f6048q);
        this.f1375h = typedArrayObtainStyledAttributes2.hasValue(0);
        this.f1376i = typedArrayObtainStyledAttributes2.getFloat(0, 0.0f);
        typedArrayObtainStyledAttributes2.recycle();
    }

    /* renamed from: a */
    public final void m1139a() {
        String str;
        Typeface typeface = this.f1381n;
        int i2 = this.f1370c;
        if (typeface == null && (str = this.f1369b) != null) {
            this.f1381n = Typeface.create(str, i2);
        }
        if (this.f1381n == null) {
            int i3 = this.f1371d;
            if (i3 == 1) {
                this.f1381n = Typeface.SANS_SERIF;
            } else if (i3 == 2) {
                this.f1381n = Typeface.SERIF;
            } else if (i3 != 3) {
                this.f1381n = Typeface.DEFAULT;
            } else {
                this.f1381n = Typeface.MONOSPACE;
            }
            this.f1381n = Typeface.create(this.f1381n, i2);
        }
    }

    /* renamed from: b */
    public final Typeface m1140b(Context context) {
        if (this.f1380m) {
            return this.f1381n;
        }
        if (!context.isRestricted()) {
            try {
                Typeface typefaceM186a = AbstractC0060p.m186a(context, this.f1379l);
                this.f1381n = typefaceM186a;
                if (typefaceM186a != null) {
                    this.f1381n = Typeface.create(typefaceM186a, this.f1370c);
                }
            } catch (Resources.NotFoundException | UnsupportedOperationException | Exception unused) {
            }
        }
        m1139a();
        this.f1380m = true;
        return this.f1381n;
    }

    /* renamed from: c */
    public final void m1141c(Context context, AbstractC0356d abstractC0356d) {
        if (m1142d(context)) {
            m1140b(context);
        } else {
            m1139a();
        }
        int i2 = this.f1379l;
        if (i2 == 0) {
            this.f1380m = true;
        }
        if (this.f1380m) {
            abstractC0356d.mo428z(this.f1381n, true);
            return;
        }
        try {
            C0456b c0456b = new C0456b(this, abstractC0356d);
            ThreadLocal threadLocal = AbstractC0060p.f137a;
            if (context.isRestricted()) {
                c0456b.m171a(-4);
            } else {
                AbstractC0060p.m187b(context, i2, new TypedValue(), 0, c0456b, false, false);
            }
        } catch (Resources.NotFoundException unused) {
            this.f1380m = true;
            abstractC0356d.mo427y(1);
        } catch (Exception unused2) {
            this.f1380m = true;
            abstractC0356d.mo427y(-3);
        }
    }

    /* renamed from: d */
    public final boolean m1142d(Context context) throws Resources.NotFoundException {
        Typeface typefaceM187b = null;
        int i2 = this.f1379l;
        if (i2 != 0) {
            ThreadLocal threadLocal = AbstractC0060p.f137a;
            if (!context.isRestricted()) {
                typefaceM187b = AbstractC0060p.m187b(context, i2, new TypedValue(), 0, null, false, true);
            }
        }
        return typefaceM187b != null;
    }

    /* renamed from: e */
    public final void m1143e(Context context, TextPaint textPaint, AbstractC0356d abstractC0356d) {
        m1144f(context, textPaint, abstractC0356d);
        ColorStateList colorStateList = this.f1377j;
        textPaint.setColor(colorStateList != null ? colorStateList.getColorForState(textPaint.drawableState, colorStateList.getDefaultColor()) : -16777216);
        ColorStateList colorStateList2 = this.f1368a;
        textPaint.setShadowLayer(this.f1374g, this.f1372e, this.f1373f, colorStateList2 != null ? colorStateList2.getColorForState(textPaint.drawableState, colorStateList2.getDefaultColor()) : 0);
    }

    /* renamed from: f */
    public final void m1144f(Context context, TextPaint textPaint, AbstractC0356d abstractC0356d) {
        if (m1142d(context)) {
            m1145g(context, textPaint, m1140b(context));
            return;
        }
        m1139a();
        m1145g(context, textPaint, this.f1381n);
        m1141c(context, new C0457c(this, context, textPaint, abstractC0356d));
    }

    /* renamed from: g */
    public final void m1145g(Context context, TextPaint textPaint, Typeface typeface) {
        Typeface typefaceM992S = AbstractC0364l.m992S(context.getResources().getConfiguration(), typeface);
        if (typefaceM992S != null) {
            typeface = typefaceM992S;
        }
        textPaint.setTypeface(typeface);
        int i2 = (~typeface.getStyle()) & this.f1370c;
        textPaint.setFakeBoldText((i2 & 1) != 0);
        textPaint.setTextSkewX((i2 & 2) != 0 ? -0.25f : 0.0f);
        textPaint.setTextSize(this.f1378k);
        if (this.f1375h) {
            textPaint.setLetterSpacing(this.f1376i);
        }
    }
}
