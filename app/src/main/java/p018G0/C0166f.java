package p018G0;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import com.google.android.material.chip.Chip;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import p009D.AbstractC0098a;
import p009D.AbstractC0099b;
import p009D.InterfaceC0101d;
import p035M0.C0396y;
import p035M0.InterfaceC0395x;
import p046Q0.C0458d;
import p049R0.AbstractC0472a;
import p055T0.C0507a;
import p055T0.C0512f;
import p055T0.C0513g;
import p055T0.C0516j;
import p148y0.C1401b;

/* renamed from: G0.f */
/* loaded from: classes.dex */
public final class C0166f extends C0513g implements Drawable.Callback, InterfaceC0395x {

    /* renamed from: F0 */
    public static final int[] f545F0 = {R.attr.state_enabled};

    /* renamed from: G0 */
    public static final ShapeDrawable f546G0 = new ShapeDrawable(new OvalShape());

    /* renamed from: A */
    public float f547A;

    /* renamed from: A0 */
    public WeakReference f548A0;

    /* renamed from: B */
    public ColorStateList f549B;

    /* renamed from: B0 */
    public TextUtils.TruncateAt f550B0;

    /* renamed from: C */
    public float f551C;

    /* renamed from: C0 */
    public boolean f552C0;

    /* renamed from: D */
    public ColorStateList f553D;

    /* renamed from: D0 */
    public int f554D0;

    /* renamed from: E */
    public CharSequence f555E;

    /* renamed from: E0 */
    public boolean f556E0;

    /* renamed from: F */
    public boolean f557F;

    /* renamed from: G */
    public Drawable f558G;

    /* renamed from: H */
    public ColorStateList f559H;

    /* renamed from: I */
    public float f560I;

    /* renamed from: J */
    public boolean f561J;

    /* renamed from: K */
    public boolean f562K;

    /* renamed from: L */
    public Drawable f563L;

    /* renamed from: M */
    public RippleDrawable f564M;

    /* renamed from: N */
    public ColorStateList f565N;

    /* renamed from: O */
    public float f566O;

    /* renamed from: P */
    public SpannableStringBuilder f567P;

    /* renamed from: Q */
    public boolean f568Q;

    /* renamed from: R */
    public boolean f569R;

    /* renamed from: S */
    public Drawable f570S;

    /* renamed from: T */
    public ColorStateList f571T;

    /* renamed from: U */
    public C1401b f572U;

    /* renamed from: V */
    public C1401b f573V;

    /* renamed from: W */
    public float f574W;

    /* renamed from: X */
    public float f575X;

    /* renamed from: Y */
    public float f576Y;

    /* renamed from: Z */
    public float f577Z;

    /* renamed from: a0 */
    public float f578a0;

    /* renamed from: b0 */
    public float f579b0;

    /* renamed from: c0 */
    public float f580c0;

    /* renamed from: d0 */
    public float f581d0;

    /* renamed from: e0 */
    public final Context f582e0;

    /* renamed from: f0 */
    public final Paint f583f0;

    /* renamed from: g0 */
    public final Paint.FontMetrics f584g0;

    /* renamed from: h0 */
    public final RectF f585h0;

    /* renamed from: i0 */
    public final PointF f586i0;

    /* renamed from: j0 */
    public final Path f587j0;

    /* renamed from: k0 */
    public final C0396y f588k0;

    /* renamed from: l0 */
    public int f589l0;

    /* renamed from: m0 */
    public int f590m0;

    /* renamed from: n0 */
    public int f591n0;

    /* renamed from: o0 */
    public int f592o0;

    /* renamed from: p0 */
    public int f593p0;

    /* renamed from: q0 */
    public int f594q0;

    /* renamed from: r0 */
    public boolean f595r0;

    /* renamed from: s0 */
    public int f596s0;

    /* renamed from: t0 */
    public int f597t0;

    /* renamed from: u0 */
    public ColorFilter f598u0;

    /* renamed from: v0 */
    public PorterDuffColorFilter f599v0;

    /* renamed from: w0 */
    public ColorStateList f600w0;

    /* renamed from: x */
    public ColorStateList f601x;

    /* renamed from: x0 */
    public PorterDuff.Mode f602x0;

    /* renamed from: y */
    public ColorStateList f603y;

