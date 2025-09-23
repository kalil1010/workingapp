package p002A1;

import android.os.Build;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import nfc.share.nfcshare.MainActivity;
import p105j.C1023A;
import p105j.C1034F0;

/* renamed from: A1.p */
/* loaded from: classes.dex */
public final class ViewOnTouchListenerC0034p implements View.OnTouchListener {

    /* renamed from: a */
    public final /* synthetic */ int f73a;

    /* renamed from: b */
    public final /* synthetic */ Object f74b;

    public /* synthetic */ ViewOnTouchListenerC0034p(int i2, Object obj) {
        this.f73a = i2;
        this.f74b = obj;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        C1023A c1023a;
        switch (this.f73a) {
            case 0:
                if (motionEvent.getAction() != 0) {
                    if (motionEvent.getAction() == 1) {
                        view.animate().scaleX(1.0f).scaleY(1.0f).setDuration(100L).setInterpolator(new AccelerateDecelerateInterpolator()).start();
                        break;
                    }
                } else {
                    Vibrator vibrator = (Vibrator) ((MainActivity) this.f74b).getSystemService("vibrator");
                    if (vibrator.hasVibrator()) {
                        if (Build.VERSION.SDK_INT >= 26) {
                            vibrator.vibrate(VibrationEffect.createOneShot(20L, -1));
                        } else {
                            vibrator.vibrate(20L);
                        }
                    }
                    view.animate().scaleX(0.9f).scaleY(0.9f).setDuration(100L).setInterpolator(new AccelerateDecelerateInterpolator()).start();
                    break;
                }
                break;
            case 1:
                if (motionEvent.getAction() != 0) {
                    if (motionEvent.getAction() == 1) {
                        view.animate().scaleX(1.0f).scaleY(1.0f).setDuration(100L).setInterpolator(new AccelerateDecelerateInterpolator()).start();
                        break;
                    }
                } else {
                    Vibrator vibrator2 = (Vibrator) ((MainActivity) this.f74b).getSystemService("vibrator");
                    if (vibrator2.hasVibrator()) {
                        if (Build.VERSION.SDK_INT >= 26) {
                            vibrator2.vibrate(VibrationEffect.createOneShot(20L, -1));
                        } else {
                            vibrator2.vibrate(20L);
                        }
                    }
                    view.animate().scaleX(0.9f).scaleY(0.9f).setDuration(100L).setInterpolator(new AccelerateDecelerateInterpolator()).start();
                    break;
                }
                break;
            default:
                int action = motionEvent.getAction();
                int x2 = (int) motionEvent.getX();
                int y2 = (int) motionEvent.getY();
                C1034F0 c1034f0 = (C1034F0) this.f74b;
                if (action == 0 && (c1023a = c1034f0.f4376z) != null && c1023a.isShowing() && x2 >= 0 && x2 < c1034f0.f4376z.getWidth() && y2 >= 0 && y2 < c1034f0.f4376z.getHeight()) {
                    c1034f0.f4372v.postDelayed(c1034f0.f4368r, 250L);
                    break;
                } else if (action == 1) {
                    c1034f0.f4372v.removeCallbacks(c1034f0.f4368r);
                    break;
                }
                break;
        }
        return false;
    }
}
