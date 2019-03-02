package FIl.Room;
import FIl.GameCharacter.Monstre;
import FIl.Room.Room;
import FIl.Room.Direction;
import FIl.Items.PotionVie;
import static org.junit.Assert.*;
import org.junit.Test;
import java.util.*;

public class RoomTest 
{
    @Test
    public void TestRoom(){
		Room r1=new Room("r1");
		assertNotNull(r1);
		}
    @Test
    public void TestaddObject(){
		Room r1=new Room("r1");
        PotionVie I1=new PotionVie(50);
		assertTrue(r1.getListObjects().isEmpty());
		r1.addObject(I1);
		assertTrue(!r1.getListObjects().isEmpty());
		}
	@Test
    public void TestaddMonstre(){
		Room r1=new Room("r1");
        Monstre m1=new Monstre("m1",20,15,12);
		assertTrue(r1.isEmptyList());
		r1.addMonstre(m1);
		assertFalse(r1.isEmptyList());
		}
	@Test
    public void TestremoveMonstre(){
		Room r2=new Room("r2");
        Monstre m2=new Monstre("m2",20,15,12);
		r2.addMonstre(m2);
		assertFalse(r2.isEmptyList());
		r2.removeMonstre(m2);
		assertTrue(r2.isEmptyList());
		}
	@Test
    public void TestremoveObject(){
		Room r2=new Room("r2");
        PotionVie I2=new PotionVie(40);
		r2.addObject(I2);
		assertFalse(r2.getListObjects().isEmpty());
		r2.removeObject(I2);
		assertTrue(r2.getListObjects().isEmpty());
        }
     @Test
     public void TestAddNeighbor(){
		 Room r1=new Room("r1");
		 Direction d=Direction.NORTH;
		 assertTrue(r1.getNeighbors().isEmpty());
		 r1.addNeighbor(d,r1);
		 assertFalse(r1.getNeighbors().isEmpty());
		 }
   }
    
