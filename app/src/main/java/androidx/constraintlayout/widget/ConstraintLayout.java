package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParserException;
import p002A1.C0019a;
import p124q.C1269c;
import p129s.C1315d;
import p129s.C1316e;
import p129s.C1319h;
import p138v.AbstractC1358c;
import p138v.AbstractC1359d;
import p138v.AbstractC1370o;
import p138v.AbstractC1372q;
import p138v.C1360e;
import p138v.C1361f;
import p138v.C1369n;
import p138v.C1373r;

/* loaded from: classes.dex */
public class ConstraintLayout extends ViewGroup {

    /* renamed from: r */
    public static C1373r f2258r;

    /* renamed from: a */
    public final SparseArray f2259a;

    /* renamed from: b */
    public final ArrayList f2260b;

    /* renamed from: c */
    public final C1316e f2261c;

    /* renamed from: d */
    public int f2262d;

    /* renamed from: e */
    public int f2263e;

    /* renamed from: f */
    public int f2264f;

    /* renamed from: g */
    public int f2265g;

    /* renamed from: h */
    public boolean f2266h;

    /* renamed from: i */
    public int f2267i;

    /* renamed from: j */
    public C1369n f2268j;

    /* renamed from: k */
    public C0019a f2269k;

    /* renamed from: l */
    public int f2270l;

    /* renamed from: m */
    public HashMap f2271m;

    /* renamed from: n */
    public final SparseArray f2272n;

    /* renamed from: o */
    public final C1361f f2273o;

    /* renamed from: p */
    public int f2274p;

    /* renamed from: q */
    public int f2275q;

    public ConstraintLayout(Context context, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        super(context, attributeSet);
        this.f2259a = new SparseArray();
        this.f2260b = new ArrayList(4);
        this.f2261c = new C1316e();
        this.f2262d = 0;
        this.f2263e = 0;
        this.f2264f = Integer.MAX_VALUE;
        this.f2265g = Integer.MAX_VALUE;
        this.f2266h = true;
        this.f2267i = 257;
        this.f2268j = null;
        this.f2269k = null;
        this.f2270l = -1;
        this.f2271m = new HashMap();
        this.f2272n = new SparseArray();
        this.f2273o = new C1361f(this, this);
        this.f2274p = 0;
        this.f2275q = 0;
        m1545i(attributeSet, 0);
    }

    /* renamed from: g */
    public static C1360e m1543g() {
        C1360e c1360e = new C1360e(-2, -2);
        c1360e.f5796a = -1;
        c1360e.f5798b = -1;
        c1360e.f5800c = -1.0f;
        c1360e.f5802d = true;
        c1360e.f5804e = -1;
        c1360e.f5806f = -1;
        c1360e.f5808g = -1;
        c1360e.f5810h = -1;
        c1360e.f5812i = -1;
        c1360e.f5814j = -1;
        c1360e.f5816k = -1;
        c1360e.f5818l = -1;
        c1360e.f5820m = -1;
        c1360e.f5822n = -1;
        c1360e.f5824o = -1;
        c1360e.f5826p = -1;
        c1360e.f5828q = 0;
        c1360e.f5829r = 0.0f;
        c1360e.f5830s = -1;
        c1360e.f5831t = -1;
        c1360e.f5832u = -1;
        c1360e.f5833v = -1;
        c1360e.f5834w = Integer.MIN_VALUE;
        c1360e.f5835x = Integer.MIN_VALUE;
        c1360e.f5836y = Integer.MIN_VALUE;
        c1360e.f5837z = Integer.MIN_VALUE;
        c1360e.f5770A = Integer.MIN_VALUE;
        c1360e.f5771B = Integer.MIN_VALUE;
        c1360e.f5772C = Integer.MIN_VALUE;
        c1360e.f5773D = 0;
        c1360e.f5774E = 0.5f;
        c1360e.f5775F = 0.5f;
        c1360e.f5776G = null;
        c1360e.f5777H = -1.0f;
        c1360e.f5778I = -1.0f;
        c1360e.f5779J = 0;
        c1360e.f5780K = 0;
        c1360e.f5781L = 0;
        c1360e.f5782M = 0;
        c1360e.f5783N = 0;
        c1360e.f5784O = 0;
        c1360e.f5785P = 0;
        c1360e.f5786Q = 0;
        c1360e.f5787R = 1.0f;
        c1360e.f5788S = 1.0f;
        c1360e.f5789T = -1;
        c1360e.f5790U = -1;
        c1360e.f5791V = -1;
        c1360e.f5792W = false;
        c1360e.f5793X = false;
        c1360e.f5794Y = null;
        c1360e.f5795Z = 0;
        c1360e.f5797a0 = true;
        c1360e.f5799b0 = true;
        c1360e.f5801c0 = false;
        c1360e.f5803d0 = false;
        c1360e.f5805e0 = false;
        c1360e.f5807f0 = -1;
        c1360e.f5809g0 = -1;
        c1360e.f5811h0 = -1;
        c1360e.f5813i0 = -1;
        c1360e.f5815j0 = Integer.MIN_VALUE;
        c1360e.f5817k0 = Integer.MIN_VALUE;
        c1360e.f5819l0 = 0.5f;
        c1360e.f5827p0 = new C1315d();
        return c1360e;
    }

