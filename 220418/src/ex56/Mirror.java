package ex56;

public interface Mirror {
	// 모든 메소드가 추상메소드 형태(메소드 이름만 있음)
	// 멤버변수 X 모두 상수
	
	// 상수
//	public static final int MAX_AGE = 5;
	int MAX_AGE = 5;
	
	void autoClose(); // 미러 자동 접힘
	void control(); // 거울 각도 자동 조절됨
}
