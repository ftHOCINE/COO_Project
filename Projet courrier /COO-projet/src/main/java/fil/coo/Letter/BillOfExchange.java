package fil.coo.Letter;

import fil.coo.Content.*;
import fil.coo.Inhabitant.Inhabitant;


	public class BillOfExchange extends Letter<Money> {
		public BillOfExchange(Money content, Inhabitant sender, Inhabitant receiver) {
		super(content, sender, receiver);
		}

		public void action() {
			this.getSender().sendsLetter(this);
			this.getReceiver().getAccount().credit(this.getContent().getValue());			
		}

		public double getCost() {
			return (1+(this.content.getValue()/100));
		}
		public String toString() {
			return "🖂  Bill Of Exchange letter";
		}
		public void changeCost(double d) {
		}
}


