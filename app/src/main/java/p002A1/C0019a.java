package p002A1;

import android.animation.Animator;
import android.content.Context;
import android.graphics.Rect;
import android.os.Handler;
import android.text.Editable;
import android.text.Selection;
import android.text.TextPaint;
import android.util.SparseIntArray;
import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.widget.EditText;
import androidx.cardview.widget.CardView;
import androidx.emoji2.text.C0665d;
import androidx.emoji2.text.C0673l;
import androidx.emoji2.text.C0680s;
import androidx.fragment.app.AbstractComponentCallbacksC0712o;
import androidx.fragment.app.C0686D;
import androidx.lifecycle.AbstractC0732I;
import androidx.lifecycle.C0733J;
import androidx.lifecycle.C0734K;
import androidx.lifecycle.InterfaceC0753r;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import nfc.share.nfcshare.MainActivity;
import p001A0.C0004c;
import p001A0.RunnableC0005d;
import p006C.AbstractC0073e;
import p006C.AbstractC0074f;
import p006C.C0072d;
import p011D1.C0121k;
import p011D1.InterfaceC0114d;
import p020H.C0176f;
import p020H.RunnableC0171a;
import p021H1.C0190i;
import p028K.AbstractC0228C;
import p028K.AbstractC0241P;
import p028K.C0248X;
import p028K.C0281p;
import p028K.InterfaceC0283q;
import p047Q1.C0464f;
import p055T0.C0511e;
import p063W.C0551a;
import p066X.C0588a;
import p066X.C0596i;
import p076a0.C0624a;
import p079b0.C0762a;
import p090e.AbstractActivityC0874g;
import p090e.C0881n;
import p090e.LayoutInflaterFactory2C0888u;
import p094f0.AbstractC0926Z;
import p094f0.C0909H;
import p094f0.C0936e0;
import p094f0.C0942h0;
import p094f0.C0944i0;
import p099h.AbstractC0971a;
import p099h.C0976f;
import p102i.MenuC0991B;
import p102i.MenuC1006l;
import p110k1.C1199a;
import p119o.C1243e;
import p119o.C1249k;
import p119o.C1250l;
import p124q.C1272f;
import p131s1.AbstractC1326c;
import p146x1.InterfaceC1397b;
import p149y1.C1404b;

/* renamed from: A1.a */
/* loaded from: classes.dex */
public final class C0019a implements InterfaceC0114d, InterfaceC0012G, InterfaceC0283q, InterfaceC1397b {

    /* renamed from: a */
    public final /* synthetic */ int f45a;

    /* renamed from: b */
    public Object f46b;

    /* renamed from: c */
    public Object f47c;

    public /* synthetic */ C0019a(int i2, Object obj) {
        this.f45a = i2;
        this.f46b = obj;
    }

