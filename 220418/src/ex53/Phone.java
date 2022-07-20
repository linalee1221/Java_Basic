package ex53;

public class Phone {
	// 멤버변수 : os, numbers 둘 다 문자열
	private String os;
	private String numbers;
	
	// 메소드 call() : 전화걸기
	//		sms() : 문자보내기
	
	public void call() {
		System.out.println("전화걸기");
	}
	
	public void sms() {
		System.out.println("문자보내기");
	}
}
