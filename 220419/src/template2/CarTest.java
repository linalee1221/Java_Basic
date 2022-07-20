package template2;

public class CarTest {

	public static void main(String[] args) {
		System.out.println("===== 자율주행 하는 자동차 =====");
		// drive() 메소드
		// print 출력 : "자율 주행 합니다."
		// print 출력 : "자동차가 스스로 방향을 전환합니다."
		// stop() 메소드 : "스스로 멈춥니다."
		Car car = new AICar();
		car.run();

		System.out.println("===== 사람이 운전하는 자동차 =====");
		
		// drive() 메소드
		// print 출력 : "사람이 운전합니다."
		// print 출력 : "사람이 핸들을 조작합니다."
		// stop() 메소드 : "브레이크로 멈춥니다."
		Car car2 = new ManualCar();
		car2.run();

	
	
	
	
	
	}

}
