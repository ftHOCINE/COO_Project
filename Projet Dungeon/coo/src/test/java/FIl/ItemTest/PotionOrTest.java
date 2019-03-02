package FIl.Items;
import FIl.GameCharacter.*;
import FIl.Room.*;
import FIl.Items.*;
import FIl.Actions.*;
import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class PotionOrTest extends ItemTest{


	public Items CreateItem() {
		return new PotionOr(5);

	}
	
	public void isUsedBy(Player p,Items i){
		int g=p.getPointOr();
		i.usedBy(p);
		assertEquals(p.getPointOr(),g+5);
		}
		

}
