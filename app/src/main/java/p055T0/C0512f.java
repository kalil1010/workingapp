package p055T0;

import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import p029K0.C0301a;

/* renamed from: T0.f */
/* loaded from: classes.dex */
public class C0512f extends Drawable.ConstantState {

    /* renamed from: a */
    public C0517k f1584a;

    /* renamed from: b */
    public C0301a f1585b;

    /* renamed from: c */
    public ColorStateList f1586c;

    /* renamed from: d */
    public ColorStateList f1587d;

    /* renamed from: e */
    public ColorStateList f1588e;

    /* renamed from: f */
    public PorterDuff.Mode f1589f;

    /* renamed from: g */
    public Rect f1590g;

    /* renamed from: h */
    public final float f1591h;

    /* renamed from: i */
    public float f1592i;

    /* renamed from: j */
    public float f1593j;

    /* renamed from: k */
    public int f1594k;

    /* renamed from: l */
    public float f1595l;

    /* renamed from: m */
    public float f1596m;

    /* renamed from: n */
    public int f1597n;

    /* renamed from: o */
    public int f1598o;

    /* renamed from: p */
    public final Paint.Style f1599p;

    public C0512f(C0517k c0517k) {
        this.f1586c = null;
        this.f1587d = null;
        this.f1588e = null;
        this.f1589f = PorterDuff.Mode.SRC_IN;
        this.f1590g = null;
        this.f1591h = 1.0f;
        this.f1592i = 1.0f;
        this.f1594k = 255;
        this.f1595l = 0.0f;
        this.f1596m = 0.0f;
        this.f1597n = 0;
        this.f1598o = 0;
        this.f1599p = Paint.Style.FILL_AND_STROKE;
        this.f1584a = c0517k;
        this.f1585b = null;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable() {
        C0513g c0513g = new C0513g(this);
        c0513g.f1605e = true;
        return c0513g;
    }

    public C0512f(C0512f c0512f) {
        this.f1586c = null;
        this.f1587d = null;
        this.f1588e = null;
        this.f1589f = PorterDuff.Mode.SRC_IN;
        this.f1590g = null;
        this.f1591h = 1.0f;
        this.f1592i = 1.0f;
        this.f1594k = 255;
        this.f1595l = 0.0f;
        this.f1596m = 0.0f;
        this.f1597n = 0;
        this.f1598o = 0;
        this.f1599p = Paint.Style.FILL_AND_STROKE;
        this.f1584a = c0512f.f1584a;
        this.f1585b = c0512f.f1585b;
        this.f1593j = c0512f.f1593j;
        this.f1586c = c0512f.f1586c;
        this.f1587d = c0512f.f1587d;
        this.f1589f = c0512f.f1589f;
        this.f1588e = c0512f.f1588e;
        this.f1594k = c0512f.f1594k;
        this.f1591h = c0512f.f1591h;
        this.f1598o = c0512f.f1598o;
        this.f1592i = c0512f.f1592i;
        this.f1595l = c0512f.f1595l;
        this.f1596m = c0512f.f1596m;
        this.f1597n = c0512f.f1597n;
        this.f1599p = c0512f.f1599p;
        if (c0512f.f1590g != null) {
            this.f1590g = new Rect(c0512f.f1590g);
        }
    }
}
