package ex28;

public class ColorPointTest {

	public static void main(String[] args) {
		// Point 객체 생성
		Point p = new Point();
		
		// 좌표가 설정됨
		p.set(1, 2);
		p.showPoint(); // 좌표 출력
		
		// ColorPoint 객체 생성
		ColorPoint cp = new ColorPoint();
		cp.set(3, 4);
		cp.setColor("red");
		cp.showColorPoint(); // 좌표와 색상정보 출력
	}

}
