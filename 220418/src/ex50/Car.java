package ex50;

public class Car {
	// 멤버변수 : 이름, 메이커, 가격
	// 생성자 2개 : 매개변수 없는 생성자, 매개변수 3개짜리 생성자
	private String name;
	private String maker;
	private int price;
	
	public Car(String name, String maker, int price) {
		this.name = name;
		this.maker = maker;
		this.price = price;
	}

	public Car() {
	}
	
	// 메소드 : 멤버변수의 값을 출력할 메소드
	
	public void displayCar() {
		System.out.println("차량이름 : " + name);
		System.out.println("제조사 : " + maker);
		System.out.println("가격 : " + price);
		
	}
}
