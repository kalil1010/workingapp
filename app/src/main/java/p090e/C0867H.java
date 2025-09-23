package p090e;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.Toolbar;
import java.util.ArrayList;
import java.util.WeakHashMap;
import p002A1.C0019a;
import p028K.AbstractC0228C;
import p028K.AbstractC0230E;
import p028K.AbstractC0241P;
import p028K.C0247W;
import p028K.C0248X;
import p033L1.AbstractC0356d;
import p080b1.C0770h;
import p086d.AbstractC0843a;
import p099h.C0980j;
import p099h.C0981k;
import p105j.C1112m1;
import p105j.InterfaceC1083d;
import p105j.InterfaceC1114n0;

/* renamed from: e.H */
/* loaded from: classes.dex */
public final class C0867H extends AbstractC0356d implements InterfaceC1083d {

    /* renamed from: L */
    public static final AccelerateInterpolator f3540L = new AccelerateInterpolator();

    /* renamed from: M */
    public static final DecelerateInterpolator f3541M = new DecelerateInterpolator();

    /* renamed from: A */
    public int f3542A;

    /* renamed from: B */
    public boolean f3543B;

    /* renamed from: C */
    public boolean f3544C;

    /* renamed from: D */
    public boolean f3545D;

    /* renamed from: E */
    public boolean f3546E;

    /* renamed from: F */
    public C0981k f3547F;

    /* renamed from: G */
    public boolean f3548G;

    /* renamed from: H */
    public boolean f3549H;

    /* renamed from: I */
    public final C0865F f3550I;

    /* renamed from: J */
    public final C0865F f3551J;

    /* renamed from: K */
    public final C0770h f3552K;

    /* renamed from: n */
    public Context f3553n;

    /* renamed from: o */
    public Context f3554o;

    /* renamed from: p */
    public ActionBarOverlayLayout f3555p;

    /* renamed from: q */
    public ActionBarContainer f3556q;

    /* renamed from: r */
    public InterfaceC1114n0 f3557r;

    /* renamed from: s */
    public ActionBarContextView f3558s;

    /* renamed from: t */
    public final View f3559t;

    /* renamed from: u */
    public boolean f3560u;

    /* renamed from: v */
    public C0866G f3561v;

    /* renamed from: w */
    public C0866G f3562w;

    /* renamed from: x */
    public C0019a f3563x;

    /* renamed from: y */
    public boolean f3564y;

    /* renamed from: z */
    public final ArrayList f3565z;

    public C0867H(Activity activity, boolean z2) {
        new ArrayList();
        this.f3565z = new ArrayList();
        this.f3542A = 0;
        this.f3543B = true;
        this.f3546E = true;
        this.f3550I = new C0865F(this, 0);
        this.f3551J = new C0865F(this, 1);
        this.f3552K = new C0770h(this);
        View decorView = activity.getWindow().getDecorView();
        m2201N(decorView);
        if (z2) {
            return;
        }
        this.f3559t = decorView.findViewById(R.id.content);
    }

    /* renamed from: L */
    public final void m2199L(boolean z2) {
        C0248X c0248xM1485i;
        C0248X c0248xM1485i2;
        if (z2) {
            if (!this.f3545D) {
                this.f3545D = true;
                ActionBarOverlayLayout actionBarOverlayLayout = this.f3555p;
                if (actionBarOverlayLayout != null) {
                    actionBarOverlayLayout.setShowingForActionMode(true);
                }
                m2204Q(false);
            }
        } else if (this.f3545D) {
            this.f3545D = false;
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.f3555p;
            if (actionBarOverlayLayout2 != null) {
                actionBarOverlayLayout2.setShowingForActionMode(false);
            }
            m2204Q(false);
        }
        ActionBarContainer actionBarContainer = this.f3556q;
        WeakHashMap weakHashMap = AbstractC0241P.f815a;
        if (!actionBarContainer.isLaidOut()) {
            if (z2) {
                ((C1112m1) this.f3557r).f4568a.setVisibility(4);
                this.f3558s.setVisibility(0);
                return;
            } else {
                ((C1112m1) this.f3557r).f4568a.setVisibility(0);
                this.f3558s.setVisibility(8);
                return;
            }
        }
        if (z2) {
            C1112m1 c1112m1 = (C1112m1) this.f3557r;
            c0248xM1485i = AbstractC0241P.m689a(c1112m1.f4568a);
            c0248xM1485i.m717a(0.0f);
            c0248xM1485i.m719c(100L);
            c0248xM1485i.m720d(new C0980j(c1112m1, 4));
            c0248xM1485i2 = this.f3558s.m1485i(0, 200L);
        } else {
            C1112m1 c1112m12 = (C1112m1) this.f3557r;
            C0248X c0248xM689a = AbstractC0241P.m689a(c1112m12.f4568a);
            c0248xM689a.m717a(1.0f);
            c0248xM689a.m719c(200L);
            c0248xM689a.m720d(new C0980j(c1112m12, 0));
            c0248xM1485i = this.f3558s.m1485i(8, 100L);
            c0248xM1485i2 = c0248xM689a;
        }
        C0981k c0981k = new C0981k();
        ArrayList arrayList = c0981k.f4127a;
        arrayList.add(c0248xM1485i);
        View view = (View) c0248xM1485i.f824a.get();
        long duration = view != null ? view.animate().getDuration() : 0L;
        View view2 = (View) c0248xM1485i2.f824a.get();
        if (view2 != null) {
            view2.animate().setStartDelay(duration);
        }
        arrayList.add(c0248xM1485i2);
        c0981k.m2487b();
    }

