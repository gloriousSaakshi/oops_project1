package oops_practice_project1;

public class Dog extends Animal{

	public Dog() {
		// TODO Auto-generated constructor stub
	}
	
	public void bark()
	{
		System.out.println("Dog " + getId()+ " is barking");
	}
	public void sound()
	{
		bark();
	}

}
