package DTO03;

public class DTO {

	int x; // x좌표
	int y; // y좌표
	
	// 좌표 출력용 메소드
	void showPoint() {
		// 좌표 출력
		System.out.println("x : " + this.x + ", y : " + this.y);
	}
	
	
	// 좌표 저장용 메소드
	void set(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
}
