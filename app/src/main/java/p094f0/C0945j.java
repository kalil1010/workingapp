package p094f0;

import android.R;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import nfc.share.nfcshare.MainActivity;

/* renamed from: f0.j */
/* loaded from: classes.dex */
public final class C0945j extends AbstractC0908G {

    /* renamed from: d */
    public static final int[] f3926d = {R.attr.listDivider};

    /* renamed from: a */
    public Drawable f3927a;

    /* renamed from: b */
    public final int f3928b;

    /* renamed from: c */
    public final Rect f3929c = new Rect();

    public C0945j(MainActivity mainActivity) {
        TypedArray typedArrayObtainStyledAttributes = mainActivity.obtainStyledAttributes(f3926d);
        this.f3927a = typedArrayObtainStyledAttributes.getDrawable(0);
        typedArrayObtainStyledAttributes.recycle();
        this.f3928b = 1;
    }

    @Override // p094f0.AbstractC0908G
    /* renamed from: a */
    public final void mo2340a(Rect rect, View view) {
        Drawable drawable = this.f3927a;
        if (drawable == null) {
            rect.set(0, 0, 0, 0);
        } else if (this.f3928b == 1) {
            rect.set(0, 0, 0, drawable.getIntrinsicHeight());
        } else {
            rect.set(0, 0, drawable.getIntrinsicWidth(), 0);
        }
    }

    @Override // p094f0.AbstractC0908G
    /* renamed from: b */
    public final void mo2082b(Canvas canvas, RecyclerView recyclerView) {
        int height;
        int paddingTop;
        int width;
        int paddingLeft;
        if (recyclerView.getLayoutManager() == null || this.f3927a == null) {
            return;
        }
        int i2 = this.f3928b;
        Rect rect = this.f3929c;
        int i3 = 0;
        if (i2 == 1) {
            canvas.save();
            if (recyclerView.getClipToPadding()) {
                paddingLeft = recyclerView.getPaddingLeft();
                width = recyclerView.getWidth() - recyclerView.getPaddingRight();
                canvas.clipRect(paddingLeft, recyclerView.getPaddingTop(), width, recyclerView.getHeight() - recyclerView.getPaddingBottom());
            } else {
                width = recyclerView.getWidth();
                paddingLeft = 0;
            }
            int childCount = recyclerView.getChildCount();
            while (i3 < childCount) {
                View childAt = recyclerView.getChildAt(i3);
                RecyclerView.m1877J(rect, childAt);
                int iRound = Math.round(childAt.getTranslationY()) + rect.bottom;
                this.f3927a.setBounds(paddingLeft, iRound - this.f3927a.getIntrinsicHeight(), width, iRound);
                this.f3927a.draw(canvas);
                i3++;
            }
            canvas.restore();
            return;
        }
        canvas.save();
        if (recyclerView.getClipToPadding()) {
            paddingTop = recyclerView.getPaddingTop();
            height = recyclerView.getHeight() - recyclerView.getPaddingBottom();
            canvas.clipRect(recyclerView.getPaddingLeft(), paddingTop, recyclerView.getWidth() - recyclerView.getPaddingRight(), height);
        } else {
            height = recyclerView.getHeight();
            paddingTop = 0;
        }
        int childCount2 = recyclerView.getChildCount();
        while (i3 < childCount2) {
            View childAt2 = recyclerView.getChildAt(i3);
            recyclerView.getLayoutManager().mo2073y(rect, childAt2);
            int iRound2 = Math.round(childAt2.getTranslationX()) + rect.right;
            this.f3927a.setBounds(iRound2 - this.f3927a.getIntrinsicWidth(), paddingTop, iRound2, height);
            this.f3927a.draw(canvas);
            i3++;
        }
        canvas.restore();
    }
}
