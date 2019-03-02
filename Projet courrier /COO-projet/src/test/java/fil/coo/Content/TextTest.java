package fil.coo.Content;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TextTest extends ContentTTest {
	protected Text con;
	
	public void init() {
		this.con= new Text("hello world");
	}

	@Test
	public void TestToString() {
	assertEquals(this.con.toString(),"hello world");
	}
	@Test
	public void TestGetValue() {
		
	}
}
