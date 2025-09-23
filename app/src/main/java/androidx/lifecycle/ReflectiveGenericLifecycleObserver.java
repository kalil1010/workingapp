package androidx.lifecycle;

import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.List;

@Deprecated
/* loaded from: classes.dex */
class ReflectiveGenericLifecycleObserver implements InterfaceC0751p {

    /* renamed from: a */
    public final InterfaceC0752q f2708a;

    /* renamed from: b */
    public final C0736a f2709b;

    public ReflectiveGenericLifecycleObserver(InterfaceC0752q interfaceC0752q) {
        this.f2708a = interfaceC0752q;
        C0738c c0738c = C0738c.f2716c;
        Class<?> cls = interfaceC0752q.getClass();
        C0736a c0736a = (C0736a) c0738c.f2717a.get(cls);
        this.f2709b = c0736a == null ? c0738c.m1776a(cls, null) : c0736a;
    }

    @Override // androidx.lifecycle.InterfaceC0751p
    /* renamed from: b */
    public final void mo1439b(InterfaceC0753r interfaceC0753r, EnumC0747l enumC0747l) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        HashMap map = this.f2709b.f2712a;
        List list = (List) map.get(enumC0747l);
        InterfaceC0752q interfaceC0752q = this.f2708a;
        C0736a.m1774a(list, interfaceC0753r, enumC0747l, interfaceC0752q);
        C0736a.m1774a((List) map.get(EnumC0747l.ON_ANY), interfaceC0753r, enumC0747l, interfaceC0752q);
    }
}
