package ex48;

public class Product {
	
	String no;
	String name;
	int price;
	double discountRate;
	
	public Product(String no, String name, int price, double discountRate) {
		this.no = no;
		this.name = name;
		this.price = price;
		this.discountRate = discountRate;
	}
	
	
	// 멤버변수 출력용 메소드
	public void info() {
		System.out.println("no = " + this.no + 
						   ", name = " + this.name + 
						   ", price = " + this.price + 
						   ", discountRate = " + this.discountRate);
	}
	
	


}
