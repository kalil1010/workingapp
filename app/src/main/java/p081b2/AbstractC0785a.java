package p081b2;

import java.util.Calendar;
import java.util.Date;

/* renamed from: b2.a */
/* loaded from: classes.dex */
public abstract class AbstractC0785a {

    /* renamed from: a */
    public static final int[][] f2930a = {new int[]{14}, new int[]{13}, new int[]{12}, new int[]{11, 10}, new int[]{5, 5, 9}, new int[]{2, 1001}, new int[]{1}, new int[]{0}};

    /* renamed from: a */
    public static Date m1998a(Date date) {
        if (!(date != null)) {
            throw new IllegalArgumentException("The date must not be null");
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        if (calendar.get(1) > 280000000) {
            throw new ArithmeticException("Calendar value too large for accurate calculations");
        }
        Date time = calendar.getTime();
        long time2 = ((time.getTime() - calendar.get(14)) - (calendar.get(13) * 1000)) - (calendar.get(12) * 60000);
        if (time.getTime() != time2) {
            time.setTime(time2);
            calendar.setTime(time);
        }
        int[][] iArr = f2930a;
        for (int i2 = 0; i2 < 8; i2++) {
            int[] iArr2 = iArr[i2];
            for (int i3 : iArr2) {
                if (i3 == 2) {
                    return calendar.getTime();
                }
            }
            int actualMinimum = calendar.getActualMinimum(iArr2[0]);
            calendar.getActualMaximum(iArr2[0]);
            int i4 = calendar.get(iArr2[0]) - actualMinimum;
            if (i4 != 0) {
                int i5 = iArr2[0];
                calendar.set(i5, calendar.get(i5) - i4);
            }
        }
        throw new IllegalArgumentException("The field 2 is not supported");
    }
}
