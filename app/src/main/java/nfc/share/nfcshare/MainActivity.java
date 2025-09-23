package nfc.share.nfcshare;

import android.app.AlertDialog;
import android.content.ComponentName;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.nfc.NfcAdapter;
import android.nfc.cardemulation.CardEmulation;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;
import nfc.share.nfcshare.model.CurrencyLookup;
import nfc.share.nfcshare.model.LogBean;
import nfc.share.nfcshare.model.MqttChannel;
import nfc.share.nfcshare.service.EmulationService;
import org.json.JSONObject;
import p000A.AbstractC0001b;
import p002A1.AbstractActivityC0021c;
import p002A1.AbstractC0018M;
import p002A1.AbstractC0020b;
import p002A1.AsyncTaskC0011F;
import p002A1.C0015J;
import p002A1.C0016K;
import p002A1.C0019a;
import p002A1.C0027i;
import p002A1.C0031m;
import p002A1.C0038t;
import p002A1.C0039u;
import p002A1.C0043y;
import p002A1.DialogInterfaceOnClickListenerC0044z;
import p002A1.RunnableC0030l;
import p002A1.RunnableC0036r;
import p002A1.RunnableC0040v;
import p002A1.ViewOnClickListenerC0008C;
import p002A1.ViewOnClickListenerC0022d;
import p002A1.ViewOnClickListenerC0032n;
import p002A1.ViewOnTouchListenerC0034p;
import p005B1.C0065c;
import p005B1.C0068f;
import p005B1.RunnableC0063a;
import p008C1.C0095d;
import p011D1.C0121k;
import p011D1.C0128r;
import p011D1.C0130t;
import p011D1.C0132v;
import p021H1.C0190i;
import p083c0.C0788b;
import p083c0.C0789c;
import p085c2.AbstractC0808b;
import p090e.InterfaceC0868a;
import p093e2.AbstractC0901d;
import p094f0.C0945j;
import p096g.C0964a;
import tkbmmn.ghwbbf.irvjzy.R;

/* loaded from: classes.dex */
public class MainActivity extends AbstractActivityC0021c {

    /* renamed from: g0 */
    public static final /* synthetic */ int f4973g0 = 0;

    /* renamed from: A */
    public ImageView f4974A;

    /* renamed from: B */
    public ImageView f4975B;

    /* renamed from: C */
    public ImageView f4976C;

    /* renamed from: D */
    public ConstraintLayout f4977D;

    /* renamed from: E */
    public ConstraintLayout f4978E;

    /* renamed from: F */
    public ConstraintLayout f4979F;

    /* renamed from: G */
    public RecyclerView f4980G;

    /* renamed from: H */
    public C0065c f4981H;

    /* renamed from: I */
    public TextView f4982I;

    /* renamed from: J */
    public TextView f4983J;

    /* renamed from: K */
    public TextView f4984K;

    /* renamed from: L */
    public TextView f4985L;

    /* renamed from: M */
    public TextView f4986M;

    /* renamed from: N */
    public TextView f4987N;

    /* renamed from: O */
    public TextView f4988O;

    /* renamed from: P */
    public TextView f4989P;

    /* renamed from: Q */
    public TextView f4990Q;

    /* renamed from: R */
    public TextView f4991R;

    /* renamed from: S */
    public ProgressBar f4992S;

    /* renamed from: T */
    public C0015J f4993T;

    /* renamed from: V */
    public long f4995V;

    /* renamed from: W */
    public long f4996W;

    /* renamed from: X */
    public Toast f4997X;

    /* renamed from: Y */
    public RecyclerView f4998Y;

    /* renamed from: b0 */
    public C0068f f5001b0;

    /* renamed from: c0 */
    public AlertDialog f5002c0;

    /* renamed from: e0 */
    public CardEmulation f5004e0;

    /* renamed from: f0 */
    public ComponentName f5005f0;

    /* renamed from: v */
    public DrawerLayout f5006v;

    /* renamed from: w */
    public C0039u f5007w;

