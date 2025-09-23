package p080b1;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.EnumMap;
import java.util.EnumSet;
import p073Z0.C0611g;

/* renamed from: b1.g */
/* loaded from: classes.dex */
public final class C0769g implements InterfaceC0779q {

    /* renamed from: a */
    public final /* synthetic */ int f2885a;

    /* renamed from: b */
    public final /* synthetic */ Type f2886b;

    public /* synthetic */ C0769g(Type type, int i2) {
        this.f2885a = i2;
        this.f2886b = type;
    }

    @Override // p080b1.InterfaceC0779q
    /* renamed from: i */
    public final Object mo22i() {
        switch (this.f2885a) {
            case 0:
                Type type = this.f2886b;
                if (!(type instanceof ParameterizedType)) {
                    throw new C0611g("Invalid EnumSet type: " + type.toString());
                }
                Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
                if (type2 instanceof Class) {
                    return EnumSet.noneOf((Class) type2);
                }
                throw new C0611g("Invalid EnumSet type: " + type.toString());
            default:
                Type type3 = this.f2886b;
                if (!(type3 instanceof ParameterizedType)) {
                    throw new C0611g("Invalid EnumMap type: " + type3.toString());
                }
                Type type4 = ((ParameterizedType) type3).getActualTypeArguments()[0];
                if (type4 instanceof Class) {
                    return new EnumMap((Class) type4);
                }
                throw new C0611g("Invalid EnumMap type: " + type3.toString());
        }
    }
}
