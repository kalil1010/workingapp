package p105j;

import androidx.appcompat.widget.ActionBarOverlayLayout;

/* renamed from: j.c */
/* loaded from: classes.dex */
public final class RunnableC1080c implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f4492a;

    /* renamed from: b */
    public final /* synthetic */ ActionBarOverlayLayout f4493b;

    public /* synthetic */ RunnableC1080c(ActionBarOverlayLayout actionBarOverlayLayout, int i2) {
        this.f4492a = i2;
        this.f4493b = actionBarOverlayLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f4492a) {
            case 0:
                ActionBarOverlayLayout actionBarOverlayLayout = this.f4493b;
                actionBarOverlayLayout.m1487h();
                actionBarOverlayLayout.f2128w = actionBarOverlayLayout.f2109d.animate().translationY(0.0f).setListener(actionBarOverlayLayout.f2129x);
                break;
            default:
                ActionBarOverlayLayout actionBarOverlayLayout2 = this.f4493b;
                actionBarOverlayLayout2.m1487h();
                actionBarOverlayLayout2.f2128w = actionBarOverlayLayout2.f2109d.animate().translationY(-actionBarOverlayLayout2.f2109d.getHeight()).setListener(actionBarOverlayLayout2.f2129x);
                break;
        }
    }
}
