package p105j;

import android.app.SearchableInfo;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.appcompat.widget.SearchView;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Objects;
import java.util.WeakHashMap;
import p000A.AbstractC0000a;
import p048R.AbstractC0470c;
import p048R.C0468a;
import p048R.C0469b;
import tkbmmn.ghwbbf.irvjzy.R;

/* renamed from: j.a1 */
/* loaded from: classes.dex */
public final class ViewOnClickListenerC1076a1 extends AbstractC0470c implements View.OnClickListener {

    /* renamed from: x */
    public static final /* synthetic */ int f4466x = 0;

    /* renamed from: h */
    public final int f4467h;

    /* renamed from: i */
    public final int f4468i;

    /* renamed from: j */
    public final LayoutInflater f4469j;

    /* renamed from: k */
    public final SearchView f4470k;

    /* renamed from: l */
    public final SearchableInfo f4471l;

    /* renamed from: m */
    public final Context f4472m;

    /* renamed from: n */
    public final WeakHashMap f4473n;

    /* renamed from: o */
    public final int f4474o;

    /* renamed from: p */
    public int f4475p;

    /* renamed from: q */
    public ColorStateList f4476q;

    /* renamed from: r */
    public int f4477r;

    /* renamed from: s */
    public int f4478s;

    /* renamed from: t */
    public int f4479t;

    /* renamed from: u */
    public int f4480u;

    /* renamed from: v */
    public int f4481v;

    /* renamed from: w */
    public int f4482w;

    public ViewOnClickListenerC1076a1(Context context, SearchView searchView, SearchableInfo searchableInfo, WeakHashMap weakHashMap) {
        int suggestionRowLayout = searchView.getSuggestionRowLayout();
        this.f1451b = true;
        this.f1452c = null;
        this.f1450a = false;
        this.f1453d = -1;
        this.f1454e = new C0468a(this);
        this.f1455f = new C0469b(0, this);
        this.f4468i = suggestionRowLayout;
        this.f4467h = suggestionRowLayout;
        this.f4469j = (LayoutInflater) context.getSystemService("layout_inflater");
        this.f4475p = 1;
        this.f4477r = -1;
        this.f4478s = -1;
        this.f4479t = -1;
        this.f4480u = -1;
        this.f4481v = -1;
        this.f4482w = -1;
        this.f4470k = searchView;
        this.f4471l = searchableInfo;
        this.f4474o = searchView.getSuggestionCommitIconResId();
        this.f4472m = context;
        this.f4473n = weakHashMap;
    }

