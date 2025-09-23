package p055T0;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Looper;
import android.util.AttributeSet;
import java.util.BitSet;
import java.util.Objects;
import p001A0.C0004c;
import p006C.AbstractC0069a;
import p026J0.AbstractC0216a;
import p026J0.AbstractC0218c;
import p029K0.C0301a;
import p033L1.AbstractC0364l;
import p052S0.C0499a;

/* renamed from: T0.g */
/* loaded from: classes.dex */
public class C0513g extends Drawable implements InterfaceC0528v {

    /* renamed from: w */
    public static final Paint f1600w;

    /* renamed from: a */
    public C0512f f1601a;

    /* renamed from: b */
    public final AbstractC0526t[] f1602b;

    /* renamed from: c */
    public final AbstractC0526t[] f1603c;

    /* renamed from: d */
    public final BitSet f1604d;

    /* renamed from: e */
    public boolean f1605e;

    /* renamed from: f */
    public final Matrix f1606f;

    /* renamed from: g */
    public final Path f1607g;

    /* renamed from: h */
    public final Path f1608h;

    /* renamed from: i */
    public final RectF f1609i;

    /* renamed from: j */
    public final RectF f1610j;

    /* renamed from: k */
    public final Region f1611k;

    /* renamed from: l */
    public final Region f1612l;

    /* renamed from: m */
    public C0517k f1613m;

    /* renamed from: n */
    public final Paint f1614n;

    /* renamed from: o */
    public final Paint f1615o;

    /* renamed from: p */
    public final C0499a f1616p;

    /* renamed from: q */
    public final C0004c f1617q;

    /* renamed from: r */
    public final C0519m f1618r;

    /* renamed from: s */
    public PorterDuffColorFilter f1619s;

    /* renamed from: t */
    public PorterDuffColorFilter f1620t;

    /* renamed from: u */
    public final RectF f1621u;

    /* renamed from: v */
    public final boolean f1622v;

    static {
        Paint paint = new Paint(1);
        f1600w = paint;
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
    }

    public C0513g() {
        this(new C0517k());
    }

    /* renamed from: a */
    public final void m1281a(RectF rectF, Path path) {
        C0512f c0512f = this.f1601a;
        this.f1618r.m1301a(c0512f.f1584a, c0512f.f1592i, rectF, this.f1617q, path);
        if (this.f1601a.f1591h != 1.0f) {
            Matrix matrix = this.f1606f;
            matrix.reset();
            float f = this.f1601a.f1591h;
            matrix.setScale(f, f, rectF.width() / 2.0f, rectF.height() / 2.0f);
            path.transform(matrix);
        }
        path.computeBounds(this.f1621u, true);
    }

    /* renamed from: b */
    public final int m1282b(int i2) {
        int i3;
        C0512f c0512f = this.f1601a;
        float f = c0512f.f1596m + 0.0f + c0512f.f1595l;
        C0301a c0301a = c0512f.f1585b;
        if (c0301a == null || !c0301a.f922a || AbstractC0069a.m195d(i2, 255) != c0301a.f925d) {
            return i2;
        }
        float fMin = (c0301a.f926e <= 0.0f || f <= 0.0f) ? 0.0f : Math.min(((((float) Math.log1p(f / r4)) * 4.5f) + 2.0f) / 100.0f, 1.0f);
        int iAlpha = Color.alpha(i2);
        int iM990Q = AbstractC0364l.m990Q(AbstractC0069a.m195d(i2, 255), c0301a.f923b, fMin);
        if (fMin > 0.0f && (i3 = c0301a.f924c) != 0) {
            iM990Q = AbstractC0069a.m193b(AbstractC0069a.m195d(i3, C0301a.f921f), iM990Q);
        }
        return AbstractC0069a.m195d(iM990Q, iAlpha);
    }

    /* renamed from: c */
    public final void m1283c(Canvas canvas) {
        this.f1604d.cardinality();
        int i2 = this.f1601a.f1598o;
        Path path = this.f1607g;
        C0499a c0499a = this.f1616p;
        if (i2 != 0) {
            canvas.drawPath(path, c0499a.f1526a);
        }
        for (int i3 = 0; i3 < 4; i3++) {
            AbstractC0526t abstractC0526t = this.f1602b[i3];
            int i4 = this.f1601a.f1597n;
            Matrix matrix = AbstractC0526t.f1677b;
            abstractC0526t.mo1303a(matrix, c0499a, i4, canvas);
            this.f1603c[i3].mo1303a(matrix, c0499a, this.f1601a.f1597n, canvas);
        }
        if (this.f1622v) {
            double d3 = 0;
            int iSin = (int) (Math.sin(Math.toRadians(d3)) * this.f1601a.f1598o);
            int iCos = (int) (Math.cos(Math.toRadians(d3)) * this.f1601a.f1598o);
            canvas.translate(-iSin, -iCos);
            canvas.drawPath(path, f1600w);
            canvas.translate(iSin, iCos);
        }
    }

