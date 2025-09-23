package p123p0;

import java.util.Arrays;
import p093e2.AbstractC0901d;

/* renamed from: p0.b */
/* loaded from: classes.dex */
public final class C1266b {

    /* renamed from: a */
    public final byte[] f5136a;

    /* renamed from: b */
    public final String f5137b;

    /* renamed from: c */
    public final int f5138c;

    /* renamed from: d */
    public final int f5139d;

    /* renamed from: e */
    public final int f5140e;

    public C1266b(String str, int i2, String str2) {
        this(AbstractC0901d.m2314r(str), i2, str2);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1266b)) {
            return false;
        }
        byte[] bArr = this.f5136a;
        int length = bArr.length;
        byte[] bArr2 = ((C1266b) obj).f5136a;
        if (length != bArr2.length) {
            return false;
        }
        return Arrays.equals(bArr, bArr2);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f5136a) + 177;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("Tag[");
        sb.append(AbstractC0901d.m2312q(this.f5136a, true));
        sb.append("] Name=");
        sb.append(this.f5137b);
        sb.append(", TagType=");
        int i2 = this.f5140e;
        sb.append(i2 != 1 ? i2 != 2 ? "null" : "CONSTRUCTED" : "PRIMITIVE");
        sb.append(", ValueType=");
        switch (this.f5138c) {
            case 1:
                str = "BINARY";
                break;
            case 2:
                str = "NUMERIC";
                break;
            case 3:
                str = "TEXT";
                break;
            case 4:
                str = "MIXED";
                break;
            case 5:
                str = "DOL";
                break;
            case 6:
                str = "TEMPLATE";
                break;
            default:
                str = "null";
                break;
        }
        sb.append(str);
        sb.append(", Class=");
        int i3 = this.f5139d;
        sb.append(i3 != 1 ? i3 != 2 ? i3 != 3 ? i3 != 4 ? "null" : "PRIVATE" : "CONTEXT_SPECIFIC" : "APPLICATION" : "UNIVERSAL");
        return sb.toString();
    }

    public C1266b(byte[] bArr, int i2, String str) {
        if (bArr.length == 0) {
            throw new IllegalArgumentException("Param id cannot be empty");
        }
        if (i2 == 0) {
            throw new IllegalArgumentException("Param tagValueType cannot be null");
        }
        this.f5136a = bArr;
        this.f5137b = str;
        this.f5138c = i2;
        byte b = bArr[0];
        if ((b & 32) != 0) {
            this.f5140e = 2;
        } else {
            this.f5140e = 1;
        }
        byte b3 = (byte) ((b >>> 6) & 3);
        if (b3 == 1) {
            this.f5139d = 2;
            return;
        }
        if (b3 == 2) {
            this.f5139d = 3;
        } else if (b3 != 3) {
            this.f5139d = 1;
        } else {
            this.f5139d = 4;
        }
    }
}
