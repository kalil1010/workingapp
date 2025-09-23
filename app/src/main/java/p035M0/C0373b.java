package p035M0;

import android.animation.TimeInterpolator;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.animation.LinearInterpolator;
import com.google.android.material.textfield.TextInputLayout;
import java.util.WeakHashMap;
import p022I.AbstractC0205h;
import p028K.AbstractC0241P;
import p033L1.AbstractC0364l;
import p046Q0.C0455a;
import p072Z.C0603a;
import p148y0.AbstractC1400a;

/* renamed from: M0.b */
/* loaded from: classes.dex */
public final class C0373b {

    /* renamed from: A */
    public CharSequence f1142A;

    /* renamed from: B */
    public CharSequence f1143B;

    /* renamed from: C */
    public boolean f1144C;

    /* renamed from: E */
    public Bitmap f1146E;

    /* renamed from: F */
    public float f1147F;

    /* renamed from: G */
    public float f1148G;

    /* renamed from: H */
    public float f1149H;

    /* renamed from: I */
    public float f1150I;

    /* renamed from: J */
    public float f1151J;

    /* renamed from: K */
    public int f1152K;

    /* renamed from: L */
    public int[] f1153L;

    /* renamed from: M */
    public boolean f1154M;

    /* renamed from: N */
    public final TextPaint f1155N;

    /* renamed from: O */
    public final TextPaint f1156O;

    /* renamed from: P */
    public LinearInterpolator f1157P;

    /* renamed from: Q */
    public LinearInterpolator f1158Q;

    /* renamed from: R */
    public float f1159R;

    /* renamed from: S */
    public float f1160S;

    /* renamed from: T */
    public float f1161T;

    /* renamed from: U */
    public ColorStateList f1162U;

    /* renamed from: V */
    public float f1163V;

    /* renamed from: W */
    public float f1164W;

    /* renamed from: X */
    public float f1165X;

    /* renamed from: Y */
    public StaticLayout f1166Y;

    /* renamed from: Z */
    public float f1167Z;

    /* renamed from: a */
    public final TextInputLayout f1168a;

    /* renamed from: a0 */
    public float f1169a0;

    /* renamed from: b */
    public float f1170b;

    /* renamed from: b0 */
    public float f1171b0;

    /* renamed from: c */
    public final Rect f1172c;

    /* renamed from: c0 */
    public CharSequence f1173c0;

    /* renamed from: d */
    public final Rect f1174d;

    /* renamed from: e */
    public final RectF f1176e;

    /* renamed from: j */
    public ColorStateList f1183j;

    /* renamed from: k */
    public ColorStateList f1184k;

    /* renamed from: l */
    public float f1185l;

    /* renamed from: m */
    public float f1186m;

    /* renamed from: n */
    public float f1187n;

    /* renamed from: o */
    public float f1188o;

    /* renamed from: p */
    public float f1189p;

    /* renamed from: q */
    public float f1190q;

    /* renamed from: r */
    public Typeface f1191r;

    /* renamed from: s */
    public Typeface f1192s;

    /* renamed from: t */
    public Typeface f1193t;

    /* renamed from: u */
    public Typeface f1194u;

    /* renamed from: v */
    public Typeface f1195v;

    /* renamed from: w */
    public Typeface f1196w;

    /* renamed from: x */
    public Typeface f1197x;

    /* renamed from: y */
    public C0455a f1198y;

    /* renamed from: f */
    public int f1178f = 16;

    /* renamed from: g */
    public int f1180g = 16;

    /* renamed from: h */
    public float f1181h = 15.0f;

    /* renamed from: i */
    public float f1182i = 15.0f;

    /* renamed from: z */
    public final TextUtils.TruncateAt f1199z = TextUtils.TruncateAt.END;

    /* renamed from: D */
    public final boolean f1145D = true;

    /* renamed from: d0 */
    public final int f1175d0 = 1;

    /* renamed from: e0 */
    public final float f1177e0 = 1.0f;

    /* renamed from: f0 */
    public final int f1179f0 = 1;

