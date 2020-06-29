package Generics;

public class GenericMethods {
	
	public <T> void genMethod(T[] array) {
		for (T item: array) {
			System.out.println("Array item: "+ item.toString() + "->");
		}
	}
	
	public <K,V> void Jersey(K[] key, V[] value) {
		for (K item: key) {
			for (V item1: value) {
				System.out.println(item.toString() + " -> " + item1.toString());
			}
		}
	}
}
