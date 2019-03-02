package fil.coo.Inhabitant;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import fil.coo.Letter.*;
import fil.coo.City.City;
import fil.coo.Content.*;

public class InhabitantTest {

		protected City city;
		protected Inhabitant inh;
		protected Inhabitant inh2;
		protected BillOfExchange let;

		
		@Before
		public void init() {
			this.city= new City("Man_city");
			this.inh=new Inhabitant("aguero",this.city);
			this.inh2=new Inhabitant("kun",this.city);

		}
		
		@Test
		public void TestCheckInitialization() {
			assertEquals("aguero",this.inh.getName());
			assertTrue(1000==this.inh.getAccount().getAmount());
			assertEquals("Man_city",this.inh.getCity().toString());
		}
		@Test
		public void TestSendAndReceiveLetter() {
			let=  new BillOfExchange(new Money(100),this.inh,this.inh2);
			this.city.addLetter(let);
			assertTrue(1000==this.inh.getAccount().getAmount());
			this.inh.sendsLetter(let);
			assertTrue((1000-let.getCost())==this.inh.getAccount().getAmount());
			assertTrue(this.city.getListLetters().isEmpty());
			this.inh2.receiveLetter(let);
			assertFalse(this.city.getListLetters().isEmpty());

			
		}

}
