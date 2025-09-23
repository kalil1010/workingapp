package p002A1;

import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.DialogInterface;
import android.content.Intent;
import android.nfc.NfcAdapter;
import nfc.share.nfcshare.MainActivity;
import nfc.share.nfcshare.service.EmulationService;

/* renamed from: A1.z */
/* loaded from: classes.dex */
public final class DialogInterfaceOnClickListenerC0044z implements DialogInterface.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ int f98a;

    /* renamed from: b */
    public final /* synthetic */ MainActivity f99b;

    public /* synthetic */ DialogInterfaceOnClickListenerC0044z(MainActivity mainActivity, int i2) {
        this.f98a = i2;
        this.f99b = mainActivity;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i2) {
        switch (this.f98a) {
            case 0:
                this.f99b.startActivity(new Intent("android.settings.NFC_SETTINGS"));
                dialogInterface.dismiss();
                break;
            default:
                dialogInterface.dismiss();
                MainActivity mainActivity = this.f99b;
                mainActivity.getClass();
                if (NfcAdapter.getDefaultAdapter(mainActivity) != null) {
                    Intent intent = new Intent("android.nfc.cardemulation.action.ACTION_CHANGE_DEFAULT");
                    intent.putExtra("component", new ComponentName(mainActivity, (Class<?>) EmulationService.class));
                    intent.putExtra("category", "payment");
                    try {
                        mainActivity.startActivityForResult(intent, 1);
                        break;
                    } catch (ActivityNotFoundException unused) {
                        return;
                    }
                }
                break;
        }
    }
}
