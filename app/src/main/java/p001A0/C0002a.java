package p001A0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.view.View;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import p009D.AbstractC0098a;
import p015F0.C0146a;
import p015F0.C0149d;
import p028K.InterfaceC0249Y;
import p038N0.C0420g;
import p064W0.C0564j;
import p106j0.AbstractC1164m;
import p109k0.C1188f;

/* renamed from: A0.a */
/* loaded from: classes.dex */
public final class C0002a extends AnimatorListenerAdapter {

    /* renamed from: a */
    public final /* synthetic */ int f0a;

    /* renamed from: b */
    public final /* synthetic */ Object f1b;

    public /* synthetic */ C0002a(int i2, Object obj) {
        this.f0a = i2;
        this.f1b = obj;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.f0a) {
            case 2:
                ((InterfaceC0249Y) this.f1b).mo723d();
                break;
            case 6:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.f1b;
                actionBarOverlayLayout.f2128w = null;
                actionBarOverlayLayout.f2116k = false;
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) throws Resources.NotFoundException {
        switch (this.f0a) {
            case 0:
                ((HideBottomViewOnScrollBehavior) this.f1b).f3043h = null;
                break;
            case 1:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.f1b;
                bottomSheetBehavior.m2045G(5);
                WeakReference weakReference = bottomSheetBehavior.f3071U;
                if (weakReference != null && weakReference.get() != null) {
                    ((View) bottomSheetBehavior.f3071U.get()).requestLayout();
                    break;
                }
                break;
            case 2:
                ((InterfaceC0249Y) this.f1b).mo722a();
                break;
            case 3:
                C0420g c0420g = (C0420g) this.f1b;
                c0420g.f1293b.setTranslationY(0.0f);
                c0420g.m1093b(0.0f);
                break;
            case 4:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f1b;
                sideSheetBehavior.m2108w(5);
                WeakReference weakReference2 = sideSheetBehavior.f3316p;
                if (weakReference2 != null && weakReference2.get() != null) {
                    ((View) sideSheetBehavior.f3316p.get()).requestLayout();
                    break;
                }
                break;
            case 5:
                C0564j c0564j = (C0564j) this.f1b;
                c0564j.m1374q();
                c0564j.f1770r.start();
                break;
            case 6:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.f1b;
                actionBarOverlayLayout.f2128w = null;
                actionBarOverlayLayout.f2116k = false;
                break;
            case 7:
                ((AbstractC1164m) this.f1b).m2811m();
                animator.removeListener(this);
                break;
            default:
                C1188f c1188f = (C1188f) this.f1b;
                ArrayList arrayList = new ArrayList(c1188f.f4822e);
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ColorStateList colorStateList = ((C0146a) arrayList.get(i2)).f503b.f520o;
                    if (colorStateList != null) {
                        AbstractC0098a.m300h(c1188f, colorStateList);
                    }
                }
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.f0a) {
            case 2:
                ((InterfaceC0249Y) this.f1b).mo724g();
                break;
            case 8:
                C1188f c1188f = (C1188f) this.f1b;
                ArrayList arrayList = new ArrayList(c1188f.f4822e);
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    C0149d c0149d = ((C0146a) arrayList.get(i2)).f503b;
                    ColorStateList colorStateList = c0149d.f520o;
                    if (colorStateList != null) {
                        AbstractC0098a.m299g(c1188f, colorStateList.getColorForState(c0149d.f524s, colorStateList.getDefaultColor()));
                    }
                }
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }

    public C0002a(InterfaceC0249Y interfaceC0249Y, View view) {
        this.f0a = 2;
        this.f1b = interfaceC0249Y;
    }
}
