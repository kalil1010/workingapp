package p033L1;

import android.app.Activity;
import android.app.AppOpsManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.Process;
import android.os.Trace;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewParent;
import android.widget.ImageView;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.IDN;
import java.net.InetAddress;
import java.security.cert.Certificate;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import p000A.AbstractC0001b;
import p003B.C0051g;
import p006C.AbstractC0069a;
import p009D.AbstractC0098a;
import p011D1.C0117g;
import p011D1.C0121k;
import p011D1.C0122l;
import p011D1.C0123m;
import p011D1.EnumC0110B;
import p011D1.EnumC0131u;
import p014E1.AbstractC0145b;
import p020H.C0178h;
import p028K.AbstractC0230E;
import p028K.AbstractC0241P;
import p028K.InterfaceC0249Y;
import p029K0.C0301a;
import p045Q.InterfaceC0446j;
import p050R1.C0477e;
import p050R1.C0479g;
import p055T0.C0510d;
import p055T0.C0511e;
import p055T0.C0512f;
import p055T0.C0513g;
import p055T0.C0515i;
import p090e.AbstractActivityC0874g;
import p093e2.AbstractC0901d;
import p105j.AbstractC1115n1;
import p105j.ViewOnLongClickListenerC1121p1;
import p106j0.AbstractC1175x;
import p110k1.C1215q;
import p122p.AbstractFutureC1263g;
import p122p.C1259c;
import p122p.C1262f;
import p131s1.AbstractC1326c;
import p140v1.C1378a;
import p140v1.C1380c;
import p149y1.AbstractC1411i;
import p150z.AbstractC1414c;
import p150z.AbstractC1415d;

/* renamed from: L1.l */
/* loaded from: classes.dex */
public abstract class AbstractC0364l implements InterfaceC0249Y, InterfaceC0446j {

    /* renamed from: a */
    public static long f1124a = 0;

    /* renamed from: b */
    public static Method f1125b = null;

    /* renamed from: c */
    public static boolean f1126c = true;

    /* renamed from: d */
    public static Field f1127d;

    /* renamed from: e */
    public static boolean f1128e;

    public AbstractC0364l() {
        new ConcurrentHashMap();
    }

    /* renamed from: B */
    public static C0123m m980B(SSLSession sSLSession) throws IOException {
        Certificate[] peerCertificates;
        List listM400m = C1215q.f4904a;
        String cipherSuite = sSLSession.getCipherSuite();
        if (cipherSuite == null) {
            throw new IllegalStateException("cipherSuite == null");
        }
        int iHashCode = cipherSuite.hashCode();
        if (iHashCode == 1019404634 ? cipherSuite.equals("TLS_NULL_WITH_NULL_NULL") : iHashCode == 1208658923 && cipherSuite.equals("SSL_NULL_WITH_NULL_NULL")) {
            throw new IOException("cipherSuite == ".concat(cipherSuite));
        }
        C0117g c0117gM324d = C0117g.f327t.m324d(cipherSuite);
        String protocol = sSLSession.getProtocol();
        if (protocol == null) {
            throw new IllegalStateException("tlsVersion == null");
        }
        if ("NONE".equals(protocol)) {
            throw new IOException("tlsVersion == NONE");
        }
        EnumC0110B enumC0110BM966p = AbstractC0356d.m966p(protocol);
        try {
            peerCertificates = sSLSession.getPeerCertificates();
        } catch (SSLPeerUnverifiedException unused) {
        }
        List listM400m2 = peerCertificates != null ? AbstractC0145b.m400m((Certificate[]) Arrays.copyOf(peerCertificates, peerCertificates.length)) : listM400m;
        Certificate[] localCertificates = sSLSession.getLocalCertificates();
        if (localCertificates != null) {
            listM400m = AbstractC0145b.m400m((Certificate[]) Arrays.copyOf(localCertificates, localCertificates.length));
        }
        return new C0123m(enumC0110BM966p, c0117gM324d, listM400m, new C0122l(0, listM400m2));
    }

