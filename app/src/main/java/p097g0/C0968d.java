package p097g0;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.widget.CompoundButton;
import android.widget.TextView;
import p002A1.C0027i;
import p009D.AbstractC0098a;
import p028K.AbstractC0241P;
import p045Q.AbstractC0438b;
import p045Q.AbstractC0439c;
import p086d.AbstractC0843a;
import p093e2.AbstractC0901d;
import p105j.AbstractC1117o0;
import p105j.C1125r;
import p111l.C1221c;
import p111l.C1224f;

/* renamed from: g0.d */
/* loaded from: classes.dex */
public final class C0968d {

    /* renamed from: a */
    public boolean f4058a;

    /* renamed from: b */
    public boolean f4059b;

    /* renamed from: c */
    public boolean f4060c;

    /* renamed from: d */
    public final Object f4061d;

    /* renamed from: e */
    public Parcelable f4062e;

    /* renamed from: f */
    public Object f4063f;

    public /* synthetic */ C0968d(TextView textView) {
        this.f4062e = null;
        this.f4063f = null;
        this.f4058a = false;
        this.f4059b = false;
        this.f4061d = textView;
    }

    /* renamed from: a */
    public void m2474a() {
        CompoundButton compoundButton = (CompoundButton) this.f4061d;
        Drawable drawableM1106a = AbstractC0439c.m1106a(compoundButton);
        if (drawableM1106a != null) {
            if (this.f4058a || this.f4059b) {
                Drawable drawableMutate = drawableM1106a.mutate();
                if (this.f4058a) {
                    AbstractC0098a.m300h(drawableMutate, (ColorStateList) this.f4062e);
                }
                if (this.f4059b) {
                    AbstractC0098a.m301i(drawableMutate, (PorterDuff.Mode) this.f4063f);
                }
                if (drawableMutate.isStateful()) {
                    drawableMutate.setState(compoundButton.getDrawableState());
                }
                compoundButton.setButtonDrawable(drawableMutate);
            }
        }
    }

    /* renamed from: b */
    public void m2475b() {
        C1125r c1125r = (C1125r) this.f4061d;
        Drawable checkMarkDrawable = c1125r.getCheckMarkDrawable();
        if (checkMarkDrawable != null) {
            if (this.f4058a || this.f4059b) {
                Drawable drawableMutate = checkMarkDrawable.mutate();
                if (this.f4058a) {
                    AbstractC0098a.m300h(drawableMutate, (ColorStateList) this.f4062e);
                }
                if (this.f4059b) {
                    AbstractC0098a.m301i(drawableMutate, (PorterDuff.Mode) this.f4063f);
                }
                if (drawableMutate.isStateful()) {
                    drawableMutate.setState(c1125r.getDrawableState());
                }
                c1125r.setCheckMarkDrawable(drawableMutate);
            }
        }
    }

    /* renamed from: c */
    public Bundle m2476c(String str) {
        if (!this.f4059b) {
            throw new IllegalStateException("You can consumeRestoredStateForKey only after super.onCreate of corresponding component");
        }
        Bundle bundle = (Bundle) this.f4062e;
        if (bundle == null) {
            return null;
        }
        Bundle bundle2 = bundle.getBundle(str);
        Bundle bundle3 = (Bundle) this.f4062e;
        if (bundle3 != null) {
            bundle3.remove(str);
        }
        Bundle bundle4 = (Bundle) this.f4062e;
        if (bundle4 != null && !bundle4.isEmpty()) {
            return bundle2;
        }
        this.f4062e = null;
        return bundle2;
    }

    /* renamed from: d */
    public void m2477d(AttributeSet attributeSet, int i2) {
        int resourceId;
        int resourceId2;
        CompoundButton compoundButton = (CompoundButton) this.f4061d;
        Context context = compoundButton.getContext();
        int[] iArr = AbstractC0843a.f3463m;
        C0027i c0027iM98N = C0027i.m98N(context, attributeSet, iArr, i2);
        TypedArray typedArray = (TypedArray) c0027iM98N.f66c;
        AbstractC0241P.m700l(compoundButton, compoundButton.getContext(), iArr, attributeSet, (TypedArray) c0027iM98N.f66c, i2);
        try {
            if (typedArray.hasValue(1) && (resourceId2 = typedArray.getResourceId(1, 0)) != 0) {
                try {
                    compoundButton.setButtonDrawable(AbstractC0901d.m2321x(compoundButton.getContext(), resourceId2));
                } catch (Resources.NotFoundException unused) {
                }
            } else if (typedArray.hasValue(0) && (resourceId = typedArray.getResourceId(0, 0)) != 0) {
                compoundButton.setButtonDrawable(AbstractC0901d.m2321x(compoundButton.getContext(), resourceId));
            }
            if (typedArray.hasValue(2)) {
                AbstractC0438b.m1104c(compoundButton, c0027iM98N.m99A(2));
            }
            if (typedArray.hasValue(3)) {
                AbstractC0438b.m1105d(compoundButton, AbstractC1117o0.m2733b(typedArray.getInt(3, -1), null));
            }
            c0027iM98N.m114R();
        } catch (Throwable th) {
            c0027iM98N.m114R();
            throw th;
        }
    }

    /* renamed from: e */
    public void m2478e(String str, InterfaceC0967c interfaceC0967c) {
        Object obj;
        C1224f c1224f = (C1224f) this.f4061d;
        C1221c c1221cMo2854a = c1224f.mo2854a(str);
        if (c1221cMo2854a != null) {
            obj = c1221cMo2854a.f4912b;
        } else {
            C1221c c1221c = new C1221c(str, interfaceC0967c);
            c1224f.f4921d++;
            C1221c c1221c2 = c1224f.f4919b;
            if (c1221c2 == null) {
                c1224f.f4918a = c1221c;
                c1224f.f4919b = c1221c;
            } else {
                c1221c2.f4913c = c1221c;
                c1221c.f4914d = c1221c2;
                c1224f.f4919b = c1221c;
            }
            obj = null;
        }
        if (((InterfaceC0967c) obj) != null) {
            throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");
        }
    }

    public C0968d() {
        this.f4061d = new C1224f();
        this.f4060c = true;
    }
}
