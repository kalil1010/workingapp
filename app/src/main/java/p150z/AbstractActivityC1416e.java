package p150z;

import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import androidx.lifecycle.AbstractC0726C;
import androidx.lifecycle.C0755t;
import androidx.lifecycle.FragmentC0728E;
import androidx.lifecycle.InterfaceC0753r;
import p028K.InterfaceC0271k;
import p033L1.AbstractC0356d;
import p131s1.AbstractC1326c;

/* renamed from: z.e */
/* loaded from: classes.dex */
public abstract class AbstractActivityC1416e extends Activity implements InterfaceC0753r, InterfaceC0271k {

    /* renamed from: a */
    public final C0755t f6098a = new C0755t(this);

    @Override // p028K.InterfaceC0271k
    /* renamed from: d */
    public final boolean mo756d(KeyEvent keyEvent) {
        AbstractC1326c.m3062e(keyEvent, "event");
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        AbstractC1326c.m3062e(keyEvent, "event");
        View decorView = getWindow().getDecorView();
        AbstractC1326c.m3061d(decorView, "window.decorView");
        if (AbstractC0356d.m964n(decorView, keyEvent)) {
            return true;
        }
        return AbstractC0356d.m965o(this, decorView, this, keyEvent);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        AbstractC1326c.m3062e(keyEvent, "event");
        View decorView = getWindow().getDecorView();
        AbstractC1326c.m3061d(decorView, "window.decorView");
        if (AbstractC0356d.m964n(decorView, keyEvent)) {
            return true;
        }
        return super.dispatchKeyShortcutEvent(keyEvent);
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        int i2 = FragmentC0728E.f2693b;
        AbstractC0726C.m1769b(this);
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        AbstractC1326c.m3062e(bundle, "outState");
        this.f6098a.m1785g();
        super.onSaveInstanceState(bundle);
    }
}
