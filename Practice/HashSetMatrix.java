package Practice;

import java.util.HashSet;

public class HashSetMatrix {

	public static void main(String[] args) {
		String[][] mat = {{"I","Cooked","I","Dinner"},
				{"And","Dinner","My","Father"},
				{"Father","Bought","Some","Drinks"}};
		
		HashSet<String> hashSet = new HashSet<>();
		
		for (int i =0; i<mat.length; i++) {
			for(int j =0; j<mat[i].length; j++) {
				hashSet.add(mat[i][j]);
			}
		}
		System.out.println(hashSet);
	}
}
