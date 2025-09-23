package p094f0;

import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import p028K.AbstractC0241P;

/* renamed from: f0.z */
/* loaded from: classes.dex */
public final class RunnableC0961z implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f4033a;

    /* renamed from: b */
    public final /* synthetic */ RecyclerView f4034b;

    public /* synthetic */ RunnableC0961z(RecyclerView recyclerView, int i2) {
        this.f4033a = i2;
        this.f4034b = recyclerView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        RecyclerView recyclerView = this.f4034b;
        switch (this.f4033a) {
            case 0:
                if (recyclerView.f2839s && !recyclerView.isLayoutRequested()) {
                    if (!recyclerView.f2835q) {
                        recyclerView.requestLayout();
                        break;
                    } else if (!recyclerView.f2844v) {
                        recyclerView.m1918m();
                        break;
                    } else {
                        recyclerView.f2843u = true;
                        break;
                    }
                }
                break;
            default:
                AbstractC0907F abstractC0907F = recyclerView.f2789J;
                if (abstractC0907F != null) {
                    C0943i c0943i = (C0943i) abstractC0907F;
                    ArrayList arrayList = c0943i.f3911h;
                    boolean zIsEmpty = arrayList.isEmpty();
                    ArrayList arrayList2 = c0943i.f3913j;
                    boolean zIsEmpty2 = arrayList2.isEmpty();
                    ArrayList arrayList3 = c0943i.f3914k;
                    boolean zIsEmpty3 = arrayList3.isEmpty();
                    ArrayList arrayList4 = c0943i.f3912i;
                    boolean zIsEmpty4 = arrayList4.isEmpty();
                    if (!zIsEmpty || !zIsEmpty2 || !zIsEmpty4 || !zIsEmpty3) {
                        Iterator it = arrayList.iterator();
                        while (true) {
                            boolean zHasNext = it.hasNext();
                            long j2 = c0943i.f3743d;
                            if (zHasNext) {
                                AbstractC0926Z abstractC0926Z = (AbstractC0926Z) it.next();
                                View view = abstractC0926Z.f3815a;
                                ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
                                c0943i.f3920q.add(abstractC0926Z);
                                viewPropertyAnimatorAnimate.setDuration(j2).alpha(0.0f).setListener(new C0933d(c0943i, abstractC0926Z, viewPropertyAnimatorAnimate, view)).start();
                                arrayList = arrayList;
                            } else {
                                arrayList.clear();
                                if (!zIsEmpty2) {
                                    ArrayList arrayList5 = new ArrayList();
                                    arrayList5.addAll(arrayList2);
                                    c0943i.f3916m.add(arrayList5);
                                    arrayList2.clear();
                                    RunnableC0931c runnableC0931c = new RunnableC0931c(c0943i, arrayList5, 0);
                                    if (zIsEmpty) {
                                        runnableC0931c.run();
                                    } else {
                                        View view2 = ((C0941h) arrayList5.get(0)).f3899a.f3815a;
                                        WeakHashMap weakHashMap = AbstractC0241P.f815a;
                                        view2.postOnAnimationDelayed(runnableC0931c, j2);
                                    }
                                }
                                if (!zIsEmpty3) {
                                    ArrayList arrayList6 = new ArrayList();
                                    arrayList6.addAll(arrayList3);
                                    c0943i.f3917n.add(arrayList6);
                                    arrayList3.clear();
                                    RunnableC0931c runnableC0931c2 = new RunnableC0931c(c0943i, arrayList6, 1);
                                    if (zIsEmpty) {
                                        runnableC0931c2.run();
                                    } else {
                                        View view3 = ((C0939g) arrayList6.get(0)).f3887a.f3815a;
                                        WeakHashMap weakHashMap2 = AbstractC0241P.f815a;
                                        view3.postOnAnimationDelayed(runnableC0931c2, j2);
                                    }
                                }
                                if (!zIsEmpty4) {
                                    ArrayList arrayList7 = new ArrayList();
                                    arrayList7.addAll(arrayList4);
                                    c0943i.f3915l.add(arrayList7);
                                    arrayList4.clear();
                                    RunnableC0931c runnableC0931c3 = new RunnableC0931c(c0943i, arrayList7, 2);
                                    if (zIsEmpty && zIsEmpty2 && zIsEmpty3) {
                                        runnableC0931c3.run();
                                    } else {
                                        if (zIsEmpty) {
                                            j2 = 0;
                                        }
                                        long jMax = Math.max(!zIsEmpty2 ? c0943i.f3744e : 0L, zIsEmpty3 ? 0L : c0943i.f3745f) + j2;
                                        View view4 = ((AbstractC0926Z) arrayList7.get(0)).f3815a;
                                        WeakHashMap weakHashMap3 = AbstractC0241P.f815a;
                                        view4.postOnAnimationDelayed(runnableC0931c3, jMax);
                                    }
                                }
                            }
                        }
                    }
                }
                recyclerView.f2824k0 = false;
                break;
        }
    }
}
