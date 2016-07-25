package chapter8;

public class Employee {
	private String firstName;
	private String lastName;
	private static int count = 0; // number of Employees created
	
	// initialize Employee, add 1 to static count and
	// output String indicating that constructor was called
	public Employee(String first, String last) {
		firstName = first;
		lastName = last;
		
		++count;
		System.out.printf("Employee constructor: %s %s; count = %d\n", 
				firstName, lastName, count);
	} // end Employee constructor
	
	// get first name
	public String getFirstName() {
		return firstName;
	}
	
	// get last name
	public String getLastName() {
		return lastName;
	}
	
	// static method to get static count value
	public static int getCount() {
		return count;
	}
}
