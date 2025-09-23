package p002A1;

import android.content.Intent;
import android.content.SharedPreferences;
import nfc.share.nfcshare.LoginActivity;
import nfc.share.nfcshare.MainActivity;
import p011D1.C0128r;
import tkbmmn.ghwbbf.irvjzy.R;

/* renamed from: A1.r */
/* loaded from: classes.dex */
public final class RunnableC0036r implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f77a;

    /* renamed from: b */
    public final /* synthetic */ MainActivity f78b;

    public /* synthetic */ RunnableC0036r(MainActivity mainActivity, int i2) {
        this.f77a = i2;
        this.f78b = mainActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        MainActivity mainActivity = this.f78b;
        switch (this.f77a) {
            case 0:
                mainActivity.f5002c0.show();
                break;
            case 1:
                C0128r c0128r = AbstractC0020b.f48a;
                SharedPreferences.Editor editorEdit = mainActivity.getSharedPreferences("UserSession", 0).edit();
                editorEdit.clear();
                editorEdit.apply();
                mainActivity.startActivity(new Intent(mainActivity, (Class<?>) LoginActivity.class));
                mainActivity.finish();
                break;
            default:
                mainActivity.f5009y.setImageResource(R.drawable.circle_dot_timeout);
                break;
        }
    }
}
