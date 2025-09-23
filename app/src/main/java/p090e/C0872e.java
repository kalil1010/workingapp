package p090e;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.appcompat.app.AlertController$RecycleListView;
import androidx.core.widget.NestedScrollView;
import java.lang.ref.WeakReference;
import p005B1.ViewOnClickListenerC0066d;
import p083c0.HandlerC0787a;
import p086d.AbstractC0843a;
import tkbmmn.ghwbbf.irvjzy.R;

/* renamed from: e.e */
/* loaded from: classes.dex */
public final class C0872e {

    /* renamed from: a */
    public final Context f3578a;

    /* renamed from: b */
    public final DialogC0873f f3579b;

    /* renamed from: c */
    public final Window f3580c;

    /* renamed from: d */
    public CharSequence f3581d;

    /* renamed from: e */
    public AlertController$RecycleListView f3582e;

    /* renamed from: f */
    public Button f3583f;

    /* renamed from: g */
    public Button f3584g;

    /* renamed from: h */
    public Button f3585h;

    /* renamed from: i */
    public NestedScrollView f3586i;

    /* renamed from: j */
    public Drawable f3587j;

    /* renamed from: k */
    public ImageView f3588k;

    /* renamed from: l */
    public TextView f3589l;

    /* renamed from: m */
    public TextView f3590m;

    /* renamed from: n */
    public View f3591n;

    /* renamed from: o */
    public ListAdapter f3592o;

    /* renamed from: q */
    public final int f3594q;

    /* renamed from: r */
    public final int f3595r;

    /* renamed from: s */
    public final int f3596s;

    /* renamed from: t */
    public final int f3597t;

    /* renamed from: u */
    public final boolean f3598u;

    /* renamed from: v */
    public final HandlerC0787a f3599v;

    /* renamed from: p */
    public int f3593p = -1;

    /* renamed from: w */
    public final ViewOnClickListenerC0066d f3600w = new ViewOnClickListenerC0066d(4, this);

    public C0872e(Context context, DialogC0873f dialogC0873f, Window window) {
        this.f3578a = context;
        this.f3579b = dialogC0873f;
        this.f3580c = window;
        HandlerC0787a handlerC0787a = new HandlerC0787a();
        handlerC0787a.f2932b = new WeakReference(dialogC0873f);
        this.f3599v = handlerC0787a;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, AbstractC0843a.f3455e, R.attr.alertDialogStyle, 0);
        this.f3594q = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        typedArrayObtainStyledAttributes.getResourceId(2, 0);
        this.f3595r = typedArrayObtainStyledAttributes.getResourceId(4, 0);
        typedArrayObtainStyledAttributes.getResourceId(5, 0);
        this.f3596s = typedArrayObtainStyledAttributes.getResourceId(7, 0);
        this.f3597t = typedArrayObtainStyledAttributes.getResourceId(3, 0);
        this.f3598u = typedArrayObtainStyledAttributes.getBoolean(6, true);
        typedArrayObtainStyledAttributes.getDimensionPixelSize(1, 0);
        typedArrayObtainStyledAttributes.recycle();
        dialogC0873f.m2208c().mo2232g(1);
    }

    /* renamed from: a */
    public static ViewGroup m2205a(View view, View view2) {
        if (view == null) {
            if (view2 instanceof ViewStub) {
                view2 = ((ViewStub) view2).inflate();
            }
            return (ViewGroup) view2;
        }
        if (view2 != null) {
            ViewParent parent = view2.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view2);
            }
        }
        if (view instanceof ViewStub) {
            view = ((ViewStub) view).inflate();
        }
        return (ViewGroup) view;
    }
}
