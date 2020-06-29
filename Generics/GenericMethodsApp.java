package Generics;

public class GenericMethodsApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenericMethods gen = new GenericMethods();
		Integer[] intArray = {1,2,3,4,5};
		String[] strArray = {"De Gea","Lindelof","Bailly","Jones","Maguire"};
		/*gen.genMethod(intArray);
		gen.genMethod(strArray);*/
		gen.Jersey(intArray, strArray);
		
		
	}

}
