package p024I1;

import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Random;
import p014E1.AbstractC0145b;

/* renamed from: I1.b */
/* loaded from: classes.dex */
public final class C0208b extends ThreadLocal {

    /* renamed from: a */
    public final /* synthetic */ int f765a;

    @Override // java.lang.ThreadLocal
    public final Object initialValue() {
        switch (this.f765a) {
            case 0:
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss 'GMT'", Locale.US);
                simpleDateFormat.setLenient(false);
                simpleDateFormat.setTimeZone(AbstractC0145b.f499e);
                return simpleDateFormat;
            default:
                return new Random();
        }
    }
}
