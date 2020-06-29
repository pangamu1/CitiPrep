package IfElseProblem;

import java.time.temporal.ValueRange;
import java.util.Scanner;
import java.util.stream.IntStream;

public class IfElse {
	private static Scanner scanVar = new Scanner(System.in);
	
	public static void main(String[] args) {
		int N = scanVar.nextInt();
		
		ValueRange ranges = ValueRange.of(0, 100);
		
		if(ranges.isValidValue(N) && (N % 2 ==0)) {
			IntStream intStream=IntStream.range(2, 5);
			//intStream.anyMatch(predicate)
			
			System.out.println(intStream);
			if(IntStream.range(2, 5) != null) {
				System.out.println("Not Weird");
			}
			else if(IntStream.range(6, 21) != null){
				System.out.println("Weird");
			}
			else if( N >20 ) {
				System.out.println("Not Weird");
			}
		}
		else if(ranges.isValidValue(N) && (N % 2 != 0)) {
			System.out.println("weird");
		}
			
	}

}
