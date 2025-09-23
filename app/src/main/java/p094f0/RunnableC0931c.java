package p094f0;

import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: f0.c */
/* loaded from: classes.dex */
public final class RunnableC0931c implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f3846a;

    /* renamed from: b */
    public final /* synthetic */ ArrayList f3847b;

    /* renamed from: c */
    public final /* synthetic */ C0943i f3848c;

    public /* synthetic */ RunnableC0931c(C0943i c0943i, ArrayList arrayList, int i2) {
        this.f3846a = i2;
        this.f3848c = c0943i;
        this.f3847b = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f3846a) {
            case 0:
                ArrayList arrayList = this.f3847b;
                Iterator it = arrayList.iterator();
                while (true) {
                    boolean zHasNext = it.hasNext();
                    C0943i c0943i = this.f3848c;
                    if (!zHasNext) {
                        arrayList.clear();
                        c0943i.f3916m.remove(arrayList);
                        break;
                    } else {
                        C0941h c0941h = (C0941h) it.next();
                        AbstractC0926Z abstractC0926Z = c0941h.f3899a;
                        c0943i.getClass();
                        View view = abstractC0926Z.f3815a;
                        int i2 = c0941h.f3902d - c0941h.f3900b;
                        int i3 = c0941h.f3903e - c0941h.f3901c;
                        if (i2 != 0) {
                            view.animate().translationX(0.0f);
                        }
                        if (i3 != 0) {
                            view.animate().translationY(0.0f);
                        }
                        ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
                        c0943i.f3919p.add(abstractC0926Z);
                        viewPropertyAnimatorAnimate.setDuration(c0943i.f3744e).setListener(new C0935e(c0943i, abstractC0926Z, i2, view, i3, viewPropertyAnimatorAnimate)).start();
                    }
                }
            case 1:
                ArrayList arrayList2 = this.f3847b;
                Iterator it2 = arrayList2.iterator();
                while (true) {
                    boolean zHasNext2 = it2.hasNext();
                    C0943i c0943i2 = this.f3848c;
                    if (!zHasNext2) {
                        arrayList2.clear();
                        c0943i2.f3917n.remove(arrayList2);
                        break;
                    } else {
                        C0939g c0939g = (C0939g) it2.next();
                        c0943i2.getClass();
                        AbstractC0926Z abstractC0926Z2 = c0939g.f3887a;
                        View view2 = abstractC0926Z2 == null ? null : abstractC0926Z2.f3815a;
                        AbstractC0926Z abstractC0926Z3 = c0939g.f3888b;
                        View view3 = abstractC0926Z3 != null ? abstractC0926Z3.f3815a : null;
                        ArrayList arrayList3 = c0943i2.f3921r;
                        long j2 = c0943i2.f3745f;
                        if (view2 != null) {
                            ViewPropertyAnimator duration = view2.animate().setDuration(j2);
                            arrayList3.add(c0939g.f3887a);
                            duration.translationX(c0939g.f3891e - c0939g.f3889c);
                            duration.translationY(c0939g.f3892f - c0939g.f3890d);
                            duration.alpha(0.0f).setListener(new C0937f(c0943i2, c0939g, duration, view2, 0)).start();
                        }
                        if (view3 != null) {
                            ViewPropertyAnimator viewPropertyAnimatorAnimate2 = view3.animate();
                            arrayList3.add(c0939g.f3888b);
                            viewPropertyAnimatorAnimate2.translationX(0.0f).translationY(0.0f).setDuration(j2).alpha(1.0f).setListener(new C0937f(c0943i2, c0939g, viewPropertyAnimatorAnimate2, view3, 1)).start();
                        }
                    }
                }
            default:
                ArrayList arrayList4 = this.f3847b;
                Iterator it3 = arrayList4.iterator();
                while (true) {
                    boolean zHasNext3 = it3.hasNext();
                    C0943i c0943i3 = this.f3848c;
                    if (!zHasNext3) {
                        arrayList4.clear();
                        c0943i3.f3915l.remove(arrayList4);
                        break;
                    } else {
                        AbstractC0926Z abstractC0926Z4 = (AbstractC0926Z) it3.next();
                        c0943i3.getClass();
                        View view4 = abstractC0926Z4.f3815a;
                        ViewPropertyAnimator viewPropertyAnimatorAnimate3 = view4.animate();
                        c0943i3.f3918o.add(abstractC0926Z4);
                        viewPropertyAnimatorAnimate3.alpha(1.0f).setDuration(c0943i3.f3742c).setListener(new C0933d(c0943i3, abstractC0926Z4, view4, viewPropertyAnimatorAnimate3)).start();
                    }
                }
        }
    }
}
