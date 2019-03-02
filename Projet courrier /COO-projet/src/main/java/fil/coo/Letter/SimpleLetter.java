package fil.coo.Letter;
import fil.coo.Inhabitant.*;
import fil.coo.Content.*;

public class SimpleLetter extends Letter<Text> {
		protected double cost=0.5;
		public SimpleLetter(Text content, Inhabitant sender, Inhabitant receiver) {
		super(content, sender, receiver);
		
		}


		public void action() {
			this.getSender().sendsLetter(this);
		}

		public double getCost() {
			return cost ;
		}
		public void changeCost(double a) {
			cost=a;
		}
		
		public String toString() {
			return "🖂  "+this.content.toString();
		}

}

