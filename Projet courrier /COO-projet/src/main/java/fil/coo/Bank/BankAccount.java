package fil.coo.Bank;
import fil.coo.Inhabitant.*;

public class BankAccount {
	protected double amount;
	protected Inhabitant Inhabitant;
	
	public BankAccount(Inhabitant Inhabitant,double amount) {
		this.Inhabitant=Inhabitant;
		this.amount=amount;
	}
	
	public Inhabitant getOwner() {
		return this.Inhabitant;
	}
	public double getAmount() {
		return this.amount;
	}
	public void credit(double m) {
		this.amount +=m;
	}
	public void debit(double m) {
		this.amount -=m;
	}
}