    /* renamed from: M */
    public final Context m2200M() {
        if (this.f3554o == null) {
            TypedValue typedValue = new TypedValue();
            this.f3553n.getTheme().resolveAttribute(tkbmmn.ghwbbf.irvjzy.R.attr.actionBarWidgetTheme, typedValue, true);
            int i2 = typedValue.resourceId;
            if (i2 != 0) {
                this.f3554o = new ContextThemeWrapper(this.f3553n, i2);
            } else {
                this.f3554o = this.f3553n;
            }
        }
        return this.f3554o;
    }

    /* renamed from: N */
    public final void m2201N(View view) {
        InterfaceC1114n0 wrapper;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(tkbmmn.ghwbbf.irvjzy.R.id.decor_content_parent);
        this.f3555p = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        KeyEvent.Callback callbackFindViewById = view.findViewById(tkbmmn.ghwbbf.irvjzy.R.id.action_bar);
        if (callbackFindViewById instanceof InterfaceC1114n0) {
            wrapper = (InterfaceC1114n0) callbackFindViewById;
        } else {
            if (!(callbackFindViewById instanceof Toolbar)) {
                throw new IllegalStateException("Can't make a decor toolbar out of ".concat(callbackFindViewById != null ? callbackFindViewById.getClass().getSimpleName() : "null"));
            }
            wrapper = ((Toolbar) callbackFindViewById).getWrapper();
        }
        this.f3557r = wrapper;
        this.f3558s = (ActionBarContextView) view.findViewById(tkbmmn.ghwbbf.irvjzy.R.id.action_context_bar);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(tkbmmn.ghwbbf.irvjzy.R.id.action_bar_container);
        this.f3556q = actionBarContainer;
        InterfaceC1114n0 interfaceC1114n0 = this.f3557r;
        if (interfaceC1114n0 == null || this.f3558s == null || actionBarContainer == null) {
            throw new IllegalStateException(C0867H.class.getSimpleName().concat(" can only be used with a compatible window decor layout"));
        }
        Context context = ((C1112m1) interfaceC1114n0).f4568a.getContext();
        this.f3553n = context;
        if ((((C1112m1) this.f3557r).f4569b & 4) != 0) {
            this.f3560u = true;
        }
        int i2 = context.getApplicationInfo().targetSdkVersion;
        this.f3557r.getClass();
        m2203P(context.getResources().getBoolean(tkbmmn.ghwbbf.irvjzy.R.bool.abc_action_bar_embed_tabs));
        TypedArray typedArrayObtainStyledAttributes = this.f3553n.obtainStyledAttributes(null, AbstractC0843a.f3451a, tkbmmn.ghwbbf.irvjzy.R.attr.actionBarStyle, 0);
        if (typedArrayObtainStyledAttributes.getBoolean(14, false)) {
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.f3555p;
            if (!actionBarOverlayLayout2.f2113h) {
                throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
            }
            this.f3549H = true;
            actionBarOverlayLayout2.setHideOnContentScrollEnabled(true);
        }
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(12, 0);
        if (dimensionPixelSize != 0) {
            ActionBarContainer actionBarContainer2 = this.f3556q;
            WeakHashMap weakHashMap = AbstractC0241P.f815a;
            AbstractC0230E.m636s(actionBarContainer2, dimensionPixelSize);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    /* renamed from: O */
    public final void m2202O(boolean z2) {
        if (this.f3560u) {
            return;
        }
        int i2 = z2 ? 4 : 0;
        C1112m1 c1112m1 = (C1112m1) this.f3557r;
        int i3 = c1112m1.f4569b;
        this.f3560u = true;
        c1112m1.m2728a((i2 & 4) | (i3 & (-5)));
    }

    /* renamed from: P */
    public final void m2203P(boolean z2) {
        if (z2) {
            this.f3556q.setTabContainer(null);
            ((C1112m1) this.f3557r).getClass();
        } else {
            ((C1112m1) this.f3557r).getClass();
            this.f3556q.setTabContainer(null);
        }
        C1112m1 c1112m1 = (C1112m1) this.f3557r;
        c1112m1.getClass();
        c1112m1.f4568a.setCollapsible(false);
        this.f3555p.setHasNonEmbeddedTabs(false);
    }

    /* renamed from: Q */
    public final void m2204Q(boolean z2) {
        boolean z3 = this.f3545D || !this.f3544C;
        View view = this.f3559t;
        C0770h c0770h = this.f3552K;
        if (!z3) {
            if (this.f3546E) {
                this.f3546E = false;
                C0981k c0981k = this.f3547F;
                if (c0981k != null) {
                    c0981k.m2486a();
                }
                int i2 = this.f3542A;
                C0865F c0865f = this.f3550I;
                if (i2 != 0 || (!this.f3548G && !z2)) {
                    c0865f.mo722a();
                    return;
                }
                this.f3556q.setAlpha(1.0f);
                this.f3556q.setTransitioning(true);
                C0981k c0981k2 = new C0981k();
                float f = -this.f3556q.getHeight();
                if (z2) {
                    this.f3556q.getLocationInWindow(new int[]{0, 0});
                    f -= r12[1];
                }
                C0248X c0248xM689a = AbstractC0241P.m689a(this.f3556q);
                c0248xM689a.m721e(f);
                View view2 = (View) c0248xM689a.f824a.get();
                if (view2 != null) {
                    view2.animate().setUpdateListener(c0770h != null ? new C0247W(c0770h, view2) : null);
                }
                boolean z4 = c0981k2.f4131e;
                ArrayList arrayList = c0981k2.f4127a;
                if (!z4) {
                    arrayList.add(c0248xM689a);
                }
                if (this.f3543B && view != null) {
                    C0248X c0248xM689a2 = AbstractC0241P.m689a(view);
                    c0248xM689a2.m721e(f);
                    if (!c0981k2.f4131e) {
                        arrayList.add(c0248xM689a2);
                    }
                }
                AccelerateInterpolator accelerateInterpolator = f3540L;
                boolean z5 = c0981k2.f4131e;
                if (!z5) {
                    c0981k2.f4129c = accelerateInterpolator;
                }
                if (!z5) {
                    c0981k2.f4128b = 250L;
                }
                if (!z5) {
                    c0981k2.f4130d = c0865f;
                }
                this.f3547F = c0981k2;
                c0981k2.m2487b();
                return;
            }
            return;
        }
        if (this.f3546E) {
            return;
        }
        this.f3546E = true;
        C0981k c0981k3 = this.f3547F;
        if (c0981k3 != null) {
            c0981k3.m2486a();
        }
        this.f3556q.setVisibility(0);
        int i3 = this.f3542A;
        C0865F c0865f2 = this.f3551J;
        if (i3 == 0 && (this.f3548G || z2)) {
            this.f3556q.setTranslationY(0.0f);
            float f2 = -this.f3556q.getHeight();
            if (z2) {
                this.f3556q.getLocationInWindow(new int[]{0, 0});
                f2 -= r12[1];
            }
            this.f3556q.setTranslationY(f2);
            C0981k c0981k4 = new C0981k();
            C0248X c0248xM689a3 = AbstractC0241P.m689a(this.f3556q);
            c0248xM689a3.m721e(0.0f);
            View view3 = (View) c0248xM689a3.f824a.get();
            if (view3 != null) {
                view3.animate().setUpdateListener(c0770h != null ? new C0247W(c0770h, view3) : null);
            }
            boolean z6 = c0981k4.f4131e;
            ArrayList arrayList2 = c0981k4.f4127a;
            if (!z6) {
                arrayList2.add(c0248xM689a3);
            }
            if (this.f3543B && view != null) {
                view.setTranslationY(f2);
                C0248X c0248xM689a4 = AbstractC0241P.m689a(view);
                c0248xM689a4.m721e(0.0f);
                if (!c0981k4.f4131e) {
                    arrayList2.add(c0248xM689a4);
                }
            }
            DecelerateInterpolator decelerateInterpolator = f3541M;
            boolean z7 = c0981k4.f4131e;
            if (!z7) {
                c0981k4.f4129c = decelerateInterpolator;
            }
            if (!z7) {
                c0981k4.f4128b = 250L;
            }
            if (!z7) {
                c0981k4.f4130d = c0865f2;
            }
            this.f3547F = c0981k4;
            c0981k4.m2487b();
        } else {
            this.f3556q.setAlpha(1.0f);
            this.f3556q.setTranslationY(0.0f);
            if (this.f3543B && view != null) {
                view.setTranslationY(0.0f);
            }
            c0865f2.mo722a();
        }
        ActionBarOverlayLayout actionBarOverlayLayout = this.f3555p;
        if (actionBarOverlayLayout != null) {
            WeakHashMap weakHashMap = AbstractC0241P.f815a;
            AbstractC0228C.m617c(actionBarOverlayLayout);
        }
    }

    public C0867H(Dialog dialog) {
        new ArrayList();
        this.f3565z = new ArrayList();
        this.f3542A = 0;
        this.f3543B = true;
        this.f3546E = true;
        this.f3550I = new C0865F(this, 0);
        this.f3551J = new C0865F(this, 1);
        this.f3552K = new C0770h(this);
        m2201N(dialog.getWindow().getDecorView());
    }
}
