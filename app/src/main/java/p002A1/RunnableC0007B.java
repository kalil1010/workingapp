package p002A1;

import android.widget.Toast;

/* renamed from: A1.B */
/* loaded from: classes.dex */
public final class RunnableC0007B implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f14a;

    /* renamed from: b */
    public final /* synthetic */ C0038t f15b;

    public /* synthetic */ RunnableC0007B(C0038t c0038t, int i2) {
        this.f14a = i2;
        this.f15b = c0038t;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f14a) {
            case 0:
                this.f15b.f81a.f4990Q.setText("");
                break;
            default:
                Toast.makeText(this.f15b.f81a, "未找到服务器配置信息", 0).show();
                break;
        }
    }
}
