package fil.coo.Action;
import fil.coo.ResourceUser.*;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import fil.coo.Action.*;
import fil.coo.Resource.*;
import fil.coo.ResourcePool.*;


public class FreeResourceActionTest extends ResourceActionTest
{
	
	ResourceUser<Basket> resourcelUser;
	TakeResourceAction tra;
	ResourcePool baskets;
	@Override
public Action createAction()
	{
		baskets = new BasketPool(6);
		resourcelUser  = new ResourceUser<Basket>();

		tra = new TakeResourceAction(baskets, resourcelUser,"sdsds");
		try {
			tra.doStep();
		} catch (ActionFinishedException e) {
			e.printStackTrace();
		}
		return new FreeResourceAction<Basket>(baskets,resourcelUser,"ddd");
	}

	@Test
	public void notFinished() 
	{
		action = createAction();
		assertFalse(action.isFinished());
	}
	
	@Test
	public void finished() 
	{
		action = createAction();
		assertFalse(action.isFinished());
		while(!action.isFinished()){
			try {
				action.doStep();
			} catch (ActionFinishedException e) {
				fail("should never happen");
			}
		}
		assertTrue(action.isFinished());
	}
}
