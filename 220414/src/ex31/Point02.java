package ex31;

public class Point02 {
	public int x, y; // 좌표 저장
	
	// 기본생성자 : 멤버변수 초기화
	public Point02() {
		this.x = 0;
		this.y = 0;
		
	}
	
	public Point02(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	// 좌표 출력 메소드
	public void showPoint02() {
		System.out.println("(" + x + ", " + y + ")");
		
	}
}
