package oops_practice_project1;

public abstract class Employee {
	
	private String name;
	private int paymentPerHour;
	
	public Employee(String name, int paymentPerHour)
	{
		this.name=name;
		this.paymentPerHour=paymentPerHour;
	}
	public abstract int calculateSalary();
	
	public String getName()
	{
		return name;
	}
	
	public void setname(String name) {
		this.name= name;
	}
	public int getPaymentPerhour()
	{
		return paymentPerHour;
	}
	 public void setPaymentPerHour(int paymentPerHour)
	 {
		 this.paymentPerHour=paymentPerHour;
	 }

	public Employee() {
		// TODO Auto-generated constructor stub
	}

}
