package p102i;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import p090e.DialogC0873f;

/* renamed from: i.m */
/* loaded from: classes.dex */
public final class DialogInterfaceOnKeyListenerC1007m implements DialogInterface.OnKeyListener, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, InterfaceC1018x {

    /* renamed from: a */
    public SubMenuC0994E f4275a;

    /* renamed from: b */
    public DialogC0873f f4276b;

    /* renamed from: c */
    public C1002h f4277c;

    @Override // p102i.InterfaceC1018x
    /* renamed from: a */
    public final void mo1977a(MenuC1006l menuC1006l, boolean z2) {
        DialogC0873f dialogC0873f;
        if ((z2 || menuC1006l == this.f4275a) && (dialogC0873f = this.f4276b) != null) {
            dialogC0873f.dismiss();
        }
    }

    @Override // p102i.InterfaceC1018x
    /* renamed from: f */
    public final boolean mo1979f(MenuC1006l menuC1006l) {
        return false;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i2) {
        C1002h c1002h = this.f4277c;
        if (c1002h.f4243f == null) {
            c1002h.f4243f = new C1001g(c1002h);
        }
        this.f4275a.m2577q(c1002h.f4243f.getItem(i2), null, 0);
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        this.f4277c.mo1062a(this.f4275a, true);
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public final boolean onKey(DialogInterface dialogInterface, int i2, KeyEvent keyEvent) {
        Window window;
        View decorView;
        KeyEvent.DispatcherState keyDispatcherState;
        View decorView2;
        KeyEvent.DispatcherState keyDispatcherState2;
        SubMenuC0994E subMenuC0994E = this.f4275a;
        if (i2 == 82 || i2 == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Window window2 = this.f4276b.getWindow();
                if (window2 != null && (decorView2 = window2.getDecorView()) != null && (keyDispatcherState2 = decorView2.getKeyDispatcherState()) != null) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.f4276b.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
                subMenuC0994E.m2572c(true);
                dialogInterface.dismiss();
                return true;
            }
        }
        return subMenuC0994E.performShortcut(i2, keyEvent, 0);
    }
}
