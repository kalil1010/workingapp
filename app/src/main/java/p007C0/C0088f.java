package p007C0;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AlertController$RecycleListView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.util.ArrayList;
import p020H.C0178h;
import p031L.InterfaceC0351u;
import p090e.C0869b;
import p090e.C0870c;
import p090e.C0871d;
import p090e.C0872e;
import p090e.DialogC0873f;
import p102i.DialogInterfaceOnKeyListenerC1007m;

/* renamed from: C0.f */
/* loaded from: classes.dex */
public final class C0088f implements InterfaceC0351u {

    /* renamed from: a */
    public int f207a;

    /* renamed from: b */
    public final Object f208b;

    public C0088f(ArrayList arrayList) {
        this.f208b = arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v1, types: [android.widget.ListAdapter] */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* renamed from: a */
    public DialogC0873f m281a() {
        C0870c c0870c = (C0870c) this.f208b;
        DialogC0873f dialogC0873f = new DialogC0873f(c0870c.f3568a, this.f207a);
        View view = c0870c.f3572e;
        C0872e c0872e = dialogC0873f.f3606f;
        if (view != null) {
            c0872e.f3591n = view;
        } else {
            CharSequence charSequence = c0870c.f3571d;
            if (charSequence != null) {
                c0872e.f3581d = charSequence;
                TextView textView = c0872e.f3589l;
                if (textView != null) {
                    textView.setText(charSequence);
                }
            }
            Drawable drawable = c0870c.f3570c;
            if (drawable != null) {
                c0872e.f3587j = drawable;
                ImageView imageView = c0872e.f3588k;
                if (imageView != null) {
                    imageView.setVisibility(0);
                    c0872e.f3588k.setImageDrawable(drawable);
                }
            }
        }
        if (c0870c.f3574g != null) {
            AlertController$RecycleListView alertController$RecycleListView = (AlertController$RecycleListView) c0870c.f3569b.inflate(c0872e.f3595r, (ViewGroup) null);
            int i2 = c0870c.f3576i ? c0872e.f3596s : c0872e.f3597t;
            Object obj = c0870c.f3574g;
            ?? c0871d = obj;
            if (obj == null) {
                c0871d = new C0871d(c0870c.f3568a, i2, R.id.text1, null);
            }
            c0872e.f3592o = c0871d;
            c0872e.f3593p = c0870c.f3577j;
            if (c0870c.f3575h != null) {
                alertController$RecycleListView.setOnItemClickListener(new C0869b(c0870c, c0872e));
            }
            if (c0870c.f3576i) {
                alertController$RecycleListView.setChoiceMode(1);
            }
            c0872e.f3582e = alertController$RecycleListView;
        }
        dialogC0873f.setCancelable(true);
        dialogC0873f.setCanceledOnTouchOutside(true);
        dialogC0873f.setOnCancelListener(null);
        dialogC0873f.setOnDismissListener(null);
        DialogInterfaceOnKeyListenerC1007m dialogInterfaceOnKeyListenerC1007m = c0870c.f3573f;
        if (dialogInterfaceOnKeyListenerC1007m != null) {
            dialogC0873f.setOnKeyListener(dialogInterfaceOnKeyListenerC1007m);
        }
        return dialogC0873f;
    }

    /* renamed from: b */
    public boolean m282b() {
        return this.f207a < ((ArrayList) this.f208b).size();
    }

    @Override // p031L.InterfaceC0351u
    /* renamed from: f */
    public boolean mo19f(View view) throws Resources.NotFoundException {
        ((BottomSheetBehavior) this.f208b).m2044F(this.f207a);
        return true;
    }

    public C0088f(Context context) {
        int iM2207h = DialogC0873f.m2207h(context, 0);
        this.f208b = new C0870c(new ContextThemeWrapper(context, DialogC0873f.m2207h(context, iM2207h)));
        this.f207a = iM2207h;
    }

    public C0088f(int i2, C0178h[] c0178hArr) {
        this.f207a = i2;
        this.f208b = c0178hArr;
    }

    public C0088f(BottomSheetBehavior bottomSheetBehavior, int i2) {
        this.f208b = bottomSheetBehavior;
        this.f207a = i2;
    }
}
