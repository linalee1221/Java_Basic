package ex53;

public class PhoneTest {

	public static void main(String[] args) {
		// 아이폰과 갤럭시의 기능을 모두 출력하세요
		
		IPhone iphone = new IPhone();
		Galaxy galaxy = new Galaxy();
		
//		iphone.call();
//		iphone.sms();
//		iphone.facetime();
//		iphone.itunes();
//		
//		System.out.println("==================");
//		
//		galaxy.call();
//		galaxy.sms();
//		galaxy.dmb();
//		galaxy.navi();
//
//		System.out.println("==================");
		
		// 다형성 메소드 : 매개변수로 부모클래스가 있는 메소드
		testAllPhone(iphone);
		testAllPhone(galaxy);
	}

		
	public static void testAllPhone(Phone p) {
		p.call();
		p.sms();
		
		if(p instanceof IPhone) {
			IPhone iphone = (IPhone)p;
			iphone.facetime();
			iphone.itunes();
		} else if(p instanceof Galaxy) {
			Galaxy galaxy = (Galaxy)p;
			galaxy.dmb();
			galaxy.navi();
		}
	}
}
