package ex16;

public class Student {
	// 인스턴스 변수 정의
	String name;
	int hakbun;
	int kor;
	int eng;
	int math;
	
	// 1. 매개변수로 받아서 초기화 하는 부분 : 생성자
	Student(int x, int y, int z) {
		kor = x;
		eng = y;
		math = z;
	}
	
	int sum() {
		int result = 0;
	// 국어 + 영어 + 수학 합계를 result에 대입
		result = kor + eng + math;
		return result;
	}
}
