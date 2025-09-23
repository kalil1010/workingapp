package p105j;

import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.widget.TextView;

/* renamed from: j.g0 */
/* loaded from: classes.dex */
public class C1093g0 extends AbstractC1099i0 {
    @Override // p105j.AbstractC1099i0
    /* renamed from: a */
    public void mo2707a(StaticLayout.Builder builder, TextView textView) {
        builder.setTextDirection((TextDirectionHeuristic) C1102j0.m2715e(textView, "getTextDirectionHeuristic", TextDirectionHeuristics.FIRSTSTRONG_LTR));
    }
}
