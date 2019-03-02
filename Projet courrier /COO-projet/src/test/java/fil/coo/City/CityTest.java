package fil.coo.City;
import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;
import fil.coo.Letter.*;
import fil.coo.Content.*;

public class CityTest {
	protected City city;
	protected SimpleLetter let;
	protected SimpleLetter let1;
	protected ArrayList<Letter<?> > letters1;
	
	@Before
	public void init() {
		this.city= new City("Man_city");

	}
	
	@Test
	public void TestCheckInitialization() {
		assertEquals(this.city.toString(),"Man_city");
		assertTrue(this.city.getListInhabitants().isEmpty());
		assertTrue(this.city.getListLetters().isEmpty());
	}
	@Test
	public void TestcreateInhabitants() {
		assertTrue(this.city.getListInhabitants().isEmpty());
		city.createInhabitants(5);
		assertFalse(this.city.getListInhabitants().isEmpty());
	}
	@Test
	public void TestAddAndRemoveLetter() {
		city.createInhabitants(5);
		let=  new SimpleLetter(new Text("Simple Letter"),city.getListInhabitants().get(1),city.getListInhabitants().get(2));
		let1=  new SimpleLetter(new Text("Simple Letter"),city.getListInhabitants().get(1),city.getListInhabitants().get(2));
		letters1=new ArrayList<Letter<?> >();
		assertTrue(this.city.getListLetters().isEmpty());
		this.city.addLetter(let);
		assertFalse(this.city.getListLetters().isEmpty());
		this.city.removeLetter(let);
		assertTrue(this.city.getListLetters().isEmpty());
		letters1.add(let);
		letters1.add(let1);
		this.city.addLetters(letters1);
		assertTrue(this.city.getListLetters().size()==2);
	}
	@Test
	public void TestDistributeLetters() {
		city.createInhabitants(5);
		let=  new SimpleLetter(new Text("Simple Letter"),city.getListInhabitants().get(1),city.getListInhabitants().get(2));
		this.city.addLetter(let);
		assertFalse(this.city.getListLetters().isEmpty());
		assertTrue(this.city.getListSentLetters().isEmpty());
		city.distributeLetters();
		assertTrue(this.city.getListLetters().isEmpty());
		assertFalse(this.city.getListSentLetters().isEmpty());
	}
		

	
	
	
}
