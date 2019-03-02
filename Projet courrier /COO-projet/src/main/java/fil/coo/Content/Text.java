package fil.coo.Content;


public class Text extends ContentT<String>{
	protected String value;
	public Text(String value) {
		super(value);
	}
	

	public String toString() {
		return super.getValue();
	}
	

}
