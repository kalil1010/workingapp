package p115m0;

import p093e2.AbstractC0901d;

/* renamed from: m0.b */
/* loaded from: classes.dex */
public enum EnumC1231b {
    f4944c("61", "Command successfully executed; 'XX' bytes of data are available and can be requested using GET RESPONSE"),
    /* JADX INFO: Fake field, exist only in values array */
    EF2("6200", "No information given (NV-Ram not changed)"),
    /* JADX INFO: Fake field, exist only in values array */
    EF3("6201", "NV-Ram not changed 1"),
    /* JADX INFO: Fake field, exist only in values array */
    EF4("6281", "Part of returned data may be corrupted"),
    /* JADX INFO: Fake field, exist only in values array */
    EF0("6282", "End of file/record reached before reading Le bytes"),
    /* JADX INFO: Fake field, exist only in values array */
    EF6("6283", "Selected file invalidated"),
    /* JADX INFO: Fake field, exist only in values array */
    EF7("6284", "Selected file is not valid. FCI not formated according to ISO"),
    f4945d("6285", "Selected file is in termination state"),
    /* JADX INFO: Fake field, exist only in values array */
    EF9("62A2", "Wrong R-MAC"),
    /* JADX INFO: Fake field, exist only in values array */
    EF10("62A4", "Card locked (during reset( ))"),
    /* JADX INFO: Fake field, exist only in values array */
    EF11("62F1", "Wrong C-MAC"),
    /* JADX INFO: Fake field, exist only in values array */
    EF12("62F3", "Internal reset"),
    /* JADX INFO: Fake field, exist only in values array */
    EF13("62F5", "Default agent locked"),
    /* JADX INFO: Fake field, exist only in values array */
    EF14("62F7", "Cardholder locked"),
    /* JADX INFO: Fake field, exist only in values array */
    EF15("62F8", "Basement is current agent"),
    /* JADX INFO: Fake field, exist only in values array */
    EF0("62F9", "CALC Key Set not unblocked"),
    /* JADX INFO: Fake field, exist only in values array */
    EF1("62", "RFU"),
    /* JADX INFO: Fake field, exist only in values array */
    EF2("6300", "No information given (NV-Ram changed)"),
    /* JADX INFO: Fake field, exist only in values array */
    EF1("6381", "File filled up by the last write. Loading/updating is not allowed"),
    /* JADX INFO: Fake field, exist only in values array */
    EF2("6382", "Card key not supported"),
    /* JADX INFO: Fake field, exist only in values array */
    EF1("6383", "Reader key not supported"),
    /* JADX INFO: Fake field, exist only in values array */
    EF2("6384", "Plaintext transmission not supported"),
    /* JADX INFO: Fake field, exist only in values array */
    EF1("6385", "Secured transmission not supported"),
    /* JADX INFO: Fake field, exist only in values array */
    EF2("6386", "Volatile memory is not available"),
    /* JADX INFO: Fake field, exist only in values array */
    EF1("6387", "Non-volatile memory is not available"),
    /* JADX INFO: Fake field, exist only in values array */
    EF2("6388", "Key number not valid"),
    /* JADX INFO: Fake field, exist only in values array */
    EF1("6389", "Key length is not correct"),
    /* JADX INFO: Fake field, exist only in values array */
    EF2("63C0", "Verify fail, no try left"),
    /* JADX INFO: Fake field, exist only in values array */
    EF1("63C1", "Verify fail, 1 try left"),
    /* JADX INFO: Fake field, exist only in values array */
    EF2("63C2", "Verify fail, 2 tries left"),
    /* JADX INFO: Fake field, exist only in values array */
    EF1("63C3", "Verify fail, 3 tries left"),
    /* JADX INFO: Fake field, exist only in values array */
    EF2("63", "RFU"),
    /* JADX INFO: Fake field, exist only in values array */
    EF3("6400", "No information given (NV-Ram not changed)"),
    /* JADX INFO: Fake field, exist only in values array */
    EF1("6401", "Command timeout"),
    /* JADX INFO: Fake field, exist only in values array */
    EF2("64", "RFU"),
    /* JADX INFO: Fake field, exist only in values array */
    EF4("6500", "No information given"),
    /* JADX INFO: Fake field, exist only in values array */
    EF1("6501", "Write error. Memory failure. There have been problems in writing or reading the EEPROM. Other hardware problems may also bring this error"),
    /* JADX INFO: Fake field, exist only in values array */
    EF2("6581", "Memory failure"),
    /* JADX INFO: Fake field, exist only in values array */
    EF1("65", "RFU"),
    /* JADX INFO: Fake field, exist only in values array */
    EF3("6669", "Incorrect Encryption/Decryption Padding"),
    /* JADX INFO: Fake field, exist only in values array */
    EF1("66", "-"),
    /* JADX INFO: Fake field, exist only in values array */
    EF2("6700", "Wrong length"),
    /* JADX INFO: Fake field, exist only in values array */
    EF1("67", "length incorrect (procedure)(ISO 7816-3)"),
    /* JADX INFO: Fake field, exist only in values array */
    EF2("6800", "No information given (The request function is not supported by the card)"),
    /* JADX INFO: Fake field, exist only in values array */
    EF1("6881", "Logical channel not supported"),
    /* JADX INFO: Fake field, exist only in values array */
    EF2("6882", "Secure messaging not supported"),
    /* JADX INFO: Fake field, exist only in values array */
    EF1("6883", "Last command of the chain expected"),
    /* JADX INFO: Fake field, exist only in values array */
    EF2("6884", "Command chaining not supported"),
    /* JADX INFO: Fake field, exist only in values array */
    EF1("68", "RFU"),
    /* JADX INFO: Fake field, exist only in values array */
    EF3("6900", "No information given (Command not allowed)"),
    /* JADX INFO: Fake field, exist only in values array */
    EF1("6981", "Command incompatible with file structure"),
    /* JADX INFO: Fake field, exist only in values array */
    EF2("6982", "Security condition not satisfied"),
    /* JADX INFO: Fake field, exist only in values array */
    EF1("6983", "Authentication method blocked"),
    /* JADX INFO: Fake field, exist only in values array */
    EF2("6984", "Referenced data reversibly blocked (invalidated)"),
    /* JADX INFO: Fake field, exist only in values array */
    EF1("6985", "Conditions of use not satisfied"),
    /* JADX INFO: Fake field, exist only in values array */
    EF2("6986", "Command not allowed (no current EF)"),
    /* JADX INFO: Fake field, exist only in values array */
    EF1("6987", "Expected secure messaging (SM) object missing"),
    /* JADX INFO: Fake field, exist only in values array */
    EF2("6988", "Incorrect secure messaging (SM) data object"),
    /* JADX INFO: Fake field, exist only in values array */
    EF1("6996", "Data must be updated again"),
    /* JADX INFO: Fake field, exist only in values array */
    EF2("69F0", "Permission Denied"),
    /* JADX INFO: Fake field, exist only in values array */
    EF1("69F1", "Permission Denied - Missing Privilege"),
    /* JADX INFO: Fake field, exist only in values array */
    EF2("69", "RFU"),
    /* JADX INFO: Fake field, exist only in values array */
    EF3("6A00", "No information given (Bytes P1 and/or P2 are incorrect)"),
    /* JADX INFO: Fake field, exist only in values array */
    EF1("6A80", "The parameters in the data field are incorrect"),
    /* JADX INFO: Fake field, exist only in values array */
    EF2("6A81", "Function not supported"),
    /* JADX INFO: Fake field, exist only in values array */
    EF1("6A82", "File not found"),
    /* JADX INFO: Fake field, exist only in values array */
    EF2("6A83", "Record not found"),
    /* JADX INFO: Fake field, exist only in values array */
    EF1("6A84", "There is insufficient memory space in record or file"),
    /* JADX INFO: Fake field, exist only in values array */
    EF2("6A85", "Lc inconsistent with TLV structure"),
    /* JADX INFO: Fake field, exist only in values array */
    EF1("6A86", "Incorrect P1 or P2 parameter"),
    /* JADX INFO: Fake field, exist only in values array */
    EF2("6A87", "Lc inconsistent with P1-P2"),
    /* JADX INFO: Fake field, exist only in values array */
    EF1("6A88", "Referenced data not found"),
    /* JADX INFO: Fake field, exist only in values array */
    EF2("6A89", "File already exists"),
    /* JADX INFO: Fake field, exist only in values array */
    EF1("6A8A", "DF name already exists"),
    /* JADX INFO: Fake field, exist only in values array */
    EF2("6AF0", "Wrong parameter value"),
    /* JADX INFO: Fake field, exist only in values array */
    EF1("6A", "RFU"),
    /* JADX INFO: Fake field, exist only in values array */
    EF0("6B00", "Wrong parameter(s) P1-P2"),
    /* JADX INFO: Fake field, exist only in values array */
    EF1("6B", "Reference incorrect (procedure byte), (ISO 78163)"),
    /* JADX INFO: Fake field, exist only in values array */
    EF0("6C00", "Incorrect P3 length"),
    f4946e("6C", "xx = exact Le"),
    /* JADX INFO: Fake field, exist only in values array */
    EF0("6D00", "Instruction code not supported or invalid"),
    /* JADX INFO: Fake field, exist only in values array */
    EF1("6D", "Instruction code not programmed or invalid (procedure byte), (ISO 7816-3)"),
    /* JADX INFO: Fake field, exist only in values array */
    EF0("6E00", "Class not supported"),
    /* JADX INFO: Fake field, exist only in values array */
    EF1("6E", "Instruction class not supported (procedure byte), (ISO 7816-3)"),
    /* JADX INFO: Fake field, exist only in values array */
    EF0("6F00", "Command aborted - more exact diagnosis not possible (e.g., operating system error)"),
    /* JADX INFO: Fake field, exist only in values array */
    EF1("6FFF", "Card dead (overuse, …)"),
    /* JADX INFO: Fake field, exist only in values array */
    EF0("6F", "No precise diagnosis (procedure byte), (ISO 7816-3)"),
    f4947f("9000", "Command successfully executed (OK)"),
    /* JADX INFO: Fake field, exist only in values array */
    EF1294("9004", "PIN not succesfully verified, 3 or more PIN tries left"),
    /* JADX INFO: Fake field, exist only in values array */
    EF1311("9008", "Key/file not found"),
    /* JADX INFO: Fake field, exist only in values array */
    EF1326("9080", "Unblock Try Counter has reached zero"),
    /* JADX INFO: Fake field, exist only in values array */
    EF1341("9101", "States.activity, States.lock Status or States.lockable has wrong value"),
    /* JADX INFO: Fake field, exist only in values array */
    EF1356("9102", "Transaction number reached its limit"),
    /* JADX INFO: Fake field, exist only in values array */
    EF1371("9210", "No more storage available"),
    /* JADX INFO: Fake field, exist only in values array */
    EF1386("9301", "Integrity error"),
    /* JADX INFO: Fake field, exist only in values array */
    EF1401("9302", "Candidate S2 invalid"),
    /* JADX INFO: Fake field, exist only in values array */
    EF1416("9401", "Candidate currency code does not match purse currency"),
    /* JADX INFO: Fake field, exist only in values array */
    EF1431("9402", "Candidate amount too high"),
    /* JADX INFO: Fake field, exist only in values array */
    EF1446("9403", "Candidate amount too low"),
    /* JADX INFO: Fake field, exist only in values array */
    EF1461("9405", "Problems in the data field"),
    /* JADX INFO: Fake field, exist only in values array */
    EF1476("9407", "Bad currency : purse engine has no slot with R3bc currency"),
    /* JADX INFO: Fake field, exist only in values array */
    EF1491("9408", "R3bc currency not supported in purse engine"),
    /* JADX INFO: Fake field, exist only in values array */
    EF1506("9580", "Bad sequence"),
    /* JADX INFO: Fake field, exist only in values array */
    EF1521("9681", "Slave not found"),
    /* JADX INFO: Fake field, exist only in values array */
    EF1536("9700", "PIN blocked and Unblock Try Counter is 1 or 2"),
    /* JADX INFO: Fake field, exist only in values array */
    EF1551("9702", "Main keys are blocked"),
    /* JADX INFO: Fake field, exist only in values array */
    EF1562("9704", "PIN not succesfully verified, 3 or more PIN tries left"),
    /* JADX INFO: Fake field, exist only in values array */
    EF1577("9784", "Base key"),
    /* JADX INFO: Fake field, exist only in values array */
    EF1592("9785", "Limit exceeded - C-MAC key"),
    /* JADX INFO: Fake field, exist only in values array */
    EF1607("9786", "SM error - Limit exceeded - R-MAC key"),
    /* JADX INFO: Fake field, exist only in values array */
    EF1622("9787", "Limit exceeded - sequence counter"),
    /* JADX INFO: Fake field, exist only in values array */
    EF1637("9788", "Limit exceeded - R-MAC length"),
    /* JADX INFO: Fake field, exist only in values array */
    EF1652("9789", "Service not available"),
    /* JADX INFO: Fake field, exist only in values array */
    EF1667("9804", "Access conditions not satisfied"),
    /* JADX INFO: Fake field, exist only in values array */
    EF1682("9900", "1 PIN try left"),
    /* JADX INFO: Fake field, exist only in values array */
    EF1697("9904", "PIN not succesfully verified, 1 PIN try left"),
    /* JADX INFO: Fake field, exist only in values array */
    EF1712("9985", "Wrong status - Cardholder lock"),
    /* JADX INFO: Fake field, exist only in values array */
    EF1727("9986", "Missing privilege"),
    /* JADX INFO: Fake field, exist only in values array */
    EF1742("9987", "PIN is not installed"),
    /* JADX INFO: Fake field, exist only in values array */
    EF1757("9988", "Wrong status - R-MAC state"),
    /* JADX INFO: Fake field, exist only in values array */
    EF1772("9A00", "2 PIN try left"),
    /* JADX INFO: Fake field, exist only in values array */
    EF1787("9A04", "PIN not succesfully verified, 2 PIN try left"),
    /* JADX INFO: Fake field, exist only in values array */
    EF1802("9A71", "Wrong parameter value - Double agent AID"),
    /* JADX INFO: Fake field, exist only in values array */
    EF1817("9A72", "Wrong parameter value - Double agent Type"),
    /* JADX INFO: Fake field, exist only in values array */
    EF1832("9D05", "Incorrect certificate type"),
    /* JADX INFO: Fake field, exist only in values array */
    EF1847("9D07", "Incorrect session data size"),
    /* JADX INFO: Fake field, exist only in values array */
    EF1862("9D08", "Incorrect DIR file record size"),
    /* JADX INFO: Fake field, exist only in values array */
    EF1877("9D09", "Incorrect FCI record size"),
    /* JADX INFO: Fake field, exist only in values array */
    EF1892("9D0A", "Incorrect code size"),
    /* JADX INFO: Fake field, exist only in values array */
    EF1907("9D10", "Insufficient memory to load application"),
    /* JADX INFO: Fake field, exist only in values array */
    EF1922("9D11", "Invalid AID"),
    /* JADX INFO: Fake field, exist only in values array */
    EF1937("9D12", "Duplicate AID"),
    /* JADX INFO: Fake field, exist only in values array */
    EF1952("9D13", "Application previously loaded"),
    /* JADX INFO: Fake field, exist only in values array */
    EF1967("9D14", "Application history list full"),
    /* JADX INFO: Fake field, exist only in values array */
    EF1982("9D15", "Application not open"),
    /* JADX INFO: Fake field, exist only in values array */
    EF1997("9D17", "Invalid offset"),
    /* JADX INFO: Fake field, exist only in values array */
    EF2012("9D18", "Application already loaded"),
    /* JADX INFO: Fake field, exist only in values array */
    EF2027("9D19", "Invalid certificate"),
    /* JADX INFO: Fake field, exist only in values array */
    EF2042("9D1A", "Invalid signature"),
    /* JADX INFO: Fake field, exist only in values array */
    EF2057("9D1B", "Invalid KTU"),
    /* JADX INFO: Fake field, exist only in values array */
    EF2072("9D1D", "MSM controls not set"),
    /* JADX INFO: Fake field, exist only in values array */
    EF2087("9D1E", "Application signature does not exist"),
    /* JADX INFO: Fake field, exist only in values array */
    EF2102("9D1F", "KTU does not exist"),
    /* JADX INFO: Fake field, exist only in values array */
    EF2117("9D20", "Application not loaded"),
    /* JADX INFO: Fake field, exist only in values array */
    EF2132("9D21", "Invalid Open command data length"),
    /* JADX INFO: Fake field, exist only in values array */
    EF2147("9D30", "Check data parameter is incorrect (invalid start address)"),
    /* JADX INFO: Fake field, exist only in values array */
    EF2162("9D31", "Check data parameter is incorrect (invalid length)"),
    /* JADX INFO: Fake field, exist only in values array */
    EF2177("9D32", "Check data parameter is incorrect (illegal memory check area)"),
    /* JADX INFO: Fake field, exist only in values array */
    EF2192("9D40", "Invalid MSM Controls ciphertext"),
    /* JADX INFO: Fake field, exist only in values array */
    EF2207("9D41", "MSM controls already set"),
    /* JADX INFO: Fake field, exist only in values array */
    EF2222("9D42", "Set MSM Controls data length less than 2 bytes"),
    /* JADX INFO: Fake field, exist only in values array */
    EF2237("9D43", "Invalid MSM Controls data length"),
    /* JADX INFO: Fake field, exist only in values array */
    EF2252("9D44", "Excess MSM Controls ciphertext"),
    /* JADX INFO: Fake field, exist only in values array */
    EF2267("9D45", "Verification of MSM Controls data failed"),
    /* JADX INFO: Fake field, exist only in values array */
    EF2282("9D50", "Invalid MCD Issuer production ID"),
    /* JADX INFO: Fake field, exist only in values array */
    EF2297("9D51", "Invalid MCD Issuer ID"),
    /* JADX INFO: Fake field, exist only in values array */
    EF2312("9D52", "Invalid set MSM controls data date"),
    /* JADX INFO: Fake field, exist only in values array */
    EF2327("9D53", "Invalid MCD number"),
    /* JADX INFO: Fake field, exist only in values array */
    EF2342("9D54", "Reserved field error"),
    /* JADX INFO: Fake field, exist only in values array */
    EF2355("9D55", "Reserved field error"),
    /* JADX INFO: Fake field, exist only in values array */
    EF2368("9D56", "Reserved field error"),
    /* JADX INFO: Fake field, exist only in values array */
    EF2381("9D57", "Reserved field error"),
    /* JADX INFO: Fake field, exist only in values array */
    EF2396("9D60", "MAC verification failed"),
    /* JADX INFO: Fake field, exist only in values array */
    EF2411("9D61", "Maximum number of unblocks reached"),
    /* JADX INFO: Fake field, exist only in values array */
    EF2426("9D62", "Card was not blocked"),
    /* JADX INFO: Fake field, exist only in values array */
    EF2441("9D63", "Crypto functions not available"),
    /* JADX INFO: Fake field, exist only in values array */
    EF2456("9D64", "No application loaded"),
    /* JADX INFO: Fake field, exist only in values array */
    EF2471("9E00", "PIN not installed"),
    /* JADX INFO: Fake field, exist only in values array */
    EF2486("9E04", "PIN not succesfully verified, PIN not installed"),
    /* JADX INFO: Fake field, exist only in values array */
    EF2501("9F00", "PIN blocked and Unblock Try Counter is 3"),
    /* JADX INFO: Fake field, exist only in values array */
    EF2516("9F04", "PIN not succesfully verified, PIN blocked and Unblock Try Counter is 3");


    /* renamed from: a */
    public final byte[] f4949a;

    /* renamed from: b */
    public final String f4950b;

    EnumC1231b(String str, String str2) {
        this.f4949a = AbstractC0901d.m2314r(str);
        this.f4950b = str2;
    }
}
