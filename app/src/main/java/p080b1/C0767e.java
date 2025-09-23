package p080b1;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import androidx.cardview.widget.CardView;
import java.io.Serializable;
import java.lang.reflect.Modifier;
import java.util.Collections;
import org.slf4j.ILoggerFactory;
import p002A1.C0019a;
import p033L1.AbstractC0364l;
import p055T0.C0507a;
import p055T0.C0517k;
import p085c2.InterfaceC0807a;
import p087d0.InterfaceC0848e;
import p093e2.AbstractC0901d;
import p093e2.C0898a;
import p102i.InterfaceC1018x;
import p102i.MenuC1006l;
import p117n.AbstractC1236b;
import p117n.C1235a;
import p145x0.AbstractC1395a;

/* renamed from: b1.e */
/* loaded from: classes.dex */
public final class C0767e implements InterfaceC0779q, InterfaceC0848e, ILoggerFactory, InterfaceC1018x {

    /* renamed from: b */
    public static C0767e f2881b;

    /* renamed from: a */
    public final /* synthetic */ int f2882a;

    public /* synthetic */ C0767e(int i2) {
        this.f2882a = i2;
    }

    /* renamed from: c */
    public static String m1973c(Class cls) {
        int modifiers = cls.getModifiers();
        if (Modifier.isInterface(modifiers)) {
            return "Interfaces can't be instantiated! Register an InstanceCreator or a TypeAdapter for this type. Interface name: ".concat(cls.getName());
        }
        if (Modifier.isAbstract(modifiers)) {
            return "Abstract classes can't be instantiated! Register an InstanceCreator or a TypeAdapter for this type. Class name: ".concat(cls.getName());
        }
        return null;
    }

    /* renamed from: d */
    public static C0767e m1974d(Context context, int i2) throws Resources.NotFoundException {
        AbstractC0364l.m1008o("Cannot create a CalendarItemStyle with a styleResId of 0", i2 != 0);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i2, AbstractC1395a.f6044m);
        Rect rect = new Rect(typedArrayObtainStyledAttributes.getDimensionPixelOffset(0, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(2, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(1, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(3, 0));
        AbstractC0901d.m2318t(context, typedArrayObtainStyledAttributes, 4);
        AbstractC0901d.m2318t(context, typedArrayObtainStyledAttributes, 9);
        AbstractC0901d.m2318t(context, typedArrayObtainStyledAttributes, 7);
        typedArrayObtainStyledAttributes.getDimensionPixelSize(8, 0);
        C0517k.m1296a(context, typedArrayObtainStyledAttributes.getResourceId(5, 0), typedArrayObtainStyledAttributes.getResourceId(6, 0), new C0507a(0)).m1295a();
        typedArrayObtainStyledAttributes.recycle();
        C0767e c0767e = new C0767e(2);
        AbstractC0364l.m1009p(rect.left);
        AbstractC0364l.m1009p(rect.top);
        AbstractC0364l.m1009p(rect.right);
        AbstractC0364l.m1009p(rect.bottom);
        return c0767e;
    }

    /* renamed from: h */
    public static Path m1975h(float f, float f2, float f3, float f4) {
        Path path = new Path();
        path.moveTo(f, f2);
        path.lineTo(f3, f4);
        return path;
    }

    /* renamed from: j */
    private final void m1976j(int i2, Serializable serializable) {
    }

    @Override // p102i.InterfaceC1018x
    /* renamed from: a */
    public void mo1977a(MenuC1006l menuC1006l, boolean z2) {
    }

    @Override // org.slf4j.ILoggerFactory
    /* renamed from: b */
    public InterfaceC0807a mo1457b(String str) {
        return C0898a.f3727a;
    }

    @Override // p087d0.InterfaceC0848e
    /* renamed from: e */
    public void mo1978e(int i2, Serializable serializable) {
        switch (this.f2882a) {
            case 3:
                break;
            default:
                if (i2 == 6 || i2 == 7 || i2 == 8) {
                    break;
                }
                break;
        }
    }

    @Override // p102i.InterfaceC1018x
    /* renamed from: f */
    public boolean mo1979f(MenuC1006l menuC1006l) {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x0124  */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public p080b1.InterfaceC0779q m1980g(p098g1.C0970a r10) throws java.lang.NoSuchMethodException, java.lang.SecurityException {
        /*
            Method dump skipped, instructions count: 330
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p080b1.C0767e.m1980g(g1.a):b1.q");
    }

    @Override // p080b1.InterfaceC0779q
    /* renamed from: i */
    public Object mo22i() {
        return new C0778p(true);
    }

    /* renamed from: k */
    public void m1981k(C0019a c0019a, float f) {
        C1235a c1235a = (C1235a) ((Drawable) c0019a.f47c);
        CardView cardView = (CardView) c0019a.f46b;
        boolean useCompatPadding = cardView.getUseCompatPadding();
        boolean preventCornerOverlap = cardView.getPreventCornerOverlap();
        if (f != c1235a.f4957e || c1235a.f4958f != useCompatPadding || c1235a.f4959g != preventCornerOverlap) {
            c1235a.f4957e = f;
            c1235a.f4958f = useCompatPadding;
            c1235a.f4959g = preventCornerOverlap;
            c1235a.m2871b(null);
            c1235a.invalidateSelf();
        }
        if (!cardView.getUseCompatPadding()) {
            c0019a.m65K(0, 0, 0, 0);
            return;
        }
        C1235a c1235a2 = (C1235a) ((Drawable) c0019a.f47c);
        float f2 = c1235a2.f4957e;
        float f3 = c1235a2.f4953a;
        int iCeil = (int) Math.ceil(AbstractC1236b.m2872a(f2, f3, cardView.getPreventCornerOverlap()));
        int iCeil2 = (int) Math.ceil(AbstractC1236b.m2873b(f2, f3, cardView.getPreventCornerOverlap()));
        c0019a.m65K(iCeil, iCeil2, iCeil, iCeil2);
    }

    public String toString() {
        switch (this.f2882a) {
            case 1:
                return Collections.EMPTY_MAP.toString();
            default:
                return super.toString();
        }
    }
}
