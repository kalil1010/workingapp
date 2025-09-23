package p002A1;

import android.content.Context;
import android.content.SharedPreferences;
import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import nfc.share.nfcshare.App;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p011D1.C0121k;
import p011D1.C0128r;
import p011D1.C0129s;
import p011D1.C0130t;
import p011D1.C0132v;
import p011D1.C0134x;
import p014E1.AbstractC0145b;
import p021H1.C0190i;
import p033L1.AbstractC0356d;
import p085c2.AbstractC0808b;
import p131s1.AbstractC1326c;

/* renamed from: A1.b */
/* loaded from: classes.dex */
public abstract class AbstractC0020b {

    /* renamed from: a */
    public static final C0128r f48a;

    /* renamed from: b */
    public static C0130t f49b;

    static {
        C0128r c0128rM968r;
        Pattern pattern = C0128r.f381c;
        try {
            c0128rM968r = AbstractC0356d.m968r("application/json; charset=utf-8");
        } catch (IllegalArgumentException unused) {
            c0128rM968r = null;
        }
        f48a = c0128rM968r;
        AbstractC0808b.m2014d(AbstractC0020b.class);
    }

    /* renamed from: a */
    public static String m87a(Context context) {
        return context.getSharedPreferences("UserSession", 0).getString("ping_ip", null);
    }

    /* renamed from: b */
    public static int m88b(Context context) {
        return context.getSharedPreferences("UserSession", 0).getInt("ping_port", 8083);
    }

    /* renamed from: c */
    public static String m89c(Context context) {
        return context.getSharedPreferences("UserSession", 0).getString("urlInfo", null);
    }

    /* renamed from: d */
    public static C0130t m90d(Context context) {
        if (f49b == null) {
            C0129s c0129s = new C0129s();
            AbstractC1326c.m3062e(TimeUnit.SECONDS, "unit");
            c0129s.f407v = AbstractC0145b.m389b("timeout", 2L);
            c0129s.f408w = AbstractC0145b.m389b("timeout", 2L);
            C0009D c0009d = new C0009D(context);
            ArrayList arrayList = c0129s.f388c;
            arrayList.add(c0009d);
            arrayList.add(new C0017L());
            f49b = new C0130t(c0129s);
        }
        return f49b;
    }

    /* renamed from: e */
    public static String m91e(Context context, String str) {
        C0121k c0121k = new C0121k(1);
        c0121k.m348p("https://api.tanshuapi.com/api/attribution_bank/v2/index?key=1eb514919a0567f5587ebc5da9796336&bankcard=" + str);
        c0121k.m341i("GET", null);
        c0121k.m340h("Cache-Control", "no-cache");
        C0132v c0132vM334b = c0121k.m334b();
        C0130t c0130tM90d = m90d(context);
        try {
            c0130tM90d.getClass();
            C0134x c0134xM500f = new C0190i(c0130tM90d, c0132vM334b, false).m500f();
            try {
                JSONObject jSONObject = new JSONObject(c0134xM500f.f474g.m375j()).getJSONObject("data");
                String str2 = jSONObject.getString("bank_name") + '-' + jSONObject.getString("province") + '-' + jSONObject.getString("type");
                c0134xM500f.close();
                return str2;
            } catch (Throwable th) {
                try {
                    c0134xM500f.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IOException | JSONException unused) {
            return "未知卡种";
        }
    }

    /* renamed from: f */
    public static ArrayList m92f(Context context, JSONObject jSONObject) throws JSONException {
        ArrayList arrayList = new ArrayList();
        try {
            String string = jSONObject.getString("expiry_date");
            context.getSharedPreferences("UserSession", 0).edit().putInt("union_pay", jSONObject.getInt("union_pay")).apply();
            App.f4966b.getSharedPreferences("UserSession", 0).edit().putString("expire_date", string).apply();
            JSONArray jSONArray = jSONObject.getJSONArray("servers");
            for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                JSONObject jSONObject2 = jSONArray.getJSONObject(i2);
                String string2 = jSONObject2.getString("name");
                String string3 = jSONObject2.getString("scheme");
                String string4 = jSONObject2.getString("host");
                int i3 = jSONObject2.getInt("port");
                String string5 = jSONObject2.getString("ping_ip");
                jSONObject2.getString("user_name");
                jSONObject2.getString("password");
                C0016K c0016k = new C0016K();
                c0016k.f29a = string2;
                c0016k.f30b = string3;
                c0016k.f31c = string4;
                c0016k.f32d = i3;
                c0016k.f34f = string5;
                arrayList.add(c0016k);
                jSONObject2.getString("user_name");
                jSONObject2.getString("password");
                App.f4966b.f4967a = arrayList;
            }
        } catch (Exception e3) {
            e3.printStackTrace();
        }
        return arrayList;
    }

    /* renamed from: g */
    public static void m93g(Context context, int i2, String str, String str2, String str3) {
        SharedPreferences.Editor editorEdit = context.getSharedPreferences("UserSession", 0).edit();
        editorEdit.putInt("uid", i2);
        editorEdit.putString("account", str);
        editorEdit.putString("token", str2);
        editorEdit.putString("expiry_date", str3);
        editorEdit.putBoolean("is_logged_in", true);
        editorEdit.apply();
    }

    /* renamed from: h */
    public static void m94h(Context context, String str) {
        context.getSharedPreferences("UserSession", 0).edit().putString("ping_ip", str).apply();
    }

    /* renamed from: i */
    public static void m95i(Context context, int i2) {
        context.getSharedPreferences("UserSession", 0).edit().putInt("ping_port", i2).apply();
    }

    /* renamed from: j */
    public static void m96j(Context context, String str) {
        context.getSharedPreferences("UserSession", 0).edit().putString("urlInfo", str).apply();
    }
}
