package p138v;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.TypedValue;
import android.util.Xml;
import java.util.HashMap;
import p124q.AbstractC1271e;

/* renamed from: v.b */
/* loaded from: classes.dex */
public final class C1357b {

    /* renamed from: a */
    public boolean f5755a = false;

    /* renamed from: b */
    public int f5756b;

    /* renamed from: c */
    public int f5757c;

    /* renamed from: d */
    public float f5758d;

    /* renamed from: e */
    public String f5759e;

    /* renamed from: f */
    public boolean f5760f;

    /* renamed from: g */
    public int f5761g;

    public C1357b(C1357b c1357b, Object obj) {
        c1357b.getClass();
        this.f5756b = c1357b.f5756b;
        m3115b(obj);
    }

    /* renamed from: a */
    public static void m3114a(Context context, XmlResourceParser xmlResourceParser, HashMap map) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), AbstractC1372q.f5974d);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        String string = null;
        int i2 = 0;
        boolean z2 = false;
        Object objValueOf = null;
        for (int i3 = 0; i3 < indexCount; i3++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i3);
            int i4 = 1;
            if (index == 0) {
                string = typedArrayObtainStyledAttributes.getString(index);
                if (string != null && string.length() > 0) {
                    string = Character.toUpperCase(string.charAt(0)) + string.substring(1);
                }
            } else if (index == 10) {
                string = typedArrayObtainStyledAttributes.getString(index);
                z2 = true;
            } else if (index == 1) {
                objValueOf = Boolean.valueOf(typedArrayObtainStyledAttributes.getBoolean(index, false));
                i2 = 6;
            } else {
                int i5 = 3;
                if (index == 3) {
                    objValueOf = Integer.valueOf(typedArrayObtainStyledAttributes.getColor(index, 0));
                } else {
                    i5 = 4;
                    if (index == 2) {
                        objValueOf = Integer.valueOf(typedArrayObtainStyledAttributes.getColor(index, 0));
                    } else {
                        if (index == 7) {
                            objValueOf = Float.valueOf(TypedValue.applyDimension(1, typedArrayObtainStyledAttributes.getDimension(index, 0.0f), context.getResources().getDisplayMetrics()));
                        } else if (index == 4) {
                            objValueOf = Float.valueOf(typedArrayObtainStyledAttributes.getDimension(index, 0.0f));
                        } else {
                            i5 = 5;
                            if (index == 5) {
                                objValueOf = Float.valueOf(typedArrayObtainStyledAttributes.getFloat(index, Float.NaN));
                                i2 = 2;
                            } else {
                                if (index == 6) {
                                    objValueOf = Integer.valueOf(typedArrayObtainStyledAttributes.getInteger(index, -1));
                                } else if (index == 9) {
                                    objValueOf = typedArrayObtainStyledAttributes.getString(index);
                                } else {
                                    i4 = 8;
                                    if (index == 8) {
                                        int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                                        if (resourceId == -1) {
                                            resourceId = typedArrayObtainStyledAttributes.getInt(index, -1);
                                        }
                                        objValueOf = Integer.valueOf(resourceId);
                                    }
                                }
                                i2 = i4;
                            }
                        }
                        i2 = 7;
                    }
                }
                i2 = i5;
            }
        }
        if (string != null && objValueOf != null) {
            C1357b c1357b = new C1357b();
            c1357b.f5756b = i2;
            c1357b.f5755a = z2;
            c1357b.m3115b(objValueOf);
            map.put(string, c1357b);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    /* renamed from: b */
    public final void m3115b(Object obj) {
        switch (AbstractC1271e.m2966a(this.f5756b)) {
            case 0:
            case 7:
                this.f5757c = ((Integer) obj).intValue();
                break;
            case 1:
                this.f5758d = ((Float) obj).floatValue();
                break;
            case 2:
            case 3:
                this.f5761g = ((Integer) obj).intValue();
                break;
            case 4:
                this.f5759e = (String) obj;
                break;
            case 5:
                this.f5760f = ((Boolean) obj).booleanValue();
                break;
            case 6:
                this.f5758d = ((Float) obj).floatValue();
                break;
        }
    }
}
