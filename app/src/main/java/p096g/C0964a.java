package p096g;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import p009D.AbstractC0099b;
import p086d.AbstractC0843a;
import tkbmmn.ghwbbf.irvjzy.R;

/* renamed from: g.a */
/* loaded from: classes.dex */
public final class C0964a extends Drawable {

    /* renamed from: m */
    public static final float f4044m = (float) Math.toRadians(45.0d);

    /* renamed from: a */
    public final Paint f4045a;

    /* renamed from: b */
    public final float f4046b;

    /* renamed from: c */
    public final float f4047c;

    /* renamed from: d */
    public final float f4048d;

    /* renamed from: e */
    public final float f4049e;

    /* renamed from: f */
    public final boolean f4050f;

    /* renamed from: g */
    public final Path f4051g;

    /* renamed from: h */
    public final int f4052h;

    /* renamed from: i */
    public boolean f4053i;

    /* renamed from: j */
    public float f4054j;

    /* renamed from: k */
    public final float f4055k;

    /* renamed from: l */
    public final int f4056l;

    public C0964a(Context context) {
        Paint paint = new Paint();
        this.f4045a = paint;
        this.f4051g = new Path();
        this.f4053i = false;
        this.f4056l = 2;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeJoin(Paint.Join.MITER);
        paint.setStrokeCap(Paint.Cap.BUTT);
        paint.setAntiAlias(true);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, AbstractC0843a.f3464n, R.attr.drawerArrowStyle, R.style.Base_Widget_AppCompat_DrawerArrowToggle);
        int color = typedArrayObtainStyledAttributes.getColor(3, 0);
        if (color != paint.getColor()) {
            paint.setColor(color);
            invalidateSelf();
        }
        float dimension = typedArrayObtainStyledAttributes.getDimension(7, 0.0f);
        if (paint.getStrokeWidth() != dimension) {
            paint.setStrokeWidth(dimension);
            this.f4055k = (float) (Math.cos(f4044m) * (dimension / 2.0f));
            invalidateSelf();
        }
        boolean z2 = typedArrayObtainStyledAttributes.getBoolean(6, true);
        if (this.f4050f != z2) {
            this.f4050f = z2;
            invalidateSelf();
        }
        float fRound = Math.round(typedArrayObtainStyledAttributes.getDimension(5, 0.0f));
        if (fRound != this.f4049e) {
            this.f4049e = fRound;
            invalidateSelf();
        }
        this.f4052h = typedArrayObtainStyledAttributes.getDimensionPixelSize(4, 0);
        this.f4047c = Math.round(typedArrayObtainStyledAttributes.getDimension(2, 0.0f));
        this.f4046b = Math.round(typedArrayObtainStyledAttributes.getDimension(0, 0.0f));
        this.f4048d = typedArrayObtainStyledAttributes.getDimension(1, 0.0f);
        typedArrayObtainStyledAttributes.recycle();
    }

    /* renamed from: a */
    public static float m2473a(float f, float f2, float f3) {
        return ((f2 - f) * f3) + f;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        int i2 = this.f4056l;
        boolean z2 = false;
        if (i2 != 0 && (i2 == 1 || (i2 == 3 ? AbstractC0099b.m302a(this) == 0 : AbstractC0099b.m302a(this) == 1))) {
            z2 = true;
        }
        float f = this.f4046b;
        float fSqrt = (float) Math.sqrt(f * f * 2.0f);
        float f2 = this.f4054j;
        float f3 = this.f4047c;
        float fM2473a = m2473a(f3, fSqrt, f2);
        float fM2473a2 = m2473a(f3, this.f4048d, this.f4054j);
        float fRound = Math.round(m2473a(0.0f, this.f4055k, this.f4054j));
        float fM2473a3 = m2473a(0.0f, f4044m, this.f4054j);
        float fM2473a4 = m2473a(z2 ? 0.0f : -180.0f, z2 ? 180.0f : 0.0f, this.f4054j);
        double d3 = fM2473a;
        double d4 = fM2473a3;
        boolean z3 = z2;
        float fRound2 = Math.round(Math.cos(d4) * d3);
        float fRound3 = Math.round(Math.sin(d4) * d3);
        Path path = this.f4051g;
        path.rewind();
        float f4 = this.f4049e;
        Paint paint = this.f4045a;
        float fM2473a5 = m2473a(paint.getStrokeWidth() + f4, -this.f4055k, this.f4054j);
        float f5 = (-fM2473a2) / 2.0f;
        path.moveTo(f5 + fRound, 0.0f);
        path.rLineTo(fM2473a2 - (fRound * 2.0f), 0.0f);
        path.moveTo(f5, fM2473a5);
        path.rLineTo(fRound2, fRound3);
        path.moveTo(f5, -fM2473a5);
        path.rLineTo(fRound2, -fRound3);
        path.close();
        canvas.save();
        float strokeWidth = paint.getStrokeWidth();
        float fHeight = bounds.height() - (3.0f * strokeWidth);
        canvas.translate(bounds.centerX(), (strokeWidth * 1.5f) + this.f4049e + ((((int) (fHeight - (r6 * 2.0f))) / 4) * 2));
        if (this.f4050f) {
            canvas.rotate(fM2473a4 * (this.f4053i ^ z3 ? -1 : 1));
        } else if (z3) {
            canvas.rotate(180.0f);
        }
        canvas.drawPath(path, paint);
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.f4052h;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.f4052h;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i2) {
        Paint paint = this.f4045a;
        if (i2 != paint.getAlpha()) {
            paint.setAlpha(i2);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f4045a.setColorFilter(colorFilter);
        invalidateSelf();
    }
}
