package ex44;

public class SmartPhone implements MP3Interface, PhoneInterface {

	@Override
	public void sendCall() {
		System.out.println("따르릉");
	}

	@Override
	public void receiverCall() {
		System.out.println("전화 왔어요!");
	}

	@Override
	public void sendSMS() {
		System.out.println("문자갑니다");
	}

	@Override
	public void reveiveSMS() {
		System.out.println("문자왔어요");
	}

}
