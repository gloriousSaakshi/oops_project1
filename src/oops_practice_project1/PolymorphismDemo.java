package oops_practice_project1;

public class PolymorphismDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Payment p=new CashPayment();
		p.pay();
		
		p=new CreditPayment();
		p.pay();
	}

}
