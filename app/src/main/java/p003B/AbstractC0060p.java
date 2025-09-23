package p003B;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Handler;
import android.os.Looper;
import android.util.TypedValue;
import java.io.IOException;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParserException;
import p002A1.RunnableC0026h;
import p006C.AbstractC0077i;
import p119o.C1244f;

/* renamed from: B.p */
/* loaded from: classes.dex */
public abstract class AbstractC0060p {

    /* renamed from: a */
    public static final ThreadLocal f137a = new ThreadLocal();

    /* renamed from: b */
    public static final WeakHashMap f138b = new WeakHashMap(0);

    /* renamed from: c */
    public static final Object f139c = new Object();

    /* renamed from: a */
    public static Typeface m186a(Context context, int i2) {
        if (context.isRestricted()) {
            return null;
        }
        return m187b(context, i2, new TypedValue(), 0, null, false, false);
    }

    /* renamed from: b */
    public static Typeface m187b(Context context, int i2, TypedValue typedValue, int i3, AbstractC0046b abstractC0046b, boolean z2, boolean z3) throws Resources.NotFoundException {
        Resources resources = context.getResources();
        resources.getValue(i2, typedValue, true);
        CharSequence charSequence = typedValue.string;
        if (charSequence == null) {
            throw new Resources.NotFoundException("Resource \"" + resources.getResourceName(i2) + "\" (" + Integer.toHexString(i2) + ") is not a Font: " + typedValue);
        }
        String string = charSequence.toString();
        Typeface typefaceM245a = null;
        if (string.startsWith("res/")) {
            int i4 = typedValue.assetCookie;
            C1244f c1244f = AbstractC0077i.f180b;
            Typeface typeface = (Typeface) c1244f.m2903a(AbstractC0077i.m246b(resources, i2, string, i4, i3));
            if (typeface != null) {
                if (abstractC0046b != null) {
                    new Handler(Looper.getMainLooper()).post(new RunnableC0026h(abstractC0046b, 1, typeface));
                }
                typefaceM245a = typeface;
            } else if (!z3) {
                try {
                    if (string.toLowerCase().endsWith(".xml")) {
                        InterfaceC0050f interfaceC0050fM167i = AbstractC0046b.m167i(resources.getXml(i2), resources);
                        if (interfaceC0050fM167i != null) {
                            typefaceM245a = AbstractC0077i.m245a(context, interfaceC0050fM167i, resources, i2, string, typedValue.assetCookie, i3, abstractC0046b, z2);
                        } else if (abstractC0046b != null) {
                            abstractC0046b.m171a(-3);
                        }
                    } else {
                        int i5 = typedValue.assetCookie;
                        Typeface typefaceMo260y = AbstractC0077i.f179a.mo260y(context, resources, i2, string, i3);
                        if (typefaceMo260y != null) {
                            c1244f.m2904b(AbstractC0077i.m246b(resources, i2, string, i5, i3), typefaceMo260y);
                        }
                        if (abstractC0046b != null) {
                            if (typefaceMo260y != null) {
                                new Handler(Looper.getMainLooper()).post(new RunnableC0026h(abstractC0046b, 1, typefaceMo260y));
                            } else {
                                abstractC0046b.m171a(-3);
                            }
                        }
                        typefaceM245a = typefaceMo260y;
                    }
                } catch (IOException | XmlPullParserException unused) {
                    if (abstractC0046b != null) {
                        abstractC0046b.m171a(-3);
                    }
                }
            }
        } else if (abstractC0046b != null) {
            abstractC0046b.m171a(-3);
        }
        if (typefaceM245a != null || abstractC0046b != null || z3) {
            return typefaceM245a;
        }
        throw new Resources.NotFoundException("Font resource ID #0x" + Integer.toHexString(i2) + " could not be retrieved.");
    }
}
