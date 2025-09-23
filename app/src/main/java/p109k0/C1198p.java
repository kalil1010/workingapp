package p109k0;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import java.io.IOException;
import java.util.ArrayDeque;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p003B.AbstractC0046b;
import p003B.AbstractC0047c;
import p009D.AbstractC0098a;
import p009D.AbstractC0099b;
import p033L1.AbstractC0356d;
import p119o.C1240b;

/* renamed from: k0.p */
/* loaded from: classes.dex */
public final class C1198p extends AbstractC1189g {

    /* renamed from: j */
    public static final PorterDuff.Mode f4879j = PorterDuff.Mode.SRC_IN;

    /* renamed from: b */
    public C1196n f4880b;

    /* renamed from: c */
    public PorterDuffColorFilter f4881c;

    /* renamed from: d */
    public ColorFilter f4882d;

    /* renamed from: e */
    public boolean f4883e;

    /* renamed from: f */
    public boolean f4884f;

    /* renamed from: g */
    public final float[] f4885g;

    /* renamed from: h */
    public final Matrix f4886h;

    /* renamed from: i */
    public final Rect f4887i;

    public C1198p() {
        this.f4884f = true;
        this.f4885g = new float[9];
        this.f4886h = new Matrix();
        this.f4887i = new Rect();
        C1196n c1196n = new C1196n();
        c1196n.f4868c = null;
        c1196n.f4869d = f4879j;
        c1196n.f4867b = new C1195m();
        this.f4880b = c1196n;
    }

