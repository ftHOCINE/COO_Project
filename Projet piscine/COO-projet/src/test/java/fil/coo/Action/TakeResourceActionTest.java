package fil.coo.Action;
import fil.coo.ResourceUser.*;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import fil.coo.Action.*;
import fil.coo.Resource.*;
import fil.coo.ResourcePool.*;
public class TakeResourceActionTest extends ResourceActionTest
{
	
	ResourceUser<Basket> resourcelUser;
	BasketPool baskets;
	@Override
	public  Action createAction()
	{
		baskets = new BasketPool(6);
		resourcelUser  = new ResourceUser<Basket>();

		return new TakeResourceAction<Basket>(baskets, resourcelUser,"dressing");
	}

	
	
	@Test
	public void testGetResource(){
		action = createAction();
		assertFalse(action.isFinished());
		assertEquals(null, ((TakeResourceAction) action).getUser().getResource());	
	}
	
	
	@Test
	public void doAStepAndFinish() 
	{
		action = createAction();
		assertFalse(action.isFinished());
		while(!action.isFinished()){
			try {
				action.doStep();
			} catch (ActionFinishedException e) {
				fail(" test Fail");
			}
		}
		assertTrue(action.isFinished());
	}
}