    /* renamed from: y0 */
    public int[] f604y0;

    /* renamed from: z */
    public float f605z;

    /* renamed from: z0 */
    public ColorStateList f606z0;

    public C0166f(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, tkbmmn.ghwbbf.irvjzy.R.attr.chipStyle, tkbmmn.ghwbbf.irvjzy.R.style.Widget_MaterialComponents_Chip_Action);
        this.f547A = -1.0f;
        this.f583f0 = new Paint(1);
        this.f584g0 = new Paint.FontMetrics();
        this.f585h0 = new RectF();
        this.f586i0 = new PointF();
        this.f587j0 = new Path();
        this.f597t0 = 255;
        this.f602x0 = PorterDuff.Mode.SRC_IN;
        this.f548A0 = new WeakReference(null);
        m1288h(context);
        this.f582e0 = context;
        C0396y c0396y = new C0396y(this);
        this.f588k0 = c0396y;
        this.f555E = "";
        c0396y.f1268a.density = context.getResources().getDisplayMetrics().density;
        int[] iArr = f545F0;
        setState(iArr);
        if (!Arrays.equals(this.f604y0, iArr)) {
            this.f604y0 = iArr;
            if (m453T()) {
                m460v(getState(), iArr);
            }
        }
        this.f552C0 = true;
        f546G0.setTint(-1);
    }

    /* renamed from: U */
    public static void m431U(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback(null);
        }
    }

    /* renamed from: s */
    public static boolean m432s(ColorStateList colorStateList) {
        return colorStateList != null && colorStateList.isStateful();
    }

    /* renamed from: t */
    public static boolean m433t(Drawable drawable) {
        return drawable != null && drawable.isStateful();
    }

    /* renamed from: A */
    public final void m434A(float f) {
        if (this.f547A != f) {
            this.f547A = f;
            C0516j c0516jM1300e = this.f1601a.f1584a.m1300e();
            c0516jM1300e.f1628e = new C0507a(f);
            c0516jM1300e.f1629f = new C0507a(f);
            c0516jM1300e.f1630g = new C0507a(f);
            c0516jM1300e.f1631h = new C0507a(f);
            setShapeAppearanceModel(c0516jM1300e.m1295a());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: B */
    public final void m435B(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f558G;
        if (drawable3 != 0) {
            boolean z2 = drawable3 instanceof InterfaceC0101d;
            drawable2 = drawable3;
            if (z2) {
                drawable2 = null;
            }
        } else {
            drawable2 = null;
        }
        if (drawable2 != drawable) {
            float fM456p = m456p();
            this.f558G = drawable != null ? drawable.mutate() : null;
            float fM456p2 = m456p();
            m431U(drawable2);
            if (m452S()) {
                m454n(this.f558G);
            }
            invalidateSelf();
            if (fM456p != fM456p2) {
                m459u();
            }
        }
    }

    /* renamed from: C */
    public final void m436C(float f) {
        if (this.f560I != f) {
            float fM456p = m456p();
            this.f560I = f;
            float fM456p2 = m456p();
            invalidateSelf();
            if (fM456p != fM456p2) {
                m459u();
            }
        }
    }

    /* renamed from: D */
    public final void m437D(ColorStateList colorStateList) {
        this.f561J = true;
        if (this.f559H != colorStateList) {
            this.f559H = colorStateList;
            if (m452S()) {
                AbstractC0098a.m300h(this.f558G, colorStateList);
            }
            onStateChange(getState());
        }
    }

    /* renamed from: E */
    public final void m438E(boolean z2) {
        if (this.f557F != z2) {
            boolean zM452S = m452S();
            this.f557F = z2;
            boolean zM452S2 = m452S();
            if (zM452S != zM452S2) {
                if (zM452S2) {
                    m454n(this.f558G);
                } else {
                    m431U(this.f558G);
                }
                invalidateSelf();
                m459u();
            }
        }
    }

    /* renamed from: F */
    public final void m439F(ColorStateList colorStateList) {
        if (this.f549B != colorStateList) {
            this.f549B = colorStateList;
            if (this.f556E0) {
                C0512f c0512f = this.f1601a;
                if (c0512f.f1587d != colorStateList) {
                    c0512f.f1587d = colorStateList;
                    onStateChange(getState());
                }
            }
            onStateChange(getState());
        }
    }

    /* renamed from: G */
    public final void m440G(float f) {
        if (this.f551C != f) {
            this.f551C = f;
            this.f583f0.setStrokeWidth(f);
            if (this.f556E0) {
                this.f1601a.f1593j = f;
                invalidateSelf();
            }
            invalidateSelf();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: H */
    public final void m441H(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f563L;
        if (drawable3 != 0) {
            boolean z2 = drawable3 instanceof InterfaceC0101d;
            drawable2 = drawable3;
            if (z2) {
                drawable2 = null;
            }
        } else {
            drawable2 = null;
        }
        if (drawable2 != drawable) {
            float fM457q = m457q();
            this.f563L = drawable != null ? drawable.mutate() : null;
            this.f564M = new RippleDrawable(AbstractC0472a.m1161a(this.f553D), this.f563L, f546G0);
            float fM457q2 = m457q();
            m431U(drawable2);
            if (m453T()) {
                m454n(this.f563L);
            }
            invalidateSelf();
            if (fM457q != fM457q2) {
                m459u();
            }
        }
    }

    /* renamed from: I */
    public final void m442I(float f) {
        if (this.f580c0 != f) {
            this.f580c0 = f;
            invalidateSelf();
            if (m453T()) {
                m459u();
            }
        }
    }

    /* renamed from: J */
    public final void m443J(float f) {
        if (this.f566O != f) {
            this.f566O = f;
            invalidateSelf();
            if (m453T()) {
                m459u();
            }
        }
    }

    /* renamed from: K */
    public final void m444K(float f) {
        if (this.f579b0 != f) {
            this.f579b0 = f;
            invalidateSelf();
            if (m453T()) {
                m459u();
            }
        }
    }

    /* renamed from: L */
    public final void m445L(ColorStateList colorStateList) {
        if (this.f565N != colorStateList) {
            this.f565N = colorStateList;
            if (m453T()) {
                AbstractC0098a.m300h(this.f563L, colorStateList);
            }
            onStateChange(getState());
        }
    }

    /* renamed from: M */
    public final void m446M(boolean z2) {
        if (this.f562K != z2) {
            boolean zM453T = m453T();
            this.f562K = z2;
            boolean zM453T2 = m453T();
            if (zM453T != zM453T2) {
                if (zM453T2) {
                    m454n(this.f563L);
                } else {
                    m431U(this.f563L);
                }
                invalidateSelf();
                m459u();
            }
        }
    }

    /* renamed from: N */
    public final void m447N(float f) {
        if (this.f576Y != f) {
            float fM456p = m456p();
            this.f576Y = f;
            float fM456p2 = m456p();
            invalidateSelf();
            if (fM456p != fM456p2) {
                m459u();
            }
        }
    }

    /* renamed from: O */
    public final void m448O(float f) {
        if (this.f575X != f) {
            float fM456p = m456p();
            this.f575X = f;
            float fM456p2 = m456p();
            invalidateSelf();
            if (fM456p != fM456p2) {
                m459u();
            }
        }
    }

    /* renamed from: P */
    public final void m449P(ColorStateList colorStateList) {
        if (this.f553D != colorStateList) {
            this.f553D = colorStateList;
            this.f606z0 = null;
            onStateChange(getState());
        }
    }

    /* renamed from: Q */
    public final void m450Q(C0458d c0458d) {
        C0396y c0396y = this.f588k0;
        if (c0396y.f1273f != c0458d) {
            c0396y.f1273f = c0458d;
            if (c0458d != null) {
                TextPaint textPaint = c0396y.f1268a;
                Context context = this.f582e0;
                C0162b c0162b = c0396y.f1269b;
                c0458d.m1144f(context, textPaint, c0162b);
                InterfaceC0395x interfaceC0395x = (InterfaceC0395x) c0396y.f1272e.get();
                if (interfaceC0395x != null) {
                    textPaint.drawableState = interfaceC0395x.getState();
                }
                c0458d.m1143e(context, textPaint, c0162b);
                c0396y.f1271d = true;
            }
            InterfaceC0395x interfaceC0395x2 = (InterfaceC0395x) c0396y.f1272e.get();
            if (interfaceC0395x2 != null) {
                C0166f c0166f = (C0166f) interfaceC0395x2;
                c0166f.m459u();
                c0166f.invalidateSelf();
                c0166f.onStateChange(interfaceC0395x2.getState());
            }
        }
    }

    /* renamed from: R */
    public final boolean m451R() {
        return this.f569R && this.f570S != null && this.f595r0;
    }

    /* renamed from: S */
    public final boolean m452S() {
        return this.f557F && this.f558G != null;
    }

    /* renamed from: T */
    public final boolean m453T() {
        return this.f562K && this.f563L != null;
    }

    @Override // p055T0.C0513g, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int i2;
        Canvas canvas2;
        int iSaveLayerAlpha;
        int i3;
        Rect bounds = getBounds();
        if (bounds.isEmpty() || (i2 = this.f597t0) == 0) {
            return;
        }
        if (i2 < 255) {
            canvas2 = canvas;
            iSaveLayerAlpha = canvas2.saveLayerAlpha(bounds.left, bounds.top, bounds.right, bounds.bottom, i2);
        } else {
            canvas2 = canvas;
            iSaveLayerAlpha = 0;
        }
        boolean z2 = this.f556E0;
        Paint paint = this.f583f0;
        RectF rectF = this.f585h0;
        if (!z2) {
            paint.setColor(this.f589l0);
            paint.setStyle(Paint.Style.FILL);
            rectF.set(bounds);
            canvas2.drawRoundRect(rectF, m458r(), m458r(), paint);
        }
        if (!this.f556E0) {
            paint.setColor(this.f590m0);
            paint.setStyle(Paint.Style.FILL);
            ColorFilter colorFilter = this.f598u0;
            if (colorFilter == null) {
                colorFilter = this.f599v0;
            }
            paint.setColorFilter(colorFilter);
            rectF.set(bounds);
            canvas2.drawRoundRect(rectF, m458r(), m458r(), paint);
        }
        if (this.f556E0) {
            super.draw(canvas);
        }
        if (this.f551C > 0.0f && !this.f556E0) {
            paint.setColor(this.f592o0);
            paint.setStyle(Paint.Style.STROKE);
            if (!this.f556E0) {
                ColorFilter colorFilter2 = this.f598u0;
                if (colorFilter2 == null) {
                    colorFilter2 = this.f599v0;
                }
                paint.setColorFilter(colorFilter2);
            }
            float f = bounds.left;
            float f2 = this.f551C / 2.0f;
            rectF.set(f + f2, bounds.top + f2, bounds.right - f2, bounds.bottom - f2);
            float f3 = this.f547A - (this.f551C / 2.0f);
            canvas2.drawRoundRect(rectF, f3, f3, paint);
        }
        paint.setColor(this.f593p0);
        paint.setStyle(Paint.Style.FILL);
        rectF.set(bounds);
        if (this.f556E0) {
            RectF rectF2 = new RectF(bounds);
            Path path = this.f587j0;
            C0512f c0512f = this.f1601a;
            this.f1618r.m1301a(c0512f.f1584a, c0512f.f1592i, rectF2, this.f1617q, path);
            m1284d(canvas2, paint, path, this.f1601a.f1584a, m1286f());
        } else {
            canvas2.drawRoundRect(rectF, m458r(), m458r(), paint);
        }
        if (m452S()) {
            m455o(bounds, rectF);
            float f4 = rectF.left;
            float f5 = rectF.top;
            canvas2.translate(f4, f5);
            this.f558G.setBounds(0, 0, (int) rectF.width(), (int) rectF.height());
            this.f558G.draw(canvas2);
            canvas2.translate(-f4, -f5);
        }
        if (m451R()) {
            m455o(bounds, rectF);
            float f6 = rectF.left;
            float f7 = rectF.top;
            canvas2.translate(f6, f7);
            this.f570S.setBounds(0, 0, (int) rectF.width(), (int) rectF.height());
            this.f570S.draw(canvas2);
            canvas2.translate(-f6, -f7);
        }
        if (this.f552C0 && this.f555E != null) {
            PointF pointF = this.f586i0;
            pointF.set(0.0f, 0.0f);
            Paint.Align align = Paint.Align.LEFT;
            CharSequence charSequence = this.f555E;
            C0396y c0396y = this.f588k0;
            if (charSequence != null) {
                float fM456p = m456p() + this.f574W + this.f577Z;
                if (AbstractC0099b.m302a(this) == 0) {
                    pointF.x = bounds.left + fM456p;
                } else {
                    pointF.x = bounds.right - fM456p;
                    align = Paint.Align.RIGHT;
                }
                float fCenterY = bounds.centerY();
                TextPaint textPaint = c0396y.f1268a;
                Paint.FontMetrics fontMetrics = this.f584g0;
                textPaint.getFontMetrics(fontMetrics);
                pointF.y = fCenterY - ((fontMetrics.descent + fontMetrics.ascent) / 2.0f);
            }
            rectF.setEmpty();
            if (this.f555E != null) {
                float fM456p2 = m456p() + this.f574W + this.f577Z;
                float fM457q = m457q() + this.f581d0 + this.f578a0;
                if (AbstractC0099b.m302a(this) == 0) {
                    rectF.left = bounds.left + fM456p2;
                    rectF.right = bounds.right - fM457q;
                } else {
                    rectF.left = bounds.left + fM457q;
                    rectF.right = bounds.right - fM456p2;
                }
                rectF.top = bounds.top;
                rectF.bottom = bounds.bottom;
            }
            C0458d c0458d = c0396y.f1273f;
            TextPaint textPaint2 = c0396y.f1268a;
            if (c0458d != null) {
                textPaint2.drawableState = getState();
                c0396y.f1273f.m1143e(this.f582e0, textPaint2, c0396y.f1269b);
            }
            textPaint2.setTextAlign(align);
            boolean z3 = Math.round(c0396y.m1076a(this.f555E.toString())) > Math.round(rectF.width());
            if (z3) {
                int iSave = canvas2.save();
                canvas2.clipRect(rectF);
                i3 = iSave;
            } else {
                i3 = 0;
            }
            CharSequence charSequenceEllipsize = this.f555E;
            if (z3 && this.f550B0 != null) {
                charSequenceEllipsize = TextUtils.ellipsize(charSequenceEllipsize, textPaint2, rectF.width(), this.f550B0);
            }
            canvas.drawText(charSequenceEllipsize, 0, charSequenceEllipsize.length(), pointF.x, pointF.y, textPaint2);
            canvas2 = canvas;
            if (z3) {
                canvas2.restoreToCount(i3);
            }
        }
        if (m453T()) {
            rectF.setEmpty();
            if (m453T()) {
                float f8 = this.f581d0 + this.f580c0;
                if (AbstractC0099b.m302a(this) == 0) {
                    float f9 = bounds.right - f8;
                    rectF.right = f9;
                    rectF.left = f9 - this.f566O;
                } else {
                    float f10 = bounds.left + f8;
                    rectF.left = f10;
                    rectF.right = f10 + this.f566O;
                }
                float fExactCenterY = bounds.exactCenterY();
                float f11 = this.f566O;
                float f12 = fExactCenterY - (f11 / 2.0f);
                rectF.top = f12;
                rectF.bottom = f12 + f11;
            }
            float f13 = rectF.left;
            float f14 = rectF.top;
            canvas2.translate(f13, f14);
            this.f563L.setBounds(0, 0, (int) rectF.width(), (int) rectF.height());
            this.f564M.setBounds(this.f563L.getBounds());
            this.f564M.jumpToCurrentState();
            this.f564M.draw(canvas2);
            canvas2.translate(-f13, -f14);
        }
        if (this.f597t0 < 255) {
            canvas2.restoreToCount(iSaveLayerAlpha);
        }
    }

    @Override // p055T0.C0513g, android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f597t0;
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        return this.f598u0;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return (int) this.f605z;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return Math.min(Math.round(m457q() + this.f588k0.m1076a(this.f555E.toString()) + m456p() + this.f574W + this.f577Z + this.f578a0 + this.f581d0), this.f554D0);
    }

    @Override // p055T0.C0513g, android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // p055T0.C0513g, android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        Outline outline2;
        if (this.f556E0) {
            super.getOutline(outline);
            return;
        }
        Rect bounds = getBounds();
        if (bounds.isEmpty()) {
            outline2 = outline;
            outline2.setRoundRect(0, 0, getIntrinsicWidth(), (int) this.f605z, this.f547A);
        } else {
            outline.setRoundRect(bounds, this.f547A);
            outline2 = outline;
        }
        outline2.setAlpha(this.f597t0 / 255.0f);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // p055T0.C0513g, android.graphics.drawable.Drawable
    public final boolean isStateful() {
        ColorStateList colorStateList;
        if (m432s(this.f601x) || m432s(this.f603y) || m432s(this.f549B)) {
            return true;
        }
        C0458d c0458d = this.f588k0.f1273f;
        if (c0458d == null || (colorStateList = c0458d.f1377j) == null || !colorStateList.isStateful()) {
            return (this.f569R && this.f570S != null && this.f568Q) || m433t(this.f558G) || m433t(this.f570S) || m432s(this.f600w0);
        }
        return true;
    }

    /* renamed from: n */
    public final void m454n(Drawable drawable) {
        if (drawable == null) {
            return;
        }
        drawable.setCallback(this);
        AbstractC0099b.m303b(drawable, AbstractC0099b.m302a(this));
        drawable.setLevel(getLevel());
        drawable.setVisible(isVisible(), false);
        if (drawable == this.f563L) {
            if (drawable.isStateful()) {
                drawable.setState(this.f604y0);
            }
            AbstractC0098a.m300h(drawable, this.f565N);
            return;
        }
        Drawable drawable2 = this.f558G;
        if (drawable == drawable2 && this.f561J) {
            AbstractC0098a.m300h(drawable2, this.f559H);
        }
        if (drawable.isStateful()) {
            drawable.setState(getState());
        }
    }

    /* renamed from: o */
    public final void m455o(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (m452S() || m451R()) {
            float f = this.f574W + this.f575X;
            Drawable drawable = this.f595r0 ? this.f570S : this.f558G;
            float intrinsicWidth = this.f560I;
            if (intrinsicWidth <= 0.0f && drawable != null) {
                intrinsicWidth = drawable.getIntrinsicWidth();
            }
            if (AbstractC0099b.m302a(this) == 0) {
                float f2 = rect.left + f;
                rectF.left = f2;
                rectF.right = f2 + intrinsicWidth;
            } else {
                float f3 = rect.right - f;
                rectF.right = f3;
                rectF.left = f3 - intrinsicWidth;
            }
            Drawable drawable2 = this.f595r0 ? this.f570S : this.f558G;
            float fCeil = this.f560I;
            if (fCeil <= 0.0f && drawable2 != null) {
                fCeil = (float) Math.ceil(TypedValue.applyDimension(1, 24, this.f582e0.getResources().getDisplayMetrics()));
                if (drawable2.getIntrinsicHeight() <= fCeil) {
                    fCeil = drawable2.getIntrinsicHeight();
                }
            }
            float fExactCenterY = rect.exactCenterY() - (fCeil / 2.0f);
            rectF.top = fExactCenterY;
            rectF.bottom = fExactCenterY + fCeil;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLayoutDirectionChanged(int i2) {
        boolean zOnLayoutDirectionChanged = super.onLayoutDirectionChanged(i2);
        if (m452S()) {
            zOnLayoutDirectionChanged |= AbstractC0099b.m303b(this.f558G, i2);
        }
        if (m451R()) {
            zOnLayoutDirectionChanged |= AbstractC0099b.m303b(this.f570S, i2);
        }
        if (m453T()) {
            zOnLayoutDirectionChanged |= AbstractC0099b.m303b(this.f563L, i2);
        }
        if (!zOnLayoutDirectionChanged) {
            return true;
        }
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i2) {
        boolean zOnLevelChange = super.onLevelChange(i2);
        if (m452S()) {
            zOnLevelChange |= this.f558G.setLevel(i2);
        }
        if (m451R()) {
            zOnLevelChange |= this.f570S.setLevel(i2);
        }
        if (m453T()) {
            zOnLevelChange |= this.f563L.setLevel(i2);
        }
        if (zOnLevelChange) {
            invalidateSelf();
        }
        return zOnLevelChange;
    }

    @Override // p055T0.C0513g, android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        if (this.f556E0) {
            super.onStateChange(iArr);
        }
        return m460v(iArr, this.f604y0);
    }

    /* renamed from: p */
    public final float m456p() {
        if (!m452S() && !m451R()) {
            return 0.0f;
        }
        float f = this.f575X;
        Drawable drawable = this.f595r0 ? this.f570S : this.f558G;
        float intrinsicWidth = this.f560I;
        if (intrinsicWidth <= 0.0f && drawable != null) {
            intrinsicWidth = drawable.getIntrinsicWidth();
        }
        return intrinsicWidth + f + this.f576Y;
    }

    /* renamed from: q */
    public final float m457q() {
        if (m453T()) {
            return this.f579b0 + this.f566O + this.f580c0;
        }
        return 0.0f;
    }

    /* renamed from: r */
    public final float m458r() {
        return this.f556E0 ? this.f1601a.f1584a.f1640e.mo1270a(m1286f()) : this.f547A;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j2) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j2);
        }
    }

    @Override // p055T0.C0513g, android.graphics.drawable.Drawable
    public final void setAlpha(int i2) {
        if (this.f597t0 != i2) {
            this.f597t0 = i2;
            invalidateSelf();
        }
    }

    @Override // p055T0.C0513g, android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        if (this.f598u0 != colorFilter) {
            this.f598u0 = colorFilter;
            invalidateSelf();
        }
    }

    @Override // p055T0.C0513g, android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        if (this.f600w0 != colorStateList) {
            this.f600w0 = colorStateList;
            onStateChange(getState());
        }
    }

    @Override // p055T0.C0513g, android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        if (this.f602x0 != mode) {
            this.f602x0 = mode;
            ColorStateList colorStateList = this.f600w0;
            this.f599v0 = (colorStateList == null || mode == null) ? null : new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z2, boolean z3) {
        boolean visible = super.setVisible(z2, z3);
        if (m452S()) {
            visible |= this.f558G.setVisible(z2, z3);
        }
        if (m451R()) {
            visible |= this.f570S.setVisible(z2, z3);
        }
        if (m453T()) {
            visible |= this.f563L.setVisible(z2, z3);
        }
        if (visible) {
            invalidateSelf();
        }
        return visible;
    }

    /* renamed from: u */
    public final void m459u() {
        InterfaceC0165e interfaceC0165e = (InterfaceC0165e) this.f548A0.get();
        if (interfaceC0165e != null) {
            Chip chip = (Chip) interfaceC0165e;
            chip.m2075b(chip.f3152p);
            chip.requestLayout();
            chip.invalidateOutline();
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x00a3  */
    /* renamed from: v */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean m460v(int[] r12, int[] r13) {
        /*
            Method dump skipped, instructions count: 383
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p018G0.C0166f.m460v(int[], int[]):boolean");
    }

    /* renamed from: w */
    public final void m461w(boolean z2) {
        if (this.f568Q != z2) {
            this.f568Q = z2;
            float fM456p = m456p();
            if (!z2 && this.f595r0) {
                this.f595r0 = false;
            }
            float fM456p2 = m456p();
            invalidateSelf();
            if (fM456p != fM456p2) {
                m459u();
            }
        }
    }

    /* renamed from: x */
    public final void m462x(Drawable drawable) {
        if (this.f570S != drawable) {
            float fM456p = m456p();
            this.f570S = drawable;
            float fM456p2 = m456p();
            m431U(this.f570S);
            m454n(this.f570S);
            invalidateSelf();
            if (fM456p != fM456p2) {
                m459u();
            }
        }
    }

    /* renamed from: y */
    public final void m463y(ColorStateList colorStateList) {
        Drawable drawable;
        if (this.f571T != colorStateList) {
            this.f571T = colorStateList;
            if (this.f569R && (drawable = this.f570S) != null && this.f568Q) {
                AbstractC0098a.m300h(drawable, colorStateList);
            }
            onStateChange(getState());
        }
    }

    /* renamed from: z */
    public final void m464z(boolean z2) {
        if (this.f569R != z2) {
            boolean zM451R = m451R();
            this.f569R = z2;
            boolean zM451R2 = m451R();
            if (zM451R != zM451R2) {
                if (zM451R2) {
                    m454n(this.f570S);
                } else {
                    m431U(this.f570S);
                }
                invalidateSelf();
                m459u();
            }
        }
    }
}
