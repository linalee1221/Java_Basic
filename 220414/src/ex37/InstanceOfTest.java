package ex37;

public class InstanceOfTest {

	public static void testAllPhone(Phone p) {
		
		if(p instanceof IPhone) {
			((IPhone) p).sms();
		} else if(p instanceof Galaxy) {
			((Galaxy) p).dmb();
		}
	}
	public static void main(String[] args) {

		IPhone p1 = new IPhone();
		Galaxy p2 = new Galaxy();
		
		testAllPhone(p2);
		
	}

}
