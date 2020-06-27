import models.Decrypt;
import models.Encrypt;

import java.io.Console;

import static java.lang.Integer.parseInt;

class CaesarCipher {
    public static void main (String args []){

        Console myConsole = System.console();
        int choice1 =1;
        int choice2 =2;
        System.out.println("Choose an action:");
        System.out.println("1.Encrypt");
        System.out.println("2.Decrypt");
        int choice =parseInt(myConsole.readLine());
        if(choice ==choice1) {
            System.out.println("------------------------------");
            System.out.println("ENCRYPTION");
            System.out.println("------------------------------");

            System.out.println("Enter a word:");
            String enteredWord = myConsole.readLine();


            System.out.println("Enter a number between 1 and 26:");
            Integer shiftKey = parseInt(myConsole.readLine());
            Encrypt word = new Encrypt(enteredWord, shiftKey);

            System.out.println("The Encrypted word is :" + Encrypt.encryptWord(enteredWord, shiftKey));
        }
        else if(choice == choice2) {
            System.out.println("------------------------------");
            System.out.println("DECRYPTION");
            System.out.println("------------------------------");
            System.out.println("Enter word to Decrypt: ");
            String enteredWordToDecrypt = myConsole.readLine();

            System.out.println("Enter a number between 1 and 26:");
            Integer shiftKey2 = parseInt(myConsole.readLine());
            Decrypt word2 = new Decrypt(enteredWordToDecrypt, shiftKey2);

            System.out.println("The Decrypted word is :" + Decrypt.decryptWord(enteredWordToDecrypt, shiftKey2));

        }
        else {
            System.out.println("Invalid choice");

        }






    }


}