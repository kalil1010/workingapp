package p090e;

import android.content.DialogInterface;
import android.view.View;
import android.widget.AdapterView;

/* renamed from: e.b */
/* loaded from: classes.dex */
public final class C0869b implements AdapterView.OnItemClickListener {

    /* renamed from: a */
    public final /* synthetic */ C0872e f3566a;

    /* renamed from: b */
    public final /* synthetic */ C0870c f3567b;

    public C0869b(C0870c c0870c, C0872e c0872e) {
        this.f3567b = c0870c;
        this.f3566a = c0872e;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i2, long j2) {
        C0870c c0870c = this.f3567b;
        DialogInterface.OnClickListener onClickListener = c0870c.f3575h;
        C0872e c0872e = this.f3566a;
        onClickListener.onClick(c0872e.f3579b, i2);
        if (c0870c.f3576i) {
            return;
        }
        c0872e.f3579b.dismiss();
    }
}