    public C0373b(TextInputLayout textInputLayout) {
        this.f1168a = textInputLayout;
        TextPaint textPaint = new TextPaint(129);
        this.f1155N = textPaint;
        this.f1156O = new TextPaint(textPaint);
        this.f1174d = new Rect();
        this.f1172c = new Rect();
        this.f1176e = new RectF();
        m1049g(textInputLayout.getContext().getResources().getConfiguration());
    }

    /* renamed from: a */
    public static int m1043a(int i2, int i3, float f) {
        float f2 = 1.0f - f;
        return Color.argb(Math.round((Color.alpha(i3) * f) + (Color.alpha(i2) * f2)), Math.round((Color.red(i3) * f) + (Color.red(i2) * f2)), Math.round((Color.green(i3) * f) + (Color.green(i2) * f2)), Math.round((Color.blue(i3) * f) + (Color.blue(i2) * f2)));
    }

    /* renamed from: f */
    public static float m1044f(float f, float f2, float f3, TimeInterpolator timeInterpolator) {
        if (timeInterpolator != null) {
            f3 = timeInterpolator.getInterpolation(f3);
        }
        return AbstractC1400a.m3164a(f, f2, f3);
    }

    /* renamed from: b */
    public final boolean m1045b(CharSequence charSequence) {
        WeakHashMap weakHashMap = AbstractC0241P.f815a;
        boolean z2 = this.f1168a.getLayoutDirection() == 1;
        if (this.f1145D) {
            return (z2 ? AbstractC0205h.f759d : AbstractC0205h.f758c).m279b(charSequence, charSequence.length());
        }
        return z2;
    }

    /* renamed from: c */
    public final void m1046c(float f, boolean z2) {
        float f2;
        float f3;
        Typeface typeface;
        boolean z3;
        Layout.Alignment alignment;
        if (this.f1142A == null) {
            return;
        }
        float fWidth = this.f1174d.width();
        float fWidth2 = this.f1172c.width();
        if (Math.abs(f - 1.0f) < 1.0E-5f) {
            f2 = this.f1182i;
            f3 = this.f1163V;
            this.f1147F = 1.0f;
            typeface = this.f1191r;
        } else {
            float f4 = this.f1181h;
            float f5 = this.f1164W;
            Typeface typeface2 = this.f1194u;
            if (Math.abs(f - 0.0f) < 1.0E-5f) {
                this.f1147F = 1.0f;
            } else {
                this.f1147F = m1044f(this.f1181h, this.f1182i, f, this.f1158Q) / this.f1181h;
            }
            float f6 = this.f1182i / this.f1181h;
            fWidth = (z2 || fWidth2 * f6 <= fWidth) ? fWidth2 : Math.min(fWidth / f6, fWidth2);
            f2 = f4;
            f3 = f5;
            typeface = typeface2;
        }
        TextPaint textPaint = this.f1155N;
        if (fWidth > 0.0f) {
            boolean z4 = this.f1148G != f2;
            boolean z5 = this.f1165X != f3;
            boolean z6 = this.f1197x != typeface;
            StaticLayout staticLayout = this.f1166Y;
            boolean z7 = z4 || z5 || (staticLayout != null && (fWidth > ((float) staticLayout.getWidth()) ? 1 : (fWidth == ((float) staticLayout.getWidth()) ? 0 : -1)) != 0) || z6 || this.f1154M;
            this.f1148G = f2;
            this.f1165X = f3;
            this.f1197x = typeface;
            this.f1154M = false;
            textPaint.setLinearText(this.f1147F != 1.0f);
            z3 = z7;
        } else {
            z3 = false;
        }
        if (this.f1143B == null || z3) {
            textPaint.setTextSize(this.f1148G);
            textPaint.setTypeface(this.f1197x);
            textPaint.setLetterSpacing(this.f1165X);
            boolean zM1045b = m1045b(this.f1142A);
            this.f1144C = zM1045b;
            int i2 = this.f1175d0;
            if (i2 <= 1 || zM1045b) {
                i2 = 1;
            }
            if (i2 == 1) {
                alignment = Layout.Alignment.ALIGN_NORMAL;
            } else {
                int absoluteGravity = Gravity.getAbsoluteGravity(this.f1178f, zM1045b ? 1 : 0) & 7;
                alignment = absoluteGravity != 1 ? absoluteGravity != 5 ? this.f1144C ? Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL : this.f1144C ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_CENTER;
            }
            C0394w c0394w = new C0394w(this.f1142A, textPaint, (int) fWidth);
            c0394w.f1267k = this.f1199z;
            c0394w.f1266j = zM1045b;
            c0394w.f1261e = alignment;
            c0394w.f1265i = false;
            c0394w.f1262f = i2;
            c0394w.f1263g = this.f1177e0;
            c0394w.f1264h = this.f1179f0;
            StaticLayout staticLayoutM1075a = c0394w.m1075a();
            staticLayoutM1075a.getClass();
            this.f1166Y = staticLayoutM1075a;
            this.f1143B = staticLayoutM1075a.getText();
        }
    }

