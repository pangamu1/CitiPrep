package Generics;

public class Generics1<T> {
	
	private T item;
	
	public void setStoreItem(T item) {
		this.item = item;
	}

	public T getItem() {
		return this.item;
	}
	@Override
	public String toString() {
		return "" + this.item.toString();
	}
	
}	


