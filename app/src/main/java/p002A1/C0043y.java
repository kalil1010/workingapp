package p002A1;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.fragment.app.AbstractC0703f;
import nfc.share.nfcshare.MainActivity;
import nfc.share.nfcshare.model.CardInfo;
import tkbmmn.ghwbbf.irvjzy.R;

/* renamed from: A1.y */
/* loaded from: classes.dex */
public final class C0043y extends BroadcastReceiver {

    /* renamed from: a */
    public final /* synthetic */ int f96a;

    /* renamed from: b */
    public final /* synthetic */ Object f97b;

    public /* synthetic */ C0043y(int i2, Object obj) {
        this.f96a = i2;
        this.f97b = obj;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String str;
        String str2;
        switch (this.f96a) {
            case 0:
                if (intent != null) {
                    boolean zHasExtra = intent.hasExtra("card_info");
                    MainActivity mainActivity = (MainActivity) this.f97b;
                    if (!zHasExtra) {
                        if (!intent.hasExtra("card_removed")) {
                            if (intent.hasExtra("card_info_string")) {
                                String stringExtra = intent.getStringExtra("card_info_string");
                                mainActivity.f4977D.setVisibility(0);
                                if (stringExtra != null && stringExtra.contains("&")) {
                                    String[] strArrSplit = stringExtra.split("&");
                                    if (strArrSplit.length == 4) {
                                        String[] strArrSplit2 = strArrSplit[2].split(",");
                                        mainActivity.m2878w(strArrSplit[2]);
                                        if (strArrSplit2.length == 0 || (str = strArrSplit2[0]) == null || str.isEmpty()) {
                                            mainActivity.f4978E.setBackgroundResource(R.drawable.card_home);
                                            mainActivity.f4987N.setVisibility(0);
                                            mainActivity.f4992S.setVisibility(0);
                                            mainActivity.f4988O.setVisibility(4);
                                            mainActivity.f4987N.setText("换张卡试试看...");
                                            mainActivity.f4987N.setTextColor(-65536);
                                        } else {
                                            if ("A000000333010101".contains(strArrSplit2[0]) || "A000000333010102".contains(strArrSplit2[0]) || "A000000333010103".contains(strArrSplit2[0]) || "A000000333010106".contains(strArrSplit2[0])) {
                                                mainActivity.f4978E.setBackgroundResource(R.drawable.unionpay);
                                            } else if ("A0000000041010".contains(strArrSplit2[0]) || "A0000000042203".equals(strArrSplit2[0])) {
                                                mainActivity.f4978E.setBackgroundResource(R.drawable.mastercard);
                                            } else if ("A0000000031010".contains(strArrSplit2[0])) {
                                                mainActivity.f4978E.setBackgroundResource(R.drawable.visa);
                                            } else if ("A000000025010901".contains(strArrSplit2[0]) || "A000000025021001".contains(strArrSplit2[0]) || "A00000002502100104".contains(strArrSplit2[0]) || "A000000025011001".contains(strArrSplit2[0]) || "A00000002501100104".contains(strArrSplit2[0])) {
                                                mainActivity.f4978E.setBackgroundResource(R.drawable.american);
                                            } else {
                                                mainActivity.f4978E.setBackgroundResource(R.drawable.american);
                                            }
                                            mainActivity.f4982I.setText(strArrSplit[0]);
                                            mainActivity.f4986M.setText(strArrSplit2[0]);
                                            mainActivity.f4983J.setText(strArrSplit[1]);
                                            mainActivity.f4992S.setVisibility(4);
                                            mainActivity.f4977D.setVisibility(0);
                                            mainActivity.f4987N.setText("");
                                            mainActivity.f4987N.setVisibility(4);
                                            mainActivity.f4988O.setVisibility(0);
                                            mainActivity.f4993T.f28e = AbstractC0020b.m88b(mainActivity);
                                            mainActivity.f4993T.m42a(AbstractC0020b.m87a(mainActivity));
                                        }
                                    }
                                    mainActivity.f4993T.f28e = AbstractC0020b.m88b(mainActivity);
                                    mainActivity.f4993T.m42a(AbstractC0020b.m87a(mainActivity));
                                    break;
                                }
                            }
                        } else {
                            intent.getBooleanExtra("card_removed", false);
                            mainActivity.f4978E.setBackgroundResource(R.drawable.card_home);
                            mainActivity.f4987N.setVisibility(0);
                            mainActivity.f4992S.setVisibility(0);
                            mainActivity.f4988O.setVisibility(4);
                            mainActivity.f4987N.setText("卡片已移除");
                            mainActivity.f4987N.setTextColor(-16777216);
                            mainActivity.f4984K.setText("");
                            mainActivity.f4983J.setText("");
                            mainActivity.f4986M.setText("");
                            mainActivity.f4982I.setText("");
                            mainActivity.f4993T.m43b();
                            break;
                        }
                    } else {
                        CardInfo cardInfo = (CardInfo) intent.getSerializableExtra("card_info");
                        if (cardInfo != null && C0027i.f62e) {
                            cardInfo.getLabel();
                            String[] strArrSplit3 = cardInfo.getLabel().split(",");
                            if (strArrSplit3.length == 0 || (str2 = strArrSplit3[0]) == null || str2.isEmpty()) {
                                mainActivity.f4978E.setBackgroundResource(R.drawable.card_home);
                                mainActivity.f4987N.setVisibility(0);
                                mainActivity.f4992S.setVisibility(0);
                                mainActivity.f4988O.setVisibility(4);
                                mainActivity.f4987N.setText("换张卡试试看...");
                                mainActivity.f4987N.setTextColor(-65536);
                            } else {
                                if ("A000000333010101".contains(strArrSplit3[0]) || "A000000333010102".contains(strArrSplit3[0]) || "A000000333010103".contains(strArrSplit3[0]) || "A000000333010106".contains(strArrSplit3[0])) {
                                    mainActivity.f4978E.setBackgroundResource(R.drawable.unionpay);
                                } else if ("A0000000041010".contains(strArrSplit3[0]) || "A0000000042203".equals(strArrSplit3[0])) {
                                    mainActivity.f4978E.setBackgroundResource(R.drawable.mastercard);
                                } else if ("A0000000031010".contains(strArrSplit3[0])) {
                                    mainActivity.f4978E.setBackgroundResource(R.drawable.visa);
                                } else if ("A000000025010901".contains(strArrSplit3[0]) || "A000000025021001".contains(strArrSplit3[0]) || "A00000002502100104".contains(strArrSplit3[0]) || "A000000025011001".contains(strArrSplit3[0]) || "A00000002501100104".contains(strArrSplit3[0])) {
                                    mainActivity.f4978E.setBackgroundResource(R.drawable.american);
                                } else {
                                    mainActivity.f4978E.setBackgroundResource(R.drawable.american);
                                    mainActivity.f4984K.setText(cardInfo.getLabel());
                                }
                                mainActivity.f4982I.setText(cardInfo.getNumber());
                                mainActivity.f4986M.setText(strArrSplit3[0]);
                                mainActivity.f4992S.setVisibility(4);
                                mainActivity.f4977D.setVisibility(0);
                                mainActivity.f4987N.setText("");
                                mainActivity.f4987N.setVisibility(4);
                                mainActivity.f4988O.setVisibility(0);
                                mainActivity.f4993T.f28e = AbstractC0020b.m88b(mainActivity);
                                mainActivity.f4993T.m42a(AbstractC0020b.m87a(mainActivity));
                            }
                            mainActivity.f4983J.setText(cardInfo.getType());
                            break;
                        }
                    }
                }
                break;
            default:
                ((AbstractC0703f) this.f97b).mo1731h();
                break;
        }
    }
}
