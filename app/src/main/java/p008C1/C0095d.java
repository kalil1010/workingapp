package p008C1;

import android.content.Intent;
import android.nfc.NfcAdapter;
import android.nfc.Tag;
import android.nfc.tech.IsoDep;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Timer;
import nfc.share.nfcshare.MainActivity;
import nfc.share.nfcshare.model.CardInfo;
import nfc.share.nfcshare.model.MqttChannel;
import p001A0.C0004c;
import p002A1.AbstractC0018M;
import p002A1.AbstractC0020b;
import p002A1.C0027i;
import p080b1.C0767e;
import p083c0.C0789c;
import p085c2.InterfaceC0807a;
import p120o0.AbstractC1252b;
import p120o0.C1253c;
import p123p0.C1266b;
import p125q0.C1276d;
import p125q0.C1278f;
import p125q0.C1279g;
import p125q0.C1280h;
import p130s0.C1322a;
import p142w0.AbstractC1385d;

/* renamed from: C1.d */
/* loaded from: classes.dex */
public final class C0095d implements NfcAdapter.ReaderCallback {

    /* renamed from: a */
    public IsoDep f226a;

    /* renamed from: b */
    public final NfcAdapter f227b;

    /* renamed from: c */
    public String f228c = "";

    /* renamed from: d */
    public Timer f229d;

    /* renamed from: e */
    public final MainActivity f230e;

    public C0095d(MainActivity mainActivity) {
        this.f230e = mainActivity;
        NfcAdapter defaultAdapter = NfcAdapter.getDefaultAdapter(mainActivity);
        this.f227b = defaultAdapter;
        if (defaultAdapter != null && defaultAdapter.isEnabled()) {
            this.f227b.enableReaderMode(mainActivity, this, 31, null);
        }
    }

