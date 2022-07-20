package ex43;

public class Driver {

	public static void main(String[] args) {
		
		// interface의 전역 상수를 불러 올 수 있음
		System.out.println(Speakable.zeroPoint);
		System.out.println(Speakable.PI);
		
		
		// 인터페이스를 구현한 메소드를 호출
		Specker reporter = new Specker();
		reporter.sayYes();
	}

}
