package ex57;

public class Bus {
	// 멤버변수 : 버스 번호, 승객 수, 버스돈
	int busNumber;
	int passengerCount;
	int money;
	
	// 매개변수 1개짜리 생성자 : 버스번호
	public Bus(int busNumber) {
		this.busNumber = busNumber;
	}
	
	// 승객이 낸 돈을 받는 메소드
	public void take(int money) {
		// 버스돈 증가
		this.money += money;
		// 승객수 증가
		this.passengerCount++;
	}
	


	// 버스의 승객수와 버스잔액을 출력
	public void showInfo() {
		// print 출력 : "버스 " + 버스번호 + "번의 승객은 " + 승객수 + "명이고, 수입은 " + 버스돈 + "원 입니다."
		System.out.println("버스 " + this.busNumber + "번의 승객은 " + this.passengerCount + "명이고, 수입은 " + this.money + "원 입니다.");
	}
}