    /* renamed from: C */
    public static EnumC0131u m981C(String str) throws IOException {
        if (str.equals("http/1.0")) {
            return EnumC0131u.HTTP_1_0;
        }
        if (str.equals("http/1.1")) {
            return EnumC0131u.HTTP_1_1;
        }
        if (str.equals("h2_prior_knowledge")) {
            return EnumC0131u.H2_PRIOR_KNOWLEDGE;
        }
        if (str.equals("h2")) {
            return EnumC0131u.HTTP_2;
        }
        if (str.equals("spdy/3.1")) {
            return EnumC0131u.SPDY_3;
        }
        if (str.equals("quic")) {
            return EnumC0131u.QUIC;
        }
        throw new IOException("Unexpected protocol: ".concat(str));
    }

    /* renamed from: F */
    public static int m982F(Context context, int i2, int i3) {
        Integer numValueOf;
        TypedValue typedValueM995b0 = m995b0(context, i2);
        if (typedValueM995b0 != null) {
            int i4 = typedValueM995b0.resourceId;
            numValueOf = Integer.valueOf(i4 != 0 ? AbstractC0001b.m3a(context, i4) : typedValueM995b0.data);
        } else {
            numValueOf = null;
        }
        return numValueOf != null ? numValueOf.intValue() : i3;
    }

    /* renamed from: G */
    public static int m983G(View view, int i2) {
        Context context = view.getContext();
        TypedValue typedValueM997d0 = m997d0(view.getContext(), i2, view.getClass().getCanonicalName());
        int i3 = typedValueM997d0.resourceId;
        return i3 != 0 ? AbstractC0001b.m3a(context, i3) : typedValueM997d0.data;
    }

    /* renamed from: H */
    public static Intent m984H(AbstractActivityC0874g abstractActivityC0874g) {
        Intent parentActivityIntent = abstractActivityC0874g.getParentActivityIntent();
        if (parentActivityIntent != null) {
            return parentActivityIntent;
        }
        try {
            String strM986J = m986J(abstractActivityC0874g, abstractActivityC0874g.getComponentName());
            if (strM986J == null) {
                return null;
            }
            ComponentName componentName = new ComponentName(abstractActivityC0874g, strM986J);
            try {
                return m986J(abstractActivityC0874g, componentName) == null ? Intent.makeMainActivity(componentName) : new Intent().setComponent(componentName);
            } catch (PackageManager.NameNotFoundException unused) {
                return null;
            }
        } catch (PackageManager.NameNotFoundException e3) {
            throw new IllegalArgumentException(e3);
        }
    }

    /* renamed from: I */
    public static Intent m985I(AbstractActivityC0874g abstractActivityC0874g, ComponentName componentName) throws PackageManager.NameNotFoundException {
        String strM986J = m986J(abstractActivityC0874g, componentName);
        if (strM986J == null) {
            return null;
        }
        ComponentName componentName2 = new ComponentName(componentName.getPackageName(), strM986J);
        return m986J(abstractActivityC0874g, componentName2) == null ? Intent.makeMainActivity(componentName2) : new Intent().setComponent(componentName2);
    }

    /* renamed from: J */
    public static String m986J(Activity activity, ComponentName componentName) throws PackageManager.NameNotFoundException {
        String string;
        ActivityInfo activityInfo = activity.getPackageManager().getActivityInfo(componentName, Build.VERSION.SDK_INT >= 29 ? 269222528 : 787072);
        String str = activityInfo.parentActivityName;
        if (str != null) {
            return str;
        }
        Bundle bundle = activityInfo.metaData;
        if (bundle == null || (string = bundle.getString("android.support.PARENT_ACTIVITY")) == null) {
            return null;
        }
        if (string.charAt(0) != '.') {
            return string;
        }
        return activity.getPackageName() + string;
    }

