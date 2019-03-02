package FIl.GameCharacter;
import FIl.GameCharacter.*;
import FIl.Room.*;
import FIl.Items.*;
import FIl.Actions.*;
import static org.junit.Assert.*;
import org.junit.Test;
import java.util.*;
import java.io.InputStream;
import java.io.ByteArrayInputStream;
public class MonstreTest extends GameCharacterTest{
     @Test
     public void testMonstre(){
     Monstre m=new Monstre("m1",50,40,40);
     assertNotNull(m);   
     }
}
