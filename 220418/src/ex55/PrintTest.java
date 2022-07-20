package ex55;

public class PrintTest {
		
		// 전역 메소드
		public static void testAllPrint(Print p) {
			// 오버라이딩 메소드는 형변환이 필요없음
			// (부모자식간의) 일반메소드 형변환이 필요함
			p.print();
		}
		
		public static void main(String[] args) {
			
			LaserPrinter p1 = new LaserPrinter();
			ColorPrinter c1 = new ColorPrinter();
		
		// 부모에 들어갈 메소드 : print()
		testAllPrint(p1); // 출력 : "레이저로 선명하게 출력"
		testAllPrint(c1); // 출력 : "컬러로 출력합니다."
		
		}
	}
