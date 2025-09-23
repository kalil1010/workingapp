package p105j;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageButton;
import android.widget.ImageView;
import p003B.C0048d;
import p011D1.C0118h;
import p093e2.AbstractC0901d;
import p094f0.C0929b;

/* renamed from: j.x */
/* loaded from: classes.dex */
public class C1140x extends ImageButton {

    /* renamed from: a */
    public final C0929b f4663a;

    /* renamed from: b */
    public final C0048d f4664b;

    /* renamed from: c */
    public boolean f4665c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1140x(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        AbstractC1082c1.m2702a(context);
        this.f4665c = false;
        AbstractC1079b1.m2695a(this, getContext());
        C0929b c0929b = new C0929b(this);
        this.f4663a = c0929b;
        c0929b.m2420k(attributeSet, i2);
        C0048d c0048d = new C0048d(this);
        this.f4664b = c0048d;
        c0048d.m179d(attributeSet, i2);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0929b c0929b = this.f4663a;
        if (c0929b != null) {
            c0929b.m2410a();
        }
        C0048d c0048d = this.f4664b;
        if (c0048d != null) {
            c0048d.m177a();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0929b c0929b = this.f4663a;
        if (c0929b != null) {
            return c0929b.m2417h();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0929b c0929b = this.f4663a;
        if (c0929b != null) {
            return c0929b.m2418i();
        }
        return null;
    }

    public ColorStateList getSupportImageTintList() {
        C0118h c0118h;
        C0048d c0048d = this.f4664b;
        if (c0048d == null || (c0118h = (C0118h) c0048d.f117d) == null) {
            return null;
        }
        return (ColorStateList) c0118h.f331c;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        C0118h c0118h;
        C0048d c0048d = this.f4664b;
        if (c0048d == null || (c0118h = (C0118h) c0048d.f117d) == null) {
            return null;
        }
        return (PorterDuff.Mode) c0118h.f332d;
    }

    @Override // android.widget.ImageView, android.view.View
    public final boolean hasOverlappingRendering() {
        return !(((ImageView) this.f4664b.f116c).getBackground() instanceof RippleDrawable) && super.hasOverlappingRendering();
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0929b c0929b = this.f4663a;
        if (c0929b != null) {
            c0929b.m2422m();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i2) {
        super.setBackgroundResource(i2);
        C0929b c0929b = this.f4663a;
        if (c0929b != null) {
            c0929b.m2423n(i2);
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        C0048d c0048d = this.f4664b;
        if (c0048d != null) {
            c0048d.m177a();
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        C0048d c0048d = this.f4664b;
        if (c0048d != null && drawable != null && !this.f4665c) {
            c0048d.f115b = drawable.getLevel();
        }
        super.setImageDrawable(drawable);
        if (c0048d != null) {
            c0048d.m177a();
            if (this.f4665c) {
                return;
            }
            ImageView imageView = (ImageView) c0048d.f116c;
            if (imageView.getDrawable() != null) {
                imageView.getDrawable().setLevel(c0048d.f115b);
            }
        }
    }

    @Override // android.widget.ImageView
    public void setImageLevel(int i2) {
        super.setImageLevel(i2);
        this.f4665c = true;
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i2) {
        C0048d c0048d = this.f4664b;
        ImageView imageView = (ImageView) c0048d.f116c;
        if (i2 != 0) {
            Drawable drawableM2321x = AbstractC0901d.m2321x(imageView.getContext(), i2);
            if (drawableM2321x != null) {
                AbstractC1117o0.m2732a(drawableM2321x);
            }
            imageView.setImageDrawable(drawableM2321x);
        } else {
            imageView.setImageDrawable(null);
        }
        c0048d.m177a();
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        C0048d c0048d = this.f4664b;
        if (c0048d != null) {
            c0048d.m177a();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0929b c0929b = this.f4663a;
        if (c0929b != null) {
            c0929b.m2428s(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0929b c0929b = this.f4663a;
        if (c0929b != null) {
            c0929b.m2429t(mode);
        }
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        C0048d c0048d = this.f4664b;
        if (c0048d != null) {
            if (((C0118h) c0048d.f117d) == null) {
                c0048d.f117d = new C0118h();
            }
            C0118h c0118h = (C0118h) c0048d.f117d;
            c0118h.f331c = colorStateList;
            c0118h.f330b = true;
            c0048d.m177a();
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        C0048d c0048d = this.f4664b;
        if (c0048d != null) {
            if (((C0118h) c0048d.f117d) == null) {
                c0048d.f117d = new C0118h();
            }
            C0118h c0118h = (C0118h) c0048d.f117d;
            c0118h.f332d = mode;
            c0118h.f329a = true;
            c0048d.m177a();
        }
    }
}
