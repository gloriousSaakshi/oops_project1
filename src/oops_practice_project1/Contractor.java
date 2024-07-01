package oops_practice_project1;

public class Contractor extends Employee {

	private int workingHours;
	
	public Contractor(String name, int paymentPerHour, int workingHours) {
		
		super(name, paymentPerHour);
		this.workingHours=workingHours;
		// TODO Auto-generated constructor stub
	}
	
	
	public int calculateSalary()
	{
		return getPaymentPerhour()* workingHours;
	}
	

}
