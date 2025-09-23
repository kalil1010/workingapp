package p094f0;

/* renamed from: f0.a */
/* loaded from: classes.dex */
public final class C0927a {

    /* renamed from: a */
    public int f3833a;

    /* renamed from: b */
    public int f3834b;

    /* renamed from: c */
    public int f3835c;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || C0927a.class != obj.getClass()) {
                return false;
            }
            C0927a c0927a = (C0927a) obj;
            int i2 = this.f3833a;
            if (i2 != c0927a.f3833a) {
                return false;
            }
            if (i2 != 8 || Math.abs(this.f3835c - this.f3834b) != 1 || this.f3835c != c0927a.f3834b || this.f3834b != c0927a.f3835c) {
                return this.f3835c == c0927a.f3835c && this.f3834b == c0927a.f3834b;
            }
        }
        return true;
    }

    public final int hashCode() {
        return (((this.f3833a * 31) + this.f3834b) * 31) + this.f3835c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("[");
        int i2 = this.f3833a;
        sb.append(i2 != 1 ? i2 != 2 ? i2 != 4 ? i2 != 8 ? "??" : "mv" : "up" : "rm" : "add");
        sb.append(",s:");
        sb.append(this.f3834b);
        sb.append("c:");
        sb.append(this.f3835c);
        sb.append(",p:null]");
        return sb.toString();
    }
}
