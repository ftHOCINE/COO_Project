package fil.coo.Letter;

import org.junit.Before;
import fil.coo.Content.Text;

public class TestAcknowledgementOfReceipt extends TestSimpleLetter {


	@Before
	public void init() {
		super.init();
		this.let=new acknowledgementOfReceipt(new Text("acknowledgement Of Receipt"),this.inh,this.inh2);
	}

}