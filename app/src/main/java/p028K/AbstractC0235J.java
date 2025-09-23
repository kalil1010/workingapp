package p028K;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.contentcapture.ContentCaptureSession;
import java.util.List;
import p040O.AbstractC0424a;

/* renamed from: K.J */
/* loaded from: classes.dex */
public abstract class AbstractC0235J {
    /* renamed from: a */
    public static View.AccessibilityDelegate m674a(View view) {
        return view.getAccessibilityDelegate();
    }

    /* renamed from: b */
    public static ContentCaptureSession m675b(View view) {
        return view.getContentCaptureSession();
    }

    /* renamed from: c */
    public static List<Rect> m676c(View view) {
        return view.getSystemGestureExclusionRects();
    }

    /* renamed from: d */
    public static void m677d(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i2, int i3) {
        view.saveAttributeDataForStyleable(context, iArr, attributeSet, typedArray, i2, i3);
    }

    /* renamed from: e */
    public static void m678e(View view, AbstractC0424a abstractC0424a) {
        view.setContentCaptureSession(null);
    }

    /* renamed from: f */
    public static void m679f(View view, List<Rect> list) {
        view.setSystemGestureExclusionRects(list);
    }
}
