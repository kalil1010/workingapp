package p105j;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Editable;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.DragEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.widget.EditText;
import android.widget.TextView;
import p001A0.C0004c;
import p002A1.C0013H;
import p028K.AbstractC0241P;
import p028K.C0257d;
import p028K.C0261f;
import p028K.InterfaceC0255c;
import p028K.InterfaceC0287s;
import p033L1.AbstractC0356d;
import p042P.C0431b;
import p045Q.C0453q;
import p094f0.C0929b;
import tkbmmn.ghwbbf.irvjzy.R;

/* renamed from: j.v */
/* loaded from: classes.dex */
public class C1136v extends EditText implements InterfaceC0287s {

    /* renamed from: a */
    public final C0929b f4653a;

    /* renamed from: b */
    public final C1072Z f4654b;

    /* renamed from: c */
    public final C1025B f4655c;

    /* renamed from: d */
    public final C0453q f4656d;

    /* renamed from: e */
    public final C1025B f4657e;

    /* renamed from: f */
    public C1134u f4658f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1136v(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.editTextStyle);
        AbstractC1082c1.m2702a(context);
        AbstractC1079b1.m2695a(this, getContext());
        C0929b c0929b = new C0929b(this);
        this.f4653a = c0929b;
        c0929b.m2420k(attributeSet, R.attr.editTextStyle);
        C1072Z c1072z = new C1072Z(this);
        this.f4654b = c1072z;
        c1072z.m2683f(attributeSet, R.attr.editTextStyle);
        c1072z.m2680b();
        C1025B c1025b = new C1025B();
        c1025b.f4338b = this;
        this.f4655c = c1025b;
        this.f4656d = new C0453q();
        C1025B c1025b2 = new C1025B(this);
        this.f4657e = c1025b2;
        c1025b2.mo2615b(attributeSet, R.attr.editTextStyle);
        KeyListener keyListener = getKeyListener();
        if (keyListener instanceof NumberKeyListener) {
            return;
        }
        boolean zIsFocusable = super.isFocusable();
        boolean zIsClickable = super.isClickable();
        boolean zIsLongClickable = super.isLongClickable();
        int inputType = super.getInputType();
        KeyListener keyListenerM2614a = c1025b2.m2614a(keyListener);
        if (keyListenerM2614a == keyListener) {
            return;
        }
        super.setKeyListener(keyListenerM2614a);
        super.setRawInputType(inputType);
        super.setFocusable(zIsFocusable);
        super.setClickable(zIsClickable);
        super.setLongClickable(zIsLongClickable);
    }

    private C1134u getSuperCaller() {
        if (this.f4658f == null) {
            this.f4658f = new C1134u(this);
        }
        return this.f4658f;
    }

    @Override // p028K.InterfaceC0287s
    /* renamed from: a */
    public final C0261f mo813a(C0261f c0261f) {
        return this.f4656d.m1138a(this, c0261f);
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0929b c0929b = this.f4653a;
        if (c0929b != null) {
            c0929b.m2410a();
        }
        C1072Z c1072z = this.f4654b;
        if (c1072z != null) {
            c1072z.m2680b();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return AbstractC0356d.m949J(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0929b c0929b = this.f4653a;
        if (c0929b != null) {
            return c0929b.m2417h();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0929b c0929b = this.f4653a;
        if (c0929b != null) {
            return c0929b.m2418i();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f4654b.m2681d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f4654b.m2682e();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        C1025B c1025b;
        if (Build.VERSION.SDK_INT >= 28 || (c1025b = this.f4655c) == null) {
            return super.getTextClassifier();
        }
        TextClassifier textClassifier = (TextClassifier) c1025b.f4339c;
        return textClassifier == null ? AbstractC1060T.m2666a((TextView) c1025b.f4338b) : textClassifier;
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        String[] strArrM695g;
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.f4654b.getClass();
        C1072Z.m2678h(editorInfo, inputConnectionOnCreateInputConnection, this);
        AbstractC0356d.m973x(editorInfo, inputConnectionOnCreateInputConnection, this);
        if (inputConnectionOnCreateInputConnection != null && Build.VERSION.SDK_INT <= 30 && (strArrM695g = AbstractC0241P.m695g(this)) != null) {
            editorInfo.contentMimeTypes = strArrM695g;
            inputConnectionOnCreateInputConnection = new C0431b(inputConnectionOnCreateInputConnection, new C0013H(this));
        }
        return this.f4657e.m2616c(inputConnectionOnCreateInputConnection, editorInfo);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onDragEvent(DragEvent dragEvent) {
        Activity activity;
        boolean zM2622a = false;
        if (Build.VERSION.SDK_INT < 31 && dragEvent.getLocalState() == null && AbstractC0241P.m695g(this) != null) {
            Context context = getContext();
            while (true) {
                if (!(context instanceof ContextWrapper)) {
                    activity = null;
                    break;
                }
                if (context instanceof Activity) {
                    activity = (Activity) context;
                    break;
                }
                context = ((ContextWrapper) context).getBaseContext();
            }
            if (activity == null) {
                toString();
            } else if (dragEvent.getAction() != 1 && dragEvent.getAction() == 3) {
                zM2622a = AbstractC1031E.m2622a(dragEvent, this, activity);
            }
        }
        if (zM2622a) {
            return true;
        }
        return super.onDragEvent(dragEvent);
    }

    @Override // android.widget.EditText, android.widget.TextView
    public final boolean onTextContextMenuItem(int i2) {
        InterfaceC0255c c0004c;
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 31 || AbstractC0241P.m695g(this) == null || !(i2 == 16908322 || i2 == 16908337)) {
            return super.onTextContextMenuItem(i2);
        }
        ClipboardManager clipboardManager = (ClipboardManager) getContext().getSystemService("clipboard");
        ClipData primaryClip = clipboardManager == null ? null : clipboardManager.getPrimaryClip();
        if (primaryClip != null && primaryClip.getItemCount() > 0) {
            if (i3 >= 31) {
                c0004c = new C0004c(primaryClip, 1);
            } else {
                C0257d c0257d = new C0257d();
                c0257d.f840b = primaryClip;
                c0257d.f841c = 1;
                c0004c = c0257d;
            }
            c0004c.mo27n(i2 == 16908322 ? 0 : 1);
            AbstractC0241P.m697i(this, c0004c.mo20g());
        }
        return true;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0929b c0929b = this.f4653a;
        if (c0929b != null) {
            c0929b.m2422m();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i2) {
        super.setBackgroundResource(i2);
        C0929b c0929b = this.f4653a;
        if (c0929b != null) {
            c0929b.m2423n(i2);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C1072Z c1072z = this.f4654b;
        if (c1072z != null) {
            c1072z.m2680b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C1072Z c1072z = this.f4654b;
        if (c1072z != null) {
            c1072z.m2680b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(AbstractC0356d.m950K(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z2) {
        this.f4657e.m2617d(z2);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.f4657e.m2614a(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0929b c0929b = this.f4653a;
        if (c0929b != null) {
            c0929b.m2428s(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0929b c0929b = this.f4653a;
        if (c0929b != null) {
            c0929b.m2429t(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        C1072Z c1072z = this.f4654b;
        c1072z.m2688l(colorStateList);
        c1072z.m2680b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        C1072Z c1072z = this.f4654b;
        c1072z.m2689m(mode);
        c1072z.m2680b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i2) {
        super.setTextAppearance(context, i2);
        C1072Z c1072z = this.f4654b;
        if (c1072z != null) {
            c1072z.m2684g(context, i2);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        C1025B c1025b;
        if (Build.VERSION.SDK_INT >= 28 || (c1025b = this.f4655c) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            c1025b.f4339c = textClassifier;
        }
    }

    @Override // android.widget.EditText, android.widget.TextView
    public Editable getText() {
        return Build.VERSION.SDK_INT >= 28 ? super.getText() : super.getEditableText();
    }
}
