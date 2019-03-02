package fil.coo.Content;

import static org.junit.Assert.*;
import org.junit.Test;



public abstract class ContentTTest extends ContentTest {

	protected ContentT<String> con;
	protected ContentT<Double> con2;
	public void init() {
		this.con= new Text("hello world");
		this.con2= new Money(100);
	}


	@Test
	public void TestGetValue() {
		assertEquals(this.con.getValue(),"hello world");
		assertTrue(this.con2.getValue()==100);
	}


	@Override
	public abstract  void TestToString();
	

}
