package p101h1;

import java.io.Closeable;
import java.io.IOException;
import java.io.StringReader;
import java.util.Arrays;
import p006C.AbstractC0075g;
import p080b1.C0767e;

/* renamed from: h1.a */
/* loaded from: classes.dex */
public class C0987a implements Closeable {

    /* renamed from: a */
    public final StringReader f4138a;

    /* renamed from: i */
    public long f4146i;

    /* renamed from: j */
    public int f4147j;

    /* renamed from: k */
    public String f4148k;

    /* renamed from: l */
    public int[] f4149l;

    /* renamed from: n */
    public String[] f4151n;

    /* renamed from: o */
    public int[] f4152o;

    /* renamed from: b */
    public boolean f4139b = false;

    /* renamed from: c */
    public final char[] f4140c = new char[1024];

    /* renamed from: d */
    public int f4141d = 0;

    /* renamed from: e */
    public int f4142e = 0;

    /* renamed from: f */
    public int f4143f = 0;

    /* renamed from: g */
    public int f4144g = 0;

    /* renamed from: h */
    public int f4145h = 0;

    /* renamed from: m */
    public int f4150m = 1;

    static {
        C0767e.f2881b = new C0767e(8);
    }

    public C0987a(StringReader stringReader) {
        int[] iArr = new int[32];
        this.f4149l = iArr;
        iArr[0] = 6;
        this.f4151n = new String[32];
        this.f4152o = new int[32];
        this.f4138a = stringReader;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x004a, code lost:
    
        m2506i();
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:32:0x0044. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0084  */
    /* renamed from: A */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String m2495A() throws p101h1.C0989c {
        /*
            r7 = this;
            r0 = 0
            r1 = 0
        L2:
            r2 = r1
        L3:
            int r3 = r7.f4141d
            int r4 = r3 + r2
            int r5 = r7.f4142e
            char[] r6 = r7.f4140c
            if (r4 >= r5) goto L4e
            int r3 = r3 + r2
            char r3 = r6[r3]
            r4 = 9
            if (r3 == r4) goto L5a
            r4 = 10
            if (r3 == r4) goto L5a
            r4 = 12
            if (r3 == r4) goto L5a
            r4 = 13
            if (r3 == r4) goto L5a
            r4 = 32
            if (r3 == r4) goto L5a
            r4 = 35
            if (r3 == r4) goto L4a
            r4 = 44
            if (r3 == r4) goto L5a
            r4 = 47
            if (r3 == r4) goto L4a
            r4 = 61
            if (r3 == r4) goto L4a
            r4 = 123(0x7b, float:1.72E-43)
            if (r3 == r4) goto L5a
            r4 = 125(0x7d, float:1.75E-43)
            if (r3 == r4) goto L5a
            r4 = 58
            if (r3 == r4) goto L5a
            r4 = 59
            if (r3 == r4) goto L4a
            switch(r3) {
                case 91: goto L5a;
                case 92: goto L4a;
                case 93: goto L5a;
                default: goto L47;
            }
        L47:
            int r2 = r2 + 1
            goto L3
        L4a:
            r7.m2506i()
            goto L5a
        L4e:
            int r3 = r6.length
            if (r2 >= r3) goto L5c
            int r3 = r2 + 1
            boolean r3 = r7.m2510m(r3)
            if (r3 == 0) goto L5a
            goto L3
        L5a:
            r1 = r2
            goto L7a
        L5c:
            if (r0 != 0) goto L69
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r3 = 16
            int r3 = java.lang.Math.max(r2, r3)
            r0.<init>(r3)
        L69:
            int r3 = r7.f4141d
            r0.append(r6, r3, r2)
            int r3 = r7.f4141d
            int r3 = r3 + r2
            r7.f4141d = r3
            r2 = 1
            boolean r2 = r7.m2510m(r2)
            if (r2 != 0) goto L2
        L7a:
            if (r0 != 0) goto L84
            java.lang.String r0 = new java.lang.String
            int r2 = r7.f4141d
            r0.<init>(r6, r2, r1)
            goto L8d
        L84:
            int r2 = r7.f4141d
            r0.append(r6, r2, r1)
            java.lang.String r0 = r0.toString()
        L8d:
            int r2 = r7.f4141d
            int r2 = r2 + r1
            r7.f4141d = r2
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p101h1.C0987a.m2495A():java.lang.String");
    }

    /* renamed from: B */
    public final int m2496B() {
        int iM2507j = this.f4145h;
        if (iM2507j == 0) {
            iM2507j = m2507j();
        }
        switch (iM2507j) {
            case 1:
                return 3;
            case 2:
                return 4;
            case 3:
                return 1;
            case 4:
                return 2;
            case 5:
            case 6:
                return 8;
            case 7:
                return 9;
            case 8:
            case 9:
            case 10:
            case 11:
                return 6;
            case 12:
            case 13:
            case 14:
                return 5;
            case 15:
            case 16:
                return 7;
            case 17:
                return 10;
            default:
                throw new AssertionError();
        }
    }

    /* renamed from: C */
    public final void m2497C(int i2) {
        int i3 = this.f4150m;
        int[] iArr = this.f4149l;
        if (i3 == iArr.length) {
            int i4 = i3 * 2;
            this.f4149l = Arrays.copyOf(iArr, i4);
            this.f4152o = Arrays.copyOf(this.f4152o, i4);
            this.f4151n = (String[]) Arrays.copyOf(this.f4151n, i4);
        }
        int[] iArr2 = this.f4149l;
        int i5 = this.f4150m;
        this.f4150m = i5 + 1;
        iArr2[i5] = i2;
    }

    /* renamed from: D */
    public final char m2498D() throws C0989c {
        int i2;
        if (this.f4141d == this.f4142e && !m2510m(1)) {
            m2503I("Unterminated escape sequence");
            throw null;
        }
        int i3 = this.f4141d;
        int i4 = i3 + 1;
        this.f4141d = i4;
        char[] cArr = this.f4140c;
        char c3 = cArr[i3];
        if (c3 == '\n') {
            this.f4143f++;
            this.f4144g = i4;
            return c3;
        }
        if (c3 == '\"' || c3 == '\'' || c3 == '/' || c3 == '\\') {
            return c3;
        }
        if (c3 == 'b') {
            return '\b';
        }
        if (c3 == 'f') {
            return '\f';
        }
        if (c3 == 'n') {
            return '\n';
        }
        if (c3 == 'r') {
            return '\r';
        }
        if (c3 == 't') {
            return '\t';
        }
        if (c3 != 'u') {
            m2503I("Invalid escape sequence");
            throw null;
        }
        if (i3 + 5 > this.f4142e && !m2510m(4)) {
            m2503I("Unterminated escape sequence");
            throw null;
        }
        int i5 = this.f4141d;
        int i6 = i5 + 4;
        char c4 = 0;
        while (i5 < i6) {
            char c5 = cArr[i5];
            char c6 = (char) (c4 << 4);
            if (c5 >= '0' && c5 <= '9') {
                i2 = c5 - '0';
            } else if (c5 >= 'a' && c5 <= 'f') {
                i2 = c5 - 'W';
            } else {
                if (c5 < 'A' || c5 > 'F') {
                    throw new NumberFormatException("\\u".concat(new String(cArr, this.f4141d, 4)));
                }
                i2 = c5 - '7';
            }
            c4 = (char) (i2 + c6);
            i5++;
        }
        this.f4141d += 4;
        return c4;
    }

    /* renamed from: E */
    public final void m2499E(char c3) throws C0989c {
        do {
            int i2 = this.f4141d;
            int i3 = this.f4142e;
            while (i2 < i3) {
                int i4 = i2 + 1;
                char c4 = this.f4140c[i2];
                if (c4 == c3) {
                    this.f4141d = i4;
                    return;
                }
                if (c4 == '\\') {
                    this.f4141d = i4;
                    m2498D();
                    i2 = this.f4141d;
                    i3 = this.f4142e;
                } else {
                    if (c4 == '\n') {
                        this.f4143f++;
                        this.f4144g = i4;
                    }
                    i2 = i4;
                }
            }
            this.f4141d = i2;
        } while (m2510m(1));
        m2503I("Unterminated string");
        throw null;
    }

    /* renamed from: F */
    public final void m2500F() {
        char c3;
        do {
            if (this.f4141d >= this.f4142e && !m2510m(1)) {
                return;
            }
            int i2 = this.f4141d;
            int i3 = i2 + 1;
            this.f4141d = i3;
            c3 = this.f4140c[i2];
            if (c3 == '\n') {
                this.f4143f++;
                this.f4144g = i3;
                return;
            }
        } while (c3 != '\r');
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0048, code lost:
    
        m2506i();
     */
    /* renamed from: G */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m2501G() throws p101h1.C0989c {
        /*
            r4 = this;
        L0:
            r0 = 0
        L1:
            int r1 = r4.f4141d
            int r2 = r1 + r0
            int r3 = r4.f4142e
            if (r2 >= r3) goto L51
            char[] r2 = r4.f4140c
            int r1 = r1 + r0
            char r1 = r2[r1]
            r2 = 9
            if (r1 == r2) goto L4b
            r2 = 10
            if (r1 == r2) goto L4b
            r2 = 12
            if (r1 == r2) goto L4b
            r2 = 13
            if (r1 == r2) goto L4b
            r2 = 32
            if (r1 == r2) goto L4b
            r2 = 35
            if (r1 == r2) goto L48
            r2 = 44
            if (r1 == r2) goto L4b
            r2 = 47
            if (r1 == r2) goto L48
            r2 = 61
            if (r1 == r2) goto L48
            r2 = 123(0x7b, float:1.72E-43)
            if (r1 == r2) goto L4b
            r2 = 125(0x7d, float:1.75E-43)
            if (r1 == r2) goto L4b
            r2 = 58
            if (r1 == r2) goto L4b
            r2 = 59
            if (r1 == r2) goto L48
            switch(r1) {
                case 91: goto L4b;
                case 92: goto L48;
                case 93: goto L4b;
                default: goto L45;
            }
        L45:
            int r0 = r0 + 1
            goto L1
        L48:
            r4.m2506i()
        L4b:
            int r1 = r4.f4141d
            int r1 = r1 + r0
            r4.f4141d = r1
            return
        L51:
            int r1 = r1 + r0
            r4.f4141d = r1
            r0 = 1
            boolean r0 = r4.m2510m(r0)
            if (r0 != 0) goto L0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p101h1.C0987a.m2501G():void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: H */
    public final void m2502H() throws IOException {
        int i2 = 0;
        do {
            int iM2507j = this.f4145h;
            if (iM2507j == 0) {
                iM2507j = m2507j();
            }
            switch (iM2507j) {
                case 1:
                    m2497C(3);
                    i2++;
                    this.f4145h = 0;
                    break;
                case 2:
                    if (i2 == 0) {
                        this.f4151n[this.f4150m - 1] = null;
                    }
                    this.f4150m--;
                    i2--;
                    this.f4145h = 0;
                    break;
                case 3:
                    m2497C(1);
                    i2++;
                    this.f4145h = 0;
                    break;
                case 4:
                    this.f4150m--;
                    i2--;
                    this.f4145h = 0;
                    break;
                case 5:
                case 6:
                case 7:
                case 11:
                case 15:
                default:
                    this.f4145h = 0;
                    break;
                case 8:
                    m2499E('\'');
                    this.f4145h = 0;
                    break;
                case 9:
                    m2499E('\"');
                    this.f4145h = 0;
                    break;
                case 10:
                    m2501G();
                    this.f4145h = 0;
                    break;
                case 12:
                    m2499E('\'');
                    if (i2 == 0) {
                        this.f4151n[this.f4150m - 1] = "<skipped>";
                    }
                    this.f4145h = 0;
                    break;
                case 13:
                    m2499E('\"');
                    if (i2 == 0) {
                        this.f4151n[this.f4150m - 1] = "<skipped>";
                    }
                    this.f4145h = 0;
                    break;
                case 14:
                    m2501G();
                    if (i2 == 0) {
                        this.f4151n[this.f4150m - 1] = "<skipped>";
                    }
                    this.f4145h = 0;
                    break;
                case 16:
                    this.f4141d += this.f4147j;
                    this.f4145h = 0;
                    break;
                case 17:
                    break;
            }
            return;
        } while (i2 > 0);
        int[] iArr = this.f4152o;
        int i3 = this.f4150m - 1;
        iArr[i3] = iArr[i3] + 1;
    }

    /* renamed from: I */
    public final void m2503I(String str) throws C0989c {
        throw new C0989c(str + m2514q());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f4145h = 0;
        this.f4149l[0] = 8;
        this.f4150m = 1;
        this.f4138a.close();
    }

    /* renamed from: g */
    public final void m2504g() {
        int iM2507j = this.f4145h;
        if (iM2507j == 0) {
            iM2507j = m2507j();
        }
        if (iM2507j == 3) {
            m2497C(1);
            this.f4152o[this.f4150m - 1] = 0;
            this.f4145h = 0;
        } else {
            throw new IllegalStateException("Expected BEGIN_ARRAY but was " + AbstractC0075g.m242k(m2496B()) + m2514q());
        }
    }

    /* renamed from: h */
    public final void m2505h() {
        int iM2507j = this.f4145h;
        if (iM2507j == 0) {
            iM2507j = m2507j();
        }
        if (iM2507j == 1) {
            m2497C(3);
            this.f4145h = 0;
        } else {
            throw new IllegalStateException("Expected BEGIN_OBJECT but was " + AbstractC0075g.m242k(m2496B()) + m2514q());
        }
    }

    /* renamed from: i */
    public final void m2506i() throws C0989c {
        if (this.f4139b) {
            return;
        }
        m2503I("Use JsonReader.setLenient(true) to accept malformed JSON");
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:165:0x020f, code lost:
    
        if (m2513p(r7) != false) goto L121;
     */
    /* JADX WARN: Removed duplicated region for block: B:115:0x017f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0267 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00ea  */
    /* renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int m2507j() throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 783
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p101h1.C0987a.m2507j():int");
    }

    /* renamed from: k */
    public final void m2508k() {
        int iM2507j = this.f4145h;
        if (iM2507j == 0) {
            iM2507j = m2507j();
        }
        if (iM2507j != 4) {
            throw new IllegalStateException("Expected END_ARRAY but was " + AbstractC0075g.m242k(m2496B()) + m2514q());
        }
        int i2 = this.f4150m;
        this.f4150m = i2 - 1;
        int[] iArr = this.f4152o;
        int i3 = i2 - 2;
        iArr[i3] = iArr[i3] + 1;
        this.f4145h = 0;
    }

    /* renamed from: l */
    public final void m2509l() {
        int iM2507j = this.f4145h;
        if (iM2507j == 0) {
            iM2507j = m2507j();
        }
        if (iM2507j != 2) {
            throw new IllegalStateException("Expected END_OBJECT but was " + AbstractC0075g.m242k(m2496B()) + m2514q());
        }
        int i2 = this.f4150m;
        int i3 = i2 - 1;
        this.f4150m = i3;
        this.f4151n[i3] = null;
        int[] iArr = this.f4152o;
        int i4 = i2 - 2;
        iArr[i4] = iArr[i4] + 1;
        this.f4145h = 0;
    }

    /* renamed from: m */
    public final boolean m2510m(int i2) throws IOException {
        int i3;
        int i4;
        int i5 = this.f4144g;
        int i6 = this.f4141d;
        this.f4144g = i5 - i6;
        int i7 = this.f4142e;
        char[] cArr = this.f4140c;
        if (i7 != i6) {
            int i8 = i7 - i6;
            this.f4142e = i8;
            System.arraycopy(cArr, i6, cArr, 0, i8);
        } else {
            this.f4142e = 0;
        }
        this.f4141d = 0;
        do {
            int i9 = this.f4142e;
            int i10 = this.f4138a.read(cArr, i9, cArr.length - i9);
            if (i10 == -1) {
                return false;
            }
            i3 = this.f4142e + i10;
            this.f4142e = i3;
            if (this.f4143f == 0 && (i4 = this.f4144g) == 0 && i3 > 0 && cArr[0] == 65279) {
                this.f4141d++;
                this.f4144g = i4 + 1;
                i2++;
            }
        } while (i3 < i2);
        return true;
    }

    /* renamed from: n */
    public final String m2511n(boolean z2) {
        StringBuilder sb = new StringBuilder("$");
        int i2 = 0;
        while (true) {
            int i3 = this.f4150m;
            if (i2 >= i3) {
                return sb.toString();
            }
            int i4 = this.f4149l[i2];
            if (i4 == 1 || i4 == 2) {
                int i5 = this.f4152o[i2];
                if (z2 && i5 > 0 && i2 == i3 - 1) {
                    i5--;
                }
                sb.append('[');
                sb.append(i5);
                sb.append(']');
            } else if (i4 == 3 || i4 == 4 || i4 == 5) {
                sb.append('.');
                String str = this.f4151n[i2];
                if (str != null) {
                    sb.append(str);
                }
            }
            i2++;
        }
    }

    /* renamed from: o */
    public final boolean m2512o() throws IOException {
        int iM2507j = this.f4145h;
        if (iM2507j == 0) {
            iM2507j = m2507j();
        }
        return (iM2507j == 2 || iM2507j == 4 || iM2507j == 17) ? false : true;
    }

    /* renamed from: p */
    public final boolean m2513p(char c3) throws C0989c {
        if (c3 == '\t' || c3 == '\n' || c3 == '\f' || c3 == '\r' || c3 == ' ') {
            return false;
        }
        if (c3 != '#') {
            if (c3 == ',') {
                return false;
            }
            if (c3 != '/' && c3 != '=') {
                if (c3 == '{' || c3 == '}' || c3 == ':') {
                    return false;
                }
                if (c3 != ';') {
                    switch (c3) {
                        case '[':
                        case ']':
                            return false;
                        case '\\':
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        m2506i();
        return false;
    }

    /* renamed from: q */
    public final String m2514q() {
        return " at line " + (this.f4143f + 1) + " column " + ((this.f4141d - this.f4144g) + 1) + " path " + m2511n(false);
    }

    /* renamed from: r */
    public final boolean m2515r() {
        int iM2507j = this.f4145h;
        if (iM2507j == 0) {
            iM2507j = m2507j();
        }
        if (iM2507j == 5) {
            this.f4145h = 0;
            int[] iArr = this.f4152o;
            int i2 = this.f4150m - 1;
            iArr[i2] = iArr[i2] + 1;
            return true;
        }
        if (iM2507j != 6) {
            throw new IllegalStateException("Expected a boolean but was " + AbstractC0075g.m242k(m2496B()) + m2514q());
        }
        this.f4145h = 0;
        int[] iArr2 = this.f4152o;
        int i3 = this.f4150m - 1;
        iArr2[i3] = iArr2[i3] + 1;
        return false;
    }

    /* renamed from: s */
    public final double m2516s() throws IOException, NumberFormatException {
        int iM2507j = this.f4145h;
        if (iM2507j == 0) {
            iM2507j = m2507j();
        }
        if (iM2507j == 15) {
            this.f4145h = 0;
            int[] iArr = this.f4152o;
            int i2 = this.f4150m - 1;
            iArr[i2] = iArr[i2] + 1;
            return this.f4146i;
        }
        if (iM2507j == 16) {
            this.f4148k = new String(this.f4140c, this.f4141d, this.f4147j);
            this.f4141d += this.f4147j;
        } else if (iM2507j == 8 || iM2507j == 9) {
            this.f4148k = m2522y(iM2507j == 8 ? '\'' : '\"');
        } else if (iM2507j == 10) {
            this.f4148k = m2495A();
        } else if (iM2507j != 11) {
            throw new IllegalStateException("Expected a double but was " + AbstractC0075g.m242k(m2496B()) + m2514q());
        }
        this.f4145h = 11;
        double d3 = Double.parseDouble(this.f4148k);
        if (!this.f4139b && (Double.isNaN(d3) || Double.isInfinite(d3))) {
            throw new C0989c("JSON forbids NaN and infinities: " + d3 + m2514q());
        }
        this.f4148k = null;
        this.f4145h = 0;
        int[] iArr2 = this.f4152o;
        int i3 = this.f4150m - 1;
        iArr2[i3] = iArr2[i3] + 1;
        return d3;
    }

    /* renamed from: t */
    public final int m2517t() {
        int iM2507j = this.f4145h;
        if (iM2507j == 0) {
            iM2507j = m2507j();
        }
        if (iM2507j == 15) {
            long j2 = this.f4146i;
            int i2 = (int) j2;
            if (j2 != i2) {
                throw new NumberFormatException("Expected an int but was " + this.f4146i + m2514q());
            }
            this.f4145h = 0;
            int[] iArr = this.f4152o;
            int i3 = this.f4150m - 1;
            iArr[i3] = iArr[i3] + 1;
            return i2;
        }
        if (iM2507j == 16) {
            this.f4148k = new String(this.f4140c, this.f4141d, this.f4147j);
            this.f4141d += this.f4147j;
        } else {
            if (iM2507j != 8 && iM2507j != 9 && iM2507j != 10) {
                throw new IllegalStateException("Expected an int but was " + AbstractC0075g.m242k(m2496B()) + m2514q());
            }
            if (iM2507j == 10) {
                this.f4148k = m2495A();
            } else {
                this.f4148k = m2522y(iM2507j == 8 ? '\'' : '\"');
            }
            try {
                int i4 = Integer.parseInt(this.f4148k);
                this.f4145h = 0;
                int[] iArr2 = this.f4152o;
                int i5 = this.f4150m - 1;
                iArr2[i5] = iArr2[i5] + 1;
                return i4;
            } catch (NumberFormatException unused) {
            }
        }
        this.f4145h = 11;
        double d3 = Double.parseDouble(this.f4148k);
        int i6 = (int) d3;
        if (i6 != d3) {
            throw new NumberFormatException("Expected an int but was " + this.f4148k + m2514q());
        }
        this.f4148k = null;
        this.f4145h = 0;
        int[] iArr3 = this.f4152o;
        int i7 = this.f4150m - 1;
        iArr3[i7] = iArr3[i7] + 1;
        return i6;
    }

    public final String toString() {
        return C0987a.class.getSimpleName() + m2514q();
    }

    /* renamed from: u */
    public final long m2518u() throws IOException, NumberFormatException {
        int iM2507j = this.f4145h;
        if (iM2507j == 0) {
            iM2507j = m2507j();
        }
        if (iM2507j == 15) {
            this.f4145h = 0;
            int[] iArr = this.f4152o;
            int i2 = this.f4150m - 1;
            iArr[i2] = iArr[i2] + 1;
            return this.f4146i;
        }
        if (iM2507j == 16) {
            this.f4148k = new String(this.f4140c, this.f4141d, this.f4147j);
            this.f4141d += this.f4147j;
        } else {
            if (iM2507j != 8 && iM2507j != 9 && iM2507j != 10) {
                throw new IllegalStateException("Expected a long but was " + AbstractC0075g.m242k(m2496B()) + m2514q());
            }
            if (iM2507j == 10) {
                this.f4148k = m2495A();
            } else {
                this.f4148k = m2522y(iM2507j == 8 ? '\'' : '\"');
            }
            try {
                long j2 = Long.parseLong(this.f4148k);
                this.f4145h = 0;
                int[] iArr2 = this.f4152o;
                int i3 = this.f4150m - 1;
                iArr2[i3] = iArr2[i3] + 1;
                return j2;
            } catch (NumberFormatException unused) {
            }
        }
        this.f4145h = 11;
        double d3 = Double.parseDouble(this.f4148k);
        long j3 = (long) d3;
        if (j3 != d3) {
            throw new NumberFormatException("Expected a long but was " + this.f4148k + m2514q());
        }
        this.f4148k = null;
        this.f4145h = 0;
        int[] iArr3 = this.f4152o;
        int i4 = this.f4150m - 1;
        iArr3[i4] = iArr3[i4] + 1;
        return j3;
    }

    /* renamed from: v */
    public final String m2519v() {
        String strM2522y;
        int iM2507j = this.f4145h;
        if (iM2507j == 0) {
            iM2507j = m2507j();
        }
        if (iM2507j == 14) {
            strM2522y = m2495A();
        } else if (iM2507j == 12) {
            strM2522y = m2522y('\'');
        } else {
            if (iM2507j != 13) {
                throw new IllegalStateException("Expected a name but was " + AbstractC0075g.m242k(m2496B()) + m2514q());
            }
            strM2522y = m2522y('\"');
        }
        this.f4145h = 0;
        this.f4151n[this.f4150m - 1] = strM2522y;
        return strM2522y;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0074, code lost:
    
        return r5;
     */
    /* renamed from: w */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int m2520w(boolean r10) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 226
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p101h1.C0987a.m2520w(boolean):int");
    }

    /* renamed from: x */
    public final void m2521x() {
        int iM2507j = this.f4145h;
        if (iM2507j == 0) {
            iM2507j = m2507j();
        }
        if (iM2507j != 7) {
            throw new IllegalStateException("Expected null but was " + AbstractC0075g.m242k(m2496B()) + m2514q());
        }
        this.f4145h = 0;
        int[] iArr = this.f4152o;
        int i2 = this.f4150m - 1;
        iArr[i2] = iArr[i2] + 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x002d, code lost:
    
        r10.f4141d = r8;
        r8 = r8 - r3;
        r2 = r8 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0032, code lost:
    
        if (r1 != null) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0034, code lost:
    
        r1 = new java.lang.StringBuilder(java.lang.Math.max(r8 * 2, 16));
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x005b, code lost:
    
        if (r1 != null) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005d, code lost:
    
        r1 = new java.lang.StringBuilder(java.lang.Math.max((r2 - r3) * 2, 16));
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x006b, code lost:
    
        r1.append(r5, r3, r2 - r3);
        r10.f4141d = r2;
     */
    /* renamed from: y */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String m2522y(char r11) throws p101h1.C0989c {
        /*
            r10 = this;
            r0 = 0
            r1 = r0
        L2:
            int r2 = r10.f4141d
            int r3 = r10.f4142e
        L6:
            r4 = r3
            r3 = r2
        L8:
            char[] r5 = r10.f4140c
            r6 = 1
            r7 = 16
            if (r2 >= r4) goto L5b
            int r8 = r2 + 1
            char r2 = r5[r2]
            if (r2 != r11) goto L29
            r10.f4141d = r8
            int r8 = r8 - r3
            int r8 = r8 - r6
            if (r1 != 0) goto L21
            java.lang.String r11 = new java.lang.String
            r11.<init>(r5, r3, r8)
            return r11
        L21:
            r1.append(r5, r3, r8)
            java.lang.String r11 = r1.toString()
            return r11
        L29:
            r9 = 92
            if (r2 != r9) goto L4e
            r10.f4141d = r8
            int r8 = r8 - r3
            int r2 = r8 + (-1)
            if (r1 != 0) goto L3f
            int r8 = r8 * 2
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            int r4 = java.lang.Math.max(r8, r7)
            r1.<init>(r4)
        L3f:
            r1.append(r5, r3, r2)
            char r2 = r10.m2498D()
            r1.append(r2)
            int r2 = r10.f4141d
            int r3 = r10.f4142e
            goto L6
        L4e:
            r5 = 10
            if (r2 != r5) goto L59
            int r2 = r10.f4143f
            int r2 = r2 + r6
            r10.f4143f = r2
            r10.f4144g = r8
        L59:
            r2 = r8
            goto L8
        L5b:
            if (r1 != 0) goto L6b
            int r1 = r2 - r3
            int r1 = r1 * 2
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            int r1 = java.lang.Math.max(r1, r7)
            r4.<init>(r1)
            r1 = r4
        L6b:
            int r4 = r2 - r3
            r1.append(r5, r3, r4)
            r10.f4141d = r2
            boolean r2 = r10.m2510m(r6)
            if (r2 == 0) goto L79
            goto L2
        L79:
            java.lang.String r11 = "Unterminated string"
            r10.m2503I(r11)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p101h1.C0987a.m2522y(char):java.lang.String");
    }

    /* renamed from: z */
    public final String m2523z() {
        String str;
        int iM2507j = this.f4145h;
        if (iM2507j == 0) {
            iM2507j = m2507j();
        }
        if (iM2507j == 10) {
            str = m2495A();
        } else if (iM2507j == 8) {
            str = m2522y('\'');
        } else if (iM2507j == 9) {
            str = m2522y('\"');
        } else if (iM2507j == 11) {
            str = this.f4148k;
            this.f4148k = null;
        } else if (iM2507j == 15) {
            str = Long.toString(this.f4146i);
        } else {
            if (iM2507j != 16) {
                throw new IllegalStateException("Expected a string but was " + AbstractC0075g.m242k(m2496B()) + m2514q());
            }
            str = new String(this.f4140c, this.f4141d, this.f4147j);
            this.f4141d += this.f4147j;
        }
        this.f4145h = 0;
        int[] iArr = this.f4152o;
        int i2 = this.f4150m - 1;
        iArr[i2] = iArr[i2] + 1;
        return str;
    }
}
