package ex13;

public class Ex6_12 {

	public static void main(String[] args) {
		// 기본 생성자를 이용해서 객체 생성
		// 나쁜 코딩
		Car c1 = new Car();
		
		// c1 객체에 초기화 작업
		c1.color = "white";
		c1.gearType = "auto";
		c1.door = 4;
		
		
		// 좋은 코딩
		Car c2 = new Car("white", "auto", 4);
		
		System.out.println("c1의 color = " + c1.color + ", gearType = " + c1.gearType + ", door = " + c1.door);
		System.out.println("c2의 color = " + c2.color + ", gearType = " + c2.gearType + ", door = " + c2.door);
	}

}
