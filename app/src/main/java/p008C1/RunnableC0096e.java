package p008C1;

import nfc.share.nfcshare.model.MqttChannel;
import nfc.share.nfcshare.model.WSMessage;
import p001A0.C0004c;
import p002A1.AbstractC0018M;
import p002A1.C0027i;
import p002A1.C0038t;
import p002A1.RunnableC0037s;
import p073Z0.C0608d;

/* renamed from: C1.e */
/* loaded from: classes.dex */
public final class RunnableC0096e implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f231a;

    /* renamed from: b */
    public final /* synthetic */ C0004c f232b;

    public /* synthetic */ RunnableC0096e(C0004c c0004c, int i2) {
        this.f231a = i2;
        this.f232b = c0004c;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f231a) {
            case 0:
                C0004c c0004c = ((C0097f) this.f232b.f7b).f239g;
                c0004c.getClass();
                AbstractC0018M.m45a("已连接");
                C0027i.f62e = true;
                C0027i c0027i = (C0027i) c0004c.f7b;
                C0038t c0038t = (C0038t) c0027i.f66c;
                if (c0038t != null) {
                    c0038t.f81a.runOnUiThread(new RunnableC0037s(c0038t, true));
                }
                C0097f c0097f = (C0097f) c0027i.f67d;
                if (c0097f != null && c0097f.f237e) {
                    ((C0097f) c0027i.f67d).m292c(new C0608d().m1411d(new WSMessage("join", AbstractC0018M.f42h, "ssss", "", 2)));
                    AbstractC0018M.m45a("等待对方连接");
                    c0027i.m112P(MqttChannel.NOTIFICATION_CHANNEL, "双方建立-连接成功");
                    if (AbstractC0018M.f44j != null) {
                        c0027i.m112P(MqttChannel.CARD_INFO_CHANNEL, AbstractC0018M.m47c(AbstractC0018M.f44j.toString().getBytes()));
                        break;
                    }
                }
                break;
            default:
                C0004c c0004c2 = ((C0097f) this.f232b.f7b).f239g;
                c0004c2.getClass();
                C0027i.f62e = false;
                C0038t c0038t2 = (C0038t) ((C0027i) c0004c2.f7b).f66c;
                if (c0038t2 != null) {
                    c0038t2.f81a.runOnUiThread(new RunnableC0037s(c0038t2, false));
                    break;
                }
                break;
        }
    }
}
