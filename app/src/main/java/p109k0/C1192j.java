package p109k0;

import android.graphics.Matrix;
import android.graphics.Paint;
import java.util.ArrayList;
import p119o.C1240b;

/* renamed from: k0.j */
/* loaded from: classes.dex */
public final class C1192j extends AbstractC1193k {

    /* renamed from: a */
    public final Matrix f4836a;

    /* renamed from: b */
    public final ArrayList f4837b;

    /* renamed from: c */
    public float f4838c;

    /* renamed from: d */
    public float f4839d;

    /* renamed from: e */
    public float f4840e;

    /* renamed from: f */
    public float f4841f;

    /* renamed from: g */
    public float f4842g;

    /* renamed from: h */
    public float f4843h;

    /* renamed from: i */
    public float f4844i;

    /* renamed from: j */
    public final Matrix f4845j;

    /* renamed from: k */
    public String f4846k;

    public C1192j() {
        this.f4836a = new Matrix();
        this.f4837b = new ArrayList();
        this.f4838c = 0.0f;
        this.f4839d = 0.0f;
        this.f4840e = 0.0f;
        this.f4841f = 1.0f;
        this.f4842g = 1.0f;
        this.f4843h = 0.0f;
        this.f4844i = 0.0f;
        this.f4845j = new Matrix();
        this.f4846k = null;
    }

    @Override // p109k0.AbstractC1193k
    /* renamed from: a */
    public final boolean mo2832a() {
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.f4837b;
            if (i2 >= arrayList.size()) {
                return false;
            }
            if (((AbstractC1193k) arrayList.get(i2)).mo2832a()) {
                return true;
            }
            i2++;
        }
    }

    @Override // p109k0.AbstractC1193k
    /* renamed from: b */
    public final boolean mo2833b(int[] iArr) {
        int i2 = 0;
        boolean zMo2833b = false;
        while (true) {
            ArrayList arrayList = this.f4837b;
            if (i2 >= arrayList.size()) {
                return zMo2833b;
            }
            zMo2833b |= ((AbstractC1193k) arrayList.get(i2)).mo2833b(iArr);
            i2++;
        }
    }

    /* renamed from: c */
    public final void m2834c() {
        Matrix matrix = this.f4845j;
        matrix.reset();
        matrix.postTranslate(-this.f4839d, -this.f4840e);
        matrix.postScale(this.f4841f, this.f4842g);
        matrix.postRotate(this.f4838c, 0.0f, 0.0f);
        matrix.postTranslate(this.f4843h + this.f4839d, this.f4844i + this.f4840e);
    }

    public String getGroupName() {
        return this.f4846k;
    }

    public Matrix getLocalMatrix() {
        return this.f4845j;
    }

    public float getPivotX() {
        return this.f4839d;
    }

    public float getPivotY() {
        return this.f4840e;
    }

    public float getRotation() {
        return this.f4838c;
    }

    public float getScaleX() {
        return this.f4841f;
    }

    public float getScaleY() {
        return this.f4842g;
    }

    public float getTranslateX() {
        return this.f4843h;
    }

    public float getTranslateY() {
        return this.f4844i;
    }

    public void setPivotX(float f) {
        if (f != this.f4839d) {
            this.f4839d = f;
            m2834c();
        }
    }

    public void setPivotY(float f) {
        if (f != this.f4840e) {
            this.f4840e = f;
            m2834c();
        }
    }

    public void setRotation(float f) {
        if (f != this.f4838c) {
            this.f4838c = f;
            m2834c();
        }
    }

    public void setScaleX(float f) {
        if (f != this.f4841f) {
            this.f4841f = f;
            m2834c();
        }
    }

    public void setScaleY(float f) {
        if (f != this.f4842g) {
            this.f4842g = f;
            m2834c();
        }
    }

    public void setTranslateX(float f) {
        if (f != this.f4843h) {
            this.f4843h = f;
            m2834c();
        }
    }

    public void setTranslateY(float f) {
        if (f != this.f4844i) {
            this.f4844i = f;
            m2834c();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1192j(C1192j c1192j, C1240b c1240b) {
        C1190h c1190h;
        this.f4836a = new Matrix();
        this.f4837b = new ArrayList();
        this.f4838c = 0.0f;
        this.f4839d = 0.0f;
        this.f4840e = 0.0f;
        this.f4841f = 1.0f;
        this.f4842g = 1.0f;
        this.f4843h = 0.0f;
        this.f4844i = 0.0f;
        Matrix matrix = new Matrix();
        this.f4845j = matrix;
        this.f4846k = null;
        this.f4838c = c1192j.f4838c;
        this.f4839d = c1192j.f4839d;
        this.f4840e = c1192j.f4840e;
        this.f4841f = c1192j.f4841f;
        this.f4842g = c1192j.f4842g;
        this.f4843h = c1192j.f4843h;
        this.f4844i = c1192j.f4844i;
        String str = c1192j.f4846k;
        this.f4846k = str;
        if (str != null) {
            c1240b.put(str, this);
        }
        matrix.set(c1192j.f4845j);
        ArrayList arrayList = c1192j.f4837b;
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            Object obj = arrayList.get(i2);
            if (obj instanceof C1192j) {
                this.f4837b.add(new C1192j((C1192j) obj, c1240b));
            } else {
                if (obj instanceof C1191i) {
                    C1191i c1191i = (C1191i) obj;
                    C1191i c1191i2 = new C1191i(c1191i);
                    c1191i2.f4826e = 0.0f;
                    c1191i2.f4828g = 1.0f;
                    c1191i2.f4829h = 1.0f;
                    c1191i2.f4830i = 0.0f;
                    c1191i2.f4831j = 1.0f;
                    c1191i2.f4832k = 0.0f;
                    c1191i2.f4833l = Paint.Cap.BUTT;
                    c1191i2.f4834m = Paint.Join.MITER;
                    c1191i2.f4835n = 4.0f;
                    c1191i2.f4825d = c1191i.f4825d;
                    c1191i2.f4826e = c1191i.f4826e;
                    c1191i2.f4828g = c1191i.f4828g;
                    c1191i2.f4827f = c1191i.f4827f;
                    c1191i2.f4849c = c1191i.f4849c;
                    c1191i2.f4829h = c1191i.f4829h;
                    c1191i2.f4830i = c1191i.f4830i;
                    c1191i2.f4831j = c1191i.f4831j;
                    c1191i2.f4832k = c1191i.f4832k;
                    c1191i2.f4833l = c1191i.f4833l;
                    c1191i2.f4834m = c1191i.f4834m;
                    c1191i2.f4835n = c1191i.f4835n;
                    c1190h = c1191i2;
                } else if (obj instanceof C1190h) {
                    c1190h = new C1190h((C1190h) obj);
                } else {
                    throw new IllegalStateException("Unknown object in the tree!");
                }
                this.f4837b.add(c1190h);
                Object obj2 = c1190h.f4848b;
                if (obj2 != null) {
                    c1240b.put(obj2, c1190h);
                }
            }
        }
    }
}
