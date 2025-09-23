package p144x;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.Map;
import p141w.AbstractC1381a;

/* renamed from: x.d */
/* loaded from: classes.dex */
public final class C1391d extends ViewGroup.MarginLayoutParams {

    /* renamed from: a */
    public AbstractC1388a f6008a;

    /* renamed from: b */
    public boolean f6009b;

    /* renamed from: c */
    public final int f6010c;

    /* renamed from: d */
    public final int f6011d;

    /* renamed from: e */
    public final int f6012e;

    /* renamed from: f */
    public final int f6013f;

    /* renamed from: g */
    public final int f6014g;

    /* renamed from: h */
    public int f6015h;

    /* renamed from: i */
    public int f6016i;

    /* renamed from: j */
    public int f6017j;

    /* renamed from: k */
    public View f6018k;

    /* renamed from: l */
    public View f6019l;

    /* renamed from: m */
    public boolean f6020m;

    /* renamed from: n */
    public boolean f6021n;

    /* renamed from: o */
    public final Rect f6022o;

    public C1391d() {
        super(-2, -2);
        this.f6009b = false;
        this.f6010c = 0;
        this.f6011d = 0;
        this.f6012e = -1;
        this.f6013f = -1;
        this.f6014g = 0;
        this.f6015h = 0;
        this.f6022o = new Rect();
    }

    /* renamed from: a */
    public final boolean m3162a(int i2) {
        if (i2 == 0) {
            return this.f6020m;
        }
        if (i2 != 1) {
            return false;
        }
        return this.f6021n;
    }

    public C1391d(Context context, AttributeSet attributeSet) throws NoSuchMethodException, SecurityException {
        AbstractC1388a abstractC1388a;
        super(context, attributeSet);
        this.f6009b = false;
        this.f6010c = 0;
        this.f6011d = 0;
        this.f6012e = -1;
        this.f6013f = -1;
        this.f6014g = 0;
        this.f6015h = 0;
        this.f6022o = new Rect();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC1381a.f5998b);
        this.f6010c = typedArrayObtainStyledAttributes.getInteger(0, 0);
        this.f6013f = typedArrayObtainStyledAttributes.getResourceId(1, -1);
        this.f6011d = typedArrayObtainStyledAttributes.getInteger(2, 0);
        this.f6012e = typedArrayObtainStyledAttributes.getInteger(6, -1);
        this.f6014g = typedArrayObtainStyledAttributes.getInt(5, 0);
        this.f6015h = typedArrayObtainStyledAttributes.getInt(4, 0);
        boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(3);
        this.f6009b = zHasValue;
        if (zHasValue) {
            String string = typedArrayObtainStyledAttributes.getString(3);
            String str = CoordinatorLayout.f2277t;
            if (TextUtils.isEmpty(string)) {
                abstractC1388a = null;
            } else {
                if (string.startsWith(".")) {
                    string = context.getPackageName() + string;
                } else if (string.indexOf(46) < 0) {
                    String str2 = CoordinatorLayout.f2277t;
                    if (!TextUtils.isEmpty(str2)) {
                        string = str2 + '.' + string;
                    }
                }
                try {
                    ThreadLocal threadLocal = CoordinatorLayout.f2279v;
                    Map map = (Map) threadLocal.get();
                    if (map == null) {
                        map = new HashMap();
                        threadLocal.set(map);
                    }
                    Constructor<?> constructor = (Constructor) map.get(string);
                    if (constructor == null) {
                        constructor = Class.forName(string, false, context.getClassLoader()).getConstructor(CoordinatorLayout.f2278u);
                        constructor.setAccessible(true);
                        map.put(string, constructor);
                    }
                    abstractC1388a = (AbstractC1388a) constructor.newInstance(context, attributeSet);
                } catch (Exception e3) {
                    throw new RuntimeException("Could not inflate Behavior subclass " + string, e3);
                }
            }
            this.f6008a = abstractC1388a;
        }
        typedArrayObtainStyledAttributes.recycle();
        AbstractC1388a abstractC1388a2 = this.f6008a;
        if (abstractC1388a2 != null) {
            abstractC1388a2.mo2052g(this);
        }
    }

    public C1391d(C1391d c1391d) {
        super((ViewGroup.MarginLayoutParams) c1391d);
        this.f6009b = false;
        this.f6010c = 0;
        this.f6011d = 0;
        this.f6012e = -1;
        this.f6013f = -1;
        this.f6014g = 0;
        this.f6015h = 0;
        this.f6022o = new Rect();
    }

    public C1391d(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.f6009b = false;
        this.f6010c = 0;
        this.f6011d = 0;
        this.f6012e = -1;
        this.f6013f = -1;
        this.f6014g = 0;
        this.f6015h = 0;
        this.f6022o = new Rect();
    }

    public C1391d(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.f6009b = false;
        this.f6010c = 0;
        this.f6011d = 0;
        this.f6012e = -1;
        this.f6013f = -1;
        this.f6014g = 0;
        this.f6015h = 0;
        this.f6022o = new Rect();
    }
}
