package ex57;

public class Subway {
	// 멤버변수 : 지하철노선번호, 승객수, 지하철돈
	String trainNumber;
	int passengerCount;
	int money;
	
	// 매개변수 1개짜리 생성자 : 지하철노선번호
	public Subway(String trainNumber) {
		this.trainNumber = trainNumber;
	}
	
	// 승객이 낸 돈을 받는 메소드
	public void take(int money) {
		// 지하철돈 증가
		this.money += money;
		// 승객수 증가
		this.passengerCount++;
	}
	
	// 지하철의 승객수와 지하철잔액을 출력
	public void showInfo() {
		// print 출력 : "지하철 " + 지하철번호 + "번의 승객은 " + 승객수 + "명이고, 수입은 " + 지하철돈 + "원 입니다."
		System.out.println("지하철 " + this.trainNumber + " 열차의 승객은 " + this.passengerCount + "명이고, 수입은 " + this.money + "원 입니다.");
	}
	
}
