package p105j;

import android.app.Activity;
import android.content.ClipData;
import android.os.Build;
import android.text.Selection;
import android.text.Spannable;
import android.view.DragEvent;
import android.view.View;
import android.widget.TextView;
import p001A0.C0004c;
import p028K.AbstractC0241P;
import p028K.C0257d;
import p028K.InterfaceC0255c;

/* renamed from: j.E */
/* loaded from: classes.dex */
public abstract class AbstractC1031E {
    /* renamed from: a */
    public static boolean m2622a(DragEvent dragEvent, TextView textView, Activity activity) {
        InterfaceC0255c c0004c;
        activity.requestDragAndDropPermissions(dragEvent);
        int offsetForPosition = textView.getOffsetForPosition(dragEvent.getX(), dragEvent.getY());
        textView.beginBatchEdit();
        try {
            Selection.setSelection((Spannable) textView.getText(), offsetForPosition);
            ClipData clipData = dragEvent.getClipData();
            if (Build.VERSION.SDK_INT >= 31) {
                c0004c = new C0004c(clipData, 3);
            } else {
                C0257d c0257d = new C0257d();
                c0257d.f840b = clipData;
                c0257d.f841c = 3;
                c0004c = c0257d;
            }
            AbstractC0241P.m697i(textView, c0004c.mo20g());
            textView.endBatchEdit();
            return true;
        } catch (Throwable th) {
            textView.endBatchEdit();
            throw th;
        }
    }

    /* renamed from: b */
    public static boolean m2623b(DragEvent dragEvent, View view, Activity activity) {
        InterfaceC0255c c0004c;
        activity.requestDragAndDropPermissions(dragEvent);
        ClipData clipData = dragEvent.getClipData();
        if (Build.VERSION.SDK_INT >= 31) {
            c0004c = new C0004c(clipData, 3);
        } else {
            C0257d c0257d = new C0257d();
            c0257d.f840b = clipData;
            c0257d.f841c = 3;
            c0004c = c0257d;
        }
        AbstractC0241P.m697i(view, c0004c.mo20g());
        return true;
    }
}
