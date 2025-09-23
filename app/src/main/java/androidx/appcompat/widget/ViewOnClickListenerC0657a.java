package androidx.appcompat.widget;

import android.app.SearchableInfo;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Intent;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.widget.SearchView;
import java.lang.reflect.InvocationTargetException;

/* renamed from: androidx.appcompat.widget.a */
/* loaded from: classes.dex */
public final class ViewOnClickListenerC0657a implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ SearchView f2247a;

    public ViewOnClickListenerC0657a(SearchView searchView) {
        this.f2247a = searchView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        SearchView searchView = this.f2247a;
        ImageView imageView = searchView.f2189t;
        SearchView.SearchAutoComplete searchAutoComplete = searchView.f2185p;
        if (view == imageView) {
            searchView.m1514y(false);
            searchAutoComplete.requestFocus();
            searchAutoComplete.setImeVisibility(true);
            View.OnClickListener onClickListener = searchView.f2167L;
            if (onClickListener != null) {
                onClickListener.onClick(searchView);
                return;
            }
            return;
        }
        if (view == searchView.f2191v) {
            searchView.m1504o();
            return;
        }
        if (view == searchView.f2190u) {
            searchView.m1508s();
            return;
        }
        if (view != searchView.f2192w) {
            if (view == searchAutoComplete) {
                searchView.m1503n();
                return;
            }
            return;
        }
        SearchableInfo searchableInfo = searchView.f2180b0;
        if (searchableInfo == null) {
            return;
        }
        try {
            if (!searchableInfo.getVoiceSearchLaunchWebSearch()) {
                if (searchableInfo.getVoiceSearchLaunchRecognizer()) {
                    searchView.getContext().startActivity(searchView.m1502m(searchView.f2164I, searchableInfo));
                }
            } else {
                Intent intent = new Intent(searchView.f2163H);
                ComponentName searchActivity = searchableInfo.getSearchActivity();
                intent.putExtra("calling_package", searchActivity == null ? null : searchActivity.flattenToShortString());
                searchView.getContext().startActivity(intent);
            }
        } catch (ActivityNotFoundException unused) {
        }
    }
}
