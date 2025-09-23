package p002A1;

import android.content.Context;
import android.text.TextUtils;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.concurrent.ArrayBlockingQueue;
import nfc.share.nfcshare.MainActivity;
import nfc.share.nfcshare.model.CardInfo;
import nfc.share.nfcshare.service.EmulationService;
import p001A0.RunnableC0005d;
import p008C1.C0095d;
import p073Z0.C0608d;

/* renamed from: A1.M */
/* loaded from: classes.dex */
public abstract class AbstractC0018M {

    /* renamed from: b */
    public static C0027i f36b;

    /* renamed from: d */
    public static C0095d f38d;

    /* renamed from: e */
    public static MainActivity f39e;

    /* renamed from: f */
    public static String f40f;

    /* renamed from: g */
    public static EmulationService f41g;

    /* renamed from: h */
    public static String f42h;

    /* renamed from: j */
    public static CardInfo f44j;

    /* renamed from: a */
    public static final C0608d f35a = new C0608d();

    /* renamed from: c */
    public static final ArrayBlockingQueue f37c = new ArrayBlockingQueue(100);

    /* renamed from: i */
    public static boolean f43i = true;

    /* renamed from: a */
    public static void m45a(String... strArr) {
        for (String str : strArr) {
            MainActivity mainActivity = f39e;
            if (mainActivity != null) {
                mainActivity.runOnUiThread(new RunnableC0005d(mainActivity, str, 2));
            }
        }
    }

    /* renamed from: b */
    public static byte[] m46b(String str) {
        String string = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        int i2 = 0;
        if (str != null) {
            int length = str.length();
            StringBuilder sb = new StringBuilder(length);
            for (int i3 = 0; i3 < length; i3++) {
                char cCharAt = str.charAt(i3);
                if (!Character.isWhitespace((int) cCharAt) && !Character.isSpaceChar((int) cCharAt) && cCharAt != 65279 && cCharAt != 8234 && cCharAt != 0 && cCharAt != 12644 && cCharAt != 10240 && cCharAt != 6158) {
                    sb.append(cCharAt);
                }
            }
            string = sb.toString();
        } else if (str != null) {
            string = str.toString();
        }
        int length2 = string.length();
        if ((length2 & 1) != 0) {
            string = "0" + ((Object) string);
            length2 = string.length();
        }
        byte[] bArr = new byte[length2 >> 1];
        int i4 = 0;
        while (i2 < length2) {
            int i5 = i2 + 1;
            int iM52h = (m52h(string.charAt(i2), i2) << 4) | m52h(string.charAt(i5), i5);
            i2 += 2;
            bArr[i4] = (byte) (iM52h & 255);
            i4++;
        }
        return bArr;
    }

    /* renamed from: c */
    public static String m47c(byte[] bArr) {
        char[] charArray = "0123456789abcdef".toCharArray();
        char[] cArr = new char[bArr.length << 1];
        int i2 = 0;
        for (byte b : bArr) {
            int i3 = i2 + 1;
            cArr[i2] = charArray[(b & 240) >>> 4];
            i2 += 2;
            cArr[i3] = charArray[b & 15];
        }
        return new String(cArr);
    }

    /* renamed from: d */
    public static boolean m48d(AbstractActivityC0021c abstractActivityC0021c) {
        return abstractActivityC0021c.getSharedPreferences("ServerSettings", 0).getBoolean("isPosMode", false);
    }

    /* renamed from: e */
    public static String m49e(String str) {
        try {
            byte[] bArrDigest = MessageDigest.getInstance("MD5").digest(str.getBytes(StandardCharsets.UTF_8));
            StringBuilder sb = new StringBuilder();
            for (byte b : bArrDigest) {
                sb.append(String.format("%02x", Byte.valueOf(b)));
            }
            return sb.toString();
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: f */
    public static void m50f(Context context, String str) {
        context.getSharedPreferences("ServerSettings", 0).edit().putString("saved_password", str).apply();
    }

    /* renamed from: g */
    public static void m51g(Context context, String str) {
        context.getSharedPreferences("ServerSettings", 0).edit().putString("saved_username", str).apply();
    }

    /* renamed from: h */
    public static int m52h(char c3, int i2) {
        int iDigit = Character.digit(c3, 16);
        if (iDigit >= 0) {
            return iDigit;
        }
        throw new IllegalStateException("Illegal hexadecimal character {" + c3 + "} at index {" + i2 + "}");
    }
}