    /* renamed from: M */
    public static boolean m987M(int i2, Rect rect, Rect rect2) {
        if (i2 == 17) {
            int i3 = rect.right;
            int i4 = rect2.right;
            return (i3 > i4 || rect.left >= i4) && rect.left > rect2.left;
        }
        if (i2 == 33) {
            int i5 = rect.bottom;
            int i6 = rect2.bottom;
            return (i5 > i6 || rect.top >= i6) && rect.top > rect2.top;
        }
        if (i2 == 66) {
            int i7 = rect.left;
            int i8 = rect2.left;
            return (i7 < i8 || rect.right <= i8) && rect.right < rect2.right;
        }
        if (i2 != 130) {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
        int i9 = rect.top;
        int i10 = rect2.top;
        return (i9 < i10 || rect.bottom <= i10) && rect.bottom < rect2.bottom;
    }

    /* renamed from: N */
    public static boolean m988N(int i2) {
        if (i2 == 0) {
            return false;
        }
        ThreadLocal threadLocal = AbstractC0069a.f170a;
        double[] dArr = (double[]) threadLocal.get();
        if (dArr == null) {
            dArr = new double[3];
            threadLocal.set(dArr);
        }
        int iRed = Color.red(i2);
        int iGreen = Color.green(i2);
        int iBlue = Color.blue(i2);
        if (dArr.length != 3) {
            throw new IllegalArgumentException("outXyz must have a length of 3.");
        }
        double d3 = iRed / 255.0d;
        double dPow = d3 < 0.04045d ? d3 / 12.92d : Math.pow((d3 + 0.055d) / 1.055d, 2.4d);
        double d4 = iGreen / 255.0d;
        double dPow2 = d4 < 0.04045d ? d4 / 12.92d : Math.pow((d4 + 0.055d) / 1.055d, 2.4d);
        double d5 = iBlue / 255.0d;
        double dPow3 = d5 < 0.04045d ? d5 / 12.92d : Math.pow((d5 + 0.055d) / 1.055d, 2.4d);
        dArr[0] = ((0.1805d * dPow3) + (0.3576d * dPow2) + (0.4124d * dPow)) * 100.0d;
        double d6 = ((0.0722d * dPow3) + (0.7152d * dPow2) + (0.2126d * dPow)) * 100.0d;
        dArr[1] = d6;
        dArr[2] = ((dPow3 * 0.9505d) + (dPow2 * 0.1192d) + (dPow * 0.0193d)) * 100.0d;
        return d6 / 100.0d > 0.5d;
    }

    /* renamed from: O */
    public static boolean m989O() {
        try {
            if (f1125b == null) {
                return Trace.isEnabled();
            }
        } catch (NoClassDefFoundError | NoSuchMethodError unused) {
        }
        try {
            if (f1125b == null) {
                f1124a = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                f1125b = Trace.class.getMethod("isTagEnabled", Long.TYPE);
            }
            return ((Boolean) f1125b.invoke(null, Long.valueOf(f1124a))).booleanValue();
        } catch (Exception e3) {
            if (!(e3 instanceof InvocationTargetException)) {
                return false;
            }
            Throwable cause = e3.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            throw new RuntimeException(cause);
        }
    }

    /* renamed from: Q */
    public static int m990Q(int i2, int i3, float f) {
        return AbstractC0069a.m193b(AbstractC0069a.m195d(i3, Math.round(Color.alpha(i3) * f)), i2);
    }

    /* renamed from: R */
    public static int m991R(int i2, Rect rect, Rect rect2) {
        int i3;
        int i4;
        if (i2 == 17) {
            i3 = rect.left;
            i4 = rect2.right;
        } else if (i2 == 33) {
            i3 = rect.top;
            i4 = rect2.bottom;
        } else if (i2 == 66) {
            i3 = rect2.left;
            i4 = rect.right;
        } else {
            if (i2 != 130) {
                throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
            }
            i3 = rect2.top;
            i4 = rect.bottom;
        }
        return Math.max(0, i3 - i4);
    }

    /* renamed from: S */
    public static Typeface m992S(Configuration configuration, Typeface typeface) {
        if (Build.VERSION.SDK_INT < 31 || configuration.fontWeightAdjustment == Integer.MAX_VALUE || configuration.fontWeightAdjustment == 0 || typeface == null) {
            return null;
        }
        return Typeface.create(typeface, AbstractC0901d.m2299h(configuration.fontWeightAdjustment + typeface.getWeight(), 1, 1000), typeface.isItalic());
    }

    /* renamed from: T */
    public static int m993T(int i2, Rect rect, Rect rect2) {
        if (i2 != 17) {
            if (i2 != 33) {
                if (i2 != 66) {
                    if (i2 != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            return Math.abs(((rect.width() / 2) + rect.left) - ((rect2.width() / 2) + rect2.left));
        }
        return Math.abs(((rect.height() / 2) + rect.top) - ((rect2.height() / 2) + rect2.top));
    }

    /* renamed from: a0 */
    public static void m994a0(TextInputLayout textInputLayout, CheckableImageButton checkableImageButton, ColorStateList colorStateList) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (checkableImageButton.getDrawable() == null || colorStateList == null || !colorStateList.isStateful()) {
            return;
        }
        int[] drawableState = textInputLayout.getDrawableState();
        int[] drawableState2 = checkableImageButton.getDrawableState();
        int length = drawableState.length;
        int[] iArrCopyOf = Arrays.copyOf(drawableState, drawableState.length + drawableState2.length);
        System.arraycopy(drawableState2, 0, iArrCopyOf, length, drawableState2.length);
        int colorForState = colorStateList.getColorForState(iArrCopyOf, colorStateList.getDefaultColor());
        Drawable drawableMutate = drawable.mutate();
        AbstractC0098a.m300h(drawableMutate, ColorStateList.valueOf(colorForState));
        checkableImageButton.setImageDrawable(drawableMutate);
    }

    /* renamed from: b0 */
    public static TypedValue m995b0(Context context, int i2) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(i2, typedValue, true)) {
            return typedValue;
        }
        return null;
    }

    /* renamed from: c0 */
    public static boolean m996c0(Context context, int i2, boolean z2) {
        TypedValue typedValueM995b0 = m995b0(context, i2);
        return (typedValueM995b0 == null || typedValueM995b0.type != 18) ? z2 : typedValueM995b0.data != 0;
    }

    /* renamed from: d0 */
    public static TypedValue m997d0(Context context, int i2, String str) {
        TypedValue typedValueM995b0 = m995b0(context, i2);
        if (typedValueM995b0 != null) {
            return typedValueM995b0;
        }
        throw new IllegalArgumentException(String.format("%1$s requires a value for the %2$s attribute to be set in your app theme. You can either set the attribute in your theme or update your theme to inherit from Theme.MaterialComponents (or a descendant).", str, context.getResources().getResourceName(i2)));
    }

    /* renamed from: e0 */
    public static void m998e0(CheckableImageButton checkableImageButton, View.OnLongClickListener onLongClickListener) {
        WeakHashMap weakHashMap = AbstractC0241P.f815a;
        boolean zHasOnClickListeners = checkableImageButton.hasOnClickListeners();
        boolean z2 = onLongClickListener != null;
        boolean z3 = zHasOnClickListeners || z2;
        checkableImageButton.setFocusable(z3);
        checkableImageButton.setClickable(zHasOnClickListeners);
        checkableImageButton.setPressable(zHasOnClickListeners);
        checkableImageButton.setLongClickable(z2);
        checkableImageButton.setImportantForAccessibility(z3 ? 1 : 2);
    }

    /* renamed from: f0 */
    public static void m999f0(View view, C0513g c0513g) {
        C0301a c0301a = c0513g.f1601a.f1585b;
        if (c0301a == null || !c0301a.f922a) {
            return;
        }
        float fM626i = 0.0f;
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            WeakHashMap weakHashMap = AbstractC0241P.f815a;
            fM626i += AbstractC0230E.m626i((View) parent);
        }
        C0512f c0512f = c0513g.f1601a;
        if (c0512f.f1595l != fM626i) {
            c0512f.f1595l = fM626i;
            c0513g.m1293m();
        }
    }

