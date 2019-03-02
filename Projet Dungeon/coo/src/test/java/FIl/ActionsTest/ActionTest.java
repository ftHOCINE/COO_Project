package FIl.Actions;
import FIl.GameCharacter.*;
import FIl.Room.*;
import FIl.Items.*;
import FIl.Actions.*;
import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public abstract class ActionTest{

	protected Action a;
	protected Action ac;
	protected Room room;
	protected Room room1;
	protected Player p;
	protected Monstre m;
	protected PotionVie pv;
    
    public abstract Action CreateAction(Room room);
    public abstract void useb(Player p,Action i);
    
    @Before
       public void init(){
		room= new Room("r0");
        a=CreateAction(room);
        pv= new PotionVie(15);
        room1= new Room("r1");
        room.addNeighbor(Direction.NORTH,room1);
        room1.addNeighbor(Direction.SOUTH,room);
        m = new Monstre("monster",5,2,5);
        room.addObject(pv);
        p=new Player(100,100,100,room);
        
    } 

    
    @Test
    public void Testuse(){
		a=CreateAction(room);
		useb(p,a);
		}
}
    
    