    /* renamed from: a */
    public final PorterDuffColorFilter m2836a(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        Drawable drawable = this.f4824a;
        if (drawable == null) {
            return false;
        }
        AbstractC0098a.m294b(drawable);
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Paint paint;
        Drawable drawable = this.f4824a;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        Rect rect = this.f4887i;
        copyBounds(rect);
        if (rect.width() <= 0 || rect.height() <= 0) {
            return;
        }
        ColorFilter colorFilter = this.f4882d;
        if (colorFilter == null) {
            colorFilter = this.f4881c;
        }
        Matrix matrix = this.f4886h;
        canvas.getMatrix(matrix);
        float[] fArr = this.f4885g;
        matrix.getValues(fArr);
        float fAbs = Math.abs(fArr[0]);
        float fAbs2 = Math.abs(fArr[4]);
        float fAbs3 = Math.abs(fArr[1]);
        float fAbs4 = Math.abs(fArr[3]);
        if (fAbs3 != 0.0f || fAbs4 != 0.0f) {
            fAbs = 1.0f;
            fAbs2 = 1.0f;
        }
        int iWidth = (int) (rect.width() * fAbs);
        int iMin = Math.min(2048, iWidth);
        int iMin2 = Math.min(2048, (int) (rect.height() * fAbs2));
        if (iMin <= 0 || iMin2 <= 0) {
            return;
        }
        int iSave = canvas.save();
        canvas.translate(rect.left, rect.top);
        if (isAutoMirrored() && AbstractC0099b.m302a(this) == 1) {
            canvas.translate(rect.width(), 0.0f);
            canvas.scale(-1.0f, 1.0f);
        }
        rect.offsetTo(0, 0);
        C1196n c1196n = this.f4880b;
        Bitmap bitmap = c1196n.f4871f;
        if (bitmap == null || iMin != bitmap.getWidth() || iMin2 != c1196n.f4871f.getHeight()) {
            c1196n.f4871f = Bitmap.createBitmap(iMin, iMin2, Bitmap.Config.ARGB_8888);
            c1196n.f4876k = true;
        }
        if (this.f4884f) {
            C1196n c1196n2 = this.f4880b;
            if (c1196n2.f4876k || c1196n2.f4872g != c1196n2.f4868c || c1196n2.f4873h != c1196n2.f4869d || c1196n2.f4875j != c1196n2.f4870e || c1196n2.f4874i != c1196n2.f4867b.getRootAlpha()) {
                C1196n c1196n3 = this.f4880b;
                c1196n3.f4871f.eraseColor(0);
                Canvas canvas2 = new Canvas(c1196n3.f4871f);
                C1195m c1195m = c1196n3.f4867b;
                c1195m.m2835a(c1195m.f4857g, C1195m.f4850p, canvas2, iMin, iMin2);
                C1196n c1196n4 = this.f4880b;
                c1196n4.f4872g = c1196n4.f4868c;
                c1196n4.f4873h = c1196n4.f4869d;
                c1196n4.f4874i = c1196n4.f4867b.getRootAlpha();
                c1196n4.f4875j = c1196n4.f4870e;
                c1196n4.f4876k = false;
            }
        } else {
            C1196n c1196n5 = this.f4880b;
            c1196n5.f4871f.eraseColor(0);
            Canvas canvas3 = new Canvas(c1196n5.f4871f);
            C1195m c1195m2 = c1196n5.f4867b;
            c1195m2.m2835a(c1195m2.f4857g, C1195m.f4850p, canvas3, iMin, iMin2);
        }
        C1196n c1196n6 = this.f4880b;
        if (c1196n6.f4867b.getRootAlpha() >= 255 && colorFilter == null) {
            paint = null;
        } else {
            if (c1196n6.f4877l == null) {
                Paint paint2 = new Paint();
                c1196n6.f4877l = paint2;
                paint2.setFilterBitmap(true);
            }
            c1196n6.f4877l.setAlpha(c1196n6.f4867b.getRootAlpha());
            c1196n6.f4877l.setColorFilter(colorFilter);
            paint = c1196n6.f4877l;
        }
        canvas.drawBitmap(c1196n6.f4871f, (Rect) null, rect, paint);
        canvas.restoreToCount(iSave);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        Drawable drawable = this.f4824a;
        return drawable != null ? drawable.getAlpha() : this.f4880b.f4867b.getRootAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        Drawable drawable = this.f4824a;
        return drawable != null ? drawable.getChangingConfigurations() : super.getChangingConfigurations() | this.f4880b.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        Drawable drawable = this.f4824a;
        return drawable != null ? AbstractC0098a.m295c(drawable) : this.f4882d;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (this.f4824a != null) {
            return new C1197o(this.f4824a.getConstantState());
        }
        this.f4880b.f4866a = getChangingConfigurations();
        return this.f4880b;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        Drawable drawable = this.f4824a;
        return drawable != null ? drawable.getIntrinsicHeight() : (int) this.f4880b.f4867b.f4859i;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        Drawable drawable = this.f4824a;
        return drawable != null ? drawable.getIntrinsicWidth() : (int) this.f4880b.f4867b.f4858h;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.f4824a;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        Drawable drawable = this.f4824a;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        Drawable drawable = this.f4824a;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        Drawable drawable = this.f4824a;
        return drawable != null ? drawable.isAutoMirrored() : this.f4880b.f4870e;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        Drawable drawable = this.f4824a;
        if (drawable != null) {
            return drawable.isStateful();
        }
        if (super.isStateful()) {
            return true;
        }
        C1196n c1196n = this.f4880b;
        if (c1196n == null) {
            return false;
        }
        C1195m c1195m = c1196n.f4867b;
        if (c1195m.f4864n == null) {
            c1195m.f4864n = Boolean.valueOf(c1195m.f4857g.mo2832a());
        }
        if (c1195m.f4864n.booleanValue()) {
            return true;
        }
        ColorStateList colorStateList = this.f4880b.f4868c;
        return colorStateList != null && colorStateList.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        Drawable drawable = this.f4824a;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.f4883e && super.mutate() == this) {
            C1196n c1196n = this.f4880b;
            C1196n c1196n2 = new C1196n();
            c1196n2.f4868c = null;
            c1196n2.f4869d = f4879j;
            if (c1196n != null) {
                c1196n2.f4866a = c1196n.f4866a;
                C1195m c1195m = new C1195m(c1196n.f4867b);
                c1196n2.f4867b = c1195m;
                if (c1196n.f4867b.f4855e != null) {
                    c1195m.f4855e = new Paint(c1196n.f4867b.f4855e);
                }
                if (c1196n.f4867b.f4854d != null) {
                    c1196n2.f4867b.f4854d = new Paint(c1196n.f4867b.f4854d);
                }
                c1196n2.f4868c = c1196n.f4868c;
                c1196n2.f4869d = c1196n.f4869d;
                c1196n2.f4870e = c1196n.f4870e;
            }
            this.f4880b = c1196n2;
            this.f4883e = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f4824a;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        boolean z2;
        PorterDuff.Mode mode;
        Drawable drawable = this.f4824a;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        C1196n c1196n = this.f4880b;
        ColorStateList colorStateList = c1196n.f4868c;
        if (colorStateList == null || (mode = c1196n.f4869d) == null) {
            z2 = false;
        } else {
            this.f4881c = m2836a(colorStateList, mode);
            invalidateSelf();
            z2 = true;
        }
        C1195m c1195m = c1196n.f4867b;
        if (c1195m.f4864n == null) {
            c1195m.f4864n = Boolean.valueOf(c1195m.f4857g.mo2832a());
        }
        if (c1195m.f4864n.booleanValue()) {
            boolean zMo2833b = c1196n.f4867b.f4857g.mo2833b(iArr);
            c1196n.f4876k |= zMo2833b;
            if (zMo2833b) {
                invalidateSelf();
                return true;
            }
        }
        return z2;
    }

