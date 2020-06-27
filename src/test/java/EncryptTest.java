import models.Encrypt;
import org.junit.Test;

import static org.junit.Assert.*;

public class EncryptTest {
    @Test
    public void Encrypt_InstantiatesCorrectly_String() {
        Encrypt word =new Encrypt("word",1);
        assertEquals(true,word instanceof Encrypt);

    }
    @Test
    public  void  Encrypt_getsPlainText_String(){
        Encrypt word =new Encrypt("word",1);
        assertEquals("word",word.getText());
    }
    @Test
    public  void  Encrypt_getsShiftKey_Integer(){
        Encrypt word =new Encrypt("word",1);
        assertEquals(1,word.getShiftKey());
    }

    @Test
    public void  Encrypt_EncryptsAWord_String(){
        Encrypt word =new Encrypt("word",1);
        String expectedOutput ="xpse";
        assertEquals(expectedOutput,word.encryptWord());
    }





}