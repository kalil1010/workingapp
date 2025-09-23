package p073Z0;

import java.io.IOException;
import java.io.StringWriter;
import p084c1.AbstractC0806q;
import p084c1.C0796g;
import p084c1.C0803n;
import p101h1.C0988b;

/* renamed from: Z0.f */
/* loaded from: classes.dex */
public abstract class AbstractC0610f {
    public final String toString() {
        try {
            StringWriter stringWriter = new StringWriter();
            C0988b c0988b = new C0988b(stringWriter);
            c0988b.f4160e = true;
            C0803n c0803n = AbstractC0806q.f2992a;
            C0796g.m2003d(c0988b, this);
            return stringWriter.toString();
        } catch (IOException e3) {
            throw new AssertionError(e3);
        }
    }
}
