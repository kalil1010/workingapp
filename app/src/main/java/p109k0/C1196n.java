package p109k0;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;

/* renamed from: k0.n */
/* loaded from: classes.dex */
public final class C1196n extends Drawable.ConstantState {

    /* renamed from: a */
    public int f4866a;

    /* renamed from: b */
    public C1195m f4867b;

    /* renamed from: c */
    public ColorStateList f4868c;

    /* renamed from: d */
    public PorterDuff.Mode f4869d;

    /* renamed from: e */
    public boolean f4870e;

    /* renamed from: f */
    public Bitmap f4871f;

    /* renamed from: g */
    public ColorStateList f4872g;

    /* renamed from: h */
    public PorterDuff.Mode f4873h;

    /* renamed from: i */
    public int f4874i;

    /* renamed from: j */
    public boolean f4875j;

    /* renamed from: k */
    public boolean f4876k;

    /* renamed from: l */
    public Paint f4877l;

    @Override // android.graphics.drawable.Drawable.ConstantState
    public int getChangingConfigurations() {
        return this.f4866a;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        return new C1198p(this);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        return new C1198p(this);
    }
}
