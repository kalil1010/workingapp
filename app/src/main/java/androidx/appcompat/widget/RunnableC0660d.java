package androidx.appcompat.widget;

import android.view.inputmethod.InputMethodManager;
import androidx.appcompat.widget.SearchView;

/* renamed from: androidx.appcompat.widget.d */
/* loaded from: classes.dex */
public final class RunnableC0660d implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ SearchView.SearchAutoComplete f2249a;

    public RunnableC0660d(SearchView.SearchAutoComplete searchAutoComplete) {
        this.f2249a = searchAutoComplete;
    }

    @Override // java.lang.Runnable
    public final void run() {
        SearchView.SearchAutoComplete searchAutoComplete = this.f2249a;
        if (searchAutoComplete.f2198g) {
            ((InputMethodManager) searchAutoComplete.getContext().getSystemService("input_method")).showSoftInput(searchAutoComplete, 0);
            searchAutoComplete.f2198g = false;
        }
    }
}
