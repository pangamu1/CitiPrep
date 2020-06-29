package Generics;

public class freal {

	public static void main(String[] args) {
		Generics1<String> stringvar = new Generics1<>();
		stringvar.setStoreItem("Finally");
		
		String item = stringvar.getItem();
		System.out.println(item);
		
		Generics1<Integer> intvar = new Generics1<>();
		intvar.setStoreItem(5);
		
		Integer item2 = intvar.getItem();
		System.out.println(item2);
	}

}
