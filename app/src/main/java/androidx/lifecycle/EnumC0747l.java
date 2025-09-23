package androidx.lifecycle;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: androidx.lifecycle.l */
/* loaded from: classes.dex */
public final class EnumC0747l {
    private static final /* synthetic */ EnumC0747l[] $VALUES;
    public static final C0745j Companion;
    public static final EnumC0747l ON_ANY;
    public static final EnumC0747l ON_CREATE;
    public static final EnumC0747l ON_DESTROY;
    public static final EnumC0747l ON_PAUSE;
    public static final EnumC0747l ON_RESUME;
    public static final EnumC0747l ON_START;
    public static final EnumC0747l ON_STOP;

    static {
        EnumC0747l enumC0747l = new EnumC0747l("ON_CREATE", 0);
        ON_CREATE = enumC0747l;
        EnumC0747l enumC0747l2 = new EnumC0747l("ON_START", 1);
        ON_START = enumC0747l2;
        EnumC0747l enumC0747l3 = new EnumC0747l("ON_RESUME", 2);
        ON_RESUME = enumC0747l3;
        EnumC0747l enumC0747l4 = new EnumC0747l("ON_PAUSE", 3);
        ON_PAUSE = enumC0747l4;
        EnumC0747l enumC0747l5 = new EnumC0747l("ON_STOP", 4);
        ON_STOP = enumC0747l5;
        EnumC0747l enumC0747l6 = new EnumC0747l("ON_DESTROY", 5);
        ON_DESTROY = enumC0747l6;
        EnumC0747l enumC0747l7 = new EnumC0747l("ON_ANY", 6);
        ON_ANY = enumC0747l7;
        $VALUES = new EnumC0747l[]{enumC0747l, enumC0747l2, enumC0747l3, enumC0747l4, enumC0747l5, enumC0747l6, enumC0747l7};
        Companion = new C0745j();
    }

    public static EnumC0747l valueOf(String str) {
        return (EnumC0747l) Enum.valueOf(EnumC0747l.class, str);
    }

    public static EnumC0747l[] values() {
        return (EnumC0747l[]) $VALUES.clone();
    }

    /* renamed from: a */
    public final EnumC0748m m1777a() {
        switch (AbstractC0746k.f2720a[ordinal()]) {
            case 1:
            case 2:
                return EnumC0748m.f2723c;
            case 3:
            case 4:
                return EnumC0748m.f2724d;
            case 5:
                return EnumC0748m.f2725e;
            case 6:
                return EnumC0748m.f2721a;
            default:
                throw new IllegalArgumentException(this + " has no target state");
        }
    }
}
