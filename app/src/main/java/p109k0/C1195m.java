package p109k0;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import java.util.ArrayList;
import p003B.C0048d;
import p006C.C0076h;
import p119o.C1240b;

/* renamed from: k0.m */
/* loaded from: classes.dex */
public final class C1195m {

    /* renamed from: p */
    public static final Matrix f4850p = new Matrix();

    /* renamed from: a */
    public final Path f4851a;

    /* renamed from: b */
    public final Path f4852b;

    /* renamed from: c */
    public final Matrix f4853c;

    /* renamed from: d */
    public Paint f4854d;

    /* renamed from: e */
    public Paint f4855e;

    /* renamed from: f */
    public PathMeasure f4856f;

    /* renamed from: g */
    public final C1192j f4857g;

    /* renamed from: h */
    public float f4858h;

    /* renamed from: i */
    public float f4859i;

    /* renamed from: j */
    public float f4860j;

    /* renamed from: k */
    public float f4861k;

    /* renamed from: l */
    public int f4862l;

    /* renamed from: m */
    public String f4863m;

    /* renamed from: n */
    public Boolean f4864n;

    /* renamed from: o */
    public final C1240b f4865o;

    public C1195m() {
        this.f4853c = new Matrix();
        this.f4858h = 0.0f;
        this.f4859i = 0.0f;
        this.f4860j = 0.0f;
        this.f4861k = 0.0f;
        this.f4862l = 255;
        this.f4863m = null;
        this.f4864n = null;
        this.f4865o = new C1240b();
        this.f4857g = new C1192j();
        this.f4851a = new Path();
        this.f4852b = new Path();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public final void m2835a(C1192j c1192j, Matrix matrix, Canvas canvas, int i2, int i3) {
        char c3;
        float f;
        float f2;
        int i4;
        C1192j c1192j2 = c1192j;
        char c4 = 1;
        c1192j2.f4836a.set(matrix);
        Matrix matrix2 = c1192j2.f4836a;
        matrix2.preConcat(c1192j2.f4845j);
        canvas.save();
        char c5 = 0;
        int i5 = 0;
        while (true) {
            ArrayList arrayList = c1192j2.f4837b;
            if (i5 >= arrayList.size()) {
                canvas.restore();
                return;
            }
            AbstractC1193k abstractC1193k = (AbstractC1193k) arrayList.get(i5);
            if (abstractC1193k instanceof C1192j) {
                m2835a((C1192j) abstractC1193k, matrix2, canvas, i2, i3);
            } else if (abstractC1193k instanceof AbstractC1194l) {
                AbstractC1194l abstractC1194l = (AbstractC1194l) abstractC1193k;
                float f3 = i2 / this.f4860j;
                float f4 = i3 / this.f4861k;
                float fMin = Math.min(f3, f4);
                Matrix matrix3 = this.f4853c;
                matrix3.set(matrix2);
                matrix3.postScale(f3, f4);
                float[] fArr = {0.0f, 1.0f, 1.0f, 0.0f};
                matrix2.mapVectors(fArr);
                float fHypot = (float) Math.hypot(fArr[c5], fArr[c4]);
                boolean z2 = c4;
                boolean z3 = c5;
                float fHypot2 = (float) Math.hypot(fArr[2], fArr[3]);
                float f5 = (fArr[z3 ? 1 : 0] * fArr[3]) - (fArr[z2 ? 1 : 0] * fArr[2]);
                float fMax = Math.max(fHypot, fHypot2);
                float fAbs = fMax > 0.0f ? Math.abs(f5) / fMax : 0.0f;
                if (fAbs != 0.0f) {
                    Path path = this.f4851a;
                    abstractC1194l.getClass();
                    path.reset();
                    C0076h[] c0076hArr = abstractC1194l.f4847a;
                    if (c0076hArr != null) {
                        C0076h.m244b(c0076hArr, path);
                    }
                    Path path2 = this.f4852b;
                    path2.reset();
                    if (abstractC1194l instanceof C1190h) {
                        path2.setFillType(abstractC1194l.f4849c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                        path2.addPath(path, matrix3);
                        canvas.clipPath(path2);
                    } else {
                        C1191i c1191i = (C1191i) abstractC1194l;
                        float f6 = c1191i.f4830i;
                        if (f6 != 0.0f || c1191i.f4831j != 1.0f) {
                            float f7 = c1191i.f4832k;
                            float f8 = (f6 + f7) % 1.0f;
                            float f9 = (c1191i.f4831j + f7) % 1.0f;
                            if (this.f4856f == null) {
                                this.f4856f = new PathMeasure();
                            }
                            this.f4856f.setPath(path, z3);
                            float length = this.f4856f.getLength();
                            float f10 = f8 * length;
                            float f11 = f9 * length;
                            path.reset();
                            if (f10 > f11) {
                                this.f4856f.getSegment(f10, length, path, z2);
                                f = 0.0f;
                                this.f4856f.getSegment(0.0f, f11, path, z2);
                            } else {
                                f = 0.0f;
                                this.f4856f.getSegment(f10, f11, path, z2);
                            }
                            path.rLineTo(f, f);
                        }
                        path2.addPath(path, matrix3);
                        C0048d c0048d = c1191i.f4827f;
                        if ((((Shader) c0048d.f116c) == null && c0048d.f115b == 0) ? false : true) {
                            if (this.f4855e == null) {
                                i4 = 16777215;
                                Paint paint = new Paint(1);
                                this.f4855e = paint;
                                paint.setStyle(Paint.Style.FILL);
                            } else {
                                i4 = 16777215;
                            }
                            Paint paint2 = this.f4855e;
                            Shader shader = (Shader) c0048d.f116c;
                            if (shader != null) {
                                shader.setLocalMatrix(matrix3);
                                paint2.setShader(shader);
                                paint2.setAlpha(Math.round(c1191i.f4829h * 255.0f));
                                f2 = 255.0f;
                            } else {
                                paint2.setShader(null);
                                paint2.setAlpha(255);
                                int i6 = c0048d.f115b;
                                float f12 = c1191i.f4829h;
                                PorterDuff.Mode mode = C1198p.f4879j;
                                f2 = 255.0f;
                                paint2.setColor((i6 & i4) | (((int) (Color.alpha(i6) * f12)) << 24));
                            }
                            paint2.setColorFilter(null);
                            path2.setFillType(c1191i.f4849c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                            canvas.drawPath(path2, paint2);
                        } else {
                            f2 = 255.0f;
                            i4 = 16777215;
                        }
                        C0048d c0048d2 = c1191i.f4825d;
                        if (((Shader) c0048d2.f116c) != null || c0048d2.f115b != 0) {
                            if (this.f4854d == null) {
                                Paint paint3 = new Paint(1);
                                this.f4854d = paint3;
                                paint3.setStyle(Paint.Style.STROKE);
                            }
                            Paint paint4 = this.f4854d;
                            Paint.Join join = c1191i.f4834m;
                            if (join != null) {
                                paint4.setStrokeJoin(join);
                            }
                            Paint.Cap cap = c1191i.f4833l;
                            if (cap != null) {
                                paint4.setStrokeCap(cap);
                            }
                            paint4.setStrokeMiter(c1191i.f4835n);
                            Shader shader2 = (Shader) c0048d2.f116c;
                            if (shader2 != null) {
                                shader2.setLocalMatrix(matrix3);
                                paint4.setShader(shader2);
                                paint4.setAlpha(Math.round(c1191i.f4828g * f2));
                            } else {
                                paint4.setShader(null);
                                paint4.setAlpha(255);
                                int i7 = c0048d2.f115b;
                                float f13 = c1191i.f4828g;
                                PorterDuff.Mode mode2 = C1198p.f4879j;
                                paint4.setColor((i7 & i4) | (((int) (Color.alpha(i7) * f13)) << 24));
                            }
                            paint4.setColorFilter(null);
                            paint4.setStrokeWidth(c1191i.f4826e * fMin * fAbs);
                            canvas.drawPath(path2, paint4);
                        }
                    }
                }
                c3 = 1;
                i5++;
                c1192j2 = c1192j;
                c4 = c3;
                c5 = 0;
            }
            c3 = c4;
            i5++;
            c1192j2 = c1192j;
            c4 = c3;
            c5 = 0;
        }
    }

    public float getAlpha() {
        return getRootAlpha() / 255.0f;
    }

    public int getRootAlpha() {
        return this.f4862l;
    }

    public void setAlpha(float f) {
        setRootAlpha((int) (f * 255.0f));
    }

    public void setRootAlpha(int i2) {
        this.f4862l = i2;
    }

    public C1195m(C1195m c1195m) {
        this.f4853c = new Matrix();
        this.f4858h = 0.0f;
        this.f4859i = 0.0f;
        this.f4860j = 0.0f;
        this.f4861k = 0.0f;
        this.f4862l = 255;
        this.f4863m = null;
        this.f4864n = null;
        C1240b c1240b = new C1240b();
        this.f4865o = c1240b;
        this.f4857g = new C1192j(c1195m.f4857g, c1240b);
        this.f4851a = new Path(c1195m.f4851a);
        this.f4852b = new Path(c1195m.f4852b);
        this.f4858h = c1195m.f4858h;
        this.f4859i = c1195m.f4859i;
        this.f4860j = c1195m.f4860j;
        this.f4861k = c1195m.f4861k;
        this.f4862l = c1195m.f4862l;
        this.f4863m = c1195m.f4863m;
        String str = c1195m.f4863m;
        if (str != null) {
            c1240b.put(str, this);
        }
        this.f4864n = c1195m.f4864n;
    }
}
