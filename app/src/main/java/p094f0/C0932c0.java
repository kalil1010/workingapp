package p094f0;

import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import java.util.Arrays;

/* renamed from: f0.c0 */
/* loaded from: classes.dex */
public final class C0932c0 {

    /* renamed from: a */
    public int f3849a;

    /* renamed from: b */
    public int f3850b;

    /* renamed from: c */
    public boolean f3851c;

    /* renamed from: d */
    public boolean f3852d;

    /* renamed from: e */
    public boolean f3853e;

    /* renamed from: f */
    public int[] f3854f;

    /* renamed from: g */
    public final /* synthetic */ StaggeredGridLayoutManager f3855g;

    public C0932c0(StaggeredGridLayoutManager staggeredGridLayoutManager) {
        this.f3855g = staggeredGridLayoutManager;
        m2431a();
    }

    /* renamed from: a */
    public final void m2431a() {
        this.f3849a = -1;
        this.f3850b = Integer.MIN_VALUE;
        this.f3851c = false;
        this.f3852d = false;
        this.f3853e = false;
        int[] iArr = this.f3854f;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
    }
}
