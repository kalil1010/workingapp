package p105j;

import android.text.StaticLayout;
import android.widget.TextView;

/* renamed from: j.h0 */
/* loaded from: classes.dex */
public final class C1096h0 extends C1093g0 {
    @Override // p105j.C1093g0, p105j.AbstractC1099i0
    /* renamed from: a */
    public void mo2707a(StaticLayout.Builder builder, TextView textView) {
        builder.setTextDirection(textView.getTextDirectionHeuristic());
    }

    @Override // p105j.AbstractC1099i0
    /* renamed from: b */
    public boolean mo2712b(TextView textView) {
        return textView.isHorizontallyScrollable();
    }
}
