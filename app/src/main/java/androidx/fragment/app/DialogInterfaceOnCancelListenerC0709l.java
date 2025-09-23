package androidx.fragment.app;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.AbstractC0758w;
import androidx.lifecycle.C0759x;
import java.io.PrintWriter;
import p001A0.C0004c;
import p002A1.RunnableC0042x;
import p006C.AbstractC0075g;
import p033L1.AbstractC0364l;
import p090e.AbstractActivityC0874g;
import p131s1.AbstractC1326c;
import tkbmmn.ghwbbf.irvjzy.R;

/* renamed from: androidx.fragment.app.l */
/* loaded from: classes.dex */
public class DialogInterfaceOnCancelListenerC0709l extends AbstractComponentCallbacksC0712o implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {

    /* renamed from: R */
    public final DialogInterfaceOnCancelListenerC0706i f2586R;

    /* renamed from: S */
    public final DialogInterfaceOnDismissListenerC0707j f2587S;

    /* renamed from: T */
    public int f2588T;

    /* renamed from: U */
    public int f2589U;

    /* renamed from: V */
    public boolean f2590V;

    /* renamed from: W */
    public boolean f2591W;

    /* renamed from: X */
    public int f2592X;

    /* renamed from: Y */
    public boolean f2593Y;

    /* renamed from: Z */
    public final C0004c f2594Z;

    /* renamed from: a0 */
    public Dialog f2595a0;

    /* renamed from: b0 */
    public boolean f2596b0;

    /* renamed from: c0 */
    public boolean f2597c0;

    /* renamed from: d0 */
    public boolean f2598d0;

