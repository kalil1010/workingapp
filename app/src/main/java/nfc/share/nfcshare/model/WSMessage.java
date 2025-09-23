package nfc.share.nfcshare.model;

/* loaded from: classes.dex */
public class WSMessage {
    private String from;
    private int maxUsers;
    private String message;
    private String room;
    private String text;
    private String type;

    public WSMessage(String str, String str2, String str3, String str4, int i2) {
        this.type = str;
        this.room = str2;
        this.text = str3;
        this.from = str4;
        this.maxUsers = i2;
    }

    public String getFrom() {
        return this.from;
    }

    public int getMaxUsers() {
        return this.maxUsers;
    }

    public String getMessage() {
        return this.message;
    }

    public String getRoom() {
        return this.room;
    }

    public String getText() {
        return this.text;
    }

    public String getType() {
        return this.type;
    }

    public void setFrom(String str) {
        this.from = str;
    }

    public void setMaxUsers(int i2) {
        this.maxUsers = i2;
    }

    public void setMessage(String str) {
        this.message = str;
    }

    public void setRoom(String str) {
        this.room = str;
    }

    public void setText(String str) {
        this.text = str;
    }

    public void setType(String str) {
        this.type = str;
    }

    public WSMessage(String str, String str2) {
        this.type = str;
        this.message = str2;
    }
}
