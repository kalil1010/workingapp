package p142w0;

import java.util.regex.Pattern;
import p085c2.AbstractC0808b;
import p085c2.InterfaceC0807a;

/* renamed from: w0.e */
/* loaded from: classes.dex */
public abstract class AbstractC1386e {

    /* renamed from: a */
    public static final InterfaceC0807a f6004a = AbstractC0808b.m2014d(AbstractC1386e.class);

    /* renamed from: b */
    public static final Pattern f6005b = Pattern.compile("([0-9]{1,19})D([0-9]{4})([0-9]{3})?(.*)");

    /* renamed from: c */
    public static final Pattern f6006c = Pattern.compile("%?([A-Z])([0-9]{1,19})(\\?[0-9])?\\^([^\\^]{2,26})\\^([0-9]{4}|\\^)([0-9]{3}|\\^)([^\\?]+)\\??");
}
