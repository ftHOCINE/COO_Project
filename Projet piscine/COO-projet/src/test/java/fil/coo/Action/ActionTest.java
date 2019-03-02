package fil.coo.Action;
import fil.coo.Action.*;
import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;
public abstract class ActionTest {
	protected abstract Action createAction();
	protected Action action;


	@Test
	public void TestgetState(){
		Action action= createAction();
		assertTrue(action.getState()==ActionState.READY);
		}
		
	

	@Test(expected = ActionFinishedException.class)
	public void doStepWhileFinishedThrowsException() throws ActionFinishedException {
		action = createAction();
		while(!action.isFinished()) {
			try {action.doStep();}
			catch (ActionFinishedException e) {
				
				}
		}
		
		assertTrue(action.isFinished());
		action.doStep();
	}
	
	@Test
	public void oneStepAtTheTime() {
		action = createAction();
		while(!action.isFinished()) {
			try {action.doStep();}
			catch (ActionFinishedException e) {
                               fail("erreur ici");
				}
		}
	
		assertTrue(action.isFinished());
		assertTrue(action.getState()==ActionState.FINISHED);

	}
	
	
   
    
		

	}
