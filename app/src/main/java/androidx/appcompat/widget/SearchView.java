package androidx.appcompat.widget;

import android.app.PendingIntent;
import android.app.SearchableInfo;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import p002A1.C0027i;
import p002A1.ViewOnFocusChangeListenerC0023e;
import p004B0.ViewOnLayoutChangeListenerC0062a;
import p028K.AbstractC0241P;
import p033L1.AbstractC0364l;
import p036M1.C0406i;
import p048R.AbstractC0470c;
import p064W0.C0574t;
import p086d.AbstractC0843a;
import p099h.InterfaceC0972b;
import p105j.AbstractC1145z0;
import p105j.C1024A0;
import p105j.C1057R0;
import p105j.C1061T0;
import p105j.C1069X0;
import p105j.C1071Y0;
import p105j.C1116o;
import p105j.InterfaceC1063U0;
import p105j.InterfaceC1065V0;
import p105j.InterfaceC1067W0;
import p105j.RunnableC1059S0;
import p105j.ViewOnClickListenerC1076a1;
import tkbmmn.ghwbbf.irvjzy.R;

/* loaded from: classes.dex */
public class SearchView extends AbstractC1145z0 implements InterfaceC0972b {

    /* renamed from: g0 */
    public static final C0406i f2155g0;

    /* renamed from: A */
    public final Rect f2156A;

    /* renamed from: B */
    public final int[] f2157B;

    /* renamed from: C */
    public final int[] f2158C;

    /* renamed from: D */
    public final ImageView f2159D;

    /* renamed from: E */
    public final Drawable f2160E;

    /* renamed from: F */
    public final int f2161F;

    /* renamed from: G */
    public final int f2162G;

    /* renamed from: H */
    public final Intent f2163H;

    /* renamed from: I */
    public final Intent f2164I;

    /* renamed from: J */
    public final CharSequence f2165J;

    /* renamed from: K */
    public View.OnFocusChangeListener f2166K;

    /* renamed from: L */
    public View.OnClickListener f2167L;

    /* renamed from: M */
    public boolean f2168M;

    /* renamed from: N */
    public boolean f2169N;

    /* renamed from: O */
    public AbstractC0470c f2170O;

    /* renamed from: P */
    public boolean f2171P;

    /* renamed from: Q */
    public CharSequence f2172Q;

    /* renamed from: R */
    public boolean f2173R;

    /* renamed from: S */
    public boolean f2174S;

    /* renamed from: T */
    public int f2175T;

    /* renamed from: U */
    public boolean f2176U;

    /* renamed from: V */
    public CharSequence f2177V;

    /* renamed from: W */
    public boolean f2178W;

    /* renamed from: a0 */
    public int f2179a0;

    /* renamed from: b0 */
    public SearchableInfo f2180b0;

    /* renamed from: c0 */
    public Bundle f2181c0;

    /* renamed from: d0 */
    public final RunnableC1059S0 f2182d0;

    /* renamed from: e0 */
    public final RunnableC1059S0 f2183e0;

    /* renamed from: f0 */
    public final WeakHashMap f2184f0;

    /* renamed from: p */
    public final SearchAutoComplete f2185p;

    /* renamed from: q */
    public final View f2186q;

    /* renamed from: r */
    public final View f2187r;

    /* renamed from: s */
    public final View f2188s;

    /* renamed from: t */
    public final ImageView f2189t;

    /* renamed from: u */
    public final ImageView f2190u;

    /* renamed from: v */
    public final ImageView f2191v;

    /* renamed from: w */
    public final ImageView f2192w;

    /* renamed from: x */
    public final View f2193x;

    /* renamed from: y */
    public C1071Y0 f2194y;

    /* renamed from: z */
    public final Rect f2195z;

    public static class SearchAutoComplete extends C1116o {

        /* renamed from: e */
        public int f2196e;

        /* renamed from: f */
        public SearchView f2197f;

        /* renamed from: g */
        public boolean f2198g;

        /* renamed from: h */
        public final RunnableC0660d f2199h;

        public SearchAutoComplete(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f2199h = new RunnableC0660d(this);
            this.f2196e = getThreshold();
        }

        private int getSearchViewTextMinWidthDp() {
            Configuration configuration = getResources().getConfiguration();
            int i2 = configuration.screenWidthDp;
            int i3 = configuration.screenHeightDp;
            if (i2 >= 960 && i3 >= 720 && configuration.orientation == 2) {
                return 256;
            }
            if (i2 < 600) {
                return (i2 < 640 || i3 < 480) ? 160 : 192;
            }
            return 192;
        }

