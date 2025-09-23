package p001A0;

import android.animation.Animator;
import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.nfc.tech.IsoDep;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.ContentInfo;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.emoji2.text.InterfaceC0670i;
import androidx.emoji2.text.ThreadFactoryC0662a;
import androidx.fragment.app.C0696N;
import androidx.fragment.app.C0715r;
import com.google.android.material.behavior.SwipeDismissBehavior;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import nfc.share.nfcshare.LoginActivity;
import nfc.share.nfcshare.MainActivity;
import org.json.JSONException;
import org.json.JSONObject;
import p002A1.C0019a;
import p002A1.C0027i;
import p007C0.AbstractC0083a;
import p008C1.RunnableC0092a;
import p010D0.InterfaceC0103a;
import p011D1.C0124n;
import p011D1.C0128r;
import p011D1.C0134x;
import p011D1.InterfaceC0114d;
import p014E1.ThreadFactoryC0144a;
import p017G.InterfaceC0154c;
import p019G1.C0170d;
import p021H1.C0190i;
import p021H1.C0195n;
import p028K.AbstractC0241P;
import p028K.C0261f;
import p028K.InterfaceC0255c;
import p028K.InterfaceC0259e;
import p031L.C0341k;
import p031L.C0342l;
import p031L.C0343m;
import p031L.InterfaceC0351u;
import p033L1.AbstractC0364l;
import p061V0.C0549e;
import p066X.C0594g;
import p073Z0.C0608d;
import p080b1.AbstractC0784v;
import p080b1.InterfaceC0779q;
import p131s1.AbstractC1326c;
import p149y1.AbstractC1411i;

/* renamed from: A0.c */
/* loaded from: classes.dex */
public class C0004c implements InterfaceC0351u, InterfaceC0114d, InterfaceC0103a, InterfaceC0255c, InterfaceC0259e, InterfaceC0670i, InterfaceC0154c, InterfaceC0779q {

    /* renamed from: c */
    public static C0004c f5c;

    /* renamed from: a */
    public final /* synthetic */ int f6a;

    /* renamed from: b */
    public Object f7b;

    public /* synthetic */ C0004c(int i2, Object obj) {
        this.f6a = i2;
        this.f7b = obj;
    }

    @Override // p028K.InterfaceC0255c
    /* renamed from: a */
    public void mo14a(Bundle bundle) {
        ((ContentInfo.Builder) this.f7b).setExtras(bundle);
    }

    @Override // p028K.InterfaceC0255c
    /* renamed from: b */
    public void mo15b(Uri uri) {
        ((ContentInfo.Builder) this.f7b).setLinkUri(uri);
    }

    @Override // p028K.InterfaceC0259e
    /* renamed from: c */
    public int mo16c() {
        return ((ContentInfo) this.f7b).getSource();
    }

