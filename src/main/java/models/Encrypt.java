package models;

import java.util.Arrays;
public class Encrypt {


    private String text;
    private int shiftKey;
    private String encryptedText;

    public Encrypt(String text, int shiftKey, String encryptedText){
            this.text = text;
            this.shiftKey=shiftKey;
            this.encryptedText = encryptedText;
    }
    public String getText(){
        return this.text;
    }
    public int getShiftKey(){
        return  this.shiftKey;
    }
    public String getEncryptedText(){
        return this.encryptedText;
    }
     public String encryptWord() {
         for (int i = 0; i <= text.length(); i++) {
             char ch = text.charAt(i);
             if (Character.isLetter(ch)) {
                 if (Character.isLowerCase(ch)) {
                     char aLetter = (char) (ch + shiftKey);
                     if (aLetter > 'z') {
                         encryptedText += (char) (aLetter - (26 - shiftKey));
                     } else {
                         encryptedText += aLetter;
                     }
                 } else if (Character.isUpperCase(ch)) {
                     char aLetter = (char) (ch + shiftKey);
                     if (aLetter > 'Z') {
                         encryptedText += (char) (aLetter - (26 - shiftKey));
                     } else {
                         encryptedText += aLetter;
                     }
                 }
             }

         }
         return encryptedText;
     }

}