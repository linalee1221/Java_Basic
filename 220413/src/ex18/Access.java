package ex18;

public class Access {

	public static void main(String[] args) {
		Sample aClass = new Sample();
		
		// setter로 값을 저장하고 getter로 출력
		// a = 10, b = 20, c = 30
		// 출력 : a = 10 , b = 20 , c = 30
		aClass.setA(10);
		aClass.setB(20);
		aClass.setC(30);
		System.out.println("a = " + aClass.getA() + ", "
							+ "b = " + aClass.getB() + ", "
							+ "c = " + aClass.getC());
	}

}
