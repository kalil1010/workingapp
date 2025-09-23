package p058U0;

import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.sidesheet.SideSheetBehavior;
import p093e2.AbstractC0901d;

/* renamed from: U0.a */
/* loaded from: classes.dex */
public final class C0534a extends AbstractC0901d {

    /* renamed from: c */
    public final /* synthetic */ int f1695c;

    /* renamed from: d */
    public final SideSheetBehavior f1696d;

    public /* synthetic */ C0534a(SideSheetBehavior sideSheetBehavior, int i2) {
        this.f1695c = i2;
        this.f1696d = sideSheetBehavior;
    }

    @Override // p093e2.AbstractC0901d
    /* renamed from: B */
    public final int mo1315B() {
        switch (this.f1695c) {
            case 0:
                SideSheetBehavior sideSheetBehavior = this.f1696d;
                return (-sideSheetBehavior.f3312l) - sideSheetBehavior.f3315o;
            default:
                return this.f1696d.f3313m;
        }
    }

    @Override // p093e2.AbstractC0901d
    /* renamed from: D */
    public final int mo1316D() {
        switch (this.f1695c) {
            case 0:
                return this.f1696d.f3315o;
            default:
                return this.f1696d.f3313m;
        }
    }

    @Override // p093e2.AbstractC0901d
    /* renamed from: E */
    public final int mo1317E() {
        switch (this.f1695c) {
            case 0:
                return -this.f1696d.f3312l;
            default:
                return mo1330z();
        }
    }

    @Override // p093e2.AbstractC0901d
    /* renamed from: F */
    public final int mo1318F(View view) {
        switch (this.f1695c) {
            case 0:
                return view.getRight() + this.f1696d.f3315o;
            default:
                return view.getLeft() - this.f1696d.f3315o;
        }
    }

    @Override // p093e2.AbstractC0901d
    /* renamed from: G */
    public final int mo1319G(CoordinatorLayout coordinatorLayout) {
        switch (this.f1695c) {
            case 0:
                return coordinatorLayout.getLeft();
            default:
                return coordinatorLayout.getRight();
        }
    }

    @Override // p093e2.AbstractC0901d
    /* renamed from: H */
    public final int mo1320H() {
        switch (this.f1695c) {
            case 0:
                return 1;
            default:
                return 0;
        }
    }

    @Override // p093e2.AbstractC0901d
    /* renamed from: O */
    public final boolean mo1321O(float f) {
        switch (this.f1695c) {
            case 0:
                if (f > 0.0f) {
                }
                break;
            default:
                if (f < 0.0f) {
                }
                break;
        }
        return false;
    }

    @Override // p093e2.AbstractC0901d
    /* renamed from: R */
    public final boolean mo1322R(View view) {
        switch (this.f1695c) {
            case 0:
                if (view.getRight() < (mo1330z() - mo1315B()) / 2) {
                }
                break;
            default:
                if (view.getLeft() > (mo1330z() + this.f1696d.f3313m) / 2) {
                }
                break;
        }
        return false;
    }

    @Override // p093e2.AbstractC0901d
    /* renamed from: S */
    public final boolean mo1323S(float f, float f2) {
        switch (this.f1695c) {
            case 0:
                if (Math.abs(f) > Math.abs(f2)) {
                    float fAbs = Math.abs(f);
                    this.f1696d.getClass();
                    if (fAbs > 500) {
                    }
                }
                break;
            default:
                if (Math.abs(f) > Math.abs(f2)) {
                    float fAbs2 = Math.abs(f);
                    this.f1696d.getClass();
                    if (fAbs2 > 500) {
                    }
                }
                break;
        }
        return false;
    }

    @Override // p093e2.AbstractC0901d
    /* renamed from: c */
    public final int mo1324c(ViewGroup.MarginLayoutParams marginLayoutParams) {
        switch (this.f1695c) {
            case 0:
                return marginLayoutParams.leftMargin;
            default:
                return marginLayoutParams.rightMargin;
        }
    }

    @Override // p093e2.AbstractC0901d
    /* renamed from: d */
    public final float mo1325d(int i2) {
        switch (this.f1695c) {
            case 0:
                float fMo1315B = mo1315B();
                return (i2 - fMo1315B) / (mo1330z() - fMo1315B);
            default:
                float f = this.f1696d.f3313m;
                return (f - i2) / (f - mo1330z());
        }
    }

    @Override // p093e2.AbstractC0901d
    /* renamed from: p0 */
    public final boolean mo1326p0(View view, float f) {
        switch (this.f1695c) {
            case 0:
                float left = view.getLeft();
                SideSheetBehavior sideSheetBehavior = this.f1696d;
                float fAbs = Math.abs((f * sideSheetBehavior.f3311k) + left);
                sideSheetBehavior.getClass();
                if (fAbs > 0.5f) {
                }
                break;
            default:
                float right = view.getRight();
                SideSheetBehavior sideSheetBehavior2 = this.f1696d;
                float fAbs2 = Math.abs((f * sideSheetBehavior2.f3311k) + right);
                sideSheetBehavior2.getClass();
                if (fAbs2 > 0.5f) {
                }
                break;
        }
        return false;
    }

    @Override // p093e2.AbstractC0901d
    /* renamed from: u0 */
    public final void mo1327u0(ViewGroup.MarginLayoutParams marginLayoutParams, int i2) {
        switch (this.f1695c) {
            case 0:
                marginLayoutParams.leftMargin = i2;
                break;
            default:
                marginLayoutParams.rightMargin = i2;
                break;
        }
    }

    @Override // p093e2.AbstractC0901d
    /* renamed from: v */
    public final int mo1328v(ViewGroup.MarginLayoutParams marginLayoutParams) {
        switch (this.f1695c) {
            case 0:
                return marginLayoutParams.leftMargin;
            default:
                return marginLayoutParams.rightMargin;
        }
    }

    @Override // p093e2.AbstractC0901d
    /* renamed from: v0 */
    public final void mo1329v0(ViewGroup.MarginLayoutParams marginLayoutParams, int i2, int i3) {
        switch (this.f1695c) {
            case 0:
                if (i2 <= this.f1696d.f3313m) {
                    marginLayoutParams.leftMargin = i3;
                    break;
                }
                break;
            default:
                int i4 = this.f1696d.f3313m;
                if (i2 <= i4) {
                    marginLayoutParams.rightMargin = i4 - i2;
                    break;
                }
                break;
        }
    }

    @Override // p093e2.AbstractC0901d
    /* renamed from: z */
    public final int mo1330z() {
        switch (this.f1695c) {
            case 0:
                SideSheetBehavior sideSheetBehavior = this.f1696d;
                return Math.max(0, sideSheetBehavior.f3314n + sideSheetBehavior.f3315o);
            default:
                SideSheetBehavior sideSheetBehavior2 = this.f1696d;
                return Math.max(0, (sideSheetBehavior2.f3313m - sideSheetBehavior2.f3312l) - sideSheetBehavior2.f3315o);
        }
    }
}
