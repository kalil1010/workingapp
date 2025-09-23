package p007C0;

import android.graphics.Typeface;
import android.view.View;
import android.widget.TextView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* renamed from: C0.b */
/* loaded from: classes.dex */
public final class RunnableC0084b implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f197a = 1;

    /* renamed from: b */
    public final /* synthetic */ int f198b;

    /* renamed from: c */
    public final /* synthetic */ View f199c;

    /* renamed from: d */
    public final /* synthetic */ Object f200d;

    public RunnableC0084b(TextView textView, Typeface typeface, int i2) {
        this.f199c = textView;
        this.f200d = typeface;
        this.f198b = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f197a) {
            case 0:
                ((BottomSheetBehavior) this.f200d).m2047I(this.f199c, this.f198b, false);
                break;
            default:
                ((TextView) this.f199c).setTypeface((Typeface) this.f200d, this.f198b);
                break;
        }
    }

    public RunnableC0084b(BottomSheetBehavior bottomSheetBehavior, View view, int i2) {
        this.f200d = bottomSheetBehavior;
        this.f199c = view;
        this.f198b = i2;
    }
}