    /* renamed from: x */
    public Toolbar f5008x;

    /* renamed from: y */
    public ImageView f5009y;

    /* renamed from: z */
    public ImageView f5010z;

    /* renamed from: U */
    public final ArrayList f4994U = new ArrayList();

    /* renamed from: Z */
    public ArrayList f4999Z = new ArrayList();

    /* renamed from: a0 */
    public String f5000a0 = "";

    /* renamed from: d0 */
    public String f5003d0 = "";

    static {
        AbstractC0808b.m2014d(MainActivity.class);
    }

    /* renamed from: s */
    public static void m2874s(MainActivity mainActivity, ImageView imageView, double d3) {
        mainActivity.getClass();
        if (d3 < 150.0d) {
            imageView.setImageResource(R.drawable.circle_dot_fast);
            return;
        }
        if (d3 < 250.0d) {
            imageView.setImageResource(R.drawable.circle_dot_general);
        } else if (d3 < 350.0d) {
            imageView.setImageResource(R.drawable.circle_dot_slow);
        } else {
            imageView.setImageResource(R.drawable.circle_dot_timeout);
        }
    }

    @Override // androidx.activity.AbstractActivityC0645k, android.app.Activity
    public final void onBackPressed() {
        if (this.f4995V + 2000 > System.currentTimeMillis()) {
            Toast toast = this.f4997X;
            if (toast != null) {
                toast.cancel();
            }
            super.onBackPressed();
        } else {
            Toast toastMakeText = Toast.makeText(this, "再按一次返回退出", 0);
            this.f4997X = toastMakeText;
            toastMakeText.show();
        }
        this.f4995V = System.currentTimeMillis();
    }

