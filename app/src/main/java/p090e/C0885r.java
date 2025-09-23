package p090e;

import android.content.Context;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.os.PowerManager;
import androidx.fragment.app.AbstractC0703f;
import p002A1.C0027i;

/* renamed from: e.r */
/* loaded from: classes.dex */
public final class C0885r extends AbstractC0703f {

    /* renamed from: c */
    public final /* synthetic */ int f3633c = 1;

    /* renamed from: d */
    public final /* synthetic */ LayoutInflaterFactory2C0888u f3634d;

    /* renamed from: e */
    public final Object f3635e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0885r(LayoutInflaterFactory2C0888u layoutInflaterFactory2C0888u, C0027i c0027i) {
        super(layoutInflaterFactory2C0888u);
        this.f3634d = layoutInflaterFactory2C0888u;
        this.f3635e = c0027i;
    }

    @Override // androidx.fragment.app.AbstractC0703f
    /* renamed from: e */
    public final IntentFilter mo1728e() {
        switch (this.f3633c) {
            case 0:
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
                return intentFilter;
            default:
                IntentFilter intentFilter2 = new IntentFilter();
                intentFilter2.addAction("android.intent.action.TIME_SET");
                intentFilter2.addAction("android.intent.action.TIMEZONE_CHANGED");
                intentFilter2.addAction("android.intent.action.TIME_TICK");
                return intentFilter2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003c  */
    @Override // androidx.fragment.app.AbstractC0703f
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int mo1729f() {
        /*
            Method dump skipped, instructions count: 266
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p090e.C0885r.mo1729f():int");
    }

    @Override // androidx.fragment.app.AbstractC0703f
    /* renamed from: h */
    public final void mo1731h() throws IllegalAccessException, NoSuchFieldException, PackageManager.NameNotFoundException, SecurityException, IllegalArgumentException {
        switch (this.f3633c) {
            case 0:
                this.f3634d.m2259m(true, true);
                break;
            default:
                this.f3634d.m2259m(true, true);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0885r(LayoutInflaterFactory2C0888u layoutInflaterFactory2C0888u, Context context) {
        super(layoutInflaterFactory2C0888u);
        this.f3634d = layoutInflaterFactory2C0888u;
        this.f3635e = (PowerManager) context.getApplicationContext().getSystemService("power");
    }
}
