package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import java.util.WeakHashMap;
import p002A1.C0027i;
import p028K.AbstractC0241P;
import p086d.AbstractC0843a;
import p102i.C1008n;
import p102i.InterfaceC1020z;
import tkbmmn.ghwbbf.irvjzy.R;

/* loaded from: classes.dex */
public class ListMenuItemView extends LinearLayout implements InterfaceC1020z, AbsListView.SelectionBoundsAdjuster {

    /* renamed from: a */
    public C1008n f2058a;

    /* renamed from: b */
    public ImageView f2059b;

    /* renamed from: c */
    public RadioButton f2060c;

    /* renamed from: d */
    public TextView f2061d;

    /* renamed from: e */
    public CheckBox f2062e;

    /* renamed from: f */
    public TextView f2063f;

    /* renamed from: g */
    public ImageView f2064g;

    /* renamed from: h */
    public ImageView f2065h;

    /* renamed from: i */
    public LinearLayout f2066i;

    /* renamed from: j */
    public final Drawable f2067j;

    /* renamed from: k */
    public final int f2068k;

    /* renamed from: l */
    public final Context f2069l;

    /* renamed from: m */
    public boolean f2070m;

    /* renamed from: n */
    public final Drawable f2071n;

    /* renamed from: o */
    public final boolean f2072o;

    /* renamed from: p */
    public LayoutInflater f2073p;

