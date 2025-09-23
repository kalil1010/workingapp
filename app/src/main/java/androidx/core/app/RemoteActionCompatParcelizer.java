package androidx.core.app;

import android.app.PendingIntent;
import android.os.Parcel;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import java.lang.reflect.InvocationTargetException;
import p112l0.AbstractC1225a;
import p112l0.C1226b;
import p112l0.InterfaceC1227c;

/* loaded from: classes.dex */
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(AbstractC1225a abstractC1225a) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        InterfaceC1227c interfaceC1227cM2864g = remoteActionCompat.f2301a;
        boolean z2 = true;
        if (abstractC1225a.mo2862e(1)) {
            interfaceC1227cM2864g = abstractC1225a.m2864g();
        }
        remoteActionCompat.f2301a = (IconCompat) interfaceC1227cM2864g;
        CharSequence charSequence = remoteActionCompat.f2302b;
        if (abstractC1225a.mo2862e(2)) {
            charSequence = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((C1226b) abstractC1225a).f4926e);
        }
        remoteActionCompat.f2302b = charSequence;
        CharSequence charSequence2 = remoteActionCompat.f2303c;
        if (abstractC1225a.mo2862e(3)) {
            charSequence2 = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((C1226b) abstractC1225a).f4926e);
        }
        remoteActionCompat.f2303c = charSequence2;
        remoteActionCompat.f2304d = (PendingIntent) abstractC1225a.m2863f(remoteActionCompat.f2304d, 4);
        boolean z3 = remoteActionCompat.f2305e;
        if (abstractC1225a.mo2862e(5)) {
            z3 = ((C1226b) abstractC1225a).f4926e.readInt() != 0;
        }
        remoteActionCompat.f2305e = z3;
        boolean z4 = remoteActionCompat.f2306f;
        if (!abstractC1225a.mo2862e(6)) {
            z2 = z4;
        } else if (((C1226b) abstractC1225a).f4926e.readInt() == 0) {
            z2 = false;
        }
        remoteActionCompat.f2306f = z2;
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, AbstractC1225a abstractC1225a) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        abstractC1225a.getClass();
        IconCompat iconCompat = remoteActionCompat.f2301a;
        abstractC1225a.mo2865h(1);
        abstractC1225a.m2866i(iconCompat);
        CharSequence charSequence = remoteActionCompat.f2302b;
        abstractC1225a.mo2865h(2);
        Parcel parcel = ((C1226b) abstractC1225a).f4926e;
        TextUtils.writeToParcel(charSequence, parcel, 0);
        CharSequence charSequence2 = remoteActionCompat.f2303c;
        abstractC1225a.mo2865h(3);
        TextUtils.writeToParcel(charSequence2, parcel, 0);
        PendingIntent pendingIntent = remoteActionCompat.f2304d;
        abstractC1225a.mo2865h(4);
        parcel.writeParcelable(pendingIntent, 0);
        boolean z2 = remoteActionCompat.f2305e;
        abstractC1225a.mo2865h(5);
        parcel.writeInt(z2 ? 1 : 0);
        boolean z3 = remoteActionCompat.f2306f;
        abstractC1225a.mo2865h(6);
        parcel.writeInt(z3 ? 1 : 0);
    }
}
