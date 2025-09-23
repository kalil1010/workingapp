package p068X1;

import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import p071Y1.C0602a;

/* renamed from: X1.a */
/* loaded from: classes.dex */
public abstract class AbstractC0599a {
    static {
        char c3 = File.separatorChar;
        C0602a c0602a = new C0602a();
        PrintWriter printWriter = new PrintWriter(c0602a);
        try {
            printWriter.println();
            c0602a.toString();
            printWriter.close();
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                try {
                    printWriter.close();
                } catch (Throwable th3) {
                    th.addSuppressed(th3);
                }
                throw th2;
            }
        }
    }

    /* renamed from: a */
    public static void m1404a(Closeable closeable) throws IOException {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }
}
