package p137u1;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import p131s1.AbstractC1326c;
import p134t1.AbstractC1350a;

/* renamed from: u1.a */
/* loaded from: classes.dex */
public final class C1355a extends AbstractC1350a {
    @Override // p134t1.AbstractC1350a
    /* renamed from: a */
    public final Random mo3111a() {
        ThreadLocalRandom threadLocalRandomCurrent = ThreadLocalRandom.current();
        AbstractC1326c.m3061d(threadLocalRandomCurrent, "current()");
        return threadLocalRandomCurrent;
    }
}
