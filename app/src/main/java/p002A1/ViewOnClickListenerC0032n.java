package p002A1;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.view.View;
import android.widget.Toast;
import nfc.share.nfcshare.MainActivity;
import nfc.share.nfcshare.model.MqttChannel;
import p008C1.C0097f;
import tkbmmn.ghwbbf.irvjzy.R;

/* renamed from: A1.n */
/* loaded from: classes.dex */
public final class ViewOnClickListenerC0032n implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ int f71a;

    /* renamed from: b */
    public final /* synthetic */ MainActivity f72b;

    public /* synthetic */ ViewOnClickListenerC0032n(MainActivity mainActivity, int i2) {
        this.f71a = i2;
        this.f72b = mainActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        final MainActivity mainActivity = this.f72b;
        switch (this.f71a) {
            case 0:
                if (!AbstractC0018M.f43i) {
                    mainActivity.f4974A.setImageResource(R.drawable.apple_on);
                    AbstractC0018M.f43i = true;
                    Toast.makeText(mainActivity, "显示卡号：已开启", 0).show();
                    break;
                } else {
                    mainActivity.f4974A.setImageResource(R.drawable.apple_off);
                    AbstractC0018M.f43i = false;
                    Toast.makeText(mainActivity, "显示卡号：已关闭", 0).show();
                    break;
                }
            case 1:
                mainActivity.f5006v.m1591d();
                break;
            default:
                int i2 = MainActivity.f4973g0;
                new AlertDialog.Builder(mainActivity, R.style.MyAlertDialog).setIcon(R.drawable.baseline_warning_24).setTitle("提示").setMessage("确认是否退出登录？").setCancelable(true).setNegativeButton("取消", new DialogInterfaceOnClickListenerC0028j()).setPositiveButton("确认", new DialogInterface.OnClickListener() { // from class: A1.k
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i3) {
                        int i4 = MainActivity.f4973g0;
                        MainActivity mainActivity2 = mainActivity;
                        C0027i c0027i = AbstractC0018M.f36b;
                        if (c0027i != null) {
                            c0027i.m112P(MqttChannel.OFFLINE_CHANNEL, AbstractC0018M.f40f + "已离线");
                        }
                        mainActivity2.f4993T.m43b();
                        C0027i c0027i2 = AbstractC0018M.f36b;
                        if (c0027i2 != null && C0027i.f62e) {
                            c0027i2.m137u();
                            C0027i c0027i3 = AbstractC0018M.f36b;
                            C0097f c0097f = (C0097f) c0027i3.f67d;
                            if (c0097f != null) {
                                c0097f.m291b();
                                AbstractC0018M.f44j = null;
                                AbstractC0018M.m45a("已断开");
                                c0027i3.f67d = null;
                            }
                        }
                        mainActivity2.m2877v();
                    }
                }).show();
                break;
        }
    }
}
