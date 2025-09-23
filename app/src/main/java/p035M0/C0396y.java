package p035M0;

import android.text.TextPaint;
import java.lang.ref.WeakReference;
import p018G0.C0162b;
import p018G0.C0166f;
import p046Q0.C0458d;

/* renamed from: M0.y */
/* loaded from: classes.dex */
public final class C0396y {

    /* renamed from: c */
    public float f1270c;

    /* renamed from: e */
    public final WeakReference f1272e;

    /* renamed from: f */
    public C0458d f1273f;

    /* renamed from: a */
    public final TextPaint f1268a = new TextPaint(1);

    /* renamed from: b */
    public final C0162b f1269b = new C0162b(1, this);

    /* renamed from: d */
    public boolean f1271d = true;

    public C0396y(C0166f c0166f) {
        this.f1272e = new WeakReference(null);
        this.f1272e = new WeakReference(c0166f);
    }

    /* renamed from: a */
    public final float m1076a(String str) {
        if (!this.f1271d) {
            return this.f1270c;
        }
        TextPaint textPaint = this.f1268a;
        this.f1270c = str == null ? 0.0f : textPaint.measureText((CharSequence) str, 0, str.length());
        if (str != null) {
            Math.abs(textPaint.getFontMetrics().ascent);
        }
        this.f1271d = false;
        return this.f1270c;
    }
}
