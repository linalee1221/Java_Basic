package ex28;

public class ColorPoint extends Point{
	// 색상정보를 저장하는 멤버변수
	public String color;
	
	// 색상정보를 저장하는 메소드
	public void setColor(String color) {
		this.color = color;
	}
	
	// 색상정보와 좌표정보를 출력하는 메소드
	public void showColorPoint() {
		// 부모 메소드 + 자식 변수 조립해서 출력
		System.out.println(color);
		showPoint();
	}
}
