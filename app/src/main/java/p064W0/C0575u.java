package p064W0;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import java.util.WeakHashMap;
import p006C.AbstractC0069a;
import p009D.AbstractC0098a;
import p028K.AbstractC0241P;

/* renamed from: W0.u */
/* loaded from: classes.dex */
public final class C0575u extends ArrayAdapter {

    /* renamed from: a */
    public ColorStateList f1841a;

    /* renamed from: b */
    public ColorStateList f1842b;

    /* renamed from: c */
    public final /* synthetic */ C0576v f1843c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0575u(C0576v c0576v, Context context, int i2, String[] strArr) {
        super(context, i2, strArr);
        this.f1843c = c0576v;
        m1384a();
    }

    /* renamed from: a */
    public final void m1384a() {
        ColorStateList colorStateList;
        C0576v c0576v = this.f1843c;
        ColorStateList colorStateList2 = c0576v.f1851l;
        ColorStateList colorStateList3 = null;
        if (colorStateList2 != null) {
            int[] iArr = {R.attr.state_pressed};
            colorStateList = new ColorStateList(new int[][]{iArr, new int[0]}, new int[]{colorStateList2.getColorForState(iArr, 0), 0});
        } else {
            colorStateList = null;
        }
        this.f1842b = colorStateList;
        if (c0576v.f1850k != 0 && c0576v.f1851l != null) {
            int[] iArr2 = {R.attr.state_hovered, -16842919};
            int[] iArr3 = {R.attr.state_selected, -16842919};
            colorStateList3 = new ColorStateList(new int[][]{iArr3, iArr2, new int[0]}, new int[]{AbstractC0069a.m193b(c0576v.f1851l.getColorForState(iArr3, 0), c0576v.f1850k), AbstractC0069a.m193b(c0576v.f1851l.getColorForState(iArr2, 0), c0576v.f1850k), c0576v.f1850k});
        }
        this.f1841a = colorStateList3;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int i2, View view, ViewGroup viewGroup) {
        View view2 = super.getView(i2, view, viewGroup);
        if (view2 instanceof TextView) {
            TextView textView = (TextView) view2;
            C0576v c0576v = this.f1843c;
            Drawable rippleDrawable = null;
            if (c0576v.getText().toString().contentEquals(textView.getText()) && c0576v.f1850k != 0) {
                ColorDrawable colorDrawable = new ColorDrawable(c0576v.f1850k);
                if (this.f1842b != null) {
                    AbstractC0098a.m300h(colorDrawable, this.f1841a);
                    rippleDrawable = new RippleDrawable(this.f1842b, colorDrawable, null);
                } else {
                    rippleDrawable = colorDrawable;
                }
            }
            WeakHashMap weakHashMap = AbstractC0241P.f815a;
            textView.setBackground(rippleDrawable);
        }
        return view2;
    }
}
