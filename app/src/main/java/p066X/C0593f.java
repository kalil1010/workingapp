package p066X;

import android.text.InputFilter;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.SparseArray;
import android.widget.TextView;
import p093e2.AbstractC0901d;

/* renamed from: X.f */
/* loaded from: classes.dex */
public final class C0593f extends AbstractC0901d {

    /* renamed from: c */
    public final TextView f1898c;

    /* renamed from: d */
    public final C0591d f1899d;

    /* renamed from: e */
    public boolean f1900e = true;

    public C0593f(TextView textView) {
        this.f1898c = textView;
        this.f1899d = new C0591d(textView);
    }

    @Override // p093e2.AbstractC0901d
    /* renamed from: A */
    public final InputFilter[] mo1398A(InputFilter[] inputFilterArr) {
        if (!this.f1900e) {
            SparseArray sparseArray = new SparseArray(1);
            for (int i2 = 0; i2 < inputFilterArr.length; i2++) {
                InputFilter inputFilter = inputFilterArr[i2];
                if (inputFilter instanceof C0591d) {
                    sparseArray.put(i2, inputFilter);
                }
            }
            if (sparseArray.size() == 0) {
                return inputFilterArr;
            }
            int length = inputFilterArr.length;
            InputFilter[] inputFilterArr2 = new InputFilter[inputFilterArr.length - sparseArray.size()];
            int i3 = 0;
            for (int i4 = 0; i4 < length; i4++) {
                if (sparseArray.indexOfKey(i4) < 0) {
                    inputFilterArr2[i3] = inputFilterArr[i4];
                    i3++;
                }
            }
            return inputFilterArr2;
        }
        int length2 = inputFilterArr.length;
        int i5 = 0;
        while (true) {
            C0591d c0591d = this.f1899d;
            if (i5 >= length2) {
                InputFilter[] inputFilterArr3 = new InputFilter[inputFilterArr.length + 1];
                System.arraycopy(inputFilterArr, 0, inputFilterArr3, 0, length2);
                inputFilterArr3[length2] = c0591d;
                return inputFilterArr3;
            }
            if (inputFilterArr[i5] == c0591d) {
                return inputFilterArr;
            }
            i5++;
        }
    }

    @Override // p093e2.AbstractC0901d
    /* renamed from: m0 */
    public final void mo1399m0(boolean z2) {
        if (z2) {
            m1401w0();
        }
    }

    @Override // p093e2.AbstractC0901d
    /* renamed from: o0 */
    public final void mo1400o0(boolean z2) {
        this.f1900e = z2;
        m1401w0();
        TextView textView = this.f1898c;
        textView.setFilters(mo1398A(textView.getFilters()));
    }

    /* renamed from: w0 */
    public final void m1401w0() {
        TextView textView = this.f1898c;
        TransformationMethod transformationMethod = textView.getTransformationMethod();
        if (this.f1900e) {
            if (!(transformationMethod instanceof C0597j) && !(transformationMethod instanceof PasswordTransformationMethod)) {
                transformationMethod = new C0597j(transformationMethod);
            }
        } else if (transformationMethod instanceof C0597j) {
            transformationMethod = ((C0597j) transformationMethod).f1906a;
        }
        textView.setTransformationMethod(transformationMethod);
    }
}
