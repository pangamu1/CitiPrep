package Practice;


public class Practice1 {

	public static void main(String[] args) {
		String[][] mat = {{"I","Cooked","I","Dinner"},
				{"And","Dinner","My","Father"},
				{"Father","Bought","Some","Drinks"}};
		
		//method1(mat);
		System.out.println(method1(mat));
	}
	
		
		public static String method1(String[][]mat1) {
		String strVar = "";
		for (int i =0; i<mat1.length;i++) {
			for (int j= 0; j<mat1[i].length;j++) {
				if (mat1[i][j] != strVar) {
					// System.out.println("here!");
					if(!strVar.contains(mat1[i][j])) {
						strVar += mat1[i][j] +   " ";
					//System.out.print(" " + strVar);
				}
				
			}
		}
		//System.out.print(" " + strVar);
		}
		return strVar;
		}}		