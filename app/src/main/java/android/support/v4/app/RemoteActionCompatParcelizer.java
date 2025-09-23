package android.support.v4.app;

import androidx.core.app.RemoteActionCompat;
import java.lang.reflect.InvocationTargetException;
import p112l0.AbstractC1225a;

/* loaded from: classes.dex */
public final class RemoteActionCompatParcelizer extends androidx.core.app.RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(AbstractC1225a abstractC1225a) {
        return androidx.core.app.RemoteActionCompatParcelizer.read(abstractC1225a);
    }

    public static void write(RemoteActionCompat remoteActionCompat, AbstractC1225a abstractC1225a) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        androidx.core.app.RemoteActionCompatParcelizer.write(remoteActionCompat, abstractC1225a);
    }
}
