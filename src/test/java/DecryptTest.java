import models.Decrypt;
import models.Encrypt;
import org.junit.Test;

import static org.junit.Assert.*;

public class DecryptTest {
    @Test
    public void Decrypt_InstantiatesCorrectly_String() {
        Decrypt word =new Decrypt("xpse",1);
        assertEquals(true,word instanceof Decrypt);

    }
    @Test
    public  void  Decrypt_getsPlainText_String(){
        Decrypt word =new Decrypt("xpse",1);
        assertEquals("xpse",word.getText());
    }
    @Test
    public void Encrypt_ShiftKeyIsPositive_Boolean(){
        Decrypt word = new Decrypt("xpse",1);
        assertEquals(true,word.ShiftKeyPositive());
    }

    @Test
    public  void  Decrypt_getsShiftKey_Integer(){
        Decrypt word =new Decrypt("xpse",1);
        assertEquals(1,word.getShiftKey());
    }

    @Test
    public void  Decrypts_DecryptsAWord_String(){
        Decrypt word =new Decrypt("xpse",1);
        String expectedOutput ="word";
        assertEquals(expectedOutput,word.decryptWord("xpse",1));
    }




}