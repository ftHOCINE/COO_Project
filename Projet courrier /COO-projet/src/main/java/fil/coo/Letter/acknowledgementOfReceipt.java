package fil.coo.Letter;

import fil.coo.Content.Text;
import fil.coo.Inhabitant.Inhabitant;

public class acknowledgementOfReceipt extends SimpleLetter{

	public acknowledgementOfReceipt(Text content, Inhabitant sender, Inhabitant receiver) {
		super(content, sender, receiver);
	}

	public String toString() {
		return super.toString();
	}
}
