package FIl.Items;
import FIl.GameCharacter.*;
import FIl.Room.*;
import FIl.Items.*;
import FIl.Actions.*;
import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class BanditManchotTest extends ItemTest{


	public Items CreateItem() {
		return new BanditManchot();

	}
	
	public void isUsedBy(Player p,Items i){
		int g=p.getPointOr();
		int g1=p.getForce();
		int g2=p.getPointv();
		int a=g+g1+g2;
		i.usedBy(p);
		int f=p.getPointOr();
		int f1=p.getForce();
		int f2=p.getPointv();
		int s=f+f1+f2;
		assertFalse(a==f);
		}
		

}
