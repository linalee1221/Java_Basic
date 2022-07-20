package ex57;

public class TakeTransTest {

	public static void main(String[] args) {
		Student jamse = new Student("james", 5000);
		Student tomas = new Student("Tomas", 5000);
		
		Bus bus100 = new Bus(100); // 100번 버스 생성
		Subway line1 = new Subway("1호선"); // 1호선 라인 지하철 생성
		jamse.takeBus(bus100); // 100번 버스를 탑니다.
		tomas.takeBus(bus100); // 100번 버스를 탑니다.
		
		// 학생 정보 출력
		jamse.showInfo();
		tomas.showInfo();
		
		// 버스 정보 출력
		bus100.showInfo();
		
		System.out.println();
		
		// 1호선 지하철 타기
		jamse.takeSubway(line1);
		tomas.takeSubway(line1);
		
		// 학생 정보 출력
		jamse.showInfo();
		tomas.showInfo();
		
		// 지하철 정보 출력
		line1.showInfo();
		
	}

}
