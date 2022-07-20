package ex57;

public class Student {
	// 학생이름, 학년, 학생돈
	private String studentName;
	private int grade;
	private int money;
	
	// 생성자 : 이름과 돈을 초기화
	
	public Student(String studentName, int money) {
		this.studentName = studentName;
		this.money = money;
	}

	// 메소드 : 버스타기 : takeBus(Bus bus)
	public void takeBus(Bus bus) {
		bus.take(1000); // 버스 요금 1000원 소비
		// 1. 학생돈 감소
		this.money -= 1000;
	}
	
	public void takeSubway(Subway subway) {
		subway.take(1500); // 지하철 요금 1500원 소비
		this.money -= 1500;
		// 2. 학생돈 감소
	}
	
	public void showInfo() {
		// 잔액 출력 : 학생이름 + "님의 남은 돈은 " + 학생돈 + "원 입니다."
		System.out.println(this.studentName + "님의 남은 돈은 " + this.money + "원 입니다.");
	}
}
