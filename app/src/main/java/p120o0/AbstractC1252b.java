package p120o0;

import java.lang.reflect.Field;
import java.util.LinkedHashMap;
import p123p0.C1266b;

/* renamed from: o0.b */
/* loaded from: classes.dex */
public abstract class AbstractC1252b {

    /* renamed from: A */
    public static final C1266b f5065A;

    /* renamed from: B */
    public static final C1266b f5066B;

    /* renamed from: C */
    public static final C1266b f5067C;

    /* renamed from: D */
    public static final C1266b f5068D;

    /* renamed from: E */
    public static final C1266b f5069E;

    /* renamed from: F */
    public static final C1266b f5070F;

    /* renamed from: G */
    public static final C1266b f5071G;

    /* renamed from: H */
    public static final C1266b f5072H;

    /* renamed from: I */
    public static final C1266b f5073I;

    /* renamed from: J */
    public static final C1266b f5074J;

    /* renamed from: K */
    public static final C1266b f5075K;

    /* renamed from: L */
    public static final C1266b f5076L;

    /* renamed from: a */
    public static final LinkedHashMap f5077a = new LinkedHashMap();

    /* renamed from: b */
    public static final C1266b f5078b;

    /* renamed from: c */
    public static final C1266b f5079c;

    /* renamed from: d */
    public static final C1266b f5080d;

    /* renamed from: e */
    public static final C1266b f5081e;

    /* renamed from: f */
    public static final C1266b f5082f;

    /* renamed from: g */
    public static final C1266b f5083g;

    /* renamed from: h */
    public static final C1266b f5084h;

    /* renamed from: i */
    public static final C1266b f5085i;

    /* renamed from: j */
    public static final C1266b f5086j;

    /* renamed from: k */
    public static final C1266b f5087k;

    /* renamed from: l */
    public static final C1266b f5088l;

    /* renamed from: m */
    public static final C1266b f5089m;

    /* renamed from: n */
    public static final C1266b f5090n;

    /* renamed from: o */
    public static final C1266b f5091o;

    /* renamed from: p */
    public static final C1266b f5092p;

    /* renamed from: q */
    public static final C1266b f5093q;

    /* renamed from: r */
    public static final C1266b f5094r;

    /* renamed from: s */
    public static final C1266b f5095s;

    /* renamed from: t */
    public static final C1266b f5096t;

    /* renamed from: u */
    public static final C1266b f5097u;

    /* renamed from: v */
    public static final C1266b f5098v;

    /* renamed from: w */
    public static final C1266b f5099w;

    /* renamed from: x */
    public static final C1266b f5100x;

    /* renamed from: y */
    public static final C1266b f5101y;

    /* renamed from: z */
    public static final C1266b f5102z;

