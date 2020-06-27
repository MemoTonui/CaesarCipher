package models;

public class Decrypt {


    private String text;
    private int shiftKey;

    public Decrypt(String text, int shiftKey) {
        this.text = text;
        this.shiftKey = shiftKey;

    }

    public String getText() {
        return this.text;
    }

    public int getShiftKey() {
        return this.shiftKey;
    }
    public boolean ShiftKeyPositive() {
        return shiftKey>=1;
    }


    public static String decryptWord(String text, int shiftKey) {
        String decryptedText = "";
        for (int i = 0; i <= text.length()-1; i++) {
            char ch = text.charAt(i);
            if (Character.isLetter(ch)) {
                if (Character.isLowerCase(ch)) {
                    char aLetter = (char) (ch - shiftKey);
                    if (aLetter < 'a') {
                        decryptedText += (char) (ch + (26 - shiftKey));
                    } else {
                        decryptedText += aLetter;
                    }
                } else if (Character.isUpperCase(ch)) {
                    char aLetter = (char) (ch - shiftKey);
                    if (aLetter < 'A') {
                        decryptedText += (char) (ch + (26 - shiftKey));
                    } else {
                        decryptedText += aLetter;
                    }
                }
            }

        }
        return decryptedText;
    }



}
