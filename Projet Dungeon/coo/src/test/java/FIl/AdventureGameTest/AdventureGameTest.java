package FIl.AdventureGame;
import FIl.GameCharacter.Player;
import FIl.Room.Room;
import FIl.Room.Exit;
import FIl.AdventureGame.AdventureGame;

import static org.junit.Assert.*;

import org.junit.Test;

public class AdventureGameTest
{
   
    Room r=new Room("r1");
    Room r2=new Room("r2");
    Exit r3=new Exit("r3");
    Player p=new Player(50,30,40,r);
    Player p2=new Player(50,30,40,r3);
    AdventureGame g=new AdventureGame(p,r);
    AdventureGame g2=new AdventureGame(p2,r3);
    @Test
    public void TestAdventureGame()
    {
      assertNotNull(g);
	}
    @Test
    public void getCurrentRoomTest()
    {
	
      assertTrue((g.getcurrentRoom().toString()).equals(r.toString()));       
    }
    @Test
    public void setCurrentRoomTest(){
		
		assertTrue((g.getcurrentRoom().toString()).equals(r.toString()));
		g.setCurrentRoom(r2);
		assertTrue((g.getcurrentRoom().toString()).equals(r2.toString()));
		}
	@Test
    public void RoomsActionTest(){
		
		g.RoomsAction();
		assertFalse(p.getAction().isEmpty());	
		}
    @Test
    public void isFinishedTest(){
		assertFalse(g.isFinished());
		p.changePointV(0);
		assertTrue(g.isFinished());
		g2.setCurrentRoom(r3);
		assertTrue(g2.isFinished());
		}
    
    
}
