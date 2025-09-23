package p109k0;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p001A0.C0002a;
import p009D.AbstractC0098a;
import p033L1.AbstractC0356d;

/* renamed from: k0.f */
/* loaded from: classes.dex */
public final class C1188f extends AbstractC1189g implements Animatable {

    /* renamed from: c */
    public final Context f4820c;

    /* renamed from: d */
    public C0002a f4821d = null;

    /* renamed from: e */
    public ArrayList f4822e = null;

    /* renamed from: f */
    public final C1185c f4823f = new C1185c(this);

    /* renamed from: b */
    public final C1186d f4819b = new C1186d();

    public C1188f(Context context) {
        this.f4820c = context;
    }

    @Override // p109k0.AbstractC1189g, android.graphics.drawable.Drawable
    public final void applyTheme(Resources.Theme theme) {
        Drawable drawable = this.f4824a;
        if (drawable != null) {
            AbstractC0098a.m293a(drawable, theme);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        Drawable drawable = this.f4824a;
        if (drawable != null) {
            return AbstractC0098a.m294b(drawable);
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Drawable drawable = this.f4824a;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        C1186d c1186d = this.f4819b;
        c1186d.f4814a.draw(canvas);
        if (c1186d.f4815b.isStarted()) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        Drawable drawable = this.f4824a;
        return drawable != null ? drawable.getAlpha() : this.f4819b.f4814a.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        Drawable drawable = this.f4824a;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        int changingConfigurations = super.getChangingConfigurations();
        this.f4819b.getClass();
        return changingConfigurations;
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        Drawable drawable = this.f4824a;
        return drawable != null ? AbstractC0098a.m295c(drawable) : this.f4819b.f4814a.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (this.f4824a != null) {
            return new C1187e(this.f4824a.getConstantState());
        }
        return null;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        Drawable drawable = this.f4824a;
        return drawable != null ? drawable.getIntrinsicHeight() : this.f4819b.f4814a.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        Drawable drawable = this.f4824a;
        return drawable != null ? drawable.getIntrinsicWidth() : this.f4819b.f4814a.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.f4824a;
        return drawable != null ? drawable.getOpacity() : this.f4819b.f4814a.getOpacity();
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x00ca, code lost:
    
        if (r3.f4815b != null) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00cc, code lost:
    
        r3.f4815b = new android.animation.AnimatorSet();
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00d3, code lost:
    
        r3.f4815b.playTogether(r3.f4816c);
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00da, code lost:
    
        return;
     */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void inflate(android.content.res.Resources r10, org.xmlpull.v1.XmlPullParser r11, android.util.AttributeSet r12, android.content.res.Resources.Theme r13) throws org.xmlpull.v1.XmlPullParserException, android.content.res.Resources.NotFoundException, java.io.IOException {
        /*
            r9 = this;
            android.graphics.drawable.Drawable r0 = r9.f4824a
            if (r0 == 0) goto L8
            p009D.AbstractC0098a.m296d(r0, r10, r11, r12, r13)
            return
        L8:
            int r0 = r11.getEventType()
            int r1 = r11.getDepth()
            r2 = 1
            int r1 = r1 + r2
        L12:
            k0.d r3 = r9.f4819b
            if (r0 == r2) goto Lc8
            int r4 = r11.getDepth()
            if (r4 >= r1) goto L1f
            r4 = 3
            if (r0 == r4) goto Lc8
        L1f:
            r4 = 2
            if (r0 != r4) goto Lc2
            java.lang.String r0 = r11.getName()
            java.lang.String r4 = "animated-vector"
            boolean r4 = r4.equals(r0)
            r5 = 0
            r6 = 0
            if (r4 == 0) goto L68
            int[] r0 = p109k0.AbstractC1183a.f4810e
            android.content.res.TypedArray r0 = p003B.AbstractC0046b.m166f(r10, r13, r12, r0)
            int r4 = r0.getResourceId(r6, r6)
            if (r4 == 0) goto L64
            k0.p r7 = new k0.p
            r7.<init>()
            java.lang.ThreadLocal r8 = p003B.AbstractC0060p.f137a
            android.graphics.drawable.Drawable r4 = p003B.AbstractC0054j.m181a(r10, r4, r13)
            r7.f4824a = r4
            k0.o r4 = new k0.o
            android.graphics.drawable.Drawable r8 = r7.f4824a
            android.graphics.drawable.Drawable$ConstantState r8 = r8.getConstantState()
            r4.<init>(r8)
            r7.f4884f = r6
            k0.c r4 = r9.f4823f
            r7.setCallback(r4)
            k0.p r4 = r3.f4814a
            if (r4 == 0) goto L62
            r4.setCallback(r5)
        L62:
            r3.f4814a = r7
        L64:
            r0.recycle()
            goto Lc2
        L68:
            java.lang.String r4 = "target"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto Lc2
            int[] r0 = p109k0.AbstractC1183a.f4811f
            android.content.res.TypedArray r0 = r10.obtainAttributes(r12, r0)
            java.lang.String r4 = r0.getString(r6)
            int r6 = r0.getResourceId(r2, r6)
            if (r6 == 0) goto Lbf
            android.content.Context r7 = r9.f4820c
            if (r7 == 0) goto Lb4
            android.animation.Animator r6 = android.animation.AnimatorInflater.loadAnimator(r7, r6)
            k0.p r7 = r3.f4814a
            k0.n r7 = r7.f4880b
            k0.m r7 = r7.f4867b
            o.b r7 = r7.f4865o
            java.lang.Object r5 = r7.getOrDefault(r4, r5)
            r6.setTarget(r5)
            java.util.ArrayList r5 = r3.f4816c
            if (r5 != 0) goto La9
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            r3.f4816c = r5
            o.b r5 = new o.b
            r5.<init>()
            r3.f4817d = r5
        La9:
            java.util.ArrayList r5 = r3.f4816c
            r5.add(r6)
            o.b r3 = r3.f4817d
            r3.put(r6, r4)
            goto Lbf
        Lb4:
            r0.recycle()
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "Context can't be null when inflating animators"
            r10.<init>(r11)
            throw r10
        Lbf:
            r0.recycle()
        Lc2:
            int r0 = r11.next()
            goto L12
        Lc8:
            android.animation.AnimatorSet r10 = r3.f4815b
            if (r10 != 0) goto Ld3
            android.animation.AnimatorSet r10 = new android.animation.AnimatorSet
            r10.<init>()
            r3.f4815b = r10
        Ld3:
            android.animation.AnimatorSet r10 = r3.f4815b
            java.util.ArrayList r11 = r3.f4816c
            r10.playTogether(r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p109k0.C1188f.inflate(android.content.res.Resources, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.content.res.Resources$Theme):void");
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        Drawable drawable = this.f4824a;
        return drawable != null ? drawable.isAutoMirrored() : this.f4819b.f4814a.isAutoMirrored();
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        Drawable drawable = this.f4824a;
        return drawable != null ? ((AnimatedVectorDrawable) drawable).isRunning() : this.f4819b.f4815b.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        Drawable drawable = this.f4824a;
        return drawable != null ? drawable.isStateful() : this.f4819b.f4814a.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        Drawable drawable = this.f4824a;
        if (drawable != null) {
            drawable.mutate();
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f4824a;
        if (drawable != null) {
            drawable.setBounds(rect);
        } else {
            this.f4819b.f4814a.setBounds(rect);
        }
    }

    @Override // p109k0.AbstractC1189g, android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i2) {
        Drawable drawable = this.f4824a;
        return drawable != null ? drawable.setLevel(i2) : this.f4819b.f4814a.setLevel(i2);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f4824a;
        return drawable != null ? drawable.setState(iArr) : this.f4819b.f4814a.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i2) {
        Drawable drawable = this.f4824a;
        if (drawable != null) {
            drawable.setAlpha(i2);
        } else {
            this.f4819b.f4814a.setAlpha(i2);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z2) {
        Drawable drawable = this.f4824a;
        if (drawable != null) {
            drawable.setAutoMirrored(z2);
        } else {
            this.f4819b.f4814a.setAutoMirrored(z2);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f4824a;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f4819b.f4814a.setColorFilter(colorFilter);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i2) {
        Drawable drawable = this.f4824a;
        if (drawable != null) {
            AbstractC0356d.m947H(drawable, i2);
        } else {
            this.f4819b.f4814a.setTint(i2);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f4824a;
        if (drawable != null) {
            AbstractC0098a.m300h(drawable, colorStateList);
        } else {
            this.f4819b.f4814a.setTintList(colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f4824a;
        if (drawable != null) {
            AbstractC0098a.m301i(drawable, mode);
        } else {
            this.f4819b.f4814a.setTintMode(mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z2, boolean z3) {
        Drawable drawable = this.f4824a;
        if (drawable != null) {
            return drawable.setVisible(z2, z3);
        }
        this.f4819b.f4814a.setVisible(z2, z3);
        return super.setVisible(z2, z3);
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        Drawable drawable = this.f4824a;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).start();
            return;
        }
        C1186d c1186d = this.f4819b;
        if (c1186d.f4815b.isStarted()) {
            return;
        }
        c1186d.f4815b.start();
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        Drawable drawable = this.f4824a;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).stop();
        } else {
            this.f4819b.f4815b.end();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, Resources.NotFoundException, IOException {
        inflate(resources, xmlPullParser, attributeSet, null);
    }
}
