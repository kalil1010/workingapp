package p054T;

import android.graphics.Rect;
import java.util.Comparator;
import p031L.C0341k;
import p055T0.C0511e;

/* renamed from: T.c */
/* loaded from: classes.dex */
public final class C0504c implements Comparator {

    /* renamed from: a */
    public final Rect f1550a = new Rect();

    /* renamed from: b */
    public final Rect f1551b = new Rect();

    /* renamed from: c */
    public final boolean f1552c;

    /* renamed from: d */
    public final C0511e f1553d;

    public C0504c(boolean z2, C0511e c0511e) {
        this.f1552c = z2;
        this.f1553d = c0511e;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        this.f1553d.getClass();
        Rect rect = this.f1550a;
        ((C0341k) obj).m926f(rect);
        Rect rect2 = this.f1551b;
        ((C0341k) obj2).m926f(rect2);
        int i2 = rect.top;
        int i3 = rect2.top;
        if (i2 < i3) {
            return -1;
        }
        if (i2 > i3) {
            return 1;
        }
        int i4 = rect.left;
        int i5 = rect2.left;
        boolean z2 = this.f1552c;
        if (i4 < i5) {
            return z2 ? 1 : -1;
        }
        if (i4 > i5) {
            return z2 ? -1 : 1;
        }
        int i6 = rect.bottom;
        int i7 = rect2.bottom;
        if (i6 < i7) {
            return -1;
        }
        if (i6 > i7) {
            return 1;
        }
        int i8 = rect.right;
        int i9 = rect2.right;
        if (i8 < i9) {
            return z2 ? 1 : -1;
        }
        if (i8 > i9) {
            return z2 ? -1 : 1;
        }
        return 0;
    }
}
