package p142w0;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import p065W1.C0587g;
import p068X1.AbstractC0599a;
import p074Z1.AbstractC0618a;
import p085c2.AbstractC0808b;
import p085c2.InterfaceC0807a;

/* renamed from: w0.a */
/* loaded from: classes.dex */
public abstract class AbstractC1382a {

    /* renamed from: a */
    public static final InterfaceC0807a f5999a = AbstractC0808b.m2014d(AbstractC1382a.class);

    /* renamed from: b */
    public static final C0587g f6000b = new C0587g();

    static {
        InputStream resourceAsStream;
        InputStreamReader inputStreamReader;
        BufferedReader bufferedReader;
        BufferedReader bufferedReader2 = null;
        String strReplaceAll = null;
        bufferedReader2 = null;
        bufferedReader2 = null;
        InputStream inputStream = null;
        try {
            resourceAsStream = AbstractC1382a.class.getResourceAsStream("/smartcard_list.txt");
            try {
                inputStreamReader = new InputStreamReader(resourceAsStream, "UTF-8");
                try {
                    bufferedReader = new BufferedReader(inputStreamReader);
                    int i2 = 0;
                    while (true) {
                        try {
                            String line = bufferedReader.readLine();
                            if (line == null) {
                                AbstractC0599a.m1404a(bufferedReader);
                                AbstractC0599a.m1404a(inputStreamReader);
                                AbstractC0599a.m1404a(resourceAsStream);
                                return;
                            }
                            i2++;
                            if (!line.startsWith("#") && line.trim().length() != 0 && !line.contains("http")) {
                                if (line.startsWith("\t") && strReplaceAll != null) {
                                    f6000b.m1394a(strReplaceAll, line.replace("\t", "").trim());
                                } else if (line.startsWith("3")) {
                                    strReplaceAll = AbstractC0618a.m1418b(line.toUpperCase()).replaceAll("9000$", "");
                                } else {
                                    f5999a.mo125i("Encountered unexpected line in atr list: currentATR=" + strReplaceAll + " Line(" + i2 + ") = " + line);
                                }
                            }
                        } catch (IOException e3) {
                            e = e3;
                            inputStream = resourceAsStream;
                            try {
                                throw new RuntimeException(e);
                            } catch (Throwable th) {
                                th = th;
                                resourceAsStream = inputStream;
                                bufferedReader2 = bufferedReader;
                                AbstractC0599a.m1404a(bufferedReader2);
                                AbstractC0599a.m1404a(inputStreamReader);
                                AbstractC0599a.m1404a(resourceAsStream);
                                throw th;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            bufferedReader2 = bufferedReader;
                            AbstractC0599a.m1404a(bufferedReader2);
                            AbstractC0599a.m1404a(inputStreamReader);
                            AbstractC0599a.m1404a(resourceAsStream);
                            throw th;
                        }
                    }
                } catch (IOException e4) {
                    e = e4;
                    bufferedReader = null;
                } catch (Throwable th3) {
                    th = th3;
                    AbstractC0599a.m1404a(bufferedReader2);
                    AbstractC0599a.m1404a(inputStreamReader);
                    AbstractC0599a.m1404a(resourceAsStream);
                    throw th;
                }
            } catch (IOException e5) {
                e = e5;
                inputStreamReader = null;
                bufferedReader = null;
            } catch (Throwable th4) {
                th = th4;
                inputStreamReader = null;
            }
        } catch (IOException e6) {
            e = e6;
            inputStreamReader = null;
            bufferedReader = null;
        } catch (Throwable th5) {
            th = th5;
            resourceAsStream = null;
            inputStreamReader = null;
        }
    }
}
