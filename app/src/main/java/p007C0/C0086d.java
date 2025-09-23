package p007C0;

import com.google.android.material.bottomsheet.BottomSheetBehavior;
import p022I.C0204g;

/* renamed from: C0.d */
/* loaded from: classes.dex */
public final class C0086d {

    /* renamed from: a */
    public final boolean f203a;

    /* renamed from: b */
    public final Object f204b;

    public C0086d(C0204g c0204g, boolean z2) {
        this.f204b = c0204g;
        this.f203a = z2;
    }

    /* renamed from: a */
    public boolean m278a() {
        return this.f203a;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0036  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean m279b(java.lang.CharSequence r7, int r8) {
        /*
            r6 = this;
            r0 = 1
            if (r7 == 0) goto L44
            if (r8 < 0) goto L44
            int r1 = r7.length()
            int r1 = r1 - r8
            if (r1 < 0) goto L44
            java.lang.Object r1 = r6.f204b
            I.g r1 = (p022I.C0204g) r1
            if (r1 != 0) goto L17
            boolean r7 = r6.m278a()
            return r7
        L17:
            r1 = 0
            r2 = 2
            r3 = r1
            r4 = r2
        L1b:
            if (r3 >= r8) goto L39
            if (r4 != r2) goto L39
            char r4 = r7.charAt(r3)
            byte r4 = java.lang.Character.getDirectionality(r4)
            C0.d r5 = p022I.AbstractC0205h.f756a
            if (r4 == 0) goto L36
            if (r4 == r0) goto L34
            if (r4 == r2) goto L34
            switch(r4) {
                case 14: goto L36;
                case 15: goto L36;
                case 16: goto L34;
                case 17: goto L34;
                default: goto L32;
            }
        L32:
            r4 = r2
            goto L37
        L34:
            r4 = r1
            goto L37
        L36:
            r4 = r0
        L37:
            int r3 = r3 + r0
            goto L1b
        L39:
            if (r4 == 0) goto L43
            if (r4 == r0) goto L42
            boolean r7 = r6.m278a()
            return r7
        L42:
            return r1
        L43:
            return r0
        L44:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            r7.<init>()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p007C0.C0086d.m279b(java.lang.CharSequence, int):boolean");
    }

    public C0086d(BottomSheetBehavior bottomSheetBehavior, boolean z2) {
        this.f204b = bottomSheetBehavior;
        this.f203a = z2;
    }
}
