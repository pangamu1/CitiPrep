package WeeklyTest1;

public class MinMax {

	
	public static void getMax(int[] inputArray){ 
	    int maxValue = inputArray[0]; 
	    for(int i=1;i < inputArray.length;i++){ 
	      if(inputArray[i] > maxValue){ 
	         maxValue = inputArray[i]; 
	      } 
	    }
	    System.out.println(maxValue);
	}
	public static void getMin(int[] inputArray){ 
	    int minValue = inputArray[0]; 
	    for(int i=1;i < inputArray.length;i++){ 
	      if(inputArray[i] < minValue){ 
	         minValue = inputArray[i]; 
	      } 
	    } 
	    System.out.println(minValue);
	}
	public static void main(String[] args) {
		int[] array = {81,27,43,45,75,96,78};
		getMax(array);
		getMin(array);

	}

}
