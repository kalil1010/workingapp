package p105j;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import androidx.appcompat.widget.SearchView;

/* renamed from: j.R0 */
/* loaded from: classes.dex */
public final class C1057R0 implements TextWatcher {

    /* renamed from: a */
    public final /* synthetic */ SearchView f4421a;

    public C1057R0(SearchView searchView) {
        this.f4421a = searchView;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        SearchView searchView = this.f4421a;
        Editable text = searchView.f2185p.getText();
        searchView.f2177V = text;
        boolean zIsEmpty = TextUtils.isEmpty(text);
        searchView.m1513x(!zIsEmpty);
        int i5 = 8;
        if (searchView.f2176U && !searchView.f2169N && zIsEmpty) {
            searchView.f2190u.setVisibility(8);
            i5 = 0;
        }
        searchView.f2192w.setVisibility(i5);
        searchView.m1509t();
        searchView.m1512w();
        charSequence.toString();
    }
}
