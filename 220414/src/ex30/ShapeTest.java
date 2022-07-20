package ex30;

public class ShapeTest {
	
	public static void main(String[] args) {
		
		Shape shape = new Shape(); // 모양
		Line line = new Line(); // 선, Shape 상속받기
		Rect rect = new Rect(); // 사각형, Shape 상속받기
		Circle circle = new Circle(); // 원, Shape 상속받기
		
		shape.draw(); // 출력 : Shape
		line.draw(); // 출력 : Line
		rect.draw(); // 출력 : Rect
		circle.draw(); // 출력 : Circle
		
	}

	

}
