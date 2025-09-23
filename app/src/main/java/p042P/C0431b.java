package p042P;

import android.content.ClipData;
import android.content.ClipDescription;
import android.os.Build;
import android.os.Bundle;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.view.inputmethod.InputContentInfo;
import p001A0.C0004c;
import p002A1.C0013H;
import p028K.AbstractC0241P;
import p028K.C0257d;
import p028K.InterfaceC0255c;
import p105j.C1136v;

/* renamed from: P.b */
/* loaded from: classes.dex */
public final class C0431b extends InputConnectionWrapper {

    /* renamed from: a */
    public final /* synthetic */ C0013H f1317a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0431b(InputConnection inputConnection, C0013H c0013h) {
        super(inputConnection, false);
        this.f1317a = c0013h;
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i2, Bundle bundle) {
        Bundle bundle2;
        InterfaceC0255c c0004c;
        C0004c c0004c2 = inputContentInfo == null ? null : new C0004c(16, new C0004c(15, inputContentInfo));
        C0013H c0013h = this.f1317a;
        if ((i2 & 1) != 0) {
            try {
                ((InputContentInfo) ((C0004c) c0004c2.f7b).f7b).requestPermission();
                InputContentInfo inputContentInfo2 = (InputContentInfo) ((C0004c) c0004c2.f7b).f7b;
                bundle2 = bundle == null ? new Bundle() : new Bundle(bundle);
                bundle2.putParcelable("androidx.core.view.extra.INPUT_CONTENT_INFO", inputContentInfo2);
            } catch (Exception unused) {
            }
        } else {
            bundle2 = bundle;
        }
        ClipDescription description = ((InputContentInfo) ((C0004c) c0004c2.f7b).f7b).getDescription();
        C0004c c0004c3 = (C0004c) c0004c2.f7b;
        ClipData clipData = new ClipData(description, new ClipData.Item(((InputContentInfo) c0004c3.f7b).getContentUri()));
        if (Build.VERSION.SDK_INT >= 31) {
            c0004c = new C0004c(clipData, 2);
        } else {
            C0257d c0257d = new C0257d();
            c0257d.f840b = clipData;
            c0257d.f841c = 2;
            c0004c = c0257d;
        }
        c0004c.mo15b(((InputContentInfo) c0004c3.f7b).getLinkUri());
        c0004c.mo14a(bundle2);
        if (AbstractC0241P.m697i((C1136v) c0013h.f21a, c0004c.mo20g()) == null) {
            return true;
        }
        return super.commitContent(inputContentInfo, i2, bundle);
    }
}
