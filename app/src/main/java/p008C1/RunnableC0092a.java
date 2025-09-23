package p008C1;

import android.content.Context;
import androidx.emoji2.text.C0672k;
import androidx.emoji2.text.C0675n;
import androidx.emoji2.text.C0676o;
import androidx.emoji2.text.InterfaceC0670i;
import java.util.concurrent.ThreadPoolExecutor;
import nfc.share.nfcshare.model.MqttChannel;
import nfc.share.nfcshare.model.NfcInfo;
import nfc.share.nfcshare.model.WSMessage;
import p001A0.C0004c;
import p002A1.AbstractC0018M;
import p002A1.C0027i;
import p033L1.AbstractC0356d;
import p033L1.AbstractC0364l;
import p073Z0.C0608d;

/* renamed from: C1.a */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0092a implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f220a;

    /* renamed from: b */
    public final /* synthetic */ Object f221b;

    /* renamed from: c */
    public final /* synthetic */ Object f222c;

    /* renamed from: d */
    public final /* synthetic */ Object f223d;

    public /* synthetic */ RunnableC0092a(Object obj, Object obj2, Object obj3, int i2) {
        this.f220a = i2;
        this.f221b = obj;
        this.f222c = obj2;
        this.f223d = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f220a) {
            case 0:
                String str = (String) this.f222c;
                MqttChannel mqttChannel = (MqttChannel) this.f223d;
                C0027i c0027i = (C0027i) this.f221b;
                c0027i.getClass();
                try {
                    NfcInfo nfcInfo = new NfcInfo(str, AbstractC0018M.f40f, mqttChannel);
                    if (((C0097f) c0027i.f67d).f237e) {
                        C0608d c0608d = AbstractC0018M.f35a;
                        ((C0097f) c0027i.f67d).m292c(c0608d.m1411d(new WSMessage("message", "", c0608d.m1411d(nfcInfo), "", 2)));
                        return;
                    }
                    return;
                } catch (Exception e3) {
                    e3.getMessage();
                    return;
                }
            default:
                C0004c c0004c = (C0004c) this.f221b;
                AbstractC0364l abstractC0364l = (AbstractC0364l) this.f222c;
                ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) this.f223d;
                c0004c.getClass();
                try {
                    C0676o c0676oM960j = AbstractC0356d.m960j((Context) c0004c.f7b);
                    if (c0676oM960j == null) {
                        throw new RuntimeException("EmojiCompat font provider not available on this device.");
                    }
                    C0675n c0675n = (C0675n) ((InterfaceC0670i) c0676oM960j.f2391b);
                    synchronized (c0675n.f2418d) {
                        c0675n.f2420f = threadPoolExecutor;
                    }
                    ((InterfaceC0670i) c0676oM960j.f2391b).mo17d(new C0672k(abstractC0364l, threadPoolExecutor));
                    return;
                } catch (Throwable th) {
                    abstractC0364l.mo1020U(th);
                    threadPoolExecutor.shutdown();
                    return;
                }
        }
    }
}
