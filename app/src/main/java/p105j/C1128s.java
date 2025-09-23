package p105j;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import p006C.AbstractC0069a;
import p033L1.AbstractC0356d;
import tkbmmn.ghwbbf.irvjzy.R;

/* renamed from: j.s */
/* loaded from: classes.dex */
public final class C1128s {

    /* renamed from: a */
    public final int[] f4626a = {R.drawable.abc_textfield_search_default_mtrl_alpha, R.drawable.abc_textfield_default_mtrl_alpha, R.drawable.abc_ab_share_pack_mtrl_alpha};

    /* renamed from: b */
    public final int[] f4627b = {R.drawable.abc_ic_commit_search_api_mtrl_alpha, R.drawable.abc_seekbar_tick_mark_material, R.drawable.abc_ic_menu_share_mtrl_alpha, R.drawable.abc_ic_menu_copy_mtrl_am_alpha, R.drawable.abc_ic_menu_cut_mtrl_alpha, R.drawable.abc_ic_menu_selectall_mtrl_alpha, R.drawable.abc_ic_menu_paste_mtrl_am_alpha};

    /* renamed from: c */
    public final int[] f4628c = {R.drawable.abc_textfield_activated_mtrl_alpha, R.drawable.abc_textfield_search_activated_mtrl_alpha, R.drawable.abc_cab_background_top_mtrl_alpha, R.drawable.abc_text_cursor_material, R.drawable.abc_text_select_handle_left_mtrl, R.drawable.abc_text_select_handle_middle_mtrl, R.drawable.abc_text_select_handle_right_mtrl};

    /* renamed from: d */
    public final int[] f4629d = {R.drawable.abc_popup_background_mtrl_mult, R.drawable.abc_cab_background_internal_bg, R.drawable.abc_menu_hardkey_panel_mtrl_mult};

    /* renamed from: e */
    public final int[] f4630e = {R.drawable.abc_tab_indicator_material, R.drawable.abc_textfield_search_material};

    /* renamed from: f */
    public final int[] f4631f = {R.drawable.abc_btn_check_material, R.drawable.abc_btn_radio_material, R.drawable.abc_btn_check_material_anim, R.drawable.abc_btn_radio_material_anim};

