package p005B1;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import nfc.share.nfcshare.MainActivity;
import p002A1.C0016K;
import p002A1.C0038t;
import p094f0.AbstractC0903B;
import p094f0.AbstractC0926Z;
import tkbmmn.ghwbbf.irvjzy.R;

/* renamed from: B1.f */
/* loaded from: classes.dex */
public final class C0068f extends AbstractC0903B {

    /* renamed from: f */
    public static C0038t f166f;

    /* renamed from: c */
    public MainActivity f167c;

    /* renamed from: d */
    public ArrayList f168d;

    /* renamed from: e */
    public String f169e;

    @Override // p094f0.AbstractC0903B
    /* renamed from: a */
    public final int mo188a() {
        return this.f168d.size();
    }

    @Override // p094f0.AbstractC0903B
    /* renamed from: d */
    public final void mo189d(AbstractC0926Z abstractC0926Z, int i2) {
        C0067e c0067e = (C0067e) abstractC0926Z;
        C0016K c0016k = (C0016K) this.f168d.get(i2);
        if (c0016k == null) {
            return;
        }
        if (this.f169e.equals(c0016k.m44a())) {
            c0067e.f165w.setVisibility(0);
        } else {
            c0067e.f165w.setVisibility(8);
        }
        c0067e.f162t.setText(c0016k.f29a);
        double d3 = c0016k.f33e;
        TextView textView = c0067e.f163u;
        if (d3 == 0.0d) {
            textView.setText("测速中..");
        } else {
            ImageView imageView = c0067e.f164v;
            if (d3 == -1.0d) {
                textView.setText("无法访问");
                imageView.setImageResource(R.drawable.circle_dot_timeout);
            } else {
                if (d3 < 150.0d) {
                    imageView.setImageResource(R.drawable.circle_dot_fast);
                } else if (d3 < 250.0d) {
                    imageView.setImageResource(R.drawable.circle_dot_general);
                } else if (d3 < 350.0d) {
                    imageView.setImageResource(R.drawable.circle_dot_slow);
                } else {
                    imageView.setImageResource(R.drawable.circle_dot_timeout);
                }
                textView.setText(c0016k.f33e + "ms");
            }
        }
        c0067e.f3815a.setOnClickListener(new ViewOnClickListenerC0066d(0, c0016k));
    }

    @Override // p094f0.AbstractC0903B
    /* renamed from: e */
    public final AbstractC0926Z mo190e(ViewGroup viewGroup, int i2) {
        View viewInflate = LayoutInflater.from(this.f167c).inflate(R.layout.layout_item_server, viewGroup, false);
        C0067e c0067e = new C0067e(viewInflate);
        c0067e.f162t = (TextView) viewInflate.findViewById(R.id.serverName);
        c0067e.f163u = (TextView) viewInflate.findViewById(R.id.tv_latency);
        c0067e.f164v = (ImageView) viewInflate.findViewById(R.id.iv_dot);
        c0067e.f165w = (ImageView) viewInflate.findViewById(R.id.iv_check);
        return c0067e;
    }

    /* renamed from: g */
    public final void m191g(ArrayList arrayList, String str) {
        arrayList.size();
        this.f169e = str;
        ArrayList arrayList2 = this.f168d;
        arrayList2.clear();
        arrayList2.addAll(arrayList);
        this.f3738a.m2332b();
    }
}
