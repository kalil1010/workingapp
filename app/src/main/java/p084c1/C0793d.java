package p084c1;

import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;
import p073Z0.AbstractC0616l;
import p073Z0.C0611g;
import p080b1.AbstractC0773k;
import p088d1.AbstractC0858a;
import p101h1.C0987a;
import p101h1.C0988b;

/* renamed from: c1.d */
/* loaded from: classes.dex */
public final class C0793d extends AbstractC0616l {

    /* renamed from: b */
    public static final C0790a f2950b = new C0790a(1);

    /* renamed from: a */
    public final ArrayList f2951a;

    public C0793d() {
        ArrayList arrayList = new ArrayList();
        this.f2951a = arrayList;
        Locale locale = Locale.US;
        arrayList.add(DateFormat.getDateTimeInstance(2, 2, locale));
        if (!Locale.getDefault().equals(locale)) {
            arrayList.add(DateFormat.getDateTimeInstance(2, 2));
        }
        if (AbstractC0773k.f2897a >= 9) {
            arrayList.add(new SimpleDateFormat("MMM d, yyyy h:mm:ss a", locale));
        }
    }

    @Override // p073Z0.AbstractC0616l
    /* renamed from: a */
    public final Object mo1406a(C0987a c0987a) {
        if (c0987a.m2496B() == 9) {
            c0987a.m2521x();
            return null;
        }
        String strM2523z = c0987a.m2523z();
        synchronized (this.f2951a) {
            try {
                Iterator it = this.f2951a.iterator();
                while (it.hasNext()) {
                    try {
                        return ((DateFormat) it.next()).parse(strM2523z);
                    } catch (ParseException unused) {
                    }
                }
                try {
                    return AbstractC0858a.m2180b(strM2523z, new ParsePosition(0));
                } catch (ParseException e3) {
                    throw new C0611g("Failed parsing '" + strM2523z + "' as Date; at path " + c0987a.m2511n(true), e3);
                }
            } finally {
            }
        }
    }

    @Override // p073Z0.AbstractC0616l
    /* renamed from: b */
    public final void mo1407b(C0988b c0988b, Object obj) throws IOException {
        String str;
        Date date = (Date) obj;
        if (date == null) {
            c0988b.m2532o();
            return;
        }
        DateFormat dateFormat = (DateFormat) this.f2951a.get(0);
        synchronized (this.f2951a) {
            str = dateFormat.format(date);
        }
        c0988b.m2538u(str);
    }
}
