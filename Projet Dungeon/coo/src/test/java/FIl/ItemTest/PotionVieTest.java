package FIl.Items;
import FIl.GameCharacter.*;
import FIl.Room.*;
import FIl.Items.*;
import FIl.Actions.*;
import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class PotionVieTest extends ItemTest{


	public Items CreateItem() {
		return new PotionVie(5);

	}
	
	public void isUsedBy(Player p,Items i){
		int g=p.getPointv();
		i.usedBy(p);
		assertEquals(p.getPointv(),g+5);
		}
		

}
