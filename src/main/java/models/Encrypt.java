package models;

import java.util.Arrays;
public class Encrypt {


    private String text;
    private int shiftKey;

    public Encrypt(String text, int shiftKey, String encryptedText){
            this.text = text;
            this.shiftKey=shiftKey;


    }
    public String getText(){
        return this.text;
    }
    public int getShiftKey(){
        return  this.shiftKey;
    }


}
