package FIl.GameCharacter;
import FIl.GameCharacter.*;
import FIl.Room.*;
import FIl.Items.*;
import static org.junit.Assert.*;
import org.junit.Test;
import java.util.*;
public class GameCharacterTest 
{
    @Test
    public void TestGameCharacter(){
    GameCharacter g=new GameCharacter(50,30,40);
    assertNotNull(g);
    }
    @Test
    public void TestgetPointV(){
		GameCharacter g=new GameCharacter(50,30,40);
		assertEquals(g.getPointv(),50);
		}
    @Test
	public void TestgetForce(){
		GameCharacter g=new GameCharacter(50,30,40);
		assertEquals(g.getForce(),30);
		}
	@Test
	public void TestgetPoitOr(){
		GameCharacter g=new GameCharacter(50,30,40);
		assertEquals(g.getPointOr(),40);
		}
    @Test
	public void TestchangePointV(){
		GameCharacter g=new GameCharacter(50,30,40);
		g.changePointV(80);
		assertEquals(g.getPointv(),80);
		}
	@Test
	public void TestchangeForce(){
		GameCharacter g=new GameCharacter(50,30,40);
		g.changeForce(80);
		assertEquals(g.getForce(),80);
		}
	@Test
	public void TestchangepointOr(){
		GameCharacter g=new GameCharacter(50,30,40);
		g.changePointOr(80);
		assertEquals(g.getPointOr(),80);
		}
	@Test
	public void TestisDead(){
		GameCharacter g=new GameCharacter(50,30,40);
		assertFalse(g.isDead());
		g.changePointV(0);
		assertTrue(g.isDead());
		}
}
    
    
