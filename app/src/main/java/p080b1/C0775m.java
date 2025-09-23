package p080b1;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: b1.m */
/* loaded from: classes.dex */
public final class C0775m implements Iterator {

    /* renamed from: a */
    public C0777o f2899a;

    /* renamed from: b */
    public C0777o f2900b = null;

    /* renamed from: c */
    public int f2901c;

    /* renamed from: d */
    public final /* synthetic */ C0778p f2902d;

    /* renamed from: e */
    public final /* synthetic */ int f2903e;

    public C0775m(C0778p c0778p, int i2) {
        this.f2903e = i2;
        this.f2902d = c0778p;
        this.f2899a = c0778p.f2921f.f2909d;
        this.f2901c = c0778p.f2920e;
    }

    /* renamed from: a */
    public final Object m1989a() {
        return m1990b();
    }

    /* renamed from: b */
    public final C0777o m1990b() {
        C0777o c0777o = this.f2899a;
        C0778p c0778p = this.f2902d;
        if (c0777o == c0778p.f2921f) {
            throw new NoSuchElementException();
        }
        if (c0778p.f2920e != this.f2901c) {
            throw new ConcurrentModificationException();
        }
        this.f2899a = c0777o.f2909d;
        this.f2900b = c0777o;
        return c0777o;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f2899a != this.f2902d.f2921f;
    }

    @Override // java.util.Iterator
    public Object next() {
        switch (this.f2903e) {
            case 1:
                return m1990b().f2911f;
            default:
                return m1989a();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        C0777o c0777o = this.f2900b;
        if (c0777o == null) {
            throw new IllegalStateException();
        }
        C0778p c0778p = this.f2902d;
        c0778p.m1993c(c0777o, true);
        this.f2900b = null;
        this.f2901c = c0778p.f2920e;
    }
}
