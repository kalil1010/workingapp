package p002A1;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Application;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Handler;
import android.os.Trace;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.activity.ExecutorC0644j;
import androidx.emoji2.text.C0675n;
import androidx.lifecycle.C0725B;
import androidx.lifecycle.C0755t;
import androidx.lifecycle.EnumC0747l;
import com.google.android.material.carousel.CarouselLayoutManager;
import com.google.android.material.navigation.NavigationView;
import com.google.android.material.sidesheet.SideSheetBehavior;
import com.google.android.material.textfield.TextInputLayout;
import com.google.android.material.timepicker.AbstractC0838e;
import java.lang.reflect.Method;
import java.nio.MappedByteBuffer;
import nfc.share.nfcshare.MainActivity;
import p000A.AbstractC0001b;
import p001A0.RunnableC0005d;
import p006C.AbstractC0077i;
import p007C0.C0091i;
import p011D1.C0121k;
import p017G.AbstractC0160i;
import p020H.C0178h;
import p033L1.AbstractC0364l;
import p038N0.C0417d;
import p038N0.InterfaceC0415b;
import p054T.C0506e;
import p055T0.C0511e;
import p064W0.C0558d;
import p064W0.C0564j;
import p090e.AbstractActivityC0874g;
import p090e.DialogC0873f;
import p093e2.AbstractC0901d;
import p131s1.AbstractC1326c;
import p150z.AbstractC1413b;
import p150z.C1412a;

