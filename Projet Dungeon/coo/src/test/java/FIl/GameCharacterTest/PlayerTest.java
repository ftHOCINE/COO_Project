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
public class PlayerTest extends GameCharacterTest{
	Room r1=new Room("r1");
	Room r2=new Room("r2");
	Player p=new Player(50,40,40,r1);
	Action a=new AttackAction(r1);
	Action b=new UseAction(r1);
	@Test
	public void TestPlayer(){
		assertNotNull(p);
	}
	@Test 
	public void TestsetRoom(){
		assertSame(p.getRoom(),r1);
		p.setRoom(r2);
		assertSame(r2,p.getRoom());
		}
	@Test
	public void TestgetRoom(){
		assertSame(p.getRoom(),r1);
	}
	@Test
	public void TestAddAction(){
		assertTrue(p.getAction().isEmpty());
		p.addAction(a);
		assertFalse(p.getAction().isEmpty());
		}
    @Test
	public void TestRemoveAction(){
		p.addAction(a);
		assertFalse(p.getAction().isEmpty());
		p.removeAction(a);
		assertTrue(p.getAction().isEmpty());
		}
    @Test
	public void TestRemoveAllAction(){
		p.addAction(a);
		p.addAction(b);
		assertFalse(p.getAction().isEmpty());
		p.removeAllAction();
		assertTrue(p.getAction().isEmpty());
		}
	
    @Test
	public void TestchooseAction(){
		p.addAction(a);
		ByteArrayInputStream in = new ByteArrayInputStream("0".getBytes());
                System.setIn(in);
		assertEquals(a.toString(),p.chooseAction().toString());
		}

}
