package p105j;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.method.TransformationMethod;
import android.util.TypedValue;
import android.widget.TextView;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: j.j0 */
/* loaded from: classes.dex */
public final class C1102j0 {

    /* renamed from: l */
    public static final RectF f4517l = new RectF();

    /* renamed from: m */
    public static final ConcurrentHashMap f4518m = new ConcurrentHashMap();

    /* renamed from: a */
    public int f4519a = 0;

    /* renamed from: b */
    public boolean f4520b = false;

    /* renamed from: c */
    public float f4521c = -1.0f;

    /* renamed from: d */
    public float f4522d = -1.0f;

    /* renamed from: e */
    public float f4523e = -1.0f;

    /* renamed from: f */
    public int[] f4524f = new int[0];

    /* renamed from: g */
    public boolean f4525g = false;

    /* renamed from: h */
    public TextPaint f4526h;

    /* renamed from: i */
    public final TextView f4527i;

    /* renamed from: j */
    public final Context f4528j;

    /* renamed from: k */
    public final C1093g0 f4529k;

    static {
        new ConcurrentHashMap();
    }

    public C1102j0(TextView textView) {
        this.f4527i = textView;
        this.f4528j = textView.getContext();
        if (Build.VERSION.SDK_INT >= 29) {
            this.f4529k = new C1096h0();
        } else {
            this.f4529k = new C1093g0();
        }
    }

    /* renamed from: b */
    public static int[] m2713b(int[] iArr) {
        int length = iArr.length;
        if (length != 0) {
            Arrays.sort(iArr);
            ArrayList arrayList = new ArrayList();
            for (int i2 : iArr) {
                if (i2 > 0 && Collections.binarySearch(arrayList, Integer.valueOf(i2)) < 0) {
                    arrayList.add(Integer.valueOf(i2));
                }
            }
            if (length != arrayList.size()) {
                int size = arrayList.size();
                int[] iArr2 = new int[size];
                for (int i3 = 0; i3 < size; i3++) {
                    iArr2[i3] = ((Integer) arrayList.get(i3)).intValue();
                }
                return iArr2;
            }
        }
        return iArr;
    }

