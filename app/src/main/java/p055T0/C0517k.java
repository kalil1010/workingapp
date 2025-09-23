package p055T0;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import p033L1.AbstractC0356d;
import p033L1.AbstractC0364l;
import p145x0.AbstractC1395a;

/* renamed from: T0.k */
/* loaded from: classes.dex */
public final class C0517k {

    /* renamed from: a */
    public AbstractC0356d f1636a = new C0515i();

    /* renamed from: b */
    public AbstractC0356d f1637b = new C0515i();

    /* renamed from: c */
    public AbstractC0356d f1638c = new C0515i();

    /* renamed from: d */
    public AbstractC0356d f1639d = new C0515i();

    /* renamed from: e */
    public InterfaceC0509c f1640e = new C0507a(0.0f);

    /* renamed from: f */
    public InterfaceC0509c f1641f = new C0507a(0.0f);

    /* renamed from: g */
    public InterfaceC0509c f1642g = new C0507a(0.0f);

    /* renamed from: h */
    public InterfaceC0509c f1643h = new C0507a(0.0f);

    /* renamed from: i */
    public C0511e f1644i = new C0511e(0);

    /* renamed from: j */
    public C0511e f1645j = new C0511e(0);

    /* renamed from: k */
    public C0511e f1646k = new C0511e(0);

    /* renamed from: l */
    public C0511e f1647l = new C0511e(0);

    /* renamed from: a */
    public static C0516j m1296a(Context context, int i2, int i3, C0507a c0507a) {
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i2);
        if (i3 != 0) {
            contextThemeWrapper = new ContextThemeWrapper(contextThemeWrapper, i3);
        }
        TypedArray typedArrayObtainStyledAttributes = contextThemeWrapper.obtainStyledAttributes(AbstractC1395a.f6055x);
        try {
            int i4 = typedArrayObtainStyledAttributes.getInt(0, 0);
            int i5 = typedArrayObtainStyledAttributes.getInt(3, i4);
            int i6 = typedArrayObtainStyledAttributes.getInt(4, i4);
            int i7 = typedArrayObtainStyledAttributes.getInt(2, i4);
            int i8 = typedArrayObtainStyledAttributes.getInt(1, i4);
            InterfaceC0509c interfaceC0509cM1298c = m1298c(typedArrayObtainStyledAttributes, 5, c0507a);
            InterfaceC0509c interfaceC0509cM1298c2 = m1298c(typedArrayObtainStyledAttributes, 8, interfaceC0509cM1298c);
            InterfaceC0509c interfaceC0509cM1298c3 = m1298c(typedArrayObtainStyledAttributes, 9, interfaceC0509cM1298c);
            InterfaceC0509c interfaceC0509cM1298c4 = m1298c(typedArrayObtainStyledAttributes, 7, interfaceC0509cM1298c);
            InterfaceC0509c interfaceC0509cM1298c5 = m1298c(typedArrayObtainStyledAttributes, 6, interfaceC0509cM1298c);
            C0516j c0516j = new C0516j();
            AbstractC0356d abstractC0356dM1013u = AbstractC0364l.m1013u(i5);
            c0516j.f1624a = abstractC0356dM1013u;
            C0516j.m1294b(abstractC0356dM1013u);
            c0516j.f1628e = interfaceC0509cM1298c2;
            AbstractC0356d abstractC0356dM1013u2 = AbstractC0364l.m1013u(i6);
            c0516j.f1625b = abstractC0356dM1013u2;
            C0516j.m1294b(abstractC0356dM1013u2);
            c0516j.f1629f = interfaceC0509cM1298c3;
            AbstractC0356d abstractC0356dM1013u3 = AbstractC0364l.m1013u(i7);
            c0516j.f1626c = abstractC0356dM1013u3;
            C0516j.m1294b(abstractC0356dM1013u3);
            c0516j.f1630g = interfaceC0509cM1298c4;
            AbstractC0356d abstractC0356dM1013u4 = AbstractC0364l.m1013u(i8);
            c0516j.f1627d = abstractC0356dM1013u4;
            C0516j.m1294b(abstractC0356dM1013u4);
            c0516j.f1631h = interfaceC0509cM1298c5;
            return c0516j;
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* renamed from: b */
    public static C0516j m1297b(Context context, AttributeSet attributeSet, int i2, int i3) {
        C0507a c0507a = new C0507a(0);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC1395a.f6047p, i2, i3);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(1, 0);
        typedArrayObtainStyledAttributes.recycle();
        return m1296a(context, resourceId, resourceId2, c0507a);
    }

    /* renamed from: c */
    public static InterfaceC0509c m1298c(TypedArray typedArray, int i2, InterfaceC0509c interfaceC0509c) {
        TypedValue typedValuePeekValue = typedArray.peekValue(i2);
        if (typedValuePeekValue != null) {
            int i3 = typedValuePeekValue.type;
            if (i3 == 5) {
                return new C0507a(TypedValue.complexToDimensionPixelSize(typedValuePeekValue.data, typedArray.getResources().getDisplayMetrics()));
            }
            if (i3 == 6) {
                return new C0514h(typedValuePeekValue.getFraction(1.0f, 1.0f));
            }
        }
        return interfaceC0509c;
    }

    /* renamed from: d */
    public final boolean m1299d(RectF rectF) {
        boolean z2 = this.f1647l.getClass().equals(C0511e.class) && this.f1645j.getClass().equals(C0511e.class) && this.f1644i.getClass().equals(C0511e.class) && this.f1646k.getClass().equals(C0511e.class);
        float fMo1270a = this.f1640e.mo1270a(rectF);
        return z2 && ((this.f1641f.mo1270a(rectF) > fMo1270a ? 1 : (this.f1641f.mo1270a(rectF) == fMo1270a ? 0 : -1)) == 0 && (this.f1643h.mo1270a(rectF) > fMo1270a ? 1 : (this.f1643h.mo1270a(rectF) == fMo1270a ? 0 : -1)) == 0 && (this.f1642g.mo1270a(rectF) > fMo1270a ? 1 : (this.f1642g.mo1270a(rectF) == fMo1270a ? 0 : -1)) == 0) && ((this.f1637b instanceof C0515i) && (this.f1636a instanceof C0515i) && (this.f1638c instanceof C0515i) && (this.f1639d instanceof C0515i));
    }

    /* renamed from: e */
    public final C0516j m1300e() {
        C0516j c0516j = new C0516j();
        c0516j.f1624a = this.f1636a;
        c0516j.f1625b = this.f1637b;
        c0516j.f1626c = this.f1638c;
        c0516j.f1627d = this.f1639d;
        c0516j.f1628e = this.f1640e;
        c0516j.f1629f = this.f1641f;
        c0516j.f1630g = this.f1642g;
        c0516j.f1631h = this.f1643h;
        c0516j.f1632i = this.f1644i;
        c0516j.f1633j = this.f1645j;
        c0516j.f1634k = this.f1646k;
        c0516j.f1635l = this.f1647l;
        return c0516j;
    }
}
