package p087d0;

import android.content.pm.PackageInfo;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import java.util.zip.DataFormatException;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.Inflater;
import p006C.AbstractC0075g;
import p080b1.C0767e;

/* renamed from: d0.f */
/* loaded from: classes.dex */
public abstract class AbstractC0849f {

    /* renamed from: a */
    public static final C0767e f3497a = new C0767e(3);

    /* renamed from: b */
    public static final byte[] f3498b = {112, 114, 111, 0};

    /* renamed from: c */
    public static final byte[] f3499c = {112, 114, 109, 0};

    /* renamed from: d */
    public static final byte[] f3500d = {48, 49, 53, 0};

    /* renamed from: e */
    public static final byte[] f3501e = {48, 49, 48, 0};

    /* renamed from: f */
    public static final byte[] f3502f = {48, 48, 57, 0};

    /* renamed from: g */
    public static final byte[] f3503g = {48, 48, 53, 0};

    /* renamed from: h */
    public static final byte[] f3504h = {48, 48, 49, 0};

    /* renamed from: i */
    public static final byte[] f3505i = {48, 48, 49, 0};

    /* renamed from: j */
    public static final byte[] f3506j = {48, 48, 50, 0};

    /* renamed from: a */
    public static byte[] m2150a(byte[] bArr) {
        Deflater deflater = new Deflater(1);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            DeflaterOutputStream deflaterOutputStream = new DeflaterOutputStream(byteArrayOutputStream, deflater);
            try {
                deflaterOutputStream.write(bArr);
                deflaterOutputStream.close();
                deflater.end();
                return byteArrayOutputStream.toByteArray();
            } finally {
            }
        } catch (Throwable th) {
            deflater.end();
            throw th;
        }
    }

    /* renamed from: b */
    public static byte[] m2151b(C0846c[] c0846cArr, byte[] bArr) throws IOException {
        int length = 0;
        for (C0846c c0846c : c0846cArr) {
            length += ((((c0846c.f3494g * 2) + 7) & (-8)) / 8) + (c0846c.f3492e * 2) + m2153d(c0846c.f3488a, c0846c.f3489b, bArr).getBytes(StandardCharsets.UTF_8).length + 16 + c0846c.f3493f;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(length);
        if (Arrays.equals(bArr, f3502f)) {
            for (C0846c c0846c2 : c0846cArr) {
                m2165p(byteArrayOutputStream, c0846c2, m2153d(c0846c2.f3488a, c0846c2.f3489b, bArr));
                m2167r(byteArrayOutputStream, c0846c2);
                int[] iArr = c0846c2.f3495h;
                int length2 = iArr.length;
                int i2 = 0;
                int i3 = 0;
                while (i2 < length2) {
                    int i4 = iArr[i2];
                    m2170u(byteArrayOutputStream, i4 - i3);
                    i2++;
                    i3 = i4;
                }
                m2166q(byteArrayOutputStream, c0846c2);
            }
        } else {
            for (C0846c c0846c3 : c0846cArr) {
                m2165p(byteArrayOutputStream, c0846c3, m2153d(c0846c3.f3488a, c0846c3.f3489b, bArr));
            }
            for (C0846c c0846c4 : c0846cArr) {
                m2167r(byteArrayOutputStream, c0846c4);
                int[] iArr2 = c0846c4.f3495h;
                int length3 = iArr2.length;
                int i5 = 0;
                int i6 = 0;
                while (i5 < length3) {
                    int i7 = iArr2[i5];
                    m2170u(byteArrayOutputStream, i7 - i6);
                    i5++;
                    i6 = i7;
                }
                m2166q(byteArrayOutputStream, c0846c4);
            }
        }
        if (byteArrayOutputStream.size() == length) {
            return byteArrayOutputStream.toByteArray();
        }
        throw new IllegalStateException("The bytes saved do not match expectation. actual=" + byteArrayOutputStream.size() + " expected=" + length);
    }

    /* renamed from: c */
    public static boolean m2152c(File file) {
        if (!file.isDirectory()) {
            file.delete();
            return true;
        }
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            return false;
        }
        boolean z2 = true;
        for (File file2 : fileArrListFiles) {
            z2 = m2152c(file2) && z2;
        }
        return z2;
    }

    /* renamed from: d */
    public static String m2153d(String str, String str2, byte[] bArr) {
        byte[] bArr2 = f3504h;
        boolean zEquals = Arrays.equals(bArr, bArr2);
        byte[] bArr3 = f3503g;
        String str3 = (zEquals || Arrays.equals(bArr, bArr3)) ? ":" : "!";
        if (str.length() <= 0) {
            if ("!".equals(str3)) {
                return str2.replace(":", "!");
            }
            if (":".equals(str3)) {
                return str2.replace("!", ":");
            }
        } else {
            if (str2.equals("classes.dex")) {
                return str;
            }
            if (str2.contains("!") || str2.contains(":")) {
                if ("!".equals(str3)) {
                    return str2.replace(":", "!");
                }
                if (":".equals(str3)) {
                    return str2.replace("!", ":");
                }
            } else if (!str2.endsWith(".apk")) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append((Arrays.equals(bArr, bArr2) || Arrays.equals(bArr, bArr3)) ? ":" : "!");
                sb.append(str2);
                return sb.toString();
            }
        }
        return str2;
    }

    /* renamed from: e */
    public static void m2154e(PackageInfo packageInfo, File file) throws IOException {
        try {
            DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(new File(file, "profileinstaller_profileWrittenFor_lastUpdateTime.dat")));
            try {
                dataOutputStream.writeLong(packageInfo.lastUpdateTime);
                dataOutputStream.close();
            } finally {
            }
        } catch (IOException unused) {
        }
    }

    /* renamed from: f */
    public static byte[] m2155f(InputStream inputStream, int i2) throws IOException {
        byte[] bArr = new byte[i2];
        int i3 = 0;
        while (i3 < i2) {
            int i4 = inputStream.read(bArr, i3, i2 - i3);
            if (i4 < 0) {
                throw new IllegalStateException(AbstractC0075g.m236e("Not enough bytes to read: ", i2));
            }
            i3 += i4;
        }
        return bArr;
    }

    /* renamed from: g */
    public static int[] m2156g(ByteArrayInputStream byteArrayInputStream, int i2) {
        int[] iArr = new int[i2];
        int iM2162m = 0;
        for (int i3 = 0; i3 < i2; i3++) {
            iM2162m += (int) m2162m(byteArrayInputStream, 2);
            iArr[i3] = iM2162m;
        }
        return iArr;
    }

    /* renamed from: h */
    public static byte[] m2157h(FileInputStream fileInputStream, int i2, int i3) {
        Inflater inflater = new Inflater();
        try {
            byte[] bArr = new byte[i3];
            byte[] bArr2 = new byte[2048];
            int i4 = 0;
            int iInflate = 0;
            while (!inflater.finished() && !inflater.needsDictionary() && i4 < i2) {
                int i5 = fileInputStream.read(bArr2);
                if (i5 < 0) {
                    throw new IllegalStateException("Invalid zip data. Stream ended after $totalBytesRead bytes. Expected " + i2 + " bytes");
                }
                inflater.setInput(bArr2, 0, i5);
                try {
                    iInflate += inflater.inflate(bArr, iInflate, i3 - iInflate);
                    i4 += i5;
                } catch (DataFormatException e3) {
                    throw new IllegalStateException(e3.getMessage());
                }
            }
            if (i4 == i2) {
                if (inflater.finished()) {
                    return bArr;
                }
                throw new IllegalStateException("Inflater did not finish");
            }
            throw new IllegalStateException("Didn't read enough bytes during decompression. expected=" + i2 + " actual=" + i4);
        } finally {
            inflater.end();
        }
    }

    /* renamed from: i */
    public static C0846c[] m2158i(FileInputStream fileInputStream, byte[] bArr, byte[] bArr2, C0846c[] c0846cArr) throws IOException {
        byte[] bArr3 = f3505i;
        if (!Arrays.equals(bArr, bArr3)) {
            if (!Arrays.equals(bArr, f3506j)) {
                throw new IllegalStateException("Unsupported meta version");
            }
            int iM2162m = (int) m2162m(fileInputStream, 2);
            byte[] bArrM2157h = m2157h(fileInputStream, (int) m2162m(fileInputStream, 4), (int) m2162m(fileInputStream, 4));
            if (fileInputStream.read() > 0) {
                throw new IllegalStateException("Content found after the end of file");
            }
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrM2157h);
            try {
                C0846c[] c0846cArrM2160k = m2160k(byteArrayInputStream, bArr2, iM2162m, c0846cArr);
                byteArrayInputStream.close();
                return c0846cArrM2160k;
            } catch (Throwable th) {
                try {
                    byteArrayInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        if (Arrays.equals(f3500d, bArr2)) {
            throw new IllegalStateException("Requires new Baseline Profile Metadata. Please rebuild the APK with Android Gradle Plugin 7.2 Canary 7 or higher");
        }
        if (!Arrays.equals(bArr, bArr3)) {
            throw new IllegalStateException("Unsupported meta version");
        }
        int iM2162m2 = (int) m2162m(fileInputStream, 1);
        byte[] bArrM2157h2 = m2157h(fileInputStream, (int) m2162m(fileInputStream, 4), (int) m2162m(fileInputStream, 4));
        if (fileInputStream.read() > 0) {
            throw new IllegalStateException("Content found after the end of file");
        }
        ByteArrayInputStream byteArrayInputStream2 = new ByteArrayInputStream(bArrM2157h2);
        try {
            C0846c[] c0846cArrM2159j = m2159j(byteArrayInputStream2, iM2162m2, c0846cArr);
            byteArrayInputStream2.close();
            return c0846cArrM2159j;
        } catch (Throwable th3) {
            try {
                byteArrayInputStream2.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    /* renamed from: j */
    public static C0846c[] m2159j(ByteArrayInputStream byteArrayInputStream, int i2, C0846c[] c0846cArr) {
        if (byteArrayInputStream.available() == 0) {
            return new C0846c[0];
        }
        if (i2 != c0846cArr.length) {
            throw new IllegalStateException("Mismatched number of dex files found in metadata");
        }
        String[] strArr = new String[i2];
        int[] iArr = new int[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            int iM2162m = (int) m2162m(byteArrayInputStream, 2);
            iArr[i3] = (int) m2162m(byteArrayInputStream, 2);
            strArr[i3] = new String(m2155f(byteArrayInputStream, iM2162m), StandardCharsets.UTF_8);
        }
        for (int i4 = 0; i4 < i2; i4++) {
            C0846c c0846c = c0846cArr[i4];
            if (!c0846c.f3489b.equals(strArr[i4])) {
                throw new IllegalStateException("Order of dexfiles in metadata did not match baseline");
            }
            int i5 = iArr[i4];
            c0846c.f3492e = i5;
            c0846c.f3495h = m2156g(byteArrayInputStream, i5);
        }
        return c0846cArr;
    }

    /* renamed from: k */
    public static C0846c[] m2160k(ByteArrayInputStream byteArrayInputStream, byte[] bArr, int i2, C0846c[] c0846cArr) throws IOException {
        if (byteArrayInputStream.available() == 0) {
            return new C0846c[0];
        }
        if (i2 != c0846cArr.length) {
            throw new IllegalStateException("Mismatched number of dex files found in metadata");
        }
        for (int i3 = 0; i3 < i2; i3++) {
            m2162m(byteArrayInputStream, 2);
            String str = new String(m2155f(byteArrayInputStream, (int) m2162m(byteArrayInputStream, 2)), StandardCharsets.UTF_8);
            long jM2162m = m2162m(byteArrayInputStream, 4);
            int iM2162m = (int) m2162m(byteArrayInputStream, 2);
            C0846c c0846c = null;
            if (c0846cArr.length > 0) {
                int iIndexOf = str.indexOf("!");
                if (iIndexOf < 0) {
                    iIndexOf = str.indexOf(":");
                }
                String strSubstring = iIndexOf > 0 ? str.substring(iIndexOf + 1) : str;
                int i4 = 0;
                while (true) {
                    if (i4 >= c0846cArr.length) {
                        break;
                    }
                    if (c0846cArr[i4].f3489b.equals(strSubstring)) {
                        c0846c = c0846cArr[i4];
                        break;
                    }
                    i4++;
                }
            }
            if (c0846c == null) {
                throw new IllegalStateException("Missing profile key: ".concat(str));
            }
            c0846c.f3491d = jM2162m;
            int[] iArrM2156g = m2156g(byteArrayInputStream, iM2162m);
            if (Arrays.equals(bArr, f3504h)) {
                c0846c.f3492e = iM2162m;
                c0846c.f3495h = iArrM2156g;
            }
        }
        return c0846cArr;
    }

    /* renamed from: l */
    public static C0846c[] m2161l(FileInputStream fileInputStream, byte[] bArr, String str) throws IOException {
        if (!Arrays.equals(bArr, f3501e)) {
            throw new IllegalStateException("Unsupported version");
        }
        int iM2162m = (int) m2162m(fileInputStream, 1);
        byte[] bArrM2157h = m2157h(fileInputStream, (int) m2162m(fileInputStream, 4), (int) m2162m(fileInputStream, 4));
        if (fileInputStream.read() > 0) {
            throw new IllegalStateException("Content found after the end of file");
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrM2157h);
        try {
            C0846c[] c0846cArrM2163n = m2163n(byteArrayInputStream, str, iM2162m);
            byteArrayInputStream.close();
            return c0846cArrM2163n;
        } catch (Throwable th) {
            try {
                byteArrayInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* renamed from: m */
    public static long m2162m(InputStream inputStream, int i2) throws IOException {
        byte[] bArrM2155f = m2155f(inputStream, i2);
        long j2 = 0;
        for (int i3 = 0; i3 < i2; i3++) {
            j2 += (bArrM2155f[i3] & 255) << (i3 * 8);
        }
        return j2;
    }

    /* renamed from: n */
    public static C0846c[] m2163n(ByteArrayInputStream byteArrayInputStream, String str, int i2) throws IOException {
        TreeMap treeMap;
        if (byteArrayInputStream.available() == 0) {
            return new C0846c[0];
        }
        C0846c[] c0846cArr = new C0846c[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            int iM2162m = (int) m2162m(byteArrayInputStream, 2);
            int iM2162m2 = (int) m2162m(byteArrayInputStream, 2);
            c0846cArr[i3] = new C0846c(str, new String(m2155f(byteArrayInputStream, iM2162m), StandardCharsets.UTF_8), m2162m(byteArrayInputStream, 4), iM2162m2, (int) m2162m(byteArrayInputStream, 4), (int) m2162m(byteArrayInputStream, 4), new int[iM2162m2], new TreeMap());
        }
        for (int i4 = 0; i4 < i2; i4++) {
            C0846c c0846c = c0846cArr[i4];
            int iAvailable = byteArrayInputStream.available() - c0846c.f3493f;
            int iM2162m3 = 0;
            while (true) {
                int iAvailable2 = byteArrayInputStream.available();
                treeMap = c0846c.f3496i;
                if (iAvailable2 <= iAvailable) {
                    break;
                }
                iM2162m3 += (int) m2162m(byteArrayInputStream, 2);
                treeMap.put(Integer.valueOf(iM2162m3), 1);
                for (int iM2162m4 = (int) m2162m(byteArrayInputStream, 2); iM2162m4 > 0; iM2162m4--) {
                    m2162m(byteArrayInputStream, 2);
                    int iM2162m5 = (int) m2162m(byteArrayInputStream, 1);
                    if (iM2162m5 != 6 && iM2162m5 != 7) {
                        while (iM2162m5 > 0) {
                            m2162m(byteArrayInputStream, 1);
                            for (int iM2162m6 = (int) m2162m(byteArrayInputStream, 1); iM2162m6 > 0; iM2162m6--) {
                                m2162m(byteArrayInputStream, 2);
                            }
                            iM2162m5--;
                        }
                    }
                }
            }
            if (byteArrayInputStream.available() != iAvailable) {
                throw new IllegalStateException("Read too much data during profile line parse");
            }
            c0846c.f3495h = m2156g(byteArrayInputStream, c0846c.f3492e);
            int i5 = c0846c.f3494g;
            BitSet bitSetValueOf = BitSet.valueOf(m2155f(byteArrayInputStream, (((i5 * 2) + 7) & (-8)) / 8));
            for (int i6 = 0; i6 < i5; i6++) {
                int i7 = bitSetValueOf.get(i6) ? 2 : 0;
                if (bitSetValueOf.get(i6 + i5)) {
                    i7 |= 4;
                }
                if (i7 != 0) {
                    Integer num = (Integer) treeMap.get(Integer.valueOf(i6));
                    if (num == null) {
                        num = 0;
                    }
                    treeMap.put(Integer.valueOf(i6), Integer.valueOf(i7 | num.intValue()));
                }
            }
        }
        return c0846cArr;
    }

    /* JADX WARN: Finally extract failed */
    /* renamed from: o */
    public static boolean m2164o(ByteArrayOutputStream byteArrayOutputStream, byte[] bArr, C0846c[] c0846cArr) throws IOException {
        long j2;
        ArrayList arrayList;
        int length;
        byte[] bArr2 = f3500d;
        int i2 = 0;
        if (!Arrays.equals(bArr, bArr2)) {
            byte[] bArr3 = f3501e;
            if (Arrays.equals(bArr, bArr3)) {
                byte[] bArrM2151b = m2151b(c0846cArr, bArr3);
                m2169t(byteArrayOutputStream, c0846cArr.length, 1);
                m2169t(byteArrayOutputStream, bArrM2151b.length, 4);
                byte[] bArrM2150a = m2150a(bArrM2151b);
                m2169t(byteArrayOutputStream, bArrM2150a.length, 4);
                byteArrayOutputStream.write(bArrM2150a);
                return true;
            }
            byte[] bArr4 = f3503g;
            if (Arrays.equals(bArr, bArr4)) {
                m2169t(byteArrayOutputStream, c0846cArr.length, 1);
                for (C0846c c0846c : c0846cArr) {
                    int size = c0846c.f3496i.size() * 4;
                    String strM2153d = m2153d(c0846c.f3488a, c0846c.f3489b, bArr4);
                    Charset charset = StandardCharsets.UTF_8;
                    m2170u(byteArrayOutputStream, strM2153d.getBytes(charset).length);
                    m2170u(byteArrayOutputStream, c0846c.f3495h.length);
                    m2169t(byteArrayOutputStream, size, 4);
                    m2169t(byteArrayOutputStream, c0846c.f3490c, 4);
                    byteArrayOutputStream.write(strM2153d.getBytes(charset));
                    Iterator it = c0846c.f3496i.keySet().iterator();
                    while (it.hasNext()) {
                        m2170u(byteArrayOutputStream, ((Integer) it.next()).intValue());
                        m2170u(byteArrayOutputStream, 0);
                    }
                    for (int i3 : c0846c.f3495h) {
                        m2170u(byteArrayOutputStream, i3);
                    }
                }
                return true;
            }
            byte[] bArr5 = f3502f;
            if (Arrays.equals(bArr, bArr5)) {
                byte[] bArrM2151b2 = m2151b(c0846cArr, bArr5);
                m2169t(byteArrayOutputStream, c0846cArr.length, 1);
                m2169t(byteArrayOutputStream, bArrM2151b2.length, 4);
                byte[] bArrM2150a2 = m2150a(bArrM2151b2);
                m2169t(byteArrayOutputStream, bArrM2150a2.length, 4);
                byteArrayOutputStream.write(bArrM2150a2);
                return true;
            }
            byte[] bArr6 = f3504h;
            if (!Arrays.equals(bArr, bArr6)) {
                return false;
            }
            m2170u(byteArrayOutputStream, c0846cArr.length);
            for (C0846c c0846c2 : c0846cArr) {
                String strM2153d2 = m2153d(c0846c2.f3488a, c0846c2.f3489b, bArr6);
                Charset charset2 = StandardCharsets.UTF_8;
                m2170u(byteArrayOutputStream, strM2153d2.getBytes(charset2).length);
                TreeMap treeMap = c0846c2.f3496i;
                m2170u(byteArrayOutputStream, treeMap.size());
                m2170u(byteArrayOutputStream, c0846c2.f3495h.length);
                m2169t(byteArrayOutputStream, c0846c2.f3490c, 4);
                byteArrayOutputStream.write(strM2153d2.getBytes(charset2));
                Iterator it2 = treeMap.keySet().iterator();
                while (it2.hasNext()) {
                    m2170u(byteArrayOutputStream, ((Integer) it2.next()).intValue());
                }
                for (int i4 : c0846c2.f3495h) {
                    m2170u(byteArrayOutputStream, i4);
                }
            }
            return true;
        }
        ArrayList arrayList2 = new ArrayList(3);
        ArrayList arrayList3 = new ArrayList(3);
        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
        try {
            m2170u(byteArrayOutputStream2, c0846cArr.length);
            int i5 = 2;
            int i6 = 2;
            for (C0846c c0846c3 : c0846cArr) {
                m2169t(byteArrayOutputStream2, c0846c3.f3490c, 4);
                m2169t(byteArrayOutputStream2, c0846c3.f3491d, 4);
                m2169t(byteArrayOutputStream2, c0846c3.f3494g, 4);
                String strM2153d3 = m2153d(c0846c3.f3488a, c0846c3.f3489b, bArr2);
                Charset charset3 = StandardCharsets.UTF_8;
                int length2 = strM2153d3.getBytes(charset3).length;
                m2170u(byteArrayOutputStream2, length2);
                i6 = i6 + 14 + length2;
                byteArrayOutputStream2.write(strM2153d3.getBytes(charset3));
            }
            byte[] byteArray = byteArrayOutputStream2.toByteArray();
            if (i6 != byteArray.length) {
                throw new IllegalStateException("Expected size " + i6 + ", does not match actual size " + byteArray.length);
            }
            C0857n c0857n = new C0857n(1, byteArray, false);
            byteArrayOutputStream2.close();
            arrayList2.add(c0857n);
            ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
            int i7 = 0;
            int i8 = 0;
            while (i7 < c0846cArr.length) {
                try {
                    C0846c c0846c4 = c0846cArr[i7];
                    m2170u(byteArrayOutputStream3, i7);
                    m2170u(byteArrayOutputStream3, c0846c4.f3492e);
                    i8 = i8 + 4 + (c0846c4.f3492e * i5);
                    int[] iArr = c0846c4.f3495h;
                    int length3 = iArr.length;
                    int i9 = i2;
                    int i10 = i5;
                    int i11 = i9;
                    while (i11 < length3) {
                        int i12 = iArr[i11];
                        m2170u(byteArrayOutputStream3, i12 - i9);
                        i11++;
                        i9 = i12;
                    }
                    i7++;
                    i5 = i10;
                    i2 = 0;
                } catch (Throwable th) {
                }
            }
            byte[] byteArray2 = byteArrayOutputStream3.toByteArray();
            if (i8 != byteArray2.length) {
                throw new IllegalStateException("Expected size " + i8 + ", does not match actual size " + byteArray2.length);
            }
            C0857n c0857n2 = new C0857n(3, byteArray2, true);
            byteArrayOutputStream3.close();
            arrayList2.add(c0857n2);
            byteArrayOutputStream3 = new ByteArrayOutputStream();
            int i13 = 0;
            int i14 = 0;
            while (i13 < c0846cArr.length) {
                try {
                    C0846c c0846c5 = c0846cArr[i13];
                    Iterator it3 = c0846c5.f3496i.entrySet().iterator();
                    int iIntValue = 0;
                    while (it3.hasNext()) {
                        iIntValue |= ((Integer) ((Map.Entry) it3.next()).getValue()).intValue();
                    }
                    ByteArrayOutputStream byteArrayOutputStream4 = new ByteArrayOutputStream();
                    try {
                        m2166q(byteArrayOutputStream4, c0846c5);
                        byte[] byteArray3 = byteArrayOutputStream4.toByteArray();
                        byteArrayOutputStream4.close();
                        byteArrayOutputStream4 = new ByteArrayOutputStream();
                        try {
                            m2167r(byteArrayOutputStream4, c0846c5);
                            byte[] byteArray4 = byteArrayOutputStream4.toByteArray();
                            byteArrayOutputStream4.close();
                            m2170u(byteArrayOutputStream3, i13);
                            int length4 = byteArray3.length + 2 + byteArray4.length;
                            int i15 = i14 + 6;
                            ArrayList arrayList4 = arrayList3;
                            m2169t(byteArrayOutputStream3, length4, 4);
                            m2170u(byteArrayOutputStream3, iIntValue);
                            byteArrayOutputStream3.write(byteArray3);
                            byteArrayOutputStream3.write(byteArray4);
                            i14 = i15 + length4;
                            i13++;
                            arrayList3 = arrayList4;
                        } finally {
                        }
                    } finally {
                    }
                } finally {
                    try {
                        byteArrayOutputStream3.close();
                        throw th;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
            }
            ArrayList arrayList5 = arrayList3;
            byte[] byteArray5 = byteArrayOutputStream3.toByteArray();
            if (i14 != byteArray5.length) {
                throw new IllegalStateException("Expected size " + i14 + ", does not match actual size " + byteArray5.length);
            }
            C0857n c0857n3 = new C0857n(4, byteArray5, true);
            byteArrayOutputStream3.close();
            arrayList2.add(c0857n3);
            long j3 = 4;
            long size2 = j3 + j3 + 4 + (arrayList2.size() * 16);
            m2169t(byteArrayOutputStream, arrayList2.size(), 4);
            int i16 = 0;
            while (i16 < arrayList2.size()) {
                C0857n c0857n4 = (C0857n) arrayList2.get(i16);
                int i17 = c0857n4.f3517a;
                if (i17 == 1) {
                    j2 = 0;
                } else if (i17 == 2) {
                    j2 = 1;
                } else if (i17 == 3) {
                    j2 = 2;
                } else if (i17 == 4) {
                    j2 = 3;
                } else {
                    if (i17 != 5) {
                        throw null;
                    }
                    j2 = 4;
                }
                m2169t(byteArrayOutputStream, j2, 4);
                m2169t(byteArrayOutputStream, size2, 4);
                byte[] bArr7 = c0857n4.f3518b;
                if (c0857n4.f3519c) {
                    long length5 = bArr7.length;
                    byte[] bArrM2150a3 = m2150a(bArr7);
                    arrayList = arrayList5;
                    arrayList.add(bArrM2150a3);
                    m2169t(byteArrayOutputStream, bArrM2150a3.length, 4);
                    m2169t(byteArrayOutputStream, length5, 4);
                    length = bArrM2150a3.length;
                } else {
                    arrayList = arrayList5;
                    arrayList.add(bArr7);
                    m2169t(byteArrayOutputStream, bArr7.length, 4);
                    m2169t(byteArrayOutputStream, 0L, 4);
                    length = bArr7.length;
                }
                size2 += length;
                i16++;
                arrayList5 = arrayList;
            }
            ArrayList arrayList6 = arrayList5;
            for (int i18 = 0; i18 < arrayList6.size(); i18++) {
                byteArrayOutputStream.write((byte[]) arrayList6.get(i18));
            }
            return true;
        } catch (Throwable th3) {
            try {
                byteArrayOutputStream2.close();
                throw th3;
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
                throw th3;
            }
        }
    }

    /* renamed from: p */
    public static void m2165p(ByteArrayOutputStream byteArrayOutputStream, C0846c c0846c, String str) throws IOException {
        Charset charset = StandardCharsets.UTF_8;
        m2170u(byteArrayOutputStream, str.getBytes(charset).length);
        m2170u(byteArrayOutputStream, c0846c.f3492e);
        m2169t(byteArrayOutputStream, c0846c.f3493f, 4);
        m2169t(byteArrayOutputStream, c0846c.f3490c, 4);
        m2169t(byteArrayOutputStream, c0846c.f3494g, 4);
        byteArrayOutputStream.write(str.getBytes(charset));
    }

    /* renamed from: q */
    public static void m2166q(ByteArrayOutputStream byteArrayOutputStream, C0846c c0846c) throws IOException {
        byte[] bArr = new byte[(((c0846c.f3494g * 2) + 7) & (-8)) / 8];
        for (Map.Entry entry : c0846c.f3496i.entrySet()) {
            int iIntValue = ((Integer) entry.getKey()).intValue();
            int iIntValue2 = ((Integer) entry.getValue()).intValue();
            if ((iIntValue2 & 2) != 0) {
                int i2 = iIntValue / 8;
                bArr[i2] = (byte) (bArr[i2] | (1 << (iIntValue % 8)));
            }
            if ((iIntValue2 & 4) != 0) {
                int i3 = iIntValue + c0846c.f3494g;
                int i4 = i3 / 8;
                bArr[i4] = (byte) ((1 << (i3 % 8)) | bArr[i4]);
            }
        }
        byteArrayOutputStream.write(bArr);
    }

    /* renamed from: r */
    public static void m2167r(ByteArrayOutputStream byteArrayOutputStream, C0846c c0846c) throws IOException {
        int i2 = 0;
        for (Map.Entry entry : c0846c.f3496i.entrySet()) {
            int iIntValue = ((Integer) entry.getKey()).intValue();
            if ((((Integer) entry.getValue()).intValue() & 1) != 0) {
                m2170u(byteArrayOutputStream, iIntValue - i2);
                m2170u(byteArrayOutputStream, 0);
                i2 = iIntValue;
            }
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(16:35|(3:250|36|37)|43|225|(3:246|45|(4:47|241|48|69)(2:59|60))|75|(5:80|(1:82)(0)|(1:204)(1:203)|205|206)|115|(3:117|120|(0)(0))|147|(0)(0)|(0)|200|(1:204)(0)|205|206) */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00fe, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00ff, code lost:
    
        r20.mo1978e(7, r0);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:114:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x024b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:204:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x00cc A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:249:0x018f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:252:0x012a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0126  */
    /* JADX WARN: Type inference failed for: r7v2, types: [byte[]] */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* renamed from: s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void m2168s(android.content.Context r18, java.util.concurrent.Executor r19, p087d0.InterfaceC0848e r20, boolean r21) throws android.content.pm.PackageManager.NameNotFoundException, java.io.IOException {
        /*
            Method dump skipped, instructions count: 626
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p087d0.AbstractC0849f.m2168s(android.content.Context, java.util.concurrent.Executor, d0.e, boolean):void");
    }

    /* renamed from: t */
    public static void m2169t(ByteArrayOutputStream byteArrayOutputStream, long j2, int i2) throws IOException {
        byte[] bArr = new byte[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            bArr[i3] = (byte) ((j2 >> (i3 * 8)) & 255);
        }
        byteArrayOutputStream.write(bArr);
    }

    /* renamed from: u */
    public static void m2170u(ByteArrayOutputStream byteArrayOutputStream, int i2) throws IOException {
        m2169t(byteArrayOutputStream, i2, 2);
    }
}