    /* renamed from: d */
    public final void m1284d(Canvas canvas, Paint paint, Path path, C0517k c0517k, RectF rectF) {
        if (!c0517k.m1299d(rectF)) {
            canvas.drawPath(path, paint);
        } else {
            float fMo1270a = c0517k.f1641f.mo1270a(rectF) * this.f1601a.f1592i;
            canvas.drawRoundRect(rectF, fMo1270a, fMo1270a, paint);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Paint paint = this.f1614n;
        paint.setColorFilter(this.f1619s);
        int alpha = paint.getAlpha();
        int i2 = this.f1601a.f1594k;
        paint.setAlpha(((i2 + (i2 >>> 7)) * alpha) >>> 8);
        Paint paint2 = this.f1615o;
        paint2.setColorFilter(this.f1620t);
        paint2.setStrokeWidth(this.f1601a.f1593j);
        int alpha2 = paint2.getAlpha();
        int i3 = this.f1601a.f1594k;
        paint2.setAlpha(((i3 + (i3 >>> 7)) * alpha2) >>> 8);
        boolean z2 = this.f1605e;
        Path path = this.f1607g;
        if (z2) {
            float f = -(m1287g() ? paint2.getStrokeWidth() / 2.0f : 0.0f);
            C0517k c0517k = this.f1601a.f1584a;
            C0516j c0516jM1300e = c0517k.m1300e();
            InterfaceC0509c c0508b = c0517k.f1640e;
            if (!(c0508b instanceof C0514h)) {
                c0508b = new C0508b(f, c0508b);
            }
            c0516jM1300e.f1628e = c0508b;
            InterfaceC0509c c0508b2 = c0517k.f1641f;
            if (!(c0508b2 instanceof C0514h)) {
                c0508b2 = new C0508b(f, c0508b2);
            }
            c0516jM1300e.f1629f = c0508b2;
            InterfaceC0509c c0508b3 = c0517k.f1643h;
            if (!(c0508b3 instanceof C0514h)) {
                c0508b3 = new C0508b(f, c0508b3);
            }
            c0516jM1300e.f1631h = c0508b3;
            InterfaceC0509c c0508b4 = c0517k.f1642g;
            if (!(c0508b4 instanceof C0514h)) {
                c0508b4 = new C0508b(f, c0508b4);
            }
            c0516jM1300e.f1630g = c0508b4;
            C0517k c0517kM1295a = c0516jM1300e.m1295a();
            this.f1613m = c0517kM1295a;
            float f2 = this.f1601a.f1592i;
            RectF rectF = this.f1610j;
            rectF.set(m1286f());
            float strokeWidth = m1287g() ? paint2.getStrokeWidth() / 2.0f : 0.0f;
            rectF.inset(strokeWidth, strokeWidth);
            this.f1618r.m1301a(c0517kM1295a, f2, rectF, null, this.f1608h);
            m1281a(m1286f(), path);
            this.f1605e = false;
        }
        C0512f c0512f = this.f1601a;
        c0512f.getClass();
        if (c0512f.f1597n > 0) {
            int i4 = Build.VERSION.SDK_INT;
            if (!this.f1601a.f1584a.m1299d(m1286f()) && !path.isConvex() && i4 < 29) {
                canvas.save();
                double d3 = 0;
                canvas.translate((int) (Math.sin(Math.toRadians(d3)) * this.f1601a.f1598o), (int) (Math.cos(Math.toRadians(d3)) * this.f1601a.f1598o));
                if (this.f1622v) {
                    RectF rectF2 = this.f1621u;
                    int iWidth = (int) (rectF2.width() - getBounds().width());
                    int iHeight = (int) (rectF2.height() - getBounds().height());
                    if (iWidth < 0 || iHeight < 0) {
                        throw new IllegalStateException("Invalid shadow bounds. Check that the treatments result in a valid path.");
                    }
                    Bitmap bitmapCreateBitmap = Bitmap.createBitmap((this.f1601a.f1597n * 2) + ((int) rectF2.width()) + iWidth, (this.f1601a.f1597n * 2) + ((int) rectF2.height()) + iHeight, Bitmap.Config.ARGB_8888);
                    Canvas canvas2 = new Canvas(bitmapCreateBitmap);
                    float f3 = (getBounds().left - this.f1601a.f1597n) - iWidth;
                    float f4 = (getBounds().top - this.f1601a.f1597n) - iHeight;
                    canvas2.translate(-f3, -f4);
                    m1283c(canvas2);
                    canvas.drawBitmap(bitmapCreateBitmap, f3, f4, (Paint) null);
                    bitmapCreateBitmap.recycle();
                    canvas.restore();
                } else {
                    m1283c(canvas);
                    canvas.restore();
                }
            }
        }
        C0512f c0512f2 = this.f1601a;
        Paint.Style style = c0512f2.f1599p;
        if (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.FILL) {
            m1284d(canvas, paint, path, c0512f2.f1584a, m1286f());
        }
        if (m1287g()) {
            mo1285e(canvas);
        }
        paint.setAlpha(alpha);
        paint2.setAlpha(alpha2);
    }

    /* renamed from: e */
    public void mo1285e(Canvas canvas) {
        Paint paint = this.f1615o;
        Path path = this.f1608h;
        C0517k c0517k = this.f1613m;
        RectF rectF = this.f1610j;
        rectF.set(m1286f());
        float strokeWidth = m1287g() ? paint.getStrokeWidth() / 2.0f : 0.0f;
        rectF.inset(strokeWidth, strokeWidth);
        m1284d(canvas, paint, path, c0517k, rectF);
    }

    /* renamed from: f */
    public final RectF m1286f() {
        RectF rectF = this.f1609i;
        rectF.set(getBounds());
        return rectF;
    }

    /* renamed from: g */
    public final boolean m1287g() {
        Paint.Style style = this.f1601a.f1599p;
        return (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.STROKE) && this.f1615o.getStrokeWidth() > 0.0f;
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f1601a.f1594k;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        return this.f1601a;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        this.f1601a.getClass();
        if (this.f1601a.f1584a.m1299d(m1286f())) {
            outline.setRoundRect(getBounds(), this.f1601a.f1584a.f1640e.mo1270a(m1286f()) * this.f1601a.f1592i);
            return;
        }
        RectF rectFM1286f = m1286f();
        Path path = this.f1607g;
        m1281a(rectFM1286f, path);
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 30) {
            AbstractC0218c.m598a(outline, path);
            return;
        }
        if (i2 >= 29) {
            try {
                AbstractC0216a.m567a(outline, path);
            } catch (IllegalArgumentException unused) {
            }
        } else if (path.isConvex()) {
            AbstractC0216a.m567a(outline, path);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        Rect rect2 = this.f1601a.f1590g;
        if (rect2 == null) {
            return super.getPadding(rect);
        }
        rect.set(rect2);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final Region getTransparentRegion() {
        Rect bounds = getBounds();
        Region region = this.f1611k;
        region.set(bounds);
        RectF rectFM1286f = m1286f();
        Path path = this.f1607g;
        m1281a(rectFM1286f, path);
        Region region2 = this.f1612l;
        region2.setPath(path, region);
        region.op(region2, Region.Op.DIFFERENCE);
        return region;
    }

    /* renamed from: h */
    public final void m1288h(Context context) {
        this.f1601a.f1585b = new C0301a(context);
        m1293m();
    }

    /* renamed from: i */
    public final void m1289i(float f) {
        C0512f c0512f = this.f1601a;
        if (c0512f.f1596m != f) {
            c0512f.f1596m = f;
            m1293m();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        this.f1605e = true;
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        if (super.isStateful()) {
            return true;
        }
        ColorStateList colorStateList = this.f1601a.f1588e;
        if (colorStateList != null && colorStateList.isStateful()) {
            return true;
        }
        this.f1601a.getClass();
        ColorStateList colorStateList2 = this.f1601a.f1587d;
        if (colorStateList2 != null && colorStateList2.isStateful()) {
            return true;
        }
        ColorStateList colorStateList3 = this.f1601a.f1586c;
        return colorStateList3 != null && colorStateList3.isStateful();
    }

    /* renamed from: j */
    public final void m1290j(ColorStateList colorStateList) {
        C0512f c0512f = this.f1601a;
        if (c0512f.f1586c != colorStateList) {
            c0512f.f1586c = colorStateList;
            onStateChange(getState());
        }
    }

    /* renamed from: k */
    public final boolean m1291k(int[] iArr) {
        boolean z2;
        Paint paint;
        int color;
        int colorForState;
        Paint paint2;
        int color2;
        int colorForState2;
        if (this.f1601a.f1586c == null || color2 == (colorForState2 = this.f1601a.f1586c.getColorForState(iArr, (color2 = (paint2 = this.f1614n).getColor())))) {
            z2 = false;
        } else {
            paint2.setColor(colorForState2);
            z2 = true;
        }
        if (this.f1601a.f1587d == null || color == (colorForState = this.f1601a.f1587d.getColorForState(iArr, (color = (paint = this.f1615o).getColor())))) {
            return z2;
        }
        paint.setColor(colorForState);
        return true;
    }

    /* renamed from: l */
    public final boolean m1292l() {
        PorterDuffColorFilter porterDuffColorFilter;
        PorterDuffColorFilter porterDuffColorFilter2 = this.f1619s;
        PorterDuffColorFilter porterDuffColorFilter3 = this.f1620t;
        C0512f c0512f = this.f1601a;
        ColorStateList colorStateList = c0512f.f1588e;
        PorterDuff.Mode mode = c0512f.f1589f;
        Paint paint = this.f1614n;
        if (colorStateList == null || mode == null) {
            int color = paint.getColor();
            int iM1282b = m1282b(color);
            porterDuffColorFilter = iM1282b != color ? new PorterDuffColorFilter(iM1282b, PorterDuff.Mode.SRC_IN) : null;
        } else {
            porterDuffColorFilter = new PorterDuffColorFilter(m1282b(colorStateList.getColorForState(getState(), 0)), mode);
        }
        this.f1619s = porterDuffColorFilter;
        this.f1601a.getClass();
        this.f1620t = null;
        this.f1601a.getClass();
        return (Objects.equals(porterDuffColorFilter2, this.f1619s) && Objects.equals(porterDuffColorFilter3, this.f1620t)) ? false : true;
    }

    /* renamed from: m */
    public final void m1293m() {
        C0512f c0512f = this.f1601a;
        float f = c0512f.f1596m + 0.0f;
        c0512f.f1597n = (int) Math.ceil(0.75f * f);
        this.f1601a.f1598o = (int) Math.ceil(f * 0.25f);
        m1292l();
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        this.f1601a = new C0512f(this.f1601a);
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        this.f1605e = true;
        super.onBoundsChange(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        boolean z2 = m1291k(iArr) || m1292l();
        if (z2) {
            invalidateSelf();
        }
        return z2;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i2) {
        C0512f c0512f = this.f1601a;
        if (c0512f.f1594k != i2) {
            c0512f.f1594k = i2;
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f1601a.getClass();
        super.invalidateSelf();
    }

    @Override // p055T0.InterfaceC0528v
    public final void setShapeAppearanceModel(C0517k c0517k) {
        this.f1601a.f1584a = c0517k;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i2) {
        setTintList(ColorStateList.valueOf(i2));
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.f1601a.f1588e = colorStateList;
        m1292l();
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        C0512f c0512f = this.f1601a;
        if (c0512f.f1589f != mode) {
            c0512f.f1589f = mode;
            m1292l();
            super.invalidateSelf();
        }
    }

    public C0513g(Context context, AttributeSet attributeSet, int i2, int i3) {
        this(C0517k.m1297b(context, attributeSet, i2, i3).m1295a());
    }

    public C0513g(C0517k c0517k) {
        this(new C0512f(c0517k));
    }

    public C0513g(C0512f c0512f) {
        C0519m c0519m;
        this.f1602b = new AbstractC0526t[4];
        this.f1603c = new AbstractC0526t[4];
        this.f1604d = new BitSet(8);
        this.f1606f = new Matrix();
        this.f1607g = new Path();
        this.f1608h = new Path();
        this.f1609i = new RectF();
        this.f1610j = new RectF();
        this.f1611k = new Region();
        this.f1612l = new Region();
        Paint paint = new Paint(1);
        this.f1614n = paint;
        Paint paint2 = new Paint(1);
        this.f1615o = paint2;
        this.f1616p = new C0499a();
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            c0519m = AbstractC0518l.f1648a;
        } else {
            c0519m = new C0519m();
        }
        this.f1618r = c0519m;
        this.f1621u = new RectF();
        this.f1622v = true;
        this.f1601a = c0512f;
        paint2.setStyle(Paint.Style.STROKE);
        paint.setStyle(Paint.Style.FILL);
        m1292l();
        m1291k(getState());
        this.f1617q = new C0004c(18, this);
    }
}
