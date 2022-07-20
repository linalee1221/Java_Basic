package ex44;

public class InterfaceTest {

	public static void main(String[] args) {
		
		SmartPhone smartphone = new SmartPhone();
		
		smartphone.sendCall();
		smartphone.receiverCall();
		smartphone.sendSMS();
		smartphone.reveiveSMS();
	}

}
