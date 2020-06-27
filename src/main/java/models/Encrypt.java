package models;

public class Encrypt {
    private static String text;
    private static int shiftKey;
    private static String encryptedText = "";


    public Encrypt(String text, int shiftKey){
            this.text = text;
            this.shiftKey=shiftKey;

    }



    public String getText(){
        return this.text;
    }
    public int getShiftKey(){
        return  this.shiftKey;
    }

    public static String encryptWord() {
        int lengthOfText = text.length();
         for (int i = 0; i <= lengthOfText-1; i++) {
            char ch = text.charAt(i);

             if (Character.isLetter(ch)) {
                 if (Character.isLowerCase(ch)) {
                     char aLetter = (char) (ch + shiftKey);
                     if (aLetter > 'z') {
                         encryptedText += (char) (ch - (26 - shiftKey));
                     } else {
                         encryptedText += aLetter;
                     }
                 } else if (Character.isUpperCase(ch)) {
                     char aLetter = (char) (ch + shiftKey);
                     if (aLetter > 'Z') {
                         encryptedText += (char) (ch - (26 - shiftKey));
                     } else {
                         encryptedText += aLetter;
                     }
                 }
                 else {
                     encryptedText += ch;
                 }
             }

         }
         return encryptedText;
     }

}