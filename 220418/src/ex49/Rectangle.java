package ex49;

public class Rectangle {

	// 멤버변수(속성) : 너비, 높이
	int width;
	int height;

	// 멤버 메소드(기능) : 면적 계산하기(너비x높이) + 출력, 테두리 길이 계산하기(너비+높이)*2 + 출력
	// 자동 줄맞춤 Ctrl + Shift + F
	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}

	public Rectangle() {
		width = 0;
		height = 0;
	}
	
	// 면적 계산용 메소드
	public void area() {
		int value = width * height;
		System.out.println("면적 : " + value);
	}
	
	// 둘레 계산용 메소드
	public void round() {
		int value = (width + height) * 2;
		System.out.println("둘레 : " + value);
	}

}