    @Override // p090e.AbstractActivityC0874g, androidx.activity.AbstractActivityC0645k, p150z.AbstractActivityC1416e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        int i2 = 0;
        int i3 = 1;
        super.onCreate(bundle);
        setContentView(R.layout.activity_main);
        C0128r c0128r = AbstractC0020b.f48a;
        AbstractC0018M.f42h = String.valueOf(getSharedPreferences("UserSession", 0).getInt("uid", 0));
        this.f5008x = (Toolbar) findViewById(R.id.toolbar);
        this.f5006v = (DrawerLayout) findViewById(R.id.drawerLayout);
        this.f5009y = (ImageView) findViewById(R.id.iv_main_latency);
        this.f4978E = (ConstraintLayout) findViewById(R.id.layout_card_view);
        this.f4979F = (ConstraintLayout) findViewById(R.id.layout_error);
        this.f4975B = (ImageView) findViewById(R.id.menuButton);
        this.f4976C = (ImageView) findViewById(R.id.ivClose);
        this.f4980G = (RecyclerView) findViewById(R.id.rv_log);
        this.f4990Q = (TextView) findViewById(R.id.tvExpire);
        this.f4985L = (TextView) findViewById(R.id.tvEmail);
        RecyclerView recyclerView = this.f4980G;
        C0065c c0065c = new C0065c();
        c0065c.f157c = new ArrayList();
        c0065c.f158d = this;
        c0065c.f159e = recyclerView;
        this.f4981H = c0065c;
        this.f4989P = (TextView) findViewById(R.id.title);
        this.f4991R = (TextView) findViewById(R.id.tv_error_info);
        this.f4989P.setText("正在配对");
        this.f4980G.setLayoutManager(new LinearLayoutManager(1));
        this.f4980G.setAdapter(this.f4981H);
        this.f4977D = (ConstraintLayout) findViewById(R.id.layout_card);
        this.f4984K = (TextView) findViewById(R.id.card_tv_date);
        this.f4986M = (TextView) findViewById(R.id.card_tv_label);
        this.f4983J = (TextView) findViewById(R.id.card_tv_type);
        this.f4982I = (TextView) findViewById(R.id.card_tv_number);
        this.f4974A = (ImageView) findViewById(R.id.iv_apple_mode);
        if (AbstractC0018M.m48d(this)) {
            this.f4974A.setVisibility(8);
        }
        this.f5010z = (ImageView) findViewById(R.id.iv_switch);
        this.f4992S = (ProgressBar) findViewById(R.id.pb_card_loading);
        this.f4987N = (TextView) findViewById(R.id.tv_card_state);
        this.f4988O = (TextView) findViewById(R.id.tv_ping_value);
        this.f4977D.setVisibility(0);
        if (!AbstractC0018M.m48d(this)) {
            AbstractC0018M.f38d = new C0095d(this);
        }
        this.f5002c0 = new AlertDialog.Builder(this, R.style.CustomDialog).setView(R.layout.layout_progress_dialog).setCancelable(false).create();
        this.f5010z.setOnClickListener(new ViewOnClickListenerC0032n(this, 2));
        ((MaterialButton) findViewById(R.id.btn_error_retry)).setOnClickListener(new ViewOnClickListenerC0008C());
        this.f4998Y = (RecyclerView) findViewById(R.id.setting_server_list);
        ArrayList arrayList = this.f4999Z;
        C0068f c0068f = new C0068f();
        c0068f.f168d = arrayList;
        c0068f.f167c = this;
        this.f5001b0 = c0068f;
        this.f4998Y.setLayoutManager(new LinearLayoutManager(1));
        C0945j c0945j = new C0945j(this);
        c0945j.f3927a = new ColorDrawable(AbstractC0001b.m3a(this, R.color.card_text_color));
        this.f4998Y.m1913g(c0945j);
        this.f4998Y.setAdapter(this.f5001b0);
        C0068f c0068f2 = this.f5001b0;
        C0038t c0038t = new C0038t(this);
        c0068f2.getClass();
        C0068f.f166f = c0038t;
        this.f5010z.setOnTouchListener(new ViewOnTouchListenerC0034p(1, this));
        this.f4974A.setOnClickListener(new ViewOnClickListenerC0032n(this, i2));
        this.f4974A.setOnTouchListener(new ViewOnTouchListenerC0034p(0, this));
        this.f4987N.setVisibility(0);
        this.f4992S.setVisibility(0);
        this.f4988O.setVisibility(4);
        this.f4987N.setText("");
        this.f4984K.setText("");
        this.f4983J.setText("");
        this.f4986M.setText("");
        this.f4982I.setText("");
        String.valueOf(getSharedPreferences("UserSession", 0).getInt("uid", 0));
        String string = getSharedPreferences("UserSession", 0).getString("account", "");
        TextView textView = this.f4985L;
        if (string.isEmpty()) {
            string = "null";
        }
        textView.setText(string);
        C0039u c0039u = new C0039u(this, this, this.f5006v, this.f5008x);
        this.f5007w = c0039u;
        if (c0039u.f86e) {
            Drawable drawable = c0039u.f85d;
            boolean z2 = c0039u.f89h;
            InterfaceC0868a interfaceC0868a = c0039u.f82a;
            if (!z2 && !interfaceC0868a.mo120c()) {
                c0039u.f89h = true;
            }
            interfaceC0868a.mo122e(drawable, 0);
            c0039u.f86e = false;
        }
        this.f5006v.m1588a(this.f5007w);
        C0039u c0039u2 = this.f5007w;
        DrawerLayout drawerLayout = c0039u2.f83b;
        View viewM1593f = drawerLayout.m1593f(8388611);
        if (viewM1593f != null ? DrawerLayout.m1585o(viewM1593f) : false) {
            c0039u2.m158d(1.0f);
        } else {
            c0039u2.m158d(0.0f);
        }
        if (c0039u2.f86e) {
            View viewM1593f2 = drawerLayout.m1593f(8388611);
            int i4 = viewM1593f2 != null ? DrawerLayout.m1585o(viewM1593f2) : false ? c0039u2.f88g : c0039u2.f87f;
            C0964a c0964a = c0039u2.f84c;
            boolean z3 = c0039u2.f89h;
            InterfaceC0868a interfaceC0868a2 = c0039u2.f82a;
            if (!z3 && !interfaceC0868a2.mo120c()) {
                c0039u2.f89h = true;
            }
            interfaceC0868a2.mo122e(c0964a, i4);
        }
        this.f4975B.setOnClickListener(new ViewOnClickListenerC0022d(i3, this));
        this.f4976C.setOnClickListener(new ViewOnClickListenerC0032n(this, i3));
        AbstractC0018M.f39e = this;
        if (this.f4996W + 1000 <= System.currentTimeMillis()) {
            this.f4996W = System.currentTimeMillis();
            if (NfcAdapter.getDefaultAdapter(this) != null) {
                m2876u();
                if (AbstractC0901d.m2284N(this)) {
                    try {
                        if (AbstractC0018M.f36b == null) {
                            C0027i c0027i = new C0027i(getApplicationContext());
                            AbstractC0018M.f36b = c0027i;
                            c0027i.f66c = new C0038t(this);
                        }
                        AbstractC0018M.f36b.m135s(this.f5003d0);
                    } catch (Exception unused) {
                    }
                } else {
                    AlertDialog alertDialogCreate = new AlertDialog.Builder(this, R.style.MyAlertDialog).setTitle("提示").setMessage("请检查网络连接").setPositiveButton("确定", (DialogInterface.OnClickListener) null).create();
                    alertDialogCreate.setCanceledOnTouchOutside(false);
                    alertDialogCreate.setCancelable(false);
                    alertDialogCreate.show();
                }
            } else {
                AlertDialog alertDialogCreate2 = new AlertDialog.Builder(this, R.style.MyAlertDialog).setIcon(R.drawable.baseline_warning_24).setTitle("提示").setMessage("该设备不支持NFC").setPositiveButton("确定", (DialogInterface.OnClickListener) null).create();
                alertDialogCreate2.setCanceledOnTouchOutside(false);
                alertDialogCreate2.setCancelable(false);
                alertDialogCreate2.show();
            }
        }
        this.f5003d0 = AbstractC0020b.m89c(this);
        getIntent().getBooleanExtra("isFromLogin", false);
        C0043y c0043y = new C0043y(0, this);
        IntentFilter intentFilter = new IntentFilter("nfc.share.nfcshare");
        C0789c c0789cM1999a = C0789c.m1999a(this);
        synchronized (c0789cM1999a.f2939b) {
            try {
                C0788b c0788b = new C0788b(intentFilter, c0043y);
                ArrayList arrayList2 = (ArrayList) c0789cM1999a.f2939b.get(c0043y);
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList(1);
                    c0789cM1999a.f2939b.put(c0043y, arrayList2);
                }
                arrayList2.add(c0788b);
                while (i2 < intentFilter.countActions()) {
                    String action = intentFilter.getAction(i2);
                    ArrayList arrayList3 = (ArrayList) c0789cM1999a.f2940c.get(action);
                    if (arrayList3 == null) {
                        arrayList3 = new ArrayList(1);
                        c0789cM1999a.f2940c.put(action, arrayList3);
                    }
                    arrayList3.add(c0788b);
                    i2++;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f4993T = new C0015J(new C0038t(this));
        this.f5000a0 = AbstractC0020b.m89c(this);
        m2880y();
    }

    @Override // p090e.AbstractActivityC0874g, android.app.Activity
    public final void onPause() {
        super.onPause();
        this.f4993T.m43b();
        C0027i c0027i = AbstractC0018M.f36b;
        if (c0027i == null || !C0027i.f62e) {
            return;
        }
        c0027i.m112P(MqttChannel.OFFLINE_CHANNEL, AbstractC0018M.f40f + "已离线");
        new Handler(Looper.getMainLooper()).postDelayed(new RunnableC0040v(0), 0L);
    }

    @Override // p090e.AbstractActivityC0874g, android.app.Activity
    public final void onResume() {
        int i2 = 1;
        int i3 = 0;
        super.onResume();
        this.f4999Z = App.f4966b.f4967a;
        this.f5002c0.show();
        C0038t c0038t = new C0038t(this);
        try {
            C0128r c0128r = AbstractC0020b.f48a;
            getSharedPreferences("UserSession", 0).getString("token", "");
            Settings.Secure.getString(getContentResolver(), "android_id");
            AbstractC0901d.m2310o(new JSONObject().toString(), AbstractC0020b.f48a);
            C0121k c0121k = new C0121k(1);
            c0121k.m348p("http://guanjunapp0907.com/login/" + getSharedPreferences("UserSession", 0).getString("token", "") + ".json?rc=" + String.valueOf(System.currentTimeMillis()));
            c0121k.m341i("GET", null);
            c0121k.m340h("Cache-Control", "no-cache");
            C0132v c0132vM334b = c0121k.m334b();
            C0130t c0130tM90d = AbstractC0020b.m90d(this);
            c0130tM90d.getClass();
            new C0190i(c0130tM90d, c0132vM334b, false).m499e(new C0019a(c0038t, i3, this));
        } catch (Exception e3) {
            e3.getMessage();
            c0038t.m153c("请求创建失败: " + e3.getMessage());
        }
        C0128r c0128r2 = AbstractC0020b.f48a;
        String string = getSharedPreferences("UserSession", 0).getString("token", "");
        if (string == null || string.isEmpty()) {
            new Handler(Looper.getMainLooper()).postDelayed(new RunnableC0036r(this, i2), 1000L);
        }
        m2876u();
        String strM89c = AbstractC0020b.m89c(this);
        if (strM89c != null) {
            this.f5003d0 = strM89c;
        }
        C0027i c0027i = AbstractC0018M.f36b;
        if (c0027i != null && !C0027i.f62e) {
            try {
                c0027i.m135s(this.f5003d0);
            } catch (Exception e4) {
                e4.printStackTrace();
            }
        }
        m2879x(AbstractC0020b.m87a(this), AbstractC0020b.m88b(this));
    }

    /* renamed from: t */
    public final void m2875t(CurrencyLookup.CurrencyInfo currencyInfo, String str) {
        if (this.f4981H != null && AbstractC0018M.m48d(this) && this.f4977D.getVisibility() == 0) {
            C0065c c0065c = this.f4981H;
            c0065c.getClass();
            c0065c.f157c.add(new LogBean(currencyInfo, str, new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.getDefault()).format(new Date())));
            new Handler(Looper.getMainLooper()).post(new RunnableC0063a(c0065c));
        }
    }

