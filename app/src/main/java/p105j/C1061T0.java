package p105j;

import android.view.KeyEvent;
import android.widget.TextView;
import androidx.appcompat.widget.SearchView;

/* renamed from: j.T0 */
/* loaded from: classes.dex */
public final class C1061T0 implements TextView.OnEditorActionListener {

    /* renamed from: a */
    public final /* synthetic */ SearchView f4433a;

    public C1061T0(SearchView searchView) {
        this.f4433a = searchView;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i2, KeyEvent keyEvent) {
        this.f4433a.m1508s();
        return true;
    }
}
