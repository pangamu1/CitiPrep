package WeeklyTest1;

import java.util.Arrays;

public class CheckAnagram { 
	static void anagOrNot(String str1, String str2) {    
        boolean checkVar = true;
		    char[] charArray1 = str1.toLowerCase().toCharArray();  
            char[] charArray2 = str2.toLowerCase().toCharArray();    
            //System.out.println(charArray2);
            Arrays.sort(charArray2);
            Arrays.sort(charArray1);
            //System.out.println(charArray2);
            checkVar = Arrays.equals(charArray1,charArray2);
       
        // checkVar = false;
		if (checkVar) {  
            System.out.println(str1 + " and " + str2 + " is an anagram");  
        } else {  
            System.out.println(str1 + " and " + str2 + " isn't an anagram");  
        } 
    }  
   
    public static void main(String[] args) {  
        anagOrNot("Martial", "Rashford");
        anagOrNot("Marcus", "Marcsu");
          
    }

}
