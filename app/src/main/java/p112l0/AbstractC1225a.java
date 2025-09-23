package p112l0;

import android.os.Parcel;
import android.os.Parcelable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import p119o.C1240b;

/* renamed from: l0.a */
/* loaded from: classes.dex */
public abstract class AbstractC1225a {

    /* renamed from: a */
    public final C1240b f4922a;

    /* renamed from: b */
    public final C1240b f4923b;

    /* renamed from: c */
    public final C1240b f4924c;

    public AbstractC1225a(C1240b c1240b, C1240b c1240b2, C1240b c1240b3) {
        this.f4922a = c1240b;
        this.f4923b = c1240b2;
        this.f4924c = c1240b3;
    }

    /* renamed from: a */
    public abstract C1226b mo2858a();

    /* renamed from: b */
    public final Class m2859b(Class cls) throws ClassNotFoundException {
        String name = cls.getName();
        C1240b c1240b = this.f4924c;
        Class cls2 = (Class) c1240b.getOrDefault(name, null);
        if (cls2 != null) {
            return cls2;
        }
        Class<?> cls3 = Class.forName(cls.getPackage().getName() + "." + cls.getSimpleName() + "Parcelizer", false, cls.getClassLoader());
        c1240b.put(cls.getName(), cls3);
        return cls3;
    }

    /* renamed from: c */
    public final Method m2860c(String str) throws NoSuchMethodException, SecurityException {
        C1240b c1240b = this.f4922a;
        Method method = (Method) c1240b.getOrDefault(str, null);
        if (method != null) {
            return method;
        }
        System.currentTimeMillis();
        Method declaredMethod = Class.forName(str, true, AbstractC1225a.class.getClassLoader()).getDeclaredMethod("read", AbstractC1225a.class);
        c1240b.put(str, declaredMethod);
        return declaredMethod;
    }

    /* renamed from: d */
    public final Method m2861d(Class cls) throws NoSuchMethodException, ClassNotFoundException, SecurityException {
        String name = cls.getName();
        C1240b c1240b = this.f4923b;
        Method method = (Method) c1240b.getOrDefault(name, null);
        if (method != null) {
            return method;
        }
        Class clsM2859b = m2859b(cls);
        System.currentTimeMillis();
        Method declaredMethod = clsM2859b.getDeclaredMethod("write", cls, AbstractC1225a.class);
        c1240b.put(cls.getName(), declaredMethod);
        return declaredMethod;
    }

    /* renamed from: e */
    public abstract boolean mo2862e(int i2);

    /* renamed from: f */
    public final Parcelable m2863f(Parcelable parcelable, int i2) {
        if (!mo2862e(i2)) {
            return parcelable;
        }
        return ((C1226b) this).f4926e.readParcelable(C1226b.class.getClassLoader());
    }

    /* renamed from: g */
    public final InterfaceC1227c m2864g() {
        String string = ((C1226b) this).f4926e.readString();
        if (string == null) {
            return null;
        }
        try {
            return (InterfaceC1227c) m2860c(string).invoke(null, mo2858a());
        } catch (ClassNotFoundException e3) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e3);
        } catch (IllegalAccessException e4) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e4);
        } catch (NoSuchMethodException e5) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e5);
        } catch (InvocationTargetException e6) {
            if (e6.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e6.getCause());
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e6);
        }
    }

    /* renamed from: h */
    public abstract void mo2865h(int i2);

    /* renamed from: i */
    public final void m2866i(InterfaceC1227c interfaceC1227c) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (interfaceC1227c == null) {
            ((C1226b) this).f4926e.writeString(null);
            return;
        }
        try {
            ((C1226b) this).f4926e.writeString(m2859b(interfaceC1227c.getClass()).getName());
            C1226b c1226bMo2858a = mo2858a();
            try {
                m2861d(interfaceC1227c.getClass()).invoke(null, interfaceC1227c, c1226bMo2858a);
                int i2 = c1226bMo2858a.f4930i;
                if (i2 >= 0) {
                    int i3 = c1226bMo2858a.f4925d.get(i2);
                    Parcel parcel = c1226bMo2858a.f4926e;
                    int iDataPosition = parcel.dataPosition();
                    parcel.setDataPosition(i3);
                    parcel.writeInt(iDataPosition - i3);
                    parcel.setDataPosition(iDataPosition);
                }
            } catch (ClassNotFoundException e3) {
                throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e3);
            } catch (IllegalAccessException e4) {
                throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e4);
            } catch (NoSuchMethodException e5) {
                throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e5);
            } catch (InvocationTargetException e6) {
                if (!(e6.getCause() instanceof RuntimeException)) {
                    throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e6);
                }
                throw ((RuntimeException) e6.getCause());
            }
        } catch (ClassNotFoundException e7) {
            throw new RuntimeException(interfaceC1227c.getClass().getSimpleName().concat(" does not have a Parcelizer"), e7);
        }
    }
}
