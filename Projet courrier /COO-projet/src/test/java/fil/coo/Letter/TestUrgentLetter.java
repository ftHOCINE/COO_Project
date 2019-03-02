package fil.coo.Letter;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import fil.coo.Content.Text;

public class TestUrgentLetter extends TestDecoratorLetter {

	@Before
	public void init() {
		super.init();
		this.let=new UrgentLetter(new SimpleLetter(new Text("Urgent Letter"),this.inh,this.inh2),this.inh,this.inh2);
		
	}
	@Test
	public void testgetCost() {
		assertTrue(1.0==let.getCost());
	}





	

}