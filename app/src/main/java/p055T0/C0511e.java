package p055T0;

import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Build;
import android.view.View;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentSkipListMap;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;
import p011D1.EnumC0131u;
import p014E1.AbstractC0145b;
import p028K.C0291u;
import p033L1.AbstractC0356d;
import p050R1.C0479g;
import p050R1.C0482j;
import p053S1.AbstractC0501b;
import p080b1.InterfaceC0779q;
import p110k1.AbstractC1206h;
import p110k1.AbstractC1209k;
import p131s1.AbstractC1326c;
import p149y1.AbstractC1403a;

/* renamed from: T0.e */
/* loaded from: classes.dex */
public class C0511e implements InterfaceC0779q {

    /* renamed from: b */
    public static C0511e f1582b;

    /* renamed from: a */
    public final /* synthetic */ int f1583a;

    public /* synthetic */ C0511e(int i2) {
        this.f1583a = i2;
    }

    /* renamed from: a */
    public static final String m1271a(byte[] bArr, byte[][] bArr2, int i2) {
        int i3;
        boolean z2;
        int i4;
        int i5;
        int i6 = -1;
        byte[] bArr3 = PublicSuffixDatabase.f5108e;
        int length = bArr.length;
        int i7 = 0;
        while (i7 < length) {
            int i8 = (i7 + length) / 2;
            while (i8 > i6 && bArr[i8] != ((byte) 10)) {
                i8 += i6;
            }
            int i9 = i8 + 1;
            int i10 = 1;
            while (true) {
                i3 = i9 + i10;
                if (bArr[i3] == ((byte) 10)) {
                    break;
                }
                i10++;
            }
            int i11 = i3 - i9;
            int i12 = i2;
            boolean z3 = false;
            int i13 = 0;
            int i14 = 0;
            while (true) {
                if (z3) {
                    i4 = 46;
                    z2 = false;
                } else {
                    byte b = bArr2[i12][i13];
                    byte[] bArr4 = AbstractC0145b.f495a;
                    int i15 = b & 255;
                    z2 = z3;
                    i4 = i15;
                }
                byte b3 = bArr[i9 + i14];
                byte[] bArr5 = AbstractC0145b.f495a;
                i5 = i4 - (b3 & 255);
                if (i5 != 0) {
                    break;
                }
                i14++;
                i13++;
                if (i14 == i11) {
                    break;
                }
                if (bArr2[i12].length != i13) {
                    z3 = z2;
                } else {
                    if (i12 == bArr2.length - 1) {
                        break;
                    }
                    i12++;
                    z3 = true;
                    i13 = -1;
                }
            }
            if (i5 >= 0) {
                if (i5 <= 0) {
                    int i16 = i11 - i14;
                    int length2 = bArr2[i12].length - i13;
                    int length3 = bArr2.length;
                    for (int i17 = i12 + 1; i17 < length3; i17++) {
                        length2 += bArr2[i17].length;
                    }
                    if (length2 >= i16) {
                        if (length2 <= i16) {
                            Charset charset = StandardCharsets.UTF_8;
                            AbstractC1326c.m3061d(charset, "UTF_8");
                            return new String(bArr, i9, i11, charset);
                        }
                    }
                    length = i8;
                }
                i7 = i3 + 1;
            } else {
                length = i8;
            }
            i6 = -1;
        }
        return null;
    }

    /* renamed from: b */
    public static ArrayList m1272b(List list) {
        AbstractC1326c.m3062e(list, "protocols");
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((EnumC0131u) obj) != EnumC0131u.HTTP_1_0) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(AbstractC1209k.m2850x0(arrayList));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((EnumC0131u) it.next()).f448a);
        }
        return arrayList2;
    }

    /* renamed from: c */
    public static byte[] m1273c(List list) {
        AbstractC1326c.m3062e(list, "protocols");
        C0479g c0479g = new C0479g();
        Iterator it = m1272b(list).iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            c0479g.m1194z(str.length());
            c0479g.m1169D(str);
        }
        return c0479g.m1180l(c0479g.f1480b);
    }

    /* renamed from: d */
    public static C0482j m1274d(String str) {
        if (str.length() % 2 != 0) {
            throw new IllegalArgumentException("Unexpected hex string: ".concat(str).toString());
        }
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i2 = 0; i2 < length; i2++) {
            int i3 = i2 * 2;
            bArr[i2] = (byte) (AbstractC0501b.m1243a(str.charAt(i3 + 1)) + (AbstractC0501b.m1243a(str.charAt(i3)) << 4));
        }
        return new C0482j(bArr);
    }

    /* renamed from: e */
    public static C0482j m1275e(String str) {
        AbstractC1326c.m3062e(str, "$this$encodeUtf8");
        byte[] bytes = str.getBytes(AbstractC1403a.f6077a);
        AbstractC1326c.m3061d(bytes, "(this as java.lang.String).getBytes(charset)");
        C0482j c0482j = new C0482j(bytes);
        c0482j.f1483b = str;
        return c0482j;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0045, code lost:
    
        if (java.lang.Character.isHighSurrogate(r5) != false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0082, code lost:
    
        if (java.lang.Character.isLowSurrogate(r5) != false) goto L58;
     */
    /* JADX WARN: Removed duplicated region for block: B:46:0x006c A[EDGE_INSN: B:92:0x006c->B:46:0x006c BREAK  A[LOOP:2: B:47:0x006e->B:58:0x0085], EDGE_INSN: B:93:0x006c->B:46:0x006c BREAK  A[LOOP:2: B:47:0x006e->B:58:0x0085, LOOP_LABEL: LOOP:2: B:47:0x006e->B:58:0x0085]] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00a2 A[ADDED_TO_REGION] */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean m1276g(p066X.C0589b r7, android.text.Editable r8, int r9, int r10, boolean r11) {
        /*
            Method dump skipped, instructions count: 240
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p055T0.C0511e.m1276g(X.b, android.text.Editable, int, int, boolean):boolean");
    }

    /* renamed from: h */
    public static boolean m1277h() {
        return "Dalvik".equals(System.getProperty("java.vm.name"));
    }

    /* renamed from: k */
    public static C0482j m1278k(byte[] bArr) {
        C0482j c0482j = C0482j.f1481d;
        int length = bArr.length;
        AbstractC0356d.m955e(bArr.length, 0, length);
        return new C0482j(AbstractC1206h.m2844o0(bArr, length));
    }

    /* renamed from: f */
    public Signature[] mo1279f(PackageManager packageManager, String str) {
        return packageManager.getPackageInfo(str, 64).signatures;
    }

    @Override // p080b1.InterfaceC0779q
    /* renamed from: i */
    public Object mo22i() {
        switch (this.f1583a) {
            case 22:
                return new TreeSet();
            case 23:
                return new LinkedHashSet();
            case 24:
                return new ArrayDeque();
            case 25:
                return new ArrayList();
            case 26:
                return new ConcurrentSkipListMap();
            case 27:
                return new ConcurrentHashMap();
            case 28:
                return new TreeMap();
            default:
                return new LinkedHashMap();
        }
    }

    /* renamed from: j */
    public boolean mo1280j(CharSequence charSequence) {
        return false;
    }

    public /* synthetic */ C0511e(int i2, Object obj) {
        this.f1583a = i2;
    }

    public C0511e(View view) {
        this.f1583a = 4;
        if (Build.VERSION.SDK_INT >= 30) {
            new C0291u(3, view);
        } else {
            new C0511e(3, view);
        }
    }
}
