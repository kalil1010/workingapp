package p093e2;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Path;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.Uri;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.os.Process;
import android.os.StrictMode;
import android.text.InputFilter;
import android.util.TypedValue;
import android.util.Xml;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.security.PublicKey;
import java.security.cert.X509Certificate;
import java.util.Collections;
import java.util.List;
import java.util.logging.Logger;
import java.util.regex.Pattern;
import org.xmlpull.v1.XmlSerializer;
import p002A1.C0027i;
import p006C.AbstractC0070b;
import p006C.AbstractC0075g;
import p006C.C0076h;
import p011D1.C0124n;
import p011D1.C0128r;
import p014E1.AbstractC0145b;
import p021H1.C0189h;
import p033L1.AbstractC0356d;
import p033L1.AbstractC0364l;
import p034M.AbstractC0367a;
import p045Q.AbstractC0440d;
import p045Q.AbstractC0441e;
import p050R1.AbstractC0486n;
import p050R1.C0475c;
import p050R1.C0476d;
import p050R1.C0478f;
import p050R1.C0479g;
import p050R1.C0482j;
import p055T0.C0511e;
import p063W.C0552b;
import p105j.C1050N0;
import p116m1.AbstractC1234c;
import p131s1.AbstractC1326c;
import p140v1.C1378a;
import p140v1.C1380c;
import p149y1.AbstractC1403a;
import p149y1.AbstractC1411i;

/* renamed from: e2.d */
/* loaded from: classes.dex */
public abstract class AbstractC0901d {

    /* renamed from: a */
    public static C0900c f3735a;

    /* renamed from: b */
    public static boolean f3736b;

    /* renamed from: C */
    public static float m2280C(String[] strArr, int i2) throws NumberFormatException {
        float f = Float.parseFloat(strArr[i2]);
        if (f >= 0.0f && f <= 1.0f) {
            return f;
        }
        throw new IllegalArgumentException("Motion easing control point value must be between 0 and 1; instead got: " + f);
    }

    /* renamed from: I */
    public static File m2281I(Context context) {
        File cacheDir = context.getCacheDir();
        if (cacheDir == null) {
            return null;
        }
        String str = ".font" + Process.myPid() + "-" + Process.myTid() + "-";
        for (int i2 = 0; i2 < 100; i2++) {
            File file = new File(cacheDir, str + i2);
            if (file.createNewFile()) {
                return file;
            }
        }
        return null;
    }

    /* renamed from: L */
    public static int m2282L(int i2) {
        if (i2 == 1) {
            return 0;
        }
        if (i2 == 2) {
            return 1;
        }
        if (i2 == 4) {
            return 2;
        }
        if (i2 == 8) {
            return 3;
        }
        if (i2 == 16) {
            return 4;
        }
        if (i2 == 32) {
            return 5;
        }
        if (i2 == 64) {
            return 6;
        }
        if (i2 == 128) {
            return 7;
        }
        if (i2 == 256) {
            return 8;
        }
        throw new IllegalArgumentException(AbstractC0075g.m236e("type needs to be >= FIRST and <= LAST, type=", i2));
    }

