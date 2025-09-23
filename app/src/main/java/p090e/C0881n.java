package p090e;

import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import java.util.WeakHashMap;
import p002A1.C0019a;
import p028K.AbstractC0228C;
import p028K.AbstractC0241P;
import p033L1.AbstractC0364l;

/* renamed from: e.n */
/* loaded from: classes.dex */
public final class C0881n extends AbstractC0364l {

    /* renamed from: f */
    public final /* synthetic */ int f3626f;

    /* renamed from: g */
    public final /* synthetic */ Object f3627g;

    public /* synthetic */ C0881n(int i2, Object obj) {
        this.f3626f = i2;
        this.f3627g = obj;
    }

    @Override // p028K.InterfaceC0249Y
    /* renamed from: a */
    public final void mo722a() {
        Object obj = this.f3627g;
        switch (this.f3626f) {
            case 0:
                LayoutInflaterFactory2C0888u layoutInflaterFactory2C0888u = ((RunnableC0879l) obj).f3623b;
                layoutInflaterFactory2C0888u.f3702v.setAlpha(1.0f);
                layoutInflaterFactory2C0888u.f3705y.m720d(null);
                layoutInflaterFactory2C0888u.f3705y = null;
                break;
            case 1:
                LayoutInflaterFactory2C0888u layoutInflaterFactory2C0888u2 = (LayoutInflaterFactory2C0888u) obj;
                layoutInflaterFactory2C0888u2.f3702v.setAlpha(1.0f);
                layoutInflaterFactory2C0888u2.f3705y.m720d(null);
                layoutInflaterFactory2C0888u2.f3705y = null;
                break;
            default:
                C0019a c0019a = (C0019a) obj;
                ((LayoutInflaterFactory2C0888u) c0019a.f46b).f3702v.setVisibility(8);
                LayoutInflaterFactory2C0888u layoutInflaterFactory2C0888u3 = (LayoutInflaterFactory2C0888u) c0019a.f46b;
                PopupWindow popupWindow = layoutInflaterFactory2C0888u3.f3703w;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (layoutInflaterFactory2C0888u3.f3702v.getParent() instanceof View) {
                    View view = (View) layoutInflaterFactory2C0888u3.f3702v.getParent();
                    WeakHashMap weakHashMap = AbstractC0241P.f815a;
                    AbstractC0228C.m617c(view);
                }
                layoutInflaterFactory2C0888u3.f3702v.m1483e();
                layoutInflaterFactory2C0888u3.f3705y.m720d(null);
                layoutInflaterFactory2C0888u3.f3705y = null;
                ViewGroup viewGroup = layoutInflaterFactory2C0888u3.f3657A;
                WeakHashMap weakHashMap2 = AbstractC0241P.f815a;
                AbstractC0228C.m617c(viewGroup);
                break;
        }
    }

    @Override // p033L1.AbstractC0364l, p028K.InterfaceC0249Y
    /* renamed from: g */
    public void mo724g() {
        Object obj = this.f3627g;
        switch (this.f3626f) {
            case 0:
                ((RunnableC0879l) obj).f3623b.f3702v.setVisibility(0);
                break;
            case 1:
                LayoutInflaterFactory2C0888u layoutInflaterFactory2C0888u = (LayoutInflaterFactory2C0888u) obj;
                layoutInflaterFactory2C0888u.f3702v.setVisibility(0);
                if (layoutInflaterFactory2C0888u.f3702v.getParent() instanceof View) {
                    View view = (View) layoutInflaterFactory2C0888u.f3702v.getParent();
                    WeakHashMap weakHashMap = AbstractC0241P.f815a;
                    AbstractC0228C.m617c(view);
                    break;
                }
                break;
        }
    }
}
