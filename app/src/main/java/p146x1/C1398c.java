package p146x1;

import java.util.Iterator;
import p002A1.C0019a;
import p149y1.C1404b;

/* renamed from: x1.c */
/* loaded from: classes.dex */
public final class C1398c implements Iterable {

    /* renamed from: a */
    public final /* synthetic */ C0019a f6060a;

    public C1398c(C0019a c0019a) {
        this.f6060a = c0019a;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C1404b(this.f6060a);
    }
}
