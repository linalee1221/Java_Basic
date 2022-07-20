package templatemethod;

public class Dog extends Animal {

	@Override
	void play() {
		System.out.println("멍! ~ 멍!");
	}
	
	// 재정의 될 메소드
	void runSomething() {
		System.out.println("멍! ~ 멍! 꼬리 살랑 살랑~");
	}

}
