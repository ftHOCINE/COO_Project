package fil.coo.Action;
import static org.junit.Assert.*;
import fil.coo.Resource.*;
import fil.coo.ResourcePool.*;
import fil.coo.ResourceUser.*;
import org.junit.Before;
import org.junit.Test;


import fil.coo.Action.*;


public class SwimmerTest extends SequentialSchedulerTest {
	BasketPool baskets;
	CubiclePool cubicles;
	Swimmer swimmer;
	
	@Before
	public void setUp(){
		baskets = new BasketPool(6);
		cubicles = new CubiclePool(3);
		swimmer = new Swimmer("Mockup", baskets, cubicles, 6, 4, 8);
	}
	
	
	
	@Test
	public void testFinished() {
		while(!swimmer.isFinished()){
			try {
				swimmer.doStep();
			} catch (ActionFinishedException e) {
				fail("should not happen");
			}
		}
		
		assertTrue(swimmer.isFinished());
	}
}
