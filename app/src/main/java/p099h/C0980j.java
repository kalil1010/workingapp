package p099h;

import p033L1.AbstractC0364l;
import p105j.C1112m1;

/* renamed from: h.j */
/* loaded from: classes.dex */
public final class C0980j extends AbstractC0364l {

    /* renamed from: f */
    public final /* synthetic */ int f4123f;

    /* renamed from: g */
    public boolean f4124g;

    /* renamed from: h */
    public int f4125h;

    /* renamed from: i */
    public final /* synthetic */ Object f4126i;

    public C0980j(C0981k c0981k) {
        this.f4123f = 0;
        this.f4126i = c0981k;
        this.f4124g = false;
        this.f4125h = 0;
    }

    @Override // p028K.InterfaceC0249Y
    /* renamed from: a */
    public final void mo722a() {
        switch (this.f4123f) {
            case 0:
                int i2 = this.f4125h + 1;
                this.f4125h = i2;
                C0981k c0981k = (C0981k) this.f4126i;
                if (i2 == c0981k.f4127a.size()) {
                    AbstractC0364l abstractC0364l = c0981k.f4130d;
                    if (abstractC0364l != null) {
                        abstractC0364l.mo722a();
                    }
                    this.f4125h = 0;
                    this.f4124g = false;
                    c0981k.f4131e = false;
                    break;
                }
                break;
            default:
                if (!this.f4124g) {
                    ((C1112m1) this.f4126i).f4568a.setVisibility(this.f4125h);
                    break;
                }
                break;
        }
    }

    @Override // p033L1.AbstractC0364l, p028K.InterfaceC0249Y
    /* renamed from: d */
    public void mo723d() {
        switch (this.f4123f) {
            case 1:
                this.f4124g = true;
                break;
        }
    }

    @Override // p033L1.AbstractC0364l, p028K.InterfaceC0249Y
    /* renamed from: g */
    public final void mo724g() {
        switch (this.f4123f) {
            case 0:
                if (!this.f4124g) {
                    this.f4124g = true;
                    AbstractC0364l abstractC0364l = ((C0981k) this.f4126i).f4130d;
                    if (abstractC0364l != null) {
                        abstractC0364l.mo724g();
                        break;
                    }
                }
                break;
            default:
                ((C1112m1) this.f4126i).f4568a.setVisibility(0);
                break;
        }
    }

    public C0980j(C1112m1 c1112m1, int i2) {
        this.f4123f = 1;
        this.f4126i = c1112m1;
        this.f4125h = i2;
        this.f4124g = false;
    }
}
