package p105j;

import android.content.Context;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.TextView;
import tkbmmn.ghwbbf.irvjzy.R;

/* renamed from: j.q1 */
/* loaded from: classes.dex */
public final class C1124q1 {

    /* renamed from: a */
    public final Context f4614a;

    /* renamed from: b */
    public final View f4615b;

    /* renamed from: c */
    public final TextView f4616c;

    /* renamed from: d */
    public final WindowManager.LayoutParams f4617d;

    /* renamed from: e */
    public final Rect f4618e;

    /* renamed from: f */
    public final int[] f4619f;

    /* renamed from: g */
    public final int[] f4620g;

    public C1124q1(Context context) {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        this.f4617d = layoutParams;
        this.f4618e = new Rect();
        this.f4619f = new int[2];
        this.f4620g = new int[2];
        this.f4614a = context;
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.abc_tooltip, (ViewGroup) null);
        this.f4615b = viewInflate;
        this.f4616c = (TextView) viewInflate.findViewById(R.id.message);
        layoutParams.setTitle(C1124q1.class.getSimpleName());
        layoutParams.packageName = context.getPackageName();
        layoutParams.type = 1002;
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.windowAnimations = R.style.Animation_AppCompat_Tooltip;
        layoutParams.flags = 24;
    }
}