    /* renamed from: c */
    public static String m284c(byte[] bArr) {
        byte[] bArr2;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayListM3159c = AbstractC1385d.m3159c(bArr, AbstractC1252b.f5078b, AbstractC1252b.f5072H);
        arrayListM3159c.size();
        Iterator it = arrayListM3159c.iterator();
        while (it.hasNext()) {
            C1253c c1253c = (C1253c) it.next();
            C1266b c1266b = c1253c.f5103a;
            C1266b c1266b2 = AbstractC1252b.f5072H;
            byte[] bArr3 = c1253c.f5104b;
            if (c1266b != c1266b2 || arrayList.size() == 0) {
                arrayList.add(bArr3);
            } else {
                byte[] bArr4 = (byte[]) arrayList.get(arrayList.size() - 1);
                if (bArr4 == null) {
                    bArr2 = (byte[]) bArr3.clone();
                } else {
                    byte[] bArr5 = new byte[bArr4.length + bArr3.length];
                    System.arraycopy(bArr4, 0, bArr5, 0, bArr4.length);
                    System.arraycopy(bArr3, 0, bArr5, bArr4.length, bArr3.length);
                    bArr2 = bArr5;
                }
                arrayList.add(bArr2);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            byte[] bArr6 = (byte[]) it2.next();
            arrayList2.add(AbstractC0018M.m47c(bArr6).toUpperCase());
            AbstractC0018M.m47c(bArr6).toUpperCase();
        }
        StringBuilder sb = new StringBuilder();
        Iterator it3 = arrayList2.iterator();
        if (it3.hasNext()) {
            while (true) {
                sb.append((CharSequence) it3.next());
                if (!it3.hasNext()) {
                    break;
                }
                sb.append((CharSequence) ",");
            }
        }
        return sb.toString();
    }

    /* renamed from: a */
    public final void m285a() {
        this.f226a = null;
        Timer timer = this.f229d;
        if (timer != null) {
            timer.cancel();
            this.f229d = null;
        }
        this.f228c = "";
    }

    /* renamed from: b */
    public final String m286b(Tag tag) throws IOException {
        C1279g c1279g;
        int i2 = 1;
        IsoDep isoDep = IsoDep.get(tag);
        this.f226a = isoDep;
        if (isoDep == null) {
            throw new IOException("不支持的卡片类型（需ISO 14443-4 Type A）");
        }
        if (!isoDep.isConnected()) {
            this.f226a.connect();
            this.f226a.setTimeout(120000);
        }
        String strM284c = m284c(AbstractC0018M.m46b(m288e("00A404000E325041592E5359532E444446303100")));
        String strM47c = AbstractC0018M.m47c(tag.getId());
        boolean z2 = AbstractC0018M.f43i;
        MainActivity mainActivity = this.f230e;
        if (!z2) {
            CardInfo cardInfo = new CardInfo("", String.valueOf(((int) (Math.random() * 3.0d)) + 1), new Date(), strM284c);
            Intent intent = new Intent("nfc.share.nfcshare");
            intent.putExtra("card_info", cardInfo);
            C0789c.m1999a(mainActivity).m2000b(intent);
            AbstractC0018M.f44j = cardInfo;
            AbstractC0018M.f36b.m112P(MqttChannel.CARD_INFO_CHANNEL, AbstractC0018M.m47c(cardInfo.toString().getBytes()));
            return strM47c;
        }
        if (AbstractC0018M.f44j == null) {
            CardInfo cardInfo2 = null;
            try {
                C0004c c0004c = new C0004c(i2, this.f226a);
                InterfaceC0807a interfaceC0807a = C1322a.f5639f;
                C0767e c0767e = new C0767e(12);
                C0027i c0027i = new C0027i(11);
                c0027i.f65b = c0004c;
                c0027i.f67d = c0767e;
                C1278f c1278fM3054b = c0027i.m134r().m3054b();
                c1278fM3054b.toString();
                String strM2973a = c1278fM3054b.m2973a();
                C1280h c1280h = c1278fM3054b.f5199c;
                Date date = c1280h != null ? c1280h.f5205c : null;
                if (date == null && (c1279g = c1278fM3054b.f5200d) != null) {
                    date = c1279g.f5203c;
                }
                String str = c1278fM3054b.f5198b.f4942c;
                ArrayList arrayList = c1278fM3054b.f5201e;
                if (arrayList != null && !arrayList.isEmpty()) {
                    ((C1276d) arrayList.get(0)).getClass();
                }
                cardInfo2 = new CardInfo(strM2973a, AbstractC0020b.m91e(mainActivity, strM2973a), date, strM284c);
            } catch (Exception unused) {
            }
            if (cardInfo2 != null) {
                cardInfo2.toString();
                AbstractC0018M.f36b.m112P(MqttChannel.CARD_INFO_CHANNEL, AbstractC0018M.m47c(cardInfo2.toString().getBytes()));
                AbstractC0018M.f44j = cardInfo2;
                if (C0027i.f62e) {
                    Intent intent2 = new Intent("nfc.share.nfcshare");
                    intent2.putExtra("card_info", cardInfo2);
                    C0789c.m1999a(mainActivity).m2000b(intent2);
                }
            }
        }
        return strM47c;
    }

    /* renamed from: d */
    public final void m287d() {
        C0027i c0027i = AbstractC0018M.f36b;
        if (c0027i != null) {
            c0027i.m112P(MqttChannel.CARD_REMOVED, "卡片已移出感应区");
            AbstractC0018M.f44j = null;
            Intent intent = new Intent("nfc.share.nfcshare");
            intent.putExtra("card_removed", true);
            C0789c.m1999a(this.f230e).m2000b(intent);
            m285a();
        }
    }

    /* renamed from: e */
    public final String m288e(String str) throws IOException {
        try {
            IsoDep isoDep = this.f226a;
            if (isoDep == null || !isoDep.isConnected()) {
                throw new IOException("连接未建立");
            }
            return AbstractC0018M.m47c(this.f226a.transceive(AbstractC0018M.m46b(str)));
        } catch (SecurityException e3) {
            e3.getMessage();
            return "";
        }
    }

    /* renamed from: f */
    public final void m289f() {
        Timer timer = this.f229d;
        if (timer != null) {
            timer.cancel();
        }
        Timer timer2 = new Timer("NFCCardCheckTimer");
        this.f229d = timer2;
        timer2.schedule(new C0094c(this), 1500L, 1500L);
    }

    @Override // android.nfc.NfcAdapter.ReaderCallback
    public final void onTagDiscovered(Tag tag) {
        if (tag == null) {
            return;
        }
        try {
            AbstractC0018M.f37c.clear();
            this.f228c = m286b(tag);
            m289f();
            AbstractC0018M.f36b.m112P(MqttChannel.LOG_CHANNEL, "卡片连接成功 | UID: ".concat(this.f228c));
        } catch (IOException e3) {
            e3.getMessage();
            m285a();
        } catch (Exception unused) {
            m285a();
        }
    }
}
