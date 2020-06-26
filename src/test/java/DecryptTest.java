import models.Decrypt;
import org.junit.Test;

import static org.junit.Assert.*;

public class DecryptTest {
    @Test
    public void Decrypt_InstantiatesCorrectly_String() {
        Decrypt word =new Decrypt("word",1,"xpse");
        assertEquals(true,word instanceof Decrypt);

    }
    @Test
    public  void  Decrypt_getsPlainText_String(){
        Decrypt word =new Decrypt("word",1,"xpse");
        assertEquals("word",word.getText());
    }
    @Test
    public  void  Decrypt_getsShiftKey_Integer(){
        Decrypt word =new Decrypt("word",1,"xpse");
        assertEquals(1,word.getShiftKey());
    }
    @Test
    public  void Decrypt_getsEncryptedText_String(){
        Decrypt word =new Decrypt("word",1,"xpse");
        assertEquals("xpse",word.getDecryptedText());
    }



}