/* renamed from: A1.l */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0030l implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f69a;

    /* renamed from: b */
    public final /* synthetic */ Object f70b;

    public /* synthetic */ RunnableC0030l(int i2, Object obj) {
        this.f69a = i2;
        this.f70b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7, types: [android.os.Handler] */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v9 */
    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        C1412a c1412a;
        Handler handler;
        Application application = null;
        ?? r5 = 1;
        r5 = 1;
        switch (this.f69a) {
            case 0:
                int i2 = MainActivity.f4973g0;
                MainActivity mainActivity = (MainActivity) this.f70b;
                if (mainActivity.isFinishing() || mainActivity.isDestroyed()) {
                    return;
                }
                new AlertDialog.Builder(mainActivity).setTitle("提示").setMessage("不支持银联，如需联系客服..").setPositiveButton("确定", (DialogInterface.OnClickListener) null).show();
                return;
            case 1:
                ((CarouselLayoutManager) this.f70b).m2366l0();
                return;
            case 2:
                View view = (View) this.f70b;
                ((InputMethodManager) AbstractC0001b.m4b(view.getContext(), InputMethodManager.class)).showSoftInput(view, 1);
                return;
            case 3:
                C0027i c0027i = (C0027i) this.f70b;
                C0417d c0417d = (C0417d) c0027i.f65b;
                if (c0417d != null) {
                    c0417d.m1090b((InterfaceC0415b) c0027i.f66c, (NavigationView) c0027i.f67d, true);
                    return;
                }
                return;
            case 4:
                C0091i c0091i = (C0091i) this.f70b;
                c0091i.f217c = false;
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) c0091i.f219e;
                C0506e c0506e = sideSheetBehavior.f3309i;
                if (c0506e != null && c0506e.m1257g()) {
                    c0091i.m283a(c0091i.f216b);
                    return;
                } else {
                    if (sideSheetBehavior.f3308h == 2) {
                        sideSheetBehavior.m2108w(c0091i.f216b);
                        return;
                    }
                    return;
                }
            case 5:
                ((C0558d) this.f70b).m1343t(true);
                return;
            case 6:
                C0564j c0564j = (C0564j) this.f70b;
                boolean zIsPopupShowing = c0564j.f1760h.isPopupShowing();
                c0564j.m1352t(zIsPopupShowing);
                c0564j.f1765m = zIsPopupShowing;
                return;
            case 7:
                ((TextInputLayout) this.f70b).f3362d.requestLayout();
                return;
            case 8:
                ((AbstractActivityC0874g) this.f70b).invalidateOptionsMenu();
                return;
            case 9:
                ExecutorC0644j executorC0644j = (ExecutorC0644j) this.f70b;
                Runnable runnable = executorC0644j.f1995b;
                if (runnable != null) {
                    runnable.run();
                    executorC0644j.f1995b = null;
                    return;
                }
                return;
            case 10:
                DialogC0873f.m2206a((DialogC0873f) this.f70b);
                return;
            case 11:
                C0675n c0675n = (C0675n) this.f70b;
                synchronized (c0675n.f2418d) {
                    try {
                        if (c0675n.f2422h == null) {
                            return;
                        }
                        try {
                            C0178h c0178hM1637b = c0675n.m1637b();
                            int i3 = c0178hM1637b.f649e;
                            if (i3 == 2) {
                                synchronized (c0675n.f2418d) {
                                }
                            }
                            if (i3 != 0) {
                                throw new RuntimeException("fetchFonts result is not OK. (" + i3 + ")");
                            }
                            try {
                                int i4 = AbstractC0160i.f538a;
                                Trace.beginSection("EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface");
                                C0511e c0511e = c0675n.f2417c;
                                Context context = c0675n.f2415a;
                                c0511e.getClass();
                                Typeface typefaceMo250w = AbstractC0077i.f179a.mo250w(context, new C0178h[]{c0178hM1637b}, 0);
                                MappedByteBuffer mappedByteBufferM2288U = AbstractC0901d.m2288U(c0675n.f2415a, c0178hM1637b.f645a);
                                if (mappedByteBufferM2288U == null || typefaceMo250w == null) {
                                    throw new RuntimeException("Unable to open file.");
                                }
                                try {
                                    Trace.beginSection("EmojiCompat.MetadataRepo.create");
                                    C0121k c0121k = new C0121k(typefaceMo250w, AbstractC0901d.m2300h0(mappedByteBufferM2288U));
                                    Trace.endSection();
                                    Trace.endSection();
                                    synchronized (c0675n.f2418d) {
                                        try {
                                            AbstractC0364l abstractC0364l = c0675n.f2422h;
                                            if (abstractC0364l != null) {
                                                abstractC0364l.mo1023X(c0121k);
                                            }
                                        } finally {
                                        }
                                    }
                                    c0675n.m1636a();
                                    return;
                                } finally {
                                    int i5 = AbstractC0160i.f538a;
                                    Trace.endSection();
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        } catch (Throwable th2) {
                            synchronized (c0675n.f2418d) {
                                try {
                                    AbstractC0364l abstractC0364l2 = c0675n.f2422h;
                                    if (abstractC0364l2 != null) {
                                        abstractC0364l2.mo1020U(th2);
                                    }
                                    c0675n.m1636a();
                                    return;
                                } finally {
                                }
                            }
                        }
                    } finally {
                    }
                }
            case 12:
                C0725B c0725b = (C0725B) this.f70b;
                AbstractC1326c.m3062e(c0725b, "this$0");
                int i6 = c0725b.f2683b;
                C0755t c0755t = c0725b.f2687f;
                if (i6 == 0) {
                    c0725b.f2684c = true;
                    c0755t.m1782d(EnumC0747l.ON_PAUSE);
                }
                if (c0725b.f2682a == 0 && c0725b.f2684c) {
                    c0755t.m1782d(EnumC0747l.ON_STOP);
                    c0725b.f2685d = true;
                    return;
                }
                return;
            case 13:
                ((AbstractC0838e) this.f70b).mo2143m();
                return;
            default:
                Activity activity = (Activity) this.f70b;
                if (activity.isFinishing()) {
                    return;
                }
                int i7 = Build.VERSION.SDK_INT;
                if (i7 >= 28) {
                    Class cls = AbstractC1413b.f6091a;
                    activity.recreate();
                    return;
                }
                Class cls2 = AbstractC1413b.f6091a;
                ?? r6 = 27;
                boolean z2 = i7 == 26 || i7 == 27;
                Method method = AbstractC1413b.f6096f;
                if ((!z2 || method != null) && (AbstractC1413b.f6095e != null || AbstractC1413b.f6094d != null)) {
                    try {
                        Object obj2 = AbstractC1413b.f6093c.get(activity);
                        if (obj2 != null && (obj = AbstractC1413b.f6092b.get(activity)) != null) {
                            Application application2 = activity.getApplication();
                            C1412a c1412a2 = new C1412a(activity);
                            application2.registerActivityLifecycleCallbacks(c1412a2);
                            Handler handler2 = AbstractC1413b.f6097g;
                            handler2.post(new RunnableC0005d(c1412a2, 7, obj2));
                            if (i7 != 26 && i7 != 27) {
                                r5 = 0;
                            }
                            try {
                                if (r5 != 0) {
                                    Handler handler3 = handler2;
                                    try {
                                        Boolean bool = Boolean.FALSE;
                                        application = application2;
                                        r6 = c1412a2;
                                        method.invoke(obj, obj2, null, null, 0, bool, null, null, bool, bool);
                                        r5 = handler3;
                                    } catch (Throwable th3) {
                                        th = th3;
                                        application = application2;
                                        c1412a = c1412a2;
                                        handler = handler3;
                                        handler.post(new RunnableC0005d(application, 8, c1412a));
                                        throw th;
                                    }
                                } else {
                                    application = application2;
                                    r6 = c1412a2;
                                    r5 = handler2;
                                    activity.recreate();
                                }
                                r5.post(new RunnableC0005d(application, 8, (Object) r6));
                                return;
                            } catch (Throwable th4) {
                                th = th4;
                                handler = r5;
                                c1412a = r6;
                            }
                        }
                    } catch (Throwable unused) {
                    }
                }
                activity.recreate();
                return;
        }
    }
}
