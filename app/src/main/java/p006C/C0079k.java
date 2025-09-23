package p006C;

import android.content.Context;
import android.graphics.Typeface;
import android.net.Uri;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.List;
import p020H.C0178h;
import p033L1.AbstractC0364l;
import p093e2.AbstractC0901d;
import p119o.C1249k;

/* renamed from: C.k */
/* loaded from: classes.dex */
public final class C0079k extends AbstractC0364l {

    /* renamed from: f */
    public static final Class f186f;

    /* renamed from: g */
    public static final Constructor f187g;

    /* renamed from: h */
    public static final Method f188h;

    /* renamed from: i */
    public static final Method f189i;

    static {
        Class<?> cls;
        Constructor<?> constructor;
        Method method;
        Method method2;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            constructor = cls.getConstructor(new Class[0]);
            Class cls2 = Integer.TYPE;
            method = cls.getMethod("addFontWeightStyle", ByteBuffer.class, cls2, List.class, cls2, Boolean.TYPE);
            method2 = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
            cls = null;
            constructor = null;
            method = null;
            method2 = null;
        }
        f187g = constructor;
        f186f = cls;
        f188h = method;
        f189i = method2;
    }

    /* renamed from: m0 */
    public static boolean m251m0(Object obj, ByteBuffer byteBuffer, int i2, int i3, boolean z2) {
        try {
            return ((Boolean) f188h.invoke(obj, byteBuffer, Integer.valueOf(i2), null, Integer.valueOf(i3), Boolean.valueOf(z2))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    /* renamed from: n0 */
    public static Typeface m252n0(Object obj) throws ArrayIndexOutOfBoundsException, IllegalArgumentException, NegativeArraySizeException {
        try {
            Object objNewInstance = Array.newInstance((Class<?>) f186f, 1);
            Array.set(objNewInstance, 0, obj);
            return (Typeface) f189i.invoke(null, objNewInstance);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0068 A[SYNTHETIC] */
    @Override // p033L1.AbstractC0364l
    /* renamed from: v */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.graphics.Typeface mo249v(android.content.Context r17, p003B.C0051g r18, android.content.res.Resources r19, int r20) throws java.lang.IllegalAccessException, java.lang.InstantiationException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
        /*
            r16 = this;
            r1 = 0
            r0 = 0
            java.lang.reflect.Constructor r2 = p006C.C0079k.f187g     // Catch: java.lang.Throwable -> Lb
            java.lang.Object[] r3 = new java.lang.Object[r0]     // Catch: java.lang.Throwable -> Lb
            java.lang.Object r2 = r2.newInstance(r3)     // Catch: java.lang.Throwable -> Lb
            goto Lc
        Lb:
            r2 = r1
        Lc:
            if (r2 != 0) goto Lf
            goto L68
        Lf:
            r3 = r18
            B.h[] r3 = r3.f118a
            int r4 = r3.length
            r5 = r0
        L15:
            if (r5 >= r4) goto L71
            r6 = r3[r5]
            int r0 = r6.f124f
            java.io.File r7 = p093e2.AbstractC0901d.m2281I(r17)
            if (r7 != 0) goto L25
            r8 = r19
        L23:
            r0 = r1
            goto L59
        L25:
            r8 = r19
            boolean r0 = p093e2.AbstractC0901d.m2307m(r7, r8, r0)     // Catch: java.lang.Throwable -> L6c
            if (r0 != 0) goto L31
            r7.delete()
            goto L23
        L31:
            java.io.FileInputStream r9 = new java.io.FileInputStream     // Catch: java.io.IOException -> L55 java.lang.Throwable -> L6c
            r9.<init>(r7)     // Catch: java.io.IOException -> L55 java.lang.Throwable -> L6c
            java.nio.channels.FileChannel r10 = r9.getChannel()     // Catch: java.lang.Throwable -> L4a
            long r14 = r10.size()     // Catch: java.lang.Throwable -> L4a
            java.nio.channels.FileChannel$MapMode r11 = java.nio.channels.FileChannel.MapMode.READ_ONLY     // Catch: java.lang.Throwable -> L4a
            r12 = 0
            java.nio.MappedByteBuffer r0 = r10.map(r11, r12, r14)     // Catch: java.lang.Throwable -> L4a
            r9.close()     // Catch: java.io.IOException -> L55 java.lang.Throwable -> L6c
            goto L56
        L4a:
            r0 = move-exception
            r10 = r0
            r9.close()     // Catch: java.lang.Throwable -> L50
            goto L54
        L50:
            r0 = move-exception
            r10.addSuppressed(r0)     // Catch: java.io.IOException -> L55 java.lang.Throwable -> L6c
        L54:
            throw r10     // Catch: java.io.IOException -> L55 java.lang.Throwable -> L6c
        L55:
            r0 = r1
        L56:
            r7.delete()
        L59:
            if (r0 != 0) goto L5c
            goto L68
        L5c:
            int r7 = r6.f120b
            boolean r9 = r6.f121c
            int r6 = r6.f123e
            boolean r0 = m251m0(r2, r0, r6, r7, r9)
            if (r0 != 0) goto L69
        L68:
            return r1
        L69:
            int r5 = r5 + 1
            goto L15
        L6c:
            r0 = move-exception
            r7.delete()
            throw r0
        L71:
            android.graphics.Typeface r0 = m252n0(r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p006C.C0079k.mo249v(android.content.Context, B.g, android.content.res.Resources, int):android.graphics.Typeface");
    }

    @Override // p033L1.AbstractC0364l
    /* renamed from: w */
    public final Typeface mo250w(Context context, C0178h[] c0178hArr, int i2) throws IllegalAccessException, InstantiationException, IOException, ArrayIndexOutOfBoundsException, IllegalArgumentException, InvocationTargetException, NegativeArraySizeException {
        Object objNewInstance;
        int i3 = 0;
        try {
            objNewInstance = f187g.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            objNewInstance = null;
        }
        if (objNewInstance != null) {
            C1249k c1249k = new C1249k();
            int length = c0178hArr.length;
            while (true) {
                if (i3 >= length) {
                    Typeface typefaceM252n0 = m252n0(objNewInstance);
                    if (typefaceM252n0 != null) {
                        return Typeface.create(typefaceM252n0, i2);
                    }
                } else {
                    C0178h c0178h = c0178hArr[i3];
                    Uri uri = c0178h.f645a;
                    ByteBuffer byteBufferM2288U = (ByteBuffer) c1249k.getOrDefault(uri, null);
                    if (byteBufferM2288U == null) {
                        byteBufferM2288U = AbstractC0901d.m2288U(context, uri);
                        c1249k.put(uri, byteBufferM2288U);
                    }
                    if (byteBufferM2288U == null) {
                        break;
                    }
                    if (!m251m0(objNewInstance, byteBufferM2288U, c0178h.f646b, c0178h.f647c, c0178h.f648d)) {
                        break;
                    }
                    i3++;
                }
            }
        }
        return null;
    }
}
