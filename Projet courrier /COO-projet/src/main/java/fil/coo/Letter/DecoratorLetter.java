package fil.coo.Letter;
import fil.coo.Content.*;
import fil.coo.Inhabitant.*;

public abstract class DecoratorLetter<T extends Content> extends Letter<Letter<?>> {
	protected Letter<?> let;
	public DecoratorLetter(Letter<?> content, Inhabitant sender, Inhabitant receiver) {
		super(content, sender, receiver);
	}
	public void action() {
		this.getSender().sendsLetter(this);
	}

	public double getCost() {
		return this.content.getCost();
	}

	public String toString() {
		return this.content.toString();
	}
	public void changeCost(double d) {
	}

}
