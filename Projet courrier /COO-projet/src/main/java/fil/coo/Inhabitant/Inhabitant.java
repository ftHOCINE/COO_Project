package fil.coo.Inhabitant;
import fil.coo.Bank.*;
import fil.coo.Letter.*;
import fil.coo.City.*;
import fil.coo.Content.Text;

public class Inhabitant{
	protected City city;
	protected String name;
	protected BankAccount BankAccount;
	public Inhabitant(String name,City city,BankAccount BankAccount) {
		this.city=city;
		this.name=name;
		this.BankAccount=BankAccount;

	}
	public Inhabitant(String name,City city) {
		this.city=city;
		this.name=name;
		this.BankAccount=new BankAccount(this,1000);

	}
	public String getName() {
		return this.name;
	}
	public City getCity() {
		return this.city;
	}
	public BankAccount getAccount() {
		return this.BankAccount;
	}
	public void sendsLetter(Letter<?> let)  {
		System.out.println(">>>  📬 "+let.getSender().getName()+" has send "+let.toString()+" (cost: "+let.getCost()+" ) to "+let.getReceiver().getName());
		this.BankAccount.debit(let.getCost());
		let.getSender().getCity().removeLetter(let);

	}
	public void receiveLetter(Letter<?> let) {
		System.out.println(let.toString()+" cost( "+ let.getCost()+") send by "+let.getSender().getName()+" was received by "+let.getReceiver().getName()+" ");
		if (let instanceof BillOfExchange) {
			let.getReceiver().getCity().addLetter(new ThanksLetter(new Text("thanks Letter"),let.getReceiver(),let.getSender()));
		}
		if (let instanceof RegistedLetter) {
			((Letter<?>) let.content).getReceiver().getCity().addLetter(new acknowledgementOfReceipt(new Text("acknowledgement Of Receipt"),((Letter<?>) let.content).getReceiver(),((Letter<?>) let.content).getSender()));

		}
}
}
