
package fil.coo.ResourcePool;
import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;
import fil.coo.Resource.*;
import fil.coo.ResourcePool.*;

/**
 * @author HOCINE Ferhat, KABOUCHE Aissa
 *  Test
 */
public class ResourcePoolTest<T extends Resource> {
	
	

	
	public MockResourcePool createPool(int i){
		return new MockResourcePool(i);}
	
	@Test(expected=EmptyListException.class)
	public void providedEmptyPoolTest()throws EmptyListException{
		MockResourcePool rp= this.createPool(0);
		Resource a =rp.provideResource();	
	}
	
	@Test
	public void provideResourceTest(){
		MockResourcePool rp=this.createPool(1);
		assertTrue(1==rp.getfreeResources().size());
			try {
		Resource a =rp.provideResource();
		assertTrue(0==rp.getfreeResources().size());
	}
	catch (EmptyListException e){
		fail();
	}
	}
	
	@Test(expected=NotFoundException.class)
	public void freeNotFoundResourceTest()throws NotFoundException{
		MockResourcePool rp= this.createPool(1);
		MockResourcePool rpp= this.createPool(1);
		try {
		rp.freeResource(rpp.provideResource());
			}
	catch (EmptyListException e){
		fail();
	}
		}
	
	@Test
	public void freeResourceTest(){
		MockResourcePool rp= this.createPool(1);
		assertTrue(0==rp.getbusyResources().size());
				try {
		Mock a =rp.provideResource();
		assertTrue(0==rp.getfreeResources().size());
		assertTrue(1==rp.getbusyResources().size());
		rp.freeResource(a);
		assertTrue(1==rp.getfreeResources().size());
		assertTrue(0==rp.getbusyResources().size());
		}
			catch (EmptyListException e){
		fail();}
				catch (NotFoundException e){
		fail();
		}

	}
	

	

}

