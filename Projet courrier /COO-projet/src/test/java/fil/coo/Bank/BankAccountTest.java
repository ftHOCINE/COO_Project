package fil.coo.Bank;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import fil.coo.Letter.*;
import fil.coo.City.City;
import fil.coo.Inhabitant.*;

public class BankAccountTest {

		protected City city;
		protected Inhabitant inh;
		protected Inhabitant inh2;
		protected BillOfExchange let;
		protected BankAccount bank;
		protected BankAccount bank2;
		@Before
		public void init() {
			this.city= new City("Man_city");
			this.inh=new Inhabitant("aguero",this.city);
			this.inh2=new Inhabitant("Kun",this.city);
			this.bank=this.inh.getAccount();
			this.bank2=this.inh2.getAccount();
		}

		@Test
		public void TestCheckInitialization() {
				assertEquals(inh,this.bank.getOwner());
				assertEquals(inh2,this.bank2.getOwner());
				assertTrue(1000==this.bank.getAmount());
				assertTrue(1000==this.bank2.getAmount());
			}
		@Test
		public void TestvreditAndDebit() {
			this.bank.credit(100);
			this.bank2.debit(200);
			assertTrue(1100==this.bank.getAmount());
			assertTrue(800==this.bank2.getAmount());
		}




}
