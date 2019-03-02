package fil.coo.Letter;

import fil.coo.Content.Text;
import fil.coo.Inhabitant.Inhabitant;

public class ThanksLetter extends SimpleLetter{

	public ThanksLetter(Text content, Inhabitant sender, Inhabitant receiver) {
		super(content, sender, receiver);
	}
	public void action() {
		this.getSender().sendsLetter(this);
	}
	public String toString() {
		return super.toString();
	}


}
