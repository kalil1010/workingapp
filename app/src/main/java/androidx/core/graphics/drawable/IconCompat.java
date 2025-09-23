package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.os.Build;
import android.os.Parcelable;
import androidx.versionedparcelable.CustomVersionedParcelable;
import java.lang.reflect.InvocationTargetException;
import p009D.AbstractC0100c;

/* loaded from: classes.dex */
public class IconCompat extends CustomVersionedParcelable {

    /* renamed from: k */
    public static final PorterDuff.Mode f2307k = PorterDuff.Mode.SRC_IN;

    /* renamed from: b */
    public Object f2309b;

    /* renamed from: j */
    public String f2317j;

    /* renamed from: a */
    public int f2308a = -1;

    /* renamed from: c */
    public byte[] f2310c = null;

    /* renamed from: d */
    public Parcelable f2311d = null;

    /* renamed from: e */
    public int f2312e = 0;

    /* renamed from: f */
    public int f2313f = 0;

    /* renamed from: g */
    public ColorStateList f2314g = null;

    /* renamed from: h */
    public PorterDuff.Mode f2315h = f2307k;

    /* renamed from: i */
    public String f2316i = null;

    public final String toString() {
        String str;
        int iIntValue;
        if (this.f2308a == -1) {
            return String.valueOf(this.f2309b);
        }
        StringBuilder sb = new StringBuilder("Icon(typ=");
        switch (this.f2308a) {
            case 1:
                str = "BITMAP";
                break;
            case 2:
                str = "RESOURCE";
                break;
            case 3:
                str = "DATA";
                break;
            case 4:
                str = "URI";
                break;
            case 5:
                str = "BITMAP_MASKABLE";
                break;
            case 6:
                str = "URI_MASKABLE";
                break;
            default:
                str = "UNKNOWN";
                break;
        }
        sb.append(str);
        switch (this.f2308a) {
            case 1:
            case 5:
                sb.append(" size=");
                sb.append(((Bitmap) this.f2309b).getWidth());
                sb.append("x");
                sb.append(((Bitmap) this.f2309b).getHeight());
                break;
            case 2:
                sb.append(" pkg=");
                sb.append(this.f2317j);
                sb.append(" id=");
                int i2 = this.f2308a;
                if (i2 == -1) {
                    int i3 = Build.VERSION.SDK_INT;
                    Object obj = this.f2309b;
                    if (i3 >= 28) {
                        iIntValue = AbstractC0100c.m304a(obj);
                    } else {
                        iIntValue = 0;
                        try {
                            iIntValue = ((Integer) obj.getClass().getMethod("getResId", new Class[0]).invoke(obj, new Object[0])).intValue();
                        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                        }
                    }
                } else {
                    if (i2 != 2) {
                        throw new IllegalStateException("called getResId() on " + this);
                    }
                    iIntValue = this.f2312e;
                }
                sb.append(String.format("0x%08x", Integer.valueOf(iIntValue)));
                break;
            case 3:
                sb.append(" len=");
                sb.append(this.f2312e);
                if (this.f2313f != 0) {
                    sb.append(" off=");
                    sb.append(this.f2313f);
                    break;
                }
                break;
            case 4:
            case 6:
                sb.append(" uri=");
                sb.append(this.f2309b);
                break;
        }
        if (this.f2314g != null) {
            sb.append(" tint=");
            sb.append(this.f2314g);
        }
        if (this.f2315h != f2307k) {
            sb.append(" mode=");
            sb.append(this.f2315h);
        }
        sb.append(")");
        return sb.toString();
    }
}
