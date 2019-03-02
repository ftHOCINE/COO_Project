package FIl.Actions;
import FIl.GameCharacter.*;
import FIl.Room.*;
import FIl.Items.*;
import FIl.Actions.*;
import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class AttackActionTest extends ActionTest{	
	@Before 

    public void init(){

        pv= new PotionVie(15);
        room= new Room("r0");
        m = new Monstre("monster",5,2,5);
        room.addObject(pv);
        p=new Player(100,100,100,room);


        room.addMonstre(m);
    }
	public Action CreateAction(Room ro) {
		return new AttackAction(ro);
	}
	public void useb(Player p,Action i){

		assertTrue(i.ispossible());
		i.use(p);
		assertFalse(i.ispossible());
	}
}
    
    
