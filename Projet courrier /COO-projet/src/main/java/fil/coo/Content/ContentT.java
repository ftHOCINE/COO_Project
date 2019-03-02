package fil.coo.Content;

public abstract class ContentT<T> implements Content {

	protected T value;
	
	public  ContentT(T value) {
		this.value=value;
		
	}
	public T getValue() {
		return this.value;
	}
	public abstract String toString();
}
