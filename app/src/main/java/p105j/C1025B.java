package p105j;

import android.R;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Shader;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.AbsSeekBar;
import android.widget.EditText;
import androidx.emoji2.text.C0671j;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import p001A0.C0004c;
import p002A1.C0019a;
import p002A1.C0027i;
import p009D.AbstractC0102e;
import p009D.InterfaceC0101d;
import p033L1.AbstractC0364l;
import p066X.C0589b;
import p066X.C0592e;
import p066X.C0595h;
import p066X.C0596i;
import p086d.AbstractC0843a;

/* renamed from: j.B */
/* loaded from: classes.dex */
public class C1025B {

    /* renamed from: d */
    public static final int[] f4336d = {R.attr.indeterminateDrawable, R.attr.progressDrawable};

    /* renamed from: a */
    public final /* synthetic */ int f4337a = 2;

    /* renamed from: b */
    public View f4338b;

    /* renamed from: c */
    public Object f4339c;

    public /* synthetic */ C1025B() {
    }

    /* renamed from: a */
    public KeyListener m2614a(KeyListener keyListener) {
        if (keyListener instanceof NumberKeyListener) {
            return keyListener;
        }
        ((C0019a) ((C0004c) this.f4339c).f7b).getClass();
        if (keyListener instanceof C0592e) {
            return keyListener;
        }
        if (keyListener == null) {
            return null;
        }
        return keyListener instanceof NumberKeyListener ? keyListener : new C0592e(keyListener);
    }

    /* renamed from: b */
    public void mo2615b(AttributeSet attributeSet, int i2) {
        switch (this.f4337a) {
            case 0:
                AbsSeekBar absSeekBar = (AbsSeekBar) this.f4338b;
                C0027i c0027iM98N = C0027i.m98N(absSeekBar.getContext(), attributeSet, f4336d, i2);
                Drawable drawableM101C = c0027iM98N.m101C(0);
                if (drawableM101C != null) {
                    if (drawableM101C instanceof AnimationDrawable) {
                        AnimationDrawable animationDrawable = (AnimationDrawable) drawableM101C;
                        int numberOfFrames = animationDrawable.getNumberOfFrames();
                        AnimationDrawable animationDrawable2 = new AnimationDrawable();
                        animationDrawable2.setOneShot(animationDrawable.isOneShot());
                        for (int i3 = 0; i3 < numberOfFrames; i3++) {
                            Drawable drawableM2618e = m2618e(animationDrawable.getFrame(i3), true);
                            drawableM2618e.setLevel(10000);
                            animationDrawable2.addFrame(drawableM2618e, animationDrawable.getDuration(i3));
                        }
                        animationDrawable2.setLevel(10000);
                        drawableM101C = animationDrawable2;
                    }
                    absSeekBar.setIndeterminateDrawable(drawableM101C);
                }
                Drawable drawableM101C2 = c0027iM98N.m101C(1);
                if (drawableM101C2 != null) {
                    absSeekBar.setProgressDrawable(m2618e(drawableM101C2, false));
                }
                c0027iM98N.m114R();
                return;
            default:
                TypedArray typedArrayObtainStyledAttributes = ((EditText) this.f4338b).getContext().obtainStyledAttributes(attributeSet, AbstractC0843a.f3459i, i2, 0);
                try {
                    boolean z2 = typedArrayObtainStyledAttributes.hasValue(14) ? typedArrayObtainStyledAttributes.getBoolean(14, true) : true;
                    typedArrayObtainStyledAttributes.recycle();
                    m2617d(z2);
                    return;
                } catch (Throwable th) {
                    typedArrayObtainStyledAttributes.recycle();
                    throw th;
                }
        }
    }

    /* renamed from: c */
    public C0589b m2616c(InputConnection inputConnection, EditorInfo editorInfo) {
        C0004c c0004c = (C0004c) this.f4339c;
        if (inputConnection == null) {
            c0004c.getClass();
            inputConnection = null;
        } else {
            C0019a c0019a = (C0019a) c0004c.f7b;
            c0019a.getClass();
            if (!(inputConnection instanceof C0589b)) {
                inputConnection = new C0589b((EditText) c0019a.f47c, inputConnection, editorInfo);
            }
        }
        return (C0589b) inputConnection;
    }

