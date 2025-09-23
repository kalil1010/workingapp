package p031L;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

/* renamed from: L.a */
/* loaded from: classes.dex */
public final class C0331a extends ClickableSpan {

    /* renamed from: a */
    public final int f1065a;

    /* renamed from: b */
    public final C0341k f1066b;

    /* renamed from: c */
    public final int f1067c;

    public C0331a(int i2, C0341k c0341k, int i3) {
        this.f1065a = i2;
        this.f1066b = c0341k;
        this.f1067c = i3;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f1065a);
        this.f1066b.f1085a.performAction(this.f1067c, bundle);
    }
}
