package p140v1;

/* renamed from: v1.c */
/* loaded from: classes.dex */
public final class C1380c extends C1378a {

    /* renamed from: d */
    public static final C1380c f5996d = new C1380c(1, 0, 1);

    @Override // p140v1.C1378a
    public final boolean equals(Object obj) {
        if (!(obj instanceof C1380c)) {
            return false;
        }
        if (isEmpty() && ((C1380c) obj).isEmpty()) {
            return true;
        }
        C1380c c1380c = (C1380c) obj;
        if (this.f5989a == c1380c.f5989a) {
            return this.f5990b == c1380c.f5990b;
        }
        return false;
    }

    @Override // p140v1.C1378a
    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (this.f5989a * 31) + this.f5990b;
    }

    @Override // p140v1.C1378a
    public final boolean isEmpty() {
        return this.f5989a > this.f5990b;
    }

    @Override // p140v1.C1378a
    public final String toString() {
        return this.f5989a + ".." + this.f5990b;
    }
}
