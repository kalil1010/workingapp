package p104i1;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import p085c2.AbstractC0808b;
import p085c2.InterfaceC0807a;
import p093e2.AbstractC0901d;

/* renamed from: i1.a */
/* loaded from: classes.dex */
public final class C1022a {

    /* renamed from: c */
    public static final InterfaceC0807a f4330c = AbstractC0808b.m2015e(C1022a.class.getName());

    /* renamed from: d */
    public static final Charset f4331d = Charset.forName("ASCII");

    /* renamed from: a */
    public final byte[] f4332a;

    /* renamed from: b */
    public int f4333b;

    public C1022a(byte[] bArr) {
        byte[] bArr2 = new byte[bArr.length];
        this.f4332a = bArr2;
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
    }

    /* renamed from: a */
    public static byte m2608a(int i2, int i3) {
        byte b = (byte) ((((byte) ((-1) << i2)) & 255) >> i2);
        int i4 = 8 - (i3 + i2);
        return i4 > 0 ? (byte) (((byte) (b >> i4)) << i4) : b;
    }

    /* renamed from: b */
    public final byte[] m2609b(int i2) {
        int iCeil = (int) Math.ceil(i2 / 8.0f);
        byte[] bArr = new byte[iCeil];
        int i3 = this.f4333b;
        int i4 = i3 % 8;
        byte[] bArr2 = this.f4332a;
        int i5 = 0;
        if (i4 == 0) {
            System.arraycopy(bArr2, i3 / 8, bArr, 0, iCeil);
            int i6 = i2 % 8;
            if (i6 == 0) {
                i6 = 8;
            }
            int i7 = iCeil - 1;
            bArr[i7] = (byte) (m2608a(this.f4333b % 8, i6) & bArr[i7]);
            this.f4333b += i2;
            return bArr;
        }
        int i8 = i3 + i2;
        while (true) {
            int i9 = this.f4333b;
            if (i9 >= i8) {
                return bArr;
            }
            int i10 = i9 % 8;
            int i11 = i5 % 8;
            int iMin = Math.min(i8 - i9, Math.min(8 - i10, 8 - i11));
            byte bM2608a = (byte) (bArr2[this.f4333b / 8] & m2608a(i10, iMin));
            byte bMin = (byte) (i10 != 0 ? bM2608a << Math.min(i10, 8 - iMin) : (bM2608a & 255) >> i11);
            int i12 = i5 / 8;
            bArr[i12] = (byte) (bMin | bArr[i12]);
            this.f4333b += iMin;
            i5 += iMin;
        }
    }

    /* renamed from: c */
    public final Date m2610c(int i2, String str, boolean z2) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str);
        String strM2312q = z2 ? AbstractC0901d.m2312q(m2609b(i2), false) : new String(m2609b(i2), f4331d);
        try {
            return simpleDateFormat.parse(strM2312q);
        } catch (ParseException e3) {
            f4330c.mo124g("Parsing date error. date:" + strM2312q + " pattern:" + str, e3);
            return null;
        }
    }

    /* renamed from: d */
    public final int m2611d(int i2) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(16);
        int i3 = this.f4333b + i2;
        long jMin = 0;
        while (true) {
            int i4 = this.f4333b;
            if (i4 >= i3) {
                byteBufferAllocate.putLong(jMin);
                byteBufferAllocate.rewind();
                return (int) byteBufferAllocate.getLong();
            }
            int i5 = i4 % 8;
            jMin = (jMin << Math.min(i2, 8)) | (((((this.f4332a[i4 / 8] & m2608a(i5, i2)) & 255) & 255) >>> Math.max(8 - (i5 + i2), 0)) & 255);
            int i6 = 8 - i5;
            i2 -= i6;
            this.f4333b = Math.min(this.f4333b + i6, i3);
        }
    }
}
