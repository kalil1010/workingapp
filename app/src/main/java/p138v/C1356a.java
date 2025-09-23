package p138v;

import p129s.C1312a;
import p129s.C1315d;

/* renamed from: v.a */
/* loaded from: classes.dex */
public final class C1356a extends AbstractC1358c {

    /* renamed from: h */
    public int f5752h;

    /* renamed from: i */
    public int f5753i;

    /* renamed from: j */
    public C1312a f5754j;

    public boolean getAllowsGoneWidget() {
        return this.f5754j.f5457t0;
    }

    public int getMargin() {
        return this.f5754j.f5458u0;
    }

    public int getType() {
        return this.f5752h;
    }

    @Override // p138v.AbstractC1358c
    /* renamed from: h */
    public final void mo1541h(C1315d c1315d, boolean z2) {
        int i2 = this.f5752h;
        this.f5753i = i2;
        if (z2) {
            if (i2 == 5) {
                this.f5753i = 1;
            } else if (i2 == 6) {
                this.f5753i = 0;
            }
        } else if (i2 == 5) {
            this.f5753i = 0;
        } else if (i2 == 6) {
            this.f5753i = 1;
        }
        if (c1315d instanceof C1312a) {
            ((C1312a) c1315d).f5456s0 = this.f5753i;
        }
    }

    public void setAllowsGoneWidget(boolean z2) {
        this.f5754j.f5457t0 = z2;
    }

    public void setDpMargin(int i2) {
        this.f5754j.f5458u0 = (int) ((i2 * getResources().getDisplayMetrics().density) + 0.5f);
    }

    public void setMargin(int i2) {
        this.f5754j.f5458u0 = i2;
    }

    public void setType(int i2) {
        this.f5752h = i2;
    }
}
