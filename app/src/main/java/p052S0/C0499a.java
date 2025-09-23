package p052S0;

import android.graphics.Paint;
import android.graphics.Path;
import p006C.AbstractC0069a;

/* renamed from: S0.a */
/* loaded from: classes.dex */
public final class C0499a {

    /* renamed from: i */
    public static final int[] f1522i = new int[3];

    /* renamed from: j */
    public static final float[] f1523j = {0.0f, 0.5f, 1.0f};

    /* renamed from: k */
    public static final int[] f1524k = new int[4];

    /* renamed from: l */
    public static final float[] f1525l = {0.0f, 0.0f, 0.5f, 1.0f};

    /* renamed from: a */
    public final Paint f1526a;

    /* renamed from: b */
    public final Paint f1527b;

    /* renamed from: c */
    public final Paint f1528c;

    /* renamed from: d */
    public final int f1529d;

    /* renamed from: e */
    public final int f1530e;

    /* renamed from: f */
    public final int f1531f;

    /* renamed from: g */
    public final Path f1532g = new Path();

    /* renamed from: h */
    public final Paint f1533h;

    public C0499a() {
        Paint paint = new Paint();
        this.f1533h = paint;
        Paint paint2 = new Paint();
        this.f1526a = paint2;
        this.f1529d = AbstractC0069a.m195d(-16777216, 68);
        this.f1530e = AbstractC0069a.m195d(-16777216, 20);
        this.f1531f = AbstractC0069a.m195d(-16777216, 0);
        paint2.setColor(this.f1529d);
        paint.setColor(0);
        Paint paint3 = new Paint(4);
        this.f1527b = paint3;
        paint3.setStyle(Paint.Style.FILL);
        this.f1528c = new Paint(paint3);
    }
}
