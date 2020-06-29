package SubStringProblem;

import java.util.Scanner;

public class SubString{
	public static void print(String str){
    System.out.println(str);
}
public static void main(String[] args) {
   
	Scanner scanVar = new Scanner(System.in);
    String S = scanVar.next(); // until spaces in input
    int start = scanVar.nextInt(); 
    int end = scanVar.nextInt();
    String str="";
    for(int i=start;i<end;i++){
        str = str + S.charAt(i);
    }
    print(str);
    
    scanVar.close();
    
}
}
