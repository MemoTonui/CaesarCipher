import models.Decrypt;
import org.junit.Test;

import static org.junit.Assert.*;

public class DecryptTest {
    @Test
    public void Decrypt_InstantiatesCorrectly_String() {
        Decrypt word =new Decrypt("word",1);
        assertEquals(true,word instanceof Decrypt);

    }
    @Test
    public  void  Decrypt_getsPlainText_String(){
        Decrypt word =new Decrypt("word",1);
        assertEquals("word",word.getText());
    }
    @Test
    public  void  Decrypt_getsShiftKey_Integer(){
        Decrypt word =new Decrypt("word",1);
        assertEquals(1,word.getShiftKey());
    }




}