package page297_299;

public class Ex8_5 {

	public static void main(String[] args) {
		System.out.println(1);
		System.out.println(2);
		
		try {
			System.out.println(3);
			System.out.println(0/0); // 예외발생!!
			System.out.println(4); // 실행되지 않음
		} catch (ArithmeticException ae) {
			ae.printStackTrace(); // 참조변수 ae를 통해, 생성된 ArithmeticException 인스턴스에 접근 가능
			System.out.println("예외 메시지 : " + ae.getMessage());
		} // try-catch end
		
		System.out.println(6);
	} // main end

}
