package fil.coo.Content;


public class Money extends ContentT<Double>{
	protected double value;
	public Money(double value) {
		super(value);
	}
	

	public String toString() {
		return " the content of this letter is "+this.getValue()+" $";
	}
	
}
