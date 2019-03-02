package fil.coo.Content;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MoneyTest extends ContentTTest {
	protected Money con;
	
	public void init() {
		this.con= new Money(100);
	}

	@Test
	public void TestToString() {
	assertEquals(this.con.toString()," the content of this letter is "+this.con.getValue()+" $");
	}
	@Test
	public void TestGetValue() {
		
	}
}