    static {
        new C1266b("06", 1, "Object Identifier (OID)");
        new C1266b("41", 2, "Country Code");
        new C1266b("42", 2, "Issuer Identification Number (IIN)");
        f5078b = new C1266b("4f", 1, "Application Identifier (AID) - card");
        f5079c = new C1266b("50", 3, "Application Label");
        new C1266b("51", 1, "File reference data element");
        new C1266b("52", 1, "Command APDU");
        new C1266b("53", 1, "Discretionary data (or template)");
        f5080d = new C1266b("61", 1, "Application Template");
        new C1266b("6f", 1, "File Control Information (FCI) Template");
        new C1266b("73", 1, "Directory Discretionary Template");
        f5081e = new C1266b("84", 1, "Dedicated File (DF) Name");
        f5082f = new C1266b("88", 1, "Short File Identifier (SFI)");
        new C1266b("a5", 1, "File Control Information (FCI) Proprietary Template");
        new C1266b("5f50", 3, "Issuer URL");
        f5083g = new C1266b("57", 1, "Track 2 Equivalent Data");
        new C1266b("5a", 2, "Application Primary Account Number (PAN)");
        new C1266b("70", 1, "Record Template (EMV Proprietary)");
        new C1266b("71", 1, "Issuer Script Template 1");
        new C1266b("72", 1, "Issuer Script Template 2");
        new C1266b("77", 1, "Response Message Template Format 2");
        f5084h = new C1266b("80", 1, "Response Message Template Format 1");
        new C1266b("81", 1, "Amount, Authorised (Binary)");
        new C1266b("82", 1, "Application Interchange Profile");
        f5085i = new C1266b("83", 1, "Command Template");
        new C1266b("86", 1, "Issuer Script Command");
        f5086j = new C1266b("87", 1, "Application Priority Indicator");
        new C1266b("89", 1, "Authorisation Code");
        new C1266b("8a", 3, "Authorisation Response Code");
        new C1266b("8c", 5, "Card Risk Management Data Object List 1 (CDOL1)");
        new C1266b("8d", 5, "Card Risk Management Data Object List 2 (CDOL2)");
        new C1266b("8e", 1, "Cardholder Verification Method (CVM) List");
        new C1266b("8f", 1, "Certification Authority Public Key Index - card");
        new C1266b("90", 1, "Issuer Public Key Certificate");
        new C1266b("91", 1, "Issuer Authentication Data");
        new C1266b("92", 1, "Issuer Public Key Remainder");
        new C1266b("93", 1, "Signed Static Application Data");
        f5087k = new C1266b("94", 1, "Application File Locator (AFL)");
        new C1266b("95", 1, "Terminal Verification Results (TVR)");
        new C1266b("97", 1, "Transaction Certificate Data Object List (TDOL)");
        new C1266b("98", 1, "Transaction Certificate (TC) Hash Value");
        new C1266b("99", 1, "Transaction Personal Identification Number (PIN) Data");
        f5088l = new C1266b("9a", 2, "Transaction Date");
        new C1266b("9b", 1, "Transaction Status Information");
        f5089m = new C1266b("9c", 2, "Transaction Type");
        new C1266b("9d", 1, "Directory Definition File (DDF) Name");
        f5090n = new C1266b("5f20", 3, "Cardholder Name");
        new C1266b("5f24", 2, "Application Expiration Date");
        new C1266b("5f25", 2, "Application Effective Date");
        new C1266b("5f28", 2, "Issuer Country Code");
        f5091o = new C1266b("5f2a", 3, "Transaction Currency Code");
        new C1266b("5f2d", 3, "Language Preference");
        new C1266b("5f30", 2, "Service Code");
        new C1266b("5f34", 2, "Application Primary Account Number (PAN) Sequence Number");
        new C1266b("5f36", 2, "Transaction Currency Exponent");
        f5092p = new C1266b("5f53", 1, "International Bank Account Number (IBAN)");
        f5093q = new C1266b("5f54", 4, "Bank Identifier Code (BIC)");
        new C1266b("5f55", 3, "Issuer Country Code (alpha2 format)");
        new C1266b("5f56", 3, "Issuer Country Code (alpha3 format)");
        new C1266b("9f01", 2, "Acquirer Identifier");
        f5094r = new C1266b("9f02", 2, "Amount, Authorised (Numeric)");
        new C1266b("9f03", 2, "Amount, Other (Numeric)");
        new C1266b("9f04", 2, "Amount, Other (Binary)");
        new C1266b("9f05", 1, "Application Discretionary Data");
        new C1266b("9f06", 1, "Application Identifier (AID) - terminal");
        new C1266b("9f07", 1, "Application Usage Control");
        new C1266b("9f08", 1, "Application Version Number - card");
        new C1266b("9f09", 1, "Application Version Number - terminal");
        new C1266b("9f0b", 3, "Cardholder Name Extended");
        new C1266b("9f0d", 1, "Issuer Action Code - Default");
        new C1266b("9f0e", 1, "Issuer Action Code - Denial");
        new C1266b("9f0f", 1, "Issuer Action Code - Online");
        new C1266b("9f10", 1, "Issuer Application Data");
        new C1266b("9f11", 2, "Issuer Code Table Index");
        f5095s = new C1266b("9f12", 3, "Application Preferred Name");
        new C1266b("9f13", 1, "Last Online Application Transaction Counter (ATC) Register");
        new C1266b("9f14", 1, "Lower Consecutive Offline Limit");
        new C1266b("9f15", 2, "Merchant Category Code");
        new C1266b("9f16", 3, "Merchant Identifier");
        f5096t = new C1266b("9f17", 1, "Personal Identification Number (PIN) Try Counter");
        new C1266b("9f18", 1, "Issuer Script Identifier");
        f5097u = new C1266b("9f1a", 3, "Terminal Country Code");
        new C1266b("9f1b", 1, "Terminal Floor Limit");
        new C1266b("9f1c", 3, "Terminal Identification");
        new C1266b("9f1d", 1, "Terminal Risk Management Data");
        new C1266b("9f1e", 3, "Interface Device (IFD) Serial Number");
        new C1266b("9f1f", 3, "[Magnetic Stripe] Track 1 Discretionary Data");
        new C1266b("9f20", 3, "[Magnetic Stripe] Track 2 Discretionary Data");
        new C1266b("9f21", 2, "Transaction Time (HHMMSS)");
        new C1266b("9f22", 1, "Certification Authority Public Key Index - Terminal");
        new C1266b("9f23", 1, "Upper Consecutive Offline Limit");
        new C1266b("9f26", 1, "Application Cryptogram");
        new C1266b("9f27", 1, "Cryptogram Information Data");
        new C1266b("9f2d", 1, "ICC PIN Encipherment Public Key Certificate");
        new C1266b("9f2e", 1, "ICC PIN Encipherment Public Key Exponent");
        new C1266b("9f2f", 1, "ICC PIN Encipherment Public Key Remainder");
        new C1266b("9f32", 1, "Issuer Public Key Exponent");
        f5098v = new C1266b("9f33", 1, "Terminal Capabilities");
        new C1266b("9f34", 1, "Cardholder Verification (CVM) Results");
        f5099w = new C1266b("9f35", 2, "Terminal Type");
        f5100x = new C1266b("9f36", 1, "Application Transaction Counter (ATC)");
        f5101y = new C1266b("9f37", 1, "Unpredictable Number");
        f5102z = new C1266b("9f38", 5, "Processing Options Data Object List (PDOL)");
        new C1266b("9f39", 2, "Point-of-Service (POS) Entry Mode");
        new C1266b("9f3a", 1, "Amount, Reference Currency");
        new C1266b("9f3b", 2, "Application Reference Currency");
        new C1266b("9f3c", 2, "Transaction Reference Currency Code");
        new C1266b("9f3d", 2, "Transaction Reference Currency Exponent");
        f5065A = new C1266b("9f40", 1, "Additional Terminal Capabilities");
        new C1266b("9f41", 2, "Transaction Sequence Counter");
        new C1266b("9f42", 2, "Application Currency Code");
        new C1266b("9f43", 2, "Application Reference Currency Exponent");
        new C1266b("9f44", 2, "Application Currency Exponent");
        new C1266b("9f45", 1, "Data Authentication Code");
        new C1266b("9f46", 1, "ICC Public Key Certificate");
        new C1266b("9f47", 1, "ICC Public Key Exponent");
        new C1266b("9f48", 1, "ICC Public Key Remainder");
        new C1266b("9f49", 5, "Dynamic Data Authentication Data Object List (DDOL)");
        new C1266b("9f4a", 1, "Static Data Authentication Tag List");
        new C1266b("9f4b", 1, "Signed Dynamic Application Data");
        new C1266b("9f4c", 1, "ICC Dynamic Number");
        f5066B = new C1266b("9f4d", 1, "Log Entry");
        new C1266b("9f4e", 3, "Merchant Name and Location");
        f5067C = new C1266b("9f4f", 5, "Log Format");
        new C1266b("bf0c", 1, "File Control Information (FCI) Issuer Discretionary Data");
        f5068D = new C1266b("df60", 1, "VISA Log Entry");
        f5069E = new C1266b("56", 1, "Track 1 Data");
        f5070F = new C1266b("9f66", 1, "Terminal Transaction Qualifiers");
        f5071G = new C1266b("9f6b", 1, "Track 2 Data");
        new C1266b("9f6e", 1, "Visa Low-Value Payment (VLP) Issuer Authorisation Code");
        new C1266b("9f29", 1, "Indicates the card's preference for the kernel on which the contactless application can be processed");
        f5072H = new C1266b("9f2a", 1, "The value to be appended to the ADF Name in the data field of the SELECT command, if the Extended Selection Support flag is present and set to 1");
        new C1266b("9f52", 1, "Upper Cumulative Domestic Offline Transaction Amount");
        new C1266b("9f56", 1, "?");
        new C1266b("9f6c", 1, "Mag Stripe Application Version Number (Card)");
        new C1266b("df3e", 1, "?");
        new C1266b("9f50", 1, "Offline Accumulator Balance");
        new C1266b("9f51", 1, "DRDOL");
        new C1266b("9f53", 1, "Transaction Category Code");
        new C1266b("9f54", 1, "DS ODS Card");
        new C1266b("9f55", 1, "Mobile Support Indicator");
        f5073I = new C1266b("9f58", 1, "Merchant Type Indicator (Interac)");
        f5074J = new C1266b("9f59", 1, "Terminal Transaction Information (Interac)");
        f5075K = new C1266b("9f5A", 1, "Terminal transaction Type (Interac)");
        new C1266b("9f5b", 1, "DSDOL");
        f5076L = new C1266b("9f5c", 1, "DS Requested Operator ID");
        new C1266b("9f5d", 1, "Application Capabilities Information");
        new C1266b("9f5e", 1, "Data Storage Identifier");
        new C1266b("9f5f", 1, "DS Slot Availability");
        new C1266b("9f60", 1, "CVC3 (Track1)");
        new C1266b("9f61", 1, "CVC3 (Track2)");
        new C1266b("9f62", 1, "Track 1 bit map for CVC3");
        new C1266b("9f63", 1, "Track 1 bit map for UN and ATC");
        new C1266b("9f64", 1, "Track 1 number of ATC digits");
        new C1266b("9f65", 1, "Track 2 bit map for CVC3");
        new C1266b("9f67", 1, "Track 2 number of ATC digits");
        new C1266b("9f69", 1, "UDOL");
        new C1266b("9f6a", 1, "Unpredictable Number (Numeric)");
        new C1266b("9f6d", 1, "Mag-stripe Application Version Number (Reader)");
        new C1266b("9f6f", 1, "DS Slot Management Control");
        new C1266b("9f70", 1, "Protected Data Envelope 1");
        new C1266b("9f71", 1, "Protected Data Envelope 2");
        new C1266b("9f72", 1, "Protected Data Envelope 3");
        new C1266b("9f73", 1, "Protected Data Envelope 4");
        new C1266b("9f74", 1, "Protected Data Envelope 5");
        new C1266b("9f75", 1, "Unprotected Data Envelope 1");
        new C1266b("9f76", 1, "Unprotected Data Envelope 2");
        new C1266b("9f77", 1, "Unprotected Data Envelope 3");
        new C1266b("9f78", 1, "Unprotected Data Envelope 4");
        new C1266b("9f79", 1, "Unprotected Data Envelope 5");
        new C1266b("9f7c", 1, "Merchant Custom Data");
        new C1266b("9f7d", 1, "DS Summary 1");
        new C1266b("9f7f", 1, "DS Unpredictable Number");
        new C1266b("df4b", 1, "POS Cardholder Interaction Information");
        new C1266b("df61", 1, "DS Digest H");
        new C1266b("df62", 1, "DS ODS Info");
        new C1266b("df63", 1, "DS ODS Term");
        new C1266b("df8104", 1, "Balance Read Before Gen AC");
        new C1266b("df8105", 1, "Balance Read After Gen AC");
        new C1266b("df8106", 1, "Data Needed");
        new C1266b("df8107", 1, "CDOL1 Related Data");
        new C1266b("df8108", 1, "DS AC Type");
        new C1266b("df8109", 1, "DS Input (Term)");
        new C1266b("df810a", 1, "DS ODS Info For Reader");
        new C1266b("df810b", 1, "DS Summary Status");
        new C1266b("df810c", 1, "Kernel ID");
        new C1266b("df810d", 1, "DSVN Term");
        new C1266b("df810e", 1, "Post-Gen AC Put Data Status");
        new C1266b("df810f", 1, "Pre-Gen AC Put Data Status");
        new C1266b("df8110", 1, "Proceed To First Write Flag");
        new C1266b("df8111", 1, "PDOL Related Data");
        new C1266b("df8112", 1, "Tags To Read");
        new C1266b("df8113", 1, "DRDOL Related Data");
        new C1266b("df8114", 1, "Reference Control Parameter");
        new C1266b("df8115", 1, "Error Indication");
        new C1266b("df8116", 1, "User Interface Request Data");
        new C1266b("df8117", 1, "Card Data Input Capability");
        new C1266b("df8118", 1, "CVM Capability - CVM Required");
        new C1266b("df8119", 1, "CVM Capability - No CVM Required");
        new C1266b("df811a", 1, "Default UDOL");
        new C1266b("df811b", 1, "Kernel Configuration");
        new C1266b("df811c", 1, "Max Lifetime of Torn Transaction Log Record");
        new C1266b("df811d", 1, "Max Number of Torn Transaction Log Records");
        new C1266b("df811e", 1, "Mag-stripe CVM Capability – CVM Required");
        new C1266b("df811f", 1, "Security Capability");
        new C1266b("df8120", 1, "Terminal Action Code – Default");
        new C1266b("df8121", 1, "Terminal Action Code – Denial");
        new C1266b("df8122", 1, "Terminal Action Code – Online");
        new C1266b("df8123", 1, "Reader Contactless Floor Limit");
        new C1266b("df8124", 1, "Reader Contactless Transaction Limit (No On-device CVM)");
        new C1266b("df8125", 1, "Reader Contactless Transaction Limit (On-device CVM)");
        new C1266b("df8126", 1, "Reader CVM Required Limit");
        new C1266b("df8127", 1, "TIME_OUT_VALUE");
        new C1266b("df8128", 1, "IDS Status");
        new C1266b("df8129", 1, "Outcome Parameter Set");
        new C1266b("df812a", 1, "DD Card (Track1)");
        new C1266b("df812b", 1, "DD Card (Track2)");
        new C1266b("df812c", 1, "Mag-stripe CVM Capability – No CVM Required");
        new C1266b("df812d", 1, "Message Hold Time");
        new C1266b("ff8101", 1, "Torn Record");
        new C1266b("ff8102", 1, "Tags To Write Before Gen AC");
        new C1266b("ff8103", 1, "Tags To Write After Gen AC");
        new C1266b("ff8104", 1, "Data To Send");
        new C1266b("ff8105", 1, "Data Record");
        new C1266b("ff8106", 1, "Discretionary Data");
        for (Field field : AbstractC1252b.class.getFields()) {
            if (field.getType() == C1266b.class) {
                try {
                    C1266b c1266b = (C1266b) field.get(null);
                    byte[] bArr = c1266b.f5136a;
                    bArr.getClass();
                    C1251a c1251a = new C1251a(bArr);
                    LinkedHashMap linkedHashMap = f5077a;
                    if (linkedHashMap.containsKey(c1251a)) {
                        throw new IllegalArgumentException("Tag already added " + c1266b);
                    }
                    linkedHashMap.put(c1251a, c1266b);
                } catch (IllegalAccessException e3) {
                    throw new RuntimeException(e3);
                }
            }
        }
    }
}
