package p003B;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageView;
import p002A1.C0027i;
import p011D1.C0118h;
import p011D1.EnumC0131u;
import p028K.AbstractC0241P;
import p045Q.AbstractC0442f;
import p086d.AbstractC0843a;
import p093e2.AbstractC0901d;
import p105j.AbstractC1117o0;
import p105j.C1131t;
import p131s1.AbstractC1326c;

/* renamed from: B.d */
/* loaded from: classes.dex */
public final class C0048d {

    /* renamed from: a */
    public final /* synthetic */ int f114a;

    /* renamed from: b */
    public int f115b;

    /* renamed from: c */
    public final Object f116c;

    /* renamed from: d */
    public Object f117d;

    public C0048d(EnumC0131u enumC0131u, int i2, String str) {
        this.f114a = 1;
        this.f116c = enumC0131u;
        this.f115b = i2;
        this.f117d = str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x01df, code lost:
    
        throw new org.xmlpull.v1.XmlPullParserException(r3.getPositionDescription() + ": <item> tag requires a 'color' attribute and a 'offset' attribute!");
     */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static p003B.C0048d m176b(android.content.res.Resources r29, int r30, android.content.res.Resources.Theme r31) {
        /*
            Method dump skipped, instructions count: 675
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p003B.C0048d.m176b(android.content.res.Resources, int, android.content.res.Resources$Theme):B.d");
    }

    /* renamed from: a */
    public void m177a() {
        C0118h c0118h;
        ImageView imageView = (ImageView) this.f116c;
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            AbstractC1117o0.m2732a(drawable);
        }
        if (drawable == null || (c0118h = (C0118h) this.f117d) == null) {
            return;
        }
        C1131t.m2752e(drawable, c0118h, imageView.getDrawableState());
    }

    /* renamed from: c */
    public boolean m178c() {
        ColorStateList colorStateList;
        return ((Shader) this.f116c) == null && (colorStateList = (ColorStateList) this.f117d) != null && colorStateList.isStateful();
    }

    /* renamed from: d */
    public void m179d(AttributeSet attributeSet, int i2) {
        int resourceId;
        ImageView imageView = (ImageView) this.f116c;
        Context context = imageView.getContext();
        int[] iArr = AbstractC0843a.f3456f;
        C0027i c0027iM98N = C0027i.m98N(context, attributeSet, iArr, i2);
        AbstractC0241P.m700l(imageView, imageView.getContext(), iArr, attributeSet, (TypedArray) c0027iM98N.f66c, i2);
        try {
            Drawable drawable = imageView.getDrawable();
            TypedArray typedArray = (TypedArray) c0027iM98N.f66c;
            if (drawable == null && (resourceId = typedArray.getResourceId(1, -1)) != -1 && (drawable = AbstractC0901d.m2321x(imageView.getContext(), resourceId)) != null) {
                imageView.setImageDrawable(drawable);
            }
            if (drawable != null) {
                AbstractC1117o0.m2732a(drawable);
            }
            if (typedArray.hasValue(2)) {
                AbstractC0442f.m1113c(imageView, c0027iM98N.m99A(2));
            }
            if (typedArray.hasValue(3)) {
                AbstractC0442f.m1114d(imageView, AbstractC1117o0.m2733b(typedArray.getInt(3, -1), null));
            }
            c0027iM98N.m114R();
        } catch (Throwable th) {
            c0027iM98N.m114R();
            throw th;
        }
    }

    public String toString() {
        switch (this.f114a) {
            case 1:
                StringBuilder sb = new StringBuilder();
                if (((EnumC0131u) this.f116c) == EnumC0131u.HTTP_1_0) {
                    sb.append("HTTP/1.0");
                } else {
                    sb.append("HTTP/1.1");
                }
                sb.append(' ');
                sb.append(this.f115b);
                sb.append(' ');
                sb.append((String) this.f117d);
                String string = sb.toString();
                AbstractC1326c.m3061d(string, "StringBuilder().apply(builderAction).toString()");
                return string;
            default:
                return super.toString();
        }
    }

    public C0048d(ImageView imageView) {
        this.f114a = 2;
        this.f115b = 0;
        this.f116c = imageView;
    }

    public C0048d(Shader shader, ColorStateList colorStateList, int i2) {
        this.f114a = 0;
        this.f116c = shader;
        this.f117d = colorStateList;
        this.f115b = i2;
    }
}
