package fil.coo.City;
import java.util.ArrayList;
import fil.coo.Inhabitant.*;
import fil.coo.Letter.*;

public class City {
	protected ArrayList<Inhabitant> inhabitants;
	protected ArrayList<Letter<?> > letters;
	protected ArrayList<Letter<?> > sentLetter;
	protected String name;
	public City(String name) {
		this.inhabitants=new ArrayList<Inhabitant>();
		this.letters= new ArrayList<Letter<?>>() ;
		this.name= name;
		this.sentLetter=new ArrayList<Letter<?>>();
	}
	public void refreshListSent() {
		this.sentLetter=new ArrayList<Letter<?>>();
	}
	public void addLetter(Letter<?> l) {
		this.letters.add(l);
	}
	public void addLetters(ArrayList<Letter<?>> l) {
		for(Letter<?> letterr: l)
			this.addLetter(letterr);
	}
	public void removeLetter(Letter<?> l) {
		this.letters.remove(l);
	}
	public void addInhabitants(Inhabitant I) {
		this.inhabitants.add(I);
	}
	public ArrayList<Inhabitant> getListInhabitants() {
		return this.inhabitants;
	}
	public ArrayList<Letter<?>> getListLetters() {
		return this.letters;
	}
	public ArrayList<Letter<?>> getListSentLetters() {
		return this.sentLetter;
	}
	public String toString() {
		return this.name;
	}
	public boolean hasMoreletters() {
		return this.letters.size()==0;
	}
	public void distributeLetters() {
		for (Letter<?> let: this.sentLetter) {
			let.getReceiver().receiveLetter(let);
		}
		this.refreshListSent();
		ArrayList<Letter<?> > lets= new ArrayList<Letter<?>>() ;
		for (Letter<?> letterr: this.letters) {
			lets.add(letterr);
		}
		for (int i=0; i<lets.size();i++) {
			Letter<?> let= lets.get(i);
			let.action();
			this.sentLetter.add(let);
		}
	}
	public void createInhabitants(int n) {
		for(int i=0;i<n;i++) {
			this.addInhabitants(new Inhabitant("Inhabitant"+i,this));
		}
	}

}