    @Override // androidx.emoji2.text.InterfaceC0670i
    /* renamed from: d */
    public void mo17d(AbstractC0364l abstractC0364l) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new ThreadFactoryC0662a("EmojiCompatInitializer"));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        threadPoolExecutor.execute(new RunnableC0092a(this, abstractC0364l, threadPoolExecutor, 1));
    }

    @Override // p028K.InterfaceC0259e
    /* renamed from: e */
    public ClipData mo18e() {
        return ((ContentInfo) this.f7b).getClip();
    }

    @Override // p031L.InterfaceC0351u
    /* renamed from: f */
    public boolean mo19f(View view) {
        switch (this.f6a) {
            case 0:
                SwipeDismissBehavior swipeDismissBehavior = (SwipeDismissBehavior) this.f7b;
                if (swipeDismissBehavior.mo2037v(view)) {
                    WeakHashMap weakHashMap = AbstractC0241P.f815a;
                    boolean z2 = view.getLayoutDirection() == 1;
                    int i2 = swipeDismissBehavior.f3047d;
                    view.offsetLeftAndRight((!(i2 == 0 && z2) && (i2 != 1 || z2)) ? view.getWidth() : -view.getWidth());
                    view.setAlpha(0.0f);
                    break;
                }
                break;
            default:
                DrawerLayout drawerLayout = (DrawerLayout) this.f7b;
                if (DrawerLayout.m1585o(view) && drawerLayout.m1597j(view) != 2) {
                    drawerLayout.m1590c(view, true);
                    break;
                }
                break;
        }
        return true;
    }

    @Override // p028K.InterfaceC0255c
    /* renamed from: g */
    public C0261f mo20g() {
        return new C0261f(new C0004c(((ContentInfo.Builder) this.f7b).build()));
    }

    @Override // p017G.InterfaceC0154c
    /* renamed from: h */
    public void mo21h() {
        switch (this.f6a) {
            case 24:
                ((Animator) this.f7b).end();
                break;
            default:
                ((C0696N) this.f7b).m1718a();
                break;
        }
    }

    @Override // p080b1.InterfaceC0779q
    /* renamed from: i */
    public Object mo22i() {
        Class cls = (Class) this.f7b;
        try {
            return AbstractC0784v.f2929a.mo1997a(cls);
        } catch (Exception e3) {
            throw new RuntimeException("Unable to create instance of " + cls + ". Registering an InstanceCreator or a TypeAdapter for this type, or adding a no-args constructor may fix this problem.", e3);
        }
    }

    @Override // p028K.InterfaceC0259e
    /* renamed from: j */
    public int mo23j() {
        return ((ContentInfo) this.f7b).getFlags();
    }

    @Override // p028K.InterfaceC0259e
    /* renamed from: k */
    public ContentInfo mo24k() {
        return (ContentInfo) this.f7b;
    }

    @Override // p011D1.InterfaceC0114d
    /* renamed from: l */
    public void mo25l(C0190i c0190i, IOException iOException) {
        ((C0027i) this.f7b).m111O(iOException.getLocalizedMessage());
    }

    @Override // p011D1.InterfaceC0114d
    /* renamed from: m */
    public void mo26m(C0190i c0190i, C0134x c0134x) {
        final C0027i c0027i = (C0027i) this.f7b;
        try {
            final JSONObject jSONObject = new JSONObject(c0134x.f474g.m375j());
            final String str = (String) c0027i.f65b;
            final String str2 = (String) c0027i.f66c;
            ((LoginActivity) c0027i.f67d).runOnUiThread(new Runnable() { // from class: A1.g
                @Override // java.lang.Runnable
                public final void run() {
                    JSONObject jSONObject2 = jSONObject;
                    String str3 = str;
                    String str4 = str2;
                    LoginActivity loginActivity = (LoginActivity) c0027i.f67d;
                    try {
                        jSONObject2.toString();
                        int i2 = jSONObject2.getInt("uid");
                        if (jSONObject2.getString("account").equals(str3)) {
                            String string = jSONObject2.toString();
                            C0128r c0128r = AbstractC0020b.f48a;
                            loginActivity.getSharedPreferences("CacheServer", 0).edit().putString("cache_server", string).apply();
                            String string2 = jSONObject2.getString("expiry_date");
                            C0608d c0608d = AbstractC0018M.f35a;
                            loginActivity.getSharedPreferences("UserSession", 0).edit().putString("expire_date", string2).apply();
                            AbstractC0020b.m93g(loginActivity, i2, str3, AbstractC0018M.m49e(str3 + str4), string2);
                            Toast.makeText(loginActivity, "登录成功", 0).show();
                            Intent intent = new Intent(loginActivity, (Class<?>) MainActivity.class);
                            intent.putExtra("isFromLogin", true);
                            loginActivity.startActivity(intent);
                            loginActivity.finish();
                        } else {
                            Toast.makeText(loginActivity, "登录失败", 0).show();
                        }
                        if (loginActivity.f4971y.isShowing()) {
                            loginActivity.f4971y.dismiss();
                        }
                        AbstractC0018M.m51g(loginActivity, str3);
                        AbstractC0018M.m50f(loginActivity, str4);
                    } catch (JSONException unused) {
                        if (loginActivity.f4971y.isShowing()) {
                            loginActivity.f4971y.dismiss();
                        }
                        AbstractC0018M.m51g(loginActivity, str3);
                        AbstractC0018M.m50f(loginActivity, str4);
                    } catch (Throwable th) {
                        if (loginActivity.f4971y.isShowing()) {
                            loginActivity.f4971y.dismiss();
                        }
                        AbstractC0018M.m51g(loginActivity, str3);
                        AbstractC0018M.m50f(loginActivity, str4);
                        throw th;
                    }
                }
            });
        } catch (JSONException unused) {
            c0027i.m111O("请检查账号或订阅是否到期！！！");
        }
    }

    @Override // p028K.InterfaceC0255c
    /* renamed from: n */
    public void mo27n(int i2) {
        ((ContentInfo.Builder) this.f7b).setFlags(i2);
    }

    /* renamed from: o */
    public void m28o(String str, String str2) {
        AbstractC1326c.m3062e(str, "name");
        AbstractC1326c.m3062e(str2, "value");
        ArrayList arrayList = (ArrayList) this.f7b;
        arrayList.add(str);
        arrayList.add(AbstractC1411i.m3191f0(str2).toString());
    }

    /* renamed from: p */
    public C0124n m29p() {
        Object[] array = ((ArrayList) this.f7b).toArray(new String[0]);
        if (array != null) {
            return new C0124n((String[]) array);
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
    }

    /* renamed from: q */
    public C0341k mo30q(int i2) {
        return null;
    }

    /* renamed from: r */
    public C0341k mo31r(int i2) {
        return null;
    }

    /* renamed from: s */
    public void m32s() {
        ((C0715r) this.f7b).f2661i.m1654I();
    }

    /* renamed from: t */
    public boolean mo33t(int i2, int i3, Bundle bundle) {
        return false;
    }

    public String toString() {
        switch (this.f6a) {
            case 12:
                return "ContentInfoCompat{" + ((ContentInfo) this.f7b) + "}";
            default:
                return super.toString();
        }
    }

    /* renamed from: u */
    public void m34u(String str) {
        int i2 = 0;
        while (true) {
            ArrayList arrayList = (ArrayList) this.f7b;
            if (i2 >= arrayList.size()) {
                return;
            }
            if (str.equalsIgnoreCase((String) arrayList.get(i2))) {
                arrayList.remove(i2);
                arrayList.remove(i2);
                i2 -= 2;
            }
            i2 += 2;
        }
    }

    /* renamed from: v */
    public byte[] m35v(byte[] bArr) {
        try {
            StringBuilder sb = new StringBuilder();
            for (byte b : bArr) {
                sb.append(String.format("%02X ", Byte.valueOf(b)));
            }
            sb.toString().getClass();
            return ((IsoDep) this.f7b).transceive(bArr);
        } catch (IOException e3) {
            e3.getMessage();
            throw new RuntimeException("NFC通信失败", e3);
        }
    }

    public C0004c(int i2) {
        this.f6a = i2;
        switch (i2) {
            case 7:
                AbstractC1326c.m3062e(TimeUnit.MINUTES, "timeUnit");
                this.f7b = new C0195n(C0170d.f619h);
                break;
            case 8:
                this.f7b = new ArrayList(20);
                break;
            case 10:
                this.f7b = new LinkedHashSet();
                break;
            case 13:
                if (Build.VERSION.SDK_INT < 26) {
                    this.f7b = new C0342l(this);
                    break;
                } else {
                    this.f7b = new C0343m(this);
                    break;
                }
            case 20:
                this.f7b = new Object();
                new Handler(Looper.getMainLooper(), new C0549e(this));
                break;
        }
    }

    public C0004c(TextView textView) {
        this.f6a = 22;
        this.f7b = new C0594g(textView);
    }

    public C0004c(EditText editText) {
        this.f6a = 21;
        this.f7b = new C0019a(editText);
    }

    public C0004c(Context context) {
        this.f6a = 23;
        this.f7b = context.getApplicationContext();
    }

    public C0004c(ThreadFactoryC0144a threadFactoryC0144a) {
        this.f6a = 9;
        this.f7b = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), threadFactoryC0144a);
    }

    public C0004c(ContentInfo contentInfo) {
        this.f6a = 12;
        contentInfo.getClass();
        this.f7b = AbstractC0083a.m271g(contentInfo);
    }

    public C0004c(ClipData clipData, int i2) {
        this.f6a = 11;
        this.f7b = AbstractC0083a.m269e(clipData, i2);
    }
}