    public DialogInterfaceOnCancelListenerC0709l() {
        new RunnableC0042x(10, this);
        this.f2586R = new DialogInterfaceOnCancelListenerC0706i(this);
        this.f2587S = new DialogInterfaceOnDismissListenerC0707j(this);
        this.f2588T = 0;
        this.f2589U = 0;
        this.f2590V = true;
        this.f2591W = true;
        this.f2592X = -1;
        this.f2594Z = new C0004c(25, this);
        this.f2598d0 = false;
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0712o
    /* renamed from: d */
    public final AbstractC0364l mo1740d() {
        return new C0708k(this, new C0710m(this));
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0712o
    /* renamed from: k */
    public final void mo1741k(AbstractActivityC0874g abstractActivityC0874g) {
        super.mo1741k(abstractActivityC0874g);
        this.f2625N.m1793d(this.f2594Z);
        this.f2597c0 = false;
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0712o
    /* renamed from: l */
    public void mo1742l(Bundle bundle) {
        super.mo1742l(bundle);
        new Handler();
        this.f2591W = this.f2650w == 0;
        if (bundle != null) {
            this.f2588T = bundle.getInt("android:style", 0);
            this.f2589U = bundle.getInt("android:theme", 0);
            this.f2590V = bundle.getBoolean("android:cancelable", true);
            this.f2591W = bundle.getBoolean("android:showsDialog", this.f2591W);
            this.f2592X = bundle.getInt("android:backStackId", -1);
        }
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0712o
    /* renamed from: n */
    public final void mo1743n() {
        this.f2614C = true;
        Dialog dialog = this.f2595a0;
        if (dialog != null) {
            this.f2596b0 = true;
            dialog.setOnDismissListener(null);
            this.f2595a0.dismiss();
            if (!this.f2597c0) {
                onDismiss(this.f2595a0);
            }
            this.f2595a0 = null;
            this.f2598d0 = false;
        }
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0712o
    /* renamed from: o */
    public final void mo1744o() {
        this.f2614C = true;
        if (!this.f2597c0) {
            this.f2597c0 = true;
        }
        C0004c c0004c = this.f2594Z;
        C0759x c0759x = this.f2625N;
        c0759x.getClass();
        C0759x.m1790a("removeObserver");
        AbstractC0758w abstractC0758w = (AbstractC0758w) c0759x.f2746b.mo2855b(c0004c);
        if (abstractC0758w == null) {
            return;
        }
        abstractC0758w.mo1772d();
        abstractC0758w.m1789c(false);
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        if (this.f2596b0) {
            return;
        }
        if (C0686D.m1646D(3)) {
            toString();
        }
        if (this.f2597c0) {
            return;
        }
        this.f2597c0 = true;
        Dialog dialog = this.f2595a0;
        if (dialog != null) {
            dialog.setOnDismissListener(null);
            this.f2595a0.dismiss();
        }
        this.f2596b0 = true;
        if (this.f2592X >= 0) {
            C0686D c0686dM1756j = m1756j();
            int i2 = this.f2592X;
            if (i2 < 0) {
                throw new IllegalArgumentException(AbstractC0075g.m236e("Bad id: ", i2));
            }
            c0686dM1756j.m1689v(new C0685C(c0686dM1756j, i2), false);
            this.f2592X = -1;
            return;
        }
        C0698a c0698a = new C0698a(m1756j());
        C0686D c0686d = this.f2645r;
        if (c0686d != null && c0686d != c0698a.f2547p) {
            throw new IllegalStateException("Cannot remove Fragment attached to a different FragmentManager. Fragment " + toString() + " is already attached to a FragmentManager.");
        }
        c0698a.m1722b(new C0692J(3, this));
        if (c0698a.f2548q) {
            throw new IllegalStateException("commit already called");
        }
        if (C0686D.m1646D(2)) {
            c0698a.toString();
            PrintWriter printWriter = new PrintWriter(new C0694L());
            c0698a.m1724d("  ", printWriter, true);
            printWriter.close();
        }
        c0698a.f2548q = true;
        boolean z2 = c0698a.f2538g;
        C0686D c0686d2 = c0698a.f2547p;
        if (z2) {
            c0698a.f2549r = c0686d2.f2454i.getAndIncrement();
        } else {
            c0698a.f2549r = -1;
        }
        c0686d2.m1689v(c0698a, true);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0042 A[Catch: all -> 0x004a, TryCatch #0 {all -> 0x004a, blocks: (B:12:0x0018, B:14:0x0024, B:24:0x003c, B:26:0x0042, B:29:0x004c, B:20:0x002e, B:22:0x0034, B:23:0x0039, B:30:0x0064), top: B:45:0x0018 }] */
    @Override // androidx.fragment.app.AbstractComponentCallbacksC0712o
    /* renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.LayoutInflater mo1745p(android.os.Bundle r7) {
        /*
            r6 = this;
            android.view.LayoutInflater r7 = super.mo1745p(r7)
            boolean r0 = r6.f2591W
            r1 = 2
            if (r0 == 0) goto L83
            boolean r2 = r6.f2593Y
            if (r2 == 0) goto Lf
            goto L83
        Lf:
            if (r0 != 0) goto L12
            goto L6d
        L12:
            boolean r0 = r6.f2598d0
            if (r0 != 0) goto L6d
            r0 = 0
            r2 = 1
            r6.f2593Y = r2     // Catch: java.lang.Throwable -> L4a
            android.app.Dialog r3 = r6.mo1751z()     // Catch: java.lang.Throwable -> L4a
            r6.f2595a0 = r3     // Catch: java.lang.Throwable -> L4a
            boolean r4 = r6.f2591W     // Catch: java.lang.Throwable -> L4a
            if (r4 == 0) goto L64
            int r4 = r6.f2588T     // Catch: java.lang.Throwable -> L4a
            if (r4 == r2) goto L39
            if (r4 == r1) goto L39
            r5 = 3
            if (r4 == r5) goto L2e
            goto L3c
        L2e:
            android.view.Window r4 = r3.getWindow()     // Catch: java.lang.Throwable -> L4a
            if (r4 == 0) goto L39
            r5 = 24
            r4.addFlags(r5)     // Catch: java.lang.Throwable -> L4a
        L39:
            r3.requestWindowFeature(r2)     // Catch: java.lang.Throwable -> L4a
        L3c:
            android.content.Context r3 = r6.m1754h()     // Catch: java.lang.Throwable -> L4a
            if (r3 == 0) goto L4c
            android.app.Dialog r4 = r6.f2595a0     // Catch: java.lang.Throwable -> L4a
            android.app.Activity r3 = (android.app.Activity) r3     // Catch: java.lang.Throwable -> L4a
            r4.setOwnerActivity(r3)     // Catch: java.lang.Throwable -> L4a
            goto L4c
        L4a:
            r7 = move-exception
            goto L6a
        L4c:
            android.app.Dialog r3 = r6.f2595a0     // Catch: java.lang.Throwable -> L4a
            boolean r4 = r6.f2590V     // Catch: java.lang.Throwable -> L4a
            r3.setCancelable(r4)     // Catch: java.lang.Throwable -> L4a
            android.app.Dialog r3 = r6.f2595a0     // Catch: java.lang.Throwable -> L4a
            androidx.fragment.app.i r4 = r6.f2586R     // Catch: java.lang.Throwable -> L4a
            r3.setOnCancelListener(r4)     // Catch: java.lang.Throwable -> L4a
            android.app.Dialog r3 = r6.f2595a0     // Catch: java.lang.Throwable -> L4a
            androidx.fragment.app.j r4 = r6.f2587S     // Catch: java.lang.Throwable -> L4a
            r3.setOnDismissListener(r4)     // Catch: java.lang.Throwable -> L4a
            r6.f2598d0 = r2     // Catch: java.lang.Throwable -> L4a
            goto L67
        L64:
            r2 = 0
            r6.f2595a0 = r2     // Catch: java.lang.Throwable -> L4a
        L67:
            r6.f2593Y = r0
            goto L6d
        L6a:
            r6.f2593Y = r0
            throw r7
        L6d:
            boolean r0 = androidx.fragment.app.C0686D.m1646D(r1)
            if (r0 == 0) goto L76
            r6.toString()
        L76:
            android.app.Dialog r0 = r6.f2595a0
            if (r0 == 0) goto L8c
            android.content.Context r0 = r0.getContext()
            android.view.LayoutInflater r7 = r7.cloneInContext(r0)
            return r7
        L83:
            boolean r0 = androidx.fragment.app.C0686D.m1646D(r1)
            if (r0 == 0) goto L8c
            r6.toString()
        L8c:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.DialogInterfaceOnCancelListenerC0709l.mo1745p(android.os.Bundle):android.view.LayoutInflater");
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0712o
    /* renamed from: q */
    public void mo1746q(Bundle bundle) {
        Dialog dialog = this.f2595a0;
        if (dialog != null) {
            Bundle bundleOnSaveInstanceState = dialog.onSaveInstanceState();
            bundleOnSaveInstanceState.putBoolean("android:dialogShowing", false);
            bundle.putBundle("android:savedDialogState", bundleOnSaveInstanceState);
        }
        int i2 = this.f2588T;
        if (i2 != 0) {
            bundle.putInt("android:style", i2);
        }
        int i3 = this.f2589U;
        if (i3 != 0) {
            bundle.putInt("android:theme", i3);
        }
        boolean z2 = this.f2590V;
        if (!z2) {
            bundle.putBoolean("android:cancelable", z2);
        }
        boolean z3 = this.f2591W;
        if (!z3) {
            bundle.putBoolean("android:showsDialog", z3);
        }
        int i4 = this.f2592X;
        if (i4 != -1) {
            bundle.putInt("android:backStackId", i4);
        }
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0712o
    /* renamed from: r */
    public void mo1747r() {
        this.f2614C = true;
        Dialog dialog = this.f2595a0;
        if (dialog != null) {
            this.f2596b0 = false;
            dialog.show();
            View decorView = this.f2595a0.getWindow().getDecorView();
            AbstractC1326c.m3062e(decorView, "<this>");
            decorView.setTag(R.id.view_tree_lifecycle_owner, this);
            decorView.setTag(R.id.view_tree_view_model_store_owner, this);
            decorView.setTag(R.id.view_tree_saved_state_registry_owner, this);
        }
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0712o
    /* renamed from: s */
    public void mo1748s() {
        this.f2614C = true;
        Dialog dialog = this.f2595a0;
        if (dialog != null) {
            dialog.hide();
        }
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0712o
    /* renamed from: t */
    public final void mo1749t(Bundle bundle) {
        Bundle bundle2;
        this.f2614C = true;
        if (this.f2595a0 == null || bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
            return;
        }
        this.f2595a0.onRestoreInstanceState(bundle2);
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0712o
    /* renamed from: u */
    public final void mo1750u(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Bundle bundle2;
        super.mo1750u(layoutInflater, viewGroup, bundle);
        if (this.f2616E != null || this.f2595a0 == null || bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
            return;
        }
        this.f2595a0.onRestoreInstanceState(bundle2);
    }

    /* renamed from: z */
    public Dialog mo1751z() {
        if (C0686D.m1646D(3)) {
            toString();
        }
        return new Dialog(m1758v(), this.f2589U);
    }
}
