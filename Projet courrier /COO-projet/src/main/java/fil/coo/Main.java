package fil.coo;
import java.util.ArrayList;

import fil.coo.City.*;
import fil.coo.Content.*;
import fil.coo.Letter.*;
import java.util.Random;


public class Main {
	public static final int INHABITANT = 26;
	public static final int NB_DAY = 4;
	
	
	public static void main(String[] args) {
	
	ArrayList<ArrayList<Letter<?> > > letters= new ArrayList<ArrayList<Letter<?>>>() ;
	City city = new City("my_city");
	city.createInhabitants(INHABITANT);
	for (int i=0; i<4;i++) {
	ArrayList<Letter<?> > letters1=new ArrayList<Letter<?> >();
	BillOfExchange let1= generateBillOfExchange(city ,INHABITANT);
	letters1.add(let1);
	SimpleLetter let2= generateSimpleLetter(city ,INHABITANT);
	letters1.add(let2);
	RegistedLetter let3= generateRegistedLetter(city ,INHABITANT);
	letters1.add(let3);
	UrgentLetter let4= generateUrgentLetter(city ,INHABITANT);
	letters1.add(let4);
	letters.add(letters1);
	
	}
	for (int i=1; i<NB_DAY+3;i++) {
		System.out.println("***********************************************************");
		System.out.println("------------------------- Day "+i+" -------------------------");
		System.out.println("***********************************************************");
		if(i<NB_DAY+1) {
		city.addLetters(letters.get(i-1));}
		city.distributeLetters();
	}
}
	public static SimpleLetter generateSimpleLetter(City city , int nb) {
		Random rand = new Random();
		int a =rand.nextInt(nb);
		int b =rand.nextInt(nb);
		while(a==b) {
			b =rand.nextInt(nb);
		}
		return new SimpleLetter(new Text("Simple Letter"),city.getListInhabitants().get(a),city.getListInhabitants().get(b));

	}
	public static BillOfExchange generateBillOfExchange (City city , int nb) {
		Random rand = new Random();
		int a =rand.nextInt(nb);
		int b =rand.nextInt(nb);
		while(a==b) {
			b =rand.nextInt(nb);
		}
		return new BillOfExchange(new Money(rand.nextInt(250)),city.getListInhabitants().get(a),city.getListInhabitants().get(b));

	}
	public static RegistedLetter generateRegistedLetter(City city , int nb) {
		Random rand = new Random();
		int a =rand.nextInt(nb);
		int b =rand.nextInt(nb);
		while(a==b) {
			b =rand.nextInt(nb);
		}
		return new RegistedLetter(new SimpleLetter(new Text("Registed Letter"),city.getListInhabitants().get(a),city.getListInhabitants().get(b)),city.getListInhabitants().get(a),city.getListInhabitants().get(b));

	}
	public static UrgentLetter generateUrgentLetter(City city , int nb) {
		Random rand = new Random();
		int a =rand.nextInt(nb);
		int b =rand.nextInt(nb);
		while(a==b) {
			b =rand.nextInt(nb);
		}
		return new UrgentLetter(new SimpleLetter(new Text("Urgent Letter "),city.getListInhabitants().get(a),city.getListInhabitants().get(b)),city.getListInhabitants().get(a),city.getListInhabitants().get(b));

	}
}
