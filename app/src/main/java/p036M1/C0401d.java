package p036M1;

import android.util.Log;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.LogRecord;
import p131s1.AbstractC1326c;
import p149y1.AbstractC1411i;

/* renamed from: M1.d */
/* loaded from: classes.dex */
public final class C0401d extends Handler {

    /* renamed from: a */
    public static final C0401d f1278a = new C0401d();

    @Override // java.util.logging.Handler
    public final void close() {
    }

    @Override // java.util.logging.Handler
    public final void flush() {
    }

    @Override // java.util.logging.Handler
    public final void publish(LogRecord logRecord) {
        int iMin;
        AbstractC1326c.m3062e(logRecord, "record");
        CopyOnWriteArraySet copyOnWriteArraySet = AbstractC0400c.f1276a;
        String loggerName = logRecord.getLoggerName();
        AbstractC1326c.m3061d(loggerName, "record.loggerName");
        int iIntValue = logRecord.getLevel().intValue();
        Level level = Level.INFO;
        int i2 = iIntValue > level.intValue() ? 5 : logRecord.getLevel().intValue() == level.intValue() ? 4 : 3;
        String message = logRecord.getMessage();
        AbstractC1326c.m3061d(message, "record.message");
        Throwable thrown = logRecord.getThrown();
        String strSubstring = (String) AbstractC0400c.f1277b.get(loggerName);
        int i3 = 0;
        if (strSubstring == null) {
            int length = loggerName.length();
            if (23 <= length) {
                length = 23;
            }
            strSubstring = loggerName.substring(0, length);
            AbstractC1326c.m3061d(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        }
        if (Log.isLoggable(strSubstring, i2)) {
            if (thrown != null) {
                message = message + "\n" + Log.getStackTraceString(thrown);
            }
            int length2 = message.length();
            while (i3 < length2) {
                int iM3177R = AbstractC1411i.m3177R(message, '\n', i3, 4);
                if (iM3177R == -1) {
                    iM3177R = length2;
                }
                while (true) {
                    iMin = Math.min(iM3177R, i3 + 4000);
                    String strSubstring2 = message.substring(i3, iMin);
                    AbstractC1326c.m3061d(strSubstring2, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    Log.println(i2, strSubstring, strSubstring2);
                    if (iMin >= iM3177R) {
                        break;
                    } else {
                        i3 = iMin;
                    }
                }
                i3 = iMin + 1;
            }
        }
    }
}
