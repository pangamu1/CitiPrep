package WeeklyTest2;

import java.util.ArrayList;
// import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
//import java.util.Comparator;

public class CustomerCalc {

	public static void main(String[] args) {
		// Customer [] cust = new Customer[10];
		
		Customer cust1 = new Customer(1001, "Marcus", "Rashford", 1900.00, "Forward");
		Customer cust2 = new Customer(1002, "Anthony", "Martial", 1200.00, "Forward");
		Customer cust3 = new Customer(1003, "Daniel", "James", 400.00, "Forward");
		Customer cust4 = new Customer(1004, "Juan", "Mata", 500.00, "Midfielder");
		Customer cust5 = new Customer(1005, "Bruno", "Fernandes", 250.00, "Midfielder");
		Customer cust6 = new Customer(1006, "Jesse", "Lingard", 100.00, "Midfielder");
		Customer cust7 = new Customer(1007, "Nemanja", "Matic", 200.00, "Midfielder");
		Customer cust8 = new Customer(1008, "Fred", "Rodriguez", 400.00, "Midfielder");
		Customer cust9 = new Customer(1009, "Harry", "Magurie", 200.00, "Defender");
		Customer cust10 = new Customer(1010, "Aaron", "Wan-Bissaka", 150.00, "Defender");
		
		/*cust[0] = cust1;
		cust[1] = cust2;
		cust[2] = cust3;
		cust[3] = cust4;
		cust[4] = cust5;
		cust[5] = cust6;
		cust[6] = cust7;
		cust[7] = cust8;
		cust[8] = cust9;
		cust[9] = cust10;
		*/
		//Arrays.sort(cust);
		
		ArrayList<Customer> aList = new ArrayList<Customer>();
		
		aList.add(cust1);
		aList.add(cust2);
		aList.add(cust3);
		aList.add(cust4);
		aList.add(cust5);
		aList.add(cust6);
		aList.add(cust7);
		aList.add(cust8);
		aList.add(cust9);
		aList.add(cust10);
		
		Collections.sort(aList, new BalanceComparatorClass());
		for (Customer x: aList) {
			if(x.getBalance() > 1000) {
				System.out.println(x.getFirstName() + " " + x.getBalance() );
			}
			
		}
		
		ArrayList<String> aListName = new ArrayList<String>();
		for (Customer x: aList) {
			aListName.add(x.getFirstName() + " " + x.getLastName());
		}
		System.out.println(aListName);
		
		HashMap<Integer,Customer> map = new HashMap<Integer,Customer>();
		for (Customer x: aList) {
			map.put(x.getCustId(), x);
		}
		System.out.println(map);
	}

	
}
