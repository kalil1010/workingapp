package p055T0;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.BitSet;
import p001A0.C0004c;
import p033L1.AbstractC0356d;

/* renamed from: T0.m */
/* loaded from: classes.dex */
public final class C0519m {

    /* renamed from: a */
    public final C0527u[] f1649a = new C0527u[4];

    /* renamed from: b */
    public final Matrix[] f1650b = new Matrix[4];

    /* renamed from: c */
    public final Matrix[] f1651c = new Matrix[4];

    /* renamed from: d */
    public final PointF f1652d = new PointF();

    /* renamed from: e */
    public final Path f1653e = new Path();

    /* renamed from: f */
    public final Path f1654f = new Path();

    /* renamed from: g */
    public final C0527u f1655g = new C0527u();

    /* renamed from: h */
    public final float[] f1656h = new float[2];

    /* renamed from: i */
    public final float[] f1657i = new float[2];

    /* renamed from: j */
    public final Path f1658j = new Path();

    /* renamed from: k */
    public final Path f1659k = new Path();

    /* renamed from: l */
    public final boolean f1660l = true;

    public C0519m() {
        for (int i2 = 0; i2 < 4; i2++) {
            this.f1649a[i2] = new C0527u();
            this.f1650b[i2] = new Matrix();
            this.f1651c[i2] = new Matrix();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v6 */
    /* renamed from: a */
    public final void m1301a(C0517k c0517k, float f, RectF rectF, C0004c c0004c, Path path) {
        Matrix[] matrixArr;
        Matrix[] matrixArr2;
        C0527u[] c0527uArr;
        int i2;
        boolean z2;
        float[] fArr;
        float f2;
        boolean z3;
        int i3;
        C0519m c0519m = this;
        path.rewind();
        Path path2 = c0519m.f1653e;
        path2.rewind();
        Path path3 = c0519m.f1654f;
        path3.rewind();
        path3.addRect(rectF, Path.Direction.CW);
        int i4 = 0;
        while (true) {
            matrixArr = c0519m.f1651c;
            matrixArr2 = c0519m.f1650b;
            c0527uArr = c0519m.f1649a;
            i2 = 4;
            z2 = 0;
            fArr = c0519m.f1656h;
            if (i4 >= 4) {
                break;
            }
            InterfaceC0509c interfaceC0509c = i4 != 1 ? i4 != 2 ? i4 != 3 ? c0517k.f1641f : c0517k.f1640e : c0517k.f1643h : c0517k.f1642g;
            AbstractC0356d abstractC0356d = i4 != 1 ? i4 != 2 ? i4 != 3 ? c0517k.f1637b : c0517k.f1636a : c0517k.f1639d : c0517k.f1638c;
            C0527u c0527u = c0527uArr[i4];
            abstractC0356d.getClass();
            abstractC0356d.mo974t(c0527u, f, interfaceC0509c.mo1270a(rectF));
            int i5 = i4 + 1;
            float f3 = (i5 % 4) * 90;
            matrixArr2[i4].reset();
            PointF pointF = c0519m.f1652d;
            if (i4 == 1) {
                i3 = i4;
                pointF.set(rectF.right, rectF.bottom);
            } else if (i4 == 2) {
                i3 = i4;
                pointF.set(rectF.left, rectF.bottom);
            } else if (i4 != 3) {
                i3 = i4;
                pointF.set(rectF.right, rectF.top);
            } else {
                i3 = i4;
                pointF.set(rectF.left, rectF.top);
            }
            matrixArr2[i3].setTranslate(pointF.x, pointF.y);
            matrixArr2[i3].preRotate(f3);
            C0527u c0527u2 = c0527uArr[i3];
            fArr[0] = c0527u2.f1680b;
            fArr[1] = c0527u2.f1681c;
            matrixArr2[i3].mapPoints(fArr);
            matrixArr[i3].reset();
            matrixArr[i3].setTranslate(fArr[0], fArr[1]);
            matrixArr[i3].preRotate(f3);
            i4 = i5;
        }
        int i6 = 0;
        while (i6 < i2) {
            C0527u c0527u3 = c0527uArr[i6];
            c0527u3.getClass();
            fArr[z2] = 0.0f;
            fArr[1] = c0527u3.f1679a;
            matrixArr2[i6].mapPoints(fArr);
            if (i6 == 0) {
                path.moveTo(fArr[z2], fArr[1]);
            } else {
                path.lineTo(fArr[z2], fArr[1]);
            }
            c0527uArr[i6].m1307b(matrixArr2[i6], path);
            if (c0004c != null) {
                C0527u c0527u4 = c0527uArr[i6];
                Matrix matrix = matrixArr2[i6];
                C0513g c0513g = (C0513g) c0004c.f7b;
                BitSet bitSet = c0513g.f1604d;
                c0527u4.getClass();
                f2 = 0.0f;
                bitSet.set(i6, z2);
                c0527u4.m1306a(c0527u4.f1683e);
                c0513g.f1602b[i6] = new C0520n(new ArrayList(c0527u4.f1685g), new Matrix(matrix));
            } else {
                f2 = 0.0f;
            }
            int i7 = i6 + 1;
            int i8 = i7 % 4;
            C0527u c0527u5 = c0527uArr[i6];
            fArr[0] = c0527u5.f1680b;
            fArr[1] = c0527u5.f1681c;
            matrixArr2[i6].mapPoints(fArr);
            C0527u c0527u6 = c0527uArr[i8];
            c0527u6.getClass();
            float[] fArr2 = c0519m.f1657i;
            fArr2[0] = f2;
            fArr2[1] = c0527u6.f1679a;
            matrixArr2[i8].mapPoints(fArr2);
            Matrix[] matrixArr3 = matrixArr2;
            C0527u[] c0527uArr2 = c0527uArr;
            float fMax = Math.max(((float) Math.hypot(fArr[0] - fArr2[0], fArr[1] - fArr2[1])) - 0.001f, f2);
            C0527u c0527u7 = c0527uArr2[i6];
            fArr[0] = c0527u7.f1680b;
            fArr[1] = c0527u7.f1681c;
            matrixArr3[i6].mapPoints(fArr);
            if (i6 == 1 || i6 == 3) {
                Math.abs(rectF.centerX() - fArr[0]);
            } else {
                Math.abs(rectF.centerY() - fArr[1]);
            }
            C0527u c0527u8 = c0519m.f1655g;
            c0527u8.m1309d(0.0f, 270.0f, 0.0f);
            (i6 != 1 ? i6 != 2 ? i6 != 3 ? c0517k.f1645j : c0517k.f1644i : c0517k.f1647l : c0517k.f1646k).getClass();
            c0527u8.m1308c(fMax, 0.0f);
            Path path4 = c0519m.f1658j;
            path4.reset();
            c0527u8.m1307b(matrixArr[i6], path4);
            if (c0519m.f1660l && (c0519m.m1302b(path4, i6) || c0519m.m1302b(path4, i8))) {
                path4.op(path4, path3, Path.Op.DIFFERENCE);
                fArr[0] = 0.0f;
                fArr[1] = c0527u8.f1679a;
                matrixArr[i6].mapPoints(fArr);
                path2.moveTo(fArr[0], fArr[1]);
                c0527u8.m1307b(matrixArr[i6], path2);
            } else {
                c0527u8.m1307b(matrixArr[i6], path);
            }
            if (c0004c != null) {
                Matrix matrix2 = matrixArr[i6];
                C0513g c0513g2 = (C0513g) c0004c.f7b;
                z3 = false;
                c0513g2.f1604d.set(i6 + 4, false);
                c0527u8.m1306a(c0527u8.f1683e);
                c0513g2.f1603c[i6] = new C0520n(new ArrayList(c0527u8.f1685g), new Matrix(matrix2));
            } else {
                z3 = false;
            }
            z2 = z3;
            i6 = i7;
            c0527uArr = c0527uArr2;
            matrixArr2 = matrixArr3;
            i2 = 4;
            c0519m = this;
        }
        path.close();
        path2.close();
        if (path2.isEmpty()) {
            return;
        }
        path.op(path2, Path.Op.UNION);
    }

    /* renamed from: b */
    public final boolean m1302b(Path path, int i2) {
        Path path2 = this.f1659k;
        path2.reset();
        this.f1649a[i2].m1307b(this.f1650b[i2], path2);
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        path2.computeBounds(rectF, true);
        path.op(path2, Path.Op.INTERSECT);
        path.computeBounds(rectF, true);
        return !rectF.isEmpty() || (rectF.width() > 1.0f && rectF.height() > 1.0f);
    }
}
