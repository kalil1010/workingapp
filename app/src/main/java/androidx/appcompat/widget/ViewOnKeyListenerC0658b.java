package androidx.appcompat.widget;

import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import androidx.appcompat.widget.SearchView;
import java.lang.reflect.InvocationTargetException;

/* renamed from: androidx.appcompat.widget.b */
/* loaded from: classes.dex */
public final class ViewOnKeyListenerC0658b implements View.OnKeyListener {

    /* renamed from: a */
    public final /* synthetic */ SearchView f2248a;

    public ViewOnKeyListenerC0658b(SearchView searchView) {
        this.f2248a = searchView;
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i2, KeyEvent keyEvent) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        SearchView searchView = this.f2248a;
        if (searchView.f2180b0 != null) {
            SearchView.SearchAutoComplete searchAutoComplete = searchView.f2185p;
            if (!searchAutoComplete.isPopupShowing() || searchAutoComplete.getListSelection() == -1) {
                if (TextUtils.getTrimmedLength(searchAutoComplete.getText()) != 0 && keyEvent.hasNoModifiers() && keyEvent.getAction() == 1 && i2 == 66) {
                    view.cancelLongPress();
                    searchView.getContext().startActivity(searchView.m1501l("android.intent.action.SEARCH", null, null, searchAutoComplete.getText().toString()));
                    return true;
                }
            } else if (searchView.f2180b0 != null && searchView.f2170O != null && keyEvent.getAction() == 0 && keyEvent.hasNoModifiers()) {
                if (i2 == 66 || i2 == 84 || i2 == 61) {
                    searchView.m1505p(searchAutoComplete.getListSelection());
                    return true;
                }
                if (i2 == 21 || i2 == 22) {
                    searchAutoComplete.setSelection(i2 == 21 ? 0 : searchAutoComplete.length());
                    searchAutoComplete.setListSelection(0);
                    searchAutoComplete.clearListSelection();
                    searchAutoComplete.m1515a();
                    return true;
                }
                if (i2 == 19) {
                    searchAutoComplete.getListSelection();
                    return false;
                }
            }
        }
        return false;
    }
}