    /* renamed from: g0 */
    public static void m1000g0(View view, CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            AbstractC1115n1.m2731a(view, charSequence);
            return;
        }
        ViewOnLongClickListenerC1121p1 viewOnLongClickListenerC1121p1 = ViewOnLongClickListenerC1121p1.f4594k;
        if (viewOnLongClickListenerC1121p1 != null && viewOnLongClickListenerC1121p1.f4596a == view) {
            ViewOnLongClickListenerC1121p1.m2735b(null);
        }
        if (!TextUtils.isEmpty(charSequence)) {
            new ViewOnLongClickListenerC1121p1(view, charSequence);
            return;
        }
        ViewOnLongClickListenerC1121p1 viewOnLongClickListenerC1121p12 = ViewOnLongClickListenerC1121p1.f4595l;
        if (viewOnLongClickListenerC1121p12 != null && viewOnLongClickListenerC1121p12.f4596a == view) {
            viewOnLongClickListenerC1121p12.m2736a();
        }
        view.setOnLongClickListener(null);
        view.setLongClickable(false);
        view.setOnHoverListener(null);
    }

    /* renamed from: h */
    public static void m1001h(TextInputLayout textInputLayout, CheckableImageButton checkableImageButton, ColorStateList colorStateList, PorterDuff.Mode mode) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (drawable != null) {
            drawable = drawable.mutate();
            if (colorStateList == null || !colorStateList.isStateful()) {
                AbstractC0098a.m300h(drawable, colorStateList);
            } else {
                int[] drawableState = textInputLayout.getDrawableState();
                int[] drawableState2 = checkableImageButton.getDrawableState();
                int length = drawableState.length;
                int[] iArrCopyOf = Arrays.copyOf(drawableState, drawableState.length + drawableState2.length);
                System.arraycopy(drawableState2, 0, iArrCopyOf, length, drawableState2.length);
                AbstractC0098a.m300h(drawable, ColorStateList.valueOf(colorStateList.getColorForState(iArrCopyOf, colorStateList.getDefaultColor())));
            }
            if (mode != null) {
                AbstractC0098a.m301i(drawable, mode);
            }
        }
        if (checkableImageButton.getDrawable() != drawable) {
            checkableImageButton.setImageDrawable(drawable);
        }
    }

    /* renamed from: i */
    public static C0477e m1002i() throws InterruptedException {
        C0477e c0477e = C0477e.f1468j;
        AbstractC1326c.m3059b(c0477e);
        C0477e c0477e2 = c0477e.f1470f;
        if (c0477e2 == null) {
            long jNanoTime = System.nanoTime();
            C0477e.class.wait(C0477e.f1466h);
            C0477e c0477e3 = C0477e.f1468j;
            AbstractC1326c.m3059b(c0477e3);
            if (c0477e3.f1470f != null || System.nanoTime() - jNanoTime < C0477e.f1467i) {
                return null;
            }
            return C0477e.f1468j;
        }
        long jNanoTime2 = c0477e2.f1471g - System.nanoTime();
        if (jNanoTime2 > 0) {
            long j2 = jNanoTime2 / 1000000;
            C0477e.class.wait(j2, (int) (jNanoTime2 - (1000000 * j2)));
            return null;
        }
        C0477e c0477e4 = C0477e.f1468j;
        AbstractC1326c.m3059b(c0477e4);
        c0477e4.f1470f = c0477e2.f1470f;
        c0477e2.f1470f = null;
        return c0477e2;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0042  */
    /* renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean m1003j(int r8, android.graphics.Rect r9, android.graphics.Rect r10, android.graphics.Rect r11) {
        /*
            boolean r0 = m1005k(r8, r9, r10)
            boolean r1 = m1005k(r8, r9, r11)
            if (r1 != 0) goto L75
            if (r0 != 0) goto Le
            goto L75
        Le:
            java.lang.String r0 = "direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}."
            r1 = 130(0x82, float:1.82E-43)
            r2 = 33
            r3 = 66
            r4 = 17
            r5 = 1
            if (r8 == r4) goto L3c
            if (r8 == r2) goto L35
            if (r8 == r3) goto L2e
            if (r8 != r1) goto L28
            int r6 = r9.bottom
            int r7 = r11.top
            if (r6 > r7) goto L74
            goto L42
        L28:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            r8.<init>(r0)
            throw r8
        L2e:
            int r6 = r9.right
            int r7 = r11.left
            if (r6 > r7) goto L74
            goto L42
        L35:
            int r6 = r9.top
            int r7 = r11.bottom
            if (r6 < r7) goto L74
            goto L42
        L3c:
            int r6 = r9.left
            int r7 = r11.right
            if (r6 < r7) goto L74
        L42:
            if (r8 == r4) goto L74
            if (r8 != r3) goto L47
            goto L74
        L47:
            int r10 = m991R(r8, r9, r10)
            if (r8 == r4) goto L69
            if (r8 == r2) goto L64
            if (r8 == r3) goto L5f
            if (r8 != r1) goto L59
            int r8 = r11.bottom
            int r9 = r9.bottom
        L57:
            int r8 = r8 - r9
            goto L6e
        L59:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            r8.<init>(r0)
            throw r8
        L5f:
            int r8 = r11.right
            int r9 = r9.right
            goto L57
        L64:
            int r8 = r9.top
            int r9 = r11.top
            goto L57
        L69:
            int r8 = r9.left
            int r9 = r11.left
            goto L57
        L6e:
            int r8 = java.lang.Math.max(r5, r8)
            if (r10 >= r8) goto L75
        L74:
            return r5
        L75:
            r8 = 0
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p033L1.AbstractC0364l.m1003j(int, android.graphics.Rect, android.graphics.Rect, android.graphics.Rect):boolean");
    }

    /* renamed from: j0 */
    public static C1378a m1004j0(C1378a c1378a, int i2) {
        AbstractC1326c.m3062e(c1378a, "<this>");
        boolean z2 = i2 > 0;
        Integer numValueOf = Integer.valueOf(i2);
        if (z2) {
            if (c1378a.f5991c <= 0) {
                i2 = -i2;
            }
            return new C1378a(c1378a.f5989a, c1378a.f5990b, i2);
        }
        throw new IllegalArgumentException("Step must be positive, was: " + numValueOf + '.');
    }

    /* renamed from: k */
    public static boolean m1005k(int i2, Rect rect, Rect rect2) {
        if (i2 != 17) {
            if (i2 != 33) {
                if (i2 != 66) {
                    if (i2 != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            return rect2.right >= rect.left && rect2.left <= rect.right;
        }
        return rect2.bottom >= rect.top && rect2.top <= rect.bottom;
    }

    /* renamed from: k0 */
    public static final String m1006k0(String str) {
        AbstractC1326c.m3062e(str, "$this$toCanonicalHost");
        int i2 = 0;
        int i3 = -1;
        if (!AbstractC1411i.m3173N(str, ":")) {
            try {
                String ascii = IDN.toASCII(str);
                AbstractC1326c.m3061d(ascii, "IDN.toASCII(host)");
                Locale locale = Locale.US;
                AbstractC1326c.m3061d(locale, "Locale.US");
                String lowerCase = ascii.toLowerCase(locale);
                AbstractC1326c.m3061d(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
                if (lowerCase.length() == 0) {
                    return null;
                }
                int length = lowerCase.length();
                for (int i4 = 0; i4 < length; i4++) {
                    char cCharAt = lowerCase.charAt(i4);
                    if (AbstractC1326c.m3063f(cCharAt, 31) <= 0 || AbstractC1326c.m3063f(cCharAt, 127) >= 0 || AbstractC1411i.m3177R(" #%/:?@[\\]", cCharAt, 0, 6) != -1) {
                        return null;
                    }
                }
                return lowerCase;
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }
        InetAddress inetAddressM1014z = (AbstractC1411i.m3188c0(str, "[", false) && str.endsWith("]")) ? m1014z(str, 1, str.length() - 1) : m1014z(str, 0, str.length());
        if (inetAddressM1014z == null) {
            return null;
        }
        byte[] address = inetAddressM1014z.getAddress();
        if (address.length != 16) {
            if (address.length == 4) {
                return inetAddressM1014z.getHostAddress();
            }
            throw new AssertionError("Invalid IPv6 address: '" + str + '\'');
        }
        int i5 = 0;
        int i6 = 0;
        while (i5 < address.length) {
            int i7 = i5;
            while (i7 < 16 && address[i7] == 0 && address[i7 + 1] == 0) {
                i7 += 2;
            }
            int i8 = i7 - i5;
            if (i8 > i6 && i8 >= 4) {
                i3 = i5;
                i6 = i8;
            }
            i5 = i7 + 2;
        }
        C0479g c0479g = new C0479g();
        while (i2 < address.length) {
            if (i2 == i3) {
                c0479g.m1194z(58);
                i2 += i6;
                if (i2 == 16) {
                    c0479g.m1194z(58);
                }
            } else {
                if (i2 > 0) {
                    c0479g.m1194z(58);
                }
                byte b = address[i2];
                byte[] bArr = AbstractC0145b.f495a;
                c0479g.m1166A(((b & 255) << 8) | (address[i2 + 1] & 255));
                i2 += 2;
            }
        }
        return c0479g.m1186r();
    }

    /* renamed from: l0 */
    public static C1380c m1007l0(int i2, int i3) {
        if (i3 > Integer.MIN_VALUE) {
            return new C1380c(i2, i3 - 1, 1);
        }
        C1380c c1380c = C1380c.f5996d;
        return C1380c.f5996d;
    }

    /* renamed from: o */
    public static void m1008o(String str, boolean z2) {
        if (!z2) {
            throw new IllegalArgumentException(str);
        }
    }

    /* renamed from: p */
    public static void m1009p(int i2) {
        if (i2 < 0) {
            throw new IllegalArgumentException();
        }
    }

    /* renamed from: q */
    public static void m1010q(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    /* renamed from: r */
    public static int m1011r(Context context, String str) {
        int iM3194c;
        int iMyPid = Process.myPid();
        int iMyUid = Process.myUid();
        String packageName = context.getPackageName();
        if (context.checkPermission(str, iMyPid, iMyUid) != -1) {
            String strM3195d = AbstractC1414c.m3195d(str);
            if (strM3195d != null) {
                if (packageName == null) {
                    String[] packagesForUid = context.getPackageManager().getPackagesForUid(iMyUid);
                    if (packagesForUid != null && packagesForUid.length > 0) {
                        packageName = packagesForUid[0];
                    }
                }
                int iMyUid2 = Process.myUid();
                String packageName2 = context.getPackageName();
                if (iMyUid2 == iMyUid && Objects.equals(packageName2, packageName) && Build.VERSION.SDK_INT >= 29) {
                    AppOpsManager appOpsManagerM3198c = AbstractC1415d.m3198c(context);
                    iM3194c = AbstractC1415d.m3196a(appOpsManagerM3198c, strM3195d, Binder.getCallingUid(), packageName);
                    if (iM3194c == 0) {
                        iM3194c = AbstractC1415d.m3196a(appOpsManagerM3198c, strM3195d, iMyUid, AbstractC1415d.m3197b(context));
                    }
                } else {
                    iM3194c = AbstractC1414c.m3194c((AppOpsManager) AbstractC1414c.m3192a(context, AppOpsManager.class), strM3195d, packageName);
                }
                if (iM3194c != 0) {
                    return -2;
                }
            }
            return 0;
        }
        return -1;
    }

    /* renamed from: t */
    public static ImageView.ScaleType m1012t(int i2) {
        return i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 5 ? i2 != 6 ? ImageView.ScaleType.CENTER : ImageView.ScaleType.CENTER_INSIDE : ImageView.ScaleType.CENTER_CROP : ImageView.ScaleType.FIT_END : ImageView.ScaleType.FIT_CENTER : ImageView.ScaleType.FIT_START : ImageView.ScaleType.FIT_XY;
    }

    /* renamed from: u */
    public static AbstractC0356d m1013u(int i2) {
        return i2 != 0 ? i2 != 1 ? new C0515i() : new C0510d() : new C0515i();
    }

    /* JADX WARN: Code restructure failed: missing block: B:65:0x00cc, code lost:
    
        if (r7 == 16) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00ce, code lost:
    
        if (r8 != (-1)) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00d2, code lost:
    
        r0 = r7 - r8;
        java.lang.System.arraycopy(r3, r8, r3, 16 - r0, r0);
        java.util.Arrays.fill(r3, r8, (16 - r7) + r8, (byte) 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x00e3, code lost:
    
        return java.net.InetAddress.getByAddress(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:?, code lost:
    
        return null;
     */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00a2  */
    /* renamed from: z */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.net.InetAddress m1014z(java.lang.String r17, int r18, int r19) {
        /*
            Method dump skipped, instructions count: 228
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p033L1.AbstractC0364l.m1014z(java.lang.String, int, int):java.net.InetAddress");
    }

    /* renamed from: A */
    public C0178h mo263A(int i2, C0178h[] c0178hArr) {
        new C0511e(1);
        int i3 = (i2 & 1) == 0 ? 400 : 700;
        boolean z2 = (i2 & 2) != 0;
        C0178h c0178h = null;
        int i4 = Integer.MAX_VALUE;
        for (C0178h c0178h2 : c0178hArr) {
            int iAbs = (Math.abs(c0178h2.f647c - i3) * 2) + (c0178h2.f648d == z2 ? 0 : 1);
            if (c0178h == null || i4 > iAbs) {
                c0178h = c0178h2;
                i4 = iAbs;
            }
        }
        return c0178h;
    }

    /* renamed from: D */
    public abstract Method mo1015D(Class cls, Field field);

    /* renamed from: E */
    public abstract Constructor mo1016E(Class cls);

    /* renamed from: K */
    public abstract String[] mo1017K(Class cls);

    /* renamed from: L */
    public float mo1018L(View view) {
        if (f1126c) {
            try {
                return AbstractC1175x.m2824a(view);
            } catch (NoSuchMethodError unused) {
                f1126c = false;
            }
        }
        return view.getAlpha();
    }

    /* renamed from: P */
    public abstract boolean mo1019P(Class cls);

    /* renamed from: U */
    public abstract void mo1020U(Throwable th);

    /* renamed from: V */
    public abstract View mo1021V(int i2);

    /* renamed from: W */
    public abstract boolean mo1022W();

    /* renamed from: X */
    public abstract void mo1023X(C0121k c0121k);

    /* renamed from: Y */
    public abstract void mo1024Y(C1262f c1262f, C1262f c1262f2);

    /* renamed from: Z */
    public abstract void mo1025Z(C1262f c1262f, Thread thread);

    @Override // p028K.InterfaceC0249Y
    /* renamed from: d */
    public void mo723d() {
    }

    @Override // p028K.InterfaceC0249Y
    /* renamed from: g */
    public void mo724g() {
    }

    /* renamed from: h0 */
    public void mo1026h0(View view, float f) {
        if (f1126c) {
            try {
                AbstractC1175x.m2825b(view, f);
                return;
            } catch (NoSuchMethodError unused) {
                f1126c = false;
            }
        }
        view.setAlpha(f);
    }

    /* renamed from: i0 */
    public void mo1027i0(View view, int i2) throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        if (!f1128e) {
            try {
                Field declaredField = View.class.getDeclaredField("mViewFlags");
                f1127d = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            f1128e = true;
        }
        Field field = f1127d;
        if (field != null) {
            try {
                f1127d.setInt(view, i2 | (field.getInt(view) & (-13)));
            } catch (IllegalAccessException unused2) {
            }
        }
    }

    /* renamed from: l */
    public abstract boolean mo1028l(AbstractFutureC1263g abstractFutureC1263g, C1259c c1259c);

    /* renamed from: m */
    public abstract boolean mo1029m(AbstractFutureC1263g abstractFutureC1263g, Object obj, Object obj2);

    /* renamed from: n */
    public abstract boolean mo1030n(AbstractFutureC1263g abstractFutureC1263g, C1262f c1262f, C1262f c1262f2);

    /* renamed from: s */
    public abstract List mo1031s(List list, String str);

    /* renamed from: v */
    public abstract Typeface mo249v(Context context, C0051g c0051g, Resources resources, int i2);

    /* renamed from: w */
    public abstract Typeface mo250w(Context context, C0178h[] c0178hArr, int i2);

    /* renamed from: x */
    public Typeface mo264x(Context context, InputStream inputStream) {
        File fileM2281I = AbstractC0901d.m2281I(context);
        if (fileM2281I == null) {
            return null;
        }
        try {
            if (AbstractC0901d.m2308n(fileM2281I, inputStream)) {
                return Typeface.createFromFile(fileM2281I.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            fileM2281I.delete();
        }
    }

    /* renamed from: y */
    public Typeface mo260y(Context context, Resources resources, int i2, String str, int i3) {
        File fileM2281I = AbstractC0901d.m2281I(context);
        if (fileM2281I == null) {
            return null;
        }
        try {
            if (AbstractC0901d.m2307m(fileM2281I, resources, i2)) {
                return Typeface.createFromFile(fileM2281I.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            fileM2281I.delete();
        }
    }
}