    /* renamed from: M */
    public static final boolean m2283M(AssertionError assertionError) {
        Logger logger = AbstractC0486n.f1495a;
        if (assertionError.getCause() != null) {
            String message = assertionError.getMessage();
            if (message != null ? AbstractC1411i.m3173N(message, "getsockname failed") : false) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: N */
    public static boolean m2284N(Context context) {
        Network activeNetwork;
        NetworkCapabilities networkCapabilities;
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        return (connectivityManager == null || (activeNetwork = connectivityManager.getActiveNetwork()) == null || (networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork)) == null || !networkCapabilities.hasCapability(12) || !networkCapabilities.hasCapability(16)) ? false : true;
    }

    /* renamed from: P */
    public static boolean m2285P(Context context) {
        return context.getResources().getConfiguration().fontScale >= 1.3f;
    }

    /* renamed from: Q */
    public static boolean m2286Q(String str, String str2) {
        return str.startsWith(str2.concat("(")) && str.endsWith(")");
    }

    /* renamed from: T */
    public static List m2287T(Object obj) {
        List listSingletonList = Collections.singletonList(obj);
        AbstractC1326c.m3061d(listSingletonList, "singletonList(element)");
        return listSingletonList;
    }

    /* renamed from: U */
    public static MappedByteBuffer m2288U(Context context, Uri uri) throws IOException {
        ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor;
        try {
            parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(uri, "r", null);
        } catch (IOException unused) {
        }
        if (parcelFileDescriptorOpenFileDescriptor == null) {
            if (parcelFileDescriptorOpenFileDescriptor != null) {
                parcelFileDescriptorOpenFileDescriptor.close();
                return null;
            }
            return null;
        }
        try {
            FileInputStream fileInputStream = new FileInputStream(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor());
            try {
                FileChannel channel = fileInputStream.getChannel();
                MappedByteBuffer map = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
                fileInputStream.close();
                parcelFileDescriptorOpenFileDescriptor.close();
                return map;
            } finally {
            }
        } finally {
        }
    }

    /* renamed from: V */
    public static C0124n m2289V(String... strArr) throws CloneNotSupportedException {
        if (strArr.length % 2 != 0) {
            throw new IllegalArgumentException("Expected alternating header names and values");
        }
        Object objClone = strArr.clone();
        if (objClone == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<kotlin.String>");
        }
        String[] strArr2 = (String[]) objClone;
        int length = strArr2.length;
        for (int i2 = 0; i2 < length; i2++) {
            String str = strArr2[i2];
            if (str == null) {
                throw new IllegalArgumentException("Headers cannot be null");
            }
            if (str == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.CharSequence");
            }
            strArr2[i2] = AbstractC1411i.m3191f0(str).toString();
        }
        C1378a c1378aM1004j0 = AbstractC0364l.m1004j0(new C1380c(0, strArr2.length - 1, 1), 2);
        int i3 = c1378aM1004j0.f5989a;
        int i4 = c1378aM1004j0.f5990b;
        int i5 = c1378aM1004j0.f5991c;
        if (i5 < 0 ? i3 >= i4 : i3 <= i4) {
            while (true) {
                String str2 = strArr2[i3];
                String str3 = strArr2[i3 + 1];
                m2293e(str2);
                m2297g(str3, str2);
                if (i3 == i4) {
                    break;
                }
                i3 += i5;
            }
        }
        return new C0124n(strArr2);
    }

    /* renamed from: Y */
    public static float m2290Y(EdgeEffect edgeEffect, float f, float f2) {
        if (Build.VERSION.SDK_INT >= 31) {
            return AbstractC0441e.m1110c(edgeEffect, f, f2);
        }
        AbstractC0440d.m1107a(edgeEffect, f, f2);
        return f;
    }

    /* renamed from: a */
    public static void m2291a(Throwable th, Throwable th2) {
        AbstractC1326c.m3062e(th, "<this>");
        AbstractC1326c.m3062e(th2, "exception");
        if (th != th2) {
            AbstractC1234c.f4952a.mo2868a(th, th2);
        }
    }

    /* renamed from: b */
    public static int m2292b(byte[] bArr) {
        int length = bArr.length;
        if (length <= 0 || length > 4) {
            throw new IllegalArgumentException(AbstractC0075g.m236e("Length must be between 1 and 4. Length = ", length));
        }
        if (bArr.length < length) {
            throw new IllegalArgumentException("Length or startPos not valid");
        }
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3++) {
            i2 += (bArr[i3] & 255) << (((length - i3) - 1) * 8);
        }
        return i2;
    }

