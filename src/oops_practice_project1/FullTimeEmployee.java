package oops_practice_project1;

public class FullTimeEmployee extends Employee{

	
	public FullTimeEmployee(String name, int paymentPerHour) {
		super(name,paymentPerHour);
		// TODO Auto-generated constructor stub
	}
	
	public int calculateSalary()
	{
		return getPaymentPerhour() * 8;
	}


}
