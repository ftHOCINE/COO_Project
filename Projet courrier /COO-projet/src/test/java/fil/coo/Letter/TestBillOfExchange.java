package fil.coo.Letter;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import fil.coo.Content.Money;

public class TestBillOfExchange extends TestLetter {
	@Before
	public void init() {
		super.init();
		this.let=new BillOfExchange(new Money(100),this.inh,this.inh2);
		
	}
	@Test
	public void testgetCost() {
		assertTrue(2==let.getCost());
	}

	@Test
	public void testAction() {
		this.city.addLetter(let);
		assertFalse(this.city.getListLetters().isEmpty());
		this.let.action();
		assertTrue(this.city.getListLetters().isEmpty());
		assertTrue(this.inh2.getAccount().getAmount()==1100);
	}


	@Override
	public void testtoString() {
		// TODO Auto-generated method stub
		
	}
}
