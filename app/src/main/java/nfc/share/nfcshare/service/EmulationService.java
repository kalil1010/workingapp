package nfc.share.nfcshare.service;

import android.nfc.cardemulation.HostApduService;
import android.os.Bundle;
import nfc.share.nfcshare.model.MqttChannel;
import p002A1.AbstractC0018M;

/* loaded from: classes.dex */
public class EmulationService extends HostApduService {
    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        AbstractC0018M.f41g = this;
    }

    @Override // android.nfc.cardemulation.HostApduService
    public final void onDeactivated(int i2) {
    }

    @Override // android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        AbstractC0018M.f41g = null;
    }

    @Override // android.nfc.cardemulation.HostApduService
    public final byte[] processCommandApdu(byte[] bArr, Bundle bundle) {
        try {
            AbstractC0018M.f36b.m112P(MqttChannel.FETCH_CHANNEL, AbstractC0018M.m47c(bArr));
            return null;
        } catch (Exception e3) {
            e3.getMessage();
            return AbstractC0018M.m46b("6F00");
        }
    }
}
