package p028K;

import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.WeakHashMap;
import tkbmmn.ghwbbf.irvjzy.R;

/* renamed from: K.O */
/* loaded from: classes.dex */
public final class C0240O {

    /* renamed from: d */
    public static final ArrayList f811d = new ArrayList();

    /* renamed from: a */
    public WeakHashMap f812a;

    /* renamed from: b */
    public SparseArray f813b;

    /* renamed from: c */
    public WeakReference f814c;

    /* renamed from: a */
    public final View m688a(View view) {
        int size;
        WeakHashMap weakHashMap = this.f812a;
        if (weakHashMap == null || !weakHashMap.containsKey(view)) {
            return null;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View viewM688a = m688a(viewGroup.getChildAt(childCount));
                if (viewM688a != null) {
                    return viewM688a;
                }
            }
        }
        ArrayList arrayList = (ArrayList) view.getTag(R.id.tag_unhandled_key_listeners);
        if (arrayList == null || arrayList.size() - 1 < 0) {
            return null;
        }
        arrayList.get(size).getClass();
        throw new ClassCastException();
    }
}