    /* renamed from: d */
    public final float m1047d() {
        TextPaint textPaint = this.f1156O;
        textPaint.setTextSize(this.f1182i);
        textPaint.setTypeface(this.f1191r);
        textPaint.setLetterSpacing(this.f1163V);
        return -textPaint.ascent();
    }

    /* renamed from: e */
    public final int m1048e(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return 0;
        }
        int[] iArr = this.f1153L;
        return iArr != null ? colorStateList.getColorForState(iArr, 0) : colorStateList.getDefaultColor();
    }

    /* renamed from: g */
    public final void m1049g(Configuration configuration) {
        if (Build.VERSION.SDK_INT >= 31) {
            Typeface typeface = this.f1193t;
            if (typeface != null) {
                this.f1192s = AbstractC0364l.m992S(configuration, typeface);
            }
            Typeface typeface2 = this.f1196w;
            if (typeface2 != null) {
                this.f1195v = AbstractC0364l.m992S(configuration, typeface2);
            }
            Typeface typeface3 = this.f1192s;
            if (typeface3 == null) {
                typeface3 = this.f1193t;
            }
            this.f1191r = typeface3;
            Typeface typeface4 = this.f1195v;
            if (typeface4 == null) {
                typeface4 = this.f1196w;
            }
            this.f1194u = typeface4;
            m1050h(true);
        }
    }

    /* renamed from: h */
    public final void m1050h(boolean z2) {
        float fMeasureText;
        StaticLayout staticLayout;
        TextInputLayout textInputLayout = this.f1168a;
        if ((textInputLayout.getHeight() <= 0 || textInputLayout.getWidth() <= 0) && !z2) {
            return;
        }
        m1046c(1.0f, z2);
        CharSequence charSequence = this.f1143B;
        TextPaint textPaint = this.f1155N;
        if (charSequence != null && (staticLayout = this.f1166Y) != null) {
            this.f1173c0 = TextUtils.ellipsize(charSequence, textPaint, staticLayout.getWidth(), this.f1199z);
        }
        CharSequence charSequence2 = this.f1173c0;
        if (charSequence2 != null) {
            this.f1167Z = textPaint.measureText(charSequence2, 0, charSequence2.length());
        } else {
            this.f1167Z = 0.0f;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(this.f1180g, this.f1144C ? 1 : 0);
        int i2 = absoluteGravity & 112;
        Rect rect = this.f1174d;
        if (i2 == 48) {
            this.f1186m = rect.top;
        } else if (i2 != 80) {
            this.f1186m = rect.centerY() - ((textPaint.descent() - textPaint.ascent()) / 2.0f);
        } else {
            this.f1186m = textPaint.ascent() + rect.bottom;
        }
        int i3 = absoluteGravity & 8388615;
        if (i3 == 1) {
            this.f1188o = rect.centerX() - (this.f1167Z / 2.0f);
        } else if (i3 != 5) {
            this.f1188o = rect.left;
        } else {
            this.f1188o = rect.right - this.f1167Z;
        }
        m1046c(0.0f, z2);
        float height = this.f1166Y != null ? r1.getHeight() : 0.0f;
        StaticLayout staticLayout2 = this.f1166Y;
        if (staticLayout2 == null || this.f1175d0 <= 1) {
            CharSequence charSequence3 = this.f1143B;
            fMeasureText = charSequence3 != null ? textPaint.measureText(charSequence3, 0, charSequence3.length()) : 0.0f;
        } else {
            fMeasureText = staticLayout2.getWidth();
        }
        StaticLayout staticLayout3 = this.f1166Y;
        if (staticLayout3 != null) {
            staticLayout3.getLineCount();
        }
        int absoluteGravity2 = Gravity.getAbsoluteGravity(this.f1178f, this.f1144C ? 1 : 0);
        int i4 = absoluteGravity2 & 112;
        Rect rect2 = this.f1172c;
        if (i4 == 48) {
            this.f1185l = rect2.top;
        } else if (i4 != 80) {
            this.f1185l = rect2.centerY() - (height / 2.0f);
        } else {
            this.f1185l = textPaint.descent() + (rect2.bottom - height);
        }
        int i5 = absoluteGravity2 & 8388615;
        if (i5 == 1) {
            this.f1187n = rect2.centerX() - (fMeasureText / 2.0f);
        } else if (i5 != 5) {
            this.f1187n = rect2.left;
        } else {
            this.f1187n = rect2.right - fMeasureText;
        }
        Bitmap bitmap = this.f1146E;
        if (bitmap != null) {
            bitmap.recycle();
            this.f1146E = null;
        }
        m1054l(this.f1170b);
        float f = this.f1170b;
        float fM1044f = m1044f(rect2.left, rect.left, f, this.f1157P);
        RectF rectF = this.f1176e;
        rectF.left = fM1044f;
        rectF.top = m1044f(this.f1185l, this.f1186m, f, this.f1157P);
        rectF.right = m1044f(rect2.right, rect.right, f, this.f1157P);
        rectF.bottom = m1044f(rect2.bottom, rect.bottom, f, this.f1157P);
        this.f1189p = m1044f(this.f1187n, this.f1188o, f, this.f1157P);
        this.f1190q = m1044f(this.f1185l, this.f1186m, f, this.f1157P);
        m1054l(f);
        C0603a c0603a = AbstractC1400a.f6067b;
        this.f1169a0 = 1.0f - m1044f(0.0f, 1.0f, 1.0f - f, c0603a);
        WeakHashMap weakHashMap = AbstractC0241P.f815a;
        textInputLayout.postInvalidateOnAnimation();
        this.f1171b0 = m1044f(1.0f, 0.0f, f, c0603a);
        textInputLayout.postInvalidateOnAnimation();
        ColorStateList colorStateList = this.f1184k;
        ColorStateList colorStateList2 = this.f1183j;
        if (colorStateList != colorStateList2) {
            textPaint.setColor(m1043a(m1048e(colorStateList2), m1048e(this.f1184k), f));
        } else {
            textPaint.setColor(m1048e(colorStateList));
        }
        float f2 = this.f1163V;
        float f3 = this.f1164W;
        if (f2 != f3) {
            textPaint.setLetterSpacing(m1044f(f3, f2, f, c0603a));
        } else {
            textPaint.setLetterSpacing(f2);
        }
        this.f1149H = AbstractC1400a.m3164a(0.0f, this.f1159R, f);
        this.f1150I = AbstractC1400a.m3164a(0.0f, this.f1160S, f);
        this.f1151J = AbstractC1400a.m3164a(0.0f, this.f1161T, f);
        int iM1043a = m1043a(0, m1048e(this.f1162U), f);
        this.f1152K = iM1043a;
        textPaint.setShadowLayer(this.f1149H, this.f1150I, this.f1151J, iM1043a);
        textInputLayout.postInvalidateOnAnimation();
    }

    /* renamed from: i */
    public final void m1051i(ColorStateList colorStateList) {
        if (this.f1184k == colorStateList && this.f1183j == colorStateList) {
            return;
        }
        this.f1184k = colorStateList;
        this.f1183j = colorStateList;
        m1050h(false);
    }

    /* renamed from: j */
    public final boolean m1052j(Typeface typeface) {
        C0455a c0455a = this.f1198y;
        if (c0455a != null) {
            c0455a.f1361p = true;
        }
        if (this.f1193t == typeface) {
            return false;
        }
        this.f1193t = typeface;
        Typeface typefaceM992S = AbstractC0364l.m992S(this.f1168a.getContext().getResources().getConfiguration(), typeface);
        this.f1192s = typefaceM992S;
        if (typefaceM992S == null) {
            typefaceM992S = this.f1193t;
        }
        this.f1191r = typefaceM992S;
        return true;
    }

    /* renamed from: k */
    public final void m1053k(float f) {
        if (f < 0.0f) {
            f = 0.0f;
        } else if (f > 1.0f) {
            f = 1.0f;
        }
        if (f != this.f1170b) {
            this.f1170b = f;
            float f2 = this.f1172c.left;
            Rect rect = this.f1174d;
            float fM1044f = m1044f(f2, rect.left, f, this.f1157P);
            RectF rectF = this.f1176e;
            rectF.left = fM1044f;
            rectF.top = m1044f(this.f1185l, this.f1186m, f, this.f1157P);
            rectF.right = m1044f(r1.right, rect.right, f, this.f1157P);
            rectF.bottom = m1044f(r1.bottom, rect.bottom, f, this.f1157P);
            this.f1189p = m1044f(this.f1187n, this.f1188o, f, this.f1157P);
            this.f1190q = m1044f(this.f1185l, this.f1186m, f, this.f1157P);
            m1054l(f);
            C0603a c0603a = AbstractC1400a.f6067b;
            this.f1169a0 = 1.0f - m1044f(0.0f, 1.0f, 1.0f - f, c0603a);
            WeakHashMap weakHashMap = AbstractC0241P.f815a;
            TextInputLayout textInputLayout = this.f1168a;
            textInputLayout.postInvalidateOnAnimation();
            this.f1171b0 = m1044f(1.0f, 0.0f, f, c0603a);
            textInputLayout.postInvalidateOnAnimation();
            ColorStateList colorStateList = this.f1184k;
            ColorStateList colorStateList2 = this.f1183j;
            TextPaint textPaint = this.f1155N;
            if (colorStateList != colorStateList2) {
                textPaint.setColor(m1043a(m1048e(colorStateList2), m1048e(this.f1184k), f));
            } else {
                textPaint.setColor(m1048e(colorStateList));
            }
            float f3 = this.f1163V;
            float f4 = this.f1164W;
            if (f3 != f4) {
                textPaint.setLetterSpacing(m1044f(f4, f3, f, c0603a));
            } else {
                textPaint.setLetterSpacing(f3);
            }
            this.f1149H = AbstractC1400a.m3164a(0.0f, this.f1159R, f);
            this.f1150I = AbstractC1400a.m3164a(0.0f, this.f1160S, f);
            this.f1151J = AbstractC1400a.m3164a(0.0f, this.f1161T, f);
            int iM1043a = m1043a(0, m1048e(this.f1162U), f);
            this.f1152K = iM1043a;
            textPaint.setShadowLayer(this.f1149H, this.f1150I, this.f1151J, iM1043a);
            textInputLayout.postInvalidateOnAnimation();
        }
    }

    /* renamed from: l */
    public final void m1054l(float f) {
        m1046c(f, false);
        WeakHashMap weakHashMap = AbstractC0241P.f815a;
        this.f1168a.postInvalidateOnAnimation();
    }

    /* renamed from: m */
    public final void m1055m(Typeface typeface) {
        boolean z2;
        boolean zM1052j = m1052j(typeface);
        if (this.f1196w != typeface) {
            this.f1196w = typeface;
            Typeface typefaceM992S = AbstractC0364l.m992S(this.f1168a.getContext().getResources().getConfiguration(), typeface);
            this.f1195v = typefaceM992S;
            if (typefaceM992S == null) {
                typefaceM992S = this.f1196w;
            }
            this.f1194u = typefaceM992S;
            z2 = true;
        } else {
            z2 = false;
        }
        if (zM1052j || z2) {
            m1050h(false);
        }
    }
}
