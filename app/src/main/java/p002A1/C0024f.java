package p002A1;

import android.widget.RadioGroup;
import nfc.share.nfcshare.LoginActivity;
import p073Z0.C0608d;
import tkbmmn.ghwbbf.irvjzy.R;

/* renamed from: A1.f */
/* loaded from: classes.dex */
public final class C0024f implements RadioGroup.OnCheckedChangeListener {

    /* renamed from: a */
    public final /* synthetic */ LoginActivity f54a;

    public C0024f(LoginActivity loginActivity) {
        this.f54a = loginActivity;
    }

    @Override // android.widget.RadioGroup.OnCheckedChangeListener
    public final void onCheckedChanged(RadioGroup radioGroup, int i2) {
        LoginActivity loginActivity = this.f54a;
        if (i2 == R.id.rb_server) {
            C0608d c0608d = AbstractC0018M.f35a;
            loginActivity.getSharedPreferences("ServerSettings", 0).edit().putBoolean("isPosMode", true).apply();
            AbstractC0018M.f40f = "接收端";
        } else {
            C0608d c0608d2 = AbstractC0018M.f35a;
            loginActivity.getSharedPreferences("ServerSettings", 0).edit().putBoolean("isPosMode", false).apply();
            AbstractC0018M.f40f = "发送端";
        }
    }
}
