package p025J;

import p124q.C1268b;
import p131s1.AbstractC1326c;

/* renamed from: J.a */
/* loaded from: classes.dex */
public class C0214a {

    /* renamed from: a */
    public final Object[] f779a;

    /* renamed from: b */
    public int f780b;

    public C0214a(int i2) {
        if (i2 <= 0) {
            throw new IllegalArgumentException("The max pool size must be > 0");
        }
        this.f779a = new Object[i2];
    }

    /* renamed from: a */
    public Object mo564a() {
        int i2 = this.f780b;
        if (i2 <= 0) {
            return null;
        }
        int i3 = i2 - 1;
        Object[] objArr = this.f779a;
        Object obj = objArr[i3];
        AbstractC1326c.m3060c(obj, "null cannot be cast to non-null type T of androidx.core.util.Pools.SimplePool");
        objArr[i3] = null;
        this.f780b--;
        return obj;
    }

    /* renamed from: b */
    public void m565b(C1268b c1268b) {
        int i2 = this.f780b;
        Object[] objArr = this.f779a;
        if (i2 < objArr.length) {
            objArr[i2] = c1268b;
            this.f780b = i2 + 1;
        }
    }

    /* renamed from: c */
    public boolean mo566c(Object obj) {
        Object[] objArr;
        boolean z2;
        AbstractC1326c.m3062e(obj, "instance");
        int i2 = this.f780b;
        int i3 = 0;
        while (true) {
            objArr = this.f779a;
            if (i3 >= i2) {
                z2 = false;
                break;
            }
            if (objArr[i3] == obj) {
                z2 = true;
                break;
            }
            i3++;
        }
        if (z2) {
            throw new IllegalStateException("Already in the pool!");
        }
        int i4 = this.f780b;
        if (i4 >= objArr.length) {
            return false;
        }
        objArr[i4] = obj;
        this.f780b = i4 + 1;
        return true;
    }

    public C0214a() {
        this.f779a = new Object[256];
    }
}
