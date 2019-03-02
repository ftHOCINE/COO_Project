package fil.coo.Letter;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import fil.coo.Content.*;

public abstract class TestSimpleLetter extends TestLetter {

	@Before
	public void init() {
		super.init();
		this.let=new SimpleLetter(new Text("Simple Letter"),this.inh,this.inh2);
		
	}
	@Test
	public void testgetCost() {
		assertTrue(0.5==let.getCost());
	}

	@Test
	public void testAction() {
		this.city.addLetter(let);
		assertFalse(this.city.getListLetters().isEmpty());
		this.inh.sendsLetter(let);
		assertTrue(this.city.getListLetters().isEmpty());
	}


	@Test
	public void testtoString() {
		assertEquals("🖂  "+this.let.getContent().toString(),this.let.toString());
	}
	

}
