package page261_Ex7_10;

public class Tank extends Unit {
	void move(int x, int y) {
		System.out.println("Tank[x = " + x + ", y = " + y + "]");
	}
	void changeMode() { /* 공격모드로 변환한다. */ }
}
