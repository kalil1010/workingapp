package nfc.share.nfcshare;

import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.provider.Settings;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;
import p002A1.AbstractActivityC0021c;
import p002A1.AbstractC0018M;
import p002A1.AbstractC0020b;
import p002A1.C0024f;
import p002A1.ViewOnClickListenerC0022d;
import p002A1.ViewOnFocusChangeListenerC0023e;
import p011D1.C0128r;
import tkbmmn.ghwbbf.irvjzy.R;

/* loaded from: classes.dex */
public class LoginActivity extends AbstractActivityC0021c {

    /* renamed from: v */
    public EditText f4968v;

    /* renamed from: w */
    public EditText f4969w;

    /* renamed from: x */
    public TextView f4970x;

    /* renamed from: y */
    public AlertDialog f4971y;

    /* renamed from: z */
    public RadioGroup f4972z;

    @Override // p090e.AbstractActivityC0874g, androidx.activity.AbstractActivityC0645k, p150z.AbstractActivityC1416e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        View decorView = getWindow().getDecorView();
        decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 8192);
        Settings.Secure.getString(getContentResolver(), "android_id");
        int i2 = 0;
        this.f4971y = new AlertDialog.Builder(this, R.style.CustomDialog).setView(R.layout.layout_progress_dialog).setCancelable(false).create();
        C0128r c0128r = AbstractC0020b.f48a;
        if (getSharedPreferences("UserSession", 0).getBoolean("is_logged_in", false)) {
            startActivity(new Intent(this, (Class<?>) MainActivity.class));
            finish();
        }
        setContentView(R.layout.activity_login);
        this.f4968v = (EditText) findViewById(R.id.etEmail);
        this.f4969w = (EditText) findViewById(R.id.etPassword);
        this.f4968v.setOnFocusChangeListener(new ViewOnFocusChangeListenerC0023e(this, 0));
        this.f4969w.setOnFocusChangeListener(new ViewOnFocusChangeListenerC0023e(this, 1));
        this.f4970x = (TextView) findViewById(R.id.btnLogin);
        RadioGroup radioGroup = (RadioGroup) findViewById(R.id.rg_mode);
        this.f4972z = radioGroup;
        radioGroup.setOnCheckedChangeListener(new C0024f(this));
        if (AbstractC0018M.m48d(this)) {
            this.f4972z.check(R.id.rb_server);
        } else {
            this.f4972z.check(R.id.rb_sender);
        }
        String string = getSharedPreferences("ServerSettings", 0).getString("saved_username", "");
        String string2 = getSharedPreferences("ServerSettings", 0).getString("saved_password", "");
        if (!string2.isEmpty()) {
            this.f4969w.setText(string2);
        }
        if (!string.isEmpty()) {
            this.f4968v.setText(string);
        }
        this.f4970x.setOnClickListener(new ViewOnClickListenerC0022d(i2, this));
    }
}
