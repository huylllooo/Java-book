package chapter8;

public class EmployeeTest {

	public static void main(String[] args) {
		// show that count is 0 before creating any Employee
		System.out.printf("Employees before instantiation: %d\n",
				Employee.getCount());
		
		// create two Employees; count should be 2
		Employee e1 = new Employee("Susan", "Baker");
		Employee e2 = new Employee("Bob", "Blue");
		
		// show that count is 2 after creating 2 Employees
		System.out.println("\nEmployees after instantiation: ");
		System.out.printf("via e1.getCount: %d\n", e1.getCount());
		System.out.printf("via e2.getCount: %d\n", e2.getCount());
		System.out.printf("via Employee.getCount: %d\n", Employee.getCount());
		
		e1 = null;
		e2 = null;
	}

}
