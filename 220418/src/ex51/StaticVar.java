package ex51;

public class StaticVar {
	public int x = 0; // 일반변수
	public static int y = 0; // 전역변수
	
	// 멤버 메소드
	public void increase() {
		x++;
		y++;
	}
}
