package p028K;

import android.view.View;
import android.view.autofill.AutofillId;
import java.util.Collection;

/* renamed from: K.G */
/* loaded from: classes.dex */
public abstract class AbstractC0232G {
    /* renamed from: a */
    public static void m648a(View view, Collection<View> collection, int i2) {
        view.addKeyboardNavigationClusters(collection, i2);
    }

    /* renamed from: b */
    public static AutofillId m649b(View view) {
        return view.getAutofillId();
    }

    /* renamed from: c */
    public static int m650c(View view) {
        return view.getImportantForAutofill();
    }

    /* renamed from: d */
    public static int m651d(View view) {
        return view.getNextClusterForwardId();
    }

    /* renamed from: e */
    public static boolean m652e(View view) {
        return view.hasExplicitFocusable();
    }

    /* renamed from: f */
    public static boolean m653f(View view) {
        return view.isFocusedByDefault();
    }

    /* renamed from: g */
    public static boolean m654g(View view) {
        return view.isImportantForAutofill();
    }

    /* renamed from: h */
    public static boolean m655h(View view) {
        return view.isKeyboardNavigationCluster();
    }

    /* renamed from: i */
    public static View m656i(View view, View view2, int i2) {
        return view.keyboardNavigationClusterSearch(view2, i2);
    }

    /* renamed from: j */
    public static boolean m657j(View view) {
        return view.restoreDefaultFocus();
    }

    /* renamed from: k */
    public static void m658k(View view, String... strArr) {
        view.setAutofillHints(strArr);
    }

    /* renamed from: l */
    public static void m659l(View view, boolean z2) {
        view.setFocusedByDefault(z2);
    }

    /* renamed from: m */
    public static void m660m(View view, int i2) {
        view.setImportantForAutofill(i2);
    }

    /* renamed from: n */
    public static void m661n(View view, boolean z2) {
        view.setKeyboardNavigationCluster(z2);
    }

    /* renamed from: o */
    public static void m662o(View view, int i2) {
        view.setNextClusterForwardId(i2);
    }

    /* renamed from: p */
    public static void m663p(View view, CharSequence charSequence) {
        view.setTooltipText(charSequence);
    }
}
