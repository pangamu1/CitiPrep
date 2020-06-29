package Generics;

public class Hashtable1<K,V> {
	private K key;
	private V value;
	
	public Hashtable1(K key, V value) {
		super();
		this.key = key;
		this.value = value;
	}
	@Override
	public String toString() {
		return key.toString() + "--" + value.hashCode();
		
	}
}

