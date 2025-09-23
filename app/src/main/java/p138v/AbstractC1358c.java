package p138v;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.Arrays;
import java.util.HashMap;
import p129s.AbstractC1320i;
import p129s.C1315d;

/* renamed from: v.c */
/* loaded from: classes.dex */
public abstract class AbstractC1358c extends View {

    /* renamed from: a */
    public int[] f5762a;

    /* renamed from: b */
    public int f5763b;

    /* renamed from: c */
    public Context f5764c;

    /* renamed from: d */
    public AbstractC1320i f5765d;

    /* renamed from: e */
    public String f5766e;

    /* renamed from: f */
    public String f5767f;

    /* renamed from: g */
    public HashMap f5768g;

    /* JADX WARN: Removed duplicated region for block: B:29:0x005a  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m3116a(java.lang.String r6) throws java.lang.IllegalAccessException, java.lang.IllegalArgumentException {
        /*
            r5 = this;
            if (r6 == 0) goto L8d
            int r0 = r6.length()
            if (r0 != 0) goto La
            goto L8d
        La:
            android.content.Context r0 = r5.f5764c
            if (r0 != 0) goto L10
            goto L8d
        L10:
            java.lang.String r6 = r6.trim()
            android.view.ViewParent r1 = r5.getParent()
            boolean r1 = r1 instanceof androidx.constraintlayout.widget.ConstraintLayout
            if (r1 == 0) goto L22
            android.view.ViewParent r1 = r5.getParent()
            androidx.constraintlayout.widget.ConstraintLayout r1 = (androidx.constraintlayout.widget.ConstraintLayout) r1
        L22:
            android.view.ViewParent r1 = r5.getParent()
            boolean r1 = r1 instanceof androidx.constraintlayout.widget.ConstraintLayout
            r2 = 0
            if (r1 == 0) goto L32
            android.view.ViewParent r1 = r5.getParent()
            androidx.constraintlayout.widget.ConstraintLayout r1 = (androidx.constraintlayout.widget.ConstraintLayout) r1
            goto L33
        L32:
            r1 = r2
        L33:
            boolean r3 = r5.isInEditMode()
            if (r3 == 0) goto L5a
            if (r1 == 0) goto L5a
            if (r6 == 0) goto L4e
            java.util.HashMap r3 = r1.f2271m
            if (r3 == 0) goto L4e
            boolean r3 = r3.containsKey(r6)
            if (r3 == 0) goto L4e
            java.util.HashMap r3 = r1.f2271m
            java.lang.Object r3 = r3.get(r6)
            goto L4f
        L4e:
            r3 = r2
        L4f:
            boolean r4 = r3 instanceof java.lang.Integer
            if (r4 == 0) goto L5a
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            goto L5b
        L5a:
            r3 = 0
        L5b:
            if (r3 != 0) goto L63
            if (r1 == 0) goto L63
            int r3 = r5.m3121f(r1, r6)
        L63:
            if (r3 != 0) goto L6f
            java.lang.Class<v.p> r1 = p138v.AbstractC1371p.class
            java.lang.reflect.Field r1 = r1.getField(r6)     // Catch: java.lang.Exception -> L6f
            int r3 = r1.getInt(r2)     // Catch: java.lang.Exception -> L6f
        L6f:
            if (r3 != 0) goto L7f
            android.content.res.Resources r1 = r0.getResources()
            java.lang.String r2 = "id"
            java.lang.String r0 = r0.getPackageName()
            int r3 = r1.getIdentifier(r6, r2, r0)
        L7f:
            if (r3 == 0) goto L8d
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            java.util.HashMap r1 = r5.f5768g
            r1.put(r0, r6)
            r5.m3117b(r3)
        L8d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p138v.AbstractC1358c.m3116a(java.lang.String):void");
    }

    /* renamed from: b */
    public final void m3117b(int i2) {
        if (i2 == getId()) {
            return;
        }
        int i3 = this.f5763b + 1;
        int[] iArr = this.f5762a;
        if (i3 > iArr.length) {
            this.f5762a = Arrays.copyOf(iArr, iArr.length * 2);
        }
        int[] iArr2 = this.f5762a;
        int i4 = this.f5763b;
        iArr2[i4] = i2;
        this.f5763b = i4 + 1;
    }

