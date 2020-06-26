package models;

public class Decrypt {


    private String text;
    private int shiftKey;
    private String decryptedText;

    public Decrypt(String text, int shiftKey, String decryptedText) {
        this.text = text;
        this.shiftKey = shiftKey;
        this.decryptedText = decryptedText;
    }

    public String getText() {
        return this.text;
    }

    public int getShiftKey() {
        return this.shiftKey;
    }

    public String getDecryptedText() {
        return this.decryptedText;
    }


}
