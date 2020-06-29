package WeeklyTest2;

import java.util.Comparator;

public class BalanceComparatorClass implements Comparator<Customer> {

	@Override
	public int compare(Customer o1, Customer o2) {
		// TODO Auto-generated method stub
		if(o1.getBalance() > o2.getBalance()) {
			return -1;
		}
		else if(o1.getBalance() < o2.getBalance()){
			return 1;
		}
		else {
			return 0;
		}
		//return o1.getFirstName().compareTo(o2.getFirstName());
	}

}
