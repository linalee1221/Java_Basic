

public class ClassInstance {

	public static class StaticTest {
		static int classVar = 10;
		int instanceVar = 20;
	}
	public static void main(String[] args) {
		StaticTest staticTest1 = new StaticTest();
		StaticTest staticTest2 = new StaticTest();
		
		System.out.println("1. " + StaticTest.classVar + ", " + staticTest1.instanceVar);

		System.out.println("2. " + StaticTest.classVar + ", " + staticTest2.instanceVar);
		
		staticTest1.classVar = 12; // 객체1 classVar 값을 12로 변경
		staticTest1.instanceVar = 400; // 객체1 instanceVar 값을 400으로 변경
		
		System.out.println("----------------------------------");
		// 객체1 값을 출력
		System.out.println("1. " + staticTest1.classVar + staticTest1.instanceVar);
		// 객체2 값을 출력
		System.out.println("2. " + staticTest2.classVar + staticTest2.instanceVar);
	}

}
