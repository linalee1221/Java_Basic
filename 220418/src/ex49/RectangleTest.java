package ex49;

public class RectangleTest {

	public static void main(String[] args) {
		// 1. 객체 생성 : 초기값 없이
		// 2. 기능 사용 : 면적계산 메소드 호출, 둘레계산 메소드 호출
		
		Rectangle rectangle = new Rectangle();
		
		rectangle.area();
		rectangle.round();
		
		// 3. 객체 생성 : 매개변수(30,50)
		// 4. 기능 사용 : 면적계산 메소드 호출, 둘레계산 메소드 호출
		
		Rectangle rectangle2 = new Rectangle(30,50);
		rectangle2.area();
		rectangle2.round();
	}

}
