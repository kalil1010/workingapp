package p066X;

import android.os.Bundle;
import android.text.Editable;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.widget.EditText;
import androidx.emoji2.text.C0667f;
import androidx.emoji2.text.C0671j;
import java.nio.ByteBuffer;
import p055T0.C0511e;
import p063W.C0552b;

/* renamed from: X.b */
/* loaded from: classes.dex */
public final class C0589b extends InputConnectionWrapper {

    /* renamed from: a */
    public final EditText f1890a;

    /* renamed from: b */
    public final C0511e f1891b;

    public C0589b(EditText editText, InputConnection inputConnection, EditorInfo editorInfo) {
        C0511e c0511e = new C0511e(12);
        super(inputConnection, false);
        this.f1890a = editText;
        this.f1891b = c0511e;
        if (C0671j.f2394j != null) {
            C0671j c0671jM1625a = C0671j.m1625a();
            if (c0671jM1625a.m1626b() != 1 || editorInfo == null) {
                return;
            }
            if (editorInfo.extras == null) {
                editorInfo.extras = new Bundle();
            }
            C0667f c0667f = c0671jM1625a.f2399e;
            c0667f.getClass();
            Bundle bundle = editorInfo.extras;
            C0552b c0552b = (C0552b) c0667f.f2389c.f352a;
            int iM610a = c0552b.m610a(4);
            bundle.putInt("android.support.text.emoji.emojiCompat_metadataVersion", iM610a != 0 ? ((ByteBuffer) c0552b.f806d).getInt(iM610a + c0552b.f803a) : 0);
            Bundle bundle2 = editorInfo.extras;
            c0667f.f2387a.getClass();
            bundle2.putBoolean("android.support.text.emoji.emojiCompat_replaceAll", false);
        }
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i2, int i3) {
        Editable editableText = this.f1890a.getEditableText();
        this.f1891b.getClass();
        return C0511e.m1276g(this, editableText, i2, i3, false) || super.deleteSurroundingText(i2, i3);
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i2, int i3) {
        Editable editableText = this.f1890a.getEditableText();
        this.f1891b.getClass();
        return C0511e.m1276g(this, editableText, i2, i3, true) || super.deleteSurroundingTextInCodePoints(i2, i3);
    }
}
