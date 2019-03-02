
package fil.coo.Resource;
import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;
import fil.coo.Resource.*;
/**
 * @author HOCINE Ferhat, KABOUCHE Aissa
 *  Test
 */
public class BasketTest  {
		@Test
	public void createTest() {
		Basket c= new Basket();
		assertNotNull(c);
	}
	
	@Test
	public void getDescriptionTest(){
		Basket c= new Basket();
		assertEquals("Basket",c.getDescription());
	}
	

}

