package p133t0;

import java.lang.reflect.Field;
import p123p0.C1266b;

/* renamed from: t0.a */
/* loaded from: classes.dex */
public final class C1347a implements Comparable, Cloneable {

    /* renamed from: a */
    public int f5707a;

    /* renamed from: b */
    public int f5708b;

    /* renamed from: c */
    public boolean f5709c;

    /* renamed from: d */
    public Field f5710d;

    /* renamed from: e */
    public int f5711e;

    /* renamed from: f */
    public String f5712f;

    /* renamed from: g */
    public C1266b f5713g;

    /* renamed from: h */
    public boolean f5714h;

    public final Object clone() {
        C1347a c1347a = new C1347a();
        c1347a.f5711e = this.f5711e;
        c1347a.f5710d = this.f5710d;
        c1347a.f5712f = new String(this.f5712f);
        c1347a.f5708b = this.f5708b;
        c1347a.f5709c = this.f5709c;
        c1347a.f5707a = this.f5707a;
        c1347a.f5713g = this.f5713g;
        return c1347a;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Integer.valueOf(this.f5708b).compareTo(Integer.valueOf(((C1347a) obj).f5708b));
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C1347a) && this.f5708b == ((C1347a) obj).f5708b;
    }
}
