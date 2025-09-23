package p008C1;

import nfc.share.nfcshare.model.MqttChannel;

/* renamed from: C1.b */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC0093b {

    /* renamed from: a */
    public static final /* synthetic */ int[] f224a;

    static {
        int[] iArr = new int[MqttChannel.values().length];
        f224a = iArr;
        try {
            iArr[MqttChannel.FETCH_CHANNEL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f224a[MqttChannel.SEND_CHANNEL.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f224a[MqttChannel.CARD_INFO_CHANNEL.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f224a[MqttChannel.CARD_REMOVED.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f224a[MqttChannel.NOTIFICATION_CHANNEL.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            f224a[MqttChannel.ANSWER_CHANNEL.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            f224a[MqttChannel.OFFLINE_CHANNEL.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
    }
}