    /* renamed from: e */
    public static void m2293e(String str) {
        if (str.length() <= 0) {
            throw new IllegalArgumentException("name is empty");
        }
        int length = str.length();
        for (int i2 = 0; i2 < length; i2++) {
            char cCharAt = str.charAt(i2);
            if ('!' > cCharAt || '~' < cCharAt) {
                throw new IllegalArgumentException(AbstractC0145b.m397j("Unexpected char %#04x at %d in header name: %s", Integer.valueOf(cCharAt), Integer.valueOf(i2), str).toString());
            }
        }
    }

    /* renamed from: e0 */
    public static final boolean m2294e0(String str) {
        AbstractC1326c.m3062e(str, "method");
        return (str.equals("GET") || str.equals("HEAD")) ? false : true;
    }

    /* renamed from: f */
    public static void m2295f(int i2) {
        C1380c c1380c = new C1380c(2, 36, 1);
        if (2 > i2 || i2 > c1380c.f5990b) {
            throw new IllegalArgumentException("radix " + i2 + " was not in valid range " + new C1380c(2, 36, 1));
        }
    }

    /* renamed from: f0 */
    public static void m2296f0(Context context, String str) throws IOException {
        if (str.equals("")) {
            context.deleteFile("androidx.appcompat.app.AppCompatDelegate.application_locales_record_file");
            return;
        }
        try {
            FileOutputStream fileOutputStreamOpenFileOutput = context.openFileOutput("androidx.appcompat.app.AppCompatDelegate.application_locales_record_file", 0);
            XmlSerializer xmlSerializerNewSerializer = Xml.newSerializer();
            try {
                xmlSerializerNewSerializer.setOutput(fileOutputStreamOpenFileOutput, null);
                xmlSerializerNewSerializer.startDocument("UTF-8", Boolean.TRUE);
                xmlSerializerNewSerializer.startTag(null, "locales");
                xmlSerializerNewSerializer.attribute(null, "application_locales", str);
                xmlSerializerNewSerializer.endTag(null, "locales");
                xmlSerializerNewSerializer.endDocument();
                if (fileOutputStreamOpenFileOutput != null) {
                    fileOutputStreamOpenFileOutput.close();
                }
            } catch (Exception unused) {
                if (fileOutputStreamOpenFileOutput != null) {
                    fileOutputStreamOpenFileOutput.close();
                }
            } catch (Throwable th) {
                if (fileOutputStreamOpenFileOutput != null) {
                    try {
                        fileOutputStreamOpenFileOutput.close();
                    } catch (IOException unused2) {
                    }
                }
                throw th;
            }
        } catch (FileNotFoundException | IOException unused3) {
        }
    }

    /* renamed from: g */
    public static void m2297g(String str, String str2) {
        int length = str.length();
        for (int i2 = 0; i2 < length; i2++) {
            char cCharAt = str.charAt(i2);
            if (cCharAt != '\t' && (' ' > cCharAt || '~' < cCharAt)) {
                StringBuilder sb = new StringBuilder();
                sb.append(AbstractC0145b.m397j("Unexpected char %#04x at %d in %s value", Integer.valueOf(cCharAt), Integer.valueOf(i2), str2));
                sb.append(AbstractC0145b.m405r(str2) ? "" : ": ".concat(str));
                throw new IllegalArgumentException(sb.toString().toString());
            }
        }
    }

    /* renamed from: g0 */
    public static String m2298g0(X509Certificate x509Certificate) {
        StringBuilder sb = new StringBuilder("sha256/");
        C0482j c0482j = C0482j.f1481d;
        PublicKey publicKey = x509Certificate.getPublicKey();
        AbstractC1326c.m3061d(publicKey, "publicKey");
        byte[] encoded = publicKey.getEncoded();
        AbstractC1326c.m3061d(encoded, "publicKey.encoded");
        sb.append(C0511e.m1278k(encoded).mo1196b("SHA-256").mo1195a());
        return sb.toString();
    }

    /* renamed from: h */
    public static int m2299h(int i2, int i3, int i4) {
        return i2 < i3 ? i3 : i2 > i4 ? i4 : i2;
    }

