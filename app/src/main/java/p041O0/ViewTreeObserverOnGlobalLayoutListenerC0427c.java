package p041O0;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.view.Display;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import com.google.android.material.internal.NavigationMenuView;
import com.google.android.material.navigation.NavigationView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import p028K.AbstractC0241P;
import p035M0.AbstractC0368A;
import p035M0.C0388q;
import p102i.C0999e;
import p102i.ViewOnKeyListenerC0993D;
import p102i.ViewOnKeyListenerC1000f;
import p105j.AbstractC1039I;
import p105j.AbstractC1041J;
import p105j.C1046L0;
import p105j.C1051O;
import p105j.C1058S;

/* renamed from: O0.c */
/* loaded from: classes.dex */
public final class ViewTreeObserverOnGlobalLayoutListenerC0427c implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a */
    public final /* synthetic */ int f1314a;

    /* renamed from: b */
    public final /* synthetic */ Object f1315b;

    public /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC0427c(int i2, Object obj) {
        this.f1314a = i2;
        this.f1315b = obj;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        Activity activity;
        Rect rect;
        Object obj = this.f1315b;
        switch (this.f1314a) {
            case 0:
                NavigationView navigationView = (NavigationView) obj;
                int[] iArr = navigationView.f3289k;
                navigationView.getLocationOnScreen(iArr);
                boolean z2 = iArr[1] == 0;
                C0388q c0388q = navigationView.f3287i;
                if (c0388q.f1246x != z2) {
                    c0388q.f1246x = z2;
                    int i2 = (c0388q.f1224b.getChildCount() <= 0 && c0388q.f1246x) ? c0388q.f1248z : 0;
                    NavigationMenuView navigationMenuView = c0388q.f1223a;
                    navigationMenuView.setPadding(0, i2, 0, navigationMenuView.getPaddingBottom());
                }
                navigationView.setDrawTopInsetForeground(z2 && navigationView.f3292n);
                int i3 = iArr[0];
                navigationView.setDrawLeftInsetForeground(i3 == 0 || navigationView.getWidth() + i3 == 0);
                Context context = navigationView.getContext();
                while (true) {
                    if (!(context instanceof ContextWrapper)) {
                        activity = null;
                    } else if (context instanceof Activity) {
                        activity = (Activity) context;
                    } else {
                        context = ((ContextWrapper) context).getBaseContext();
                    }
                }
                if (activity != null) {
                    int i4 = Build.VERSION.SDK_INT;
                    int i5 = AbstractC0368A.f1136d;
                    WindowManager windowManager = (WindowManager) activity.getSystemService("window");
                    if (i4 >= 30) {
                        rect = windowManager.getCurrentWindowMetrics().getBounds();
                    } else {
                        Display defaultDisplay = windowManager.getDefaultDisplay();
                        Point point = new Point();
                        defaultDisplay.getRealSize(point);
                        rect = new Rect();
                        rect.right = point.x;
                        rect.bottom = point.y;
                    }
                    navigationView.setDrawBottomInsetForeground((rect.height() - navigationView.getHeight() == iArr[1]) && (Color.alpha(activity.getWindow().getNavigationBarColor()) != 0) && navigationView.f3293o);
                    navigationView.setDrawRightInsetForeground(rect.width() == iArr[0] || rect.width() - navigationView.getWidth() == iArr[0]);
                    break;
                }
                break;
            case 1:
                ViewOnKeyListenerC1000f viewOnKeyListenerC1000f = (ViewOnKeyListenerC1000f) obj;
                if (viewOnKeyListenerC1000f.mo2541b()) {
                    ArrayList arrayList = viewOnKeyListenerC1000f.f4217h;
                    if (arrayList.size() > 0 && !((C0999e) arrayList.get(0)).f4208a.f4375y) {
                        View view = viewOnKeyListenerC1000f.f4224o;
                        if (view != null && view.isShown()) {
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                ((C0999e) it.next()).f4208a.mo2543i();
                            }
                            break;
                        } else {
                            viewOnKeyListenerC1000f.dismiss();
                            break;
                        }
                    }
                }
                break;
            case 2:
                ViewOnKeyListenerC0993D viewOnKeyListenerC0993D = (ViewOnKeyListenerC0993D) obj;
                if (viewOnKeyListenerC0993D.mo2541b()) {
                    C1046L0 c1046l0 = viewOnKeyListenerC0993D.f4171h;
                    if (!c1046l0.f4375y) {
                        View view2 = viewOnKeyListenerC0993D.f4176m;
                        if (view2 != null && view2.isShown()) {
                            c1046l0.mo2543i();
                            break;
                        } else {
                            viewOnKeyListenerC0993D.dismiss();
                            break;
                        }
                    }
                }
                break;
            case 3:
                C1058S c1058s = (C1058S) obj;
                if (!c1058s.getInternalPopup().mo2646b()) {
                    c1058s.f4428f.mo2649e(AbstractC1041J.m2640b(c1058s), AbstractC1041J.m2639a(c1058s));
                }
                ViewTreeObserver viewTreeObserver = c1058s.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    AbstractC1039I.m2637a(viewTreeObserver, this);
                    break;
                }
                break;
            default:
                C1051O c1051o = (C1051O) obj;
                C1058S c1058s2 = c1051o.f4411G;
                c1051o.getClass();
                WeakHashMap weakHashMap = AbstractC0241P.f815a;
                if (!c1058s2.isAttachedToWindow() || !c1058s2.getGlobalVisibleRect(c1051o.f4409E)) {
                    c1051o.dismiss();
                    break;
                } else {
                    c1051o.m2663s();
                    c1051o.mo2543i();
                    break;
                }
                break;
        }
    }
}
