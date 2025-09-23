package androidx.appcompat.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import java.util.WeakHashMap;
import p028K.AbstractC0241P;
import p105j.AbstractC1145z0;
import p105j.C1143y0;
import tkbmmn.ghwbbf.irvjzy.R;

/* loaded from: classes.dex */
public class AlertDialogLayout extends AbstractC1145z0 {
    public AlertDialogLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }

    /* renamed from: l */
    public static int m1498l(View view) {
        WeakHashMap weakHashMap = AbstractC0241P.f815a;
        int minimumHeight = view.getMinimumHeight();
        if (minimumHeight > 0) {
            return minimumHeight;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (viewGroup.getChildCount() == 1) {
                return m1498l(viewGroup.getChildAt(0));
            }
        }
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00a0  */
    @Override // p105j.AbstractC1145z0, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onLayout(boolean r11, int r12, int r13, int r14, int r15) {
        /*
            r10 = this;
            r11 = 1
            int r0 = r10.getPaddingLeft()
            int r14 = r14 - r12
            int r12 = r10.getPaddingRight()
            int r12 = r14 - r12
            int r14 = r14 - r0
            int r1 = r10.getPaddingRight()
            int r14 = r14 - r1
            int r1 = r10.getMeasuredHeight()
            int r2 = r10.getChildCount()
            int r3 = r10.getGravity()
            r4 = r3 & 112(0x70, float:1.57E-43)
            r5 = 8388615(0x800007, float:1.1754953E-38)
            r3 = r3 & r5
            r5 = 16
            if (r4 == r5) goto L3a
            r5 = 80
            if (r4 == r5) goto L31
            int r13 = r10.getPaddingTop()
            goto L44
        L31:
            int r4 = r10.getPaddingTop()
            int r4 = r4 + r15
            int r4 = r4 - r13
            int r13 = r4 - r1
            goto L44
        L3a:
            int r4 = r10.getPaddingTop()
            int r15 = r15 - r13
            int r15 = r15 - r1
            int r15 = r15 / 2
            int r13 = r15 + r4
        L44:
            android.graphics.drawable.Drawable r15 = r10.getDividerDrawable()
            r1 = 0
            if (r15 != 0) goto L4d
            r15 = r1
            goto L51
        L4d:
            int r15 = r15.getIntrinsicHeight()
        L51:
            if (r1 >= r2) goto Lb1
            android.view.View r4 = r10.getChildAt(r1)
            if (r4 == 0) goto Laf
            int r5 = r4.getVisibility()
            r6 = 8
            if (r5 == r6) goto Laf
            int r5 = r4.getMeasuredWidth()
            int r6 = r4.getMeasuredHeight()
            android.view.ViewGroup$LayoutParams r7 = r4.getLayoutParams()
            j.y0 r7 = (p105j.C1143y0) r7
            int r8 = r7.gravity
            if (r8 >= 0) goto L74
            r8 = r3
        L74:
            java.util.WeakHashMap r9 = p028K.AbstractC0241P.f815a
            int r9 = r10.getLayoutDirection()
            int r8 = android.view.Gravity.getAbsoluteGravity(r8, r9)
            r8 = r8 & 7
            if (r8 == r11) goto L8f
            r9 = 5
            if (r8 == r9) goto L89
            int r8 = r7.leftMargin
            int r8 = r8 + r0
            goto L9a
        L89:
            int r8 = r12 - r5
            int r9 = r7.rightMargin
        L8d:
            int r8 = r8 - r9
            goto L9a
        L8f:
            int r8 = r14 - r5
            int r8 = r8 / 2
            int r8 = r8 + r0
            int r9 = r7.leftMargin
            int r8 = r8 + r9
            int r9 = r7.rightMargin
            goto L8d
        L9a:
            boolean r9 = r10.m2763k(r1)
            if (r9 == 0) goto La1
            int r13 = r13 + r15
        La1:
            int r9 = r7.topMargin
            int r13 = r13 + r9
            int r5 = r5 + r8
            int r9 = r13 + r6
            r4.layout(r8, r13, r5, r9)
            int r4 = r7.bottomMargin
            int r6 = r6 + r4
            int r6 = r6 + r13
            r13 = r6
        Laf:
            int r1 = r1 + r11
            goto L51
        Lb1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.AlertDialogLayout.onLayout(boolean, int, int, int, int):void");
    }

    @Override // p105j.AbstractC1145z0, android.view.View
    public final void onMeasure(int i2, int i3) {
        int iCombineMeasuredStates;
        int iM1498l;
        int measuredHeight;
        int measuredHeight2;
        AlertDialogLayout alertDialogLayout = this;
        int childCount = alertDialogLayout.getChildCount();
        View view = null;
        View view2 = null;
        View view3 = null;
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = alertDialogLayout.getChildAt(i4);
            if (childAt.getVisibility() != 8) {
                int id = childAt.getId();
                if (id == R.id.topPanel) {
                    view = childAt;
                } else if (id == R.id.buttonPanel) {
                    view2 = childAt;
                } else {
                    if ((id != R.id.contentPanel && id != R.id.customPanel) || view3 != null) {
                        super.onMeasure(i2, i3);
                        return;
                    }
                    view3 = childAt;
                }
            }
        }
        int mode = View.MeasureSpec.getMode(i3);
        int size = View.MeasureSpec.getSize(i3);
        int mode2 = View.MeasureSpec.getMode(i2);
        int paddingBottom = alertDialogLayout.getPaddingBottom() + alertDialogLayout.getPaddingTop();
        if (view != null) {
            view.measure(i2, 0);
            paddingBottom += view.getMeasuredHeight();
            iCombineMeasuredStates = View.combineMeasuredStates(0, view.getMeasuredState());
        } else {
            iCombineMeasuredStates = 0;
        }
        if (view2 != null) {
            view2.measure(i2, 0);
            iM1498l = m1498l(view2);
            measuredHeight = view2.getMeasuredHeight() - iM1498l;
            paddingBottom += iM1498l;
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view2.getMeasuredState());
        } else {
            iM1498l = 0;
            measuredHeight = 0;
        }
        if (view3 != null) {
            view3.measure(i2, mode == 0 ? 0 : View.MeasureSpec.makeMeasureSpec(Math.max(0, size - paddingBottom), mode));
            measuredHeight2 = view3.getMeasuredHeight();
            paddingBottom += measuredHeight2;
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view3.getMeasuredState());
        } else {
            measuredHeight2 = 0;
        }
        int i5 = size - paddingBottom;
        if (view2 != null) {
            int i6 = paddingBottom - iM1498l;
            int iMin = Math.min(i5, measuredHeight);
            if (iMin > 0) {
                i5 -= iMin;
                iM1498l += iMin;
            }
            view2.measure(i2, View.MeasureSpec.makeMeasureSpec(iM1498l, 1073741824));
            paddingBottom = i6 + view2.getMeasuredHeight();
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view2.getMeasuredState());
        }
        if (view3 != null && i5 > 0) {
            view3.measure(i2, View.MeasureSpec.makeMeasureSpec(measuredHeight2 + i5, mode));
            paddingBottom = (paddingBottom - measuredHeight2) + view3.getMeasuredHeight();
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view3.getMeasuredState());
        }
        int iMax = 0;
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt2 = alertDialogLayout.getChildAt(i7);
            if (childAt2.getVisibility() != 8) {
                iMax = Math.max(iMax, childAt2.getMeasuredWidth());
            }
        }
        int i8 = i3;
        alertDialogLayout.setMeasuredDimension(View.resolveSizeAndState(alertDialogLayout.getPaddingRight() + alertDialogLayout.getPaddingLeft() + iMax, i2, iCombineMeasuredStates), View.resolveSizeAndState(paddingBottom, i8, 0));
        if (mode2 != 1073741824) {
            int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(alertDialogLayout.getMeasuredWidth(), 1073741824);
            int i9 = 0;
            while (i9 < childCount) {
                View childAt3 = alertDialogLayout.getChildAt(i9);
                if (childAt3.getVisibility() != 8) {
                    C1143y0 c1143y0 = (C1143y0) childAt3.getLayoutParams();
                    if (((LinearLayout.LayoutParams) c1143y0).width == -1) {
                        int i10 = ((LinearLayout.LayoutParams) c1143y0).height;
                        ((LinearLayout.LayoutParams) c1143y0).height = childAt3.getMeasuredHeight();
                        alertDialogLayout.measureChildWithMargins(childAt3, iMakeMeasureSpec, 0, i8, 0);
                        ((LinearLayout.LayoutParams) c1143y0).height = i10;
                    }
                }
                i9++;
                alertDialogLayout = this;
                i8 = i3;
            }
        }
    }
}
