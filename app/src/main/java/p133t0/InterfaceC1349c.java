package p133t0;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
/* renamed from: t0.c */
/* loaded from: classes.dex */
public @interface InterfaceC1349c {
    int dateStandard() default 0;

    String format() default "yyyyMMdd";

    int index();

    boolean readHexa() default false;

    int size();

    String tag() default "";
}