    /* renamed from: a */
    public static boolean m2740a(int[] iArr, int i2) {
        for (int i3 : iArr) {
            if (i3 == i2) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public static ColorStateList m2741b(Context context, int i2) {
        int iM2697c = AbstractC1079b1.m2697c(context, R.attr.colorControlHighlight);
        int iM2696b = AbstractC1079b1.m2696b(context, R.attr.colorButtonNormal);
        int[] iArr = AbstractC1079b1.f4486b;
        int[] iArr2 = AbstractC1079b1.f4488d;
        int iM193b = AbstractC0069a.m193b(iM2697c, i2);
        return new ColorStateList(new int[][]{iArr, iArr2, AbstractC1079b1.f4487c, AbstractC1079b1.f4490f}, new int[]{iM2696b, iM193b, AbstractC0069a.m193b(iM2697c, i2), i2});
    }

    /* renamed from: c */
    public static LayerDrawable m2742c(C1050N0 c1050n0, Context context, int i2) {
        BitmapDrawable bitmapDrawable;
        BitmapDrawable bitmapDrawable2;
        BitmapDrawable bitmapDrawable3;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(i2);
        Drawable drawableM2659c = c1050n0.m2659c(context, R.drawable.abc_star_black_48dp);
        Drawable drawableM2659c2 = c1050n0.m2659c(context, R.drawable.abc_star_half_black_48dp);
        if ((drawableM2659c instanceof BitmapDrawable) && drawableM2659c.getIntrinsicWidth() == dimensionPixelSize && drawableM2659c.getIntrinsicHeight() == dimensionPixelSize) {
            bitmapDrawable = (BitmapDrawable) drawableM2659c;
            bitmapDrawable2 = new BitmapDrawable(bitmapDrawable.getBitmap());
        } else {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            drawableM2659c.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            drawableM2659c.draw(canvas);
            bitmapDrawable = new BitmapDrawable(bitmapCreateBitmap);
            bitmapDrawable2 = new BitmapDrawable(bitmapCreateBitmap);
        }
        bitmapDrawable2.setTileModeX(Shader.TileMode.REPEAT);
        if ((drawableM2659c2 instanceof BitmapDrawable) && drawableM2659c2.getIntrinsicWidth() == dimensionPixelSize && drawableM2659c2.getIntrinsicHeight() == dimensionPixelSize) {
            bitmapDrawable3 = (BitmapDrawable) drawableM2659c2;
        } else {
            Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
            Canvas canvas2 = new Canvas(bitmapCreateBitmap2);
            drawableM2659c2.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            drawableM2659c2.draw(canvas2);
            bitmapDrawable3 = new BitmapDrawable(bitmapCreateBitmap2);
        }
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{bitmapDrawable, bitmapDrawable3, bitmapDrawable2});
        layerDrawable.setId(0, android.R.id.background);
        layerDrawable.setId(1, android.R.id.secondaryProgress);
        layerDrawable.setId(2, android.R.id.progress);
        return layerDrawable;
    }

    /* renamed from: e */
    public static void m2743e(Drawable drawable, int i2, PorterDuff.Mode mode) {
        int[] iArr = AbstractC1117o0.f4587a;
        Drawable drawableMutate = drawable.mutate();
        if (mode == null) {
            mode = C1131t.f4634b;
        }
        drawableMutate.setColorFilter(C1131t.m2750c(i2, mode));
    }

    /* renamed from: d */
    public final ColorStateList m2744d(Context context, int i2) {
        if (i2 == R.drawable.abc_edit_text_material) {
            return AbstractC0356d.m969s(context, R.color.abc_tint_edittext);
        }
        if (i2 == R.drawable.abc_switch_track_mtrl_alpha) {
            return AbstractC0356d.m969s(context, R.color.abc_tint_switch_track);
        }
        if (i2 != R.drawable.abc_switch_thumb_material) {
            if (i2 == R.drawable.abc_btn_default_mtrl_shape) {
                return m2741b(context, AbstractC1079b1.m2697c(context, R.attr.colorButtonNormal));
            }
            if (i2 == R.drawable.abc_btn_borderless_material) {
                return m2741b(context, 0);
            }
            if (i2 == R.drawable.abc_btn_colored_material) {
                return m2741b(context, AbstractC1079b1.m2697c(context, R.attr.colorAccent));
            }
            if (i2 == R.drawable.abc_spinner_mtrl_am_alpha || i2 == R.drawable.abc_spinner_textfield_background_material) {
                return AbstractC0356d.m969s(context, R.color.abc_tint_spinner);
            }
            if (m2740a(this.f4627b, i2)) {
                return AbstractC1079b1.m2698d(context, R.attr.colorControlNormal);
            }
            if (m2740a(this.f4630e, i2)) {
                return AbstractC0356d.m969s(context, R.color.abc_tint_default);
            }
            if (m2740a(this.f4631f, i2)) {
                return AbstractC0356d.m969s(context, R.color.abc_tint_btn_checkable);
            }
            if (i2 == R.drawable.abc_seekbar_thumb_material) {
                return AbstractC0356d.m969s(context, R.color.abc_tint_seek_thumb);
            }
            return null;
        }
        int[][] iArr = new int[3][];
        int[] iArr2 = new int[3];
        ColorStateList colorStateListM2698d = AbstractC1079b1.m2698d(context, R.attr.colorSwitchThumbNormal);
        if (colorStateListM2698d == null || !colorStateListM2698d.isStateful()) {
            iArr[0] = AbstractC1079b1.f4486b;
            iArr2[0] = AbstractC1079b1.m2696b(context, R.attr.colorSwitchThumbNormal);
            iArr[1] = AbstractC1079b1.f4489e;
            iArr2[1] = AbstractC1079b1.m2697c(context, R.attr.colorControlActivated);
            iArr[2] = AbstractC1079b1.f4490f;
            iArr2[2] = AbstractC1079b1.m2697c(context, R.attr.colorSwitchThumbNormal);
        } else {
            int[] iArr3 = AbstractC1079b1.f4486b;
            iArr[0] = iArr3;
            iArr2[0] = colorStateListM2698d.getColorForState(iArr3, 0);
            iArr[1] = AbstractC1079b1.f4489e;
            iArr2[1] = AbstractC1079b1.m2697c(context, R.attr.colorControlActivated);
            iArr[2] = AbstractC1079b1.f4490f;
            iArr2[2] = colorStateListM2698d.getDefaultColor();
        }
        return new ColorStateList(iArr, iArr2);
    }
}
