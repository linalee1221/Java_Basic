package ex20;

public class BankTest {

	public static void main(String[] args) {
		// 홍길동 씨가 통장을 개설했습니다.
		JBank hong = new JBank("홍길동", 12500);

		// 이순신 씨가 통장을 개설했습니다.
		JBank lee = new JBank("이순신", 59000);
		
		hong.setBalance(30000);
		lee.setBalance(70000);
		
		
		// 홍길동씨가 통장에 30000원을 입금했습니다.
		// 이순신씨가 통장에 70000원을 입금했습니다.
		// setter 재 저장
		
		// 홍길동씨 통장 금액은 30000원 입니다.
		// 이순신씨 통장 금액은 70000원 입니다.
		// getter 출력
		
		System.out.println(hong.getName() + "씨가 통장에 " + hong.getBalance() + "원을 입금했습니다.");
		System.out.println(lee.getName() + "씨가 통장에 " + lee.getBalance() + "원을 입금했습니다.");
	}

}
