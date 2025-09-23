package androidx.constraintlayout.helper.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import java.util.ArrayList;
import java.util.HashMap;
import p129s.C1315d;
import p129s.C1318g;
import p132t.C1333b;
import p138v.AbstractC1372q;
import p138v.AbstractC1374s;

/* loaded from: classes.dex */
public class Flow extends AbstractC1374s {

    /* renamed from: j */
    public final C1318g f2257j;

    public Flow(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f5762a = new int[32];
        this.f5768g = new HashMap();
        this.f5764c = context;
        super.mo3122g(attributeSet);
        C1318g c1318g = new C1318g();
        c1318g.f5622s0 = 0;
        c1318g.f5623t0 = 0;
        c1318g.f5624u0 = 0;
        c1318g.f5625v0 = 0;
        c1318g.f5626w0 = 0;
        c1318g.f5627x0 = 0;
        c1318g.f5628y0 = false;
        c1318g.f5629z0 = 0;
        c1318g.f5594A0 = 0;
        c1318g.f5595B0 = new C1333b();
        c1318g.f5596C0 = null;
        c1318g.f5597D0 = -1;
        c1318g.f5598E0 = -1;
        c1318g.f5599F0 = -1;
        c1318g.f5600G0 = -1;
        c1318g.f5601H0 = -1;
        c1318g.f5602I0 = -1;
        c1318g.f5603J0 = 0.5f;
        c1318g.f5604K0 = 0.5f;
        c1318g.f5605L0 = 0.5f;
        c1318g.f5606M0 = 0.5f;
        c1318g.f5607N0 = 0.5f;
        c1318g.f5608O0 = 0.5f;
        c1318g.f5609P0 = 0;
        c1318g.f5610Q0 = 0;
        c1318g.f5611R0 = 2;
        c1318g.f5612S0 = 2;
        c1318g.f5613T0 = 0;
        c1318g.f5614U0 = -1;
        c1318g.f5615V0 = 0;
        c1318g.f5616W0 = new ArrayList();
        c1318g.f5617X0 = null;
        c1318g.f5618Y0 = null;
        c1318g.f5619Z0 = null;
        c1318g.f5621b1 = 0;
        this.f2257j = c1318g;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, AbstractC1372q.f5972b);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i2);
                if (index == 0) {
                    this.f2257j.f5615V0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 1) {
                    C1318g c1318g2 = this.f2257j;
                    int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                    c1318g2.f5622s0 = dimensionPixelSize;
                    c1318g2.f5623t0 = dimensionPixelSize;
                    c1318g2.f5624u0 = dimensionPixelSize;
                    c1318g2.f5625v0 = dimensionPixelSize;
                } else if (index == 18) {
                    C1318g c1318g3 = this.f2257j;
                    int dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                    c1318g3.f5624u0 = dimensionPixelSize2;
                    c1318g3.f5626w0 = dimensionPixelSize2;
                    c1318g3.f5627x0 = dimensionPixelSize2;
                } else if (index == 19) {
                    this.f2257j.f5625v0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 2) {
                    this.f2257j.f5626w0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 3) {
                    this.f2257j.f5622s0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 4) {
                    this.f2257j.f5627x0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 5) {
                    this.f2257j.f5623t0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 54) {
                    this.f2257j.f5613T0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 44) {
                    this.f2257j.f5597D0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 53) {
                    this.f2257j.f5598E0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 38) {
                    this.f2257j.f5599F0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 46) {
                    this.f2257j.f5601H0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 40) {
                    this.f2257j.f5600G0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 48) {
                    this.f2257j.f5602I0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 42) {
                    this.f2257j.f5603J0 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 37) {
                    this.f2257j.f5605L0 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 45) {
                    this.f2257j.f5607N0 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 39) {
                    this.f2257j.f5606M0 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 47) {
                    this.f2257j.f5608O0 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 51) {
                    this.f2257j.f5604K0 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 41) {
                    this.f2257j.f5611R0 = typedArrayObtainStyledAttributes.getInt(index, 2);
                } else if (index == 50) {
                    this.f2257j.f5612S0 = typedArrayObtainStyledAttributes.getInt(index, 2);
                } else if (index == 43) {
                    this.f2257j.f5609P0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 52) {
                    this.f2257j.f5610Q0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 49) {
                    this.f2257j.f5614U0 = typedArrayObtainStyledAttributes.getInt(index, -1);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        this.f5765d = this.f2257j;
        m3123i();
    }

    @Override // p138v.AbstractC1358c
    /* renamed from: h */
    public final void mo1541h(C1315d c1315d, boolean z2) {
        C1318g c1318g = this.f2257j;
        int i2 = c1318g.f5624u0;
        if (i2 > 0 || c1318g.f5625v0 > 0) {
            if (z2) {
                c1318g.f5626w0 = c1318g.f5625v0;
                c1318g.f5627x0 = i2;
            } else {
                c1318g.f5626w0 = i2;
                c1318g.f5627x0 = c1318g.f5625v0;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:386:0x0649  */
    /* JADX WARN: Removed duplicated region for block: B:400:0x06e0  */
    /* JADX WARN: Removed duplicated region for block: B:406:0x06ee  */
    /* JADX WARN: Removed duplicated region for block: B:407:0x06f1  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:414:0x070d  */
    /* JADX WARN: Removed duplicated region for block: B:415:0x0710  */
    /* JADX WARN: Removed duplicated region for block: B:426:0x00ce A[EDGE_INSN: B:426:0x00ce->B:59:0x00ce BREAK  A[LOOP:1: B:53:0x00ba->B:58:0x00ca], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0123  */
    /* JADX WARN: Type inference failed for: r28v0 */
    /* JADX WARN: Type inference failed for: r28v1 */
    /* JADX WARN: Type inference failed for: r28v2 */
    @Override // p138v.AbstractC1374s
    /* renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void mo1542j(p129s.C1318g r38, int r39, int r40) {
        /*
            Method dump skipped, instructions count: 1828
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.helper.widget.Flow.mo1542j(s.g, int, int):void");
    }

    @Override // p138v.AbstractC1358c, android.view.View
    public final void onMeasure(int i2, int i3) {
        mo1542j(this.f2257j, i2, i3);
    }

    public void setFirstHorizontalBias(float f) {
        this.f2257j.f5605L0 = f;
        requestLayout();
    }

    public void setFirstHorizontalStyle(int i2) {
        this.f2257j.f5599F0 = i2;
        requestLayout();
    }

    public void setFirstVerticalBias(float f) {
        this.f2257j.f5606M0 = f;
        requestLayout();
    }

    public void setFirstVerticalStyle(int i2) {
        this.f2257j.f5600G0 = i2;
        requestLayout();
    }

    public void setHorizontalAlign(int i2) {
        this.f2257j.f5611R0 = i2;
        requestLayout();
    }

    public void setHorizontalBias(float f) {
        this.f2257j.f5603J0 = f;
        requestLayout();
    }

    public void setHorizontalGap(int i2) {
        this.f2257j.f5609P0 = i2;
        requestLayout();
    }

    public void setHorizontalStyle(int i2) {
        this.f2257j.f5597D0 = i2;
        requestLayout();
    }

    public void setLastHorizontalBias(float f) {
        this.f2257j.f5607N0 = f;
        requestLayout();
    }

    public void setLastHorizontalStyle(int i2) {
        this.f2257j.f5601H0 = i2;
        requestLayout();
    }

    public void setLastVerticalBias(float f) {
        this.f2257j.f5608O0 = f;
        requestLayout();
    }

    public void setLastVerticalStyle(int i2) {
        this.f2257j.f5602I0 = i2;
        requestLayout();
    }

    public void setMaxElementsWrap(int i2) {
        this.f2257j.f5614U0 = i2;
        requestLayout();
    }

    public void setOrientation(int i2) {
        this.f2257j.f5615V0 = i2;
        requestLayout();
    }

    public void setPadding(int i2) {
        C1318g c1318g = this.f2257j;
        c1318g.f5622s0 = i2;
        c1318g.f5623t0 = i2;
        c1318g.f5624u0 = i2;
        c1318g.f5625v0 = i2;
        requestLayout();
    }

    public void setPaddingBottom(int i2) {
        this.f2257j.f5623t0 = i2;
        requestLayout();
    }

    public void setPaddingLeft(int i2) {
        this.f2257j.f5626w0 = i2;
        requestLayout();
    }

    public void setPaddingRight(int i2) {
        this.f2257j.f5627x0 = i2;
        requestLayout();
    }

    public void setPaddingTop(int i2) {
        this.f2257j.f5622s0 = i2;
        requestLayout();
    }

    public void setVerticalAlign(int i2) {
        this.f2257j.f5612S0 = i2;
        requestLayout();
    }

    public void setVerticalBias(float f) {
        this.f2257j.f5604K0 = f;
        requestLayout();
    }

    public void setVerticalGap(int i2) {
        this.f2257j.f5610Q0 = i2;
        requestLayout();
    }

    public void setVerticalStyle(int i2) {
        this.f2257j.f5598E0 = i2;
        requestLayout();
    }

    public void setWrapMode(int i2) {
        this.f2257j.f5613T0 = i2;
        requestLayout();
    }
}
