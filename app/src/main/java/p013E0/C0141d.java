package p013E0;

import com.google.android.material.carousel.CarouselLayoutManager;

/* renamed from: E0.d */
/* loaded from: classes.dex */
public final class C0141d {

    /* renamed from: a */
    public final int f488a;

    /* renamed from: b */
    public final /* synthetic */ int f489b;

    /* renamed from: c */
    public final /* synthetic */ CarouselLayoutManager f490c;

    public C0141d(int i2) {
        this.f488a = i2;
    }

    /* renamed from: a */
    public final int m385a() {
        switch (this.f489b) {
            case 0:
                return 0;
            default:
                CarouselLayoutManager carouselLayoutManager = this.f490c;
                if (carouselLayoutManager.m2069B0()) {
                    return carouselLayoutManager.f3765n;
                }
                return 0;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C0141d(CarouselLayoutManager carouselLayoutManager, int i2) {
        this(1);
        this.f489b = i2;
        switch (i2) {
            case 1:
                this.f490c = carouselLayoutManager;
                this(0);
                break;
            default:
                this.f490c = carouselLayoutManager;
                break;
        }
    }
}
