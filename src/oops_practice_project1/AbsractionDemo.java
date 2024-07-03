package oops_practice_project1;

public class AbsractionDemo {

	public static void main(String[] args) {
		
		Employee contractor = new Contractor("contractor",8, 10);
		Contractor obj1= new Contractor("contractor",8, 10);
		Employee fullTimeEmployee = new FullTimeEmployee("Full Time Employee", 8);
		Contractor obj1= new Contractor("contractor",8, 10);
		
		System.out.println(contractor.calculateSalary());
		System.out.println(fullTimeEmployee.calculateSalary());
		//System.out.println(obj1.calculateSalary());
		// TODO Auto-generated method stub

	}

}
