package p083c0;

import android.content.IntentFilter;
import p002A1.C0043y;

/* renamed from: c0.b */
/* loaded from: classes.dex */
public final class C0788b {

    /* renamed from: a */
    public final IntentFilter f2933a;

    /* renamed from: b */
    public final C0043y f2934b;

    /* renamed from: c */
    public boolean f2935c;

    public C0788b(IntentFilter intentFilter, C0043y c0043y) {
        this.f2933a = intentFilter;
        this.f2934b = c0043y;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("Receiver{");
        sb.append(this.f2934b);
        sb.append(" filter=");
        sb.append(this.f2933a);
        sb.append("}");
        return sb.toString();
    }
}
