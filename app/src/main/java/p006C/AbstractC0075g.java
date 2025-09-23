package p006C;

import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.C0686D;
import java.util.Iterator;
import java.util.Objects;
import p124q.AbstractC1271e;
import p131s1.AbstractC1326c;

/* renamed from: C.g */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC0075g {
    /* renamed from: a */
    public static final void m232a(View view, int i2) {
        int iM2966a = AbstractC1271e.m2966a(i2);
        if (iM2966a == 0) {
            ViewGroup viewGroup = (ViewGroup) view.getParent();
            if (viewGroup != null) {
                if (C0686D.m1646D(2)) {
                    view.toString();
                    viewGroup.toString();
                }
                viewGroup.removeView(view);
                return;
            }
            return;
        }
        if (iM2966a == 1) {
            if (C0686D.m1646D(2)) {
                Objects.toString(view);
            }
            view.setVisibility(0);
        } else if (iM2966a == 2) {
            if (C0686D.m1646D(2)) {
                Objects.toString(view);
            }
            view.setVisibility(8);
        } else {
            if (iM2966a != 3) {
                return;
            }
            if (C0686D.m1646D(2)) {
                Objects.toString(view);
            }
            view.setVisibility(4);
        }
    }

    /* renamed from: b */
    public static int m233b(int i2) {
        if (i2 == 0) {
            return 2;
        }
        if (i2 == 4) {
            return 4;
        }
        if (i2 == 8) {
            return 3;
        }
        throw new IllegalArgumentException(m236e("Unknown visibility ", i2));
    }

    /* renamed from: c */
    public static int m234c(View view) {
        if (view.getAlpha() == 0.0f && view.getVisibility() == 0) {
            return 4;
        }
        return m233b(view.getVisibility());
    }

    /* renamed from: d */
    public static ClassCastException m235d(Iterator it) {
        it.next().getClass();
        return new ClassCastException();
    }

    /* renamed from: e */
    public static String m236e(String str, int i2) {
        return str + i2;
    }

    /* renamed from: f */
    public static String m237f(String str, String str2) {
        return str + str2;
    }

    /* renamed from: g */
    public static String m238g(String str, String str2, String str3) {
        return str + str2 + str3;
    }

    /* renamed from: h */
    public static /* synthetic */ void m239h(int i2) {
        if (i2 != 0) {
            return;
        }
        NullPointerException nullPointerException = new NullPointerException();
        AbstractC1326c.m3064g(nullPointerException, AbstractC1326c.class.getName());
        throw nullPointerException;
    }

    /* renamed from: i */
    public static /* synthetic */ void m240i(String str, int i2) {
        if (i2 == 0) {
            StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
            String name = AbstractC1326c.class.getName();
            int i3 = 0;
            while (!stackTrace[i3].getClassName().equals(name)) {
                i3++;
            }
            while (stackTrace[i3].getClassName().equals(name)) {
                i3++;
            }
            StackTraceElement stackTraceElement = stackTrace[i3];
            NullPointerException nullPointerException = new NullPointerException("Parameter specified as non-null is null: method " + stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName() + ", parameter " + str);
            AbstractC1326c.m3064g(nullPointerException, AbstractC1326c.class.getName());
            throw nullPointerException;
        }
    }

    /* renamed from: j */
    public static /* synthetic */ String m241j(int i2) {
        switch (i2) {
            case 1:
                return "NONE";
            case 2:
                return "LEFT";
            case 3:
                return "TOP";
            case 4:
                return "RIGHT";
            case 5:
                return "BOTTOM";
            case 6:
                return "BASELINE";
            case 7:
                return "CENTER";
            case 8:
                return "CENTER_X";
            case 9:
                return "CENTER_Y";
            default:
                throw null;
        }
    }

    /* renamed from: k */
    public static /* synthetic */ String m242k(int i2) {
        switch (i2) {
            case 1:
                return "BEGIN_ARRAY";
            case 2:
                return "END_ARRAY";
            case 3:
                return "BEGIN_OBJECT";
            case 4:
                return "END_OBJECT";
            case 5:
                return "NAME";
            case 6:
                return "STRING";
            case 7:
                return "NUMBER";
            case 8:
                return "BOOLEAN";
            case 9:
                return "NULL";
            case 10:
                return "END_DOCUMENT";
            default:
                return "null";
        }
    }
}
