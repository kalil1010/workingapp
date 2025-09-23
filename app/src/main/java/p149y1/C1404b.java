package p149y1;

import java.util.Iterator;
import java.util.NoSuchElementException;
import p002A1.C0019a;
import p131s1.AbstractC1326c;
import p140v1.C1380c;

/* renamed from: y1.b */
/* loaded from: classes.dex */
public final class C1404b implements Iterator {

    /* renamed from: a */
    public int f6080a = -1;

    /* renamed from: b */
    public int f6081b;

    /* renamed from: c */
    public int f6082c;

    /* renamed from: d */
    public C1380c f6083d;

    /* renamed from: e */
    public final /* synthetic */ C0019a f6084e;

    public C1404b(C0019a c0019a) {
        this.f6084e = c0019a;
        c0019a.getClass();
        int length = ((CharSequence) c0019a.f47c).length();
        if (length >= 0) {
            length = length >= 0 ? 0 : length;
            this.f6081b = length;
            this.f6082c = length;
        } else {
            throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + length + " is less than minimum 0.");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x011c  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m3170a() {
        /*
            Method dump skipped, instructions count: 406
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p149y1.C1404b.m3170a():void");
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f6080a == -1) {
            m3170a();
        }
        return this.f6080a == 1;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f6080a == -1) {
            m3170a();
        }
        if (this.f6080a == 0) {
            throw new NoSuchElementException();
        }
        C1380c c1380c = this.f6083d;
        AbstractC1326c.m3060c(c1380c, "null cannot be cast to non-null type kotlin.ranges.IntRange");
        this.f6083d = null;
        this.f6080a = -1;
        return c1380c;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
