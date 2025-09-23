package p131s1;

import java.io.Serializable;

/* renamed from: s1.d */
/* loaded from: classes.dex */
public abstract class AbstractC1327d implements Serializable {
    public final String toString() {
        AbstractC1330g.f5651a.getClass();
        String string = getClass().getGenericInterfaces()[0].toString();
        if (string.startsWith("kotlin.jvm.functions.")) {
            string = string.substring(21);
        }
        AbstractC1326c.m3061d(string, "renderLambdaToString(this)");
        return string;
    }
}
