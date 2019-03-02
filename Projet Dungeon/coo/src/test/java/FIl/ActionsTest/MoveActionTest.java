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

public class MoveActionTest extends ActionTest{
	
		public Action CreateAction(Room ro) {
		return new MoveAction(ro);
	}


	
	public void useb(Player p,Action i){

		assertTrue(i.ispossible());
		ByteArrayInputStream in = new ByteArrayInputStream("0".getBytes());
		System.setIn(in);
		i.use(p);
		assertEquals(p.getRoom().toString(),room1.toString());

	}
}
    
    
