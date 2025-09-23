package p048R;

import android.database.ContentObserver;
import android.database.Cursor;
import android.os.Handler;
import p105j.ViewOnClickListenerC1076a1;

/* renamed from: R.a */
/* loaded from: classes.dex */
public final class C0468a extends ContentObserver {

    /* renamed from: a */
    public final /* synthetic */ ViewOnClickListenerC1076a1 f1447a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0468a(ViewOnClickListenerC1076a1 viewOnClickListenerC1076a1) {
        super(new Handler());
        this.f1447a = viewOnClickListenerC1076a1;
    }

    @Override // android.database.ContentObserver
    public final boolean deliverSelfNotifications() {
        return true;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z2) {
        Cursor cursor;
        ViewOnClickListenerC1076a1 viewOnClickListenerC1076a1 = this.f1447a;
        if (!viewOnClickListenerC1076a1.f1451b || (cursor = viewOnClickListenerC1076a1.f1452c) == null || cursor.isClosed()) {
            return;
        }
        viewOnClickListenerC1076a1.f1450a = viewOnClickListenerC1076a1.f1452c.requery();
    }
}
