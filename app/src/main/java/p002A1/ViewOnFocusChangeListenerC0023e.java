package p002A1;

import android.view.KeyEvent;
import android.view.View;
import androidx.appcompat.widget.SearchView;
import nfc.share.nfcshare.LoginActivity;

/* renamed from: A1.e */
/* loaded from: classes.dex */
public final class ViewOnFocusChangeListenerC0023e implements View.OnFocusChangeListener {

    /* renamed from: a */
    public final /* synthetic */ int f52a;

    /* renamed from: b */
    public final /* synthetic */ KeyEvent.Callback f53b;

    public /* synthetic */ ViewOnFocusChangeListenerC0023e(KeyEvent.Callback callback, int i2) {
        this.f52a = i2;
        this.f53b = callback;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z2) {
        switch (this.f52a) {
            case 0:
                LoginActivity loginActivity = (LoginActivity) this.f53b;
                if (!z2) {
                    loginActivity.f4968v.setHint("");
                    break;
                } else {
                    loginActivity.f4968v.setHint("请输入用户名");
                    break;
                }
            case 1:
                LoginActivity loginActivity2 = (LoginActivity) this.f53b;
                if (!z2) {
                    loginActivity2.f4969w.setHint("");
                    break;
                } else {
                    loginActivity2.f4969w.setHint("请输入密码");
                    break;
                }
            default:
                SearchView searchView = (SearchView) this.f53b;
                View.OnFocusChangeListener onFocusChangeListener = searchView.f2166K;
                if (onFocusChangeListener != null) {
                    onFocusChangeListener.onFocusChange(searchView, z2);
                    break;
                }
                break;
        }
    }
}
