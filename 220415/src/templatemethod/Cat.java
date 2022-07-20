package templatemethod;

public class Cat extends Animal {

	@Override
	void play() {
		System.out.println("야옹~ 야옹~");
	}
	
	// 재정의 될 메소드
	void runSomething() {
		System.out.println("야옹~ 야옹~ 꼬리 살랑 살랑~");
	}

}
