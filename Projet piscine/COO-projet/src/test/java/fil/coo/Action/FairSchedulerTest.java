package fil.coo.Action;
import fil.coo.Action.*;
import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;
public  class FairSchedulerTest extends SchedulerTest {
   public  Scheduler createScheduler(){
   return new FairScheduler();
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
				fail();
			}
		}
		assertTrue(scheduler.get().isEmpty());
	}
	@Test 
	public void testNextAction(){
		FairScheduler scheduler = (FairScheduler) this.createScheduler();
		assertTrue(scheduler.get().isEmpty());
		scheduler.addAction(new ForeseableAction(1, "mockup"));
                scheduler.nextAction();
		assertTrue(scheduler.getit()!=null);
		
		}
}
