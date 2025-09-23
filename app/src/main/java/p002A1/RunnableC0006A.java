package p002A1;

import android.widget.Toast;

/* renamed from: A1.A */
/* loaded from: classes.dex */
public final class RunnableC0006A implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f11a;

    /* renamed from: b */
    public final /* synthetic */ String f12b;

    /* renamed from: c */
    public final /* synthetic */ C0038t f13c;

    public /* synthetic */ RunnableC0006A(C0038t c0038t, String str, int i2) {
        this.f11a = i2;
        this.f13c = c0038t;
        this.f12b = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f11a) {
            case 0:
                this.f13c.f81a.f4990Q.setText("到期时间：" + this.f12b);
                break;
            default:
                C0038t c0038t = this.f13c;
                if (c0038t.f81a.f5002c0.isShowing()) {
                    c0038t.f81a.f5002c0.dismiss();
                }
                Toast.makeText(c0038t.f81a, this.f12b, 0).show();
                c0038t.f81a.m2877v();
                break;
        }
    }
}
