package oops_practice_project1;

public class Person {

	private double id;
	private String name;
	
	public Person() {
		
		id=Math.random();
		sayHello();
		
		// TODO Auto-generated constructor stub
	}
	
	private void sayHello()
	{
		System.out.println("hello - " + getId());
	}
	
	public double getId()
	{
		return id;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setName(String name)
	{
		this.name= name;
	}
	
	
	
	

}
