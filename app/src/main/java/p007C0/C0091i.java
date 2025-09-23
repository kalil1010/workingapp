package p007C0;

import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import p002A1.RunnableC0030l;
import p002A1.RunnableC0042x;
import p028K.AbstractC0241P;
import p144x.AbstractC1388a;

/* renamed from: C0.i */
/* loaded from: classes.dex */
public final class C0091i {

    /* renamed from: a */
    public final /* synthetic */ int f215a;

    /* renamed from: b */
    public int f216b;

    /* renamed from: c */
    public boolean f217c;

    /* renamed from: d */
    public final Runnable f218d;

    /* renamed from: e */
    public final /* synthetic */ AbstractC1388a f219e;

    public C0091i(SideSheetBehavior sideSheetBehavior) {
        this.f215a = 1;
        this.f219e = sideSheetBehavior;
        this.f218d = new RunnableC0030l(4, this);
    }

    /* renamed from: a */
    public final void m283a(int i2) {
        Runnable runnable = this.f218d;
        AbstractC1388a abstractC1388a = this.f219e;
        switch (this.f215a) {
            case 0:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) abstractC1388a;
                WeakReference weakReference = bottomSheetBehavior.f3071U;
                if (weakReference != null && weakReference.get() != null) {
                    this.f216b = i2;
                    if (!this.f217c) {
                        WeakHashMap weakHashMap = AbstractC0241P.f815a;
                        ((View) bottomSheetBehavior.f3071U.get()).postOnAnimation((RunnableC0042x) runnable);
                        this.f217c = true;
                        break;
                    }
                }
                break;
            default:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) abstractC1388a;
                WeakReference weakReference2 = sideSheetBehavior.f3316p;
                if (weakReference2 != null && weakReference2.get() != null) {
                    this.f216b = i2;
                    if (!this.f217c) {
                        WeakHashMap weakHashMap2 = AbstractC0241P.f815a;
                        ((View) sideSheetBehavior.f3316p.get()).postOnAnimation((RunnableC0030l) runnable);
                        this.f217c = true;
                        break;
                    }
                }
                break;
        }
    }

    public C0091i(BottomSheetBehavior bottomSheetBehavior) {
        this.f215a = 0;
        this.f219e = bottomSheetBehavior;
        this.f218d = new RunnableC0042x(2, this);
    }
}
