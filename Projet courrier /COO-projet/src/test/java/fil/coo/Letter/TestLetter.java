package fil.coo.Letter;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import fil.coo.Inhabitant.*;
import fil.coo.Letter.Letter;
import fil.coo.City.City;


public abstract class TestLetter {
	protected City city;
	protected Inhabitant inh;
	protected Inhabitant inh2;
	protected Letter<?> let;
	
	@Before
	public void init() {
		this.city= new City("Man_city");
		this.inh=new Inhabitant("aguero",this.city);
		this.inh2=new Inhabitant("kun",this.city);
		city.addInhabitants(this.inh);
		city.addInhabitants(this.inh2);
	}
	@Test
	public abstract void testgetCost();
	@Test
	public abstract void testAction();
	@Test
	public abstract void testtoString();
	@Test
	public  void testgetSender() {
		assertSame(this.inh,let.getSender());
		
	}
	@Test
	public  void testgetReceiver() {
		assertSame(this.inh2,let.getReceiver());	
	}
	}
	
	
	

