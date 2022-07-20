package ex33;

public class Student extends Person {
	public void set() {
		age = 30; // 접근 가능(전체 공개)
		name = "홍길동"; // 공개
		height = 175; // 자식만 가능
//		weight = 99; private으로 해놨으므로 안됨
		setWeight(99); // 메소드를 통해 저장
		
	}
}
