package p005B1;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import nfc.share.nfcshare.MainActivity;
import nfc.share.nfcshare.model.CurrencyLookup;
import nfc.share.nfcshare.model.LogBean;
import p085c2.AbstractC0808b;
import p094f0.AbstractC0903B;
import p094f0.AbstractC0926Z;
import tkbmmn.ghwbbf.irvjzy.R;

/* renamed from: B1.c */
/* loaded from: classes.dex */
public final class C0065c extends AbstractC0903B {

    /* renamed from: c */
    public ArrayList f157c;

    /* renamed from: d */
    public MainActivity f158d;

    /* renamed from: e */
    public RecyclerView f159e;

    static {
        AbstractC0808b.m2014d(C0065c.class);
    }

    @Override // p094f0.AbstractC0903B
    /* renamed from: a */
    public final int mo188a() {
        return this.f157c.size();
    }

    @Override // p094f0.AbstractC0903B
    /* renamed from: d */
    public final void mo189d(AbstractC0926Z abstractC0926Z, int i2) {
        C0064b c0064b = (C0064b) abstractC0926Z;
        TextView textView = c0064b.f156v;
        ArrayList arrayList = this.f157c;
        textView.setText(((LogBean) arrayList.get(i2)).getDate());
        c0064b.f154t.setText(((LogBean) arrayList.get(i2)).getAmountStr());
        CurrencyLookup.CurrencyInfo currencyInfo = ((LogBean) arrayList.get(i2)).getCurrencyInfo();
        TextView textView2 = c0064b.f155u;
        if (currencyInfo == null) {
            textView2.setText("");
            return;
        }
        textView2.setText(currencyInfo.getFlag() + " " + currencyInfo.getCurrencyCode());
    }

    @Override // p094f0.AbstractC0903B
    /* renamed from: e */
    public final AbstractC0926Z mo190e(ViewGroup viewGroup, int i2) {
        View viewInflate = LayoutInflater.from(this.f158d).inflate(R.layout.layout_item_log, viewGroup, false);
        C0064b c0064b = new C0064b(viewInflate);
        c0064b.f154t = (TextView) viewInflate.findViewById(R.id.tv_amount);
        c0064b.f156v = (TextView) viewInflate.findViewById(R.id.tv_date);
        c0064b.f155u = (TextView) viewInflate.findViewById(R.id.tv_country);
        return c0064b;
    }
}