        /* renamed from: a */
        public final void m1515a() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            if (Build.VERSION.SDK_INT >= 29) {
                AbstractC0659c.m1539b(this, 1);
                if (enoughToFilter()) {
                    showDropDown();
                    return;
                }
                return;
            }
            C0406i c0406i = SearchView.f2155g0;
            c0406i.getClass();
            C0406i.m1083a();
            Method method = c0406i.f1288c;
            if (method != null) {
                try {
                    method.invoke(this, Boolean.TRUE);
                } catch (Exception unused) {
                }
            }
        }

        @Override // android.widget.AutoCompleteTextView
        public final boolean enoughToFilter() {
            return this.f2196e <= 0 || super.enoughToFilter();
        }

        @Override // p105j.C1116o, android.widget.TextView, android.view.View
        public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
            InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
            if (this.f2198g) {
                RunnableC0660d runnableC0660d = this.f2199h;
                removeCallbacks(runnableC0660d);
                post(runnableC0660d);
            }
            return inputConnectionOnCreateInputConnection;
        }

        @Override // android.view.View
        public final void onFinishInflate() {
            super.onFinishInflate();
            setMinWidth((int) TypedValue.applyDimension(1, getSearchViewTextMinWidthDp(), getResources().getDisplayMetrics()));
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public final void onFocusChanged(boolean z2, int i2, Rect rect) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            super.onFocusChanged(z2, i2, rect);
            SearchView searchView = this.f2197f;
            searchView.m1514y(searchView.f2169N);
            searchView.post(searchView.f2182d0);
            if (searchView.f2185p.hasFocus()) {
                searchView.m1503n();
            }
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public final boolean onKeyPreIme(int i2, KeyEvent keyEvent) {
            if (i2 == 4) {
                if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                    KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
                    if (keyDispatcherState != null) {
                        keyDispatcherState.startTracking(keyEvent, this);
                    }
                    return true;
                }
                if (keyEvent.getAction() == 1) {
                    KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                    if (keyDispatcherState2 != null) {
                        keyDispatcherState2.handleUpEvent(keyEvent);
                    }
                    if (keyEvent.isTracking() && !keyEvent.isCanceled()) {
                        this.f2197f.clearFocus();
                        setImeVisibility(false);
                        return true;
                    }
                }
            }
            return super.onKeyPreIme(i2, keyEvent);
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public final void onWindowFocusChanged(boolean z2) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            super.onWindowFocusChanged(z2);
            if (z2 && this.f2197f.hasFocus() && getVisibility() == 0) {
                this.f2198g = true;
                Context context = getContext();
                C0406i c0406i = SearchView.f2155g0;
                if (context.getResources().getConfiguration().orientation == 2) {
                    m1515a();
                }
            }
        }

        @Override // android.widget.AutoCompleteTextView
        public final void performCompletion() {
        }

        @Override // android.widget.AutoCompleteTextView
        public final void replaceText(CharSequence charSequence) {
        }

        public void setImeVisibility(boolean z2) {
            InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
            RunnableC0660d runnableC0660d = this.f2199h;
            if (!z2) {
                this.f2198g = false;
                removeCallbacks(runnableC0660d);
                inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
            } else {
                if (!inputMethodManager.isActive(this)) {
                    this.f2198g = true;
                    return;
                }
                this.f2198g = false;
                removeCallbacks(runnableC0660d);
                inputMethodManager.showSoftInput(this, 0);
            }
        }

        public void setSearchView(SearchView searchView) {
            this.f2197f = searchView;
        }

        @Override // android.widget.AutoCompleteTextView
        public void setThreshold(int i2) {
            super.setThreshold(i2);
            this.f2196e = i2;
        }
    }

    static {
        C0406i c0406i = null;
        if (Build.VERSION.SDK_INT < 29) {
            C0406i c0406i2 = new C0406i();
            c0406i2.f1286a = null;
            c0406i2.f1287b = null;
            c0406i2.f1288c = null;
            C0406i.m1083a();
            try {
                Method declaredMethod = AutoCompleteTextView.class.getDeclaredMethod("doBeforeTextChanged", new Class[0]);
                c0406i2.f1286a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            try {
                Method declaredMethod2 = AutoCompleteTextView.class.getDeclaredMethod("doAfterTextChanged", new Class[0]);
                c0406i2.f1287b = declaredMethod2;
                declaredMethod2.setAccessible(true);
            } catch (NoSuchMethodException unused2) {
            }
            try {
                Method method = AutoCompleteTextView.class.getMethod("ensureImeVisible", Boolean.TYPE);
                c0406i2.f1288c = method;
                method.setAccessible(true);
            } catch (NoSuchMethodException unused3) {
            }
            c0406i = c0406i2;
        }
        f2155g0 = c0406i;
    }

    public SearchView(Context context) {
        this(context, null);
    }

    private int getPreferredHeight() {
        return getContext().getResources().getDimensionPixelSize(R.dimen.abc_search_view_preferred_height);
    }

    private int getPreferredWidth() {
        return getContext().getResources().getDimensionPixelSize(R.dimen.abc_search_view_preferred_width);
    }

    private void setQuery(CharSequence charSequence) {
        SearchAutoComplete searchAutoComplete = this.f2185p;
        searchAutoComplete.setText(charSequence);
        searchAutoComplete.setSelection(TextUtils.isEmpty(charSequence) ? 0 : charSequence.length());
    }

    @Override // p099h.InterfaceC0972b
    /* renamed from: a */
    public final void mo1499a() {
        if (this.f2178W) {
            return;
        }
        this.f2178W = true;
        SearchAutoComplete searchAutoComplete = this.f2185p;
        int imeOptions = searchAutoComplete.getImeOptions();
        this.f2179a0 = imeOptions;
        searchAutoComplete.setImeOptions(imeOptions | 33554432);
        searchAutoComplete.setText("");
        setIconified(false);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void clearFocus() {
        this.f2174S = true;
        super.clearFocus();
        SearchAutoComplete searchAutoComplete = this.f2185p;
        searchAutoComplete.clearFocus();
        searchAutoComplete.setImeVisibility(false);
        this.f2174S = false;
    }

    @Override // p099h.InterfaceC0972b
    /* renamed from: d */
    public final void mo1500d() {
        SearchAutoComplete searchAutoComplete = this.f2185p;
        searchAutoComplete.setText("");
        searchAutoComplete.setSelection(searchAutoComplete.length());
        this.f2177V = "";
        clearFocus();
        m1514y(true);
        searchAutoComplete.setImeOptions(this.f2179a0);
        this.f2178W = false;
    }

    public int getImeOptions() {
        return this.f2185p.getImeOptions();
    }

    public int getInputType() {
        return this.f2185p.getInputType();
    }

    public int getMaxWidth() {
        return this.f2175T;
    }

    public CharSequence getQuery() {
        return this.f2185p.getText();
    }

    public CharSequence getQueryHint() {
        CharSequence charSequence = this.f2172Q;
        if (charSequence != null) {
            return charSequence;
        }
        SearchableInfo searchableInfo = this.f2180b0;
        return (searchableInfo == null || searchableInfo.getHintId() == 0) ? this.f2165J : getContext().getText(this.f2180b0.getHintId());
    }

    public int getSuggestionCommitIconResId() {
        return this.f2162G;
    }

    public int getSuggestionRowLayout() {
        return this.f2161F;
    }

    public AbstractC0470c getSuggestionsAdapter() {
        return this.f2170O;
    }

    /* renamed from: l */
    public final Intent m1501l(String str, Uri uri, String str2, String str3) {
        Intent intent = new Intent(str);
        intent.addFlags(268435456);
        if (uri != null) {
            intent.setData(uri);
        }
        intent.putExtra("user_query", this.f2177V);
        if (str3 != null) {
            intent.putExtra("query", str3);
        }
        if (str2 != null) {
            intent.putExtra("intent_extra_data_key", str2);
        }
        Bundle bundle = this.f2181c0;
        if (bundle != null) {
            intent.putExtra("app_data", bundle);
        }
        intent.setComponent(this.f2180b0.getSearchActivity());
        return intent;
    }

    /* renamed from: m */
    public final Intent m1502m(Intent intent, SearchableInfo searchableInfo) {
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        Intent intent2 = new Intent("android.intent.action.SEARCH");
        intent2.setComponent(searchActivity);
        PendingIntent activity = PendingIntent.getActivity(getContext(), 0, intent2, 1107296256);
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f2181c0;
        if (bundle2 != null) {
            bundle.putParcelable("app_data", bundle2);
        }
        Intent intent3 = new Intent(intent);
        Resources resources = getResources();
        String string = searchableInfo.getVoiceLanguageModeId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageModeId()) : "free_form";
        String string2 = searchableInfo.getVoicePromptTextId() != 0 ? resources.getString(searchableInfo.getVoicePromptTextId()) : null;
        String string3 = searchableInfo.getVoiceLanguageId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageId()) : null;
        int voiceMaxResults = searchableInfo.getVoiceMaxResults() != 0 ? searchableInfo.getVoiceMaxResults() : 1;
        intent3.putExtra("android.speech.extra.LANGUAGE_MODEL", string);
        intent3.putExtra("android.speech.extra.PROMPT", string2);
        intent3.putExtra("android.speech.extra.LANGUAGE", string3);
        intent3.putExtra("android.speech.extra.MAX_RESULTS", voiceMaxResults);
        intent3.putExtra("calling_package", searchActivity != null ? searchActivity.flattenToShortString() : null);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT", activity);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT_BUNDLE", bundle);
        return intent3;
    }

    /* renamed from: n */
    public final void m1503n() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        int i2 = Build.VERSION.SDK_INT;
        SearchAutoComplete searchAutoComplete = this.f2185p;
        if (i2 >= 29) {
            AbstractC0659c.m1538a(searchAutoComplete);
            return;
        }
        C0406i c0406i = f2155g0;
        c0406i.getClass();
        C0406i.m1083a();
        Method method = c0406i.f1286a;
        if (method != null) {
            try {
                method.invoke(searchAutoComplete, new Object[0]);
            } catch (Exception unused) {
            }
        }
        c0406i.getClass();
        C0406i.m1083a();
        Method method2 = c0406i.f1287b;
        if (method2 != null) {
            try {
                method2.invoke(searchAutoComplete, new Object[0]);
            } catch (Exception unused2) {
            }
        }
    }

    /* renamed from: o */
    public final void m1504o() {
        SearchAutoComplete searchAutoComplete = this.f2185p;
        if (!TextUtils.isEmpty(searchAutoComplete.getText())) {
            searchAutoComplete.setText("");
            searchAutoComplete.requestFocus();
            searchAutoComplete.setImeVisibility(true);
        } else if (this.f2168M) {
            clearFocus();
            m1514y(true);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        removeCallbacks(this.f2182d0);
        post(this.f2183e0);
        super.onDetachedFromWindow();
    }

    @Override // p105j.AbstractC1145z0, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        super.onLayout(z2, i2, i3, i4, i5);
        if (z2) {
            int[] iArr = this.f2157B;
            SearchAutoComplete searchAutoComplete = this.f2185p;
            searchAutoComplete.getLocationInWindow(iArr);
            int[] iArr2 = this.f2158C;
            getLocationInWindow(iArr2);
            int i6 = iArr[1] - iArr2[1];
            int i7 = iArr[0] - iArr2[0];
            int width = searchAutoComplete.getWidth() + i7;
            int height = searchAutoComplete.getHeight() + i6;
            Rect rect = this.f2195z;
            rect.set(i7, i6, width, height);
            int i8 = rect.left;
            int i9 = rect.right;
            int i10 = i5 - i3;
            Rect rect2 = this.f2156A;
            rect2.set(i8, 0, i9, i10);
            C1071Y0 c1071y0 = this.f2194y;
            if (c1071y0 == null) {
                C1071Y0 c1071y02 = new C1071Y0(rect2, rect, searchAutoComplete);
                this.f2194y = c1071y02;
                setTouchDelegate(c1071y02);
            } else {
                c1071y0.f4440b.set(rect2);
                Rect rect3 = c1071y0.f4442d;
                rect3.set(rect2);
                int i11 = -c1071y0.f4443e;
                rect3.inset(i11, i11);
                c1071y0.f4441c.set(rect);
            }
        }
    }

    @Override // p105j.AbstractC1145z0, android.view.View
    public final void onMeasure(int i2, int i3) {
        int i4;
        if (this.f2169N) {
            super.onMeasure(i2, i3);
            return;
        }
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (mode == Integer.MIN_VALUE) {
            int i5 = this.f2175T;
            size = i5 > 0 ? Math.min(i5, size) : Math.min(getPreferredWidth(), size);
        } else if (mode == 0) {
            size = this.f2175T;
            if (size <= 0) {
                size = getPreferredWidth();
            }
        } else if (mode == 1073741824 && (i4 = this.f2175T) > 0) {
            size = Math.min(i4, size);
        }
        int mode2 = View.MeasureSpec.getMode(i3);
        int size2 = View.MeasureSpec.getSize(i3);
        if (mode2 == Integer.MIN_VALUE) {
            size2 = Math.min(getPreferredHeight(), size2);
        } else if (mode2 == 0) {
            size2 = getPreferredHeight();
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C1069X0)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C1069X0 c1069x0 = (C1069X0) parcelable;
        super.onRestoreInstanceState(c1069x0.f1521a);
        m1514y(c1069x0.f4438c);
        requestLayout();
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        C1069X0 c1069x0 = new C1069X0(super.onSaveInstanceState());
        c1069x0.f4438c = this.f2169N;
        return c1069x0;
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z2) {
        super.onWindowFocusChanged(z2);
        post(this.f2182d0);
    }

    /* renamed from: p */
    public final void m1505p(int i2) {
        String strM2691h;
        Cursor cursor = this.f2170O.f1452c;
        if (cursor != null && cursor.moveToPosition(i2)) {
            Intent intentM1501l = null;
            try {
                try {
                    int i3 = ViewOnClickListenerC1076a1.f4466x;
                    String strM2691h2 = ViewOnClickListenerC1076a1.m2691h(cursor, cursor.getColumnIndex("suggest_intent_action"));
                    if (strM2691h2 == null) {
                        strM2691h2 = this.f2180b0.getSuggestIntentAction();
                    }
                    if (strM2691h2 == null) {
                        strM2691h2 = "android.intent.action.SEARCH";
                    }
                    String strM2691h3 = ViewOnClickListenerC1076a1.m2691h(cursor, cursor.getColumnIndex("suggest_intent_data"));
                    if (strM2691h3 == null) {
                        strM2691h3 = this.f2180b0.getSuggestIntentData();
                    }
                    if (strM2691h3 != null && (strM2691h = ViewOnClickListenerC1076a1.m2691h(cursor, cursor.getColumnIndex("suggest_intent_data_id"))) != null) {
                        strM2691h3 = strM2691h3 + "/" + Uri.encode(strM2691h);
                    }
                    intentM1501l = m1501l(strM2691h2, strM2691h3 == null ? null : Uri.parse(strM2691h3), ViewOnClickListenerC1076a1.m2691h(cursor, cursor.getColumnIndex("suggest_intent_extra_data")), ViewOnClickListenerC1076a1.m2691h(cursor, cursor.getColumnIndex("suggest_intent_query")));
                } catch (RuntimeException unused) {
                }
            } catch (RuntimeException unused2) {
                cursor.getPosition();
            }
            if (intentM1501l != null) {
                try {
                    getContext().startActivity(intentM1501l);
                } catch (RuntimeException unused3) {
                    intentM1501l.toString();
                }
            }
        }
        SearchAutoComplete searchAutoComplete = this.f2185p;
        searchAutoComplete.setImeVisibility(false);
        searchAutoComplete.dismissDropDown();
    }

    /* renamed from: q */
    public final void m1506q(int i2) {
        Editable text = this.f2185p.getText();
        Cursor cursor = this.f2170O.f1452c;
        if (cursor == null) {
            return;
        }
        if (!cursor.moveToPosition(i2)) {
            setQuery(text);
            return;
        }
        String strMo1159c = this.f2170O.mo1159c(cursor);
        if (strMo1159c != null) {
            setQuery(strMo1159c);
        } else {
            setQuery(text);
        }
    }

    /* renamed from: r */
    public final void m1507r(CharSequence charSequence) {
        setQuery(charSequence);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean requestFocus(int i2, Rect rect) {
        if (this.f2174S || !isFocusable()) {
            return false;
        }
        if (this.f2169N) {
            return super.requestFocus(i2, rect);
        }
        boolean zRequestFocus = this.f2185p.requestFocus(i2, rect);
        if (zRequestFocus) {
            m1514y(false);
        }
        return zRequestFocus;
    }

    /* renamed from: s */
    public final void m1508s() {
        SearchAutoComplete searchAutoComplete = this.f2185p;
        Editable text = searchAutoComplete.getText();
        if (text == null || TextUtils.getTrimmedLength(text) <= 0) {
            return;
        }
        if (this.f2180b0 != null) {
            getContext().startActivity(m1501l("android.intent.action.SEARCH", null, null, text.toString()));
        }
        searchAutoComplete.setImeVisibility(false);
        searchAutoComplete.dismissDropDown();
    }

    public void setAppSearchData(Bundle bundle) {
        this.f2181c0 = bundle;
    }

    public void setIconified(boolean z2) {
        if (z2) {
            m1504o();
            return;
        }
        m1514y(false);
        SearchAutoComplete searchAutoComplete = this.f2185p;
        searchAutoComplete.requestFocus();
        searchAutoComplete.setImeVisibility(true);
        View.OnClickListener onClickListener = this.f2167L;
        if (onClickListener != null) {
            onClickListener.onClick(this);
        }
    }

    public void setIconifiedByDefault(boolean z2) {
        if (this.f2168M == z2) {
            return;
        }
        this.f2168M = z2;
        m1514y(z2);
        m1511v();
    }

    public void setImeOptions(int i2) {
        this.f2185p.setImeOptions(i2);
    }

    public void setInputType(int i2) {
        this.f2185p.setInputType(i2);
    }

    public void setMaxWidth(int i2) {
        this.f2175T = i2;
        requestLayout();
    }

    public void setOnCloseListener(InterfaceC1063U0 interfaceC1063U0) {
    }

    public void setOnQueryTextFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        this.f2166K = onFocusChangeListener;
    }

    public void setOnQueryTextListener(InterfaceC1065V0 interfaceC1065V0) {
    }

    public void setOnSearchClickListener(View.OnClickListener onClickListener) {
        this.f2167L = onClickListener;
    }

    public void setOnSuggestionListener(InterfaceC1067W0 interfaceC1067W0) {
    }

    public void setQueryHint(CharSequence charSequence) {
        this.f2172Q = charSequence;
        m1511v();
    }

    public void setQueryRefinementEnabled(boolean z2) {
        this.f2173R = z2;
        AbstractC0470c abstractC0470c = this.f2170O;
        if (abstractC0470c instanceof ViewOnClickListenerC1076a1) {
            ((ViewOnClickListenerC1076a1) abstractC0470c).f4475p = z2 ? 2 : 1;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0098  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void setSearchableInfo(android.app.SearchableInfo r7) {
        /*
            r6 = this;
            r6.f2180b0 = r7
            r0 = 0
            r1 = 1
            androidx.appcompat.widget.SearchView$SearchAutoComplete r2 = r6.f2185p
            if (r7 == 0) goto L65
            int r7 = r7.getSuggestThreshold()
            r2.setThreshold(r7)
            android.app.SearchableInfo r7 = r6.f2180b0
            int r7 = r7.getImeOptions()
            r2.setImeOptions(r7)
            android.app.SearchableInfo r7 = r6.f2180b0
            int r7 = r7.getInputType()
            r3 = r7 & 15
            if (r3 != r1) goto L31
            r3 = -65537(0xfffffffffffeffff, float:NaN)
            r7 = r7 & r3
            android.app.SearchableInfo r3 = r6.f2180b0
            java.lang.String r3 = r3.getSuggestAuthority()
            if (r3 == 0) goto L31
            r3 = 589824(0x90000, float:8.2652E-40)
            r7 = r7 | r3
        L31:
            r2.setInputType(r7)
            R.c r7 = r6.f2170O
            if (r7 == 0) goto L3b
            r7.mo1158b(r0)
        L3b:
            android.app.SearchableInfo r7 = r6.f2180b0
            java.lang.String r7 = r7.getSuggestAuthority()
            if (r7 == 0) goto L62
            j.a1 r7 = new j.a1
            android.content.Context r3 = r6.getContext()
            android.app.SearchableInfo r4 = r6.f2180b0
            java.util.WeakHashMap r5 = r6.f2184f0
            r7.<init>(r3, r6, r4, r5)
            r6.f2170O = r7
            r2.setAdapter(r7)
            R.c r7 = r6.f2170O
            j.a1 r7 = (p105j.ViewOnClickListenerC1076a1) r7
            boolean r3 = r6.f2173R
            if (r3 == 0) goto L5f
            r3 = 2
            goto L60
        L5f:
            r3 = r1
        L60:
            r7.f4475p = r3
        L62:
            r6.m1511v()
        L65:
            android.app.SearchableInfo r7 = r6.f2180b0
            r3 = 0
            if (r7 == 0) goto L98
            boolean r7 = r7.getVoiceSearchEnabled()
            if (r7 == 0) goto L98
            android.app.SearchableInfo r7 = r6.f2180b0
            boolean r7 = r7.getVoiceSearchLaunchWebSearch()
            if (r7 == 0) goto L7b
            android.content.Intent r0 = r6.f2163H
            goto L85
        L7b:
            android.app.SearchableInfo r7 = r6.f2180b0
            boolean r7 = r7.getVoiceSearchLaunchRecognizer()
            if (r7 == 0) goto L85
            android.content.Intent r0 = r6.f2164I
        L85:
            if (r0 == 0) goto L98
            android.content.Context r7 = r6.getContext()
            android.content.pm.PackageManager r7 = r7.getPackageManager()
            r4 = 65536(0x10000, float:9.1835E-41)
            android.content.pm.ResolveInfo r7 = r7.resolveActivity(r0, r4)
            if (r7 == 0) goto L98
            goto L99
        L98:
            r1 = r3
        L99:
            r6.f2176U = r1
            if (r1 == 0) goto La2
            java.lang.String r7 = "nm"
            r2.setPrivateImeOptions(r7)
        La2:
            boolean r7 = r6.f2169N
            r6.m1514y(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SearchView.setSearchableInfo(android.app.SearchableInfo):void");
    }

    public void setSubmitButtonEnabled(boolean z2) {
        this.f2171P = z2;
        m1514y(this.f2169N);
    }

    public void setSuggestionsAdapter(AbstractC0470c abstractC0470c) {
        this.f2170O = abstractC0470c;
        this.f2185p.setAdapter(abstractC0470c);
    }

    /* renamed from: t */
    public final void m1509t() {
        boolean zIsEmpty = TextUtils.isEmpty(this.f2185p.getText());
        int i2 = (!zIsEmpty || (this.f2168M && !this.f2178W)) ? 0 : 8;
        ImageView imageView = this.f2191v;
        imageView.setVisibility(i2);
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            drawable.setState(!zIsEmpty ? ViewGroup.ENABLED_STATE_SET : ViewGroup.EMPTY_STATE_SET);
        }
    }

    /* renamed from: u */
    public final void m1510u() {
        int[] iArr = this.f2185p.hasFocus() ? ViewGroup.FOCUSED_STATE_SET : ViewGroup.EMPTY_STATE_SET;
        Drawable background = this.f2187r.getBackground();
        if (background != null) {
            background.setState(iArr);
        }
        Drawable background2 = this.f2188s.getBackground();
        if (background2 != null) {
            background2.setState(iArr);
        }
        invalidate();
    }

    /* renamed from: v */
    public final void m1511v() {
        Drawable drawable;
        CharSequence queryHint = getQueryHint();
        if (queryHint == null) {
            queryHint = "";
        }
        boolean z2 = this.f2168M;
        SearchAutoComplete searchAutoComplete = this.f2185p;
        if (z2 && (drawable = this.f2160E) != null) {
            int textSize = (int) (searchAutoComplete.getTextSize() * 1.25d);
            drawable.setBounds(0, 0, textSize, textSize);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("   ");
            spannableStringBuilder.setSpan(new ImageSpan(drawable), 1, 2, 33);
            spannableStringBuilder.append(queryHint);
            queryHint = spannableStringBuilder;
        }
        searchAutoComplete.setHint(queryHint);
    }

    /* renamed from: w */
    public final void m1512w() {
        this.f2188s.setVisibility(((this.f2171P || this.f2176U) && !this.f2169N && (this.f2190u.getVisibility() == 0 || this.f2192w.getVisibility() == 0)) ? 0 : 8);
    }

    /* renamed from: x */
    public final void m1513x(boolean z2) {
        boolean z3 = this.f2171P;
        this.f2190u.setVisibility((!z3 || !(z3 || this.f2176U) || this.f2169N || !hasFocus() || (!z2 && this.f2176U)) ? 8 : 0);
    }

    /* renamed from: y */
    public final void m1514y(boolean z2) {
        this.f2169N = z2;
        int i2 = 8;
        int i3 = z2 ? 0 : 8;
        boolean zIsEmpty = TextUtils.isEmpty(this.f2185p.getText());
        this.f2189t.setVisibility(i3);
        m1513x(!zIsEmpty);
        this.f2186q.setVisibility(z2 ? 8 : 0);
        ImageView imageView = this.f2159D;
        imageView.setVisibility((imageView.getDrawable() == null || this.f2168M) ? 8 : 0);
        m1509t();
        if (this.f2176U && !this.f2169N && zIsEmpty) {
            this.f2190u.setVisibility(8);
            i2 = 0;
        }
        this.f2192w.setVisibility(i2);
        m1512w();
    }

    public SearchView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.searchViewStyle);
    }

    public SearchView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.f2195z = new Rect();
        this.f2156A = new Rect();
        this.f2157B = new int[2];
        this.f2158C = new int[2];
        this.f2182d0 = new RunnableC1059S0(this, 0);
        this.f2183e0 = new RunnableC1059S0(this, 1);
        this.f2184f0 = new WeakHashMap();
        ViewOnClickListenerC0657a viewOnClickListenerC0657a = new ViewOnClickListenerC0657a(this);
        ViewOnKeyListenerC0658b viewOnKeyListenerC0658b = new ViewOnKeyListenerC0658b(this);
        C1061T0 c1061t0 = new C1061T0(this);
        C0574t c0574t = new C0574t(2, this);
        C1024A0 c1024a0 = new C1024A0(1, this);
        C1057R0 c1057r0 = new C1057R0(this);
        int[] iArr = AbstractC0843a.f3472v;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i2, 0);
        C0027i c0027i = new C0027i(context, typedArrayObtainStyledAttributes);
        AbstractC0241P.m700l(this, context, iArr, attributeSet, typedArrayObtainStyledAttributes, i2);
        LayoutInflater.from(context).inflate(typedArrayObtainStyledAttributes.getResourceId(19, R.layout.abc_search_view), (ViewGroup) this, true);
        SearchAutoComplete searchAutoComplete = (SearchAutoComplete) findViewById(R.id.search_src_text);
        this.f2185p = searchAutoComplete;
        searchAutoComplete.setSearchView(this);
        this.f2186q = findViewById(R.id.search_edit_frame);
        View viewFindViewById = findViewById(R.id.search_plate);
        this.f2187r = viewFindViewById;
        View viewFindViewById2 = findViewById(R.id.submit_area);
        this.f2188s = viewFindViewById2;
        ImageView imageView = (ImageView) findViewById(R.id.search_button);
        this.f2189t = imageView;
        ImageView imageView2 = (ImageView) findViewById(R.id.search_go_btn);
        this.f2190u = imageView2;
        ImageView imageView3 = (ImageView) findViewById(R.id.search_close_btn);
        this.f2191v = imageView3;
        ImageView imageView4 = (ImageView) findViewById(R.id.search_voice_btn);
        this.f2192w = imageView4;
        ImageView imageView5 = (ImageView) findViewById(R.id.search_mag_icon);
        this.f2159D = imageView5;
        viewFindViewById.setBackground(c0027i.m100B(20));
        viewFindViewById2.setBackground(c0027i.m100B(25));
        imageView.setImageDrawable(c0027i.m100B(23));
        imageView2.setImageDrawable(c0027i.m100B(15));
        imageView3.setImageDrawable(c0027i.m100B(12));
        imageView4.setImageDrawable(c0027i.m100B(28));
        imageView5.setImageDrawable(c0027i.m100B(23));
        this.f2160E = c0027i.m100B(22);
        AbstractC0364l.m1000g0(imageView, getResources().getString(R.string.abc_searchview_description_search));
        this.f2161F = typedArrayObtainStyledAttributes.getResourceId(26, R.layout.abc_search_dropdown_item_icons_2line);
        this.f2162G = typedArrayObtainStyledAttributes.getResourceId(13, 0);
        imageView.setOnClickListener(viewOnClickListenerC0657a);
        imageView3.setOnClickListener(viewOnClickListenerC0657a);
        imageView2.setOnClickListener(viewOnClickListenerC0657a);
        imageView4.setOnClickListener(viewOnClickListenerC0657a);
        searchAutoComplete.setOnClickListener(viewOnClickListenerC0657a);
        searchAutoComplete.addTextChangedListener(c1057r0);
        searchAutoComplete.setOnEditorActionListener(c1061t0);
        searchAutoComplete.setOnItemClickListener(c0574t);
        searchAutoComplete.setOnItemSelectedListener(c1024a0);
        searchAutoComplete.setOnKeyListener(viewOnKeyListenerC0658b);
        searchAutoComplete.setOnFocusChangeListener(new ViewOnFocusChangeListenerC0023e(this, 2));
        setIconifiedByDefault(typedArrayObtainStyledAttributes.getBoolean(18, true));
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(2, -1);
        if (dimensionPixelSize != -1) {
            setMaxWidth(dimensionPixelSize);
        }
        this.f2165J = typedArrayObtainStyledAttributes.getText(14);
        this.f2172Q = typedArrayObtainStyledAttributes.getText(21);
        int i3 = typedArrayObtainStyledAttributes.getInt(6, -1);
        if (i3 != -1) {
            setImeOptions(i3);
        }
        int i4 = typedArrayObtainStyledAttributes.getInt(5, -1);
        if (i4 != -1) {
            setInputType(i4);
        }
        setFocusable(typedArrayObtainStyledAttributes.getBoolean(1, true));
        c0027i.m114R();
        Intent intent = new Intent("android.speech.action.WEB_SEARCH");
        this.f2163H = intent;
        intent.addFlags(268435456);
        intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
        Intent intent2 = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        this.f2164I = intent2;
        intent2.addFlags(268435456);
        View viewFindViewById3 = findViewById(searchAutoComplete.getDropDownAnchor());
        this.f2193x = viewFindViewById3;
        if (viewFindViewById3 != null) {
            viewFindViewById3.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC0062a(1, this));
        }
        m1514y(this.f2168M);
        m1511v();
    }
}
