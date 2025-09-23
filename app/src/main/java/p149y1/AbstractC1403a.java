package p149y1;

import java.nio.charset.Charset;
import p131s1.AbstractC1326c;

/* renamed from: y1.a */
/* loaded from: classes.dex */
public abstract class AbstractC1403a {

    /* renamed from: a */
    public static final Charset f6077a;

    /* renamed from: b */
    public static volatile Charset f6078b;

    /* renamed from: c */
    public static volatile Charset f6079c;

    static {
        Charset charsetForName = Charset.forName("UTF-8");
        AbstractC1326c.m3061d(charsetForName, "forName(\"UTF-8\")");
        f6077a = charsetForName;
        AbstractC1326c.m3061d(Charset.forName("UTF-16"), "forName(\"UTF-16\")");
        AbstractC1326c.m3061d(Charset.forName("UTF-16BE"), "forName(\"UTF-16BE\")");
        AbstractC1326c.m3061d(Charset.forName("UTF-16LE"), "forName(\"UTF-16LE\")");
        AbstractC1326c.m3061d(Charset.forName("US-ASCII"), "forName(\"US-ASCII\")");
        AbstractC1326c.m3061d(Charset.forName("ISO-8859-1"), "forName(\"ISO-8859-1\")");
    }
}