    /* renamed from: c */
    public final void m3118c(String str) {
        if (str == null || str.length() == 0 || this.f5764c == null) {
            return;
        }
        String strTrim = str.trim();
        ConstraintLayout constraintLayout = getParent() instanceof ConstraintLayout ? (ConstraintLayout) getParent() : null;
        if (constraintLayout == null) {
            return;
        }
        int childCount = constraintLayout.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = constraintLayout.getChildAt(i2);
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            if ((layoutParams instanceof C1360e) && strTrim.equals(((C1360e) layoutParams).f5794Y) && childAt.getId() != -1) {
                m3117b(childAt.getId());
            }
        }
    }

    /* renamed from: d */
    public final void m3119d(ConstraintLayout constraintLayout) {
        int visibility = getVisibility();
        float elevation = getElevation();
        for (int i2 = 0; i2 < this.f5763b; i2++) {
            View view = (View) constraintLayout.f2259a.get(this.f5762a[i2]);
            if (view != null) {
                view.setVisibility(visibility);
                if (elevation > 0.0f) {
                    view.setTranslationZ(view.getTranslationZ() + elevation);
                }
            }
        }
    }

    /* renamed from: e */
    public void mo3120e(ConstraintLayout constraintLayout) {
    }

    /* renamed from: f */
    public final int m3121f(ConstraintLayout constraintLayout, String str) {
        Resources resources;
        String resourceEntryName;
        if (str != null && (resources = this.f5764c.getResources()) != null) {
            int childCount = constraintLayout.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = constraintLayout.getChildAt(i2);
                if (childAt.getId() != -1) {
                    try {
                        resourceEntryName = resources.getResourceEntryName(childAt.getId());
                    } catch (Resources.NotFoundException unused) {
                        resourceEntryName = null;
                    }
                    if (str.equals(resourceEntryName)) {
                        return childAt.getId();
                    }
                }
            }
        }
        return 0;
    }

    /* renamed from: g */
    public void mo3122g(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, AbstractC1372q.f5972b);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i2);
                if (index == 35) {
                    String string = typedArrayObtainStyledAttributes.getString(index);
                    this.f5766e = string;
                    setIds(string);
                } else if (index == 36) {
                    String string2 = typedArrayObtainStyledAttributes.getString(index);
                    this.f5767f = string2;
                    setReferenceTags(string2);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public int[] getReferencedIds() {
        return Arrays.copyOf(this.f5762a, this.f5763b);
    }

    /* renamed from: h */
    public abstract void mo1541h(C1315d c1315d, boolean z2);

    /* renamed from: i */
    public final void m3123i() {
        if (this.f5765d == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams instanceof C1360e) {
            ((C1360e) layoutParams).f5827p0 = this.f5765d;
        }
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        String str = this.f5766e;
        if (str != null) {
            setIds(str);
        }
        String str2 = this.f5767f;
        if (str2 != null) {
            setReferenceTags(str2);
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
    }

    @Override // android.view.View
    public void onMeasure(int i2, int i3) {
        setMeasuredDimension(0, 0);
    }

    public void setIds(String str) {
        this.f5766e = str;
        if (str == null) {
            return;
        }
        int i2 = 0;
        this.f5763b = 0;
        while (true) {
            int iIndexOf = str.indexOf(44, i2);
            if (iIndexOf == -1) {
                m3116a(str.substring(i2));
                return;
            } else {
                m3116a(str.substring(i2, iIndexOf));
                i2 = iIndexOf + 1;
            }
        }
    }

    public void setReferenceTags(String str) {
        this.f5767f = str;
        if (str == null) {
            return;
        }
        int i2 = 0;
        this.f5763b = 0;
        while (true) {
            int iIndexOf = str.indexOf(44, i2);
            if (iIndexOf == -1) {
                m3118c(str.substring(i2));
                return;
            } else {
                m3118c(str.substring(i2, iIndexOf));
                i2 = iIndexOf + 1;
            }
        }
    }

    public void setReferencedIds(int[] iArr) {
        this.f5766e = null;
        this.f5763b = 0;
        for (int i2 : iArr) {
            m3117b(i2);
        }
    }

    @Override // android.view.View
    public final void setTag(int i2, Object obj) {
        super.setTag(i2, obj);
        if (obj == null && this.f5766e == null) {
            m3117b(i2);
        }
    }
}
