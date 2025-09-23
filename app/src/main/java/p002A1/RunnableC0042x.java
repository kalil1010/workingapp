package p002A1;

import android.animation.ValueAnimator;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.widget.ListView;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.AnimationAnimationListenerC0701d;
import androidx.fragment.app.C0686D;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC0709l;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import java.util.WeakHashMap;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.logging.Level;
import p001A0.C0004c;
import p007C0.C0091i;
import p019G1.AbstractC0167a;
import p019G1.C0169c;
import p019G1.C0170d;
import p028K.AbstractC0241P;
import p033L1.AbstractC0356d;
import p045Q.C0437a;
import p045Q.ViewOnTouchListenerC0443g;
import p054T.C0506e;
import p060V.C0542d;
import p060V.C0544f;
import p094f0.C0948m;
import p105j.C1104k;
import p105j.C1135u0;
import p131s1.AbstractC1326c;
import tkbmmn.ghwbbf.irvjzy.R;

/* renamed from: A1.x */
/* loaded from: classes.dex */
public final class RunnableC0042x implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f94a;

    /* renamed from: b */
    public final /* synthetic */ Object f95b;

    public /* synthetic */ RunnableC0042x(int i2, Object obj) {
        this.f94a = i2;
        this.f95b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() throws Resources.NotFoundException {
        AbstractC0167a abstractC0167aM473c;
        long jNanoTime;
        View viewM1593f;
        int width;
        C1104k c1104k;
        switch (this.f94a) {
            case 0:
                ((C0038t) this.f95b).f81a.f5009y.setImageResource(R.drawable.circle_dot_timeout);
                return;
            case 1:
                AlertDialog alertDialogCreate = new AlertDialog.Builder((Context) ((C0009D) this.f95b).f17b, R.style.MyAlertDialog).setIcon(R.drawable.baseline_warning_24).setTitle("提示").setMessage("请检查网络连接").setPositiveButton("确定", (DialogInterface.OnClickListener) null).create();
                alertDialogCreate.setCanceledOnTouchOutside(false);
                alertDialogCreate.setCancelable(false);
                alertDialogCreate.show();
                return;
            case 2:
                C0091i c0091i = (C0091i) this.f95b;
                c0091i.f217c = false;
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) c0091i.f219e;
                C0506e c0506e = bottomSheetBehavior.f3063M;
                if (c0506e != null && c0506e.m1257g()) {
                    c0091i.m283a(c0091i.f216b);
                    return;
                } else {
                    if (bottomSheetBehavior.f3062L == 2) {
                        bottomSheetBehavior.m2045G(c0091i.f216b);
                        return;
                    }
                    return;
                }
            case 3:
                break;
            case 4:
                ViewOnTouchListenerC0443g viewOnTouchListenerC0443g = (ViewOnTouchListenerC0443g) this.f95b;
                if (viewOnTouchListenerC0443g.f1348o) {
                    boolean z2 = viewOnTouchListenerC0443g.f1346m;
                    C0437a c0437a = viewOnTouchListenerC0443g.f1334a;
                    if (z2) {
                        viewOnTouchListenerC0443g.f1346m = false;
                        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                        c0437a.f1328e = jCurrentAnimationTimeMillis;
                        c0437a.f1330g = -1L;
                        c0437a.f1329f = jCurrentAnimationTimeMillis;
                        c0437a.f1331h = 0.5f;
                    }
                    if ((c0437a.f1330g > 0 && AnimationUtils.currentAnimationTimeMillis() > c0437a.f1330g + c0437a.f1332i) || !viewOnTouchListenerC0443g.m1119e()) {
                        viewOnTouchListenerC0443g.f1348o = false;
                        return;
                    }
                    boolean z3 = viewOnTouchListenerC0443g.f1347n;
                    ListView listView = viewOnTouchListenerC0443g.f1336c;
                    if (z3) {
                        viewOnTouchListenerC0443g.f1347n = false;
                        long jUptimeMillis = SystemClock.uptimeMillis();
                        MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                        listView.onTouchEvent(motionEventObtain);
                        motionEventObtain.recycle();
                    }
                    if (c0437a.f1329f == 0) {
                        throw new RuntimeException("Cannot compute scroll delta before calling start()");
                    }
                    long jCurrentAnimationTimeMillis2 = AnimationUtils.currentAnimationTimeMillis();
                    float fM1101a = c0437a.m1101a(jCurrentAnimationTimeMillis2);
                    long j2 = jCurrentAnimationTimeMillis2 - c0437a.f1329f;
                    c0437a.f1329f = jCurrentAnimationTimeMillis2;
                    viewOnTouchListenerC0443g.f1350q.scrollListBy((int) (j2 * ((fM1101a * 4.0f) + ((-4.0f) * fM1101a * fM1101a)) * c0437a.f1327d));
                    WeakHashMap weakHashMap = AbstractC0241P.f815a;
                    listView.postOnAnimation(this);
                    return;
                }
                return;
            case 5:
                ((C0506e) this.f95b).m1265o(0);
                return;
            case 6:
                C0544f c0544f = (C0544f) this.f95b;
                int i2 = c0544f.f1718d.f1570o;
                int i3 = c0544f.f1717c;
                boolean z4 = i3 == 3;
                DrawerLayout drawerLayout = c0544f.f1720f;
                if (z4) {
                    viewM1593f = drawerLayout.m1593f(3);
                    width = (viewM1593f != null ? -viewM1593f.getWidth() : 0) + i2;
                } else {
                    viewM1593f = drawerLayout.m1593f(5);
                    width = drawerLayout.getWidth() - i2;
                }
                if (viewM1593f != null) {
                    if (((!z4 || viewM1593f.getLeft() >= width) && (z4 || viewM1593f.getLeft() <= width)) || drawerLayout.m1597j(viewM1593f) != 0) {
                        return;
                    }
                    C0542d c0542d = (C0542d) viewM1593f.getLayoutParams();
                    c0544f.f1718d.m1268r(viewM1593f, width, viewM1593f.getTop());
                    c0542d.f1710c = true;
                    drawerLayout.invalidate();
                    View viewM1593f2 = drawerLayout.m1593f(i3 == 3 ? 5 : 3);
                    if (viewM1593f2 != null) {
                        drawerLayout.m1590c(viewM1593f2, true);
                    }
                    if (drawerLayout.f2373r) {
                        return;
                    }
                    long jUptimeMillis2 = SystemClock.uptimeMillis();
                    MotionEvent motionEventObtain2 = MotionEvent.obtain(jUptimeMillis2, jUptimeMillis2, 3, 0.0f, 0.0f, 0);
                    int childCount = drawerLayout.getChildCount();
                    for (int i4 = 0; i4 < childCount; i4++) {
                        drawerLayout.getChildAt(i4).dispatchTouchEvent(motionEventObtain2);
                    }
                    motionEventObtain2.recycle();
                    drawerLayout.f2373r = true;
                    return;
                }
                return;
            case 7:
                CheckableImageButton checkableImageButton = ((TextInputLayout) this.f95b).f3360c.f1785g;
                checkableImageButton.performClick();
                checkableImageButton.jumpDrawablesToCurrentState();
                return;
            case 8:
                try {
                    super/*android.app.Activity*/.onBackPressed();
                    return;
                } catch (IllegalStateException e3) {
                    if (!TextUtils.equals(e3.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                        throw e3;
                    }
                    return;
                } catch (NullPointerException e4) {
                    if (!TextUtils.equals(e4.getMessage(), "Attempt to invoke virtual method 'android.os.Handler android.app.FragmentHostCallback.getHandler()' on a null object reference")) {
                        throw e4;
                    }
                    return;
                }
            case 9:
                AnimationAnimationListenerC0701d animationAnimationListenerC0701d = (AnimationAnimationListenerC0701d) this.f95b;
                animationAnimationListenerC0701d.f2569a.endViewTransition(animationAnimationListenerC0701d.f2570b);
                animationAnimationListenerC0701d.f2571c.m1727d();
                return;
            case 10:
                DialogInterfaceOnCancelListenerC0709l dialogInterfaceOnCancelListenerC0709l = (DialogInterfaceOnCancelListenerC0709l) this.f95b;
                dialogInterfaceOnCancelListenerC0709l.f2587S.onDismiss(dialogInterfaceOnCancelListenerC0709l.f2595a0);
                return;
            case 11:
                ((C0686D) this.f95b).m1691x(true);
                return;
            case 12:
                C0948m c0948m = (C0948m) this.f95b;
                int i5 = c0948m.f3935A;
                ValueAnimator valueAnimator = c0948m.f3962z;
                if (i5 == 1) {
                    valueAnimator.cancel();
                } else if (i5 != 2) {
                    return;
                }
                c0948m.f3935A = 3;
                valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 0.0f);
                valueAnimator.setDuration(500);
                valueAnimator.start();
                return;
            case 13:
                ((StaggeredGridLayoutManager) this.f95b).m1933A0();
                return;
            case 14:
                C1135u0 c1135u0 = (C1135u0) this.f95b;
                c1135u0.f4652l = null;
                c1135u0.drawableStateChanged();
                return;
            default:
                ActionMenuView actionMenuView = ((Toolbar) this.f95b).f2217a;
                if (actionMenuView == null || (c1104k = actionMenuView.f2136t) == null) {
                    return;
                }
                c1104k.m2727o();
                return;
        }
        while (true) {
            synchronized (((C0170d) this.f95b)) {
                abstractC0167aM473c = ((C0170d) this.f95b).m473c();
            }
            if (abstractC0167aM473c == null) {
                return;
            }
            C0169c c0169c = abstractC0167aM473c.f607a;
            AbstractC1326c.m3059b(c0169c);
            boolean zIsLoggable = C0170d.f620i.isLoggable(Level.FINE);
            if (zIsLoggable) {
                C0004c c0004c = c0169c.f617e.f627g;
                jNanoTime = System.nanoTime();
                AbstractC0356d.m951a(abstractC0167aM473c, c0169c, "starting");
            } else {
                jNanoTime = -1;
            }
            try {
                C0170d.m471a((C0170d) this.f95b, abstractC0167aM473c);
                if (zIsLoggable) {
                    C0004c c0004c2 = c0169c.f617e.f627g;
                    AbstractC0356d.m951a(abstractC0167aM473c, c0169c, "finished run in ".concat(AbstractC0356d.m967q(System.nanoTime() - jNanoTime)));
                }
            } catch (Throwable th) {
                try {
                    ((ThreadPoolExecutor) ((C0170d) this.f95b).f627g.f7b).execute(this);
                    throw th;
                } catch (Throwable th2) {
                    if (zIsLoggable) {
                        C0004c c0004c3 = c0169c.f617e.f627g;
                        AbstractC0356d.m951a(abstractC0167aM473c, c0169c, "failed a run in ".concat(AbstractC0356d.m967q(System.nanoTime() - jNanoTime)));
                    }
                    throw th2;
                }
            }
        }
    }
}
