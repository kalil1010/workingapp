package p094f0;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.ViewGroup;

/* renamed from: f0.K */
/* loaded from: classes.dex */
public class C0912K extends ViewGroup.MarginLayoutParams {

    /* renamed from: a */
    public AbstractC0926Z f3767a;

    /* renamed from: b */
    public final Rect f3768b;

    /* renamed from: c */
    public boolean f3769c;

    /* renamed from: d */
    public boolean f3770d;

    public C0912K(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f3768b = new Rect();
        this.f3769c = true;
        this.f3770d = false;
    }

    public C0912K(int i2, int i3) {
        super(i2, i3);
        this.f3768b = new Rect();
        this.f3769c = true;
        this.f3770d = false;
    }

    public C0912K(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.f3768b = new Rect();
        this.f3769c = true;
        this.f3770d = false;
    }

    public C0912K(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.f3768b = new Rect();
        this.f3769c = true;
        this.f3770d = false;
    }

    public C0912K(C0912K c0912k) {
        super((ViewGroup.LayoutParams) c0912k);
        this.f3768b = new Rect();
        this.f3769c = true;
        this.f3770d = false;
    }
}
