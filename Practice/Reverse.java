package Practice;

import java.util.Scanner;

public class Reverse {
	public static void main(String[] args) {
		
		reverseme();
	}
	public static String reverseme() {
		Scanner str = new Scanner(System.in);
		String str2 = str.next();
		char[] try1 = str2.toCharArray();
	    for (int i = try1.length-1;i >= 0; i--) { 
	    	System.out.print(try1[i]);
	    }
	    str.close();
	    return "";
		
	}
}
