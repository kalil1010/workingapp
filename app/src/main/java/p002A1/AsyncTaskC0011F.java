package p002A1;

import android.os.AsyncTask;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.concurrent.TimeUnit;

/* renamed from: A1.F */
/* loaded from: classes.dex */
public final class AsyncTaskC0011F extends AsyncTask {

    /* renamed from: a */
    public final InterfaceC0010E f18a;

    /* renamed from: b */
    public int f19b = 8083;

    /* renamed from: c */
    public volatile Socket f20c;

    public AsyncTaskC0011F(InterfaceC0010E interfaceC0010E) {
        this.f18a = interfaceC0010E;
    }

    @Override // android.os.AsyncTask
    public final Object doInBackground(Object[] objArr) throws IOException {
        String str;
        String[] strArr = (String[]) objArr;
        if (strArr == null || strArr.length == 0 || (str = strArr[0]) == null) {
            return "无效IP地址";
        }
        int i2 = this.f19b;
        long jNanoTime = System.nanoTime();
        try {
            this.f20c = new Socket();
            this.f20c.connect(new InetSocketAddress(str, i2), 1500);
            long millis = TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - jNanoTime);
            return millis > 500 ? "0" : String.valueOf(millis);
        } catch (IOException unused) {
            return "-1";
        }
    }

    @Override // android.os.AsyncTask
    public final void onCancelled() throws IOException {
        super.onCancelled();
        try {
            if (this.f20c == null || this.f20c.isClosed()) {
                return;
            }
            this.f20c.close();
        } catch (IOException e3) {
            e3.getMessage();
        }
    }

    @Override // android.os.AsyncTask
    public final void onPostExecute(Object obj) {
        String str = (String) obj;
        InterfaceC0010E interfaceC0010E = this.f18a;
        if (interfaceC0010E == null || isCancelled()) {
            return;
        }
        interfaceC0010E.mo40b(str);
    }
}
