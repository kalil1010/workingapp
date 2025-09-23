package p105j;

import android.content.Context;
import android.view.View;
import android.view.Window;
import p102i.C0995a;

/* renamed from: j.l1 */
/* loaded from: classes.dex */
public final class ViewOnClickListenerC1109l1 implements View.OnClickListener {

    /* renamed from: a */
    public final C0995a f4560a;

    /* renamed from: b */
    public final /* synthetic */ C1112m1 f4561b;

    public ViewOnClickListenerC1109l1(C1112m1 c1112m1) {
        this.f4561b = c1112m1;
        Context context = c1112m1.f4568a.getContext();
        CharSequence charSequence = c1112m1.f4575h;
        C0995a c0995a = new C0995a();
        c0995a.f4190e = 4096;
        c0995a.f4192g = 4096;
        c0995a.f4197l = null;
        c0995a.f4198m = null;
        c0995a.f4199n = false;
        c0995a.f4200o = false;
        c0995a.f4201p = 16;
        c0995a.f4194i = context;
        c0995a.f4186a = charSequence;
        this.f4560a = c0995a;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C1112m1 c1112m1 = this.f4561b;
        Window.Callback callback = c1112m1.f4578k;
        if (callback == null || !c1112m1.f4579l) {
            return;
        }
        callback.onMenuItemSelected(0, this.f4560a);
    }
}
