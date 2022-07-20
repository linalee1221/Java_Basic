package ex45;

public class PrinterTest {
	
	public static void main(String[] args) {
		// 객체 생성
		LaserPrinter p1 = new LaserPrinter();
		ColorPrinter p2 = new ColorPrinter();
		
		// 각각 출력
		p1.print();
		p2.print();
	}

}
