package ex51;

public class StaticVarTest {

	public static void main(String[] args) {
		StaticVar sv1 = new StaticVar();
		// 일반, 전역변수 각 1씩 증가시키기
		sv1.increase();
		System.out.println("일반변수 x : " + sv1.x + ", 전역변수 y : " + sv1.y);
		
		System.out.println("");
		
		StaticVar sv2 = new StaticVar();
		// 일반, 전역변수 각 1씩 증가시키기
		sv2.increase();
		System.out.println("일반변수 x : " + sv2.x + ", 전역변수 y : " + sv2.y);
		
		System.out.println("");
		
		StaticVar sv3 = new StaticVar();
		// 일반, 전역변수 각 1씩 증가시키기
		sv3.increase();
		System.out.println("일반변수 x : " + sv3.x + ", 전역변수 y : " + sv3.y);
	}

}
