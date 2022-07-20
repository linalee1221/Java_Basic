package page304;

public class Ex8_9 {

	public static void main(String[] args) throws Exception {
		method1(); // 같은 클래스내의 static멤버이므로 객체생성없이 직접호출가능
	} // main end
	static void method1() throws Exception {
		method2();
	} // mothod1 end
	
	static void method2() throws Exception {
		throw new Exception();
	} // method2 end
}