    /* renamed from: u */
    public final void m2876u() {
        boolean zIsDefaultServiceForCategory;
        NfcAdapter defaultAdapter = NfcAdapter.getDefaultAdapter(this);
        if (defaultAdapter != null && !defaultAdapter.isEnabled()) {
            AlertDialog alertDialogCreate = new AlertDialog.Builder(this, R.style.SettingDefaultDialog).setIcon(R.drawable.baseline_warning_24).setTitle("提示").setMessage("NFC没有开启，请前往系统设置一开启NFC权限，若已开启请重启设备再试！").setPositiveButton("去开启", new DialogInterfaceOnClickListenerC0044z(this, 0)).create();
            alertDialogCreate.setCanceledOnTouchOutside(false);
            alertDialogCreate.setCancelable(false);
            alertDialogCreate.show();
            return;
        }
        NfcAdapter defaultAdapter2 = NfcAdapter.getDefaultAdapter(this);
        if (defaultAdapter2 == null) {
            AlertDialog alertDialogCreate2 = new AlertDialog.Builder(this, R.style.MyAlertDialog).setIcon(R.drawable.baseline_warning_24).setTitle("提示").setMessage("该设备不支持NFC").setPositiveButton("确定", (DialogInterface.OnClickListener) null).create();
            alertDialogCreate2.setCanceledOnTouchOutside(false);
            alertDialogCreate2.setCancelable(false);
            alertDialogCreate2.show();
            zIsDefaultServiceForCategory = false;
        } else {
            this.f5004e0 = CardEmulation.getInstance(defaultAdapter2);
            ComponentName componentName = new ComponentName(this, (Class<?>) EmulationService.class);
            this.f5005f0 = componentName;
            zIsDefaultServiceForCategory = this.f5004e0.isDefaultServiceForCategory(componentName, "payment");
        }
        if (zIsDefaultServiceForCategory || !AbstractC0018M.m48d(this)) {
            return;
        }
        AlertDialog alertDialogCreate3 = new AlertDialog.Builder(this, R.style.SettingDefaultDialog).setIcon(R.drawable.baseline_warning_24).setTitle("提示").setMessage("NFC冠军版 未设置为默认NFC支付应用。请前往系统NFC设置以确保软件能正常工作。\n对于小米手机，还需额外设置“默认钱包”为“HCE钱包”。").setPositiveButton("去设置", new DialogInterfaceOnClickListenerC0044z(this, 1)).create();
        alertDialogCreate3.setCanceledOnTouchOutside(false);
        alertDialogCreate3.setCancelable(false);
        alertDialogCreate3.show();
    }

