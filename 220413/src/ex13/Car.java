package ex13;

public class Car {
	String color; // 색상
	String gearType; // 변속기 종류 - auto(자동), manual(수동)
	int door; // 문의 개수
	
	Car() {}
	
	// 매개변수 3개짜리 생성자
	Car(String c, String g, int d) {
		color = c;
		gearType = g;
		door = d;
	}
}
