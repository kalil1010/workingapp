package androidx.activity.result;

import androidx.lifecycle.EnumC0747l;
import androidx.lifecycle.InterfaceC0751p;
import androidx.lifecycle.InterfaceC0753r;

/* loaded from: classes.dex */
class ActivityResultRegistry$1 implements InterfaceC0751p {
    @Override // androidx.lifecycle.InterfaceC0751p
    /* renamed from: b */
    public final void mo1439b(InterfaceC0753r interfaceC0753r, EnumC0747l enumC0747l) {
        if (EnumC0747l.ON_START.equals(enumC0747l) || EnumC0747l.ON_STOP.equals(enumC0747l) || EnumC0747l.ON_DESTROY.equals(enumC0747l)) {
            throw null;
        }
    }
}
