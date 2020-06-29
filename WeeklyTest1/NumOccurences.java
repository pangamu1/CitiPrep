package WeeklyTest1;


public class NumOccurences {

	public static void numOfOccurences(String str) {
		
		int count = str.length()-str.replace("a", "").length(); 
		//System.out.println(count);
		/*int count1 = str.replace("a", "").length();
		System.out.println(count1);
		*/
		char[] charArray = str.toLowerCase().toCharArray();
		//System.out.println(charArray);
		for (int i =0; i < str.length(); i++) {
			System.out.println(charArray[i] +  " : " + count);
		}
	}
	public static void main(String[] args) {
		numOfOccurences("Mandalorian");
	}
	
}