    private int getPaddingWidth() {
        int iMax = Math.max(0, getPaddingRight()) + Math.max(0, getPaddingLeft());
        int iMax2 = Math.max(0, getPaddingEnd()) + Math.max(0, getPaddingStart());
        return iMax2 > 0 ? iMax2 : iMax;
    }

    public static C1373r getSharedValues() {
        if (f2258r == null) {
            C1373r c1373r = new C1373r();
            new SparseIntArray();
            new HashMap();
            f2258r = c1373r;
        }
        return f2258r;
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C1360e;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) throws NumberFormatException {
        Object tag;
        int size;
        ArrayList arrayList = this.f2260b;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            for (int i2 = 0; i2 < size; i2++) {
                ((AbstractC1358c) arrayList.get(i2)).getClass();
            }
        }
        super.dispatchDraw(canvas);
        if (isInEditMode()) {
            float width = getWidth();
            float height = getHeight();
            int childCount = getChildCount();
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = getChildAt(i3);
                if (childAt.getVisibility() != 8 && (tag = childAt.getTag()) != null && (tag instanceof String)) {
                    String[] strArrSplit = ((String) tag).split(",");
                    if (strArrSplit.length == 4) {
                        int i4 = Integer.parseInt(strArrSplit[0]);
                        int i5 = Integer.parseInt(strArrSplit[1]);
                        int i6 = Integer.parseInt(strArrSplit[2]);
                        int i7 = (int) ((i4 / 1080.0f) * width);
                        int i8 = (int) ((i5 / 1920.0f) * height);
                        Paint paint = new Paint();
                        paint.setColor(-65536);
                        float f = i7;
                        float f2 = i8;
                        float f3 = i7 + ((int) ((i6 / 1080.0f) * width));
                        canvas.drawLine(f, f2, f3, f2, paint);
                        float f4 = i8 + ((int) ((Integer.parseInt(strArrSplit[3]) / 1920.0f) * height));
                        canvas.drawLine(f3, f2, f3, f4, paint);
                        canvas.drawLine(f3, f4, f, f4, paint);
                        canvas.drawLine(f, f4, f, f2, paint);
                        paint.setColor(-16711936);
                        canvas.drawLine(f, f2, f3, f4, paint);
                        canvas.drawLine(f, f4, f3, f2, paint);
                    }
                }
            }
        }
    }

    @Override // android.view.View
    public final void forceLayout() {
        this.f2266h = true;
        super.forceLayout();
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return m1543g();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        C1360e c1360e = new C1360e(context, attributeSet);
        c1360e.f5796a = -1;
        c1360e.f5798b = -1;
        c1360e.f5800c = -1.0f;
        c1360e.f5802d = true;
        c1360e.f5804e = -1;
        c1360e.f5806f = -1;
        c1360e.f5808g = -1;
        c1360e.f5810h = -1;
        c1360e.f5812i = -1;
        c1360e.f5814j = -1;
        c1360e.f5816k = -1;
        c1360e.f5818l = -1;
        c1360e.f5820m = -1;
        c1360e.f5822n = -1;
        c1360e.f5824o = -1;
        c1360e.f5826p = -1;
        c1360e.f5828q = 0;
        c1360e.f5829r = 0.0f;
        c1360e.f5830s = -1;
        c1360e.f5831t = -1;
        c1360e.f5832u = -1;
        c1360e.f5833v = -1;
        c1360e.f5834w = Integer.MIN_VALUE;
        c1360e.f5835x = Integer.MIN_VALUE;
        c1360e.f5836y = Integer.MIN_VALUE;
        c1360e.f5837z = Integer.MIN_VALUE;
        c1360e.f5770A = Integer.MIN_VALUE;
        c1360e.f5771B = Integer.MIN_VALUE;
        c1360e.f5772C = Integer.MIN_VALUE;
        c1360e.f5773D = 0;
        c1360e.f5774E = 0.5f;
        c1360e.f5775F = 0.5f;
        c1360e.f5776G = null;
        c1360e.f5777H = -1.0f;
        c1360e.f5778I = -1.0f;
        c1360e.f5779J = 0;
        c1360e.f5780K = 0;
        c1360e.f5781L = 0;
        c1360e.f5782M = 0;
        c1360e.f5783N = 0;
        c1360e.f5784O = 0;
        c1360e.f5785P = 0;
        c1360e.f5786Q = 0;
        c1360e.f5787R = 1.0f;
        c1360e.f5788S = 1.0f;
        c1360e.f5789T = -1;
        c1360e.f5790U = -1;
        c1360e.f5791V = -1;
        c1360e.f5792W = false;
        c1360e.f5793X = false;
        c1360e.f5794Y = null;
        c1360e.f5795Z = 0;
        c1360e.f5797a0 = true;
        c1360e.f5799b0 = true;
        c1360e.f5801c0 = false;
        c1360e.f5803d0 = false;
        c1360e.f5805e0 = false;
        c1360e.f5807f0 = -1;
        c1360e.f5809g0 = -1;
        c1360e.f5811h0 = -1;
        c1360e.f5813i0 = -1;
        c1360e.f5815j0 = Integer.MIN_VALUE;
        c1360e.f5817k0 = Integer.MIN_VALUE;
        c1360e.f5819l0 = 0.5f;
        c1360e.f5827p0 = new C1315d();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC1372q.f5972b);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i2 = 0; i2 < indexCount; i2++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i2);
            int i3 = AbstractC1359d.f5769a.get(index);
            switch (i3) {
                case 1:
                    c1360e.f5791V = typedArrayObtainStyledAttributes.getInt(index, c1360e.f5791V);
                    break;
                case 2:
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, c1360e.f5826p);
                    c1360e.f5826p = resourceId;
                    if (resourceId == -1) {
                        c1360e.f5826p = typedArrayObtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    c1360e.f5828q = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1360e.f5828q);
                    break;
                case 4:
                    float f = typedArrayObtainStyledAttributes.getFloat(index, c1360e.f5829r) % 360.0f;
                    c1360e.f5829r = f;
                    if (f < 0.0f) {
                        c1360e.f5829r = (360.0f - f) % 360.0f;
                        break;
                    } else {
                        break;
                    }
                case 5:
                    c1360e.f5796a = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, c1360e.f5796a);
                    break;
                case 6:
                    c1360e.f5798b = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, c1360e.f5798b);
                    break;
                case 7:
                    c1360e.f5800c = typedArrayObtainStyledAttributes.getFloat(index, c1360e.f5800c);
                    break;
                case 8:
                    int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, c1360e.f5804e);
                    c1360e.f5804e = resourceId2;
                    if (resourceId2 == -1) {
                        c1360e.f5804e = typedArrayObtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    int resourceId3 = typedArrayObtainStyledAttributes.getResourceId(index, c1360e.f5806f);
                    c1360e.f5806f = resourceId3;
                    if (resourceId3 == -1) {
                        c1360e.f5806f = typedArrayObtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 10:
                    int resourceId4 = typedArrayObtainStyledAttributes.getResourceId(index, c1360e.f5808g);
                    c1360e.f5808g = resourceId4;
                    if (resourceId4 == -1) {
                        c1360e.f5808g = typedArrayObtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    int resourceId5 = typedArrayObtainStyledAttributes.getResourceId(index, c1360e.f5810h);
                    c1360e.f5810h = resourceId5;
                    if (resourceId5 == -1) {
                        c1360e.f5810h = typedArrayObtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    int resourceId6 = typedArrayObtainStyledAttributes.getResourceId(index, c1360e.f5812i);
                    c1360e.f5812i = resourceId6;
                    if (resourceId6 == -1) {
                        c1360e.f5812i = typedArrayObtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 13:
                    int resourceId7 = typedArrayObtainStyledAttributes.getResourceId(index, c1360e.f5814j);
                    c1360e.f5814j = resourceId7;
                    if (resourceId7 == -1) {
                        c1360e.f5814j = typedArrayObtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    int resourceId8 = typedArrayObtainStyledAttributes.getResourceId(index, c1360e.f5816k);
                    c1360e.f5816k = resourceId8;
                    if (resourceId8 == -1) {
                        c1360e.f5816k = typedArrayObtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    int resourceId9 = typedArrayObtainStyledAttributes.getResourceId(index, c1360e.f5818l);
                    c1360e.f5818l = resourceId9;
                    if (resourceId9 == -1) {
                        c1360e.f5818l = typedArrayObtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 16:
                    int resourceId10 = typedArrayObtainStyledAttributes.getResourceId(index, c1360e.f5820m);
                    c1360e.f5820m = resourceId10;
                    if (resourceId10 == -1) {
                        c1360e.f5820m = typedArrayObtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 17:
                    int resourceId11 = typedArrayObtainStyledAttributes.getResourceId(index, c1360e.f5830s);
                    c1360e.f5830s = resourceId11;
                    if (resourceId11 == -1) {
                        c1360e.f5830s = typedArrayObtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 18:
                    int resourceId12 = typedArrayObtainStyledAttributes.getResourceId(index, c1360e.f5831t);
                    c1360e.f5831t = resourceId12;
                    if (resourceId12 == -1) {
                        c1360e.f5831t = typedArrayObtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 19:
                    int resourceId13 = typedArrayObtainStyledAttributes.getResourceId(index, c1360e.f5832u);
                    c1360e.f5832u = resourceId13;
                    if (resourceId13 == -1) {
                        c1360e.f5832u = typedArrayObtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 20:
                    int resourceId14 = typedArrayObtainStyledAttributes.getResourceId(index, c1360e.f5833v);
                    c1360e.f5833v = resourceId14;
                    if (resourceId14 == -1) {
                        c1360e.f5833v = typedArrayObtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 21:
                    c1360e.f5834w = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1360e.f5834w);
                    break;
                case 22:
                    c1360e.f5835x = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1360e.f5835x);
                    break;
                case 23:
                    c1360e.f5836y = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1360e.f5836y);
                    break;
                case 24:
                    c1360e.f5837z = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1360e.f5837z);
                    break;
                case 25:
                    c1360e.f5770A = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1360e.f5770A);
                    break;
                case 26:
                    c1360e.f5771B = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1360e.f5771B);
                    break;
                case 27:
                    c1360e.f5792W = typedArrayObtainStyledAttributes.getBoolean(index, c1360e.f5792W);
                    break;
                case 28:
                    c1360e.f5793X = typedArrayObtainStyledAttributes.getBoolean(index, c1360e.f5793X);
                    break;
                case 29:
                    c1360e.f5774E = typedArrayObtainStyledAttributes.getFloat(index, c1360e.f5774E);
                    break;
                case 30:
                    c1360e.f5775F = typedArrayObtainStyledAttributes.getFloat(index, c1360e.f5775F);
                    break;
                case 31:
                    c1360e.f5781L = typedArrayObtainStyledAttributes.getInt(index, 0);
                    break;
                case 32:
                    c1360e.f5782M = typedArrayObtainStyledAttributes.getInt(index, 0);
                    break;
                case 33:
                    try {
                        c1360e.f5783N = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1360e.f5783N);
                        break;
                    } catch (Exception unused) {
                        if (typedArrayObtainStyledAttributes.getInt(index, c1360e.f5783N) == -2) {
                            c1360e.f5783N = -2;
                            break;
                        } else {
                            break;
                        }
                    }
                case 34:
                    try {
                        c1360e.f5785P = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1360e.f5785P);
                        break;
                    } catch (Exception unused2) {
                        if (typedArrayObtainStyledAttributes.getInt(index, c1360e.f5785P) == -2) {
                            c1360e.f5785P = -2;
                            break;
                        } else {
                            break;
                        }
                    }
                case 35:
                    c1360e.f5787R = Math.max(0.0f, typedArrayObtainStyledAttributes.getFloat(index, c1360e.f5787R));
                    c1360e.f5781L = 2;
                    break;
                case 36:
                    try {
                        c1360e.f5784O = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1360e.f5784O);
                        break;
                    } catch (Exception unused3) {
                        if (typedArrayObtainStyledAttributes.getInt(index, c1360e.f5784O) == -2) {
                            c1360e.f5784O = -2;
                            break;
                        } else {
                            break;
                        }
                    }
                case 37:
                    try {
                        c1360e.f5786Q = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1360e.f5786Q);
                        break;
                    } catch (Exception unused4) {
                        if (typedArrayObtainStyledAttributes.getInt(index, c1360e.f5786Q) == -2) {
                            c1360e.f5786Q = -2;
                            break;
                        } else {
                            break;
                        }
                    }
                case 38:
                    c1360e.f5788S = Math.max(0.0f, typedArrayObtainStyledAttributes.getFloat(index, c1360e.f5788S));
                    c1360e.f5782M = 2;
                    break;
                default:
                    switch (i3) {
                        case 44:
                            C1369n.m3140h(c1360e, typedArrayObtainStyledAttributes.getString(index));
                            break;
                        case 45:
                            c1360e.f5777H = typedArrayObtainStyledAttributes.getFloat(index, c1360e.f5777H);
                            break;
                        case 46:
                            c1360e.f5778I = typedArrayObtainStyledAttributes.getFloat(index, c1360e.f5778I);
                            break;
                        case 47:
                            c1360e.f5779J = typedArrayObtainStyledAttributes.getInt(index, 0);
                            break;
                        case 48:
                            c1360e.f5780K = typedArrayObtainStyledAttributes.getInt(index, 0);
                            break;
                        case 49:
                            c1360e.f5789T = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, c1360e.f5789T);
                            break;
                        case 50:
                            c1360e.f5790U = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, c1360e.f5790U);
                            break;
                        case 51:
                            c1360e.f5794Y = typedArrayObtainStyledAttributes.getString(index);
                            break;
                        case 52:
                            int resourceId15 = typedArrayObtainStyledAttributes.getResourceId(index, c1360e.f5822n);
                            c1360e.f5822n = resourceId15;
                            if (resourceId15 == -1) {
                                c1360e.f5822n = typedArrayObtainStyledAttributes.getInt(index, -1);
                                break;
                            } else {
                                break;
                            }
                        case 53:
                            int resourceId16 = typedArrayObtainStyledAttributes.getResourceId(index, c1360e.f5824o);
                            c1360e.f5824o = resourceId16;
                            if (resourceId16 == -1) {
                                c1360e.f5824o = typedArrayObtainStyledAttributes.getInt(index, -1);
                                break;
                            } else {
                                break;
                            }
                        case 54:
                            c1360e.f5773D = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1360e.f5773D);
                            break;
                        case 55:
                            c1360e.f5772C = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1360e.f5772C);
                            break;
                        default:
                            switch (i3) {
                                case 64:
                                    C1369n.m3139g(c1360e, typedArrayObtainStyledAttributes, index, 0);
                                    break;
                                case 65:
                                    C1369n.m3139g(c1360e, typedArrayObtainStyledAttributes, index, 1);
                                    break;
                                case 66:
                                    c1360e.f5795Z = typedArrayObtainStyledAttributes.getInt(index, c1360e.f5795Z);
                                    break;
                                case 67:
                                    c1360e.f5802d = typedArrayObtainStyledAttributes.getBoolean(index, c1360e.f5802d);
                                    break;
                            }
                    }
            }
        }
        typedArrayObtainStyledAttributes.recycle();
        c1360e.m3124a();
        return c1360e;
    }

    public int getMaxHeight() {
        return this.f2265g;
    }

    public int getMaxWidth() {
        return this.f2264f;
    }

    public int getMinHeight() {
        return this.f2263e;
    }

    public int getMinWidth() {
        return this.f2262d;
    }

    public int getOptimizationLevel() {
        return this.f2261c.f5557D0;
    }

    public String getSceneString() {
        int id;
        StringBuilder sb = new StringBuilder();
        C1316e c1316e = this.f2261c;
        if (c1316e.f5530j == null) {
            int id2 = getId();
            if (id2 != -1) {
                c1316e.f5530j = getContext().getResources().getResourceEntryName(id2);
            } else {
                c1316e.f5530j = "parent";
            }
        }
        if (c1316e.f5527h0 == null) {
            c1316e.f5527h0 = c1316e.f5530j;
        }
        Iterator it = c1316e.f5566q0.iterator();
        while (it.hasNext()) {
            C1315d c1315d = (C1315d) it.next();
            View view = c1315d.f5523f0;
            if (view != null) {
                if (c1315d.f5530j == null && (id = view.getId()) != -1) {
                    c1315d.f5530j = getContext().getResources().getResourceEntryName(id);
                }
                if (c1315d.f5527h0 == null) {
                    c1315d.f5527h0 = c1315d.f5530j;
                }
            }
        }
        c1316e.mo3020n(sb);
        return sb.toString();
    }

    /* renamed from: h */
    public final C1315d m1544h(View view) {
        if (view == this) {
            return this.f2261c;
        }
        if (view == null) {
            return null;
        }
        if (view.getLayoutParams() instanceof C1360e) {
            return ((C1360e) view.getLayoutParams()).f5827p0;
        }
        view.setLayoutParams(generateLayoutParams(view.getLayoutParams()));
        if (view.getLayoutParams() instanceof C1360e) {
            return ((C1360e) view.getLayoutParams()).f5827p0;
        }
        return null;
    }

    /* renamed from: i */
    public final void m1545i(AttributeSet attributeSet, int i2) throws XmlPullParserException, IOException {
        C1316e c1316e = this.f2261c;
        c1316e.f5523f0 = this;
        C1361f c1361f = this.f2273o;
        c1316e.f5570u0 = c1361f;
        c1316e.f5568s0.f5669f = c1361f;
        this.f2259a.put(getId(), this);
        this.f2268j = null;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, AbstractC1372q.f5972b, i2, 0);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i3 = 0; i3 < indexCount; i3++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i3);
                if (index == 16) {
                    this.f2262d = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f2262d);
                } else if (index == 17) {
                    this.f2263e = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f2263e);
                } else if (index == 14) {
                    this.f2264f = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f2264f);
                } else if (index == 15) {
                    this.f2265g = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f2265g);
                } else if (index == 113) {
                    this.f2267i = typedArrayObtainStyledAttributes.getInt(index, this.f2267i);
                } else if (index == 56) {
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, 0);
                    if (resourceId != 0) {
                        try {
                            m1546j(resourceId);
                        } catch (Resources.NotFoundException unused) {
                            this.f2269k = null;
                        }
                    }
                } else if (index == 34) {
                    int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, 0);
                    try {
                        C1369n c1369n = new C1369n();
                        this.f2268j = c1369n;
                        c1369n.m3143e(getContext(), resourceId2);
                    } catch (Resources.NotFoundException unused2) {
                        this.f2268j = null;
                    }
                    this.f2270l = resourceId2;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        c1316e.f5557D0 = this.f2267i;
        C1269c.f5156p = c1316e.m3036W(512);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0075  */
    /* renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m1546j(int r10) throws org.xmlpull.v1.XmlPullParserException, android.content.res.Resources.NotFoundException, java.io.IOException {
        /*
            r9 = this;
            A1.a r0 = new A1.a
            android.content.Context r1 = r9.getContext()
            r2 = 23
            r3 = 0
            r0.<init>(r2, r3)
            android.util.SparseArray r2 = new android.util.SparseArray
            r2.<init>()
            r0.f47c = r2
            android.util.SparseArray r2 = new android.util.SparseArray
            r2.<init>()
            r0.f46b = r2
            android.content.res.Resources r2 = r1.getResources()
            android.content.res.XmlResourceParser r10 = r2.getXml(r10)
            int r2 = r10.getEventType()     // Catch: java.io.IOException -> L49 org.xmlpull.v1.XmlPullParserException -> L4b
            r3 = 0
        L27:
            r4 = 1
            if (r2 == r4) goto Lae
            if (r2 == 0) goto L9f
            r5 = 2
            if (r2 == r5) goto L31
            goto La2
        L31:
            java.lang.String r2 = r10.getName()     // Catch: java.io.IOException -> L49 org.xmlpull.v1.XmlPullParserException -> L4b
            int r6 = r2.hashCode()     // Catch: java.io.IOException -> L49 org.xmlpull.v1.XmlPullParserException -> L4b
            r7 = 4
            r8 = 3
            switch(r6) {
                case -1349929691: goto L6b;
                case 80204913: goto L61;
                case 1382829617: goto L58;
                case 1657696882: goto L4e;
                case 1901439077: goto L3f;
                default: goto L3e;
            }     // Catch: java.io.IOException -> L49 org.xmlpull.v1.XmlPullParserException -> L4b
        L3e:
            goto L75
        L3f:
            java.lang.String r4 = "Variant"
            boolean r2 = r2.equals(r4)     // Catch: java.io.IOException -> L49 org.xmlpull.v1.XmlPullParserException -> L4b
            if (r2 == 0) goto L75
            r4 = r8
            goto L76
        L49:
            r10 = move-exception
            goto La7
        L4b:
            r10 = move-exception
            goto Lab
        L4e:
            java.lang.String r4 = "layoutDescription"
            boolean r2 = r2.equals(r4)     // Catch: java.io.IOException -> L49 org.xmlpull.v1.XmlPullParserException -> L4b
            if (r2 == 0) goto L75
            r4 = 0
            goto L76
        L58:
            java.lang.String r6 = "StateSet"
            boolean r2 = r2.equals(r6)     // Catch: java.io.IOException -> L49 org.xmlpull.v1.XmlPullParserException -> L4b
            if (r2 == 0) goto L75
            goto L76
        L61:
            java.lang.String r4 = "State"
            boolean r2 = r2.equals(r4)     // Catch: java.io.IOException -> L49 org.xmlpull.v1.XmlPullParserException -> L4b
            if (r2 == 0) goto L75
            r4 = r5
            goto L76
        L6b:
            java.lang.String r4 = "ConstraintSet"
            boolean r2 = r2.equals(r4)     // Catch: java.io.IOException -> L49 org.xmlpull.v1.XmlPullParserException -> L4b
            if (r2 == 0) goto L75
            r4 = r7
            goto L76
        L75:
            r4 = -1
        L76:
            if (r4 == r5) goto L90
            if (r4 == r8) goto L81
            if (r4 == r7) goto L7d
            goto La2
        L7d:
            r0.m61G(r1, r10)     // Catch: java.io.IOException -> L49 org.xmlpull.v1.XmlPullParserException -> L4b
            goto La2
        L81:
            v.g r2 = new v.g     // Catch: java.io.IOException -> L49 org.xmlpull.v1.XmlPullParserException -> L4b
            r2.<init>(r1, r10)     // Catch: java.io.IOException -> L49 org.xmlpull.v1.XmlPullParserException -> L4b
            if (r3 == 0) goto La2
            java.lang.Object r4 = r3.f1061c     // Catch: java.io.IOException -> L49 org.xmlpull.v1.XmlPullParserException -> L4b
            java.util.ArrayList r4 = (java.util.ArrayList) r4     // Catch: java.io.IOException -> L49 org.xmlpull.v1.XmlPullParserException -> L4b
            r4.add(r2)     // Catch: java.io.IOException -> L49 org.xmlpull.v1.XmlPullParserException -> L4b
            goto La2
        L90:
            K1.y r3 = new K1.y     // Catch: java.io.IOException -> L49 org.xmlpull.v1.XmlPullParserException -> L4b
            r3.<init>(r1, r10)     // Catch: java.io.IOException -> L49 org.xmlpull.v1.XmlPullParserException -> L4b
            java.lang.Object r2 = r0.f47c     // Catch: java.io.IOException -> L49 org.xmlpull.v1.XmlPullParserException -> L4b
            android.util.SparseArray r2 = (android.util.SparseArray) r2     // Catch: java.io.IOException -> L49 org.xmlpull.v1.XmlPullParserException -> L4b
            int r4 = r3.f1059a     // Catch: java.io.IOException -> L49 org.xmlpull.v1.XmlPullParserException -> L4b
            r2.put(r4, r3)     // Catch: java.io.IOException -> L49 org.xmlpull.v1.XmlPullParserException -> L4b
            goto La2
        L9f:
            r10.getName()     // Catch: java.io.IOException -> L49 org.xmlpull.v1.XmlPullParserException -> L4b
        La2:
            int r2 = r10.next()     // Catch: java.io.IOException -> L49 org.xmlpull.v1.XmlPullParserException -> L4b
            goto L27
        La7:
            r10.printStackTrace()
            goto Lae
        Lab:
            r10.printStackTrace()
        Lae:
            r9.f2269k = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.m1546j(int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:159:0x02f7  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0316  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0338  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0355  */
    /* renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m1547k(p129s.C1316e r26, int r27, int r28, int r29) {
        /*
            Method dump skipped, instructions count: 1722
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.m1547k(s.e, int, int, int):void");
    }

    /* renamed from: l */
    public final void m1548l(C1315d c1315d, C1360e c1360e, SparseArray sparseArray, int i2, int i3) {
        View view = (View) this.f2259a.get(i2);
        C1315d c1315d2 = (C1315d) sparseArray.get(i2);
        if (c1315d2 == null || view == null || !(view.getLayoutParams() instanceof C1360e)) {
            return;
        }
        c1360e.f5801c0 = true;
        if (i3 == 6) {
            C1360e c1360e2 = (C1360e) view.getLayoutParams();
            c1360e2.f5801c0 = true;
            c1360e2.f5827p0.f5490E = true;
        }
        c1315d.mo3015i(6).m2981b(c1315d2.mo3015i(i3), c1360e.f5773D, c1360e.f5772C, true);
        c1315d.f5490E = true;
        c1315d.mo3015i(3).m2989j();
        c1315d.mo3015i(5).m2989j();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        int childCount = getChildCount();
        boolean zIsInEditMode = isInEditMode();
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            C1360e c1360e = (C1360e) childAt.getLayoutParams();
            C1315d c1315d = c1360e.f5827p0;
            if (childAt.getVisibility() != 8 || c1360e.f5803d0 || c1360e.f5805e0 || zIsInEditMode) {
                int iM3022r = c1315d.m3022r();
                int iM3023s = c1315d.m3023s();
                childAt.layout(iM3022r, iM3023s, c1315d.m3021q() + iM3022r, c1315d.m3017k() + iM3023s);
            }
        }
        ArrayList arrayList = this.f2260b;
        int size = arrayList.size();
        if (size > 0) {
            for (int i7 = 0; i7 < size; i7++) {
                ((AbstractC1358c) arrayList.get(i7)).getClass();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0331  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0349  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0367  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0389  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x03b4  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x03d1  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x03f3  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x03fe  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x041c  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0424  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x0549  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x054f  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onMeasure(int r35, int r36) throws android.content.res.Resources.NotFoundException, java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 1551
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.onMeasure(int, int):void");
    }

    @Override // android.view.ViewGroup
    public final void onViewAdded(View view) {
        super.onViewAdded(view);
        C1315d c1315dM1544h = m1544h(view);
        if ((view instanceof Guideline) && !(c1315dM1544h instanceof C1319h)) {
            C1360e c1360e = (C1360e) view.getLayoutParams();
            C1319h c1319h = new C1319h();
            c1360e.f5827p0 = c1319h;
            c1360e.f5803d0 = true;
            c1319h.m3048S(c1360e.f5791V);
        }
        if (view instanceof AbstractC1358c) {
            AbstractC1358c abstractC1358c = (AbstractC1358c) view;
            abstractC1358c.m3123i();
            ((C1360e) view.getLayoutParams()).f5805e0 = true;
            ArrayList arrayList = this.f2260b;
            if (!arrayList.contains(abstractC1358c)) {
                arrayList.add(abstractC1358c);
            }
        }
        this.f2259a.put(view.getId(), view);
        this.f2266h = true;
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.f2259a.remove(view.getId());
        C1315d c1315dM1544h = m1544h(view);
        this.f2261c.f5566q0.remove(c1315dM1544h);
        c1315dM1544h.mo2996C();
        this.f2260b.remove(view);
        this.f2266h = true;
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        this.f2266h = true;
        super.requestLayout();
    }

    public void setConstraintSet(C1369n c1369n) {
        this.f2268j = c1369n;
    }

    @Override // android.view.View
    public void setId(int i2) {
        int id = getId();
        SparseArray sparseArray = this.f2259a;
        sparseArray.remove(id);
        super.setId(i2);
        sparseArray.put(getId(), this);
    }

    public void setMaxHeight(int i2) {
        if (i2 == this.f2265g) {
            return;
        }
        this.f2265g = i2;
        requestLayout();
    }

    public void setMaxWidth(int i2) {
        if (i2 == this.f2264f) {
            return;
        }
        this.f2264f = i2;
        requestLayout();
    }

    public void setMinHeight(int i2) {
        if (i2 == this.f2263e) {
            return;
        }
        this.f2263e = i2;
        requestLayout();
    }

    public void setMinWidth(int i2) {
        if (i2 == this.f2262d) {
            return;
        }
        this.f2262d = i2;
        requestLayout();
    }

    public void setOnConstraintsChanged(AbstractC1370o abstractC1370o) {
        C0019a c0019a = this.f2269k;
        if (c0019a != null) {
            c0019a.getClass();
        }
    }

    public void setOptimizationLevel(int i2) {
        this.f2267i = i2;
        C1316e c1316e = this.f2261c;
        c1316e.f5557D0 = i2;
        C1269c.f5156p = c1316e.m3036W(512);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet, int i2) throws XmlPullParserException, IOException {
        super(context, attributeSet, i2);
        this.f2259a = new SparseArray();
        this.f2260b = new ArrayList(4);
        this.f2261c = new C1316e();
        this.f2262d = 0;
        this.f2263e = 0;
        this.f2264f = Integer.MAX_VALUE;
        this.f2265g = Integer.MAX_VALUE;
        this.f2266h = true;
        this.f2267i = 257;
        this.f2268j = null;
        this.f2269k = null;
        this.f2270l = -1;
        this.f2271m = new HashMap();
        this.f2272n = new SparseArray();
        this.f2273o = new C1361f(this, this);
        this.f2274p = 0;
        this.f2275q = 0;
        m1545i(attributeSet, i2);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        C1360e c1360e = new C1360e(layoutParams);
        c1360e.f5796a = -1;
        c1360e.f5798b = -1;
        c1360e.f5800c = -1.0f;
        c1360e.f5802d = true;
        c1360e.f5804e = -1;
        c1360e.f5806f = -1;
        c1360e.f5808g = -1;
        c1360e.f5810h = -1;
        c1360e.f5812i = -1;
        c1360e.f5814j = -1;
        c1360e.f5816k = -1;
        c1360e.f5818l = -1;
        c1360e.f5820m = -1;
        c1360e.f5822n = -1;
        c1360e.f5824o = -1;
        c1360e.f5826p = -1;
        c1360e.f5828q = 0;
        c1360e.f5829r = 0.0f;
        c1360e.f5830s = -1;
        c1360e.f5831t = -1;
        c1360e.f5832u = -1;
        c1360e.f5833v = -1;
        c1360e.f5834w = Integer.MIN_VALUE;
        c1360e.f5835x = Integer.MIN_VALUE;
        c1360e.f5836y = Integer.MIN_VALUE;
        c1360e.f5837z = Integer.MIN_VALUE;
        c1360e.f5770A = Integer.MIN_VALUE;
        c1360e.f5771B = Integer.MIN_VALUE;
        c1360e.f5772C = Integer.MIN_VALUE;
        c1360e.f5773D = 0;
        c1360e.f5774E = 0.5f;
        c1360e.f5775F = 0.5f;
        c1360e.f5776G = null;
        c1360e.f5777H = -1.0f;
        c1360e.f5778I = -1.0f;
        c1360e.f5779J = 0;
        c1360e.f5780K = 0;
        c1360e.f5781L = 0;
        c1360e.f5782M = 0;
        c1360e.f5783N = 0;
        c1360e.f5784O = 0;
        c1360e.f5785P = 0;
        c1360e.f5786Q = 0;
        c1360e.f5787R = 1.0f;
        c1360e.f5788S = 1.0f;
        c1360e.f5789T = -1;
        c1360e.f5790U = -1;
        c1360e.f5791V = -1;
        c1360e.f5792W = false;
        c1360e.f5793X = false;
        c1360e.f5794Y = null;
        c1360e.f5795Z = 0;
        c1360e.f5797a0 = true;
        c1360e.f5799b0 = true;
        c1360e.f5801c0 = false;
        c1360e.f5803d0 = false;
        c1360e.f5805e0 = false;
        c1360e.f5807f0 = -1;
        c1360e.f5809g0 = -1;
        c1360e.f5811h0 = -1;
        c1360e.f5813i0 = -1;
        c1360e.f5815j0 = Integer.MIN_VALUE;
        c1360e.f5817k0 = Integer.MIN_VALUE;
        c1360e.f5819l0 = 0.5f;
        c1360e.f5827p0 = new C1315d();
        return c1360e;
    }
}
