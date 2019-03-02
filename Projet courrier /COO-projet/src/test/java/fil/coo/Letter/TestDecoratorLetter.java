package fil.coo.Letter;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public abstract class TestDecoratorLetter extends TestLetter {

			@Before
			public void init() {
				super.init();
				
			}
			@Test
			public abstract void testgetCost();

			@Test
			public void testAction() {
				this.city.addLetter(let);
				assertFalse(this.city.getListLetters().isEmpty());
				this.inh.sendsLetter(let);
				assertTrue(this.city.getListLetters().isEmpty());
			}

			@Test
			public void testtoString() {
				assertEquals(this.let.getContent().toString(),this.let.toString());
			}
			

}
