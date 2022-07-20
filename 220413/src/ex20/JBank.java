package ex20;

public class JBank {
	
	String name;
	int balance;
	
	JBank() {}
	
	// 생성자 매개변수 2개 있는 걸로 정의
	JBank(String name, int balance) {
		this.name = name;
		this.balance = balance;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	

}