    /* renamed from: v */
    public final void m2877v() {
        runOnUiThread(new RunnableC0036r(this, 0));
        C0128r c0128r = AbstractC0020b.f48a;
        SharedPreferences.Editor editorEdit = getSharedPreferences("UserSession", 0).edit();
        editorEdit.clear();
        editorEdit.apply();
        App.f4966b.f4967a = null;
        C0027i.f62e = false;
        C0027i c0027i = AbstractC0018M.f36b;
        if (c0027i != null) {
            c0027i.m137u();
            AbstractC0018M.f36b = null;
        }
        Intent intent = new Intent(this, (Class<?>) LoginActivity.class);
        intent.addFlags(67141632);
        startActivity(intent);
        finish();
        AbstractC0018M.f39e = null;
        if (this.f5002c0.isShowing()) {
            this.f5002c0.dismiss();
        }
    }

    /* renamed from: w */
    public final void m2878w(String str) {
        int i2 = 0;
        if (str.trim().isEmpty()) {
            return;
        }
        String[] strArrSplit = str.split(",");
        if ("A000000333010101".contains(strArrSplit[0]) || "A000000333010102".contains(strArrSplit[0]) || "A000000333010103".contains(strArrSplit[0]) || "A000000333010106".contains(strArrSplit[0])) {
            C0128r c0128r = AbstractC0020b.f48a;
            if (getSharedPreferences("UserSession", 0).getInt("union_pay", 0) == 0) {
                runOnUiThread(new RunnableC0030l(i2, this));
                return;
            }
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add("325041592E5359532E4444463031");
        Collections.addAll(arrayList, strArrSplit);
        arrayList.forEach(new C0031m());
        StringBuilder sb = new StringBuilder();
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            while (true) {
                sb.append((CharSequence) it.next());
                if (!it.hasNext()) {
                    break;
                } else {
                    sb.append((CharSequence) ",");
                }
            }
        }
        this.f5004e0.registerAidsForService(this.f5005f0, "payment", arrayList);
    }

    /* renamed from: x */
    public final void m2879x(String str, int i2) {
        if (str == null || str.isEmpty()) {
            System.out.println("未找到ping_ip");
            runOnUiThread(new RunnableC0036r(this, 2));
        } else {
            AsyncTaskC0011F asyncTaskC0011F = new AsyncTaskC0011F(new C0038t(this));
            asyncTaskC0011F.f19b = i2;
            asyncTaskC0011F.execute(str);
        }
    }

    /* renamed from: y */
    public final void m2880y() {
        ArrayList arrayList = App.f4966b.f4967a;
        this.f4999Z = arrayList;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        String str = this.f5000a0;
        if (str == null || str.isEmpty()) {
            this.f5000a0 = ((C0016K) this.f4999Z.get(0)).m44a();
        }
        this.f5001b0.m191g(this.f4999Z, this.f5000a0);
    }
}
