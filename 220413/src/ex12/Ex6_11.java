package ex12;

// 생성자 없음 : 생성자가 없을 경우 자바가 자동 생성해줌
class Data_1 {
	int value;
}

class Data_2 {
	int value; // 매개변수 없는 생성자를 하나 반드시 만들어줘야 한다. 목적 : 인스턴스 변수 초기화
	
// 아래가 매개변수 없는 기본 생성자
	Data_2() {
		
	}
// 이게 없으면 컴파일 에러가 난다.
	
	Data_2(int x) {
		value = x; // 개발자 정의 : 매개변수 1개짜리 생성자 만들기 전에 매개변수 없는 기본 생성자를 반드시 만들어야 함.
	}
}

public class Ex6_11 {
	public static void main(String[] args) {
		Data_1 d1 = new Data_1();
		Data_2 d2 = new Data_2();
	}
}
