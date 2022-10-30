public class Employee extends Person {
	private int empID;
	private double baseSalary;

	public Employee(String last, String first, String middle) {
		super(last, first, middle);
	}

	public Employee(String last, String first, String middle, int id, double sal) {
		super(last, first, middle);
		empID = id;
		baseSalary = sal;
	}
	
	public void setID(int id) {
		empID = id;
	}
	
	public void setSalary(double sal) {
		baseSalary = sal;
	}

}