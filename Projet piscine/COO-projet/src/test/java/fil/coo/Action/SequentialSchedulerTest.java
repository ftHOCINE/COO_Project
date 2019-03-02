package fil.coo.Action;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


import fil.coo.Action.*;


public class SequentialSchedulerTest extends SchedulerTest {
	protected Scheduler createScheduler(){
		return new SequentielScheduler();
	}
	

	@Test
	public void testRemoveAction() {
		scheduler = createScheduler();
		assertTrue(scheduler.get().isEmpty());
		scheduler.addAction(new ForeseableAction(1, "mockup"));
		assertFalse(scheduler.get().isEmpty());
		while(!scheduler.isFinished()){
			try {
				scheduler.doStep();
			} catch (ActionFinishedException e) {
				fail("should never happen");
			}
		}
		assertTrue(scheduler.get().isEmpty());
	}
       
	


}
