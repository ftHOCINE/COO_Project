package FIl.Items;
import FIl.GameCharacter.*;
import FIl.Room.*;
import FIl.Items.*;
import FIl.Actions.*;
import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class PotionForceTest extends ItemTest{


	public Items CreateItem() {
		return new PotionForce(5);

	}
	
	public void isUsedBy(Player p,Items i){
		int g=p.getForce();
		i.usedBy(p);
		assertEquals(p.getForce(),g+5);
		}
		

}
