package fil.coo.Letter;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import fil.coo.Content.Text;

public class TestRegistedLetter extends TestDecoratorLetter {

	@Before
	public void init() {
		super.init();
		this.let=new RegistedLetter(new SimpleLetter(new Text("Registed Letter"),this.inh,this.inh2),this.inh,this.inh2);
		
	}
	@Test
	public void testgetCost() {
		assertTrue(0.575==let.getCost());
	}





	

}


