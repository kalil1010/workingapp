package p004B0;

import android.content.res.Resources;
import android.graphics.Rect;
import android.view.View;
import androidx.appcompat.widget.SearchView;
import p105j.AbstractC1133t1;
import tkbmmn.ghwbbf.irvjzy.R;

/* renamed from: B0.a */
/* loaded from: classes.dex */
public final class ViewOnLayoutChangeListenerC0062a implements View.OnLayoutChangeListener {

    /* renamed from: a */
    public final /* synthetic */ int f151a;

    /* renamed from: b */
    public final /* synthetic */ Object f152b;

    public /* synthetic */ ViewOnLayoutChangeListenerC0062a(int i2, Object obj) {
        this.f151a = i2;
        this.f152b = obj;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        switch (this.f151a) {
            case 0:
                throw null;
            default:
                SearchView searchView = (SearchView) this.f152b;
                View view2 = searchView.f2193x;
                if (view2.getWidth() > 1) {
                    Resources resources = searchView.getContext().getResources();
                    int paddingLeft = searchView.f2187r.getPaddingLeft();
                    Rect rect = new Rect();
                    boolean zM2754a = AbstractC1133t1.m2754a(searchView);
                    int dimensionPixelSize = searchView.f2168M ? resources.getDimensionPixelSize(R.dimen.abc_dropdownitem_text_padding_left) + resources.getDimensionPixelSize(R.dimen.abc_dropdownitem_icon_width) : 0;
                    SearchView.SearchAutoComplete searchAutoComplete = searchView.f2185p;
                    searchAutoComplete.getDropDownBackground().getPadding(rect);
                    searchAutoComplete.setDropDownHorizontalOffset(zM2754a ? -rect.left : paddingLeft - (rect.left + dimensionPixelSize));
                    searchAutoComplete.setDropDownWidth((((view2.getWidth() + rect.left) + rect.right) + dimensionPixelSize) - paddingLeft);
                    return;
                }
                return;
        }
    }
}