    /* renamed from: h0 */
    public static C0552b m2300h0(MappedByteBuffer mappedByteBuffer) throws IOException {
        long j2;
        ByteBuffer byteBufferDuplicate = mappedByteBuffer.duplicate();
        byteBufferDuplicate.order(ByteOrder.BIG_ENDIAN);
        byteBufferDuplicate.position(byteBufferDuplicate.position() + 4);
        int i2 = byteBufferDuplicate.getShort() & 65535;
        if (i2 > 100) {
            throw new IOException("Cannot read metadata.");
        }
        byteBufferDuplicate.position(byteBufferDuplicate.position() + 6);
        int i3 = 0;
        while (true) {
            if (i3 >= i2) {
                j2 = -1;
                break;
            }
            int i4 = byteBufferDuplicate.getInt();
            byteBufferDuplicate.position(byteBufferDuplicate.position() + 4);
            j2 = byteBufferDuplicate.getInt() & 4294967295L;
            byteBufferDuplicate.position(byteBufferDuplicate.position() + 4);
            if (1835365473 == i4) {
                break;
            }
            i3++;
        }
        if (j2 != -1) {
            byteBufferDuplicate.position(byteBufferDuplicate.position() + ((int) (j2 - byteBufferDuplicate.position())));
            byteBufferDuplicate.position(byteBufferDuplicate.position() + 12);
            long j3 = byteBufferDuplicate.getInt() & 4294967295L;
            for (int i5 = 0; i5 < j3; i5++) {
                int i6 = byteBufferDuplicate.getInt();
                long j4 = byteBufferDuplicate.getInt() & 4294967295L;
                byteBufferDuplicate.getInt();
                if (1164798569 == i6 || 1701669481 == i6) {
                    byteBufferDuplicate.position((int) (j4 + j2));
                    C0552b c0552b = new C0552b();
                    byteBufferDuplicate.order(ByteOrder.LITTLE_ENDIAN);
                    int iPosition = byteBufferDuplicate.position() + byteBufferDuplicate.getInt(byteBufferDuplicate.position());
                    c0552b.f806d = byteBufferDuplicate;
                    c0552b.f803a = iPosition;
                    int i7 = iPosition - byteBufferDuplicate.getInt(iPosition);
                    c0552b.f804b = i7;
                    c0552b.f805c = ((ByteBuffer) c0552b.f806d).getShort(i7);
                    return c0552b;
                }
            }
        }
        throw new IOException("Cannot read metadata.");
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x003a, code lost:
    
        r1 = r3.getAttributeValue(null, "application_locales");
     */
    /* renamed from: i0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String m2301i0(android.content.Context r8) throws java.io.IOException {
        /*
            java.lang.String r0 = "androidx.appcompat.app.AppCompatDelegate.application_locales_record_file"
            java.lang.String r1 = ""
            java.io.FileInputStream r2 = r8.openFileInput(r0)     // Catch: java.io.FileNotFoundException -> L5a
            org.xmlpull.v1.XmlPullParser r3 = android.util.Xml.newPullParser()     // Catch: java.lang.Throwable -> L26 java.lang.Throwable -> L4d
            java.lang.String r4 = "UTF-8"
            r3.setInput(r2, r4)     // Catch: java.lang.Throwable -> L26 java.lang.Throwable -> L4d
            int r4 = r3.getDepth()     // Catch: java.lang.Throwable -> L26 java.lang.Throwable -> L4d
        L15:
            int r5 = r3.next()     // Catch: java.lang.Throwable -> L26 java.lang.Throwable -> L4d
            r6 = 1
            if (r5 == r6) goto L41
            r6 = 3
            if (r5 != r6) goto L28
            int r7 = r3.getDepth()     // Catch: java.lang.Throwable -> L26 java.lang.Throwable -> L4d
            if (r7 <= r4) goto L41
            goto L28
        L26:
            r8 = move-exception
            goto L47
        L28:
            if (r5 == r6) goto L15
            r6 = 4
            if (r5 != r6) goto L2e
            goto L15
        L2e:
            java.lang.String r5 = r3.getName()     // Catch: java.lang.Throwable -> L26 java.lang.Throwable -> L4d
            java.lang.String r6 = "locales"
            boolean r5 = r5.equals(r6)     // Catch: java.lang.Throwable -> L26 java.lang.Throwable -> L4d
            if (r5 == 0) goto L15
            java.lang.String r4 = "application_locales"
            r5 = 0
            java.lang.String r1 = r3.getAttributeValue(r5, r4)     // Catch: java.lang.Throwable -> L26 java.lang.Throwable -> L4d
        L41:
            if (r2 == 0) goto L50
        L43:
            r2.close()     // Catch: java.io.IOException -> L50
            goto L50
        L47:
            if (r2 == 0) goto L4c
            r2.close()     // Catch: java.io.IOException -> L4c
        L4c:
            throw r8
        L4d:
            if (r2 == 0) goto L50
            goto L43
        L50:
            boolean r2 = r1.isEmpty()
            if (r2 != 0) goto L57
            goto L5a
        L57:
            r8.deleteFile(r0)
        L5a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p093e2.AbstractC0901d.m2301i0(android.content.Context):java.lang.String");
    }

    /* renamed from: j0 */
    public static final void m2302j0(String str) {
        System.err.println("SLF4J: " + str);
    }

    /* renamed from: k */
    public static final void m2303k(Closeable closeable, Throwable th) throws IOException {
        if (closeable != null) {
            if (th == null) {
                closeable.close();
                return;
            }
            try {
                closeable.close();
            } catch (Throwable th2) {
                m2291a(th, th2);
            }
        }
    }

    /* renamed from: k0 */
    public static int m2304k0(Context context, int i2, int i3) {
        TypedValue typedValueM995b0 = AbstractC0364l.m995b0(context, i2);
        return (typedValueM995b0 == null || typedValueM995b0.type != 16) ? i3 : typedValueM995b0.data;
    }

    /* renamed from: l */
    public static void m2305l(Closeable closeable) throws IOException {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    /* renamed from: l0 */
    public static TimeInterpolator m2306l0(Context context, int i2, Interpolator interpolator) {
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(i2, typedValue, true)) {
            return interpolator;
        }
        if (typedValue.type != 3) {
            throw new IllegalArgumentException("Motion easing theme attribute must be an @interpolator resource for ?attr/motionEasing*Interpolator attributes or a string for ?attr/motionEasing* attributes.");
        }
        String strValueOf = String.valueOf(typedValue.string);
        if (!m2286Q(strValueOf, "cubic-bezier") && !m2286Q(strValueOf, "path")) {
            return AnimationUtils.loadInterpolator(context, typedValue.resourceId);
        }
        if (m2286Q(strValueOf, "cubic-bezier")) {
            String[] strArrSplit = strValueOf.substring(13, strValueOf.length() - 1).split(",");
            if (strArrSplit.length == 4) {
                return AbstractC0367a.m1034b(m2280C(strArrSplit, 0), m2280C(strArrSplit, 1), m2280C(strArrSplit, 2), m2280C(strArrSplit, 3));
            }
            throw new IllegalArgumentException("Motion easing theme attribute must have 4 control points if using bezier curve format; instead got: " + strArrSplit.length);
        }
        if (!m2286Q(strValueOf, "path")) {
            throw new IllegalArgumentException("Invalid motion easing type: ".concat(strValueOf));
        }
        String strSubstring = strValueOf.substring(5, strValueOf.length() - 1);
        Path path = new Path();
        try {
            C0076h.m244b(AbstractC0356d.m961k(strSubstring), path);
            return AbstractC0367a.m1035c(path);
        } catch (RuntimeException e3) {
            throw new RuntimeException("Error in parsing ".concat(strSubstring), e3);
        }
    }

    /* renamed from: m */
    public static boolean m2307m(File file, Resources resources, int i2) throws Throwable {
        InputStream inputStreamOpenRawResource;
        try {
            inputStreamOpenRawResource = resources.openRawResource(i2);
            try {
                boolean zM2308n = m2308n(file, inputStreamOpenRawResource);
                m2305l(inputStreamOpenRawResource);
                return zM2308n;
            } catch (Throwable th) {
                th = th;
                m2305l(inputStreamOpenRawResource);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            inputStreamOpenRawResource = null;
        }
    }

    /* renamed from: n */
    public static boolean m2308n(File file, InputStream inputStream) throws Throwable {
        FileOutputStream fileOutputStream;
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskWrites = StrictMode.allowThreadDiskWrites();
        FileOutputStream fileOutputStream2 = null;
        try {
            try {
                fileOutputStream = new FileOutputStream(file, false);
            } catch (IOException e3) {
                e = e3;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            byte[] bArr = new byte[1024];
            while (true) {
                int i2 = inputStream.read(bArr);
                if (i2 == -1) {
                    m2305l(fileOutputStream);
                    StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
                    return true;
                }
                fileOutputStream.write(bArr, 0, i2);
            }
        } catch (IOException e4) {
            e = e4;
            fileOutputStream2 = fileOutputStream;
            e.getMessage();
            m2305l(fileOutputStream2);
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
            return false;
        } catch (Throwable th2) {
            th = th2;
            fileOutputStream2 = fileOutputStream;
            m2305l(fileOutputStream2);
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
            throw th;
        }
    }

    /* renamed from: n0 */
    public static byte m2309n0(byte b, int i2, boolean z2) {
        if (i2 < 0 || i2 > 7) {
            throw new IllegalArgumentException(AbstractC0075g.m236e("parameter 'pBitIndex' must be between 0 and 7. pBitIndex=", i2));
        }
        return (byte) (z2 ? b | (1 << i2) : b & (~(1 << i2)));
    }

    /* renamed from: o */
    public static final void m2310o(String str, C0128r c0128r) {
        AbstractC1326c.m3062e(str, "$this$toRequestBody");
        Charset charset = AbstractC1403a.f6077a;
        if (c0128r != null) {
            Pattern pattern = C0128r.f381c;
            Charset charsetM365a = c0128r.m365a(null);
            if (charsetM365a == null) {
                String str2 = c0128r + "; charset=utf-8";
                AbstractC1326c.m3062e(str2, "$this$toMediaTypeOrNull");
                try {
                    AbstractC0356d.m968r(str2);
                } catch (IllegalArgumentException unused) {
                }
            } else {
                charset = charsetM365a;
            }
        }
        AbstractC1326c.m3061d(str.getBytes(charset), "(this as java.lang.String).getBytes(charset)");
        AbstractC0145b.m390c(r6.length, 0, r6.length);
    }

    /* renamed from: p */
    public static final boolean m2311p(char c3, char c4, boolean z2) {
        if (c3 == c4) {
            return true;
        }
        if (!z2) {
            return false;
        }
        char upperCase = Character.toUpperCase(c3);
        char upperCase2 = Character.toUpperCase(c4);
        return upperCase == upperCase2 || Character.toLowerCase(upperCase) == Character.toLowerCase(upperCase2);
    }

    /* renamed from: q */
    public static String m2312q(byte[] bArr, boolean z2) {
        if (bArr == null || bArr.length <= 0) {
            return "";
        }
        int length = bArr.length * (z2 ? 3 : 2);
        char[] cArr = new char[length];
        int i2 = 0;
        int i3 = 0;
        while (i2 < bArr.length) {
            byte b = bArr[i2];
            byte b3 = (byte) ((b & 240) >> 4);
            cArr[i3] = (char) (b3 > 9 ? b3 + 55 : b3 + 48);
            byte b4 = (byte) (b & 15);
            int i4 = i3 + 1;
            cArr[i4] = (char) (b4 > 9 ? b4 + 55 : b4 + 48);
            if (z2) {
                i4 = i3 + 2;
                cArr[i4] = ' ';
            }
            i2++;
            i3 = i4 + 1;
        }
        return z2 ? new String(cArr, 0, length - 1) : new String(cArr);
    }

    /* renamed from: q0 */
    public static final C0475c m2313q0(Socket socket) throws IOException {
        Logger logger = AbstractC0486n.f1495a;
        C0189h c0189h = new C0189h(2, socket);
        OutputStream outputStream = socket.getOutputStream();
        AbstractC1326c.m3061d(outputStream, "getOutputStream()");
        return new C0475c(c0189h, new C0475c(outputStream, c0189h));
    }

    /* renamed from: r */
    public static byte[] m2314r(String str) {
        if (str == null) {
            throw new IllegalArgumentException("Argument can't be null");
        }
        StringBuilder sb = new StringBuilder(str);
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < sb.length(); i4++) {
            if (!Character.isWhitespace(sb.charAt(i4))) {
                sb.setCharAt(i3, sb.charAt(i4));
                i3++;
            }
        }
        sb.delete(i3, sb.length());
        if (sb.length() % 2 != 0) {
            throw new IllegalArgumentException("Hex binary needs to be even-length :".concat(str));
        }
        byte[] bArr = new byte[sb.length() / 2];
        int i5 = 0;
        while (i2 < sb.length()) {
            bArr[i5] = (byte) (Character.digit(sb.charAt(i2 + 1), 16) + (Character.digit(sb.charAt(i2), 16) << 4));
            i2 += 2;
            i5++;
        }
        return bArr;
    }

    /* renamed from: r0 */
    public static final C0476d m2315r0(Socket socket) throws IOException {
        Logger logger = AbstractC0486n.f1495a;
        C0189h c0189h = new C0189h(2, socket);
        InputStream inputStream = socket.getInputStream();
        AbstractC1326c.m3061d(inputStream, "getInputStream()");
        return new C0476d(c0189h, 0, new C0476d(inputStream, 1, c0189h));
    }

    /* renamed from: s */
    public static ColorStateList m2316s(Context context, C0027i c0027i, int i2) {
        int resourceId;
        ColorStateList colorStateListM969s;
        TypedArray typedArray = (TypedArray) c0027i.f66c;
        return (!typedArray.hasValue(i2) || (resourceId = typedArray.getResourceId(i2, 0)) == 0 || (colorStateListM969s = AbstractC0356d.m969s(context, resourceId)) == null) ? c0027i.m99A(i2) : colorStateListM969s;
    }

    /* renamed from: s0 */
    public static void m2317s0(C0478f c0478f, byte[] bArr) {
        long j2;
        AbstractC1326c.m3062e(c0478f, "cursor");
        AbstractC1326c.m3062e(bArr, "key");
        int length = bArr.length;
        int i2 = 0;
        do {
            byte[] bArr2 = c0478f.f1476e;
            int i3 = c0478f.f1477f;
            int i4 = c0478f.f1478g;
            if (bArr2 != null) {
                while (i3 < i4) {
                    int i5 = i2 % length;
                    bArr2[i3] = (byte) (bArr2[i3] ^ bArr[i5]);
                    i3++;
                    i2 = i5 + 1;
                }
            }
            long j3 = c0478f.f1475d;
            C0479g c0479g = c0478f.f1472a;
            AbstractC1326c.m3059b(c0479g);
            if (j3 == c0479g.f1480b) {
                throw new IllegalStateException("no more bytes");
            }
            j2 = c0478f.f1475d;
        } while (c0478f.m1165h(j2 == -1 ? 0L : j2 + (c0478f.f1478g - c0478f.f1477f)) != -1);
    }

    /* renamed from: t */
    public static ColorStateList m2318t(Context context, TypedArray typedArray, int i2) {
        int resourceId;
        ColorStateList colorStateListM969s;
        return (!typedArray.hasValue(i2) || (resourceId = typedArray.getResourceId(i2, 0)) == 0 || (colorStateListM969s = AbstractC0356d.m969s(context, resourceId)) == null) ? typedArray.getColorStateList(i2) : colorStateListM969s;
    }

    /* renamed from: u */
    public static ColorStateList m2319u(Drawable drawable) {
        if (drawable instanceof ColorDrawable) {
            return ColorStateList.valueOf(((ColorDrawable) drawable).getColor());
        }
        if (Build.VERSION.SDK_INT < 29 || !AbstractC0070b.m216q(drawable)) {
            return null;
        }
        return AbstractC0070b.m203d(drawable).getColorStateList();
    }

    /* renamed from: w */
    public static float m2320w(EdgeEffect edgeEffect) {
        if (Build.VERSION.SDK_INT >= 31) {
            return AbstractC0441e.m1109b(edgeEffect);
        }
        return 0.0f;
    }

    /* renamed from: x */
    public static Drawable m2321x(Context context, int i2) {
        return C1050N0.m2656b().m2659c(context, i2);
    }

    /* renamed from: y */
    public static Drawable m2322y(Context context, TypedArray typedArray, int i2) {
        int resourceId;
        Drawable drawableM2321x;
        return (!typedArray.hasValue(i2) || (resourceId = typedArray.getResourceId(i2, 0)) == 0 || (drawableM2321x = m2321x(context, resourceId)) == null) ? typedArray.getDrawable(i2) : drawableM2321x;
    }

    /* renamed from: A */
    public abstract InputFilter[] mo1398A(InputFilter[] inputFilterArr);

    /* renamed from: B */
    public abstract int mo1315B();

    /* renamed from: D */
    public abstract int mo1316D();

    /* renamed from: E */
    public abstract int mo1317E();

    /* renamed from: F */
    public abstract int mo1318F(View view);

    /* renamed from: G */
    public abstract int mo1319G(CoordinatorLayout coordinatorLayout);

    /* renamed from: H */
    public abstract int mo1320H();

    /* renamed from: J */
    public int mo6J(View view) {
        return 0;
    }

    /* renamed from: K */
    public int mo280K() {
        return 0;
    }

    /* renamed from: O */
    public abstract boolean mo1321O(float f);

    /* renamed from: R */
    public abstract boolean mo1322R(View view);

    /* renamed from: S */
    public abstract boolean mo1323S(float f, float f2);

    /* renamed from: W */
    public void mo1331W(int i2, int i3) {
    }

    /* renamed from: X */
    public void mo1332X() {
    }

    /* renamed from: Z */
    public void mo7Z(View view, int i2) {
    }

    /* renamed from: a0 */
    public abstract void mo8a0(int i2);

    /* renamed from: b0 */
    public abstract void mo9b0(View view, int i2, int i3);

    /* renamed from: c */
    public abstract int mo1324c(ViewGroup.MarginLayoutParams marginLayoutParams);

    /* renamed from: c0 */
    public abstract void mo10c0(View view, float f, float f2);

    /* renamed from: d */
    public abstract float mo1325d(int i2);

    /* renamed from: d0 */
    public abstract Object mo1766d0(int i2, Intent intent);

    /* renamed from: i */
    public abstract int mo11i(View view, int i2);

    /* renamed from: j */
    public abstract int mo12j(View view, int i2);

    /* renamed from: m0 */
    public abstract void mo1399m0(boolean z2);

    /* renamed from: o0 */
    public abstract void mo1400o0(boolean z2);

    /* renamed from: p0 */
    public abstract boolean mo1326p0(View view, float f);

    /* renamed from: t0 */
    public abstract boolean mo13t0(View view, int i2);

    /* renamed from: u0 */
    public abstract void mo1327u0(ViewGroup.MarginLayoutParams marginLayoutParams, int i2);

    /* renamed from: v */
    public abstract int mo1328v(ViewGroup.MarginLayoutParams marginLayoutParams);

    /* renamed from: v0 */
    public abstract void mo1329v0(ViewGroup.MarginLayoutParams marginLayoutParams, int i2, int i3);

    /* renamed from: z */
    public abstract int mo1330z();
}
