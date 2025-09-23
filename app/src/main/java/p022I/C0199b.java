package p022I;

import android.text.SpannableStringBuilder;
import p007C0.C0086d;

/* renamed from: I.b */
/* loaded from: classes.dex */
public final class C0199b {

    /* renamed from: b */
    public static final String f746b;

    /* renamed from: c */
    public static final String f747c;

    /* renamed from: d */
    public static final C0199b f748d;

    /* renamed from: e */
    public static final C0199b f749e;

    /* renamed from: a */
    public final boolean f750a;

    static {
        C0086d c0086d = AbstractC0205h.f758c;
        f746b = Character.toString((char) 8206);
        f747c = Character.toString((char) 8207);
        f748d = new C0199b(false);
        f749e = new C0199b(true);
    }

    public C0199b(boolean z2) {
        C0086d c0086d = AbstractC0205h.f756a;
        this.f750a = z2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x006e, code lost:
    
        if (r1 != 0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0071, code lost:
    
        if (r2 == 0) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0073, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0076, code lost:
    
        if (r0.f744c <= 0) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x007c, code lost:
    
        switch(r0.m531a()) {
            case 14: goto L66;
            case 15: goto L66;
            case 16: goto L65;
            case 17: goto L65;
            case 18: goto L64;
            default: goto L70;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0080, code lost:
    
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0083, code lost:
    
        if (r1 != r3) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0085, code lost:
    
        return 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0086, code lost:
    
        r3 = r3 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0089, code lost:
    
        if (r1 != r3) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x008c, code lost:
    
        return 0;
     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int m532a(java.lang.CharSequence r9) {
        /*
            I.a r0 = new I.a
            r0.<init>(r9)
            r9 = 0
            r0.f744c = r9
            r1 = r9
            r2 = r1
            r3 = r2
        Lb:
            int r4 = r0.f744c
            int r5 = r0.f743b
            r6 = 1
            r7 = -1
            if (r4 >= r5) goto L6e
            if (r1 != 0) goto L6e
            java.lang.CharSequence r5 = r0.f742a
            char r4 = r5.charAt(r4)
            r0.f745d = r4
            boolean r4 = java.lang.Character.isHighSurrogate(r4)
            if (r4 == 0) goto L37
            int r4 = r0.f744c
            int r4 = java.lang.Character.codePointAt(r5, r4)
            int r5 = r0.f744c
            int r8 = java.lang.Character.charCount(r4)
            int r8 = r8 + r5
            r0.f744c = r8
            byte r4 = java.lang.Character.getDirectionality(r4)
            goto L4b
        L37:
            int r4 = r0.f744c
            int r4 = r4 + r6
            r0.f744c = r4
            char r4 = r0.f745d
            r5 = 1792(0x700, float:2.511E-42)
            if (r4 >= r5) goto L47
            byte[] r5 = p022I.C0198a.f741e
            r4 = r5[r4]
            goto L4b
        L47:
            byte r4 = java.lang.Character.getDirectionality(r4)
        L4b:
            if (r4 == 0) goto L69
            if (r4 == r6) goto L66
            r5 = 2
            if (r4 == r5) goto L66
            r5 = 9
            if (r4 == r5) goto Lb
            switch(r4) {
                case 14: goto L62;
                case 15: goto L62;
                case 16: goto L5e;
                case 17: goto L5e;
                case 18: goto L5a;
                default: goto L59;
            }
        L59:
            goto L6c
        L5a:
            int r3 = r3 + (-1)
            r2 = r9
            goto Lb
        L5e:
            int r3 = r3 + 1
            r2 = r6
            goto Lb
        L62:
            int r3 = r3 + 1
            r2 = r7
            goto Lb
        L66:
            if (r3 != 0) goto L6c
            goto L85
        L69:
            if (r3 != 0) goto L6c
            goto L8b
        L6c:
            r1 = r3
            goto Lb
        L6e:
            if (r1 != 0) goto L71
            goto L8c
        L71:
            if (r2 == 0) goto L74
            return r2
        L74:
            int r2 = r0.f744c
            if (r2 <= 0) goto L8c
            byte r2 = r0.m531a()
            switch(r2) {
                case 14: goto L89;
                case 15: goto L89;
                case 16: goto L83;
                case 17: goto L83;
                case 18: goto L80;
                default: goto L7f;
            }
        L7f:
            goto L74
        L80:
            int r3 = r3 + 1
            goto L74
        L83:
            if (r1 != r3) goto L86
        L85:
            return r6
        L86:
            int r3 = r3 + (-1)
            goto L74
        L89:
            if (r1 != r3) goto L86
        L8b:
            return r7
        L8c:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p022I.C0199b.m532a(java.lang.CharSequence):int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0034, code lost:
    
        return 1;
     */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int m533b(java.lang.CharSequence r6) {
        /*
            I.a r0 = new I.a
            r0.<init>(r6)
            int r6 = r0.f743b
            r0.f744c = r6
            r6 = 0
            r1 = r6
        Lb:
            r2 = r1
        Lc:
            int r3 = r0.f744c
            if (r3 <= 0) goto L3f
            byte r3 = r0.m531a()
            if (r3 == 0) goto L38
            r4 = 1
            if (r3 == r4) goto L32
            r5 = 2
            if (r3 == r5) goto L32
            r5 = 9
            if (r3 == r5) goto Lc
            switch(r3) {
                case 14: goto L2f;
                case 15: goto L2f;
                case 16: goto L29;
                case 17: goto L29;
                case 18: goto L26;
                default: goto L23;
            }
        L23:
            if (r2 != 0) goto Lc
            goto L3e
        L26:
            int r1 = r1 + 1
            goto Lc
        L29:
            if (r2 != r1) goto L2c
            goto L34
        L2c:
            int r1 = r1 + (-1)
            goto Lc
        L2f:
            if (r2 != r1) goto L2c
            goto L3a
        L32:
            if (r1 != 0) goto L35
        L34:
            return r4
        L35:
            if (r2 != 0) goto Lc
            goto L3e
        L38:
            if (r1 != 0) goto L3c
        L3a:
            r6 = -1
            return r6
        L3c:
            if (r2 != 0) goto Lc
        L3e:
            goto Lb
        L3f:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p022I.C0199b.m533b(java.lang.CharSequence):int");
    }

    /* renamed from: c */
    public final SpannableStringBuilder m534c(CharSequence charSequence) {
        C0086d c0086d = AbstractC0205h.f758c;
        if (charSequence == null) {
            return null;
        }
        boolean zM279b = c0086d.m279b(charSequence, charSequence.length());
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        boolean zM279b2 = (zM279b ? AbstractC0205h.f757b : AbstractC0205h.f756a).m279b(charSequence, charSequence.length());
        String str = "";
        String str2 = f747c;
        String str3 = f746b;
        boolean z2 = this.f750a;
        spannableStringBuilder.append((CharSequence) ((z2 || !(zM279b2 || m532a(charSequence) == 1)) ? (!z2 || (zM279b2 && m532a(charSequence) != -1)) ? "" : str2 : str3));
        if (zM279b != z2) {
            spannableStringBuilder.append(zM279b ? (char) 8235 : (char) 8234);
            spannableStringBuilder.append(charSequence);
            spannableStringBuilder.append((char) 8236);
        } else {
            spannableStringBuilder.append(charSequence);
        }
        boolean zM279b3 = (zM279b ? AbstractC0205h.f757b : AbstractC0205h.f756a).m279b(charSequence, charSequence.length());
        if (!z2 && (zM279b3 || m533b(charSequence) == 1)) {
            str = str3;
        } else if (z2 && (!zM279b3 || m533b(charSequence) == -1)) {
            str = str2;
        }
        spannableStringBuilder.append((CharSequence) str);
        return spannableStringBuilder;
    }
}