    /* renamed from: d */
    public static Method m2714d(String str) throws SecurityException {
        try {
            ConcurrentHashMap concurrentHashMap = f4518m;
            Method declaredMethod = (Method) concurrentHashMap.get(str);
            if (declaredMethod == null && (declaredMethod = TextView.class.getDeclaredMethod(str, new Class[0])) != null) {
                declaredMethod.setAccessible(true);
                concurrentHashMap.put(str, declaredMethod);
            }
            return declaredMethod;
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: e */
    public static Object m2715e(Object obj, String str, Object obj2) {
        try {
            return m2714d(str).invoke(obj, new Object[0]);
        } catch (Exception unused) {
            return obj2;
        }
    }

    /* renamed from: a */
    public final void m2716a() {
        if (m2718f()) {
            if (this.f4520b) {
                if (this.f4527i.getMeasuredHeight() <= 0 || this.f4527i.getMeasuredWidth() <= 0) {
                    return;
                }
                int measuredWidth = this.f4529k.mo2712b(this.f4527i) ? 1048576 : (this.f4527i.getMeasuredWidth() - this.f4527i.getTotalPaddingLeft()) - this.f4527i.getTotalPaddingRight();
                int height = (this.f4527i.getHeight() - this.f4527i.getCompoundPaddingBottom()) - this.f4527i.getCompoundPaddingTop();
                if (measuredWidth <= 0 || height <= 0) {
                    return;
                }
                RectF rectF = f4517l;
                synchronized (rectF) {
                    try {
                        rectF.setEmpty();
                        rectF.right = measuredWidth;
                        rectF.bottom = height;
                        float fM2717c = m2717c(rectF);
                        if (fM2717c != this.f4527i.getTextSize()) {
                            m2719g(0, fM2717c);
                        }
                    } finally {
                    }
                }
            }
            this.f4520b = true;
        }
    }

    /* renamed from: c */
    public final int m2717c(RectF rectF) {
        CharSequence transformation;
        int length = this.f4524f.length;
        if (length == 0) {
            throw new IllegalStateException("No available text sizes to choose from.");
        }
        int i2 = length - 1;
        int i3 = 0;
        int i4 = 1;
        while (i4 <= i2) {
            int i5 = (i4 + i2) / 2;
            int i6 = this.f4524f[i5];
            TextView textView = this.f4527i;
            CharSequence text = textView.getText();
            TransformationMethod transformationMethod = textView.getTransformationMethod();
            CharSequence charSequence = (transformationMethod == null || (transformation = transformationMethod.getTransformation(text, textView)) == null) ? text : transformation;
            int iM2704b = AbstractC1084d0.m2704b(textView);
            TextPaint textPaint = this.f4526h;
            if (textPaint == null) {
                this.f4526h = new TextPaint();
            } else {
                textPaint.reset();
            }
            this.f4526h.set(textView.getPaint());
            this.f4526h.setTextSize(i6);
            StaticLayout staticLayoutM2706a = AbstractC1090f0.m2706a(charSequence, (Layout.Alignment) m2715e(textView, "getLayoutAlignment", Layout.Alignment.ALIGN_NORMAL), Math.round(rectF.right), iM2704b, this.f4527i, this.f4526h, this.f4529k);
            if ((iM2704b == -1 || (staticLayoutM2706a.getLineCount() <= iM2704b && staticLayoutM2706a.getLineEnd(staticLayoutM2706a.getLineCount() - 1) == charSequence.length())) && staticLayoutM2706a.getHeight() <= rectF.bottom) {
                int i7 = i5 + 1;
                i3 = i4;
                i4 = i7;
            } else {
                i3 = i5 - 1;
                i2 = i3;
            }
        }
        return this.f4524f[i3];
    }

    /* renamed from: f */
    public final boolean m2718f() {
        return m2722j() && this.f4519a != 0;
    }

    /* renamed from: g */
    public final void m2719g(int i2, float f) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Context context = this.f4528j;
        float fApplyDimension = TypedValue.applyDimension(i2, f, (context == null ? Resources.getSystem() : context.getResources()).getDisplayMetrics());
        TextView textView = this.f4527i;
        if (fApplyDimension != textView.getPaint().getTextSize()) {
            textView.getPaint().setTextSize(fApplyDimension);
            boolean zM2705a = AbstractC1087e0.m2705a(textView);
            if (textView.getLayout() != null) {
                this.f4520b = false;
                try {
                    Method methodM2714d = m2714d("nullLayouts");
                    if (methodM2714d != null) {
                        methodM2714d.invoke(textView, new Object[0]);
                    }
                } catch (Exception unused) {
                }
                if (zM2705a) {
                    textView.forceLayout();
                } else {
                    textView.requestLayout();
                }
                textView.invalidate();
            }
        }
    }

    /* renamed from: h */
    public final boolean m2720h() {
        if (m2722j() && this.f4519a == 1) {
            if (!this.f4525g || this.f4524f.length == 0) {
                int iFloor = ((int) Math.floor((this.f4523e - this.f4522d) / this.f4521c)) + 1;
                int[] iArr = new int[iFloor];
                for (int i2 = 0; i2 < iFloor; i2++) {
                    iArr[i2] = Math.round((i2 * this.f4521c) + this.f4522d);
                }
                this.f4524f = m2713b(iArr);
            }
            this.f4520b = true;
        } else {
            this.f4520b = false;
        }
        return this.f4520b;
    }

    /* renamed from: i */
    public final boolean m2721i() {
        boolean z2 = this.f4524f.length > 0;
        this.f4525g = z2;
        if (z2) {
            this.f4519a = 1;
            this.f4522d = r0[0];
            this.f4523e = r0[r1 - 1];
            this.f4521c = -1.0f;
        }
        return z2;
    }

    /* renamed from: j */
    public final boolean m2722j() {
        return !(this.f4527i instanceof C1136v);
    }

    /* renamed from: k */
    public final void m2723k(float f, float f2, float f3) {
        if (f <= 0.0f) {
            throw new IllegalArgumentException("Minimum auto-size text size (" + f + "px) is less or equal to (0px)");
        }
        if (f2 <= f) {
            throw new IllegalArgumentException("Maximum auto-size text size (" + f2 + "px) is less or equal to minimum auto-size text size (" + f + "px)");
        }
        if (f3 <= 0.0f) {
            throw new IllegalArgumentException("The auto-size step granularity (" + f3 + "px) is less or equal to (0px)");
        }
        this.f4519a = 1;
        this.f4522d = f;
        this.f4523e = f2;
        this.f4521c = f3;
        this.f4525g = false;
    }
}
