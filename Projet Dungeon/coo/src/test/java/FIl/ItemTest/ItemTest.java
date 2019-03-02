package FIl.Items;
import FIl.GameCharacter.*;
import FIl.Room.*;
import FIl.Items.*;
import FIl.Actions.*;
import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public abstract class ItemTest{

	protected Items a;
	protected Player p;
    
    public abstract Items CreateItem();
    public abstract void isUsedBy(Player p,Items i);
    
    @Before 
    public void init(){
        a=CreateItem();
        Room r=new Room("r1");
        p=new Player(100,100,100,r);
    }
    
    @Test
    public void TestUsedBy(){
		isUsedBy(p,a);
		}
}
    
    