    /* renamed from: c */
    public static boolean m53c(Editable editable, KeyEvent keyEvent, boolean z2) {
        C0680s[] c0680sArr;
        if (KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState())) {
            int selectionStart = Selection.getSelectionStart(editable);
            int selectionEnd = Selection.getSelectionEnd(editable);
            if (selectionStart != -1 && selectionEnd != -1 && selectionStart == selectionEnd && (c0680sArr = (C0680s[]) editable.getSpans(selectionStart, selectionEnd, C0680s.class)) != null && c0680sArr.length > 0) {
                for (C0680s c0680s : c0680sArr) {
                    int spanStart = editable.getSpanStart(c0680s);
                    int spanEnd = editable.getSpanEnd(c0680s);
                    if ((z2 && spanStart == selectionStart) || ((!z2 && spanEnd == selectionStart) || (selectionStart > spanStart && selectionStart < spanEnd))) {
                        editable.delete(spanStart, spanEnd);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* renamed from: x */
    public static int m54x(int i2, int i3) {
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 0; i6 < i2; i6++) {
            i4++;
            if (i4 == i3) {
                i5++;
                i4 = 0;
            } else if (i4 > i3) {
                i5++;
                i4 = 1;
            }
        }
        return i4 + 1 > i3 ? i5 + 1 : i5;
    }

    /* renamed from: A */
    public boolean m55A(View view) {
        C0909H c0909h = (C0909H) this.f47c;
        int iM2344d = c0909h.m2344d();
        int iM2343c = c0909h.m2343c();
        int iM2342b = c0909h.m2342b(view);
        int iM2341a = c0909h.m2341a(view);
        C0942h0 c0942h0 = (C0942h0) this.f46b;
        c0942h0.f3905b = iM2344d;
        c0942h0.f3906c = iM2343c;
        c0942h0.f3907d = iM2342b;
        c0942h0.f3908e = iM2341a;
        c0942h0.f3904a = 24579;
        return c0942h0.m2440a();
    }

    /* renamed from: B */
    public void m56B(int i2, int i3) {
        int[] iArr = (int[]) this.f47c;
        if (iArr == null || i2 >= iArr.length) {
            return;
        }
        int i4 = i2 + i3;
        m83v(i4);
        int[] iArr2 = (int[]) this.f47c;
        System.arraycopy(iArr2, i2, iArr2, i4, (iArr2.length - i2) - i3);
        Arrays.fill((int[]) this.f47c, i2, i4, -1);
        ArrayList arrayList = (ArrayList) this.f46b;
        if (arrayList == null) {
            return;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            C0936e0 c0936e0 = (C0936e0) ((ArrayList) this.f46b).get(size);
            int i5 = c0936e0.f3868a;
            if (i5 >= i2) {
                c0936e0.f3868a = i5 + i3;
            }
        }
    }

    /* renamed from: C */
    public void m57C(int i2, int i3) {
        int[] iArr = (int[]) this.f47c;
        if (iArr == null || i2 >= iArr.length) {
            return;
        }
        int i4 = i2 + i3;
        m83v(i4);
        int[] iArr2 = (int[]) this.f47c;
        System.arraycopy(iArr2, i4, iArr2, i2, (iArr2.length - i2) - i3);
        int[] iArr3 = (int[]) this.f47c;
        Arrays.fill(iArr3, iArr3.length - i3, iArr3.length, -1);
        ArrayList arrayList = (ArrayList) this.f46b;
        if (arrayList == null) {
            return;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            C0936e0 c0936e0 = (C0936e0) ((ArrayList) this.f46b).get(size);
            int i5 = c0936e0.f3868a;
            if (i5 >= i2) {
                if (i5 < i4) {
                    ((ArrayList) this.f46b).remove(size);
                } else {
                    c0936e0.f3868a = i5 - i3;
                }
            }
        }
    }

    /* renamed from: D */
    public void m58D(AbstractC0971a abstractC0971a) {
        C0121k c0121k = (C0121k) this.f47c;
        ((ActionMode.Callback) c0121k.f352a).onDestroyActionMode(c0121k.m339g(abstractC0971a));
        LayoutInflaterFactory2C0888u layoutInflaterFactory2C0888u = (LayoutInflaterFactory2C0888u) this.f46b;
        if (layoutInflaterFactory2C0888u.f3703w != null) {
            layoutInflaterFactory2C0888u.f3692l.getDecorView().removeCallbacks(layoutInflaterFactory2C0888u.f3704x);
        }
        if (layoutInflaterFactory2C0888u.f3702v != null) {
            C0248X c0248x = layoutInflaterFactory2C0888u.f3705y;
            if (c0248x != null) {
                c0248x.m718b();
            }
            C0248X c0248xM689a = AbstractC0241P.m689a(layoutInflaterFactory2C0888u.f3702v);
            c0248xM689a.m717a(0.0f);
            layoutInflaterFactory2C0888u.f3705y = c0248xM689a;
            c0248xM689a.m720d(new C0881n(2, this));
        }
        layoutInflaterFactory2C0888u.f3701u = null;
        ViewGroup viewGroup = layoutInflaterFactory2C0888u.f3657A;
        WeakHashMap weakHashMap = AbstractC0241P.f815a;
        AbstractC0228C.m617c(viewGroup);
        layoutInflaterFactory2C0888u.m2258I();
    }

    /* renamed from: E */
    public boolean m59E(AbstractC0971a abstractC0971a, MenuC1006l menuC1006l) {
        ViewGroup viewGroup = ((LayoutInflaterFactory2C0888u) this.f46b).f3657A;
        WeakHashMap weakHashMap = AbstractC0241P.f815a;
        AbstractC0228C.m617c(viewGroup);
        C0121k c0121k = (C0121k) this.f47c;
        C0976f c0976fM339g = c0121k.m339g(abstractC0971a);
        C1249k c1249k = (C1249k) c0121k.f355d;
        Menu menuC0991B = (Menu) c1249k.getOrDefault(menuC1006l, null);
        if (menuC0991B == null) {
            menuC0991B = new MenuC0991B((Context) c0121k.f353b, menuC1006l);
            c1249k.put(menuC1006l, menuC0991B);
        }
        return ((ActionMode.Callback) c0121k.f352a).onPrepareActionMode(c0976fM339g, menuC0991B);
    }

    /* renamed from: F */
    public void m60F(C0176f c0176f) {
        int i2 = c0176f.f640b;
        Handler handler = (Handler) this.f46b;
        C0004c c0004c = (C0004c) this.f47c;
        if (i2 != 0) {
            handler.post(new RunnableC0171a(c0004c, i2, 0));
        } else {
            handler.post(new RunnableC0005d(c0004c, 5, c0176f.f639a));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:146:0x0223, code lost:
    
        continue;
     */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0134  */
    /* renamed from: G */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void m61G(android.content.Context r12, android.content.res.XmlResourceParser r13) {
        /*
            Method dump skipped, instructions count: 658
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p002A1.C0019a.m61G(android.content.Context, android.content.res.XmlResourceParser):void");
    }

    /* renamed from: H */
    public C0281p m62H(AbstractC0926Z abstractC0926Z, int i2) {
        C0944i0 c0944i0;
        C0281p c0281p;
        C1249k c1249k = (C1249k) this.f47c;
        int iM2909e = c1249k.m2909e(abstractC0926Z);
        if (iM2909e >= 0 && (c0944i0 = (C0944i0) c1249k.m2914j(iM2909e)) != null) {
            int i3 = c0944i0.f3923a;
            if ((i3 & i2) != 0) {
                int i4 = i3 & (~i2);
                c0944i0.f3923a = i4;
                if (i2 == 4) {
                    c0281p = c0944i0.f3924b;
                } else {
                    if (i2 != 8) {
                        throw new IllegalArgumentException("Must provide flag PRE or POST");
                    }
                    c0281p = c0944i0.f3925c;
                }
                if ((i4 & 12) == 0) {
                    c1249k.m2913i(iM2909e);
                    c0944i0.f3923a = 0;
                    c0944i0.f3924b = null;
                    c0944i0.f3925c = null;
                    C0944i0.f3922d.mo566c(c0944i0);
                }
                return c0281p;
            }
        }
        return null;
    }

    /* renamed from: I */
    public void m63I(AbstractC0926Z abstractC0926Z) {
        C0944i0 c0944i0 = (C0944i0) ((C1249k) this.f47c).getOrDefault(abstractC0926Z, null);
        if (c0944i0 == null) {
            return;
        }
        c0944i0.f3923a &= -2;
    }

    /* renamed from: J */
    public void m64J(AbstractC0926Z abstractC0926Z) {
        C1243e c1243e = (C1243e) this.f46b;
        int iM2901e = c1243e.m2901e() - 1;
        while (true) {
            if (iM2901e < 0) {
                break;
            }
            if (abstractC0926Z == c1243e.m2902f(iM2901e)) {
                Object[] objArr = c1243e.f5033c;
                Object obj = objArr[iM2901e];
                Object obj2 = C1243e.f5030e;
                if (obj != obj2) {
                    objArr[iM2901e] = obj2;
                    c1243e.f5031a = true;
                }
            } else {
                iM2901e--;
            }
        }
        C0944i0 c0944i0 = (C0944i0) ((C1249k) this.f47c).remove(abstractC0926Z);
        if (c0944i0 != null) {
            c0944i0.f3923a = 0;
            c0944i0.f3924b = null;
            c0944i0.f3925c = null;
            C0944i0.f3922d.mo566c(c0944i0);
        }
    }

    /* renamed from: K */
    public void m65K(int i2, int i3, int i4, int i5) {
        CardView cardView = (CardView) this.f46b;
        cardView.f2255d.set(i2, i3, i4, i5);
        Rect rect = cardView.f2254c;
        super/*android.view.View*/.setPadding(i2 + rect.left, i3 + rect.top, i4 + rect.right, i5 + rect.bottom);
    }

    @Override // p002A1.InterfaceC0012G
    /* renamed from: a */
    public void mo41a(String str) {
        MainActivity mainActivity = (MainActivity) this.f46b;
        C0016K c0016k = (C0016K) this.f47c;
        try {
            c0016k.f33e = Double.parseDouble(str);
            mainActivity.runOnUiThread(new RunnableC0035q(this, 0));
        } catch (Exception e3) {
            e3.printStackTrace();
            c0016k.f33e = -1.0d;
            mainActivity.runOnUiThread(new RunnableC0035q(this, 1));
        }
    }

    /* renamed from: b */
    public void m66b(AbstractC0926Z abstractC0926Z, C0281p c0281p) {
        C1249k c1249k = (C1249k) this.f47c;
        C0944i0 c0944i0M2447a = (C0944i0) c1249k.getOrDefault(abstractC0926Z, null);
        if (c0944i0M2447a == null) {
            c0944i0M2447a = C0944i0.m2447a();
            c1249k.put(abstractC0926Z, c0944i0M2447a);
        }
        c0944i0M2447a.f3925c = c0281p;
        c0944i0M2447a.f3923a |= 8;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0088  */
    @Override // p028K.InterfaceC0283q
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public p028K.C0292u0 mo67d(android.view.View r17, p028K.C0292u0 r18) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = r18
            java.lang.Object r3 = r0.f46b
            M0.D r3 = (p035M0.C0371D) r3
            int r4 = r3.f1138a
            java.lang.Object r5 = r0.f47c
            C0.d r5 = (p007C0.C0086d) r5
            K.s0 r6 = r2.f910a
            r7 = 7
            C.d r7 = r6.mo793f(r7)
            r8 = 32
            C.d r6 = r6.mo793f(r8)
            int r8 = r7.f173b
            java.lang.Object r9 = r5.f204b
            com.google.android.material.bottomsheet.BottomSheetBehavior r9 = (com.google.android.material.bottomsheet.BottomSheetBehavior) r9
            r9.f3104w = r8
            boolean r8 = p035M0.AbstractC0368A.m1040e(r1)
            int r10 = r1.getPaddingBottom()
            int r11 = r1.getPaddingLeft()
            int r12 = r1.getPaddingRight()
            boolean r13 = r9.f3096o
            if (r13 == 0) goto L42
            int r10 = r2.m818a()
            r9.f3103v = r10
            int r14 = r3.f1140c
            int r10 = r10 + r14
        L42:
            int r3 = r3.f1139b
            boolean r14 = r9.f3097p
            int r15 = r7.f172a
            if (r14 == 0) goto L50
            if (r8 == 0) goto L4e
            r11 = r3
            goto L4f
        L4e:
            r11 = r4
        L4f:
            int r11 = r11 + r15
        L50:
            boolean r14 = r9.f3098q
            int r0 = r7.f174c
            if (r14 == 0) goto L5c
            if (r8 == 0) goto L59
            goto L5a
        L59:
            r4 = r3
        L5a:
            int r12 = r4 + r0
        L5c:
            android.view.ViewGroup$LayoutParams r3 = r1.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r3 = (android.view.ViewGroup.MarginLayoutParams) r3
            boolean r4 = r9.f3100s
            r8 = 1
            if (r4 == 0) goto L6f
            int r4 = r3.leftMargin
            if (r4 == r15) goto L6f
            r3.leftMargin = r15
            r4 = r8
            goto L70
        L6f:
            r4 = 0
        L70:
            boolean r14 = r9.f3101t
            if (r14 == 0) goto L7b
            int r14 = r3.rightMargin
            if (r14 == r0) goto L7b
            r3.rightMargin = r0
            r4 = r8
        L7b:
            boolean r0 = r9.f3102u
            if (r0 == 0) goto L88
            int r0 = r3.topMargin
            int r7 = r7.f173b
            if (r0 == r7) goto L88
            r3.topMargin = r7
            goto L89
        L88:
            r8 = r4
        L89:
            if (r8 == 0) goto L8e
            r1.setLayoutParams(r3)
        L8e:
            int r0 = r1.getPaddingTop()
            r1.setPadding(r11, r0, r12, r10)
            boolean r0 = r5.f203a
            if (r0 == 0) goto L9d
            int r1 = r6.f175d
            r9.f3094m = r1
        L9d:
            if (r13 != 0) goto La3
            if (r0 == 0) goto La2
            goto La3
        La2:
            return r2
        La3:
            r9.m2051M()
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p002A1.C0019a.mo67d(android.view.View, K.u0):K.u0");
    }

    /* renamed from: e */
    public void m68e(boolean z2) {
        AbstractComponentCallbacksC0712o abstractComponentCallbacksC0712o = ((C0686D) this.f46b).f2461p;
        if (abstractComponentCallbacksC0712o != null) {
            abstractComponentCallbacksC0712o.m1756j().f2456k.m68e(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f47c).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z2) {
                throw null;
            }
            throw null;
        }
    }

    /* renamed from: f */
    public void m69f(boolean z2) {
        C0686D c0686d = (C0686D) this.f46b;
        AbstractActivityC0874g abstractActivityC0874g = c0686d.f2459n.f2659g;
        AbstractComponentCallbacksC0712o abstractComponentCallbacksC0712o = c0686d.f2461p;
        if (abstractComponentCallbacksC0712o != null) {
            abstractComponentCallbacksC0712o.m1756j().f2456k.m69f(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f47c).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z2) {
                throw null;
            }
            throw null;
        }
    }

    /* renamed from: g */
    public void m70g(boolean z2) {
        AbstractComponentCallbacksC0712o abstractComponentCallbacksC0712o = ((C0686D) this.f46b).f2461p;
        if (abstractComponentCallbacksC0712o != null) {
            abstractComponentCallbacksC0712o.m1756j().f2456k.m70g(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f47c).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z2) {
                throw null;
            }
            throw null;
        }
    }

    /* renamed from: h */
    public void m71h(boolean z2) {
        AbstractComponentCallbacksC0712o abstractComponentCallbacksC0712o = ((C0686D) this.f46b).f2461p;
        if (abstractComponentCallbacksC0712o != null) {
            abstractComponentCallbacksC0712o.m1756j().f2456k.m71h(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f47c).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z2) {
                throw null;
            }
            throw null;
        }
    }

    /* renamed from: i */
    public void m72i(boolean z2) {
        AbstractComponentCallbacksC0712o abstractComponentCallbacksC0712o = ((C0686D) this.f46b).f2461p;
        if (abstractComponentCallbacksC0712o != null) {
            abstractComponentCallbacksC0712o.m1756j().f2456k.m72i(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f47c).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z2) {
                throw null;
            }
            throw null;
        }
    }

    @Override // p146x1.InterfaceC1397b
    public Iterator iterator() {
        return new C1404b(this);
    }

    /* renamed from: j */
    public void m73j(boolean z2) {
        AbstractComponentCallbacksC0712o abstractComponentCallbacksC0712o = ((C0686D) this.f46b).f2461p;
        if (abstractComponentCallbacksC0712o != null) {
            abstractComponentCallbacksC0712o.m1756j().f2456k.m73j(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f47c).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z2) {
                throw null;
            }
            throw null;
        }
    }

