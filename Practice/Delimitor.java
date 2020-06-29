package Practice;

//import java.util.Arrays;

public class Delimitor {
	public static void main(String[] args) {
		delimitorPgm();
	}
	public static void delimitorPgm() {
		String str = "Jan, Feb, Mar, Apr, May";
		String string2 = str.replaceAll(",", "");
		//String string3 = string2.replaceAll(" $", "");
		System.out.println((string2));
		
		//return "";
		
	}
}
