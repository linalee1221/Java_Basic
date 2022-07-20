package ex50;

public class CarTest {

	public static void main(String[] args) {
		// Car 정보 출력
		// 생성자 매개변수 : "미니쿠페", "BMW", 40,000,000
		
		Car car = new Car("미니쿠페", "BMW", 40000000);
		
		car.displayCar();
	}

}
