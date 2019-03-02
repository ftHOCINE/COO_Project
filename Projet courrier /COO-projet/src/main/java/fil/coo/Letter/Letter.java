package fil.coo.Letter;
import fil.coo.Content.*;
import fil.coo.Inhabitant.Inhabitant;


public abstract class Letter<T extends Content> implements Content {
	protected Inhabitant sender;
	protected Inhabitant receiver;
	public T content;
	public Letter (T content, Inhabitant sender, Inhabitant receiver) {
		this.content=content;
		this.sender=sender;
		this.receiver=receiver;
	}
	public T getContent() {
		return this.content;
	}
	public Inhabitant getSender() {
		return this.sender;
	}
	public Inhabitant getReceiver() {
		return this.receiver;
	}
	public String toString() {
		return this.getContent().toString();
	}
	public abstract void action();
	public abstract double getCost();
	public abstract void changeCost(double d);
	
}
