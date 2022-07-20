package ex28;

// 클래스 설명 : 좌표 정보를 저장 및 출력하는 클래스
public class Point {
	
// 한 점을 구성하는 x, y 좌표
	
	public int x, y;
	
	public void set(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
// 좌표 정보를 출력하는 메소드
	public void showPoint() {
		System.out.println("(" + x + ", " + y + ")");
	}
}
