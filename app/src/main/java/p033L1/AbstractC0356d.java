package p033L1;

import android.app.ActionBar;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.Signature;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.PasswordTransformationMethod;
import android.util.Log;
import android.util.SparseArray;
import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import android.widget.TextView;
import androidx.emoji2.text.AbstractC0668g;
import androidx.emoji2.text.C0664c;
import androidx.emoji2.text.C0675n;
import androidx.emoji2.text.C0676o;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.Locale;
import java.util.WeakHashMap;
import java.util.regex.Matcher;
import p003B.C0048d;
import p006C.C0076h;
import p009D.AbstractC0098a;
import p011D1.C0128r;
import p011D1.C0132v;
import p011D1.EnumC0110B;
import p011D1.EnumC0131u;
import p019G1.AbstractC0167a;
import p019G1.C0169c;
import p019G1.C0170d;
import p022I.C0202e;
import p028K.AbstractC0241P;
import p028K.C0240O;
import p028K.InterfaceC0271k;
import p045Q.AbstractC0449m;
import p045Q.AbstractC0450n;
import p045Q.AbstractC0451o;
import p045Q.ActionModeCallbackC0452p;
import p050R1.C0479g;
import p050R1.C0482j;
import p055T0.C0511e;
import p055T0.C0527u;
import p094f0.AbstractC0911J;
import p094f0.C0923W;
import p105j.C1081c0;
import p106j0.AbstractC1173v;
import p110k1.C1199a;
import p131s1.AbstractC1326c;
import p131s1.InterfaceC1324a;
import p143w1.InterfaceC1387a;
import p149y1.AbstractC1411i;
import tkbmmn.ghwbbf.irvjzy.R;

/* renamed from: L1.d */
/* loaded from: classes.dex */
public abstract class AbstractC0356d {

    /* renamed from: a */
    public static boolean f1097a = false;

    /* renamed from: b */
    public static Method f1098b = null;

    /* renamed from: c */
    public static boolean f1099c = false;

    /* renamed from: d */
    public static Field f1100d = null;

    /* renamed from: e */
    public static Field f1101e = null;

    /* renamed from: f */
    public static boolean f1102f = false;

    /* renamed from: g */
    public static Class f1103g = null;

    /* renamed from: h */
    public static boolean f1104h = false;

    /* renamed from: i */
    public static Field f1105i = null;

    /* renamed from: j */
    public static boolean f1106j = false;

    /* renamed from: k */
    public static Field f1107k = null;

    /* renamed from: l */
    public static boolean f1108l = false;

    /* renamed from: m */
    public static boolean f1109m = true;

    /* renamed from: A */
    public static C0048d m942A(String str) throws ProtocolException, NumberFormatException {
        int i2;
        String strSubstring;
        AbstractC1326c.m3062e(str, "statusLine");
        boolean zM3188c0 = AbstractC1411i.m3188c0(str, "HTTP/1.", false);
        EnumC0131u enumC0131u = EnumC0131u.HTTP_1_0;
        if (zM3188c0) {
            i2 = 9;
            if (str.length() < 9 || str.charAt(8) != ' ') {
                throw new ProtocolException("Unexpected status line: ".concat(str));
            }
            int iCharAt = str.charAt(7) - '0';
            if (iCharAt != 0) {
                if (iCharAt != 1) {
                    throw new ProtocolException("Unexpected status line: ".concat(str));
                }
                enumC0131u = EnumC0131u.HTTP_1_1;
            }
        } else {
            if (!AbstractC1411i.m3188c0(str, "ICY ", false)) {
                throw new ProtocolException("Unexpected status line: ".concat(str));
            }
            i2 = 4;
        }
        int i3 = i2 + 3;
        if (str.length() < i3) {
            throw new ProtocolException("Unexpected status line: ".concat(str));
        }
        try {
            String strSubstring2 = str.substring(i2, i3);
            AbstractC1326c.m3061d(strSubstring2, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            int i4 = Integer.parseInt(strSubstring2);
            if (str.length() <= i3) {
                strSubstring = "";
            } else {
                if (str.charAt(i3) != ' ') {
                    throw new ProtocolException("Unexpected status line: ".concat(str));
                }
                strSubstring = str.substring(i2 + 4);
                AbstractC1326c.m3061d(strSubstring, "(this as java.lang.String).substring(startIndex)");
            }
            return new C0048d(enumC0131u, i4, strSubstring);
        } catch (NumberFormatException unused) {
            throw new ProtocolException("Unexpected status line: ".concat(str));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00a6  */
    /* renamed from: B */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static long m943B(java.lang.String r14, int r15) throws java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 336
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p033L1.AbstractC0356d.m943B(java.lang.String, int):long");
    }

    /* renamed from: E */
    public static void m944E(TextView textView, int i2) {
        AbstractC0364l.m1009p(i2);
        if (Build.VERSION.SDK_INT >= 28) {
            AbstractC0451o.m1137d(textView, i2);
            return;
        }
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i3 = textView.getIncludeFontPadding() ? fontMetricsInt.top : fontMetricsInt.ascent;
        if (i2 > Math.abs(i3)) {
            textView.setPadding(textView.getPaddingLeft(), i2 + i3, textView.getPaddingRight(), textView.getPaddingBottom());
        }
    }

    /* renamed from: F */
    public static void m945F(TextView textView, int i2) {
        AbstractC0364l.m1009p(i2);
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i3 = textView.getIncludeFontPadding() ? fontMetricsInt.bottom : fontMetricsInt.descent;
        if (i2 > Math.abs(i3)) {
            textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), i2 - i3);
        }
    }

