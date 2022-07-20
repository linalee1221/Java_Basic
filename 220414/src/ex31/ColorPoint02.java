package ex31;

public class ColorPoint02 extends Point02 {
	
	public String color; // 색상정보 멤버변수
	
	// ColorPoint02 생성자 : 매개변수 3개짜리
	// 생성자의 목적 : 멤버변수 초기화
	public ColorPoint02(int x, int y, String color) {
		
		// 부모의 생성자를 호출
		super(x,y);
		// 자식의 멤버변수 초기화
		this.color = color;
	}
	
	// 색상정보와 좌표정보를 출력하는 메소드
	void showColorPoint02() {
		// 자식 멤버변수 출력
		System.out.print(color);
		
		// 부모 메소드
		showPoint02();
	}

}
