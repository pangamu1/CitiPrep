package WeeklyTest2;

//import java.util.Comparator;

public class Customer implements Comparable<Customer> {

	
		private int custId;
		private String firstName;
		private String lastName;
		private double balance;
		private String type;
		
		
		
		

		public Customer(int custId, String firstName, String lastName, double balance, String type) {
			super();
			this.custId = custId;
			this.firstName = firstName;
			this.lastName = lastName;
			this.balance = balance;
			this.type = type;
		}

		public int getCustId() {
			return custId;
		}

		

		public String getFirstName() {
			return firstName;
		}

		
		public String getLastName() {
			return lastName;
		}

		
		public double getBalance() {
			return balance;
		}

				public String getType() {
			return type;
		}

		public int compareTo(Customer compareCustomer) {
					
			if (compareCustomer.getCustId() == this.custId) {
				return 0;
			}
			else if(this.custId - compareCustomer.getCustId() > 0) {
				return 1;
			}
			else {
				return -1;
			}
		}
}
