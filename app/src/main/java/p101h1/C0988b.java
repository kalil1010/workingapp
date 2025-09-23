package p101h1;

import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.Writer;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.regex.Pattern;

/* renamed from: h1.b */
/* loaded from: classes.dex */
public class C0988b implements Closeable, Flushable {

    /* renamed from: i */
    public static final Pattern f4153i = Pattern.compile("-?(?:0|[1-9][0-9]*)(?:\\.[0-9]+)?(?:[eE][-+]?[0-9]+)?");

    /* renamed from: j */
    public static final String[] f4154j = new String[128];

    /* renamed from: k */
    public static final String[] f4155k;

    /* renamed from: a */
    public final Writer f4156a;

    /* renamed from: b */
    public int[] f4157b;

    /* renamed from: c */
    public int f4158c;

    /* renamed from: d */
    public final String f4159d;

    /* renamed from: e */
    public boolean f4160e;

    /* renamed from: f */
    public boolean f4161f;

    /* renamed from: g */
    public String f4162g;

    /* renamed from: h */
    public boolean f4163h;

    static {
        for (int i2 = 0; i2 <= 31; i2++) {
            f4154j[i2] = String.format("\\u%04x", Integer.valueOf(i2));
        }
        String[] strArr = f4154j;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        String[] strArr2 = (String[]) strArr.clone();
        f4155k = strArr2;
        strArr2[60] = "\\u003c";
        strArr2[62] = "\\u003e";
        strArr2[38] = "\\u0026";
        strArr2[61] = "\\u003d";
        strArr2[39] = "\\u0027";
    }

    public C0988b(Writer writer) {
        int[] iArr = new int[32];
        this.f4157b = iArr;
        this.f4158c = 0;
        if (iArr.length == 0) {
            this.f4157b = Arrays.copyOf(iArr, 0);
        }
        int[] iArr2 = this.f4157b;
        int i2 = this.f4158c;
        this.f4158c = i2 + 1;
        iArr2[i2] = 6;
        this.f4159d = ":";
        this.f4163h = true;
        Objects.requireNonNull(writer, "out == null");
        this.f4156a = writer;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f4156a.close();
        int i2 = this.f4158c;
        if (i2 > 1 || (i2 == 1 && this.f4157b[i2 - 1] != 7)) {
            throw new IOException("Incomplete document");
        }
        this.f4158c = 0;
    }

