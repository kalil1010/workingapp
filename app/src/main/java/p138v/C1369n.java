package p138v;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParserException;
import p124q.AbstractC1271e;
import p126r.AbstractC1283a;
import p129s.C1312a;
import p135u.AbstractC1352a;

/* renamed from: v.n */
/* loaded from: classes.dex */
public final class C1369n {

    /* renamed from: d */
    public static final int[] f5965d = {0, 4, 8};

    /* renamed from: e */
    public static final SparseIntArray f5966e;

    /* renamed from: f */
    public static final SparseIntArray f5967f;

    /* renamed from: a */
    public final HashMap f5968a = new HashMap();

    /* renamed from: b */
    public final boolean f5969b = true;

    /* renamed from: c */
    public final HashMap f5970c = new HashMap();

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f5966e = sparseIntArray;
        SparseIntArray sparseIntArray2 = new SparseIntArray();
        f5967f = sparseIntArray2;
        sparseIntArray.append(82, 25);
        sparseIntArray.append(83, 26);
        sparseIntArray.append(85, 29);
        sparseIntArray.append(86, 30);
        sparseIntArray.append(92, 36);
        sparseIntArray.append(91, 35);
        sparseIntArray.append(63, 4);
        sparseIntArray.append(62, 3);
        sparseIntArray.append(58, 1);
        sparseIntArray.append(60, 91);
        sparseIntArray.append(59, 92);
        sparseIntArray.append(101, 6);
        sparseIntArray.append(102, 7);
        sparseIntArray.append(70, 17);
        sparseIntArray.append(71, 18);
        sparseIntArray.append(72, 19);
        sparseIntArray.append(54, 99);
        sparseIntArray.append(0, 27);
        sparseIntArray.append(87, 32);
        sparseIntArray.append(88, 33);
        sparseIntArray.append(69, 10);
        sparseIntArray.append(68, 9);
        sparseIntArray.append(106, 13);
        sparseIntArray.append(109, 16);
        sparseIntArray.append(107, 14);
        sparseIntArray.append(104, 11);
        sparseIntArray.append(108, 15);
        sparseIntArray.append(105, 12);
        sparseIntArray.append(95, 40);
        sparseIntArray.append(80, 39);
        sparseIntArray.append(79, 41);
        sparseIntArray.append(94, 42);
        sparseIntArray.append(78, 20);
        sparseIntArray.append(93, 37);
        sparseIntArray.append(67, 5);
        sparseIntArray.append(81, 87);
        sparseIntArray.append(90, 87);
        sparseIntArray.append(84, 87);
        sparseIntArray.append(61, 87);
        sparseIntArray.append(57, 87);
        sparseIntArray.append(5, 24);
        sparseIntArray.append(7, 28);
        sparseIntArray.append(23, 31);
        sparseIntArray.append(24, 8);
        sparseIntArray.append(6, 34);
        sparseIntArray.append(8, 2);
        sparseIntArray.append(3, 23);
        sparseIntArray.append(4, 21);
        sparseIntArray.append(96, 95);
        sparseIntArray.append(73, 96);
        sparseIntArray.append(2, 22);
        sparseIntArray.append(13, 43);
        sparseIntArray.append(26, 44);
        sparseIntArray.append(21, 45);
        sparseIntArray.append(22, 46);
        sparseIntArray.append(20, 60);
        sparseIntArray.append(18, 47);
        sparseIntArray.append(19, 48);
        sparseIntArray.append(14, 49);
        sparseIntArray.append(15, 50);
        sparseIntArray.append(16, 51);
        sparseIntArray.append(17, 52);
        sparseIntArray.append(25, 53);
        sparseIntArray.append(97, 54);
        sparseIntArray.append(74, 55);
        sparseIntArray.append(98, 56);
        sparseIntArray.append(75, 57);
        sparseIntArray.append(99, 58);
        sparseIntArray.append(76, 59);
        sparseIntArray.append(64, 61);
        sparseIntArray.append(66, 62);
        sparseIntArray.append(65, 63);
        sparseIntArray.append(28, 64);
        sparseIntArray.append(121, 65);
        sparseIntArray.append(35, 66);
        sparseIntArray.append(122, 67);
        sparseIntArray.append(113, 79);
        sparseIntArray.append(1, 38);
        sparseIntArray.append(112, 68);
        sparseIntArray.append(100, 69);
        sparseIntArray.append(77, 70);
        sparseIntArray.append(111, 97);
        sparseIntArray.append(32, 71);
        sparseIntArray.append(30, 72);
        sparseIntArray.append(31, 73);
        sparseIntArray.append(33, 74);
        sparseIntArray.append(29, 75);
        sparseIntArray.append(114, 76);
        sparseIntArray.append(89, 77);
        sparseIntArray.append(123, 78);
        sparseIntArray.append(56, 80);
        sparseIntArray.append(55, 81);
        sparseIntArray.append(116, 82);
        sparseIntArray.append(120, 83);
        sparseIntArray.append(119, 84);
        sparseIntArray.append(118, 85);
        sparseIntArray.append(117, 86);
        sparseIntArray2.append(85, 6);
        sparseIntArray2.append(85, 7);
        sparseIntArray2.append(0, 27);
        sparseIntArray2.append(89, 13);
        sparseIntArray2.append(92, 16);
        sparseIntArray2.append(90, 14);
        sparseIntArray2.append(87, 11);
        sparseIntArray2.append(91, 15);
        sparseIntArray2.append(88, 12);
        sparseIntArray2.append(78, 40);
        sparseIntArray2.append(71, 39);
        sparseIntArray2.append(70, 41);
        sparseIntArray2.append(77, 42);
        sparseIntArray2.append(69, 20);
        sparseIntArray2.append(76, 37);
        sparseIntArray2.append(60, 5);
        sparseIntArray2.append(72, 87);
        sparseIntArray2.append(75, 87);
        sparseIntArray2.append(73, 87);
        sparseIntArray2.append(57, 87);
        sparseIntArray2.append(56, 87);
        sparseIntArray2.append(5, 24);
        sparseIntArray2.append(7, 28);
        sparseIntArray2.append(23, 31);
        sparseIntArray2.append(24, 8);
        sparseIntArray2.append(6, 34);
        sparseIntArray2.append(8, 2);
        sparseIntArray2.append(3, 23);
        sparseIntArray2.append(4, 21);
        sparseIntArray2.append(79, 95);
        sparseIntArray2.append(64, 96);
        sparseIntArray2.append(2, 22);
        sparseIntArray2.append(13, 43);
        sparseIntArray2.append(26, 44);
        sparseIntArray2.append(21, 45);
        sparseIntArray2.append(22, 46);
        sparseIntArray2.append(20, 60);
        sparseIntArray2.append(18, 47);
        sparseIntArray2.append(19, 48);
        sparseIntArray2.append(14, 49);
        sparseIntArray2.append(15, 50);
        sparseIntArray2.append(16, 51);
        sparseIntArray2.append(17, 52);
        sparseIntArray2.append(25, 53);
        sparseIntArray2.append(80, 54);
        sparseIntArray2.append(65, 55);
        sparseIntArray2.append(81, 56);
        sparseIntArray2.append(66, 57);
        sparseIntArray2.append(82, 58);
        sparseIntArray2.append(67, 59);
        sparseIntArray2.append(59, 62);
        sparseIntArray2.append(58, 63);
        sparseIntArray2.append(28, 64);
        sparseIntArray2.append(105, 65);
        sparseIntArray2.append(34, 66);
        sparseIntArray2.append(106, 67);
        sparseIntArray2.append(96, 79);
        sparseIntArray2.append(1, 38);
        sparseIntArray2.append(97, 98);
        sparseIntArray2.append(95, 68);
        sparseIntArray2.append(83, 69);
        sparseIntArray2.append(68, 70);
        sparseIntArray2.append(32, 71);
        sparseIntArray2.append(30, 72);
        sparseIntArray2.append(31, 73);
        sparseIntArray2.append(33, 74);
        sparseIntArray2.append(29, 75);
        sparseIntArray2.append(98, 76);
        sparseIntArray2.append(74, 77);
        sparseIntArray2.append(107, 78);
        sparseIntArray2.append(55, 80);
        sparseIntArray2.append(54, 81);
        sparseIntArray2.append(100, 82);
        sparseIntArray2.append(104, 83);
        sparseIntArray2.append(103, 84);
        sparseIntArray2.append(102, 85);
        sparseIntArray2.append(101, 86);
        sparseIntArray2.append(94, 97);
    }

    /* renamed from: c */
    public static int[] m3136c(C1356a c1356a, String str) throws IllegalAccessException, IllegalArgumentException {
        int iIntValue;
        String[] strArrSplit = str.split(",");
        Context context = c1356a.getContext();
        int[] iArr = new int[strArrSplit.length];
        int i2 = 0;
        int i3 = 0;
        while (i2 < strArrSplit.length) {
            String strTrim = strArrSplit[i2].trim();
            Object obj = null;
            try {
                iIntValue = AbstractC1371p.class.getField(strTrim).getInt(null);
            } catch (Exception unused) {
                iIntValue = 0;
            }
            if (iIntValue == 0) {
                iIntValue = context.getResources().getIdentifier(strTrim, "id", context.getPackageName());
            }
            if (iIntValue == 0 && c1356a.isInEditMode() && (c1356a.getParent() instanceof ConstraintLayout)) {
                ConstraintLayout constraintLayout = (ConstraintLayout) c1356a.getParent();
                if (strTrim != null) {
                    HashMap map = constraintLayout.f2271m;
                    if (map != null && map.containsKey(strTrim)) {
                        obj = constraintLayout.f2271m.get(strTrim);
                    }
                } else {
                    constraintLayout.getClass();
                }
                if (obj != null && (obj instanceof Integer)) {
                    iIntValue = ((Integer) obj).intValue();
                }
            }
            iArr[i3] = iIntValue;
            i2++;
            i3++;
        }
        return i3 != strArrSplit.length ? Arrays.copyOf(iArr, i3) : iArr;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:12:0x0074. Please report as an issue. */
    /* renamed from: d */
    public static C1364i m3137d(Context context, AttributeSet attributeSet, boolean z2) {
        int i2;
        int i3;
        C1364i c1364i = new C1364i();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, z2 ? AbstractC1372q.f5973c : AbstractC1372q.f5971a);
        int[] iArr = f5965d;
        String[] strArr = AbstractC1283a.f5208a;
        SparseIntArray sparseIntArray = f5966e;
        C1367l c1367l = c1364i.f5864b;
        C1368m c1368m = c1364i.f5867e;
        C1366k c1366k = c1364i.f5865c;
        C1365j c1365j = c1364i.f5866d;
        int i4 = 3;
        if (z2) {
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            C1363h c1363h = new C1363h();
            c1363h.f5851a = new int[10];
            c1363h.f5852b = new int[10];
            c1363h.f5853c = 0;
            c1363h.f5854d = new int[10];
            c1363h.f5855e = new float[10];
            c1363h.f5856f = 0;
            c1363h.f5857g = new int[5];
            c1363h.f5858h = new String[5];
            c1363h.f5859i = 0;
            c1363h.f5860j = new int[4];
            c1363h.f5861k = new boolean[4];
            c1363h.f5862l = 0;
            c1366k.getClass();
            c1365j.getClass();
            c1368m.getClass();
            int i5 = 0;
            while (i5 < indexCount) {
                int index = typedArrayObtainStyledAttributes.getIndex(i5);
                switch (f5967f.get(index)) {
                    case 2:
                        c1363h.m3128b(2, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1365j.f5878I));
                        i3 = 1;
                        break;
                    case 3:
                    case 4:
                    case 9:
                    case 10:
                    case 25:
                    case 26:
                    case 29:
                    case 30:
                    case 32:
                    case 33:
                    case 35:
                    case 36:
                    case 61:
                    case 88:
                    case 89:
                    case 90:
                    case 91:
                    case 92:
                    default:
                        Integer.toHexString(index);
                        sparseIntArray.get(index);
                        i3 = 1;
                        break;
                    case 5:
                        c1363h.m3130d(typedArrayObtainStyledAttributes.getString(index), 5);
                        i3 = 1;
                        break;
                    case 6:
                        c1363h.m3128b(6, typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, c1365j.f5872C));
                        i3 = 1;
                        break;
                    case 7:
                        c1363h.m3128b(7, typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, c1365j.f5873D));
                        i3 = 1;
                        break;
                    case 8:
                        c1363h.m3128b(8, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1365j.f5879J));
                        i3 = 1;
                        break;
                    case 11:
                        c1363h.m3128b(11, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1365j.f5885P));
                        i3 = 1;
                        break;
                    case 12:
                        c1363h.m3128b(12, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1365j.f5886Q));
                        i3 = 1;
                        break;
                    case 13:
                        c1363h.m3128b(13, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1365j.f5882M));
                        i3 = 1;
                        break;
                    case 14:
                        c1363h.m3128b(14, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1365j.f5884O));
                        i3 = 1;
                        break;
                    case 15:
                        c1363h.m3128b(15, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1365j.f5887R));
                        i3 = 1;
                        break;
                    case 16:
                        c1363h.m3128b(16, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1365j.f5883N));
                        i3 = 1;
                        break;
                    case 17:
                        c1363h.m3128b(17, typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, c1365j.f5902d));
                        i3 = 1;
                        break;
                    case 18:
                        c1363h.m3128b(18, typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, c1365j.f5904e));
                        i3 = 1;
                        break;
                    case 19:
                        c1363h.m3127a(19, typedArrayObtainStyledAttributes.getFloat(index, c1365j.f5906f));
                        i3 = 1;
                        break;
                    case 20:
                        c1363h.m3127a(20, typedArrayObtainStyledAttributes.getFloat(index, c1365j.f5933w));
                        i3 = 1;
                        break;
                    case 21:
                        c1363h.m3128b(21, typedArrayObtainStyledAttributes.getLayoutDimension(index, c1365j.f5900c));
                        i3 = 1;
                        break;
                    case 22:
                        c1363h.m3128b(22, iArr[typedArrayObtainStyledAttributes.getInt(index, c1367l.f5947a)]);
                        i3 = 1;
                        break;
                    case 23:
                        c1363h.m3128b(23, typedArrayObtainStyledAttributes.getLayoutDimension(index, c1365j.f5898b));
                        i3 = 1;
                        break;
                    case 24:
                        c1363h.m3128b(24, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1365j.f5875F));
                        i3 = 1;
                        break;
                    case 27:
                        c1363h.m3128b(27, typedArrayObtainStyledAttributes.getInt(index, c1365j.f5874E));
                        i3 = 1;
                        break;
                    case 28:
                        c1363h.m3128b(28, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1365j.f5876G));
                        i3 = 1;
                        break;
                    case 31:
                        c1363h.m3128b(31, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1365j.f5880K));
                        i3 = 1;
                        break;
                    case 34:
                        c1363h.m3128b(34, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1365j.f5877H));
                        i3 = 1;
                        break;
                    case 37:
                        c1363h.m3127a(37, typedArrayObtainStyledAttributes.getFloat(index, c1365j.f5934x));
                        i3 = 1;
                        break;
                    case 38:
                        int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, c1364i.f5863a);
                        c1364i.f5863a = resourceId;
                        c1363h.m3128b(38, resourceId);
                        i3 = 1;
                        break;
                    case 39:
                        c1363h.m3127a(39, typedArrayObtainStyledAttributes.getFloat(index, c1365j.f5890U));
                        i3 = 1;
                        break;
                    case 40:
                        c1363h.m3127a(40, typedArrayObtainStyledAttributes.getFloat(index, c1365j.f5889T));
                        i3 = 1;
                        break;
                    case 41:
                        c1363h.m3128b(41, typedArrayObtainStyledAttributes.getInt(index, c1365j.f5891V));
                        i3 = 1;
                        break;
                    case 42:
                        c1363h.m3128b(42, typedArrayObtainStyledAttributes.getInt(index, c1365j.f5892W));
                        i3 = 1;
                        break;
                    case 43:
                        c1363h.m3127a(43, typedArrayObtainStyledAttributes.getFloat(index, c1367l.f5949c));
                        i3 = 1;
                        break;
                    case 44:
                        c1363h.m3129c(44, true);
                        c1363h.m3127a(44, typedArrayObtainStyledAttributes.getDimension(index, c1368m.f5964m));
                        i3 = 1;
                        break;
                    case 45:
                        c1363h.m3127a(45, typedArrayObtainStyledAttributes.getFloat(index, c1368m.f5953b));
                        i3 = 1;
                        break;
                    case 46:
                        c1363h.m3127a(46, typedArrayObtainStyledAttributes.getFloat(index, c1368m.f5954c));
                        i3 = 1;
                        break;
                    case 47:
                        c1363h.m3127a(47, typedArrayObtainStyledAttributes.getFloat(index, c1368m.f5955d));
                        i3 = 1;
                        break;
                    case 48:
                        c1363h.m3127a(48, typedArrayObtainStyledAttributes.getFloat(index, c1368m.f5956e));
                        i3 = 1;
                        break;
                    case 49:
                        c1363h.m3127a(49, typedArrayObtainStyledAttributes.getDimension(index, c1368m.f5957f));
                        i3 = 1;
                        break;
                    case 50:
                        c1363h.m3127a(50, typedArrayObtainStyledAttributes.getDimension(index, c1368m.f5958g));
                        i3 = 1;
                        break;
                    case 51:
                        c1363h.m3127a(51, typedArrayObtainStyledAttributes.getDimension(index, c1368m.f5960i));
                        i3 = 1;
                        break;
                    case 52:
                        c1363h.m3127a(52, typedArrayObtainStyledAttributes.getDimension(index, c1368m.f5961j));
                        i3 = 1;
                        break;
                    case 53:
                        c1363h.m3127a(53, typedArrayObtainStyledAttributes.getDimension(index, c1368m.f5962k));
                        i3 = 1;
                        break;
                    case 54:
                        c1363h.m3128b(54, typedArrayObtainStyledAttributes.getInt(index, c1365j.f5893X));
                        i3 = 1;
                        break;
                    case 55:
                        c1363h.m3128b(55, typedArrayObtainStyledAttributes.getInt(index, c1365j.f5894Y));
                        i3 = 1;
                        break;
                    case 56:
                        c1363h.m3128b(56, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1365j.f5895Z));
                        i3 = 1;
                        break;
                    case 57:
                        c1363h.m3128b(57, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1365j.f5897a0));
                        i3 = 1;
                        break;
                    case 58:
                        c1363h.m3128b(58, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1365j.f5899b0));
                        i3 = 1;
                        break;
                    case 59:
                        c1363h.m3128b(59, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1365j.f5901c0));
                        i3 = 1;
                        break;
                    case 60:
                        c1363h.m3127a(60, typedArrayObtainStyledAttributes.getFloat(index, c1368m.f5952a));
                        i3 = 1;
                        break;
                    case 62:
                        c1363h.m3128b(62, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1365j.f5870A));
                        i3 = 1;
                        break;
                    case 63:
                        c1363h.m3127a(63, typedArrayObtainStyledAttributes.getFloat(index, c1365j.f5871B));
                        i3 = 1;
                        break;
                    case 64:
                        c1363h.m3128b(64, m3138f(typedArrayObtainStyledAttributes, index, c1366k.f5938a));
                        i3 = 1;
                        break;
                    case 65:
                        if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                            c1363h.m3130d(typedArrayObtainStyledAttributes.getString(index), 65);
                        } else {
                            c1363h.m3130d(strArr[typedArrayObtainStyledAttributes.getInteger(index, 0)], 65);
                        }
                        i3 = 1;
                        break;
                    case 66:
                        c1363h.m3128b(66, typedArrayObtainStyledAttributes.getInt(index, 0));
                        i3 = 1;
                        break;
                    case 67:
                        c1363h.m3127a(67, typedArrayObtainStyledAttributes.getFloat(index, c1366k.f5942e));
                        i3 = 1;
                        break;
                    case 68:
                        c1363h.m3127a(68, typedArrayObtainStyledAttributes.getFloat(index, c1367l.f5950d));
                        i3 = 1;
                        break;
                    case 69:
                        c1363h.m3127a(69, typedArrayObtainStyledAttributes.getFloat(index, 1.0f));
                        i3 = 1;
                        break;
                    case 70:
                        c1363h.m3127a(70, typedArrayObtainStyledAttributes.getFloat(index, 1.0f));
                        i3 = 1;
                        break;
                    case 71:
                        i3 = 1;
                        break;
                    case 72:
                        c1363h.m3128b(72, typedArrayObtainStyledAttributes.getInt(index, c1365j.f5907f0));
                        i3 = 1;
                        break;
                    case 73:
                        c1363h.m3128b(73, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1365j.f5909g0));
                        i3 = 1;
                        break;
                    case 74:
                        c1363h.m3130d(typedArrayObtainStyledAttributes.getString(index), 74);
                        i3 = 1;
                        break;
                    case 75:
                        c1363h.m3129c(75, typedArrayObtainStyledAttributes.getBoolean(index, c1365j.f5923n0));
                        i3 = 1;
                        break;
                    case 76:
                        c1363h.m3128b(76, typedArrayObtainStyledAttributes.getInt(index, c1366k.f5940c));
                        i3 = 1;
                        break;
                    case 77:
                        c1363h.m3130d(typedArrayObtainStyledAttributes.getString(index), 77);
                        i3 = 1;
                        break;
                    case 78:
                        c1363h.m3128b(78, typedArrayObtainStyledAttributes.getInt(index, c1367l.f5948b));
                        i3 = 1;
                        break;
                    case 79:
                        c1363h.m3127a(79, typedArrayObtainStyledAttributes.getFloat(index, c1366k.f5941d));
                        i3 = 1;
                        break;
                    case 80:
                        c1363h.m3129c(80, typedArrayObtainStyledAttributes.getBoolean(index, c1365j.f5919l0));
                        i3 = 1;
                        break;
                    case 81:
                        c1363h.m3129c(81, typedArrayObtainStyledAttributes.getBoolean(index, c1365j.f5921m0));
                        i3 = 1;
                        break;
                    case 82:
                        c1363h.m3128b(82, typedArrayObtainStyledAttributes.getInteger(index, c1366k.f5939b));
                        i3 = 1;
                        break;
                    case 83:
                        c1363h.m3128b(83, m3138f(typedArrayObtainStyledAttributes, index, c1368m.f5959h));
                        i3 = 1;
                        break;
                    case 84:
                        c1363h.m3128b(84, typedArrayObtainStyledAttributes.getInteger(index, c1366k.f5944g));
                        i3 = 1;
                        break;
                    case 85:
                        c1363h.m3127a(85, typedArrayObtainStyledAttributes.getFloat(index, c1366k.f5943f));
                        i3 = 1;
                        break;
                    case 86:
                        int i6 = typedArrayObtainStyledAttributes.peekValue(index).type;
                        if (i6 == 1) {
                            int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                            c1366k.f5946i = resourceId2;
                            c1363h.m3128b(89, resourceId2);
                            if (c1366k.f5946i != -1) {
                                c1363h.m3128b(88, -2);
                            }
                        } else if (i6 == 3) {
                            String string = typedArrayObtainStyledAttributes.getString(index);
                            c1366k.f5945h = string;
                            c1363h.m3130d(string, 90);
                            if (c1366k.f5945h.indexOf("/") > 0) {
                                int resourceId3 = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                                c1366k.f5946i = resourceId3;
                                c1363h.m3128b(89, resourceId3);
                                c1363h.m3128b(88, -2);
                            } else {
                                c1363h.m3128b(88, -1);
                            }
                        } else {
                            c1363h.m3128b(88, typedArrayObtainStyledAttributes.getInteger(index, c1366k.f5946i));
                        }
                        i3 = 1;
                        break;
                    case 87:
                        Integer.toHexString(index);
                        sparseIntArray.get(index);
                        i3 = 1;
                        break;
                    case 93:
                        c1363h.m3128b(93, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1365j.f5881L));
                        i3 = 1;
                        break;
                    case 94:
                        c1363h.m3128b(94, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1365j.f5888S));
                        i3 = 1;
                        break;
                    case 95:
                        m3139g(c1363h, typedArrayObtainStyledAttributes, index, 0);
                        i3 = 1;
                        break;
                    case 96:
                        i3 = 1;
                        m3139g(c1363h, typedArrayObtainStyledAttributes, index, 1);
                        break;
                    case 97:
                        c1363h.m3128b(97, typedArrayObtainStyledAttributes.getInt(index, c1365j.f5925o0));
                        i3 = 1;
                        break;
                    case 98:
                        int i7 = AbstractC1352a.f5749s;
                        if (typedArrayObtainStyledAttributes.peekValue(index).type == i4) {
                            typedArrayObtainStyledAttributes.getString(index);
                        } else {
                            c1364i.f5863a = typedArrayObtainStyledAttributes.getResourceId(index, c1364i.f5863a);
                        }
                        i3 = 1;
                        break;
                    case 99:
                        c1363h.m3129c(99, typedArrayObtainStyledAttributes.getBoolean(index, c1365j.f5908g));
                        i3 = 1;
                        break;
                }
                i5 += i3;
                i4 = 3;
            }
        } else {
            int i8 = 1;
            int indexCount2 = typedArrayObtainStyledAttributes.getIndexCount();
            int i9 = 0;
            while (i9 < indexCount2) {
                int index2 = typedArrayObtainStyledAttributes.getIndex(i9);
                if (index2 != i8 && 23 != index2 && 24 != index2) {
                    c1366k.getClass();
                    c1365j.getClass();
                    c1368m.getClass();
                }
                switch (sparseIntArray.get(index2)) {
                    case 1:
                        c1365j.f5926p = m3138f(typedArrayObtainStyledAttributes, index2, c1365j.f5926p);
                        i2 = 1;
                        break;
                    case 2:
                        c1365j.f5878I = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c1365j.f5878I);
                        i2 = 1;
                        break;
                    case 3:
                        c1365j.f5924o = m3138f(typedArrayObtainStyledAttributes, index2, c1365j.f5924o);
                        i2 = 1;
                        break;
                    case 4:
                        c1365j.f5922n = m3138f(typedArrayObtainStyledAttributes, index2, c1365j.f5922n);
                        i2 = 1;
                        break;
                    case 5:
                        c1365j.f5935y = typedArrayObtainStyledAttributes.getString(index2);
                        i2 = 1;
                        break;
                    case 6:
                        c1365j.f5872C = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index2, c1365j.f5872C);
                        i2 = 1;
                        break;
                    case 7:
                        c1365j.f5873D = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index2, c1365j.f5873D);
                        i2 = 1;
                        break;
                    case 8:
                        c1365j.f5879J = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c1365j.f5879J);
                        i2 = 1;
                        break;
                    case 9:
                        c1365j.f5932v = m3138f(typedArrayObtainStyledAttributes, index2, c1365j.f5932v);
                        i2 = 1;
                        break;
                    case 10:
                        c1365j.f5931u = m3138f(typedArrayObtainStyledAttributes, index2, c1365j.f5931u);
                        i2 = 1;
                        break;
                    case 11:
                        c1365j.f5885P = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c1365j.f5885P);
                        i2 = 1;
                        break;
                    case 12:
                        c1365j.f5886Q = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c1365j.f5886Q);
                        i2 = 1;
                        break;
                    case 13:
                        c1365j.f5882M = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c1365j.f5882M);
                        i2 = 1;
                        break;
                    case 14:
                        c1365j.f5884O = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c1365j.f5884O);
                        i2 = 1;
                        break;
                    case 15:
                        c1365j.f5887R = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c1365j.f5887R);
                        i2 = 1;
                        break;
                    case 16:
                        c1365j.f5883N = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c1365j.f5883N);
                        i2 = 1;
                        break;
                    case 17:
                        c1365j.f5902d = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index2, c1365j.f5902d);
                        i2 = 1;
                        break;
                    case 18:
                        c1365j.f5904e = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index2, c1365j.f5904e);
                        i2 = 1;
                        break;
                    case 19:
                        c1365j.f5906f = typedArrayObtainStyledAttributes.getFloat(index2, c1365j.f5906f);
                        i2 = 1;
                        break;
                    case 20:
                        c1365j.f5933w = typedArrayObtainStyledAttributes.getFloat(index2, c1365j.f5933w);
                        i2 = 1;
                        break;
                    case 21:
                        c1365j.f5900c = typedArrayObtainStyledAttributes.getLayoutDimension(index2, c1365j.f5900c);
                        i2 = 1;
                        break;
                    case 22:
                        int i10 = typedArrayObtainStyledAttributes.getInt(index2, c1367l.f5947a);
                        c1367l.f5947a = i10;
                        c1367l.f5947a = iArr[i10];
                        i2 = 1;
                        break;
                    case 23:
                        c1365j.f5898b = typedArrayObtainStyledAttributes.getLayoutDimension(index2, c1365j.f5898b);
                        i2 = 1;
                        break;
                    case 24:
                        c1365j.f5875F = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c1365j.f5875F);
                        i2 = 1;
                        break;
                    case 25:
                        c1365j.f5910h = m3138f(typedArrayObtainStyledAttributes, index2, c1365j.f5910h);
                        i2 = 1;
                        break;
                    case 26:
                        c1365j.f5912i = m3138f(typedArrayObtainStyledAttributes, index2, c1365j.f5912i);
                        i2 = 1;
                        break;
                    case 27:
                        c1365j.f5874E = typedArrayObtainStyledAttributes.getInt(index2, c1365j.f5874E);
                        i2 = 1;
                        break;
                    case 28:
                        c1365j.f5876G = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c1365j.f5876G);
                        i2 = 1;
                        break;
                    case 29:
                        c1365j.f5914j = m3138f(typedArrayObtainStyledAttributes, index2, c1365j.f5914j);
                        i2 = 1;
                        break;
                    case 30:
                        c1365j.f5916k = m3138f(typedArrayObtainStyledAttributes, index2, c1365j.f5916k);
                        i2 = 1;
                        break;
                    case 31:
                        c1365j.f5880K = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c1365j.f5880K);
                        i2 = 1;
                        break;
                    case 32:
                        c1365j.f5929s = m3138f(typedArrayObtainStyledAttributes, index2, c1365j.f5929s);
                        i2 = 1;
                        break;
                    case 33:
                        c1365j.f5930t = m3138f(typedArrayObtainStyledAttributes, index2, c1365j.f5930t);
                        i2 = 1;
                        break;
                    case 34:
                        c1365j.f5877H = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c1365j.f5877H);
                        i2 = 1;
                        break;
                    case 35:
                        c1365j.f5920m = m3138f(typedArrayObtainStyledAttributes, index2, c1365j.f5920m);
                        i2 = 1;
                        break;
                    case 36:
                        c1365j.f5918l = m3138f(typedArrayObtainStyledAttributes, index2, c1365j.f5918l);
                        i2 = 1;
                        break;
                    case 37:
                        c1365j.f5934x = typedArrayObtainStyledAttributes.getFloat(index2, c1365j.f5934x);
                        i2 = 1;
                        break;
                    case 38:
                        c1364i.f5863a = typedArrayObtainStyledAttributes.getResourceId(index2, c1364i.f5863a);
                        i2 = 1;
                        break;
                    case 39:
                        c1365j.f5890U = typedArrayObtainStyledAttributes.getFloat(index2, c1365j.f5890U);
                        i2 = 1;
                        break;
                    case 40:
                        c1365j.f5889T = typedArrayObtainStyledAttributes.getFloat(index2, c1365j.f5889T);
                        i2 = 1;
                        break;
                    case 41:
                        c1365j.f5891V = typedArrayObtainStyledAttributes.getInt(index2, c1365j.f5891V);
                        i2 = 1;
                        break;
                    case 42:
                        c1365j.f5892W = typedArrayObtainStyledAttributes.getInt(index2, c1365j.f5892W);
                        i2 = 1;
                        break;
                    case 43:
                        c1367l.f5949c = typedArrayObtainStyledAttributes.getFloat(index2, c1367l.f5949c);
                        i2 = 1;
                        break;
                    case 44:
                        c1368m.f5963l = true;
                        c1368m.f5964m = typedArrayObtainStyledAttributes.getDimension(index2, c1368m.f5964m);
                        i2 = 1;
                        break;
                    case 45:
                        c1368m.f5953b = typedArrayObtainStyledAttributes.getFloat(index2, c1368m.f5953b);
                        i2 = 1;
                        break;
                    case 46:
                        c1368m.f5954c = typedArrayObtainStyledAttributes.getFloat(index2, c1368m.f5954c);
                        i2 = 1;
                        break;
                    case 47:
                        c1368m.f5955d = typedArrayObtainStyledAttributes.getFloat(index2, c1368m.f5955d);
                        i2 = 1;
                        break;
                    case 48:
                        c1368m.f5956e = typedArrayObtainStyledAttributes.getFloat(index2, c1368m.f5956e);
                        i2 = 1;
                        break;
                    case 49:
                        c1368m.f5957f = typedArrayObtainStyledAttributes.getDimension(index2, c1368m.f5957f);
                        i2 = 1;
                        break;
                    case 50:
                        c1368m.f5958g = typedArrayObtainStyledAttributes.getDimension(index2, c1368m.f5958g);
                        i2 = 1;
                        break;
                    case 51:
                        c1368m.f5960i = typedArrayObtainStyledAttributes.getDimension(index2, c1368m.f5960i);
                        i2 = 1;
                        break;
                    case 52:
                        c1368m.f5961j = typedArrayObtainStyledAttributes.getDimension(index2, c1368m.f5961j);
                        i2 = 1;
                        break;
                    case 53:
                        c1368m.f5962k = typedArrayObtainStyledAttributes.getDimension(index2, c1368m.f5962k);
                        i2 = 1;
                        break;
                    case 54:
                        c1365j.f5893X = typedArrayObtainStyledAttributes.getInt(index2, c1365j.f5893X);
                        i2 = 1;
                        break;
                    case 55:
                        c1365j.f5894Y = typedArrayObtainStyledAttributes.getInt(index2, c1365j.f5894Y);
                        i2 = 1;
                        break;
                    case 56:
                        c1365j.f5895Z = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c1365j.f5895Z);
                        i2 = 1;
                        break;
                    case 57:
                        c1365j.f5897a0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c1365j.f5897a0);
                        i2 = 1;
                        break;
                    case 58:
                        c1365j.f5899b0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c1365j.f5899b0);
                        i2 = 1;
                        break;
                    case 59:
                        c1365j.f5901c0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c1365j.f5901c0);
                        i2 = 1;
                        break;
                    case 60:
                        c1368m.f5952a = typedArrayObtainStyledAttributes.getFloat(index2, c1368m.f5952a);
                        i2 = 1;
                        break;
                    case 61:
                        c1365j.f5936z = m3138f(typedArrayObtainStyledAttributes, index2, c1365j.f5936z);
                        i2 = 1;
                        break;
                    case 62:
                        c1365j.f5870A = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c1365j.f5870A);
                        i2 = 1;
                        break;
                    case 63:
                        c1365j.f5871B = typedArrayObtainStyledAttributes.getFloat(index2, c1365j.f5871B);
                        i2 = 1;
                        break;
                    case 64:
                        c1366k.f5938a = m3138f(typedArrayObtainStyledAttributes, index2, c1366k.f5938a);
                        i2 = 1;
                        break;
                    case 65:
                        if (typedArrayObtainStyledAttributes.peekValue(index2).type == 3) {
                            typedArrayObtainStyledAttributes.getString(index2);
                            c1366k.getClass();
                        } else {
                            String str = strArr[typedArrayObtainStyledAttributes.getInteger(index2, 0)];
                            c1366k.getClass();
                        }
                        i2 = 1;
                        break;
                    case 66:
                        typedArrayObtainStyledAttributes.getInt(index2, 0);
                        c1366k.getClass();
                        i2 = 1;
                        break;
                    case 67:
                        c1366k.f5942e = typedArrayObtainStyledAttributes.getFloat(index2, c1366k.f5942e);
                        i2 = 1;
                        break;
                    case 68:
                        c1367l.f5950d = typedArrayObtainStyledAttributes.getFloat(index2, c1367l.f5950d);
                        i2 = 1;
                        break;
                    case 69:
                        c1365j.f5903d0 = typedArrayObtainStyledAttributes.getFloat(index2, 1.0f);
                        i2 = 1;
                        break;
                    case 70:
                        c1365j.f5905e0 = typedArrayObtainStyledAttributes.getFloat(index2, 1.0f);
                        i2 = 1;
                        break;
                    case 71:
                        i2 = 1;
                        break;
                    case 72:
                        c1365j.f5907f0 = typedArrayObtainStyledAttributes.getInt(index2, c1365j.f5907f0);
                        i2 = 1;
                        break;
                    case 73:
                        c1365j.f5909g0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c1365j.f5909g0);
                        i2 = 1;
                        break;
                    case 74:
                        c1365j.f5915j0 = typedArrayObtainStyledAttributes.getString(index2);
                        i2 = 1;
                        break;
                    case 75:
                        c1365j.f5923n0 = typedArrayObtainStyledAttributes.getBoolean(index2, c1365j.f5923n0);
                        i2 = 1;
                        break;
                    case 76:
                        c1366k.f5940c = typedArrayObtainStyledAttributes.getInt(index2, c1366k.f5940c);
                        i2 = 1;
                        break;
                    case 77:
                        c1365j.f5917k0 = typedArrayObtainStyledAttributes.getString(index2);
                        i2 = 1;
                        break;
                    case 78:
                        c1367l.f5948b = typedArrayObtainStyledAttributes.getInt(index2, c1367l.f5948b);
                        i2 = 1;
                        break;
                    case 79:
                        c1366k.f5941d = typedArrayObtainStyledAttributes.getFloat(index2, c1366k.f5941d);
                        i2 = 1;
                        break;
                    case 80:
                        c1365j.f5919l0 = typedArrayObtainStyledAttributes.getBoolean(index2, c1365j.f5919l0);
                        i2 = 1;
                        break;
                    case 81:
                        c1365j.f5921m0 = typedArrayObtainStyledAttributes.getBoolean(index2, c1365j.f5921m0);
                        i2 = 1;
                        break;
                    case 82:
                        c1366k.f5939b = typedArrayObtainStyledAttributes.getInteger(index2, c1366k.f5939b);
                        i2 = 1;
                        break;
                    case 83:
                        c1368m.f5959h = m3138f(typedArrayObtainStyledAttributes, index2, c1368m.f5959h);
                        i2 = 1;
                        break;
                    case 84:
                        c1366k.f5944g = typedArrayObtainStyledAttributes.getInteger(index2, c1366k.f5944g);
                        i2 = 1;
                        break;
                    case 85:
                        c1366k.f5943f = typedArrayObtainStyledAttributes.getFloat(index2, c1366k.f5943f);
                        i2 = 1;
                        break;
                    case 86:
                        int i11 = typedArrayObtainStyledAttributes.peekValue(index2).type;
                        if (i11 == 1) {
                            c1366k.f5946i = typedArrayObtainStyledAttributes.getResourceId(index2, -1);
                        } else if (i11 == 3) {
                            String string2 = typedArrayObtainStyledAttributes.getString(index2);
                            c1366k.f5945h = string2;
                            if (string2.indexOf("/") > 0) {
                                c1366k.f5946i = typedArrayObtainStyledAttributes.getResourceId(index2, -1);
                            }
                        } else {
                            typedArrayObtainStyledAttributes.getInteger(index2, c1366k.f5946i);
                        }
                        i2 = 1;
                        break;
                    case 87:
                        Integer.toHexString(index2);
                        sparseIntArray.get(index2);
                        i2 = 1;
                        break;
                    case 88:
                    case 89:
                    case 90:
                    default:
                        Integer.toHexString(index2);
                        sparseIntArray.get(index2);
                        i2 = 1;
                        break;
                    case 91:
                        c1365j.f5927q = m3138f(typedArrayObtainStyledAttributes, index2, c1365j.f5927q);
                        i2 = 1;
                        break;
                    case 92:
                        c1365j.f5928r = m3138f(typedArrayObtainStyledAttributes, index2, c1365j.f5928r);
                        i2 = 1;
                        break;
                    case 93:
                        c1365j.f5881L = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c1365j.f5881L);
                        i2 = 1;
                        break;
                    case 94:
                        c1365j.f5888S = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c1365j.f5888S);
                        i2 = 1;
                        break;
                    case 95:
                        m3139g(c1365j, typedArrayObtainStyledAttributes, index2, 0);
                        i2 = 1;
                        break;
                    case 96:
                        m3139g(c1365j, typedArrayObtainStyledAttributes, index2, 1);
                        i2 = 1;
                        break;
                    case 97:
                        c1365j.f5925o0 = typedArrayObtainStyledAttributes.getInt(index2, c1365j.f5925o0);
                        i2 = 1;
                        break;
                }
                i9++;
                i8 = i2;
            }
            if (c1365j.f5915j0 != null) {
                c1365j.f5913i0 = null;
            }
        }
        typedArrayObtainStyledAttributes.recycle();
        return c1364i;
    }

    /* renamed from: f */
    public static int m3138f(TypedArray typedArray, int i2, int i3) {
        int resourceId = typedArray.getResourceId(i2, i3);
        return resourceId == -1 ? typedArray.getInt(i2, -1) : resourceId;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0044  */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void m3139g(java.lang.Object r7, android.content.res.TypedArray r8, int r9, int r10) {
        /*
            Method dump skipped, instructions count: 370
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p138v.C1369n.m3139g(java.lang.Object, android.content.res.TypedArray, int, int):void");
    }

    /* renamed from: h */
    public static void m3140h(C1360e c1360e, String str) {
        if (str != null) {
            int length = str.length();
            int iIndexOf = str.indexOf(44);
            int i2 = -1;
            if (iIndexOf > 0 && iIndexOf < length - 1) {
                String strSubstring = str.substring(0, iIndexOf);
                i2 = strSubstring.equalsIgnoreCase("W") ? 0 : strSubstring.equalsIgnoreCase("H") ? 1 : -1;
                i = iIndexOf + 1;
            }
            int iIndexOf2 = str.indexOf(58);
            try {
                if (iIndexOf2 < 0 || iIndexOf2 >= length - 1) {
                    String strSubstring2 = str.substring(i);
                    if (strSubstring2.length() > 0) {
                        Float.parseFloat(strSubstring2);
                    }
                } else {
                    String strSubstring3 = str.substring(i, iIndexOf2);
                    String strSubstring4 = str.substring(iIndexOf2 + 1);
                    if (strSubstring3.length() > 0 && strSubstring4.length() > 0) {
                        float f = Float.parseFloat(strSubstring3);
                        float f2 = Float.parseFloat(strSubstring4);
                        if (f > 0.0f && f2 > 0.0f) {
                            if (i2 == 1) {
                                Math.abs(f2 / f);
                            } else {
                                Math.abs(f / f2);
                            }
                        }
                    }
                }
            } catch (NumberFormatException unused) {
            }
        }
        c1360e.f5776G = str;
    }

    /* renamed from: a */
    public final void m3141a(ConstraintLayout constraintLayout) {
        int childCount = constraintLayout.getChildCount();
        HashMap map = this.f5970c;
        HashSet hashSet = new HashSet(map.keySet());
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = constraintLayout.getChildAt(i2);
            int id = childAt.getId();
            if (!map.containsKey(Integer.valueOf(id))) {
                try {
                    childAt.getContext().getResources().getResourceEntryName(childAt.getId());
                } catch (Exception unused) {
                }
            } else {
                if (this.f5969b && id == -1) {
                    throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
                }
                if (id != -1 && map.containsKey(Integer.valueOf(id))) {
                    hashSet.remove(Integer.valueOf(id));
                    C1364i c1364i = (C1364i) map.get(Integer.valueOf(id));
                    if (c1364i != null) {
                        if (childAt instanceof C1356a) {
                            C1365j c1365j = c1364i.f5866d;
                            c1365j.f5911h0 = 1;
                            C1356a c1356a = (C1356a) childAt;
                            c1356a.setId(id);
                            c1356a.setType(c1365j.f5907f0);
                            c1356a.setMargin(c1365j.f5909g0);
                            c1356a.setAllowsGoneWidget(c1365j.f5923n0);
                            int[] iArr = c1365j.f5913i0;
                            if (iArr != null) {
                                c1356a.setReferencedIds(iArr);
                            } else {
                                String str = c1365j.f5915j0;
                                if (str != null) {
                                    int[] iArrM3136c = m3136c(c1356a, str);
                                    c1365j.f5913i0 = iArrM3136c;
                                    c1356a.setReferencedIds(iArrM3136c);
                                }
                            }
                        }
                        C1360e c1360e = (C1360e) childAt.getLayoutParams();
                        c1360e.m3124a();
                        c1364i.m3131a(c1360e);
                        HashMap map2 = c1364i.f5868f;
                        Class<?> cls = childAt.getClass();
                        for (String str2 : map2.keySet()) {
                            C1357b c1357b = (C1357b) map2.get(str2);
                            if (!c1357b.f5755a) {
                                str2 = "set" + str2;
                            }
                            try {
                                int iM2966a = AbstractC1271e.m2966a(c1357b.f5756b);
                                Class cls2 = Float.TYPE;
                                Class cls3 = Integer.TYPE;
                                switch (iM2966a) {
                                    case 0:
                                        cls.getMethod(str2, cls3).invoke(childAt, Integer.valueOf(c1357b.f5757c));
                                        break;
                                    case 1:
                                        cls.getMethod(str2, cls2).invoke(childAt, Float.valueOf(c1357b.f5758d));
                                        break;
                                    case 2:
                                        cls.getMethod(str2, cls3).invoke(childAt, Integer.valueOf(c1357b.f5761g));
                                        break;
                                    case 3:
                                        Method method = cls.getMethod(str2, Drawable.class);
                                        ColorDrawable colorDrawable = new ColorDrawable();
                                        colorDrawable.setColor(c1357b.f5761g);
                                        method.invoke(childAt, colorDrawable);
                                        break;
                                    case 4:
                                        cls.getMethod(str2, CharSequence.class).invoke(childAt, c1357b.f5759e);
                                        break;
                                    case 5:
                                        cls.getMethod(str2, Boolean.TYPE).invoke(childAt, Boolean.valueOf(c1357b.f5760f));
                                        break;
                                    case 6:
                                        cls.getMethod(str2, cls2).invoke(childAt, Float.valueOf(c1357b.f5758d));
                                        break;
                                    case 7:
                                        cls.getMethod(str2, cls3).invoke(childAt, Integer.valueOf(c1357b.f5757c));
                                        break;
                                }
                            } catch (IllegalAccessException e3) {
                                e3.printStackTrace();
                            } catch (NoSuchMethodException e4) {
                                e4.getMessage();
                            } catch (InvocationTargetException e5) {
                                e5.printStackTrace();
                            }
                        }
                        childAt.setLayoutParams(c1360e);
                        C1367l c1367l = c1364i.f5864b;
                        if (c1367l.f5948b == 0) {
                            childAt.setVisibility(c1367l.f5947a);
                        }
                        childAt.setAlpha(c1367l.f5949c);
                        C1368m c1368m = c1364i.f5867e;
                        childAt.setRotation(c1368m.f5952a);
                        childAt.setRotationX(c1368m.f5953b);
                        childAt.setRotationY(c1368m.f5954c);
                        childAt.setScaleX(c1368m.f5955d);
                        childAt.setScaleY(c1368m.f5956e);
                        if (c1368m.f5959h != -1) {
                            if (((View) childAt.getParent()).findViewById(c1368m.f5959h) != null) {
                                float bottom = (r6.getBottom() + r6.getTop()) / 2.0f;
                                float right = (r6.getRight() + r6.getLeft()) / 2.0f;
                                if (childAt.getRight() - childAt.getLeft() > 0 && childAt.getBottom() - childAt.getTop() > 0) {
                                    childAt.setPivotX(right - childAt.getLeft());
                                    childAt.setPivotY(bottom - childAt.getTop());
                                }
                            }
                        } else {
                            if (!Float.isNaN(c1368m.f5957f)) {
                                childAt.setPivotX(c1368m.f5957f);
                            }
                            if (!Float.isNaN(c1368m.f5958g)) {
                                childAt.setPivotY(c1368m.f5958g);
                            }
                        }
                        childAt.setTranslationX(c1368m.f5960i);
                        childAt.setTranslationY(c1368m.f5961j);
                        childAt.setTranslationZ(c1368m.f5962k);
                        if (c1368m.f5963l) {
                            childAt.setElevation(c1368m.f5964m);
                        }
                    }
                }
            }
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            C1364i c1364i2 = (C1364i) map.get(num);
            if (c1364i2 != null) {
                C1365j c1365j2 = c1364i2.f5866d;
                if (c1365j2.f5911h0 == 1) {
                    Context context = constraintLayout.getContext();
                    C1356a c1356a2 = new C1356a(context);
                    c1356a2.f5762a = new int[32];
                    c1356a2.f5768g = new HashMap();
                    c1356a2.f5764c = context;
                    C1312a c1312a = new C1312a();
                    c1312a.f5456s0 = 0;
                    c1312a.f5457t0 = true;
                    c1312a.f5458u0 = 0;
                    c1312a.f5459v0 = false;
                    c1356a2.f5754j = c1312a;
                    c1356a2.f5765d = c1312a;
                    c1356a2.m3123i();
                    c1356a2.setVisibility(8);
                    c1356a2.setId(num.intValue());
                    int[] iArr2 = c1365j2.f5913i0;
                    if (iArr2 != null) {
                        c1356a2.setReferencedIds(iArr2);
                    } else {
                        String str3 = c1365j2.f5915j0;
                        if (str3 != null) {
                            int[] iArrM3136c2 = m3136c(c1356a2, str3);
                            c1365j2.f5913i0 = iArrM3136c2;
                            c1356a2.setReferencedIds(iArrM3136c2);
                        }
                    }
                    c1356a2.setType(c1365j2.f5907f0);
                    c1356a2.setMargin(c1365j2.f5909g0);
                    C1360e c1360eM1543g = ConstraintLayout.m1543g();
                    c1356a2.m3123i();
                    c1364i2.m3131a(c1360eM1543g);
                    constraintLayout.addView(c1356a2, c1360eM1543g);
                }
                if (c1365j2.f5896a) {
                    View guideline = new Guideline(constraintLayout.getContext());
                    guideline.setId(num.intValue());
                    C1360e c1360eM1543g2 = ConstraintLayout.m1543g();
                    c1364i2.m3131a(c1360eM1543g2);
                    constraintLayout.addView(guideline, c1360eM1543g2);
                }
            }
        }
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt2 = constraintLayout.getChildAt(i3);
            if (childAt2 instanceof AbstractC1358c) {
                ((AbstractC1358c) childAt2).mo3120e(constraintLayout);
            }
        }
    }

    /* renamed from: b */
    public final void m3142b(ConstraintLayout constraintLayout) {
        int i2;
        int i3;
        C1369n c1369n = this;
        int childCount = constraintLayout.getChildCount();
        HashMap map = c1369n.f5970c;
        map.clear();
        int i4 = 0;
        while (i4 < childCount) {
            View childAt = constraintLayout.getChildAt(i4);
            C1360e c1360e = (C1360e) childAt.getLayoutParams();
            int id = childAt.getId();
            if (c1369n.f5969b && id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!map.containsKey(Integer.valueOf(id))) {
                map.put(Integer.valueOf(id), new C1364i());
            }
            C1364i c1364i = (C1364i) map.get(Integer.valueOf(id));
            if (c1364i == null) {
                i2 = childCount;
            } else {
                HashMap map2 = c1369n.f5968a;
                HashMap map3 = new HashMap();
                Class<?> cls = childAt.getClass();
                for (String str : map2.keySet()) {
                    C1357b c1357b = (C1357b) map2.get(str);
                    try {
                        if (str.equals("BackgroundColor")) {
                            map3.put(str, new C1357b(c1357b, Integer.valueOf(((ColorDrawable) childAt.getBackground()).getColor())));
                            i3 = childCount;
                        } else {
                            i3 = childCount;
                            try {
                                map3.put(str, new C1357b(c1357b, cls.getMethod("getMap" + str, new Class[0]).invoke(childAt, new Object[0])));
                            } catch (IllegalAccessException e3) {
                                e = e3;
                                e.printStackTrace();
                                childCount = i3;
                            } catch (NoSuchMethodException e4) {
                                e = e4;
                                e.printStackTrace();
                                childCount = i3;
                            } catch (InvocationTargetException e5) {
                                e = e5;
                                e.printStackTrace();
                                childCount = i3;
                            }
                        }
                    } catch (IllegalAccessException e6) {
                        e = e6;
                        i3 = childCount;
                    } catch (NoSuchMethodException e7) {
                        e = e7;
                        i3 = childCount;
                    } catch (InvocationTargetException e8) {
                        e = e8;
                        i3 = childCount;
                    }
                    childCount = i3;
                }
                i2 = childCount;
                c1364i.f5868f = map3;
                c1364i.f5863a = id;
                int i5 = c1360e.f5804e;
                C1365j c1365j = c1364i.f5866d;
                c1365j.f5910h = i5;
                c1365j.f5912i = c1360e.f5806f;
                c1365j.f5914j = c1360e.f5808g;
                c1365j.f5916k = c1360e.f5810h;
                c1365j.f5918l = c1360e.f5812i;
                c1365j.f5920m = c1360e.f5814j;
                c1365j.f5922n = c1360e.f5816k;
                c1365j.f5924o = c1360e.f5818l;
                c1365j.f5926p = c1360e.f5820m;
                c1365j.f5927q = c1360e.f5822n;
                c1365j.f5928r = c1360e.f5824o;
                c1365j.f5929s = c1360e.f5830s;
                c1365j.f5930t = c1360e.f5831t;
                c1365j.f5931u = c1360e.f5832u;
                c1365j.f5932v = c1360e.f5833v;
                c1365j.f5933w = c1360e.f5774E;
                c1365j.f5934x = c1360e.f5775F;
                c1365j.f5935y = c1360e.f5776G;
                c1365j.f5936z = c1360e.f5826p;
                c1365j.f5870A = c1360e.f5828q;
                c1365j.f5871B = c1360e.f5829r;
                c1365j.f5872C = c1360e.f5789T;
                c1365j.f5873D = c1360e.f5790U;
                c1365j.f5874E = c1360e.f5791V;
                c1365j.f5906f = c1360e.f5800c;
                c1365j.f5902d = c1360e.f5796a;
                c1365j.f5904e = c1360e.f5798b;
                c1365j.f5898b = ((ViewGroup.MarginLayoutParams) c1360e).width;
                c1365j.f5900c = ((ViewGroup.MarginLayoutParams) c1360e).height;
                c1365j.f5875F = ((ViewGroup.MarginLayoutParams) c1360e).leftMargin;
                c1365j.f5876G = ((ViewGroup.MarginLayoutParams) c1360e).rightMargin;
                c1365j.f5877H = ((ViewGroup.MarginLayoutParams) c1360e).topMargin;
                c1365j.f5878I = ((ViewGroup.MarginLayoutParams) c1360e).bottomMargin;
                c1365j.f5881L = c1360e.f5773D;
                c1365j.f5889T = c1360e.f5778I;
                c1365j.f5890U = c1360e.f5777H;
                c1365j.f5892W = c1360e.f5780K;
                c1365j.f5891V = c1360e.f5779J;
                c1365j.f5919l0 = c1360e.f5792W;
                c1365j.f5921m0 = c1360e.f5793X;
                c1365j.f5893X = c1360e.f5781L;
                c1365j.f5894Y = c1360e.f5782M;
                c1365j.f5895Z = c1360e.f5785P;
                c1365j.f5897a0 = c1360e.f5786Q;
                c1365j.f5899b0 = c1360e.f5783N;
                c1365j.f5901c0 = c1360e.f5784O;
                c1365j.f5903d0 = c1360e.f5787R;
                c1365j.f5905e0 = c1360e.f5788S;
                c1365j.f5917k0 = c1360e.f5794Y;
                c1365j.f5883N = c1360e.f5835x;
                c1365j.f5885P = c1360e.f5837z;
                c1365j.f5882M = c1360e.f5834w;
                c1365j.f5884O = c1360e.f5836y;
                c1365j.f5887R = c1360e.f5770A;
                c1365j.f5886Q = c1360e.f5771B;
                c1365j.f5888S = c1360e.f5772C;
                c1365j.f5925o0 = c1360e.f5795Z;
                c1365j.f5879J = c1360e.getMarginEnd();
                c1365j.f5880K = c1360e.getMarginStart();
                int visibility = childAt.getVisibility();
                C1367l c1367l = c1364i.f5864b;
                c1367l.f5947a = visibility;
                c1367l.f5949c = childAt.getAlpha();
                float rotation = childAt.getRotation();
                C1368m c1368m = c1364i.f5867e;
                c1368m.f5952a = rotation;
                c1368m.f5953b = childAt.getRotationX();
                c1368m.f5954c = childAt.getRotationY();
                c1368m.f5955d = childAt.getScaleX();
                c1368m.f5956e = childAt.getScaleY();
                float pivotX = childAt.getPivotX();
                float pivotY = childAt.getPivotY();
                if (pivotX != 0.0d || pivotY != 0.0d) {
                    c1368m.f5957f = pivotX;
                    c1368m.f5958g = pivotY;
                }
                c1368m.f5960i = childAt.getTranslationX();
                c1368m.f5961j = childAt.getTranslationY();
                c1368m.f5962k = childAt.getTranslationZ();
                if (c1368m.f5963l) {
                    c1368m.f5964m = childAt.getElevation();
                }
                if (childAt instanceof C1356a) {
                    C1356a c1356a = (C1356a) childAt;
                    c1365j.f5923n0 = c1356a.getAllowsGoneWidget();
                    c1365j.f5913i0 = c1356a.getReferencedIds();
                    c1365j.f5907f0 = c1356a.getType();
                    c1365j.f5909g0 = c1356a.getMargin();
                }
            }
            i4++;
            c1369n = this;
            childCount = i2;
        }
    }

    /* renamed from: e */
    public final void m3143e(Context context, int i2) {
        XmlResourceParser xml = context.getResources().getXml(i2);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 0) {
                    xml.getName();
                } else if (eventType == 2) {
                    String name = xml.getName();
                    C1364i c1364iM3137d = m3137d(context, Xml.asAttributeSet(xml), false);
                    if (name.equalsIgnoreCase("Guideline")) {
                        c1364iM3137d.f5866d.f5896a = true;
                    }
                    this.f5970c.put(Integer.valueOf(c1364iM3137d.f5863a), c1364iM3137d);
                }
            }
        } catch (IOException e3) {
            e3.printStackTrace();
        } catch (XmlPullParserException e4) {
            e4.printStackTrace();
        }
    }
}
