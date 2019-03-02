package fil.coo.Letter;

import fil.coo.Inhabitant.Inhabitant;

public class UrgentLetter extends DecoratorLetter<Letter<?>>{
	protected int dAmount;
	public UrgentLetter(Letter<?> content, Inhabitant sender, Inhabitant receiver) {
		super(content, sender, receiver);
	}
	public void action() {
		this.content.changeCost(this.content.getCost()*2);
		this.getSender().sendsLetter(this);
	}

	public double getCost() {
		return super.getCost()*2;
	}
	public String toString() {
		return super.toString();
	}
}
