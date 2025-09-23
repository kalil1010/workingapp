package p028K;

import android.text.TextUtils;
import android.view.View;

/* renamed from: K.z */
/* loaded from: classes.dex */
public final class C0300z extends AbstractC0227B {

    /* renamed from: e */
    public final /* synthetic */ int f920e;

    public C0300z(int i2, Class cls, int i3, int i4, int i5) {
        this.f920e = i5;
        this.f803a = i2;
        this.f806d = cls;
        this.f805c = i3;
        this.f804b = i4;
    }

    @Override // p028K.AbstractC0227B
    /* renamed from: b */
    public final Object mo611b(View view) {
        switch (this.f920e) {
            case 0:
                return Boolean.valueOf(AbstractC0234I.m667d(view));
            case 1:
                return AbstractC0234I.m665b(view);
            default:
                return Boolean.valueOf(AbstractC0234I.m666c(view));
        }
    }

    @Override // p028K.AbstractC0227B
    /* renamed from: c */
    public final void mo612c(View view, Object obj) {
        switch (this.f920e) {
            case 0:
                AbstractC0234I.m673j(view, ((Boolean) obj).booleanValue());
                break;
            case 1:
                AbstractC0234I.m671h(view, (CharSequence) obj);
                break;
            default:
                AbstractC0234I.m670g(view, ((Boolean) obj).booleanValue());
                break;
        }
    }

    @Override // p028K.AbstractC0227B
    /* renamed from: e */
    public final boolean mo614e(Object obj, Object obj2) {
        switch (this.f920e) {
            case 0:
                Boolean bool = (Boolean) obj;
                Boolean bool2 = (Boolean) obj2;
                return !((bool != null && bool.booleanValue()) == (bool2 != null && bool2.booleanValue()));
            case 1:
                return !TextUtils.equals((CharSequence) obj, (CharSequence) obj2);
            default:
                Boolean bool3 = (Boolean) obj;
                Boolean bool4 = (Boolean) obj2;
                return !((bool3 != null && bool3.booleanValue()) == (bool4 != null && bool4.booleanValue()));
        }
    }
}
