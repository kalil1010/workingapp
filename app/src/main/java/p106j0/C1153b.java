package p106j0;

import android.graphics.PointF;
import android.graphics.Rect;
import android.util.Property;
import android.view.View;

/* renamed from: j0.b */
/* loaded from: classes.dex */
public final class C1153b extends Property {

    /* renamed from: a */
    public final /* synthetic */ int f4723a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1153b(Class cls, String str, int i2) {
        super(cls, str);
        this.f4723a = i2;
    }

    @Override // android.util.Property
    public final Object get(Object obj) {
        switch (this.f4723a) {
            case 0:
                return null;
            case 1:
                return null;
            case 2:
                return null;
            case 3:
                return null;
            case 4:
                return null;
            case 5:
                return Float.valueOf(AbstractC1174w.f4793a.mo1018L((View) obj));
            default:
                return ((View) obj).getClipBounds();
        }
    }

    @Override // android.util.Property
    public final void set(Object obj, Object obj2) {
        switch (this.f4723a) {
            case 0:
                C1156e c1156e = (C1156e) obj;
                PointF pointF = (PointF) obj2;
                c1156e.getClass();
                c1156e.f4726a = Math.round(pointF.x);
                int iRound = Math.round(pointF.y);
                c1156e.f4727b = iRound;
                int i2 = c1156e.f4731f + 1;
                c1156e.f4731f = i2;
                if (i2 == c1156e.f4732g) {
                    AbstractC1174w.m2822a(c1156e.f4730e, c1156e.f4726a, iRound, c1156e.f4728c, c1156e.f4729d);
                    c1156e.f4731f = 0;
                    c1156e.f4732g = 0;
                    break;
                }
                break;
            case 1:
                C1156e c1156e2 = (C1156e) obj;
                PointF pointF2 = (PointF) obj2;
                c1156e2.getClass();
                c1156e2.f4728c = Math.round(pointF2.x);
                int iRound2 = Math.round(pointF2.y);
                c1156e2.f4729d = iRound2;
                int i3 = c1156e2.f4732g + 1;
                c1156e2.f4732g = i3;
                if (c1156e2.f4731f == i3) {
                    AbstractC1174w.m2822a(c1156e2.f4730e, c1156e2.f4726a, c1156e2.f4727b, c1156e2.f4728c, iRound2);
                    c1156e2.f4731f = 0;
                    c1156e2.f4732g = 0;
                    break;
                }
                break;
            case 2:
                View view = (View) obj;
                PointF pointF3 = (PointF) obj2;
                AbstractC1174w.m2822a(view, view.getLeft(), view.getTop(), Math.round(pointF3.x), Math.round(pointF3.y));
                break;
            case 3:
                View view2 = (View) obj;
                PointF pointF4 = (PointF) obj2;
                AbstractC1174w.m2822a(view2, Math.round(pointF4.x), Math.round(pointF4.y), view2.getRight(), view2.getBottom());
                break;
            case 4:
                View view3 = (View) obj;
                PointF pointF5 = (PointF) obj2;
                int iRound3 = Math.round(pointF5.x);
                int iRound4 = Math.round(pointF5.y);
                AbstractC1174w.m2822a(view3, iRound3, iRound4, view3.getWidth() + iRound3, view3.getHeight() + iRound4);
                break;
            case 5:
                float fFloatValue = ((Float) obj2).floatValue();
                AbstractC1174w.f4793a.mo1026h0((View) obj, fFloatValue);
                break;
            default:
                ((View) obj).setClipBounds((Rect) obj2);
                break;
        }
    }
}
