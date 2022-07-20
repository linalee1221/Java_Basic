package template2;

public abstract class Car {
	

	
	// 차 운전 시작 메소드
	// 1. 시동 켜기 메소드
	public void startCar() {
		System.out.println("시동을 켭니다.");
	}
	
	// 2. 차 몰기 메소드
	public abstract void drive();
	
	// 3. 차 정지하기 메소드
	public abstract void stop();
	
	// 4. 시동 끄기 메소드
	public void endCar() {
		System.out.println("시동을 끕니다.");
	}
	
	// 템플릿 메소드
	// 변수 final : 상수
	// 메소드 final : override 못하게 막음
	final public void run() {
		startCar(); // 고정
		drive(); // 오버라이딩 메소드(변화)
		stop(); // 오버라이딩 메소드(변화)
		endCar(); // 고정
	}
	
}
