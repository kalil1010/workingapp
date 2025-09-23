package p105j;

import android.os.Handler;
import android.widget.AbsListView;

/* renamed from: j.E0 */
/* loaded from: classes.dex */
public final class C1032E0 implements AbsListView.OnScrollListener {

    /* renamed from: a */
    public final /* synthetic */ C1034F0 f4347a;

    public C1032E0(C1034F0 c1034f0) {
        this.f4347a = c1034f0;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScroll(AbsListView absListView, int i2, int i3, int i4) {
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScrollStateChanged(AbsListView absListView, int i2) {
        if (i2 == 1) {
            C1034F0 c1034f0 = this.f4347a;
            if (c1034f0.f4376z.getInputMethodMode() == 2 || c1034f0.f4376z.getContentView() == null) {
                return;
            }
            Handler handler = c1034f0.f4372v;
            RunnableC1030D0 runnableC1030D0 = c1034f0.f4368r;
            handler.removeCallbacks(runnableC1030D0);
            runnableC1030D0.run();
        }
    }
}
