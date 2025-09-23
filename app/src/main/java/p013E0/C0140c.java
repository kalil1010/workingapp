package p013E0;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.carousel.CarouselLayoutManager;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import p006C.AbstractC0069a;
import p094f0.AbstractC0908G;
import tkbmmn.ghwbbf.irvjzy.R;

/* renamed from: E0.c */
/* loaded from: classes.dex */
public final class C0140c extends AbstractC0908G {

    /* renamed from: a */
    public final Paint f486a;

    /* renamed from: b */
    public final List f487b;

    public C0140c() {
        Paint paint = new Paint();
        this.f486a = paint;
        this.f487b = Collections.unmodifiableList(new ArrayList());
        paint.setStrokeWidth(5.0f);
        paint.setColor(-65281);
    }

    @Override // p094f0.AbstractC0908G
    /* renamed from: c */
    public final void mo384c(Canvas canvas, RecyclerView recyclerView) {
        Canvas canvas2;
        int iM2356E;
        int iM2357F;
        int iM2358G;
        int iM2355D;
        Paint paint = this.f486a;
        paint.setStrokeWidth(recyclerView.getResources().getDimension(R.dimen.m3_carousel_debug_keyline_width));
        Iterator it = this.f487b.iterator();
        while (it.hasNext()) {
            ((AbstractC0142e) it.next()).getClass();
            ThreadLocal threadLocal = AbstractC0069a.f170a;
            float f = 1.0f - 0.0f;
            paint.setColor(Color.argb((int) ((Color.alpha(-16776961) * 0.0f) + (Color.alpha(-65281) * f)), (int) ((Color.red(-16776961) * 0.0f) + (Color.red(-65281) * f)), (int) ((Color.green(-16776961) * 0.0f) + (Color.green(-65281) * f)), (int) ((Color.blue(-16776961) * 0.0f) + (Color.blue(-65281) * f))));
            if (((CarouselLayoutManager) recyclerView.getLayoutManager()).m2068A0()) {
                C0141d c0141d = ((CarouselLayoutManager) recyclerView.getLayoutManager()).f3136q;
                switch (c0141d.f489b) {
                    case 0:
                        iM2358G = 0;
                        break;
                    default:
                        iM2358G = c0141d.f490c.m2358G();
                        break;
                }
                float f2 = iM2358G;
                C0141d c0141d2 = ((CarouselLayoutManager) recyclerView.getLayoutManager()).f3136q;
                switch (c0141d2.f489b) {
                    case 0:
                        iM2355D = c0141d2.f490c.f3766o;
                        break;
                    default:
                        CarouselLayoutManager carouselLayoutManager = c0141d2.f490c;
                        iM2355D = carouselLayoutManager.f3766o - carouselLayoutManager.m2355D();
                        break;
                }
                canvas2 = canvas;
                canvas2.drawLine(0.0f, f2, 0.0f, iM2355D, paint);
            } else {
                canvas2 = canvas;
                C0141d c0141d3 = ((CarouselLayoutManager) recyclerView.getLayoutManager()).f3136q;
                switch (c0141d3.f489b) {
                    case 0:
                        iM2356E = c0141d3.f490c.m2356E();
                        break;
                    default:
                        iM2356E = 0;
                        break;
                }
                float f3 = iM2356E;
                C0141d c0141d4 = ((CarouselLayoutManager) recyclerView.getLayoutManager()).f3136q;
                switch (c0141d4.f489b) {
                    case 0:
                        CarouselLayoutManager carouselLayoutManager2 = c0141d4.f490c;
                        iM2357F = carouselLayoutManager2.f3765n - carouselLayoutManager2.m2357F();
                        break;
                    default:
                        iM2357F = c0141d4.f490c.f3765n;
                        break;
                }
                canvas2.drawLine(f3, 0.0f, iM2357F, 0.0f, paint);
            }
            canvas = canvas2;
        }
    }
}
