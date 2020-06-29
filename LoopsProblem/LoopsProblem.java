package LoopsProblem;

import java.util.Scanner;

public class LoopsProblem {
	
	public static void main(String[] args) {
		Scanner scanVar = new Scanner(System.in);
		int N = scanVar.nextInt();
		
		for (int i =1; i <=10; i++) {
			System.out.println(N + " x " + i + " = " + (N*i));
		}
		scanVar.close();
	} 
	 /* public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        int N = in.nextInt();

	        for(int i = 1; i <= 10; i++){

	            System.out.printf("%d x %d = %d%n", N, i, N*i);
	        }
	        in.close();
	    } */
}
