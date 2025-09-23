package p028K;

import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContentInfo;
import android.view.View;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import p148y0.AbstractC1400a;

/* renamed from: K.d */
/* loaded from: classes.dex */
public final class C0257d implements InterfaceC0255c, InterfaceC0259e {

    /* renamed from: a */
    public final /* synthetic */ int f839a;

    /* renamed from: b */
    public Object f840b;

    /* renamed from: c */
    public int f841c;

    /* renamed from: d */
    public int f842d;

    /* renamed from: e */
    public Object f843e;

    /* renamed from: f */
    public Cloneable f844f;

    public /* synthetic */ C0257d() {
        this.f839a = 0;
    }

    @Override // p028K.InterfaceC0255c
    /* renamed from: a */
    public void mo14a(Bundle bundle) {
        this.f844f = bundle;
    }

    @Override // p028K.InterfaceC0255c
    /* renamed from: b */
    public void mo15b(Uri uri) {
        this.f843e = uri;
    }

    @Override // p028K.InterfaceC0259e
    /* renamed from: c */
    public int mo16c() {
        return this.f841c;
    }

    /* renamed from: d */
    public void m733d(C0292u0 c0292u0, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if ((((C0266h0) it.next()).f867a.mo743c() & 8) != 0) {
                ((View) this.f843e).setTranslationY(AbstractC1400a.m3166c(this.f842d, 0, r3.f867a.mo742b()));
                return;
            }
        }
    }

    @Override // p028K.InterfaceC0259e
    /* renamed from: e */
    public ClipData mo18e() {
        return (ClipData) this.f840b;
    }

    @Override // p028K.InterfaceC0255c
    /* renamed from: g */
    public C0261f mo20g() {
        return new C0261f(new C0257d(this));
    }

    @Override // p028K.InterfaceC0259e
    /* renamed from: j */
    public int mo23j() {
        return this.f842d;
    }

    @Override // p028K.InterfaceC0259e
    /* renamed from: k */
    public ContentInfo mo24k() {
        return null;
    }

    @Override // p028K.InterfaceC0255c
    /* renamed from: n */
    public void mo27n(int i2) {
        this.f842d = i2;
    }

    public String toString() {
        String str;
        switch (this.f839a) {
            case 1:
                StringBuilder sb = new StringBuilder("ContentInfoCompat{clip=");
                sb.append(((ClipData) this.f840b).getDescription());
                sb.append(", source=");
                int i2 = this.f841c;
                sb.append(i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? i2 != 5 ? String.valueOf(i2) : "SOURCE_PROCESS_TEXT" : "SOURCE_AUTOFILL" : "SOURCE_DRAG_AND_DROP" : "SOURCE_INPUT_METHOD" : "SOURCE_CLIPBOARD" : "SOURCE_APP");
                sb.append(", flags=");
                int i3 = this.f842d;
                sb.append((i3 & 1) != 0 ? "FLAG_CONVERT_TO_PLAIN_TEXT" : String.valueOf(i3));
                Uri uri = (Uri) this.f843e;
                if (uri == null) {
                    str = "";
                } else {
                    str = ", hasLinkUri(" + uri.toString().length() + ")";
                }
                sb.append(str);
                sb.append(((Bundle) this.f844f) != null ? ", hasExtras" : "");
                sb.append("}");
                return sb.toString();
            default:
                return super.toString();
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [int[], java.lang.Cloneable] */
    public C0257d(View view) {
        this.f839a = 2;
        this.f844f = new int[2];
        this.f843e = view;
    }

    public C0257d(C0257d c0257d) {
        this.f839a = 1;
        ClipData clipData = (ClipData) c0257d.f840b;
        clipData.getClass();
        this.f840b = clipData;
        int i2 = c0257d.f841c;
        if (i2 < 0) {
            Locale locale = Locale.US;
            throw new IllegalArgumentException("source is out of range of [0, 5] (too low)");
        }
        if (i2 <= 5) {
            this.f841c = i2;
            int i3 = c0257d.f842d;
            if ((i3 & 1) == i3) {
                this.f842d = i3;
                this.f843e = (Uri) c0257d.f843e;
                this.f844f = (Bundle) c0257d.f844f;
                return;
            } else {
                throw new IllegalArgumentException("Requested flags 0x" + Integer.toHexString(i3) + ", but only 0x" + Integer.toHexString(1) + " are allowed");
            }
        }
        Locale locale2 = Locale.US;
        throw new IllegalArgumentException("source is out of range of [0, 5] (too high)");
    }
}
