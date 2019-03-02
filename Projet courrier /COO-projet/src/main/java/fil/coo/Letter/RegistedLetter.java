package fil.coo.Letter;

import fil.coo.Inhabitant.Inhabitant;

public class RegistedLetter extends DecoratorLetter<Letter<?>>{
	protected int dAmount;
	public RegistedLetter(Letter<?> content, Inhabitant sender, Inhabitant receiver) {
		super(content, sender, receiver);
	}
	public void action() {
		this.content.changeCost(this.content.getCost()*1.15);
		this.getSender().sendsLetter(this);

	}

	public double getCost() {
		return super.getCost()*1.15;
	}
	public String toString() {
		return super.toString();
	}

}
