package p028K;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import androidx.drawerlayout.widget.DrawerLayout;
import com.google.android.material.navigation.NavigationView;
import p106j0.AbstractC1164m;
import p119o.C1240b;

/* renamed from: K.b0 */
/* loaded from: classes.dex */
public final class C0254b0 extends AnimatorListenerAdapter {

    /* renamed from: a */
    public final /* synthetic */ int f834a;

    /* renamed from: b */
    public final /* synthetic */ Object f835b;

    /* renamed from: c */
    public final /* synthetic */ Object f836c;

    public /* synthetic */ C0254b0(Object obj, View view, int i2) {
        this.f834a = i2;
        this.f835b = obj;
        this.f836c = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f834a) {
            case 0:
                ((C0266h0) this.f835b).f867a.mo744d(1.0f);
                C0258d0.m734e((View) this.f836c);
                break;
            case 1:
                NavigationView navigationView = (NavigationView) this.f836c;
                DrawerLayout drawerLayout = (DrawerLayout) this.f835b;
                drawerLayout.m1590c(navigationView, false);
                drawerLayout.setScrimColor(-1728053248);
                break;
            default:
                ((C1240b) this.f835b).remove(animator);
                ((AbstractC1164m) this.f836c).f4771n.remove(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.f834a) {
            case 2:
                ((AbstractC1164m) this.f836c).f4771n.add(animator);
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }

    public C0254b0(AbstractC1164m abstractC1164m, C1240b c1240b) {
        this.f834a = 2;
        this.f836c = abstractC1164m;
        this.f835b = c1240b;
    }
}
