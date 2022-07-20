package ex26;

public class VIP extends CustomerList {
	
	public void show() {
		customerId = 1;
		name = "조규현";
		grade = "VIP";
		
		System.out.println(customerId + " " + name + " " + grade);
	}
	
}
