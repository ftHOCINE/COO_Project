package FIl.Actions;
import FIl.GameCharacter.*;
import FIl.Room.*;
import FIl.Items.*;
import FIl.Actions.*;
import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;
import java.io.InputStream;
import java.io.ByteArrayInputStream;

public class UseActionTest extends ActionTest{
	
		public Action CreateAction(Room ro) {
		return new UseAction(ro);
	}

	@Before 

    public void init3(){

        pv= new PotionVie(15);
        room= new Room("r0");
        room.addObject(pv);
        p=new Player(100,100,100,room);
        
	
        
    }

	
	public void useb(Player p,Action i){
		int a=room.getListObjects().size();
		assertTrue(i.ispossible());
		ByteArrayInputStream in = new ByteArrayInputStream("0".getBytes());
		System.setIn(in);
		i.use(p);
		assertEquals(a-1,room.getListObjects().size());
		
		
	}
}
    
    