    /* renamed from: G */
    public static void m946G(EditorInfo editorInfo, CharSequence charSequence, int i2, int i3) {
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        editorInfo.extras.putCharSequence("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SURROUNDING_TEXT", charSequence != null ? new SpannableStringBuilder(charSequence) : null);
        editorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_HEAD", i2);
        editorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_END", i3);
    }

    /* renamed from: H */
    public static void m947H(Drawable drawable, int i2) {
        AbstractC0098a.m299g(drawable, i2);
    }

    /* renamed from: I */
    public static void m948I(ViewGroup viewGroup, boolean z2) {
        if (Build.VERSION.SDK_INT >= 29) {
            AbstractC1173v.m2821b(viewGroup, z2);
        } else if (f1109m) {
            try {
                AbstractC1173v.m2821b(viewGroup, z2);
            } catch (NoSuchMethodError unused) {
                f1109m = false;
            }
        }
    }

    /* renamed from: J */
    public static ActionMode.Callback m949J(ActionMode.Callback callback) {
        return (!(callback instanceof ActionModeCallbackC0452p) || Build.VERSION.SDK_INT < 26) ? callback : ((ActionModeCallbackC0452p) callback).f1353a;
    }

    /* renamed from: K */
    public static ActionMode.Callback m950K(ActionMode.Callback callback, TextView textView) {
        int i2 = Build.VERSION.SDK_INT;
        return (i2 < 26 || i2 > 27 || (callback instanceof ActionModeCallbackC0452p) || callback == null) ? callback : new ActionModeCallbackC0452p(callback, textView);
    }

    /* renamed from: a */
    public static final void m951a(AbstractC0167a abstractC0167a, C0169c c0169c, String str) {
        C0170d.f620i.fine(c0169c.f618f + ' ' + String.format("%-22s", Arrays.copyOf(new Object[]{str}, 1)) + ": " + abstractC0167a.f609c);
    }

    /* renamed from: b */
    public static void m952b(StringBuilder sb, Object obj, C1199a c1199a) {
        if (c1199a != null) {
            sb.append((CharSequence) c1199a.mo1460b(obj));
            return;
        }
        if (obj == null ? true : obj instanceof CharSequence) {
            sb.append((CharSequence) obj);
        } else if (obj instanceof Character) {
            sb.append(((Character) obj).charValue());
        } else {
            sb.append((CharSequence) String.valueOf(obj));
        }
    }

