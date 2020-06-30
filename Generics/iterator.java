package Generics;

import java.util.Arrays;
//import java.util.Iterator;
import java.util.List;

public class iterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> values = Arrays.asList(1,2,3,4,5);
		for (Integer x: values) {
			System.out.println(x);
		}
		
		/*Iterator<Integer> i = values.iterator();
		while(i.hasNext()) {
			System.out.println(" " + i.next());
		}*/
		values.forEach(i -> System.out.println(i));
	}

}
