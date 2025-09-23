package p028K;

import android.view.ContentInfo;
import android.view.OnReceiveContentListener;
import android.view.View;
import java.util.Objects;
import p001A0.C0004c;
import p007C0.AbstractC0083a;
import p045Q.C0453q;

/* renamed from: K.M */
/* loaded from: classes.dex */
public final class OnReceiveContentListenerC0238M implements OnReceiveContentListener {

    /* renamed from: a */
    public final InterfaceC0285r f810a;

    public OnReceiveContentListenerC0238M(InterfaceC0285r interfaceC0285r) {
        this.f810a = interfaceC0285r;
    }

    public final ContentInfo onReceiveContent(View view, ContentInfo contentInfo) {
        C0261f c0261f = new C0261f(new C0004c(contentInfo));
        C0261f c0261fM1138a = ((C0453q) this.f810a).m1138a(view, c0261f);
        if (c0261fM1138a == null) {
            return null;
        }
        if (c0261fM1138a == c0261f) {
            return contentInfo;
        }
        ContentInfo contentInfoMo24k = c0261fM1138a.f852a.mo24k();
        Objects.requireNonNull(contentInfoMo24k);
        return AbstractC0083a.m271g(contentInfoMo24k);
    }
}
