package ex26;

public class CustomerTest {

	public static void main(String[] args) {
		// VIP, Gold, Silver
		// 속성 : 고객ID
		//		 고객이름
		//		 고객등급
		// 기능 : draw() : 여러분은 동성쇼핑몰 고객입니다.
		//		 show() : 고객ID, 고객이름, 고객등급 출력
		
		// 위의 고객들을 생성하고 기능을 출력하세요
		
		VIP vip = new VIP();
		Gold gold = new Gold();
		Silver silver = new Silver();
		
		vip.draw();
		vip.show();
		System.out.println("========================");
		gold.draw();
		gold.show();
		System.out.println("========================");
		silver.draw();
		silver.show();
		System.out.println("========================");
	}

}
