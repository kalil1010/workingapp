package p006C;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import p003B.C0051g;
import p003B.C0052h;
import p020H.C0178h;
import p033L1.AbstractC0364l;
import p093e2.AbstractC0901d;

/* renamed from: C.j */
/* loaded from: classes.dex */
public class C0078j extends AbstractC0364l {

    /* renamed from: f */
    public static Class f181f;

    /* renamed from: g */
    public static Constructor f182g;

    /* renamed from: h */
    public static Method f183h;

    /* renamed from: i */
    public static Method f184i;

    /* renamed from: j */
    public static boolean f185j;

    /* renamed from: m0 */
    public static boolean m247m0(Object obj, String str, int i2, boolean z2) throws NoSuchMethodException, ClassNotFoundException, SecurityException {
        m248n0();
        try {
            return ((Boolean) f183h.invoke(obj, str, Integer.valueOf(i2), Boolean.valueOf(z2))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e3) {
            throw new RuntimeException(e3);
        }
    }

    /* renamed from: n0 */
    public static void m248n0() throws NoSuchMethodException, ClassNotFoundException, SecurityException {
        Class<?> cls;
        Method method;
        Constructor<?> constructor;
        Method method2;
        if (f185j) {
            return;
        }
        f185j = true;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            constructor = cls.getConstructor(new Class[0]);
            method2 = cls.getMethod("addFontWeightStyle", String.class, Integer.TYPE, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
            cls = null;
            method = null;
            constructor = null;
            method2 = null;
        }
        f182g = constructor;
        f181f = cls;
        f183h = method2;
        f184i = method;
    }

    @Override // p033L1.AbstractC0364l
    /* renamed from: v */
    public Typeface mo249v(Context context, C0051g c0051g, Resources resources, int i2) throws IllegalAccessException, NoSuchMethodException, InstantiationException, ClassNotFoundException, SecurityException, ArrayIndexOutOfBoundsException, IllegalArgumentException, InvocationTargetException, NegativeArraySizeException {
        m248n0();
        try {
            Object objNewInstance = f182g.newInstance(new Object[0]);
            for (C0052h c0052h : c0051g.f118a) {
                File fileM2281I = AbstractC0901d.m2281I(context);
                if (fileM2281I == null) {
                    return null;
                }
                try {
                    if (!AbstractC0901d.m2307m(fileM2281I, resources, c0052h.f124f)) {
                        return null;
                    }
                    if (!m247m0(objNewInstance, fileM2281I.getPath(), c0052h.f120b, c0052h.f121c)) {
                        return null;
                    }
                    fileM2281I.delete();
                } catch (RuntimeException unused) {
                    return null;
                } finally {
                    fileM2281I.delete();
                }
            }
            m248n0();
            try {
                Object objNewInstance2 = Array.newInstance((Class<?>) f181f, 1);
                Array.set(objNewInstance2, 0, objNewInstance);
                return (Typeface) f184i.invoke(null, objNewInstance2);
            } catch (IllegalAccessException | InvocationTargetException e3) {
                throw new RuntimeException(e3);
            }
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e4) {
            throw new RuntimeException(e4);
        }
    }

    @Override // p033L1.AbstractC0364l
    /* renamed from: w */
    public Typeface mo250w(Context context, C0178h[] c0178hArr, int i2) throws IOException {
        String str;
        if (c0178hArr.length >= 1) {
            try {
                ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(mo263A(i2, c0178hArr).f645a, "r", null);
                if (parcelFileDescriptorOpenFileDescriptor != null) {
                    try {
                        try {
                            str = Os.readlink("/proc/self/fd/" + parcelFileDescriptorOpenFileDescriptor.getFd());
                        } finally {
                        }
                    } catch (ErrnoException unused) {
                    }
                    File file = OsConstants.S_ISREG(Os.stat(str).st_mode) ? new File(str) : null;
                    if (file != null && file.canRead()) {
                        Typeface typefaceCreateFromFile = Typeface.createFromFile(file);
                        parcelFileDescriptorOpenFileDescriptor.close();
                        return typefaceCreateFromFile;
                    }
                    FileInputStream fileInputStream = new FileInputStream(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor());
                    try {
                        Typeface typefaceMo264x = mo264x(context, fileInputStream);
                        fileInputStream.close();
                        parcelFileDescriptorOpenFileDescriptor.close();
                        return typefaceMo264x;
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
        return null;
    }
}
