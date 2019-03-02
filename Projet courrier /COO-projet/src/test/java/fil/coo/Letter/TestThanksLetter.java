package fil.coo.Letter;

import org.junit.Before;
import fil.coo.Content.Text;

public class TestThanksLetter extends TestSimpleLetter {


	@Before
	public void init() {
		super.init();
		this.let=new ThanksLetter(new Text("Thanks Letter"),this.inh,this.inh2);
	}
	
	


}
