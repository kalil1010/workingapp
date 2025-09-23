package p048R;

import android.database.Cursor;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import p006C.AbstractC0075g;
import p105j.ViewOnClickListenerC1076a1;

/* renamed from: R.c */
/* loaded from: classes.dex */
public abstract class AbstractC0470c extends BaseAdapter implements Filterable {

    /* renamed from: a */
    public boolean f1450a;

    /* renamed from: b */
    public boolean f1451b;

    /* renamed from: c */
    public Cursor f1452c;

    /* renamed from: d */
    public int f1453d;

    /* renamed from: e */
    public C0468a f1454e;

    /* renamed from: f */
    public C0469b f1455f;

    /* renamed from: g */
    public C0471d f1456g;

    /* renamed from: a */
    public abstract void mo1157a(View view, Cursor cursor);

    /* renamed from: b */
    public void mo1158b(Cursor cursor) {
        Cursor cursor2 = this.f1452c;
        if (cursor == cursor2) {
            cursor2 = null;
        } else {
            if (cursor2 != null) {
                C0468a c0468a = this.f1454e;
                if (c0468a != null) {
                    cursor2.unregisterContentObserver(c0468a);
                }
                C0469b c0469b = this.f1455f;
                if (c0469b != null) {
                    cursor2.unregisterDataSetObserver(c0469b);
                }
            }
            this.f1452c = cursor;
            if (cursor != null) {
                C0468a c0468a2 = this.f1454e;
                if (c0468a2 != null) {
                    cursor.registerContentObserver(c0468a2);
                }
                C0469b c0469b2 = this.f1455f;
                if (c0469b2 != null) {
                    cursor.registerDataSetObserver(c0469b2);
                }
                this.f1453d = cursor.getColumnIndexOrThrow("_id");
                this.f1450a = true;
                notifyDataSetChanged();
            } else {
                this.f1453d = -1;
                this.f1450a = false;
                notifyDataSetInvalidated();
            }
        }
        if (cursor2 != null) {
            cursor2.close();
        }
    }

    /* renamed from: c */
    public abstract String mo1159c(Cursor cursor);

    /* renamed from: d */
    public abstract View mo1160d(ViewGroup viewGroup);

    @Override // android.widget.Adapter
    public final int getCount() {
        Cursor cursor;
        if (!this.f1450a || (cursor = this.f1452c) == null) {
            return 0;
        }
        return cursor.getCount();
    }

    @Override // android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i2, View view, ViewGroup viewGroup) {
        if (!this.f1450a) {
            return null;
        }
        this.f1452c.moveToPosition(i2);
        if (view == null) {
            ViewOnClickListenerC1076a1 viewOnClickListenerC1076a1 = (ViewOnClickListenerC1076a1) this;
            view = viewOnClickListenerC1076a1.f4469j.inflate(viewOnClickListenerC1076a1.f4468i, viewGroup, false);
        }
        mo1157a(view, this.f1452c);
        return view;
    }

    @Override // android.widget.Filterable
    public final Filter getFilter() {
        if (this.f1456g == null) {
            C0471d c0471d = new C0471d();
            c0471d.f1457a = this;
            this.f1456g = c0471d;
        }
        return this.f1456g;
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i2) {
        Cursor cursor;
        if (!this.f1450a || (cursor = this.f1452c) == null) {
            return null;
        }
        cursor.moveToPosition(i2);
        return this.f1452c;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i2) {
        Cursor cursor;
        if (this.f1450a && (cursor = this.f1452c) != null && cursor.moveToPosition(i2)) {
            return this.f1452c.getLong(this.f1453d);
        }
        return 0L;
    }

    @Override // android.widget.Adapter
    public View getView(int i2, View view, ViewGroup viewGroup) {
        if (!this.f1450a) {
            throw new IllegalStateException("this should only be called when the cursor is valid");
        }
        if (!this.f1452c.moveToPosition(i2)) {
            throw new IllegalStateException(AbstractC0075g.m236e("couldn't move cursor to position ", i2));
        }
        if (view == null) {
            view = mo1160d(viewGroup);
        }
        mo1157a(view, this.f1452c);
        return view;
    }
}
