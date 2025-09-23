package androidx.lifecycle;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: androidx.lifecycle.m */
/* loaded from: classes.dex */
public final class EnumC0748m {

    /* renamed from: a */
    public static final EnumC0748m f2721a;

    /* renamed from: b */
    public static final EnumC0748m f2722b;

    /* renamed from: c */
    public static final EnumC0748m f2723c;

    /* renamed from: d */
    public static final EnumC0748m f2724d;

    /* renamed from: e */
    public static final EnumC0748m f2725e;

    /* renamed from: f */
    public static final /* synthetic */ EnumC0748m[] f2726f;

    static {
        EnumC0748m enumC0748m = new EnumC0748m("DESTROYED", 0);
        f2721a = enumC0748m;
        EnumC0748m enumC0748m2 = new EnumC0748m("INITIALIZED", 1);
        f2722b = enumC0748m2;
        EnumC0748m enumC0748m3 = new EnumC0748m("CREATED", 2);
        f2723c = enumC0748m3;
        EnumC0748m enumC0748m4 = new EnumC0748m("STARTED", 3);
        f2724d = enumC0748m4;
        EnumC0748m enumC0748m5 = new EnumC0748m("RESUMED", 4);
        f2725e = enumC0748m5;
        f2726f = new EnumC0748m[]{enumC0748m, enumC0748m2, enumC0748m3, enumC0748m4, enumC0748m5};
    }

    public static EnumC0748m valueOf(String str) {
        return (EnumC0748m) Enum.valueOf(EnumC0748m.class, str);
    }

    public static EnumC0748m[] values() {
        return (EnumC0748m[]) f2726f.clone();
    }
}
