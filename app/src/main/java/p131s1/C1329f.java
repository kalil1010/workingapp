package p131s1;

import java.io.Serializable;
import java.util.regex.Pattern;

/* renamed from: s1.f */
/* loaded from: classes.dex */
public final class C1329f implements Serializable {

    /* renamed from: a */
    public final /* synthetic */ int f5649a;

    /* renamed from: b */
    public Object f5650b;

    public C1329f(int i2) {
        this.f5649a = i2;
        switch (i2) {
            case 1:
                Pattern patternCompile = Pattern.compile("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");
                AbstractC1326c.m3061d(patternCompile, "compile(pattern)");
                this.f5650b = patternCompile;
                break;
        }
    }

    public final String toString() {
        switch (this.f5649a) {
            case 0:
                return String.valueOf(this.f5650b);
            default:
                String string = ((Pattern) this.f5650b).toString();
                AbstractC1326c.m3061d(string, "nativePattern.toString()");
                return string;
        }
    }
}