    /* renamed from: h */
    public static String m2691h(Cursor cursor, int i2) {
        if (i2 == -1) {
            return null;
        }
        try {
            return cursor.getString(i2);
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0117  */
    @Override // p048R.AbstractC0470c
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void mo1157a(android.view.View r21, android.database.Cursor r22) throws android.content.pm.PackageManager.NameNotFoundException, java.lang.NumberFormatException, java.io.IOException {
        /*
            Method dump skipped, instructions count: 389
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p105j.ViewOnClickListenerC1076a1.mo1157a(android.view.View, android.database.Cursor):void");
    }

    @Override // p048R.AbstractC0470c
    /* renamed from: b */
    public final void mo1158b(Cursor cursor) {
        try {
            super.mo1158b(cursor);
            if (cursor != null) {
                this.f4477r = cursor.getColumnIndex("suggest_text_1");
                this.f4478s = cursor.getColumnIndex("suggest_text_2");
                this.f4479t = cursor.getColumnIndex("suggest_text_2_url");
                this.f4480u = cursor.getColumnIndex("suggest_icon_1");
                this.f4481v = cursor.getColumnIndex("suggest_icon_2");
                this.f4482w = cursor.getColumnIndex("suggest_flags");
            }
        } catch (Exception unused) {
        }
    }

    @Override // p048R.AbstractC0470c
    /* renamed from: c */
    public final String mo1159c(Cursor cursor) {
        String strM2691h;
        String strM2691h2;
        if (cursor == null) {
            return null;
        }
        String strM2691h3 = m2691h(cursor, cursor.getColumnIndex("suggest_intent_query"));
        if (strM2691h3 != null) {
            return strM2691h3;
        }
        SearchableInfo searchableInfo = this.f4471l;
        if (searchableInfo.shouldRewriteQueryFromData() && (strM2691h2 = m2691h(cursor, cursor.getColumnIndex("suggest_intent_data"))) != null) {
            return strM2691h2;
        }
        if (!searchableInfo.shouldRewriteQueryFromText() || (strM2691h = m2691h(cursor, cursor.getColumnIndex("suggest_text_1"))) == null) {
            return null;
        }
        return strM2691h;
    }

    @Override // p048R.AbstractC0470c
    /* renamed from: d */
    public final View mo1160d(ViewGroup viewGroup) {
        View viewInflate = this.f4469j.inflate(this.f4467h, viewGroup, false);
        viewInflate.setTag(new C1073Z0(viewInflate));
        ((ImageView) viewInflate.findViewById(R.id.edit_query)).setImageResource(this.f4474o);
        return viewInflate;
    }

    /* renamed from: e */
    public final Drawable m2692e(Uri uri) throws PackageManager.NameNotFoundException, NumberFormatException, FileNotFoundException {
        int identifier;
        String authority = uri.getAuthority();
        if (TextUtils.isEmpty(authority)) {
            throw new FileNotFoundException("No authority: " + uri);
        }
        try {
            Resources resourcesForApplication = this.f4472m.getPackageManager().getResourcesForApplication(authority);
            List<String> pathSegments = uri.getPathSegments();
            if (pathSegments == null) {
                throw new FileNotFoundException("No path: " + uri);
            }
            int size = pathSegments.size();
            if (size == 1) {
                try {
                    identifier = Integer.parseInt(pathSegments.get(0));
                } catch (NumberFormatException unused) {
                    throw new FileNotFoundException("Single path segment is not a resource ID: " + uri);
                }
            } else {
                if (size != 2) {
                    throw new FileNotFoundException("More than two path segments: " + uri);
                }
                identifier = resourcesForApplication.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority);
            }
            if (identifier != 0) {
                return resourcesForApplication.getDrawable(identifier);
            }
            throw new FileNotFoundException("No resource found for: " + uri);
        } catch (PackageManager.NameNotFoundException unused2) {
            throw new FileNotFoundException("No package found for authority: " + uri);
        }
    }

    /* renamed from: f */
    public final Drawable m2693f(String str) throws PackageManager.NameNotFoundException, NumberFormatException, IOException {
        WeakHashMap weakHashMap = this.f4473n;
        Context context = this.f4472m;
        Drawable drawableM2692e = null;
        if (str != null && !str.isEmpty() && !"0".equals(str)) {
            try {
                int i2 = Integer.parseInt(str);
                String str2 = "android.resource://" + context.getPackageName() + "/" + i2;
                Drawable.ConstantState constantState = (Drawable.ConstantState) weakHashMap.get(str2);
                Drawable drawableNewDrawable = constantState == null ? null : constantState.newDrawable();
                if (drawableNewDrawable != null) {
                    return drawableNewDrawable;
                }
                Drawable drawableM1b = AbstractC0000a.m1b(context, i2);
                if (drawableM1b != null) {
                    weakHashMap.put(str2, drawableM1b.getConstantState());
                }
                return drawableM1b;
            } catch (Resources.NotFoundException unused) {
            } catch (NumberFormatException unused2) {
                Drawable.ConstantState constantState2 = (Drawable.ConstantState) weakHashMap.get(str);
                Drawable drawableNewDrawable2 = constantState2 == null ? null : constantState2.newDrawable();
                if (drawableNewDrawable2 != null) {
                    return drawableNewDrawable2;
                }
                Uri uri = Uri.parse(str);
                try {
                    if ("android.resource".equals(uri.getScheme())) {
                        try {
                            drawableM2692e = m2692e(uri);
                        } catch (Resources.NotFoundException unused3) {
                            throw new FileNotFoundException("Resource does not exist: " + uri);
                        }
                    } else {
                        InputStream inputStreamOpenInputStream = context.getContentResolver().openInputStream(uri);
                        if (inputStreamOpenInputStream == null) {
                            throw new FileNotFoundException("Failed to open " + uri);
                        }
                        try {
                            drawableM2692e = Drawable.createFromStream(inputStreamOpenInputStream, null);
                        } finally {
                            try {
                                inputStreamOpenInputStream.close();
                            } catch (IOException unused4) {
                                uri.toString();
                            }
                        }
                    }
                } catch (FileNotFoundException e3) {
                    Objects.toString(uri);
                    e3.getMessage();
                }
                if (drawableM2692e != null) {
                    weakHashMap.put(str, drawableM2692e.getConstantState());
                }
            }
        }
        return drawableM2692e;
    }

    /* renamed from: g */
    public final Cursor m2694g(SearchableInfo searchableInfo, String str) {
        String suggestAuthority;
        String[] strArr = null;
        if (searchableInfo == null || (suggestAuthority = searchableInfo.getSuggestAuthority()) == null) {
            return null;
        }
        Uri.Builder builderFragment = new Uri.Builder().scheme("content").authority(suggestAuthority).query("").fragment("");
        String suggestPath = searchableInfo.getSuggestPath();
        if (suggestPath != null) {
            builderFragment.appendEncodedPath(suggestPath);
        }
        builderFragment.appendPath("search_suggest_query");
        String suggestSelection = searchableInfo.getSuggestSelection();
        if (suggestSelection != null) {
            strArr = new String[]{str};
        } else {
            builderFragment.appendPath(str);
        }
        String[] strArr2 = strArr;
        builderFragment.appendQueryParameter("limit", String.valueOf(50));
        return this.f4472m.getContentResolver().query(builderFragment.build(), null, suggestSelection, strArr2, null);
    }

    @Override // p048R.AbstractC0470c, android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public final View getDropDownView(int i2, View view, ViewGroup viewGroup) {
        try {
            return super.getDropDownView(i2, view, viewGroup);
        } catch (RuntimeException e3) {
            View viewInflate = this.f4469j.inflate(this.f4468i, viewGroup, false);
            if (viewInflate != null) {
                ((C1073Z0) viewInflate.getTag()).f4458a.setText(e3.toString());
            }
            return viewInflate;
        }
    }

    @Override // p048R.AbstractC0470c, android.widget.Adapter
    public final View getView(int i2, View view, ViewGroup viewGroup) {
        try {
            return super.getView(i2, view, viewGroup);
        } catch (RuntimeException e3) {
            View viewMo1160d = mo1160d(viewGroup);
            ((C1073Z0) viewMo1160d.getTag()).f4458a.setText(e3.toString());
            return viewMo1160d;
        }
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final boolean hasStableIds() {
        return false;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        super.notifyDataSetChanged();
        Cursor cursor = this.f1452c;
        Bundle extras = cursor != null ? cursor.getExtras() : null;
        if (extras != null) {
            extras.getBoolean("in_progress");
        }
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetInvalidated() {
        super.notifyDataSetInvalidated();
        Cursor cursor = this.f1452c;
        Bundle extras = cursor != null ? cursor.getExtras() : null;
        if (extras != null) {
            extras.getBoolean("in_progress");
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object tag = view.getTag();
        if (tag instanceof CharSequence) {
            this.f4470k.m1507r((CharSequence) tag);
        }
    }
}
