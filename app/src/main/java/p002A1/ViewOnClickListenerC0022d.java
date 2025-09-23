package p002A1;

import android.text.Editable;
import android.text.TextUtils;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import androidx.drawerlayout.widget.DrawerLayout;
import com.google.android.material.datepicker.C0820l;
import nfc.share.nfcshare.LoginActivity;
import nfc.share.nfcshare.MainActivity;
import p001A0.C0004c;
import p011D1.C0121k;
import p011D1.C0128r;
import p011D1.C0130t;
import p011D1.C0132v;
import p021H1.C0190i;
import p064W0.C0558d;
import p064W0.C0564j;
import p064W0.C0577w;
import p073Z0.C0608d;

/* renamed from: A1.d */
/* loaded from: classes.dex */
public final /* synthetic */ class ViewOnClickListenerC0022d implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ int f50a;

    /* renamed from: b */
    public final /* synthetic */ Object f51b;

    public /* synthetic */ ViewOnClickListenerC0022d(int i2, Object obj) {
        this.f50a = i2;
        this.f51b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        boolean z2;
        EditText editText;
        Object obj = this.f51b;
        switch (this.f50a) {
            case 0:
                LoginActivity loginActivity = (LoginActivity) obj;
                loginActivity.f4968v.setError(null);
                loginActivity.f4969w.setError(null);
                String strTrim = loginActivity.f4968v.getText().toString().trim();
                String strTrim2 = loginActivity.f4969w.getText().toString().trim();
                if (TextUtils.isEmpty(strTrim2)) {
                    loginActivity.f4969w.setError("请输入密码");
                    editText = loginActivity.f4969w;
                    z2 = true;
                } else {
                    z2 = false;
                    editText = null;
                }
                if (TextUtils.isEmpty(strTrim)) {
                    loginActivity.f4968v.setError("请输入用户名");
                    editText = loginActivity.f4968v;
                    z2 = true;
                }
                if (z2) {
                    editText.requestFocus();
                    return;
                }
                loginActivity.f4971y.show();
                C0608d c0608d = AbstractC0018M.f35a;
                C0027i c0027i = new C0027i(loginActivity, strTrim, strTrim2);
                C0128r c0128r = AbstractC0020b.f48a;
                try {
                    AbstractC0018M.m49e(strTrim2);
                    String strM49e = AbstractC0018M.m49e(strTrim + strTrim2);
                    C0121k c0121k = new C0121k(1);
                    c0121k.m348p("http://guanjunapp0907.com/login/" + strM49e + ".json?rc=" + String.valueOf(System.currentTimeMillis()));
                    c0121k.m341i("GET", null);
                    c0121k.m340h("Cache-Control", "no-cache");
                    C0132v c0132vM334b = c0121k.m334b();
                    C0130t c0130tM90d = AbstractC0020b.m90d(loginActivity);
                    c0130tM90d.getClass();
                    new C0190i(c0130tM90d, c0132vM334b, false).m499e(new C0004c(2, c0027i));
                    return;
                } catch (Exception e3) {
                    e3.getMessage();
                    c0027i.m111O("请求创建失败: " + e3.getMessage());
                    return;
                }
            case 1:
                MainActivity mainActivity = (MainActivity) obj;
                View viewM1593f = mainActivity.f5006v.m1593f(8388611);
                if (viewM1593f != null ? DrawerLayout.m1585o(viewM1593f) : false) {
                    mainActivity.f5006v.m1591d();
                    return;
                } else {
                    mainActivity.f5006v.m1600s();
                    return;
                }
            case 2:
                C0558d c0558d = (C0558d) obj;
                EditText editText2 = c0558d.f1746i;
                if (editText2 == null) {
                    return;
                }
                Editable text = editText2.getText();
                if (text != null) {
                    text.clear();
                }
                c0558d.m1374q();
                return;
            case 3:
                ((C0564j) obj).m1353u();
                return;
            case 4:
                C0577w c0577w = (C0577w) obj;
                EditText editText3 = c0577w.f1853f;
                if (editText3 == null) {
                    return;
                }
                int selectionEnd = editText3.getSelectionEnd();
                EditText editText4 = c0577w.f1853f;
                if (editText4 == null || !(editText4.getTransformationMethod() instanceof PasswordTransformationMethod)) {
                    c0577w.f1853f.setTransformationMethod(PasswordTransformationMethod.getInstance());
                } else {
                    c0577w.f1853f.setTransformationMethod(null);
                }
                if (selectionEnd >= 0) {
                    c0577w.f1853f.setSelection(selectionEnd);
                }
                c0577w.m1374q();
                return;
            default:
                ((C0820l) obj).m2089A();
                throw null;
        }
    }
}