    /* renamed from: c */
    public static final boolean m953c(int i2, int i3, int i4, byte[] bArr, byte[] bArr2) {
        AbstractC1326c.m3062e(bArr, "a");
        AbstractC1326c.m3062e(bArr2, "b");
        for (int i5 = 0; i5 < i4; i5++) {
            if (bArr[i5 + i2] != bArr2[i5 + i3]) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: d */
    public static void m954d(long j2, C0479g c0479g, int i2, ArrayList arrayList, int i3, int i4, ArrayList arrayList2) {
        C0482j c0482j;
        int i5;
        int i6;
        long j3;
        int i7;
        C0479g c0479g2;
        ArrayList arrayList3;
        int i8 = i2;
        ArrayList arrayList4 = arrayList;
        ArrayList arrayList5 = arrayList2;
        int i9 = 0;
        int i10 = 1;
        if (!(i3 < i4)) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        for (int i11 = i3; i11 < i4; i11++) {
            if (((C0482j) arrayList4.get(i11)).mo1197c() < i8) {
                throw new IllegalArgumentException("Failed requirement.");
            }
        }
        C0482j c0482j2 = (C0482j) arrayList.get(i3);
        C0482j c0482j3 = (C0482j) arrayList4.get(i4 - 1);
        if (i8 == c0482j2.mo1197c()) {
            int iIntValue = ((Number) arrayList5.get(i3)).intValue();
            int i12 = i3 + 1;
            c0482j = (C0482j) arrayList4.get(i12);
            i5 = i12;
            i6 = iIntValue;
        } else {
            c0482j = c0482j2;
            i5 = i3;
            i6 = -1;
        }
        if (c0482j.mo1200f(i8) == c0482j3.mo1200f(i8)) {
            int iMin = Math.min(c0482j.mo1197c(), c0482j3.mo1197c());
            for (int i13 = i8; i13 < iMin && c0482j.mo1200f(i13) == c0482j3.mo1200f(i13); i13++) {
                i9++;
            }
            long j4 = 4;
            long j5 = (c0479g.f1480b / j4) + j2 + 2 + i9 + 1;
            c0479g.m1167B(-i9);
            c0479g.m1167B(i6);
            int i14 = i8 + i9;
            while (i8 < i14) {
                c0479g.m1167B(c0482j.mo1200f(i8) & 255);
                i8++;
            }
            if (i5 + 1 == i4) {
                if (i14 != ((C0482j) arrayList4.get(i5)).mo1197c()) {
                    throw new IllegalStateException("Check failed.");
                }
                c0479g.m1167B(((Number) arrayList5.get(i5)).intValue());
                return;
            } else {
                C0479g c0479g3 = new C0479g();
                c0479g.m1167B(((int) ((c0479g3.f1480b / j4) + j5)) * (-1));
                m954d(j5, c0479g3, i14, arrayList4, i5, i4, arrayList5);
                c0479g.m1193y(c0479g3);
                return;
            }
        }
        for (int i15 = i5 + 1; i15 < i4; i15++) {
            if (((C0482j) arrayList4.get(i15 - 1)).mo1200f(i8) != ((C0482j) arrayList4.get(i15)).mo1200f(i8)) {
                i10++;
            }
        }
        long j6 = 4;
        long j7 = (c0479g.f1480b / j6) + j2 + 2 + (i10 * 2);
        c0479g.m1167B(i10);
        c0479g.m1167B(i6);
        for (int i16 = i5; i16 < i4; i16++) {
            int iMo1200f = ((C0482j) arrayList4.get(i16)).mo1200f(i8);
            if (i16 == i5 || iMo1200f != ((C0482j) arrayList4.get(i16 - 1)).mo1200f(i8)) {
                c0479g.m1167B(iMo1200f & 255);
            }
        }
        C0479g c0479g4 = new C0479g();
        int i17 = i5;
        while (i17 < i4) {
            byte bMo1200f = ((C0482j) arrayList4.get(i17)).mo1200f(i8);
            int i18 = i17 + 1;
            int i19 = i18;
            while (true) {
                if (i19 >= i4) {
                    i19 = i4;
                    break;
                } else if (bMo1200f != ((C0482j) arrayList4.get(i19)).mo1200f(i8)) {
                    break;
                } else {
                    i19++;
                }
            }
            if (i18 == i19 && i8 + 1 == ((C0482j) arrayList4.get(i17)).mo1197c()) {
                c0479g.m1167B(((Number) arrayList5.get(i17)).intValue());
                int i20 = i19;
                c0479g2 = c0479g4;
                arrayList3 = arrayList5;
                i7 = i20;
                j3 = j7;
            } else {
                c0479g.m1167B(((int) ((c0479g4.f1480b / j6) + j7)) * (-1));
                ArrayList arrayList6 = arrayList5;
                j3 = j7;
                i7 = i19;
                m954d(j3, c0479g4, i8 + 1, arrayList, i17, i7, arrayList6);
                arrayList4 = arrayList;
                c0479g2 = c0479g4;
                arrayList3 = arrayList6;
            }
            j7 = j3;
            i17 = i7;
            arrayList5 = arrayList3;
            c0479g4 = c0479g2;
        }
        c0479g.m1193y(c0479g4);
    }

    /* renamed from: e */
    public static final void m955e(long j2, long j3, long j4) {
        if ((j3 | j4) < 0 || j3 > j2 || j2 - j3 < j4) {
            throw new ArrayIndexOutOfBoundsException("size=" + j2 + " offset=" + j3 + " byteCount=" + j4);
        }
    }

    /* renamed from: f */
    public static int m956f(C0923W c0923w, AbstractC0668g abstractC0668g, View view, View view2, AbstractC0911J abstractC0911J, boolean z2) {
        if (abstractC0911J.m2374v() == 0 || c0923w.m2391b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z2) {
            return Math.abs(AbstractC0911J.m2346H(view) - AbstractC0911J.m2346H(view2)) + 1;
        }
        return Math.min(abstractC0668g.mo1621l(), abstractC0668g.mo1611b(view2) - abstractC0668g.mo1614e(view));
    }

    /* renamed from: g */
    public static int m957g(C0923W c0923w, AbstractC0668g abstractC0668g, View view, View view2, AbstractC0911J abstractC0911J, boolean z2, boolean z3) {
        if (abstractC0911J.m2374v() == 0 || c0923w.m2391b() == 0 || view == null || view2 == null) {
            return 0;
        }
        int iMax = z3 ? Math.max(0, (c0923w.m2391b() - Math.max(AbstractC0911J.m2346H(view), AbstractC0911J.m2346H(view2))) - 1) : Math.max(0, Math.min(AbstractC0911J.m2346H(view), AbstractC0911J.m2346H(view2)));
        if (z2) {
            return Math.round((iMax * (Math.abs(abstractC0668g.mo1611b(view2) - abstractC0668g.mo1614e(view)) / (Math.abs(AbstractC0911J.m2346H(view) - AbstractC0911J.m2346H(view2)) + 1))) + (abstractC0668g.mo1620k() - abstractC0668g.mo1614e(view)));
        }
        return iMax;
    }

    /* renamed from: h */
    public static int m958h(C0923W c0923w, AbstractC0668g abstractC0668g, View view, View view2, AbstractC0911J abstractC0911J, boolean z2) {
        if (abstractC0911J.m2374v() == 0 || c0923w.m2391b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z2) {
            return c0923w.m2391b();
        }
        return (int) (((abstractC0668g.mo1611b(view2) - abstractC0668g.mo1614e(view)) / (Math.abs(AbstractC0911J.m2346H(view) - AbstractC0911J.m2346H(view2)) + 1)) * c0923w.m2391b());
    }

    /* renamed from: i */
    public static float[] m959i(float[] fArr, int i2) {
        if (i2 < 0) {
            throw new IllegalArgumentException();
        }
        int length = fArr.length;
        if (length < 0) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int iMin = Math.min(i2, length);
        float[] fArr2 = new float[i2];
        System.arraycopy(fArr, 0, fArr2, 0, iMin);
        return fArr2;
    }

    /* renamed from: j */
    public static C0676o m960j(Context context) {
        ProviderInfo providerInfo;
        C0132v c0132v;
        ApplicationInfo applicationInfo;
        C0511e c0664c = Build.VERSION.SDK_INT >= 28 ? new C0664c(14) : new C0511e(14);
        PackageManager packageManager = context.getPackageManager();
        AbstractC0364l.m1010q(packageManager, "Package manager required to locate emoji font provider");
        Iterator<ResolveInfo> it = packageManager.queryIntentContentProviders(new Intent("androidx.content.action.LOAD_EMOJI_FONT"), 0).iterator();
        while (true) {
            if (!it.hasNext()) {
                providerInfo = null;
                break;
            }
            providerInfo = it.next().providerInfo;
            if (providerInfo != null && (applicationInfo = providerInfo.applicationInfo) != null && (applicationInfo.flags & 1) == 1) {
                break;
            }
        }
        if (providerInfo == null) {
            c0132v = null;
        } else {
            try {
                String str = providerInfo.authority;
                String str2 = providerInfo.packageName;
                Signature[] signatureArrMo1279f = c0664c.mo1279f(packageManager, str2);
                ArrayList arrayList = new ArrayList();
                for (Signature signature : signatureArrMo1279f) {
                    arrayList.add(signature.toByteArray());
                }
                c0132v = new C0132v(str, str2, "emojicompat-emoji-font", Collections.singletonList(arrayList));
            } catch (PackageManager.NameNotFoundException e3) {
                Log.wtf("emoji2.text.DefaultEmojiConfig", e3);
            }
        }
        if (c0132v == null) {
            return null;
        }
        return new C0676o(new C0675n(context, c0132v));
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0096 A[Catch: NumberFormatException -> 0x00aa, LOOP:3: B:25:0x0068->B:44:0x0096, LOOP_END, TryCatch #0 {NumberFormatException -> 0x00aa, blocks: (B:22:0x0054, B:25:0x0068, B:27:0x006e, B:31:0x007a, B:44:0x0096, B:46:0x009c, B:52:0x00b1, B:53:0x00b4), top: B:68:0x0054 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x009c A[Catch: NumberFormatException -> 0x00aa, TryCatch #0 {NumberFormatException -> 0x00aa, blocks: (B:22:0x0054, B:25:0x0068, B:27:0x006e, B:31:0x007a, B:44:0x0096, B:46:0x009c, B:52:0x00b1, B:53:0x00b4), top: B:68:0x0054 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00b1 A[Catch: NumberFormatException -> 0x00aa, TryCatch #0 {NumberFormatException -> 0x00aa, blocks: (B:22:0x0054, B:25:0x0068, B:27:0x006e, B:31:0x007a, B:44:0x0096, B:46:0x009c, B:52:0x00b1, B:53:0x00b4), top: B:68:0x0054 }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00d7 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0095 A[SYNTHETIC] */
    /* renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static p006C.C0076h[] m961k(java.lang.String r17) {
        /*
            Method dump skipped, instructions count: 268
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p033L1.AbstractC0356d.m961k(java.lang.String):C.h[]");
    }

    /* renamed from: l */
    public static int m962l(String str, int i2, int i3, boolean z2) {
        while (i2 < i3) {
            char cCharAt = str.charAt(i2);
            if (((cCharAt < ' ' && cCharAt != '\t') || cCharAt >= 127 || ('0' <= cCharAt && '9' >= cCharAt) || (('a' <= cCharAt && 'z' >= cCharAt) || (('A' <= cCharAt && 'Z' >= cCharAt) || cCharAt == ':'))) == (!z2)) {
                return i2;
            }
            i2++;
        }
        return i3;
    }

    /* renamed from: m */
    public static C0076h[] m963m(C0076h[] c0076hArr) {
        C0076h[] c0076hArr2 = new C0076h[c0076hArr.length];
        for (int i2 = 0; i2 < c0076hArr.length; i2++) {
            c0076hArr2[i2] = new C0076h(c0076hArr[i2]);
        }
        return c0076hArr2;
    }

    /* renamed from: n */
    public static boolean m964n(View view, KeyEvent keyEvent) {
        ArrayList arrayList;
        int size;
        int iIndexOfKey;
        WeakHashMap weakHashMap = AbstractC0241P.f815a;
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        ArrayList arrayList2 = C0240O.f811d;
        C0240O c0240o = (C0240O) view.getTag(R.id.tag_unhandled_key_event_manager);
        WeakReference weakReference = null;
        if (c0240o == null) {
            c0240o = new C0240O();
            c0240o.f812a = null;
            c0240o.f813b = null;
            c0240o.f814c = null;
            view.setTag(R.id.tag_unhandled_key_event_manager, c0240o);
        }
        WeakReference weakReference2 = c0240o.f814c;
        if (weakReference2 != null && weakReference2.get() == keyEvent) {
            return false;
        }
        c0240o.f814c = new WeakReference(keyEvent);
        if (c0240o.f813b == null) {
            c0240o.f813b = new SparseArray();
        }
        SparseArray sparseArray = c0240o.f813b;
        if (keyEvent.getAction() == 1 && (iIndexOfKey = sparseArray.indexOfKey(keyEvent.getKeyCode())) >= 0) {
            weakReference = (WeakReference) sparseArray.valueAt(iIndexOfKey);
            sparseArray.removeAt(iIndexOfKey);
        }
        if (weakReference == null) {
            weakReference = (WeakReference) sparseArray.get(keyEvent.getKeyCode());
        }
        if (weakReference == null) {
            return false;
        }
        View view2 = (View) weakReference.get();
        if (view2 == null || !view2.isAttachedToWindow() || (arrayList = (ArrayList) view2.getTag(R.id.tag_unhandled_key_listeners)) == null || (size = arrayList.size() - 1) < 0) {
            return true;
        }
        arrayList.get(size).getClass();
        throw new ClassCastException();
    }

    /* renamed from: o */
    public static boolean m965o(InterfaceC0271k interfaceC0271k, View view, Window.Callback callback, KeyEvent keyEvent) throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException, InvocationTargetException {
        DialogInterface.OnKeyListener onKeyListener;
        boolean zBooleanValue = false;
        if (interfaceC0271k != null) {
            if (Build.VERSION.SDK_INT >= 28) {
                return interfaceC0271k.mo756d(keyEvent);
            }
            if (callback instanceof Activity) {
                Activity activity = (Activity) callback;
                activity.onUserInteraction();
                Window window = activity.getWindow();
                if (window.hasFeature(8)) {
                    ActionBar actionBar = activity.getActionBar();
                    if (keyEvent.getKeyCode() == 82 && actionBar != null) {
                        if (!f1097a) {
                            try {
                                f1098b = actionBar.getClass().getMethod("onMenuKeyEvent", KeyEvent.class);
                            } catch (NoSuchMethodException unused) {
                            }
                            f1097a = true;
                        }
                        Method method = f1098b;
                        if (method != null) {
                            try {
                                Object objInvoke = method.invoke(actionBar, keyEvent);
                                if (objInvoke != null) {
                                    zBooleanValue = ((Boolean) objInvoke).booleanValue();
                                }
                            } catch (IllegalAccessException | InvocationTargetException unused2) {
                            }
                        }
                        if (zBooleanValue) {
                            return true;
                        }
                    }
                }
                if (window.superDispatchKeyEvent(keyEvent)) {
                    return true;
                }
                View decorView = window.getDecorView();
                if (AbstractC0241P.m691c(decorView, keyEvent)) {
                    return true;
                }
                return keyEvent.dispatch(activity, decorView != null ? decorView.getKeyDispatcherState() : null, activity);
            }
            if (callback instanceof Dialog) {
                Dialog dialog = (Dialog) callback;
                if (!f1099c) {
                    try {
                        Field declaredField = Dialog.class.getDeclaredField("mOnKeyListener");
                        f1100d = declaredField;
                        declaredField.setAccessible(true);
                    } catch (NoSuchFieldException unused3) {
                    }
                    f1099c = true;
                }
                Field field = f1100d;
                if (field != null) {
                    try {
                        onKeyListener = (DialogInterface.OnKeyListener) field.get(dialog);
                    } catch (IllegalAccessException unused4) {
                    }
                } else {
                    onKeyListener = null;
                }
                if (onKeyListener != null && onKeyListener.onKey(dialog, keyEvent.getKeyCode(), keyEvent)) {
                    return true;
                }
                Window window2 = dialog.getWindow();
                if (window2.superDispatchKeyEvent(keyEvent)) {
                    return true;
                }
                View decorView2 = window2.getDecorView();
                if (AbstractC0241P.m691c(decorView2, keyEvent)) {
                    return true;
                }
                return keyEvent.dispatch(dialog, decorView2 != null ? decorView2.getKeyDispatcherState() : null, dialog);
            }
            if ((view != null && AbstractC0241P.m691c(view, keyEvent)) || interfaceC0271k.mo756d(keyEvent)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* renamed from: p */
    public static EnumC0110B m966p(String str) {
        AbstractC1326c.m3062e(str, "javaName");
        int iHashCode = str.hashCode();
        if (iHashCode != 79201641) {
            if (iHashCode != 79923350) {
                switch (iHashCode) {
                    case -503070503:
                        if (str.equals("TLSv1.1")) {
                            return EnumC0110B.TLS_1_1;
                        }
                        break;
                    case -503070502:
                        if (str.equals("TLSv1.2")) {
                            return EnumC0110B.TLS_1_2;
                        }
                        break;
                    case -503070501:
                        if (str.equals("TLSv1.3")) {
                            return EnumC0110B.TLS_1_3;
                        }
                        break;
                }
            } else if (str.equals("TLSv1")) {
                return EnumC0110B.TLS_1_0;
            }
        } else if (str.equals("SSLv3")) {
            return EnumC0110B.SSL_3_0;
        }
        throw new IllegalArgumentException("Unexpected TLS version: ".concat(str));
    }

    /* renamed from: q */
    public static final String m967q(long j2) {
        String str;
        if (j2 <= -999500000) {
            str = ((j2 - 500000000) / 1000000000) + " s ";
        } else if (j2 <= -999500) {
            str = ((j2 - 500000) / 1000000) + " ms";
        } else if (j2 <= 0) {
            str = ((j2 - 500) / 1000) + " µs";
        } else if (j2 < 999500) {
            str = ((j2 + 500) / 1000) + " µs";
        } else if (j2 < 999500000) {
            str = ((j2 + 500000) / 1000000) + " ms";
        } else {
            str = ((j2 + 500000000) / 1000000000) + " s ";
        }
        return String.format("%6s", Arrays.copyOf(new Object[]{str}, 1));
    }

    /* renamed from: r */
    public static C0128r m968r(String str) {
        AbstractC1326c.m3062e(str, "$this$toMediaType");
        Matcher matcher = C0128r.f381c.matcher(str);
        if (!matcher.lookingAt()) {
            throw new IllegalArgumentException(("No subtype found for: \"" + str + '\"').toString());
        }
        String strGroup = matcher.group(1);
        AbstractC1326c.m3061d(strGroup, "typeSubtype.group(1)");
        Locale locale = Locale.US;
        AbstractC1326c.m3061d(locale, "Locale.US");
        AbstractC1326c.m3061d(strGroup.toLowerCase(locale), "(this as java.lang.String).toLowerCase(locale)");
        String strGroup2 = matcher.group(2);
        AbstractC1326c.m3061d(strGroup2, "typeSubtype.group(2)");
        AbstractC1326c.m3061d(strGroup2.toLowerCase(locale), "(this as java.lang.String).toLowerCase(locale)");
        ArrayList arrayList = new ArrayList();
        Matcher matcher2 = C0128r.f382d.matcher(str);
        int iEnd = matcher.end();
        while (iEnd < str.length()) {
            matcher2.region(iEnd, str.length());
            if (!matcher2.lookingAt()) {
                StringBuilder sb = new StringBuilder("Parameter is not formatted correctly: \"");
                String strSubstring = str.substring(iEnd);
                AbstractC1326c.m3061d(strSubstring, "(this as java.lang.String).substring(startIndex)");
                sb.append(strSubstring);
                sb.append("\" for: \"");
                sb.append(str);
                sb.append('\"');
                throw new IllegalArgumentException(sb.toString().toString());
            }
            String strGroup3 = matcher2.group(1);
            if (strGroup3 == null) {
                iEnd = matcher2.end();
            } else {
                String strGroup4 = matcher2.group(2);
                if (strGroup4 == null) {
                    strGroup4 = matcher2.group(3);
                } else if (AbstractC1411i.m3188c0(strGroup4, "'", false) && strGroup4.endsWith("'") && strGroup4.length() > 2) {
                    strGroup4 = strGroup4.substring(1, strGroup4.length() - 1);
                    AbstractC1326c.m3061d(strGroup4, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                }
                arrayList.add(strGroup3);
                arrayList.add(strGroup4);
                iEnd = matcher2.end();
            }
        }
        Object[] array = arrayList.toArray(new String[0]);
        if (array != null) {
            return new C0128r(str, (String[]) array);
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0047, code lost:
    
        if (r5.f131c == r8.hashCode()) goto L21;
     */
    /* renamed from: s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.content.res.ColorStateList m969s(android.content.Context r8, int r9) throws android.content.res.Resources.NotFoundException {
        /*
            android.content.res.Resources r0 = r8.getResources()
            android.content.res.Resources$Theme r8 = r8.getTheme()
            B.m r1 = new B.m
            r1.<init>(r0, r8)
            java.lang.Object r2 = p003B.AbstractC0060p.f139c
            monitor-enter(r2)
            java.util.WeakHashMap r3 = p003B.AbstractC0060p.f138b     // Catch: java.lang.Throwable -> L3c
            java.lang.Object r3 = r3.get(r1)     // Catch: java.lang.Throwable -> L3c
            android.util.SparseArray r3 = (android.util.SparseArray) r3     // Catch: java.lang.Throwable -> L3c
            r4 = 0
            if (r3 == 0) goto L50
            int r5 = r3.size()     // Catch: java.lang.Throwable -> L3c
            if (r5 <= 0) goto L50
            java.lang.Object r5 = r3.get(r9)     // Catch: java.lang.Throwable -> L3c
            B.l r5 = (p003B.C0056l) r5     // Catch: java.lang.Throwable -> L3c
            if (r5 == 0) goto L50
            android.content.res.Configuration r6 = r5.f130b     // Catch: java.lang.Throwable -> L3c
            android.content.res.Configuration r7 = r0.getConfiguration()     // Catch: java.lang.Throwable -> L3c
            boolean r6 = r6.equals(r7)     // Catch: java.lang.Throwable -> L3c
            if (r6 == 0) goto L4d
            if (r8 != 0) goto L3f
            int r6 = r5.f131c     // Catch: java.lang.Throwable -> L3c
            if (r6 == 0) goto L49
            goto L3f
        L3c:
            r8 = move-exception
            goto Laf
        L3f:
            if (r8 == 0) goto L4d
            int r6 = r5.f131c     // Catch: java.lang.Throwable -> L3c
            int r7 = r8.hashCode()     // Catch: java.lang.Throwable -> L3c
            if (r6 != r7) goto L4d
        L49:
            android.content.res.ColorStateList r3 = r5.f129a     // Catch: java.lang.Throwable -> L3c
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L3c
            goto L52
        L4d:
            r3.remove(r9)     // Catch: java.lang.Throwable -> L3c
        L50:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L3c
            r3 = r4
        L52:
            if (r3 == 0) goto L55
            return r3
        L55:
            java.lang.ThreadLocal r2 = p003B.AbstractC0060p.f137a
            java.lang.Object r3 = r2.get()
            android.util.TypedValue r3 = (android.util.TypedValue) r3
            if (r3 != 0) goto L67
            android.util.TypedValue r3 = new android.util.TypedValue
            r3.<init>()
            r2.set(r3)
        L67:
            r2 = 1
            r0.getValue(r9, r3, r2)
            int r2 = r3.type
            r3 = 28
            if (r2 < r3) goto L76
            r3 = 31
            if (r2 > r3) goto L76
            goto L7e
        L76:
            android.content.res.XmlResourceParser r2 = r0.getXml(r9)
            android.content.res.ColorStateList r4 = p003B.AbstractC0047c.m174a(r0, r2, r8)     // Catch: java.lang.Exception -> L7e
        L7e:
            if (r4 == 0) goto Laa
            java.lang.Object r2 = p003B.AbstractC0060p.f139c
            monitor-enter(r2)
            java.util.WeakHashMap r0 = p003B.AbstractC0060p.f138b     // Catch: java.lang.Throwable -> L96
            java.lang.Object r3 = r0.get(r1)     // Catch: java.lang.Throwable -> L96
            android.util.SparseArray r3 = (android.util.SparseArray) r3     // Catch: java.lang.Throwable -> L96
            if (r3 != 0) goto L98
            android.util.SparseArray r3 = new android.util.SparseArray     // Catch: java.lang.Throwable -> L96
            r3.<init>()     // Catch: java.lang.Throwable -> L96
            r0.put(r1, r3)     // Catch: java.lang.Throwable -> L96
            goto L98
        L96:
            r8 = move-exception
            goto La8
        L98:
            B.l r0 = new B.l     // Catch: java.lang.Throwable -> L96
            android.content.res.Resources r1 = r1.f132a     // Catch: java.lang.Throwable -> L96
            android.content.res.Configuration r1 = r1.getConfiguration()     // Catch: java.lang.Throwable -> L96
            r0.<init>(r4, r1, r8)     // Catch: java.lang.Throwable -> L96
            r3.append(r9, r0)     // Catch: java.lang.Throwable -> L96
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L96
            goto Lae
        La8:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L96
            throw r8
        Laa:
            android.content.res.ColorStateList r4 = p003B.AbstractC0055k.m184b(r0, r9, r8)
        Lae:
            return r4
        Laf:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L3c
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p033L1.AbstractC0356d.m969s(android.content.Context, int):android.content.res.ColorStateList");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /* renamed from: u */
    public static final Class m970u(InterfaceC1387a interfaceC1387a) {
        AbstractC1326c.m3062e(interfaceC1387a, "<this>");
        Class clsMo3057a = ((InterfaceC1324a) interfaceC1387a).mo3057a();
        if (clsMo3057a.isPrimitive()) {
            String name = clsMo3057a.getName();
            switch (name.hashCode()) {
                case -1325958191:
                    if (name.equals("double")) {
                        return Double.class;
                    }
                    break;
                case 104431:
                    if (name.equals("int")) {
                        return Integer.class;
                    }
                    break;
                case 3039496:
                    if (name.equals("byte")) {
                        return Byte.class;
                    }
                    break;
                case 3052374:
                    if (name.equals("char")) {
                        return Character.class;
                    }
                    break;
                case 3327612:
                    if (name.equals("long")) {
                        return Long.class;
                    }
                    break;
                case 3625364:
                    if (name.equals("void")) {
                        return Void.class;
                    }
                    break;
                case 64711720:
                    if (name.equals("boolean")) {
                        return Boolean.class;
                    }
                    break;
                case 97526364:
                    if (name.equals("float")) {
                        return Float.class;
                    }
                    break;
                case 109413500:
                    if (name.equals("short")) {
                        return Short.class;
                    }
                    break;
            }
        }
        return clsMo3057a;
    }

    /* renamed from: v */
    public static C0202e m971v(C1081c0 c1081c0) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 28) {
            return new C0202e(AbstractC0451o.m1136c(c1081c0));
        }
        TextPaint textPaint = new TextPaint(c1081c0.getPaint());
        TextDirectionHeuristic textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR;
        int iM1125a = AbstractC0449m.m1125a(c1081c0);
        int iM1128d = AbstractC0449m.m1128d(c1081c0);
        if (c1081c0.getTransformationMethod() instanceof PasswordTransformationMethod) {
            textDirectionHeuristic = TextDirectionHeuristics.LTR;
        } else {
            if (i2 < 28 || (c1081c0.getInputType() & 15) != 3) {
                boolean z2 = c1081c0.getLayoutDirection() == 1;
                switch (c1081c0.getTextDirection()) {
                    case 2:
                        textDirectionHeuristic = TextDirectionHeuristics.ANYRTL_LTR;
                        break;
                    case 3:
                        textDirectionHeuristic = TextDirectionHeuristics.LTR;
                        break;
                    case 4:
                        textDirectionHeuristic = TextDirectionHeuristics.RTL;
                        break;
                    case 5:
                        textDirectionHeuristic = TextDirectionHeuristics.LOCALE;
                        break;
                    case 6:
                        break;
                    case 7:
                        textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_RTL;
                        break;
                    default:
                        if (z2) {
                            textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_RTL;
                            break;
                        }
                        break;
                }
            } else {
                byte directionality = Character.getDirectionality(AbstractC0451o.m1135b(AbstractC0450n.m1133a(c1081c0.getTextLocale()))[0].codePointAt(0));
                textDirectionHeuristic = (directionality == 1 || directionality == 2) ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR;
            }
        }
        return new C0202e(textPaint, textDirectionHeuristic, iM1125a, iM1128d);
    }

    /* renamed from: w */
    public static boolean m972w(EditText editText) {
        return editText.getInputType() != 0;
    }

    /* renamed from: x */
    public static void m973x(EditorInfo editorInfo, InputConnection inputConnection, TextView textView) {
        if (inputConnection == null || editorInfo.hintText != null) {
            return;
        }
        for (ViewParent parent = textView.getParent(); parent instanceof View; parent = parent.getParent()) {
        }
    }

    /* renamed from: C */
    public void mo828C(boolean z2) {
    }

    /* renamed from: D */
    public abstract void mo826D(boolean z2);

    /* renamed from: t */
    public abstract void mo974t(C0527u c0527u, float f, float f2);

    /* renamed from: y */
    public abstract void mo427y(int i2);

    /* renamed from: z */
    public abstract void mo428z(Typeface typeface, boolean z2);
}
