package p095f1;

import java.io.IOException;
import java.sql.Time;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import p073Z0.AbstractC0616l;
import p073Z0.C0611g;
import p084c1.C0790a;
import p101h1.C0987a;
import p101h1.C0988b;

/* renamed from: f1.a */
/* loaded from: classes.dex */
public final class C0962a extends AbstractC0616l {

    /* renamed from: c */
    public static final C0790a f4035c = new C0790a(4);

    /* renamed from: d */
    public static final C0790a f4036d = new C0790a(5);

    /* renamed from: e */
    public static final C0790a f4037e = new C0790a(6);

    /* renamed from: a */
    public final /* synthetic */ int f4038a;

    /* renamed from: b */
    public final Object f4039b;

    public C0962a(int i2) {
        this.f4038a = i2;
        switch (i2) {
            case 1:
                this.f4039b = new SimpleDateFormat("hh:mm:ss a");
                break;
            default:
                this.f4039b = new SimpleDateFormat("MMM d, yyyy");
                break;
        }
    }

    @Override // p073Z0.AbstractC0616l
    /* renamed from: a */
    public final Object mo1406a(C0987a c0987a) {
        Date date;
        Time time;
        switch (this.f4038a) {
            case 0:
                if (c0987a.m2496B() == 9) {
                    c0987a.m2521x();
                    return null;
                }
                String strM2523z = c0987a.m2523z();
                try {
                    synchronized (this) {
                        date = ((SimpleDateFormat) this.f4039b).parse(strM2523z);
                    }
                    return new java.sql.Date(date.getTime());
                } catch (ParseException e3) {
                    throw new C0611g("Failed parsing '" + strM2523z + "' as SQL Date; at path " + c0987a.m2511n(true), e3);
                }
            case 1:
                if (c0987a.m2496B() == 9) {
                    c0987a.m2521x();
                    return null;
                }
                String strM2523z2 = c0987a.m2523z();
                try {
                    synchronized (this) {
                        time = new Time(((SimpleDateFormat) this.f4039b).parse(strM2523z2).getTime());
                    }
                    return time;
                } catch (ParseException e4) {
                    throw new C0611g("Failed parsing '" + strM2523z2 + "' as SQL Time; at path " + c0987a.m2511n(true), e4);
                }
            default:
                Date date2 = (Date) ((AbstractC0616l) this.f4039b).mo1406a(c0987a);
                if (date2 != null) {
                    return new Timestamp(date2.getTime());
                }
                return null;
        }
    }

    @Override // p073Z0.AbstractC0616l
    /* renamed from: b */
    public final void mo1407b(C0988b c0988b, Object obj) throws IOException {
        String str;
        String str2;
        switch (this.f4038a) {
            case 0:
                java.sql.Date date = (java.sql.Date) obj;
                if (date == null) {
                    c0988b.m2532o();
                    return;
                }
                synchronized (this) {
                    str = ((SimpleDateFormat) this.f4039b).format((Date) date);
                }
                c0988b.m2538u(str);
                return;
            case 1:
                Time time = (Time) obj;
                if (time == null) {
                    c0988b.m2532o();
                    return;
                }
                synchronized (this) {
                    str2 = ((SimpleDateFormat) this.f4039b).format((Date) time);
                }
                c0988b.m2538u(str2);
                return;
            default:
                ((AbstractC0616l) this.f4039b).mo1407b(c0988b, (Timestamp) obj);
                return;
        }
    }

    public C0962a(AbstractC0616l abstractC0616l) {
        this.f4038a = 2;
        this.f4039b = abstractC0616l;
    }
}
