package p002A1;

import android.content.Context;
import android.content.res.Configuration;
import p090e.AbstractActivityC0874g;

/* renamed from: A1.c */
/* loaded from: classes.dex */
public abstract class AbstractActivityC0021c extends AbstractActivityC0874g {
    @Override // p090e.AbstractActivityC0874g, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        super.attachBaseContext(context);
        if (context == null) {
            return;
        }
        Configuration configuration = context.getResources().getConfiguration();
        configuration.fontScale = 1.0f;
        applyOverrideConfiguration(configuration);
    }
}
