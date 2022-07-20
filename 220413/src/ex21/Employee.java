package ex21;

public class Employee {
	String number;
	String name;
	int pay;
	
	Employee() {}
	
	Employee(String number,	String name, int pay) {
		this.number = number;
		this.name = name;
		this.pay = pay;
	}
	
	public void addSal(int pay) {
		this.pay += pay; 
	}
	
	
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPay() {
		return pay;
	}
	public void setPay(int pay) {
		this.pay = pay;
	}
	
	
	
}