    @Override // android.graphics.drawable.Drawable
    public final void scheduleSelf(Runnable runnable, long j2) {
        Drawable drawable = this.f4824a;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j2);
        } else {
            super.scheduleSelf(runnable, j2);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i2) {
        Drawable drawable = this.f4824a;
        if (drawable != null) {
            drawable.setAlpha(i2);
        } else if (this.f4880b.f4867b.getRootAlpha() != i2) {
            this.f4880b.f4867b.setRootAlpha(i2);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z2) {
        Drawable drawable = this.f4824a;
        if (drawable != null) {
            drawable.setAutoMirrored(z2);
        } else {
            this.f4880b.f4870e = z2;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f4824a;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f4882d = colorFilter;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i2) {
        Drawable drawable = this.f4824a;
        if (drawable != null) {
            AbstractC0356d.m947H(drawable, i2);
        } else {
            setTintList(ColorStateList.valueOf(i2));
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f4824a;
        if (drawable != null) {
            AbstractC0098a.m300h(drawable, colorStateList);
            return;
        }
        C1196n c1196n = this.f4880b;
        if (c1196n.f4868c != colorStateList) {
            c1196n.f4868c = colorStateList;
            this.f4881c = m2836a(colorStateList, c1196n.f4869d);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f4824a;
        if (drawable != null) {
            AbstractC0098a.m301i(drawable, mode);
            return;
        }
        C1196n c1196n = this.f4880b;
        if (c1196n.f4869d != mode) {
            c1196n.f4869d = mode;
            this.f4881c = m2836a(c1196n.f4868c, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z2, boolean z3) {
        Drawable drawable = this.f4824a;
        return drawable != null ? drawable.setVisible(z2, z3) : super.setVisible(z2, z3);
    }

    @Override // android.graphics.drawable.Drawable
    public final void unscheduleSelf(Runnable runnable) {
        Drawable drawable = this.f4824a;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        C1195m c1195m;
        boolean z2;
        int i2;
        boolean z3;
        char c3;
        int i3;
        boolean z4;
        Paint.Cap cap;
        Paint.Join join;
        Drawable drawable = this.f4824a;
        if (drawable != null) {
            AbstractC0098a.m296d(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        C1196n c1196n = this.f4880b;
        c1196n.f4867b = new C1195m();
        TypedArray typedArrayM166f = AbstractC0046b.m166f(resources, theme, attributeSet, AbstractC1183a.f4806a);
        C1196n c1196n2 = this.f4880b;
        C1195m c1195m2 = c1196n2.f4867b;
        int i4 = !AbstractC0046b.m163c(xmlPullParser, "tintMode") ? -1 : typedArrayM166f.getInt(6, -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        if (i4 == 3) {
            mode = PorterDuff.Mode.SRC_OVER;
        } else if (i4 != 5) {
            if (i4 != 9) {
                switch (i4) {
                    case 14:
                        mode = PorterDuff.Mode.MULTIPLY;
                        break;
                    case 15:
                        mode = PorterDuff.Mode.SCREEN;
                        break;
                    case 16:
                        mode = PorterDuff.Mode.ADD;
                        break;
                }
            } else {
                mode = PorterDuff.Mode.SRC_ATOP;
            }
        }
        c1196n2.f4869d = mode;
        boolean z5 = false;
        int i5 = 1;
        ColorStateList colorStateListM174a = null;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "tint") != null) {
            TypedValue typedValue = new TypedValue();
            typedArrayM166f.getValue(1, typedValue);
            int i6 = typedValue.type;
            if (i6 == 2) {
                throw new UnsupportedOperationException("Failed to resolve attribute at index 1: " + typedValue);
            }
            if (i6 >= 28 && i6 <= 31) {
                colorStateListM174a = ColorStateList.valueOf(typedValue.data);
            } else {
                Resources resources2 = typedArrayM166f.getResources();
                int resourceId = typedArrayM166f.getResourceId(1, 0);
                ThreadLocal threadLocal = AbstractC0047c.f113a;
                try {
                    colorStateListM174a = AbstractC0047c.m174a(resources2, resources2.getXml(resourceId), theme);
                } catch (Exception unused) {
                }
            }
        }
        ColorStateList colorStateList = colorStateListM174a;
        if (colorStateList != null) {
            c1196n2.f4868c = colorStateList;
        }
        boolean z6 = c1196n2.f4870e;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "autoMirrored") != null) {
            z6 = typedArrayM166f.getBoolean(5, z6);
        }
        c1196n2.f4870e = z6;
        float f = c1195m2.f4860j;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "viewportWidth") != null) {
            f = typedArrayM166f.getFloat(7, f);
        }
        c1195m2.f4860j = f;
        float f2 = c1195m2.f4861k;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "viewportHeight") != null) {
            f2 = typedArrayM166f.getFloat(8, f2);
        }
        c1195m2.f4861k = f2;
        boolean z7 = false;
        if (c1195m2.f4860j <= 0.0f) {
            throw new XmlPullParserException(typedArrayM166f.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
        }
        if (f2 > 0.0f) {
            c1195m2.f4858h = typedArrayM166f.getDimension(3, c1195m2.f4858h);
            float dimension = typedArrayM166f.getDimension(2, c1195m2.f4859i);
            c1195m2.f4859i = dimension;
            if (c1195m2.f4858h <= 0.0f) {
                throw new XmlPullParserException(typedArrayM166f.getPositionDescription() + "<vector> tag requires width > 0");
            }
            if (dimension > 0.0f) {
                float alpha = c1195m2.getAlpha();
                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "alpha") != null) {
                    alpha = typedArrayM166f.getFloat(4, alpha);
                }
                c1195m2.setAlpha(alpha);
                String string = typedArrayM166f.getString(0);
                if (string != null) {
                    c1195m2.f4863m = string;
                    c1195m2.f4865o.put(string, c1195m2);
                }
                typedArrayM166f.recycle();
                c1196n.f4866a = getChangingConfigurations();
                c1196n.f4876k = true;
                C1196n c1196n3 = this.f4880b;
                C1195m c1195m3 = c1196n3.f4867b;
                ArrayDeque arrayDeque = new ArrayDeque();
                arrayDeque.push(c1195m3.f4857g);
                int eventType = xmlPullParser.getEventType();
                int depth = xmlPullParser.getDepth() + 1;
                boolean z8 = true;
                while (eventType != i5 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
                    if (eventType == 2) {
                        String name = xmlPullParser.getName();
                        C1192j c1192j = (C1192j) arrayDeque.peek();
                        boolean zEquals = "path".equals(name);
                        i2 = depth;
                        C1240b c1240b = c1195m3.f4865o;
                        if (zEquals) {
                            C1191i c1191i = new C1191i();
                            c1191i.f4826e = 0.0f;
                            c1191i.f4828g = 1.0f;
                            c1191i.f4829h = 1.0f;
                            c1195m = c1195m3;
                            c1191i.f4830i = 0.0f;
                            c1191i.f4831j = 1.0f;
                            c1191i.f4832k = 0.0f;
                            Paint.Cap cap2 = Paint.Cap.BUTT;
                            c1191i.f4833l = cap2;
                            Paint.Join join2 = Paint.Join.MITER;
                            c1191i.f4834m = join2;
                            c1191i.f4835n = 4.0f;
                            TypedArray typedArrayM166f2 = AbstractC0046b.m166f(resources, theme, attributeSet, AbstractC1183a.f4808c);
                            if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "pathData") != null) {
                                String string2 = typedArrayM166f2.getString(0);
                                if (string2 != null) {
                                    c1191i.f4848b = string2;
                                }
                                String string3 = typedArrayM166f2.getString(2);
                                if (string3 != null) {
                                    c1191i.f4847a = AbstractC0356d.m961k(string3);
                                }
                                c1191i.f4827f = AbstractC0046b.m162b(typedArrayM166f2, xmlPullParser, theme, "fillColor", 1);
                                float f3 = c1191i.f4829h;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "fillAlpha") != null) {
                                    f3 = typedArrayM166f2.getFloat(12, f3);
                                }
                                c1191i.f4829h = f3;
                                int i7 = xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeLineCap") != null ? typedArrayM166f2.getInt(8, -1) : -1;
                                Paint.Cap cap3 = c1191i.f4833l;
                                if (i7 == 0) {
                                    cap = cap2;
                                } else if (i7 != 1) {
                                    cap = i7 != 2 ? cap3 : Paint.Cap.SQUARE;
                                } else {
                                    cap = Paint.Cap.ROUND;
                                }
                                c1191i.f4833l = cap;
                                int i8 = xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeLineJoin") != null ? typedArrayM166f2.getInt(9, -1) : -1;
                                Paint.Join join3 = c1191i.f4834m;
                                if (i8 == 0) {
                                    join = join2;
                                } else if (i8 != 1) {
                                    join = i8 != 2 ? join3 : Paint.Join.BEVEL;
                                } else {
                                    join = Paint.Join.ROUND;
                                }
                                c1191i.f4834m = join;
                                float f4 = c1191i.f4835n;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeMiterLimit") != null) {
                                    f4 = typedArrayM166f2.getFloat(10, f4);
                                }
                                c1191i.f4835n = f4;
                                c1191i.f4825d = AbstractC0046b.m162b(typedArrayM166f2, xmlPullParser, theme, "strokeColor", 3);
                                float f5 = c1191i.f4828g;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeAlpha") != null) {
                                    f5 = typedArrayM166f2.getFloat(11, f5);
                                }
                                c1191i.f4828g = f5;
                                float f6 = c1191i.f4826e;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeWidth") != null) {
                                    f6 = typedArrayM166f2.getFloat(4, f6);
                                }
                                c1191i.f4826e = f6;
                                float f7 = c1191i.f4831j;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "trimPathEnd") != null) {
                                    f7 = typedArrayM166f2.getFloat(6, f7);
                                }
                                c1191i.f4831j = f7;
                                float f8 = c1191i.f4832k;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "trimPathOffset") != null) {
                                    f8 = typedArrayM166f2.getFloat(7, f8);
                                }
                                c1191i.f4832k = f8;
                                float f9 = c1191i.f4830i;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "trimPathStart") != null) {
                                    f9 = typedArrayM166f2.getFloat(5, f9);
                                }
                                c1191i.f4830i = f9;
                                int i9 = c1191i.f4849c;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "fillType") != null) {
                                    i9 = typedArrayM166f2.getInt(13, i9);
                                }
                                c1191i.f4849c = i9;
                            }
                            typedArrayM166f2.recycle();
                            c1192j.f4837b.add(c1191i);
                            if (c1191i.getPathName() != null) {
                                c1240b.put(c1191i.getPathName(), c1191i);
                            }
                            c1196n3.f4866a = c1196n3.f4866a;
                            z4 = false;
                            z8 = false;
                            c3 = '\b';
                            z3 = false;
                        } else {
                            c1195m = c1195m3;
                            c3 = '\b';
                            z3 = false;
                            if ("clip-path".equals(name)) {
                                C1190h c1190h = new C1190h();
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "pathData") != null) {
                                    TypedArray typedArrayM166f3 = AbstractC0046b.m166f(resources, theme, attributeSet, AbstractC1183a.f4809d);
                                    String string4 = typedArrayM166f3.getString(0);
                                    if (string4 != null) {
                                        c1190h.f4848b = string4;
                                    }
                                    String string5 = typedArrayM166f3.getString(1);
                                    if (string5 != null) {
                                        c1190h.f4847a = AbstractC0356d.m961k(string5);
                                    }
                                    c1190h.f4849c = !AbstractC0046b.m163c(xmlPullParser, "fillType") ? 0 : typedArrayM166f3.getInt(2, 0);
                                    typedArrayM166f3.recycle();
                                }
                                c1192j.f4837b.add(c1190h);
                                if (c1190h.getPathName() != null) {
                                    c1240b.put(c1190h.getPathName(), c1190h);
                                }
                                c1196n3.f4866a = c1196n3.f4866a;
                            } else if ("group".equals(name)) {
                                C1192j c1192j2 = new C1192j();
                                TypedArray typedArrayM166f4 = AbstractC0046b.m166f(resources, theme, attributeSet, AbstractC1183a.f4807b);
                                float f10 = c1192j2.f4838c;
                                if (AbstractC0046b.m163c(xmlPullParser, "rotation")) {
                                    f10 = typedArrayM166f4.getFloat(5, f10);
                                }
                                c1192j2.f4838c = f10;
                                c1192j2.f4839d = typedArrayM166f4.getFloat(1, c1192j2.f4839d);
                                c1192j2.f4840e = typedArrayM166f4.getFloat(2, c1192j2.f4840e);
                                float f11 = c1192j2.f4841f;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "scaleX") != null) {
                                    f11 = typedArrayM166f4.getFloat(3, f11);
                                }
                                c1192j2.f4841f = f11;
                                float f12 = c1192j2.f4842g;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "scaleY") != null) {
                                    f12 = typedArrayM166f4.getFloat(4, f12);
                                }
                                c1192j2.f4842g = f12;
                                float f13 = c1192j2.f4843h;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "translateX") != null) {
                                    f13 = typedArrayM166f4.getFloat(6, f13);
                                }
                                c1192j2.f4843h = f13;
                                float f14 = c1192j2.f4844i;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "translateY") != null) {
                                    f14 = typedArrayM166f4.getFloat(7, f14);
                                }
                                c1192j2.f4844i = f14;
                                z4 = false;
                                String string6 = typedArrayM166f4.getString(0);
                                if (string6 != null) {
                                    c1192j2.f4846k = string6;
                                }
                                c1192j2.m2834c();
                                typedArrayM166f4.recycle();
                                c1192j.f4837b.add(c1192j2);
                                arrayDeque.push(c1192j2);
                                if (c1192j2.getGroupName() != null) {
                                    c1240b.put(c1192j2.getGroupName(), c1192j2);
                                }
                                c1196n3.f4866a = c1196n3.f4866a;
                            }
                            z4 = false;
                        }
                        z2 = z4;
                        i3 = 1;
                    } else {
                        c1195m = c1195m3;
                        z2 = z5;
                        i2 = depth;
                        z3 = z7;
                        c3 = '\b';
                        i3 = 1;
                        if (eventType == 3 && "group".equals(xmlPullParser.getName())) {
                            arrayDeque.pop();
                        }
                    }
                    eventType = xmlPullParser.next();
                    i5 = i3;
                    z5 = z2;
                    z7 = z3;
                    c1195m3 = c1195m;
                    depth = i2;
                }
                if (!z8) {
                    this.f4881c = m2836a(c1196n.f4868c, c1196n.f4869d);
                    return;
                }
                throw new XmlPullParserException("no path defined");
            }
            throw new XmlPullParserException(typedArrayM166f.getPositionDescription() + "<vector> tag requires height > 0");
        }
        throw new XmlPullParserException(typedArrayM166f.getPositionDescription() + "<vector> tag requires viewportHeight > 0");
    }

    public C1198p(C1196n c1196n) {
        this.f4884f = true;
        this.f4885g = new float[9];
        this.f4886h = new Matrix();
        this.f4887i = new Rect();
        this.f4880b = c1196n;
        this.f4881c = m2836a(c1196n.f4868c, c1196n.f4869d);
    }
}
