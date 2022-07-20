package templatemethod;

public abstract class Animal {
	// 추상 메소드
	// 1. 클래스 : print 출력 : "야옹~ 야옹~"
	// 2. 클래스 : print 출력 : "멍! ~ 멍!"
	abstract void play();
	
	
	// 1. 오버라이딩 할 메소드 : print 출력 : "야옹~ 야옹~ 꼬리 살랑 살랑~"
	// 2. 오버라이딩 할 메소드 : print 출력 : "멍! ~ 멍! 꼬리 살랑 살랑~"
	void runSomething() {
		System.out.println("꼬리 살랑 살랑~");
	}
	
	// 템플릿 메서드
	
	public void playWithOwner() {
		System.out.println("귀염둥이 이리온....");
		play();
		runSomething();
		System.out.println("잘했어");
	}
}
