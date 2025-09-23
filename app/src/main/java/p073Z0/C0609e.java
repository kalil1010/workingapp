package p073Z0;

import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: Z0.e */
/* loaded from: classes.dex */
public final class C0609e extends AbstractC0610f implements Iterable {

    /* renamed from: a */
    public final ArrayList f1927a = new ArrayList();

    public final boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof C0609e) && ((C0609e) obj).f1927a.equals(this.f1927a);
        }
        return true;
    }

    public final int hashCode() {
        return this.f1927a.hashCode();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.f1927a.iterator();
    }
}
