package p002A1;

import java.util.ArrayList;
import nfc.share.nfcshare.MainActivity;
import org.json.JSONObject;
import p001A0.RunnableC0005d;
import p011D1.C0128r;
import p073Z0.C0608d;

/* renamed from: A1.t */
/* loaded from: classes.dex */
public final class C0038t implements InterfaceC0012G, InterfaceC0010E {

    /* renamed from: a */
    public final /* synthetic */ MainActivity f81a;

    public /* synthetic */ C0038t(MainActivity mainActivity) {
        this.f81a = mainActivity;
    }

    @Override // p002A1.InterfaceC0012G
    /* renamed from: a */
    public void mo41a(String str) {
        this.f81a.runOnUiThread(new RunnableC0005d(this, str, 1));
    }

    @Override // p002A1.InterfaceC0010E
    /* renamed from: b */
    public void mo40b(String str) {
        MainActivity mainActivity = this.f81a;
        try {
            mainActivity.runOnUiThread(new RunnableC0041w(this, Double.parseDouble(str)));
        } catch (Exception e3) {
            e3.printStackTrace();
            mainActivity.runOnUiThread(new RunnableC0042x(0, this));
        }
    }

    /* renamed from: c */
    public void m153c(String str) {
        this.f81a.runOnUiThread(new RunnableC0006A(this, str, 1));
    }

    /* renamed from: d */
    public void m154d(JSONObject jSONObject) {
        int i2 = 1;
        int i3 = 0;
        MainActivity mainActivity = this.f81a;
        if (mainActivity.f5002c0.isShowing()) {
            mainActivity.f5002c0.dismiss();
        }
        String string = jSONObject.toString();
        C0128r c0128r = AbstractC0020b.f48a;
        mainActivity.getSharedPreferences("CacheServer", 0).edit().putString("cache_server", string).apply();
        ArrayList arrayListM92f = AbstractC0020b.m92f(mainActivity, jSONObject);
        String string2 = mainActivity.getSharedPreferences("UserSession", 0).getString("expire_date", "");
        if (string2 == null || string2.isEmpty()) {
            mainActivity.runOnUiThread(new RunnableC0007B(this, i3));
        } else {
            mainActivity.runOnUiThread(new RunnableC0006A(this, string2, i3));
        }
        if (arrayListM92f.isEmpty()) {
            if (mainActivity.f5003d0 == null) {
                mainActivity.runOnUiThread(new RunnableC0007B(this, i2));
                return;
            }
            return;
        }
        if (mainActivity.f5003d0 != null) {
            for (int i4 = 0; i4 < arrayListM92f.size(); i4++) {
                if (((C0016K) arrayListM92f.get(i4)).m44a().equals(mainActivity.f5003d0)) {
                    C0608d c0608d = AbstractC0018M.f35a;
                    return;
                }
            }
            C0016K c0016k = (C0016K) arrayListM92f.get(0);
            String strM44a = c0016k.m44a();
            AbstractC0020b.m96j(mainActivity, strM44a);
            C0608d c0608d2 = AbstractC0018M.f35a;
            AbstractC0020b.m96j(mainActivity, strM44a);
            String str = c0016k.f34f;
            AbstractC0020b.m94h(mainActivity, str);
            AbstractC0020b.m95i(mainActivity, c0016k.f32d);
            mainActivity.m2879x(str, AbstractC0020b.m88b(mainActivity));
            mainActivity.f5003d0 = strM44a;
            return;
        }
        mainActivity.f5003d0 = ((C0016K) arrayListM92f.get(0)).m44a();
        String str2 = ((C0016K) arrayListM92f.get(0)).f34f;
        int i5 = ((C0016K) arrayListM92f.get(0)).f32d;
        AbstractC0020b.m96j(mainActivity, mainActivity.f5003d0);
        C0608d c0608d3 = AbstractC0018M.f35a;
        AbstractC0020b.m96j(mainActivity, mainActivity.f5003d0);
        AbstractC0020b.m94h(mainActivity, str2);
        AbstractC0020b.m95i(mainActivity, i5);
        mainActivity.m2879x(str2, AbstractC0020b.m88b(mainActivity));
        C0027i c0027i = AbstractC0018M.f36b;
        if (c0027i == null || C0027i.f62e) {
            return;
        }
        try {
            c0027i.m135s(mainActivity.f5003d0);
        } catch (Exception e3) {
            e3.printStackTrace();
        }
    }
}
