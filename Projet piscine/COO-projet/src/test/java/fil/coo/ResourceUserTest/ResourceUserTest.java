package fil.coo.ResourceUser;
import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;
import fil.coo.Resource.*;
import fil.coo.ResourcePool.*;
import fil.coo.ResourcePool.*;


public class ResourceUserTest{
	
	public ResourceUser<Mock> R= new ResourceUser<Mock>();
		@Test
	public void createTest(){
		assertNotNull(R);
	}
	
			@Test
	public void hasAndSetResourceTest(){
		assertFalse(R.hasResource());
		Mock a= new Mock();
		R.setResource(a);
		assertTrue(R.hasResource());
		
	}
				@Test
	public void resetResourceTest(){
		ResourceUser<Mock> R= new ResourceUser<Mock>();
		Mock a= new Mock();
		assertFalse(R.hasResource());
		R.setResource(a);
		assertTrue(R.hasResource());
		R.resetResource();
		assertFalse(R.hasResource());
		
	}
	
	

}
