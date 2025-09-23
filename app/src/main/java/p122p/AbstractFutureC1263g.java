package p122p;

import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;
import p006C.AbstractC0075g;
import p033L1.AbstractC0364l;

/* renamed from: p.g */
/* loaded from: classes.dex */
public abstract class AbstractFutureC1263g implements Future {

    /* renamed from: d */
    public static final boolean f5128d = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* renamed from: e */
    public static final Logger f5129e = Logger.getLogger(AbstractFutureC1263g.class.getName());

    /* renamed from: f */
    public static final AbstractC0364l f5130f;

    /* renamed from: g */
    public static final Object f5131g;

    /* renamed from: a */
    public volatile Object f5132a;

    /* renamed from: b */
    public volatile C1259c f5133b;

    /* renamed from: c */
    public volatile C1262f f5134c;

    static {
        AbstractC0364l c1261e;
        try {
            c1261e = new C1260d(AtomicReferenceFieldUpdater.newUpdater(C1262f.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(C1262f.class, C1262f.class, "b"), AtomicReferenceFieldUpdater.newUpdater(AbstractFutureC1263g.class, C1262f.class, "c"), AtomicReferenceFieldUpdater.newUpdater(AbstractFutureC1263g.class, C1259c.class, "b"), AtomicReferenceFieldUpdater.newUpdater(AbstractFutureC1263g.class, Object.class, "a"));
            th = null;
        } catch (Throwable th) {
            th = th;
            c1261e = new C1261e();
        }
        f5130f = c1261e;
        if (th != null) {
            f5129e.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        f5131g = new Object();
    }

    /* renamed from: b */
    public static void m2921b(AbstractFutureC1263g abstractFutureC1263g) {
        C1262f c1262f;
        C1259c c1259c;
        do {
            c1262f = abstractFutureC1263g.f5134c;
        } while (!f5130f.mo1030n(abstractFutureC1263g, c1262f, C1262f.f5125c));
        while (c1262f != null) {
            Thread thread = c1262f.f5126a;
            if (thread != null) {
                c1262f.f5126a = null;
                LockSupport.unpark(thread);
            }
            c1262f = c1262f.f5127b;
        }
        do {
            c1259c = abstractFutureC1263g.f5133b;
        } while (!f5130f.mo1028l(abstractFutureC1263g, c1259c));
        C1259c c1259c2 = null;
        while (c1259c != null) {
            C1259c c1259c3 = c1259c.f5119a;
            c1259c.f5119a = c1259c2;
            c1259c2 = c1259c;
            c1259c = c1259c3;
        }
        while (c1259c2 != null) {
            c1259c2 = c1259c2.f5119a;
            try {
                throw null;
            } catch (RuntimeException e3) {
                f5129e.log(Level.SEVERE, "RuntimeException while executing runnable null with executor null", (Throwable) e3);
            }
        }
    }

    /* renamed from: c */
    public static Object m2922c(Object obj) throws ExecutionException {
        if (obj instanceof C1257a) {
            CancellationException cancellationException = ((C1257a) obj).f5117a;
            CancellationException cancellationException2 = new CancellationException("Task was cancelled.");
            cancellationException2.initCause(cancellationException);
            throw cancellationException2;
        }
        if (obj instanceof AbstractC1258b) {
            ((AbstractC1258b) obj).getClass();
            throw new ExecutionException((Throwable) null);
        }
        if (obj == f5131g) {
            return null;
        }
        return obj;
    }

    /* renamed from: d */
    public static Object m2923d(AbstractFutureC1263g abstractFutureC1263g) {
        Object obj;
        boolean z2 = false;
        while (true) {
            try {
                obj = abstractFutureC1263g.get();
                break;
            } catch (InterruptedException unused) {
                z2 = true;
            } catch (Throwable th) {
                if (z2) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z2) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    /* renamed from: a */
    public final void m2924a(StringBuilder sb) {
        try {
            Object objM2923d = m2923d(this);
            sb.append("SUCCESS, result=[");
            sb.append(objM2923d == this ? "this future" : String.valueOf(objM2923d));
            sb.append("]");
        } catch (CancellationException unused) {
            sb.append("CANCELLED");
        } catch (RuntimeException e3) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e3.getClass());
            sb.append(" thrown from get()]");
        } catch (ExecutionException e4) {
            sb.append("FAILURE, cause=[");
            sb.append(e4.getCause());
            sb.append("]");
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z2) {
        Object obj = this.f5132a;
        if (obj != null) {
            return false;
        }
        if (!f5130f.mo1029m(this, obj, f5128d ? new C1257a(z2, new CancellationException("Future.cancel() was called.")) : z2 ? C1257a.f5115b : C1257a.f5116c)) {
            return false;
        }
        m2921b(this);
        return true;
    }

    /* renamed from: e */
    public final void m2925e(C1262f c1262f) {
        c1262f.f5126a = null;
        while (true) {
            C1262f c1262f2 = this.f5134c;
            if (c1262f2 == C1262f.f5125c) {
                return;
            }
            C1262f c1262f3 = null;
            while (c1262f2 != null) {
                C1262f c1262f4 = c1262f2.f5127b;
                if (c1262f2.f5126a != null) {
                    c1262f3 = c1262f2;
                } else if (c1262f3 != null) {
                    c1262f3.f5127b = c1262f4;
                    if (c1262f3.f5126a == null) {
                        break;
                    }
                } else if (!f5130f.mo1030n(this, c1262f2, c1262f4)) {
                    break;
                }
                c1262f2 = c1262f4;
            }
            return;
        }
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j2, TimeUnit timeUnit) throws InterruptedException, TimeoutException {
        long nanos = timeUnit.toNanos(j2);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.f5132a;
        if (obj != null) {
            return m2922c(obj);
        }
        long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            C1262f c1262f = this.f5134c;
            C1262f c1262f2 = C1262f.f5125c;
            if (c1262f != c1262f2) {
                C1262f c1262f3 = new C1262f();
                do {
                    AbstractC0364l abstractC0364l = f5130f;
                    abstractC0364l.mo1024Y(c1262f3, c1262f);
                    if (abstractC0364l.mo1030n(this, c1262f, c1262f3)) {
                        do {
                            LockSupport.parkNanos(this, nanos);
                            if (Thread.interrupted()) {
                                m2925e(c1262f3);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.f5132a;
                            if (obj2 != null) {
                                return m2922c(obj2);
                            }
                            nanos = jNanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        m2925e(c1262f3);
                    } else {
                        c1262f = this.f5134c;
                    }
                } while (c1262f != c1262f2);
            }
            return m2922c(this.f5132a);
        }
        while (nanos > 0) {
            Object obj3 = this.f5132a;
            if (obj3 != null) {
                return m2922c(obj3);
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            nanos = jNanoTime - System.nanoTime();
        }
        String string = toString();
        String string2 = timeUnit.toString();
        Locale locale = Locale.ROOT;
        String lowerCase = string2.toLowerCase(locale);
        String strM237f = "Waited " + j2 + " " + timeUnit.toString().toLowerCase(locale);
        if (nanos + 1000 < 0) {
            String strM237f2 = AbstractC0075g.m237f(strM237f, " (plus ");
            long j3 = -nanos;
            long jConvert = timeUnit.convert(j3, TimeUnit.NANOSECONDS);
            long nanos2 = j3 - timeUnit.toNanos(jConvert);
            boolean z2 = jConvert == 0 || nanos2 > 1000;
            if (jConvert > 0) {
                String strM237f3 = strM237f2 + jConvert + " " + lowerCase;
                if (z2) {
                    strM237f3 = AbstractC0075g.m237f(strM237f3, ",");
                }
                strM237f2 = AbstractC0075g.m237f(strM237f3, " ");
            }
            if (z2) {
                strM237f2 = strM237f2 + nanos2 + " nanoseconds ";
            }
            strM237f = AbstractC0075g.m237f(strM237f2, "delay)");
        }
        if (isDone()) {
            throw new TimeoutException(AbstractC0075g.m237f(strM237f, " but future completed as timeout expired"));
        }
        throw new TimeoutException(strM237f + " for " + string);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f5132a instanceof C1257a;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f5132a != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (this.f5132a instanceof C1257a) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            m2924a(sb);
        } else {
            try {
                if (this instanceof ScheduledFuture) {
                    str = "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
                } else {
                    str = null;
                }
            } catch (RuntimeException e3) {
                str = "Exception thrown from implementation: " + e3.getClass();
            }
            if (str != null && !str.isEmpty()) {
                sb.append("PENDING, info=[");
                sb.append(str);
                sb.append("]");
            } else if (isDone()) {
                m2924a(sb);
            } else {
                sb.append("PENDING");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    @Override // java.util.concurrent.Future
    public final Object get() throws InterruptedException {
        Object obj;
        if (!Thread.interrupted()) {
            Object obj2 = this.f5132a;
            if (obj2 != null) {
                return m2922c(obj2);
            }
            C1262f c1262f = this.f5134c;
            C1262f c1262f2 = C1262f.f5125c;
            if (c1262f != c1262f2) {
                C1262f c1262f3 = new C1262f();
                do {
                    AbstractC0364l abstractC0364l = f5130f;
                    abstractC0364l.mo1024Y(c1262f3, c1262f);
                    if (abstractC0364l.mo1030n(this, c1262f, c1262f3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f5132a;
                            } else {
                                m2925e(c1262f3);
                                throw new InterruptedException();
                            }
                        } while (obj == null);
                        return m2922c(obj);
                    }
                    c1262f = this.f5134c;
                } while (c1262f != c1262f2);
            }
            return m2922c(this.f5132a);
        }
        throw new InterruptedException();
    }
}
