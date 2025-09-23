package p087d0;

import android.content.res.AssetManager;
import android.os.Build;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.Serializable;
import java.util.concurrent.Executor;

/* renamed from: d0.b */
/* loaded from: classes.dex */
public final class C0845b {

    /* renamed from: a */
    public final Executor f3480a;

    /* renamed from: b */
    public final InterfaceC0848e f3481b;

    /* renamed from: c */
    public final byte[] f3482c;

    /* renamed from: d */
    public final File f3483d;

    /* renamed from: e */
    public final String f3484e;

    /* renamed from: f */
    public boolean f3485f = false;

    /* renamed from: g */
    public C0846c[] f3486g;

    /* renamed from: h */
    public byte[] f3487h;

    public C0845b(AssetManager assetManager, Executor executor, InterfaceC0848e interfaceC0848e, String str, File file) {
        this.f3480a = executor;
        this.f3481b = interfaceC0848e;
        this.f3484e = str;
        this.f3483d = file;
        int i2 = Build.VERSION.SDK_INT;
        byte[] bArr = null;
        if (i2 <= 33) {
            switch (i2) {
                case 25:
                    bArr = AbstractC0849f.f3504h;
                    break;
                case 26:
                    bArr = AbstractC0849f.f3503g;
                    break;
                case 27:
                    bArr = AbstractC0849f.f3502f;
                    break;
                case 28:
                case 29:
                case 30:
                    bArr = AbstractC0849f.f3501e;
                    break;
                case 31:
                case 32:
                case 33:
                    bArr = AbstractC0849f.f3500d;
                    break;
            }
        }
        this.f3482c = bArr;
    }

    /* renamed from: a */
    public final FileInputStream m2148a(AssetManager assetManager, String str) {
        try {
            return assetManager.openFd(str).createInputStream();
        } catch (FileNotFoundException e3) {
            String message = e3.getMessage();
            if (message == null) {
                return null;
            }
            message.contains("compressed");
            return null;
        }
    }

    /* renamed from: b */
    public final void m2149b(final int i2, final Serializable serializable) {
        this.f3480a.execute(new Runnable() { // from class: d0.a
            @Override // java.lang.Runnable
            public final void run() {
                this.f3477a.f3481b.mo1978e(i2, serializable);
            }
        });
    }
}
