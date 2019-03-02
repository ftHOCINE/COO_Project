
package fil.coo.Action;
import fil.coo.Action.*;
import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class ForeseableActionTest  extends ActionTest{
	
	public Action createAction(){
           return new ForeseableAction(2,"TEST");

            }
	
      @Test
       public void exactly3StepsRequired() throws Exception {
		Action a = new ForeseableAction(2,"TEST");

		// 2 steps remaining
		
		assertFalse(a.isFinished());

		a.doStep();

		// 1 step remaining
		 
		assertFalse(a.isFinished());

		a.doStep();

		// 0 step remaining
		
		assertTrue(a.isFinished());

	}

	

}
