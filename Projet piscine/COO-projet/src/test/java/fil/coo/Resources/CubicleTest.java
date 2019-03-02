
package fil.coo.Resource;
import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;
import fil.coo.Resource.*;
/**
 * @author HOCINE Ferhat, KABOUCHE Aissa
 *  Test
 */
public class CubicleTest {

		@Test
	public void createTest() {
		Cubicle c= new Cubicle();
		assertNotNull(c);
	}
	
	@Test
	public void getDescriptionTest(){
		Cubicle c= new Cubicle();
		assertEquals("Cubicle",c.getDescription());
	}

}

