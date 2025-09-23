package p006C;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import p003B.C0051g;
import p003B.C0052h;
import p020H.C0178h;
import p093e2.AbstractC0901d;

/* renamed from: C.l */
/* loaded from: classes.dex */
public class C0080l extends C0078j {

    /* renamed from: k */
    public final Class f190k;

    /* renamed from: l */
    public final Constructor f191l;

    /* renamed from: m */
    public final Method f192m;

    /* renamed from: n */
    public final Method f193n;

    /* renamed from: o */
    public final Method f194o;

    /* renamed from: p */
    public final Method f195p;

    /* renamed from: q */
    public final Method f196q;

    public C0080l() throws NoSuchMethodException, ClassNotFoundException, SecurityException {
        Class<?> cls;
        Method method;
        Constructor<?> constructor;
        Method methodM253t0;
        Method method2;
        Method method3;
        Method methodMo259u0;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            constructor = cls.getConstructor(new Class[0]);
            methodM253t0 = m253t0(cls);
            Class cls2 = Integer.TYPE;
            method2 = cls.getMethod("addFontFromBuffer", ByteBuffer.class, cls2, FontVariationAxis[].class, cls2, cls2);
            method3 = cls.getMethod("freeze", new Class[0]);
            method = cls.getMethod("abortCreation", new Class[0]);
            methodMo259u0 = mo259u0(cls);
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
            cls = null;
            method = null;
            constructor = null;
            methodM253t0 = null;
            method2 = null;
            method3 = null;
            methodMo259u0 = null;
        }
        this.f190k = cls;
        this.f191l = constructor;
        this.f192m = methodM253t0;
        this.f193n = method2;
        this.f194o = method3;
        this.f195p = method;
        this.f196q = methodMo259u0;
    }

    /* renamed from: t0 */
    public static Method m253t0(Class cls) {
        Class cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromAssetManager", AssetManager.class, String.class, cls2, Boolean.TYPE, cls2, cls2, cls2, FontVariationAxis[].class);
    }

    /* renamed from: o0 */
    public final void m254o0(Object obj) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        try {
            this.f195p.invoke(obj, new Object[0]);
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
    }

    /* renamed from: p0 */
    public final boolean m255p0(Context context, Object obj, String str, int i2, int i3, int i4, FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.f192m.invoke(obj, context.getAssets(), str, 0, Boolean.FALSE, Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), fontVariationAxisArr)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    /* renamed from: q0 */
    public Typeface mo256q0(Object obj) throws ArrayIndexOutOfBoundsException, IllegalArgumentException, NegativeArraySizeException {
        try {
            Object objNewInstance = Array.newInstance((Class<?>) this.f190k, 1);
            Array.set(objNewInstance, 0, obj);
            return (Typeface) this.f196q.invoke(null, objNewInstance, -1, -1);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    /* renamed from: r0 */
    public final boolean m257r0(Object obj) {
        try {
            return ((Boolean) this.f194o.invoke(obj, new Object[0])).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    /* renamed from: s0 */
    public final Object m258s0() {
        try {
            return this.f191l.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    /* renamed from: u0 */
    public Method mo259u0(Class cls) throws NoSuchMethodException, SecurityException {
        Class<?> cls2 = Array.newInstance((Class<?>) cls, 1).getClass();
        Class cls3 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", cls2, cls3, cls3);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }

    @Override // p006C.C0078j, p033L1.AbstractC0364l
    /* renamed from: v */
    public final Typeface mo249v(Context context, C0051g c0051g, Resources resources, int i2) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (this.f192m == null) {
            return super.mo249v(context, c0051g, resources, i2);
        }
        Object objM258s0 = m258s0();
        if (objM258s0 != null) {
            C0052h[] c0052hArr = c0051g.f118a;
            int length = c0052hArr.length;
            int i3 = 0;
            while (i3 < length) {
                C0052h c0052h = c0052hArr[i3];
                String str = c0052h.f119a;
                FontVariationAxis[] fontVariationAxisArrFromFontVariationSettings = FontVariationAxis.fromFontVariationSettings(c0052h.f122d);
                Context context2 = context;
                if (!m255p0(context2, objM258s0, str, c0052h.f123e, c0052h.f120b, c0052h.f121c ? 1 : 0, fontVariationAxisArrFromFontVariationSettings)) {
                    m254o0(objM258s0);
                    return null;
                }
                i3++;
                context = context2;
            }
            if (m257r0(objM258s0)) {
                return mo256q0(objM258s0);
            }
        }
        return null;
    }

    @Override // p006C.C0078j, p033L1.AbstractC0364l
    /* renamed from: w */
    public final Typeface mo250w(Context context, C0178h[] c0178hArr, int i2) throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        Typeface typefaceMo256q0;
        boolean zBooleanValue;
        if (c0178hArr.length >= 1) {
            if (this.f192m != null) {
                HashMap map = new HashMap();
                for (C0178h c0178h : c0178hArr) {
                    if (c0178h.f649e == 0) {
                        Uri uri = c0178h.f645a;
                        if (!map.containsKey(uri)) {
                            map.put(uri, AbstractC0901d.m2288U(context, uri));
                        }
                    }
                }
                Map mapUnmodifiableMap = Collections.unmodifiableMap(map);
                Object objM258s0 = m258s0();
                if (objM258s0 != null) {
                    int length = c0178hArr.length;
                    int i3 = 0;
                    boolean z2 = false;
                    while (i3 < length) {
                        C0178h c0178h2 = c0178hArr[i3];
                        ByteBuffer byteBuffer = (ByteBuffer) mapUnmodifiableMap.get(c0178h2.f645a);
                        if (byteBuffer != null) {
                            try {
                                zBooleanValue = ((Boolean) this.f193n.invoke(objM258s0, byteBuffer, Integer.valueOf(c0178h2.f646b), null, Integer.valueOf(c0178h2.f647c), Integer.valueOf(c0178h2.f648d ? 1 : 0))).booleanValue();
                            } catch (IllegalAccessException | InvocationTargetException unused) {
                                zBooleanValue = false;
                            }
                            if (!zBooleanValue) {
                                m254o0(objM258s0);
                                return null;
                            }
                            z2 = true;
                        }
                        i3++;
                        z2 = z2;
                    }
                    if (!z2) {
                        m254o0(objM258s0);
                        return null;
                    }
                    if (m257r0(objM258s0) && (typefaceMo256q0 = mo256q0(objM258s0)) != null) {
                        return Typeface.create(typefaceMo256q0, i2);
                    }
                }
            } else {
                C0178h c0178hMo263A = mo263A(i2, c0178hArr);
                try {
                    ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(c0178hMo263A.f645a, "r", null);
                    if (parcelFileDescriptorOpenFileDescriptor != null) {
                        try {
                            Typeface typefaceBuild = new Typeface.Builder(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor()).setWeight(c0178hMo263A.f647c).setItalic(c0178hMo263A.f648d).build();
                            parcelFileDescriptorOpenFileDescriptor.close();
                            return typefaceBuild;
                        } finally {
                        }
                    }
                    if (parcelFileDescriptorOpenFileDescriptor != null) {
                        parcelFileDescriptorOpenFileDescriptor.close();
                        return null;
                    }
                } catch (IOException unused2) {
                }
            }
        }
        return null;
    }

    @Override // p033L1.AbstractC0364l
    /* renamed from: y */
    public final Typeface mo260y(Context context, Resources resources, int i2, String str, int i3) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (this.f192m == null) {
            return super.mo260y(context, resources, i2, str, i3);
        }
        Object objM258s0 = m258s0();
        if (objM258s0 != null) {
            if (!m255p0(context, objM258s0, str, 0, -1, -1, null)) {
                m254o0(objM258s0);
                return null;
            }
            if (m257r0(objM258s0)) {
                return mo256q0(objM258s0);
            }
        }
        return null;
    }
}
