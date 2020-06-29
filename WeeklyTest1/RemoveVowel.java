package WeeklyTest1;

public class RemoveVowel {
	public static void vowels(String str) {
	String noVowel = str.replaceAll("[[aeiou],[AEIOU]]", "");
	System.out.println("String without vowels: " + noVowel);
	}
	public static void main(String[] args) {
		vowels("MandaloriAn");
	}
}
