package androidx.profileinstaller;

import android.content.Context;
import java.util.Collections;
import java.util.List;
import p002A1.RunnableC0026h;
import p080b1.C0767e;
import p087d0.AbstractC0852i;
import p100h0.InterfaceC0986b;

/* loaded from: classes.dex */
public class ProfileInstallerInitializer implements InterfaceC0986b {
    @Override // p100h0.InterfaceC0986b
    /* renamed from: a */
    public final List mo1606a() {
        return Collections.EMPTY_LIST;
    }

    @Override // p100h0.InterfaceC0986b
    /* renamed from: b */
    public final Object mo1607b(Context context) {
        AbstractC0852i.m2171a(new RunnableC0026h(this, 3, context.getApplicationContext()));
        return new C0767e(5);
    }
}
