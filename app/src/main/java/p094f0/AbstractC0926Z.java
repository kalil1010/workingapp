package p094f0;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;
import p028K.AbstractC0241P;

/* renamed from: f0.Z */
/* loaded from: classes.dex */
public abstract class AbstractC0926Z {

    /* renamed from: s */
    public static final List f3814s = Collections.EMPTY_LIST;

    /* renamed from: a */
    public final View f3815a;

    /* renamed from: b */
    public WeakReference f3816b;

    /* renamed from: j */
    public int f3824j;

    /* renamed from: r */
    public RecyclerView f3832r;

    /* renamed from: c */
    public int f3817c = -1;

    /* renamed from: d */
    public int f3818d = -1;

    /* renamed from: e */
    public long f3819e = -1;

    /* renamed from: f */
    public int f3820f = -1;

    /* renamed from: g */
    public int f3821g = -1;

    /* renamed from: h */
    public AbstractC0926Z f3822h = null;

    /* renamed from: i */
    public AbstractC0926Z f3823i = null;

    /* renamed from: k */
    public final ArrayList f3825k = null;

    /* renamed from: l */
    public final List f3826l = null;

    /* renamed from: m */
    public int f3827m = 0;

    /* renamed from: n */
    public C0917P f3828n = null;

    /* renamed from: o */
    public boolean f3829o = false;

    /* renamed from: p */
    public int f3830p = 0;

    /* renamed from: q */
    public int f3831q = -1;

    public AbstractC0926Z(View view) {
        if (view == null) {
            throw new IllegalArgumentException("itemView may not be null");
        }
        this.f3815a = view;
    }

    /* renamed from: a */
    public final void m2394a(int i2) {
        this.f3824j = i2 | this.f3824j;
    }

    /* renamed from: b */
    public final int m2395b() {
        int i2 = this.f3821g;
        return i2 == -1 ? this.f3817c : i2;
    }

    /* renamed from: c */
    public final List m2396c() {
        ArrayList arrayList;
        return ((this.f3824j & 1024) != 0 || (arrayList = this.f3825k) == null || arrayList.size() == 0) ? f3814s : this.f3826l;
    }

    /* renamed from: d */
    public final boolean m2397d() {
        View view = this.f3815a;
        return (view.getParent() == null || view.getParent() == this.f3832r) ? false : true;
    }

    /* renamed from: e */
    public final boolean m2398e() {
        return (this.f3824j & 1) != 0;
    }

    /* renamed from: f */
    public final boolean m2399f() {
        return (this.f3824j & 4) != 0;
    }

    /* renamed from: g */
    public final boolean m2400g() {
        if ((this.f3824j & 16) != 0) {
            return false;
        }
        WeakHashMap weakHashMap = AbstractC0241P.f815a;
        return !this.f3815a.hasTransientState();
    }

    /* renamed from: h */
    public final boolean m2401h() {
        return (this.f3824j & 8) != 0;
    }

    /* renamed from: i */
    public final boolean m2402i() {
        return this.f3828n != null;
    }

    /* renamed from: j */
    public final boolean m2403j() {
        return (this.f3824j & 256) != 0;
    }

    /* renamed from: k */
    public final boolean m2404k() {
        return (this.f3824j & 2) != 0;
    }

    /* renamed from: l */
    public final void m2405l(int i2, boolean z2) {
        if (this.f3818d == -1) {
            this.f3818d = this.f3817c;
        }
        if (this.f3821g == -1) {
            this.f3821g = this.f3817c;
        }
        if (z2) {
            this.f3821g += i2;
        }
        this.f3817c += i2;
        View view = this.f3815a;
        if (view.getLayoutParams() != null) {
            ((C0912K) view.getLayoutParams()).f3769c = true;
        }
    }

    /* renamed from: m */
    public final void m2406m() {
        this.f3824j = 0;
        this.f3817c = -1;
        this.f3818d = -1;
        this.f3819e = -1L;
        this.f3821g = -1;
        this.f3827m = 0;
        this.f3822h = null;
        this.f3823i = null;
        ArrayList arrayList = this.f3825k;
        if (arrayList != null) {
            arrayList.clear();
        }
        this.f3824j &= -1025;
        this.f3830p = 0;
        this.f3831q = -1;
        RecyclerView.m1882j(this);
    }

    /* renamed from: n */
    public final void m2407n(boolean z2) {
        int i2 = this.f3827m;
        int i3 = z2 ? i2 - 1 : i2 + 1;
        this.f3827m = i3;
        if (i3 < 0) {
            this.f3827m = 0;
            toString();
        } else if (!z2 && i3 == 1) {
            this.f3824j |= 16;
        } else if (z2 && i3 == 0) {
            this.f3824j &= -17;
        }
    }

    /* renamed from: o */
    public final boolean m2408o() {
        return (this.f3824j & 128) != 0;
    }

    /* renamed from: p */
    public final boolean m2409p() {
        return (this.f3824j & 32) != 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder((getClass().isAnonymousClass() ? "ViewHolder" : getClass().getSimpleName()) + "{" + Integer.toHexString(hashCode()) + " position=" + this.f3817c + " id=" + this.f3819e + ", oldPos=" + this.f3818d + ", pLpos:" + this.f3821g);
        if (m2402i()) {
            sb.append(" scrap ");
            sb.append(this.f3829o ? "[changeScrap]" : "[attachedScrap]");
        }
        if (m2399f()) {
            sb.append(" invalid");
        }
        if (!m2398e()) {
            sb.append(" unbound");
        }
        if ((this.f3824j & 2) != 0) {
            sb.append(" update");
        }
        if (m2401h()) {
            sb.append(" removed");
        }
        if (m2408o()) {
            sb.append(" ignored");
        }
        if (m2403j()) {
            sb.append(" tmpDetached");
        }
        if (!m2400g()) {
            sb.append(" not recyclable(" + this.f3827m + ")");
        }
        if ((this.f3824j & 512) != 0 || m2399f()) {
            sb.append(" undefined adapter position");
        }
        if (this.f3815a.getParent() == null) {
            sb.append(" no parent");
        }
        sb.append("}");
        return sb.toString();
    }
}
