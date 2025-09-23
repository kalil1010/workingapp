package p083c0;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;
import java.util.Set;
import p002A1.C0019a;

/* renamed from: c0.c */
/* loaded from: classes.dex */
public final class C0789c {

    /* renamed from: f */
    public static final Object f2936f = new Object();

    /* renamed from: g */
    public static C0789c f2937g;

    /* renamed from: a */
    public final Context f2938a;

    /* renamed from: b */
    public final HashMap f2939b = new HashMap();

    /* renamed from: c */
    public final HashMap f2940c = new HashMap();

    /* renamed from: d */
    public final ArrayList f2941d = new ArrayList();

    /* renamed from: e */
    public final HandlerC0787a f2942e;

    public C0789c(Context context) {
        this.f2938a = context;
        this.f2942e = new HandlerC0787a(this, context.getMainLooper());
    }

    /* renamed from: a */
    public static C0789c m1999a(Context context) {
        C0789c c0789c;
        synchronized (f2936f) {
            try {
                if (f2937g == null) {
                    f2937g = new C0789c(context.getApplicationContext());
                }
                c0789c = f2937g;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c0789c;
    }

    /* renamed from: b */
    public final void m2000b(Intent intent) {
        int iMatch;
        synchronized (this.f2939b) {
            try {
                String action = intent.getAction();
                String strResolveTypeIfNeeded = intent.resolveTypeIfNeeded(this.f2938a.getContentResolver());
                Uri data = intent.getData();
                String scheme = intent.getScheme();
                Set<String> categories = intent.getCategories();
                boolean z2 = (intent.getFlags() & 8) != 0;
                if (z2) {
                    intent.toString();
                }
                ArrayList arrayList = (ArrayList) this.f2940c.get(intent.getAction());
                if (arrayList != null) {
                    if (z2) {
                        arrayList.toString();
                    }
                    ArrayList arrayList2 = null;
                    for (int i2 = 0; i2 < arrayList.size(); i2++) {
                        C0788b c0788b = (C0788b) arrayList.get(i2);
                        if (z2) {
                            Objects.toString(c0788b.f2933a);
                        }
                        if (!c0788b.f2935c && (iMatch = c0788b.f2933a.match(action, strResolveTypeIfNeeded, scheme, data, categories, "LocalBroadcastManager")) >= 0) {
                            if (z2) {
                                Integer.toHexString(iMatch);
                            }
                            if (arrayList2 == null) {
                                arrayList2 = new ArrayList();
                            }
                            arrayList2.add(c0788b);
                            c0788b.f2935c = true;
                        }
                    }
                    if (arrayList2 != null) {
                        for (int i3 = 0; i3 < arrayList2.size(); i3++) {
                            ((C0788b) arrayList2.get(i3)).f2935c = false;
                        }
                        this.f2941d.add(new C0019a(intent, 15, arrayList2));
                        if (!this.f2942e.hasMessages(1)) {
                            this.f2942e.sendEmptyMessage(1);
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
