package androidx.emoji2.text;

import android.text.Editable;
import android.text.SpannableStringBuilder;
import java.lang.reflect.Array;
import java.util.ArrayList;
import p033L1.AbstractC0364l;

/* renamed from: androidx.emoji2.text.r */
/* loaded from: classes.dex */
public final class C0679r extends SpannableStringBuilder {

    /* renamed from: a */
    public final Class f2428a;

    /* renamed from: b */
    public final ArrayList f2429b;

    public C0679r(Class cls, CharSequence charSequence) {
        super(charSequence);
        this.f2429b = new ArrayList();
        AbstractC0364l.m1010q(cls, "watcherClass cannot be null");
        this.f2428a = cls;
    }

    /* renamed from: a */
    public final void m1639a() {
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.f2429b;
            if (i2 >= arrayList.size()) {
                return;
            }
            ((C0678q) arrayList.get(i2)).f2427b.incrementAndGet();
            i2++;
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Editable append(CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    /* renamed from: b */
    public final void m1640b() {
        m1643e();
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.f2429b;
            if (i2 >= arrayList.size()) {
                return;
            }
            ((C0678q) arrayList.get(i2)).onTextChanged(this, 0, length(), length());
            i2++;
        }
    }

    /* renamed from: c */
    public final C0678q m1641c(Object obj) {
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.f2429b;
            if (i2 >= arrayList.size()) {
                return null;
            }
            C0678q c0678q = (C0678q) arrayList.get(i2);
            if (c0678q.f2426a == obj) {
                return c0678q;
            }
            i2++;
        }
    }

    /* renamed from: d */
    public final boolean m1642d(Object obj) {
        if (obj != null) {
            return this.f2428a == obj.getClass();
        }
        return false;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final Editable delete(int i2, int i3) {
        super.delete(i2, i3);
        return this;
    }

    /* renamed from: e */
    public final void m1643e() {
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.f2429b;
            if (i2 >= arrayList.size()) {
                return;
            }
            ((C0678q) arrayList.get(i2)).f2427b.decrementAndGet();
            i2++;
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int getSpanEnd(Object obj) {
        C0678q c0678qM1641c;
        if (m1642d(obj) && (c0678qM1641c = m1641c(obj)) != null) {
            obj = c0678qM1641c;
        }
        return super.getSpanEnd(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int getSpanFlags(Object obj) {
        C0678q c0678qM1641c;
        if (m1642d(obj) && (c0678qM1641c = m1641c(obj)) != null) {
            obj = c0678qM1641c;
        }
        return super.getSpanFlags(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int getSpanStart(Object obj) {
        C0678q c0678qM1641c;
        if (m1642d(obj) && (c0678qM1641c = m1641c(obj)) != null) {
            obj = c0678qM1641c;
        }
        return super.getSpanStart(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final Object[] getSpans(int i2, int i3, Class cls) {
        if (this.f2428a != cls) {
            return super.getSpans(i2, i3, cls);
        }
        C0678q[] c0678qArr = (C0678q[]) super.getSpans(i2, i3, C0678q.class);
        Object[] objArr = (Object[]) Array.newInstance((Class<?>) cls, c0678qArr.length);
        for (int i4 = 0; i4 < c0678qArr.length; i4++) {
            objArr[i4] = c0678qArr[i4].f2426a;
        }
        return objArr;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final Editable insert(int i2, CharSequence charSequence) {
        super.insert(i2, charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int nextSpanTransition(int i2, int i3, Class cls) {
        if (cls == null || this.f2428a == cls) {
            cls = C0678q.class;
        }
        return super.nextSpanTransition(i2, i3, cls);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public final void removeSpan(Object obj) {
        C0678q c0678qM1641c;
        if (m1642d(obj)) {
            c0678qM1641c = m1641c(obj);
            if (c0678qM1641c != null) {
                obj = c0678qM1641c;
            }
        } else {
            c0678qM1641c = null;
        }
        super.removeSpan(obj);
        if (c0678qM1641c != null) {
            this.f2429b.remove(c0678qM1641c);
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final /* bridge */ /* synthetic */ Editable replace(int i2, int i3, CharSequence charSequence) {
        replace(i2, i3, charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public final void setSpan(Object obj, int i2, int i3, int i4) {
        if (m1642d(obj)) {
            C0678q c0678q = new C0678q(obj);
            this.f2429b.add(c0678q);
            obj = c0678q;
        }
        super.setSpan(obj, i2, i3, i4);
    }

    @Override // android.text.SpannableStringBuilder, java.lang.CharSequence
    public final CharSequence subSequence(int i2, int i3) {
        return new C0679r(this.f2428a, this, i2, i3);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final SpannableStringBuilder append(CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder delete(int i2, int i3) {
        super.delete(i2, i3);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder insert(int i2, CharSequence charSequence) {
        super.insert(i2, charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final /* bridge */ /* synthetic */ Editable replace(int i2, int i3, CharSequence charSequence, int i4, int i5) {
        replace(i2, i3, charSequence, i4, i5);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Appendable append(CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final Editable insert(int i2, CharSequence charSequence, int i3, int i4) {
        super.insert(i2, charSequence, i3, i4);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder replace(int i2, int i3, CharSequence charSequence) {
        m1639a();
        super.replace(i2, i3, charSequence);
        m1643e();
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Editable append(char c3) {
        super.append(c3);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder insert(int i2, CharSequence charSequence, int i3, int i4) {
        super.insert(i2, charSequence, i3, i4);
        return this;
    }

    public C0679r(Class cls, C0679r c0679r, int i2, int i3) {
        super(c0679r, i2, i3);
        this.f2429b = new ArrayList();
        AbstractC0364l.m1010q(cls, "watcherClass cannot be null");
        this.f2428a = cls;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final SpannableStringBuilder append(char c3) {
        super.append(c3);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Appendable append(char c3) {
        super.append(c3);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder replace(int i2, int i3, CharSequence charSequence, int i4, int i5) {
        m1639a();
        super.replace(i2, i3, charSequence, i4, i5);
        m1643e();
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Editable append(CharSequence charSequence, int i2, int i3) {
        super.append(charSequence, i2, i3);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final SpannableStringBuilder append(CharSequence charSequence, int i2, int i3) {
        super.append(charSequence, i2, i3);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Appendable append(CharSequence charSequence, int i2, int i3) {
        super.append(charSequence, i2, i3);
        return this;
    }

    @Override // android.text.SpannableStringBuilder
    public final SpannableStringBuilder append(CharSequence charSequence, Object obj, int i2) {
        super.append(charSequence, obj, i2);
        return this;
    }
}
