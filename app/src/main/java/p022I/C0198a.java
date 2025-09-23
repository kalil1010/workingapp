package p022I;

/* renamed from: I.a */
/* loaded from: classes.dex */
public final class C0198a {

    /* renamed from: e */
    public static final byte[] f741e = new byte[1792];

    /* renamed from: a */
    public final CharSequence f742a;

    /* renamed from: b */
    public final int f743b;

    /* renamed from: c */
    public int f744c;

    /* renamed from: d */
    public char f745d;

    static {
        for (int i2 = 0; i2 < 1792; i2++) {
            f741e[i2] = Character.getDirectionality(i2);
        }
    }

    public C0198a(CharSequence charSequence) {
        this.f742a = charSequence;
        this.f743b = charSequence.length();
    }

    /* renamed from: a */
    public final byte m531a() {
        int i2 = this.f744c - 1;
        CharSequence charSequence = this.f742a;
        char cCharAt = charSequence.charAt(i2);
        this.f745d = cCharAt;
        if (Character.isLowSurrogate(cCharAt)) {
            int iCodePointBefore = Character.codePointBefore(charSequence, this.f744c);
            this.f744c -= Character.charCount(iCodePointBefore);
            return Character.getDirectionality(iCodePointBefore);
        }
        this.f744c--;
        char c3 = this.f745d;
        return c3 < 1792 ? f741e[c3] : Character.getDirectionality(c3);
    }
}
