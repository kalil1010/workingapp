package p099h;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.SubMenu;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import org.xmlpull.v1.XmlPullParserException;
import p002A1.C0027i;
import p086d.AbstractC0843a;
import p102i.ActionProviderVisibilityListenerC1009o;
import p102i.MenuC1006l;
import p105j.AbstractC1117o0;

/* renamed from: h.i */
/* loaded from: classes.dex */
public final class C0979i extends MenuInflater {

    /* renamed from: e */
    public static final Class[] f4117e;

    /* renamed from: f */
    public static final Class[] f4118f;

    /* renamed from: a */
    public final Object[] f4119a;

    /* renamed from: b */
    public final Object[] f4120b;

    /* renamed from: c */
    public final Context f4121c;

    /* renamed from: d */
    public Object f4122d;

    static {
        Class[] clsArr = {Context.class};
        f4117e = clsArr;
        f4118f = clsArr;
    }

    public C0979i(Context context) {
        super(context);
        this.f4121c = context;
        Object[] objArr = {context};
        this.f4119a = objArr;
        this.f4120b = objArr;
    }

    /* renamed from: a */
    public static Object m2484a(Object obj) {
        return (!(obj instanceof Activity) && (obj instanceof ContextWrapper)) ? m2484a(((ContextWrapper) obj).getBaseContext()) : obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v58 */
    /* renamed from: b */
    public final void m2485b(XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Menu menu) throws XmlPullParserException, IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        ?? r4;
        int i2;
        XmlResourceParser xmlResourceParser2;
        boolean z2;
        ColorStateList colorStateList;
        C0978h c0978h = new C0978h(this, menu);
        int eventType = xmlResourceParser.getEventType();
        while (true) {
            r4 = 1;
            i2 = 2;
            if (eventType == 2) {
                String name = xmlResourceParser.getName();
                if (!name.equals("menu")) {
                    throw new RuntimeException("Expecting menu, got ".concat(name));
                }
                eventType = xmlResourceParser.next();
            } else {
                eventType = xmlResourceParser.next();
                if (eventType == 1) {
                    break;
                }
            }
        }
        boolean z3 = false;
        boolean z4 = false;
        String str = null;
        while (!z3) {
            if (eventType == r4) {
                throw new RuntimeException("Unexpected end of document");
            }
            if (eventType != i2) {
                if (eventType != 3) {
                    xmlResourceParser2 = xmlResourceParser;
                    z2 = r4;
                } else {
                    String name2 = xmlResourceParser.getName();
                    if (z4 && name2.equals(str)) {
                        xmlResourceParser2 = xmlResourceParser;
                        z2 = r4;
                        z4 = false;
                        str = null;
                    } else {
                        if (name2.equals("group")) {
                            c0978h.f4092b = 0;
                            c0978h.f4093c = 0;
                            c0978h.f4094d = 0;
                            c0978h.f4095e = 0;
                            c0978h.f4096f = r4;
                            c0978h.f4097g = r4;
                        } else if (name2.equals("item")) {
                            if (!c0978h.f4098h) {
                                ActionProviderVisibilityListenerC1009o actionProviderVisibilityListenerC1009o = c0978h.f4116z;
                                if (actionProviderVisibilityListenerC1009o == null || !actionProviderVisibilityListenerC1009o.f4307a.hasSubMenu()) {
                                    c0978h.f4098h = r4;
                                    c0978h.m2483b(c0978h.f4091a.add(c0978h.f4092b, c0978h.f4099i, c0978h.f4100j, c0978h.f4101k));
                                } else {
                                    c0978h.f4098h = r4;
                                    c0978h.m2483b(c0978h.f4091a.addSubMenu(c0978h.f4092b, c0978h.f4099i, c0978h.f4100j, c0978h.f4101k).getItem());
                                }
                            }
                        } else if (name2.equals("menu")) {
                            xmlResourceParser2 = xmlResourceParser;
                            z2 = r4;
                            z3 = z2;
                        }
                        xmlResourceParser2 = xmlResourceParser;
                        z2 = r4;
                    }
                }
                eventType = xmlResourceParser2.next();
                r4 = z2;
                i2 = 2;
                z4 = z4;
            } else {
                if (!z4) {
                    String name3 = xmlResourceParser.getName();
                    boolean zEquals = name3.equals("group");
                    C0979i c0979i = c0978h.f4090E;
                    if (zEquals) {
                        TypedArray typedArrayObtainStyledAttributes = c0979i.f4121c.obtainStyledAttributes(attributeSet, AbstractC0843a.f3467q);
                        c0978h.f4092b = typedArrayObtainStyledAttributes.getResourceId(r4, 0);
                        c0978h.f4093c = typedArrayObtainStyledAttributes.getInt(3, 0);
                        c0978h.f4094d = typedArrayObtainStyledAttributes.getInt(4, 0);
                        c0978h.f4095e = typedArrayObtainStyledAttributes.getInt(5, 0);
                        c0978h.f4096f = typedArrayObtainStyledAttributes.getBoolean(2, r4);
                        c0978h.f4097g = typedArrayObtainStyledAttributes.getBoolean(0, r4);
                        typedArrayObtainStyledAttributes.recycle();
                    } else {
                        if (name3.equals("item")) {
                            C0027i c0027iM97M = C0027i.m97M(c0979i.f4121c, attributeSet, AbstractC0843a.f3468r);
                            TypedArray typedArray = (TypedArray) c0027iM97M.f66c;
                            c0978h.f4099i = typedArray.getResourceId(2, 0);
                            c0978h.f4100j = (typedArray.getInt(5, c0978h.f4093c) & (-65536)) | (typedArray.getInt(6, c0978h.f4094d) & 65535);
                            c0978h.f4101k = typedArray.getText(7);
                            c0978h.f4102l = typedArray.getText(8);
                            c0978h.f4103m = typedArray.getResourceId(0, 0);
                            String string = typedArray.getString(9);
                            c0978h.f4104n = string == null ? (char) 0 : string.charAt(0);
                            c0978h.f4105o = typedArray.getInt(16, 4096);
                            String string2 = typedArray.getString(10);
                            c0978h.f4106p = string2 == null ? (char) 0 : string2.charAt(0);
                            c0978h.f4107q = typedArray.getInt(20, 4096);
                            if (typedArray.hasValue(11)) {
                                c0978h.f4108r = typedArray.getBoolean(11, false) ? 1 : 0;
                            } else {
                                c0978h.f4108r = c0978h.f4095e;
                            }
                            c0978h.f4109s = typedArray.getBoolean(3, false);
                            c0978h.f4110t = typedArray.getBoolean(4, c0978h.f4096f);
                            c0978h.f4111u = typedArray.getBoolean(1, c0978h.f4097g);
                            c0978h.f4112v = typedArray.getInt(21, -1);
                            c0978h.f4115y = typedArray.getString(12);
                            c0978h.f4113w = typedArray.getResourceId(13, 0);
                            c0978h.f4114x = typedArray.getString(15);
                            String string3 = typedArray.getString(14);
                            if (string3 != null && c0978h.f4113w == 0 && c0978h.f4114x == null) {
                                c0978h.f4116z = (ActionProviderVisibilityListenerC1009o) c0978h.m2482a(string3, f4118f, c0979i.f4120b);
                            } else {
                                c0978h.f4116z = null;
                            }
                            c0978h.f4086A = typedArray.getText(17);
                            c0978h.f4087B = typedArray.getText(22);
                            if (typedArray.hasValue(19)) {
                                c0978h.f4089D = AbstractC1117o0.m2733b(typedArray.getInt(19, -1), c0978h.f4089D);
                                colorStateList = null;
                            } else {
                                colorStateList = null;
                                c0978h.f4089D = null;
                            }
                            if (typedArray.hasValue(18)) {
                                c0978h.f4088C = c0027iM97M.m99A(18);
                            } else {
                                c0978h.f4088C = colorStateList;
                            }
                            c0027iM97M.m114R();
                            c0978h.f4098h = false;
                            xmlResourceParser2 = xmlResourceParser;
                            z2 = true;
                        } else if (name3.equals("menu")) {
                            z2 = true;
                            c0978h.f4098h = true;
                            SubMenu subMenuAddSubMenu = c0978h.f4091a.addSubMenu(c0978h.f4092b, c0978h.f4099i, c0978h.f4100j, c0978h.f4101k);
                            c0978h.m2483b(subMenuAddSubMenu.getItem());
                            xmlResourceParser2 = xmlResourceParser;
                            m2485b(xmlResourceParser2, attributeSet, subMenuAddSubMenu);
                        } else {
                            xmlResourceParser2 = xmlResourceParser;
                            z2 = true;
                            str = name3;
                            z4 = true;
                        }
                        eventType = xmlResourceParser2.next();
                        r4 = z2;
                        i2 = 2;
                        z4 = z4;
                    }
                }
                xmlResourceParser2 = xmlResourceParser;
                z2 = r4;
            }
            eventType = xmlResourceParser2.next();
            r4 = z2;
            i2 = 2;
            z4 = z4;
        }
    }

    @Override // android.view.MenuInflater
    public final void inflate(int i2, Menu menu) {
        if (!(menu instanceof MenuC1006l)) {
            super.inflate(i2, menu);
            return;
        }
        XmlResourceParser layout = null;
        try {
            try {
                try {
                    layout = this.f4121c.getResources().getLayout(i2);
                    m2485b(layout, Xml.asAttributeSet(layout), menu);
                    layout.close();
                } catch (IOException e3) {
                    throw new InflateException("Error inflating menu XML", e3);
                }
            } catch (XmlPullParserException e4) {
                throw new InflateException("Error inflating menu XML", e4);
            }
        } catch (Throwable th) {
            if (layout != null) {
                layout.close();
            }
            throw th;
        }
    }
}