    @Override // java.io.Flushable
    public void flush() throws IOException {
        if (this.f4158c == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        this.f4156a.flush();
    }

    /* renamed from: g */
    public final void m2524g() throws IOException {
        int iM2533p = m2533p();
        if (iM2533p == 1) {
            this.f4157b[this.f4158c - 1] = 2;
            m2531n();
            return;
        }
        Writer writer = this.f4156a;
        if (iM2533p == 2) {
            writer.append(',');
            m2531n();
        } else {
            if (iM2533p == 4) {
                writer.append((CharSequence) this.f4159d);
                this.f4157b[this.f4158c - 1] = 5;
                return;
            }
            if (iM2533p != 6) {
                if (iM2533p != 7) {
                    throw new IllegalStateException("Nesting problem.");
                }
                if (!this.f4160e) {
                    throw new IllegalStateException("JSON must have only one top-level value.");
                }
            }
            this.f4157b[this.f4158c - 1] = 7;
        }
    }

    /* renamed from: h */
    public void m2525h() throws IOException {
        m2540w();
        m2524g();
        int i2 = this.f4158c;
        int[] iArr = this.f4157b;
        if (i2 == iArr.length) {
            this.f4157b = Arrays.copyOf(iArr, i2 * 2);
        }
        int[] iArr2 = this.f4157b;
        int i3 = this.f4158c;
        this.f4158c = i3 + 1;
        iArr2[i3] = 1;
        this.f4156a.write(91);
    }

    /* renamed from: i */
    public void m2526i() throws IOException {
        m2540w();
        m2524g();
        int i2 = this.f4158c;
        int[] iArr = this.f4157b;
        if (i2 == iArr.length) {
            this.f4157b = Arrays.copyOf(iArr, i2 * 2);
        }
        int[] iArr2 = this.f4157b;
        int i3 = this.f4158c;
        this.f4158c = i3 + 1;
        iArr2[i3] = 3;
        this.f4156a.write(123);
    }

    /* renamed from: j */
    public final void m2527j(int i2, int i3, char c3) throws IOException {
        int iM2533p = m2533p();
        if (iM2533p != i3 && iM2533p != i2) {
            throw new IllegalStateException("Nesting problem.");
        }
        if (this.f4162g != null) {
            throw new IllegalStateException("Dangling name: " + this.f4162g);
        }
        this.f4158c--;
        if (iM2533p == i3) {
            m2531n();
        }
        this.f4156a.write(c3);
    }

    /* renamed from: k */
    public void m2528k() throws IOException {
        m2527j(1, 2, ']');
    }

    /* renamed from: l */
    public void m2529l() throws IOException {
        m2527j(3, 5, '}');
    }

    /* renamed from: m */
    public void m2530m(String str) {
        Objects.requireNonNull(str, "name == null");
        if (this.f4162g != null) {
            throw new IllegalStateException();
        }
        if (this.f4158c == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        this.f4162g = str;
    }

    /* renamed from: n */
    public final void m2531n() {
    }

    /* renamed from: o */
    public C0988b m2532o() throws IOException {
        if (this.f4162g != null) {
            if (!this.f4163h) {
                this.f4162g = null;
                return this;
            }
            m2540w();
        }
        m2524g();
        this.f4156a.write("null");
        return this;
    }

    /* renamed from: p */
    public final int m2533p() {
        int i2 = this.f4158c;
        if (i2 != 0) {
            return this.f4157b[i2 - 1];
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0034  */
    /* renamed from: q */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m2534q(java.lang.String r9) throws java.io.IOException {
        /*
            r8 = this;
            boolean r0 = r8.f4161f
            if (r0 == 0) goto L7
            java.lang.String[] r0 = p101h1.C0988b.f4155k
            goto L9
        L7:
            java.lang.String[] r0 = p101h1.C0988b.f4154j
        L9:
            java.io.Writer r1 = r8.f4156a
            r2 = 34
            r1.write(r2)
            int r3 = r9.length()
            r4 = 0
            r5 = r4
        L16:
            if (r4 >= r3) goto L41
            char r6 = r9.charAt(r4)
            r7 = 128(0x80, float:1.8E-43)
            if (r6 >= r7) goto L25
            r6 = r0[r6]
            if (r6 != 0) goto L32
            goto L3e
        L25:
            r7 = 8232(0x2028, float:1.1535E-41)
            if (r6 != r7) goto L2c
            java.lang.String r6 = "\\u2028"
            goto L32
        L2c:
            r7 = 8233(0x2029, float:1.1537E-41)
            if (r6 != r7) goto L3e
            java.lang.String r6 = "\\u2029"
        L32:
            if (r5 >= r4) goto L39
            int r7 = r4 - r5
            r1.write(r9, r5, r7)
        L39:
            r1.write(r6)
            int r5 = r4 + 1
        L3e:
            int r4 = r4 + 1
            goto L16
        L41:
            if (r5 >= r3) goto L47
            int r3 = r3 - r5
            r1.write(r9, r5, r3)
        L47:
            r1.write(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p101h1.C0988b.m2534q(java.lang.String):void");
    }

    /* renamed from: r */
    public void m2535r(double d3) throws IOException {
        m2540w();
        if (this.f4160e || !(Double.isNaN(d3) || Double.isInfinite(d3))) {
            m2524g();
            this.f4156a.append((CharSequence) Double.toString(d3));
        } else {
            throw new IllegalArgumentException("Numeric values must be finite, but was " + d3);
        }
    }

    /* renamed from: s */
    public void m2536s(long j2) throws IOException {
        m2540w();
        m2524g();
        this.f4156a.write(Long.toString(j2));
    }

    /* renamed from: t */
    public void m2537t(Number number) throws IOException {
        if (number == null) {
            m2532o();
            return;
        }
        m2540w();
        String string = number.toString();
        if (!string.equals("-Infinity") && !string.equals("Infinity") && !string.equals("NaN")) {
            Class<?> cls = number.getClass();
            if (cls != Integer.class && cls != Long.class && cls != Double.class && cls != Float.class && cls != Byte.class && cls != Short.class && cls != BigDecimal.class && cls != BigInteger.class && cls != AtomicInteger.class && cls != AtomicLong.class && !f4153i.matcher(string).matches()) {
                throw new IllegalArgumentException("String created by " + cls + " is not a valid JSON number: " + string);
            }
        } else if (!this.f4160e) {
            throw new IllegalArgumentException("Numeric values must be finite, but was ".concat(string));
        }
        m2524g();
        this.f4156a.append((CharSequence) string);
    }

    /* renamed from: u */
    public void m2538u(String str) throws IOException {
        if (str == null) {
            m2532o();
            return;
        }
        m2540w();
        m2524g();
        m2534q(str);
    }

    /* renamed from: v */
    public void m2539v(boolean z2) throws IOException {
        m2540w();
        m2524g();
        this.f4156a.write(z2 ? "true" : "false");
    }

    /* renamed from: w */
    public final void m2540w() throws IOException {
        if (this.f4162g != null) {
            int iM2533p = m2533p();
            if (iM2533p == 5) {
                this.f4156a.write(44);
            } else if (iM2533p != 3) {
                throw new IllegalStateException("Nesting problem.");
            }
            m2531n();
            this.f4157b[this.f4158c - 1] = 4;
            m2534q(this.f4162g);
            this.f4162g = null;
        }
    }
}
