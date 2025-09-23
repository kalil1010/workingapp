package p001A0;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.view.View;
import android.widget.Toast;
import com.google.android.material.behavior.SwipeDismissBehavior;
import java.io.IOException;
import java.io.Serializable;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import nfc.share.nfcshare.MainActivity;
import nfc.share.nfcshare.model.CurrencyLookup;
import nfc.share.nfcshare.model.MqttChannel;
import nfc.share.nfcshare.model.NfcInfo;
import nfc.share.nfcshare.model.WSMessage;
import nfc.share.nfcshare.service.EmulationService;
import p002A1.AbstractC0018M;
import p002A1.C0027i;
import p002A1.C0038t;
import p002A1.RunnableC0037s;
import p003B.AbstractC0046b;
import p008C1.AbstractC0093b;
import p008C1.C0095d;
import p008C1.C0097f;
import p020H.C0175e;
import p028K.AbstractC0241P;
import p054T.C0506e;
import p073Z0.C0608d;
import p083c0.C0789c;
import p150z.AbstractC1413b;
import p150z.C1412a;

/* renamed from: A0.d */
/* loaded from: classes.dex */
public final class RunnableC0005d implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f8a;

    /* renamed from: b */
    public final Object f9b;

    /* renamed from: c */
    public final /* synthetic */ Object f10c;

    public /* synthetic */ RunnableC0005d(Object obj, int i2, Object obj2) {
        this.f8a = i2;
        this.f9b = obj;
        this.f10c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj = this.f9b;
        Object obj2 = this.f10c;
        switch (this.f8a) {
            case 0:
                C0506e c0506e = ((SwipeDismissBehavior) obj2).f3044a;
                if (c0506e == null || !c0506e.m1257g()) {
                    return;
                }
                WeakHashMap weakHashMap = AbstractC0241P.f815a;
                ((View) obj).postOnAnimation(this);
                return;
            case 1:
                String str = (String) obj;
                C0038t c0038t = (C0038t) obj2;
                MainActivity mainActivity = c0038t.f81a;
                if (mainActivity.f4988O != null) {
                    try {
                        MainActivity.m2874s(mainActivity, mainActivity.f5009y, Double.parseDouble(str));
                    } catch (NumberFormatException e3) {
                        e3.printStackTrace();
                    }
                    boolean zContains = str.contains(".");
                    MainActivity mainActivity2 = c0038t.f81a;
                    if (!zContains) {
                        mainActivity2.f4988O.setText(str.concat("ms"));
                        return;
                    }
                    mainActivity2.f4988O.setText(str.substring(0, str.indexOf(46)) + "ms");
                    return;
                }
                return;
            case 2:
                String str2 = (String) obj;
                MainActivity mainActivity3 = (MainActivity) obj2;
                if (str2.contains("#")) {
                    if (str2.contains("roomName_301")) {
                        mainActivity3.f4991R.setText("房间加入失败");
                        Toast.makeText(mainActivity3, "房间加入失败", 0).show();
                        mainActivity3.f4979F.setVisibility(0);
                        return;
                    } else {
                        if (str2.contains("success#ok")) {
                            mainActivity3.f4979F.setVisibility(8);
                            return;
                        }
                        return;
                    }
                }
                if (str2.equals("双方建立-连接成功")) {
                    mainActivity3.f4989P.setText("配对成功");
                    return;
                }
                if (str2.contains("正在连接服务器")) {
                    mainActivity3.f4989P.setText("正在配对");
                    return;
                }
                if (str2.contains("等待对方连接")) {
                    mainActivity3.f4989P.setText("正在配对");
                    return;
                }
                if (str2.equals("接收端已离线")) {
                    mainActivity3.f4989P.setText("正在配对");
                    return;
                } else if (str2.equals("发送端已离线")) {
                    mainActivity3.f4989P.setText("正在配对");
                    return;
                } else {
                    if (str2.equals("已断开")) {
                        mainActivity3.f4989P.setText("正在配对");
                        return;
                    }
                    return;
                }
            case 3:
                C0004c c0004c = ((C0097f) ((C0004c) obj2).f7b).f239g;
                c0004c.getClass();
                WSMessage wSMessage = (WSMessage) new C0608d().m1409b((String) obj, WSMessage.class);
                if (!wSMessage.getType().equals("error") || wSMessage.getMessage() == null) {
                    AbstractC0018M.m45a("success#ok");
                } else {
                    AbstractC0018M.m45a(wSMessage.getType() + "#" + wSMessage.getMessage());
                }
                String text = wSMessage.getText();
                if (text == null || text.isEmpty()) {
                    return;
                }
                NfcInfo nfcInfo = (NfcInfo) AbstractC0018M.f35a.m1409b(text, NfcInfo.class);
                String cardBytes = nfcInfo.getCardBytes();
                nfcInfo.getSender().equals("发送端");
                String[] strArr = {cardBytes};
                if (strArr[0].contains("325041592e5359532e4444463031")) {
                    String strM284c = C0095d.m284c(AbstractC0018M.m46b(strArr[0]));
                    MainActivity mainActivity4 = AbstractC0018M.f39e;
                    if (mainActivity4 != null && !mainActivity4.isDestroyed() && !strM284c.isEmpty()) {
                        AbstractC0018M.f39e.m2878w(strM284c);
                    }
                }
                String upperCase = strArr[0].toUpperCase();
                if (upperCase.contains("80A") && upperCase.length() >= 64) {
                    try {
                        String strSubstring = upperCase.substring(24, 36);
                        String strSubstring2 = upperCase.substring(36, 50);
                        String strSubstring3 = upperCase.substring(50, 64);
                        byte[] bArrM46b = AbstractC0018M.m46b(strSubstring2.equals(strSubstring3) ? strSubstring2.substring(strSubstring2.length() - 4) : strSubstring3.substring(strSubstring3.length() - 4));
                        int i2 = (bArrM46b[1] & 255) | ((bArrM46b[0] & 255) << 8);
                        String strSubstring4 = strSubstring.substring(0, 8);
                        String strSubstring5 = strSubstring.substring(8);
                        String strReplaceFirst = strSubstring4.replaceFirst("^0+(?!$)", "");
                        if (strReplaceFirst.isEmpty()) {
                            strReplaceFirst = "0";
                        }
                        String strReplaceAll = strSubstring5.replaceAll("0+$", "");
                        if (strReplaceAll.isEmpty()) {
                            strReplaceAll = "00";
                        }
                        if (strReplaceAll.length() > 2) {
                            strReplaceAll = strReplaceAll.substring(0, 2);
                        } else if (strReplaceAll.length() == 1) {
                            strReplaceAll = strReplaceAll.concat("0");
                        }
                        AbstractC0018M.f39e.m2875t(CurrencyLookup.lookup(i2), strReplaceFirst + "." + strReplaceAll);
                    } catch (Exception e4) {
                        e4.getMessage();
                    }
                }
                if (nfcInfo.getSender().equals(AbstractC0018M.f40f)) {
                    return;
                }
                int i3 = AbstractC0093b.f224a[nfcInfo.getChannel().ordinal()];
                C0027i c0027i = (C0027i) c0004c.f7b;
                switch (i3) {
                    case 1:
                        try {
                            c0027i.m112P(MqttChannel.SEND_CHANNEL, AbstractC0018M.f38d.m288e(nfcInfo.getCardBytes()));
                            return;
                        } catch (IOException unused) {
                            return;
                        }
                    case 2:
                        EmulationService emulationService = AbstractC0018M.f41g;
                        if (emulationService != null) {
                            emulationService.sendResponseApdu(AbstractC0018M.m46b(nfcInfo.getCardBytes()));
                            return;
                        }
                        return;
                    case 3:
                        String str3 = new String(AbstractC0018M.m46b(nfcInfo.getCardBytes().toString()));
                        Intent intent = new Intent("nfc.share.nfcshare");
                        intent.putExtra("card_info_string", str3);
                        C0789c.m1999a((Context) c0027i.f65b).m2000b(intent);
                        return;
                    case 4:
                        if (AbstractC0018M.f44j == null) {
                            Intent intent2 = new Intent("nfc.share.nfcshare");
                            intent2.putExtra("card_removed", true);
                            C0789c.m1999a((Context) c0027i.f65b).m2000b(intent2);
                            return;
                        }
                        return;
                    case 5:
                        AbstractC0018M.m45a("双方建立-连接成功");
                        c0027i.m112P(MqttChannel.ANSWER_CHANNEL, "双方建立-连接成功");
                        if (AbstractC0018M.f44j != null) {
                            c0027i.m112P(MqttChannel.CARD_INFO_CHANNEL, AbstractC0018M.m47c(AbstractC0018M.f44j.toString().getBytes()));
                            return;
                        }
                        return;
                    case 6:
                        if (AbstractC0018M.f44j != null) {
                            c0027i.m112P(MqttChannel.CARD_INFO_CHANNEL, AbstractC0018M.m47c(AbstractC0018M.f44j.toString().getBytes()));
                        }
                        AbstractC0018M.m45a("双方建立-连接成功");
                        return;
                    case 7:
                        AbstractC0018M.m45a(nfcInfo.getCardBytes());
                        if (AbstractC0018M.f44j == null) {
                            AbstractC0018M.m45a(nfcInfo.getCardBytes());
                            Intent intent3 = new Intent("nfc.share.nfcshare");
                            intent3.putExtra("card_removed", true);
                            C0789c.m1999a((Context) c0027i.f65b).m2000b(intent3);
                            return;
                        }
                        return;
                    default:
                        return;
                }
            case 4:
                C0004c c0004c2 = ((C0097f) ((C0004c) obj2).f7b).f239g;
                ((Exception) obj).getMessage();
                c0004c2.getClass();
                C0027i.f62e = false;
                C0038t c0038t2 = (C0038t) ((C0027i) c0004c2.f7b).f66c;
                if (c0038t2 != null) {
                    c0038t2.f81a.runOnUiThread(new RunnableC0037s(c0038t2, false));
                    return;
                }
                return;
            case 5:
                AbstractC0046b abstractC0046b = (AbstractC0046b) ((C0004c) obj).f7b;
                if (abstractC0046b != null) {
                    abstractC0046b.mo173h((Typeface) obj2);
                    return;
                }
                return;
            case 6:
                ((C0175e) obj).m477a(obj2);
                return;
            case 7:
                ((C1412a) obj).f6085a = obj2;
                return;
            case 8:
                ((Application) obj).unregisterActivityLifecycleCallbacks((C1412a) obj2);
                return;
            default:
                try {
                    Method method = AbstractC1413b.f6094d;
                    if (method != null) {
                        method.invoke(obj, obj2, Boolean.FALSE, "AppCompat recreation");
                    } else {
                        AbstractC1413b.f6095e.invoke(obj, obj2, Boolean.FALSE);
                    }
                    return;
                } catch (RuntimeException e5) {
                    if (e5.getClass() == RuntimeException.class && e5.getMessage() != null && e5.getMessage().startsWith("Unable to stop")) {
                        throw e5;
                    }
                    return;
                } catch (Throwable unused2) {
                    return;
                }
        }
    }

    public /* synthetic */ RunnableC0005d(Object obj, Serializable serializable, int i2) {
        this.f8a = i2;
        this.f10c = obj;
        this.f9b = serializable;
    }

    public RunnableC0005d(SwipeDismissBehavior swipeDismissBehavior, View view, boolean z2) {
        this.f8a = 0;
        this.f10c = swipeDismissBehavior;
        this.f9b = view;
    }
}
