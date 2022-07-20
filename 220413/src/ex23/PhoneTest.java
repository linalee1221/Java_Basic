package ex23;

public class PhoneTest {

	public static void main(String[] args) {
		IPhone iphone = new IPhone();
		Galaxy galaxy = new Galaxy();
		
		iphone.call();
		iphone.sms();
		
		galaxy.dmb();
	}

}
