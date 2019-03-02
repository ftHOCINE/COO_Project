package fil.coo.Action;
import fil.coo.Action.*;
import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;


public abstract class SchedulerTest {
	
	/**
	 * Creates an empty scheduler
	 * @return an empty scheduler
	 */
	protected abstract Scheduler createScheduler();
	
	protected Scheduler scheduler;
	

	@Test
	public void testAdd() {
		scheduler = createScheduler();
		scheduler.addAction(new ForeseableAction(1, "test"));
		assertFalse(scheduler.get().isEmpty());
		assertEquals(1, scheduler.get().size());
		
	}
	
	@Test
	public void testIsFinished() {
		scheduler = createScheduler();
		scheduler.addAction(new ForeseableAction(10, "test"));
		assertFalse(scheduler.isFinished());
		while(!scheduler.isFinished()){
			try {
				scheduler.doStep();
			} catch (ActionFinishedException e) {
			}
		}
		assertTrue(scheduler.isFinished());
	}

	@Test
	public void testDoStep() {
		scheduler = createScheduler();
		scheduler.addAction(new ForeseableAction(10, "test"));
		try {
			scheduler.doStep();
		} catch (ActionFinishedException e) {
			fail("Should not happen");
		}
		
		assertTrue(scheduler.getState()==ActionState.IN_PROGRESS);
	}
	
	@Test
	public void testGetActions() {
		scheduler = createScheduler();
		Action mock1 = new ForeseableAction(10, "test");
		Action mock2 = new ForeseableAction(10, "test2");

		scheduler.addAction(mock1);
		scheduler.addAction(mock2);

		assertEquals(mock1, scheduler.get().get(0));
		assertEquals(mock2, scheduler.get().get(1));
		
	}


}