    /* renamed from: q */
    public boolean f2074q;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C0027i c0027iM98N = C0027i.m98N(getContext(), attributeSet, AbstractC0843a.f3469s, R.attr.listMenuViewStyle);
        this.f2067j = c0027iM98N.m100B(5);
        TypedArray typedArray = (TypedArray) c0027iM98N.f66c;
        this.f2068k = typedArray.getResourceId(1, -1);
        this.f2070m = typedArray.getBoolean(7, false);
        this.f2069l = context;
        this.f2071n = c0027iM98N.m100B(8);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{android.R.attr.divider}, R.attr.dropDownListViewStyle, 0);
        this.f2072o = typedArrayObtainStyledAttributes.hasValue(0);
        c0027iM98N.m114R();
        typedArrayObtainStyledAttributes.recycle();
    }

    private LayoutInflater getInflater() {
        if (this.f2073p == null) {
            this.f2073p = LayoutInflater.from(getContext());
        }
        return this.f2073p;
    }

    private void setSubMenuArrowVisible(boolean z2) {
        ImageView imageView = this.f2064g;
        if (imageView != null) {
            imageView.setVisibility(z2 ? 0 : 8);
        }
    }

    @Override // android.widget.AbsListView.SelectionBoundsAdjuster
    public final void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.f2065h;
        if (imageView == null || imageView.getVisibility() != 0) {
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f2065h.getLayoutParams();
        rect.top = this.f2065h.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin + rect.top;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x005e  */
    @Override // p102i.InterfaceC1020z
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void mo1472e(p102i.C1008n r11) {
        /*
            Method dump skipped, instructions count: 325
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.ListMenuItemView.mo1472e(i.n):void");
    }

    @Override // p102i.InterfaceC1020z
    public C1008n getItemData() {
        return this.f2058a;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        WeakHashMap weakHashMap = AbstractC0241P.f815a;
        setBackground(this.f2067j);
        TextView textView = (TextView) findViewById(R.id.title);
        this.f2061d = textView;
        int i2 = this.f2068k;
        if (i2 != -1) {
            textView.setTextAppearance(this.f2069l, i2);
        }
        this.f2063f = (TextView) findViewById(R.id.shortcut);
        ImageView imageView = (ImageView) findViewById(R.id.submenuarrow);
        this.f2064g = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.f2071n);
        }
        this.f2065h = (ImageView) findViewById(R.id.group_divider);
        this.f2066i = (LinearLayout) findViewById(R.id.content);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i2, int i3) {
        if (this.f2059b != null && this.f2070m) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f2059b.getLayoutParams();
            int i4 = layoutParams.height;
            if (i4 > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = i4;
            }
        }
        super.onMeasure(i2, i3);
    }

    public void setCheckable(boolean z2) {
        CompoundButton compoundButton;
        View view;
        if (!z2 && this.f2060c == null && this.f2062e == null) {
            return;
        }
        if ((this.f2058a.f4304x & 4) != 0) {
            if (this.f2060c == null) {
                RadioButton radioButton = (RadioButton) getInflater().inflate(R.layout.abc_list_menu_item_radio, (ViewGroup) this, false);
                this.f2060c = radioButton;
                LinearLayout linearLayout = this.f2066i;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.f2060c;
            view = this.f2062e;
        } else {
            if (this.f2062e == null) {
                CheckBox checkBox = (CheckBox) getInflater().inflate(R.layout.abc_list_menu_item_checkbox, (ViewGroup) this, false);
                this.f2062e = checkBox;
                LinearLayout linearLayout2 = this.f2066i;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.f2062e;
            view = this.f2060c;
        }
        if (z2) {
            compoundButton.setChecked(this.f2058a.isChecked());
            if (compoundButton.getVisibility() != 0) {
                compoundButton.setVisibility(0);
            }
            if (view == null || view.getVisibility() == 8) {
                return;
            }
            view.setVisibility(8);
            return;
        }
        CheckBox checkBox2 = this.f2062e;
        if (checkBox2 != null) {
            checkBox2.setVisibility(8);
        }
        RadioButton radioButton2 = this.f2060c;
        if (radioButton2 != null) {
            radioButton2.setVisibility(8);
        }
    }

    public void setChecked(boolean z2) {
        CompoundButton compoundButton;
        if ((this.f2058a.f4304x & 4) != 0) {
            if (this.f2060c == null) {
                RadioButton radioButton = (RadioButton) getInflater().inflate(R.layout.abc_list_menu_item_radio, (ViewGroup) this, false);
                this.f2060c = radioButton;
                LinearLayout linearLayout = this.f2066i;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.f2060c;
        } else {
            if (this.f2062e == null) {
                CheckBox checkBox = (CheckBox) getInflater().inflate(R.layout.abc_list_menu_item_checkbox, (ViewGroup) this, false);
                this.f2062e = checkBox;
                LinearLayout linearLayout2 = this.f2066i;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.f2062e;
        }
        compoundButton.setChecked(z2);
    }

    public void setForceShowIcon(boolean z2) {
        this.f2074q = z2;
        this.f2070m = z2;
    }

    public void setGroupDividerEnabled(boolean z2) {
        ImageView imageView = this.f2065h;
        if (imageView != null) {
            imageView.setVisibility((this.f2072o || !z2) ? 8 : 0);
        }
    }

    public void setIcon(Drawable drawable) {
        this.f2058a.f4294n.getClass();
        boolean z2 = this.f2074q;
        if (z2 || this.f2070m) {
            ImageView imageView = this.f2059b;
            if (imageView == null && drawable == null && !this.f2070m) {
                return;
            }
            if (imageView == null) {
                ImageView imageView2 = (ImageView) getInflater().inflate(R.layout.abc_list_menu_item_icon, (ViewGroup) this, false);
                this.f2059b = imageView2;
                LinearLayout linearLayout = this.f2066i;
                if (linearLayout != null) {
                    linearLayout.addView(imageView2, 0);
                } else {
                    addView(imageView2, 0);
                }
            }
            if (drawable == null && !this.f2070m) {
                this.f2059b.setVisibility(8);
                return;
            }
            ImageView imageView3 = this.f2059b;
            if (!z2) {
                drawable = null;
            }
            imageView3.setImageDrawable(drawable);
            if (this.f2059b.getVisibility() != 0) {
                this.f2059b.setVisibility(0);
            }
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (charSequence == null) {
            if (this.f2061d.getVisibility() != 8) {
                this.f2061d.setVisibility(8);
            }
        } else {
            this.f2061d.setText(charSequence);
            if (this.f2061d.getVisibility() != 0) {
                this.f2061d.setVisibility(0);
            }
        }
    }
}