    /* renamed from: k */
    public void m74k(boolean z2) {
        C0686D c0686d = (C0686D) this.f46b;
        AbstractActivityC0874g abstractActivityC0874g = c0686d.f2459n.f2659g;
        AbstractComponentCallbacksC0712o abstractComponentCallbacksC0712o = c0686d.f2461p;
        if (abstractComponentCallbacksC0712o != null) {
            abstractComponentCallbacksC0712o.m1756j().f2456k.m74k(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f47c).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z2) {
                throw null;
            }
            throw null;
        }
    }

    @Override // p011D1.InterfaceC0114d
    /* renamed from: l */
    public void mo25l(C0190i c0190i, IOException iOException) {
        switch (this.f45a) {
            case 0:
                ((C0038t) this.f47c).m153c(iOException.getLocalizedMessage());
                break;
            default:
                AbstractC1326c.m3062e(c0190i, "call");
                ((C0464f) this.f47c).m1148c(iOException);
                break;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00d2 A[PHI: r10 r12
  0x00d2: PHI (r10v6 java.lang.Integer) = (r10v4 java.lang.Integer), (r10v4 java.lang.Integer), (r10v7 java.lang.Integer) binds: [B:58:0x0101, B:55:0x00f8, B:38:0x00d0] A[DONT_GENERATE, DONT_INLINE]
  0x00d2: PHI (r12v7 java.lang.Integer) = (r12v4 java.lang.Integer), (r12v5 java.lang.Integer), (r12v4 java.lang.Integer) binds: [B:58:0x0101, B:55:0x00f8, B:38:0x00d0] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // p011D1.InterfaceC0114d
    /* renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void mo26m(p021H1.C0190i r20, p011D1.C0134x r21) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 506
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p002A1.C0019a.mo26m(H1.i, D1.x):void");
    }

    /* renamed from: n */
    public void m75n(boolean z2) {
        AbstractComponentCallbacksC0712o abstractComponentCallbacksC0712o = ((C0686D) this.f46b).f2461p;
        if (abstractComponentCallbacksC0712o != null) {
            abstractComponentCallbacksC0712o.m1756j().f2456k.m75n(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f47c).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z2) {
                throw null;
            }
            throw null;
        }
    }

    /* renamed from: o */
    public void m76o(boolean z2) {
        AbstractComponentCallbacksC0712o abstractComponentCallbacksC0712o = ((C0686D) this.f46b).f2461p;
        if (abstractComponentCallbacksC0712o != null) {
            abstractComponentCallbacksC0712o.m1756j().f2456k.m76o(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f47c).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z2) {
                throw null;
            }
            throw null;
        }
    }

    /* renamed from: p */
    public void m77p(boolean z2) {
        AbstractComponentCallbacksC0712o abstractComponentCallbacksC0712o = ((C0686D) this.f46b).f2461p;
        if (abstractComponentCallbacksC0712o != null) {
            abstractComponentCallbacksC0712o.m1756j().f2456k.m77p(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f47c).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z2) {
                throw null;
            }
            throw null;
        }
    }

    /* renamed from: q */
    public void m78q(boolean z2) {
        AbstractComponentCallbacksC0712o abstractComponentCallbacksC0712o = ((C0686D) this.f46b).f2461p;
        if (abstractComponentCallbacksC0712o != null) {
            abstractComponentCallbacksC0712o.m1756j().f2456k.m78q(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f47c).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z2) {
                throw null;
            }
            throw null;
        }
    }

    /* renamed from: r */
    public void m79r(boolean z2) {
        AbstractComponentCallbacksC0712o abstractComponentCallbacksC0712o = ((C0686D) this.f46b).f2461p;
        if (abstractComponentCallbacksC0712o != null) {
            abstractComponentCallbacksC0712o.m1756j().f2456k.m79r(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f47c).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z2) {
                throw null;
            }
            throw null;
        }
    }

    /* renamed from: s */
    public void m80s(boolean z2) {
        AbstractComponentCallbacksC0712o abstractComponentCallbacksC0712o = ((C0686D) this.f46b).f2461p;
        if (abstractComponentCallbacksC0712o != null) {
            abstractComponentCallbacksC0712o.m1756j().f2456k.m80s(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f47c).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z2) {
                throw null;
            }
            throw null;
        }
    }

    /* renamed from: t */
    public void m81t(boolean z2) {
        AbstractComponentCallbacksC0712o abstractComponentCallbacksC0712o = ((C0686D) this.f46b).f2461p;
        if (abstractComponentCallbacksC0712o != null) {
            abstractComponentCallbacksC0712o.m1756j().f2456k.m81t(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f47c).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z2) {
                throw null;
            }
            throw null;
        }
    }

    public String toString() {
        int iLastIndexOf;
        switch (this.f45a) {
            case 6:
                return "Bounds{lower=" + ((C0072d) this.f47c) + " upper=" + ((C0072d) this.f46b) + "}";
            case 14:
                StringBuilder sb = new StringBuilder(128);
                sb.append("LoaderManager{");
                sb.append(Integer.toHexString(System.identityHashCode(this)));
                sb.append(" in ");
                Object obj = this.f47c;
                if (obj == null) {
                    sb.append("null");
                } else {
                    String simpleName = obj.getClass().getSimpleName();
                    if (simpleName.length() <= 0 && (iLastIndexOf = (simpleName = obj.getClass().getName()).lastIndexOf(46)) > 0) {
                        simpleName = simpleName.substring(iLastIndexOf + 1);
                    }
                    sb.append(simpleName);
                    sb.append('{');
                    sb.append(Integer.toHexString(System.identityHashCode(obj)));
                }
                sb.append("}}");
                return sb.toString();
            case 22:
                String str = "[ ";
                if (((C1272f) this.f47c) != null) {
                    for (int i2 = 0; i2 < 9; i2++) {
                        str = str + ((C1272f) this.f47c).f5185h[i2] + " ";
                    }
                }
                return str + "] " + ((C1272f) this.f47c);
            default:
                return super.toString();
        }
    }

    /* renamed from: u */
    public void m82u(String str, PrintWriter printWriter) {
        C1250l c1250l = ((C0762a) this.f46b).f2873c;
        if (c1250l.f5062c > 0) {
            printWriter.print(str);
            printWriter.println("Loaders:");
            if (c1250l.f5062c <= 0) {
                return;
            }
            if (c1250l.f5061b[0] != null) {
                throw new ClassCastException();
            }
            printWriter.print(str);
            printWriter.print("  #");
            printWriter.print(c1250l.f5060a[0]);
            printWriter.print(": ");
            throw null;
        }
    }

    /* renamed from: v */
    public void m83v(int i2) {
        int[] iArr = (int[]) this.f47c;
        if (iArr == null) {
            int[] iArr2 = new int[Math.max(i2, 10) + 1];
            this.f47c = iArr2;
            Arrays.fill(iArr2, -1);
        } else if (i2 >= iArr.length) {
            int length = iArr.length;
            while (length <= i2) {
                length *= 2;
            }
            int[] iArr3 = new int[length];
            this.f47c = iArr3;
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            int[] iArr4 = (int[]) this.f47c;
            Arrays.fill(iArr4, iArr.length, iArr4.length, -1);
        }
    }

    /* renamed from: w */
    public View m84w(int i2, int i3, int i4, int i5) {
        View viewM2372u;
        C0909H c0909h = (C0909H) this.f47c;
        int iM2344d = c0909h.m2344d();
        int iM2343c = c0909h.m2343c();
        int i6 = i3 > i2 ? 1 : -1;
        View view = null;
        while (i2 != i3) {
            switch (c0909h.f3746a) {
                case 0:
                    viewM2372u = c0909h.f3747b.m2372u(i2);
                    break;
                default:
                    viewM2372u = c0909h.f3747b.m2372u(i2);
                    break;
            }
            int iM2342b = c0909h.m2342b(viewM2372u);
            int iM2341a = c0909h.m2341a(viewM2372u);
            C0942h0 c0942h0 = (C0942h0) this.f46b;
            c0942h0.f3905b = iM2344d;
            c0942h0.f3906c = iM2343c;
            c0942h0.f3907d = iM2342b;
            c0942h0.f3908e = iM2341a;
            if (i4 != 0) {
                c0942h0.f3904a = i4;
                if (c0942h0.m2440a()) {
                    return viewM2372u;
                }
            }
            if (i5 != 0) {
                c0942h0.f3904a = i5;
                if (c0942h0.m2440a()) {
                    view = viewM2372u;
                }
            }
            i2 += i6;
        }
        return view;
    }

    /* renamed from: y */
    public boolean m85y(CharSequence charSequence, int i2, int i3, C0673l c0673l) {
        if (c0673l.f2408c == 0) {
            C0665d c0665d = (C0665d) this.f46b;
            C0551a c0551aM1632b = c0673l.m1632b();
            int iM610a = c0551aM1632b.m610a(8);
            if (iM610a != 0) {
                ((ByteBuffer) c0551aM1632b.f806d).getShort(iM610a + c0551aM1632b.f803a);
            }
            c0665d.getClass();
            ThreadLocal threadLocal = C0665d.f2384b;
            if (threadLocal.get() == null) {
                threadLocal.set(new StringBuilder());
            }
            StringBuilder sb = (StringBuilder) threadLocal.get();
            sb.setLength(0);
            while (i2 < i3) {
                sb.append(charSequence.charAt(i2));
                i2++;
            }
            TextPaint textPaint = c0665d.f2385a;
            String string = sb.toString();
            int i4 = AbstractC0074f.f176a;
            c0673l.f2408c = AbstractC0073e.m231a(textPaint, string) ? 2 : 1;
        }
        return c0673l.f2408c == 2;
    }

    /* renamed from: z */
    public void m86z() {
        ((SparseIntArray) this.f47c).clear();
    }

    public /* synthetic */ C0019a(int i2, boolean z2) {
        this.f45a = i2;
    }

    public /* synthetic */ C0019a(Object obj, int i2, Object obj2) {
        this.f45a = i2;
        this.f47c = obj;
        this.f46b = obj2;
    }

    public /* synthetic */ C0019a(Object obj, Object obj2, int i2, boolean z2) {
        this.f45a = i2;
        this.f46b = obj;
        this.f47c = obj2;
    }

    public C0019a(InterfaceC0753r interfaceC0753r, C0734K c0734k) {
        C0762a c0762a;
        this.f45a = 14;
        this.f47c = interfaceC0753r;
        AbstractC1326c.m3062e(c0734k, "store");
        C0624a c0624a = C0624a.f1944b;
        AbstractC1326c.m3062e(c0624a, "defaultCreationExtras");
        String canonicalName = C0762a.class.getCanonicalName();
        if (canonicalName != null) {
            String strConcat = "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(canonicalName);
            AbstractC1326c.m3062e(strConcat, "key");
            LinkedHashMap linkedHashMap = c0734k.f2707a;
            AbstractC0732I abstractC0732I = (AbstractC0732I) linkedHashMap.get(strConcat);
            if (C0762a.class.isInstance(abstractC0732I)) {
                AbstractC1326c.m3060c(abstractC0732I, "null cannot be cast to non-null type T of androidx.lifecycle.ViewModelProvider.get");
            } else {
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                linkedHashMap2.putAll(c0624a.f1945a);
                linkedHashMap2.put(C0733J.f2706b, strConcat);
                try {
                    c0762a = new C0762a();
                } catch (AbstractMethodError unused) {
                    c0762a = new C0762a();
                }
                abstractC0732I = c0762a;
                AbstractC0732I abstractC0732I2 = (AbstractC0732I) linkedHashMap.put(strConcat, abstractC0732I);
                if (abstractC0732I2 != null) {
                    abstractC0732I2.mo1694a();
                }
            }
            this.f46b = (C0762a) abstractC0732I;
            return;
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    public C0019a(C0686D c0686d) {
        this.f45a = 13;
        this.f47c = new CopyOnWriteArrayList();
        this.f46b = c0686d;
    }

    public C0019a(Runnable runnable) {
        this.f45a = 5;
        this.f46b = new CopyOnWriteArrayList();
        new HashMap();
        this.f47c = runnable;
    }

    public C0019a(C0121k c0121k, C0511e c0511e, C0665d c0665d) {
        this.f45a = 11;
        this.f47c = c0121k;
        this.f46b = c0665d;
    }

    public C0019a(C0909H c0909h) {
        this.f45a = 19;
        this.f47c = c0909h;
        C0942h0 c0942h0 = new C0942h0();
        c0942h0.f3904a = 0;
        this.f46b = c0942h0;
    }

    public C0019a(ArrayList arrayList, ArrayList arrayList2) {
        this.f45a = 2;
        int size = arrayList.size();
        this.f47c = new int[size];
        this.f46b = new float[size];
        for (int i2 = 0; i2 < size; i2++) {
            ((int[]) this.f47c)[i2] = ((Integer) arrayList.get(i2)).intValue();
            ((float[]) this.f46b)[i2] = ((Float) arrayList2.get(i2)).floatValue();
        }
    }

    public C0019a(int i2, int i3) {
        this.f45a = 2;
        this.f47c = new int[]{i2, i3};
        this.f46b = new float[]{0.0f, 1.0f};
    }

    public C0019a(int i2, int i3, int i4) {
        this.f45a = 2;
        this.f47c = new int[]{i2, i3, i4};
        this.f46b = new float[]{0.0f, 0.5f, 1.0f};
    }

    public C0019a(EditText editText) {
        this.f45a = 9;
        this.f47c = editText;
        C0596i c0596i = new C0596i(editText);
        this.f46b = c0596i;
        editText.addTextChangedListener(c0596i);
        if (C0588a.f1888b == null) {
            synchronized (C0588a.f1887a) {
                try {
                    if (C0588a.f1888b == null) {
                        C0588a c0588a = new C0588a();
                        try {
                            C0588a.f1889c = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, C0588a.class.getClassLoader());
                        } catch (Throwable unused) {
                        }
                        C0588a.f1888b = c0588a;
                    }
                } finally {
                }
            }
        }
        editText.setEditableFactory(C0588a.f1888b);
    }

    public C0019a(Animation animation) {
        this.f45a = 12;
        this.f47c = animation;
        this.f46b = null;
    }

    public C0019a(Animator animator) {
        this.f45a = 12;
        this.f47c = null;
        this.f46b = animator;
    }

    public C0019a(int i2) {
        this.f45a = i2;
        switch (i2) {
            case 20:
                this.f47c = new C1249k();
                this.f46b = new C1243e();
                break;
            default:
                this.f47c = new SparseIntArray();
                this.f46b = new SparseIntArray();
                break;
        }
    }

    public C0019a(CharSequence charSequence, C1199a c1199a) {
        this.f45a = 24;
        AbstractC1326c.m3062e(charSequence, "input");
        this.f47c = charSequence;
        this.f46b = c1199a;
    }
}