    /* renamed from: d */
    public void m2617d(boolean z2) {
        C0596i c0596i = (C0596i) ((C0019a) ((C0004c) this.f4339c).f7b).f46b;
        if (c0596i.f1905c != z2) {
            if (c0596i.f1904b != null) {
                C0671j c0671jM1625a = C0671j.m1625a();
                C0595h c0595h = c0596i.f1904b;
                c0671jM1625a.getClass();
                AbstractC0364l.m1010q(c0595h, "initCallback cannot be null");
                ReentrantReadWriteLock reentrantReadWriteLock = c0671jM1625a.f2395a;
                reentrantReadWriteLock.writeLock().lock();
                try {
                    c0671jM1625a.f2396b.remove(c0595h);
                } finally {
                    reentrantReadWriteLock.writeLock().unlock();
                }
            }
            c0596i.f1905c = z2;
            if (z2) {
                C0596i.m1402a(c0596i.f1903a, C0671j.m1625a().m1626b());
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: e */
    public Drawable m2618e(Drawable drawable, boolean z2) {
        if (drawable instanceof InterfaceC0101d) {
            ((AbstractC0102e) ((InterfaceC0101d) drawable)).getClass();
        } else {
            if (drawable instanceof LayerDrawable) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                int numberOfLayers = layerDrawable.getNumberOfLayers();
                Drawable[] drawableArr = new Drawable[numberOfLayers];
                for (int i2 = 0; i2 < numberOfLayers; i2++) {
                    int id = layerDrawable.getId(i2);
                    drawableArr[i2] = m2618e(layerDrawable.getDrawable(i2), id == 16908301 || id == 16908303);
                }
                LayerDrawable layerDrawable2 = new LayerDrawable(drawableArr);
                for (int i3 = 0; i3 < numberOfLayers; i3++) {
                    layerDrawable2.setId(i3, layerDrawable.getId(i3));
                    layerDrawable2.setLayerGravity(i3, layerDrawable.getLayerGravity(i3));
                    layerDrawable2.setLayerWidth(i3, layerDrawable.getLayerWidth(i3));
                    layerDrawable2.setLayerHeight(i3, layerDrawable.getLayerHeight(i3));
                    layerDrawable2.setLayerInsetLeft(i3, layerDrawable.getLayerInsetLeft(i3));
                    layerDrawable2.setLayerInsetRight(i3, layerDrawable.getLayerInsetRight(i3));
                    layerDrawable2.setLayerInsetTop(i3, layerDrawable.getLayerInsetTop(i3));
                    layerDrawable2.setLayerInsetBottom(i3, layerDrawable.getLayerInsetBottom(i3));
                    layerDrawable2.setLayerInsetStart(i3, layerDrawable.getLayerInsetStart(i3));
                    layerDrawable2.setLayerInsetEnd(i3, layerDrawable.getLayerInsetEnd(i3));
                }
                return layerDrawable2;
            }
            if (drawable instanceof BitmapDrawable) {
                BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
                Bitmap bitmap = bitmapDrawable.getBitmap();
                if (((Bitmap) this.f4339c) == null) {
                    this.f4339c = bitmap;
                }
                ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f}, null, null));
                shapeDrawable.getPaint().setShader(new BitmapShader(bitmap, Shader.TileMode.REPEAT, Shader.TileMode.CLAMP));
                shapeDrawable.getPaint().setColorFilter(bitmapDrawable.getPaint().getColorFilter());
                return z2 ? new ClipDrawable(shapeDrawable, 3, 1) : shapeDrawable;
            }
        }
        return drawable;
    }

    public C1025B(AbsSeekBar absSeekBar) {
        this.f4338b = absSeekBar;
    }

    public C1025B(EditText editText) {
        this.f4338b = editText;
        this.f4339c = new C0004c(editText);
    }
}
