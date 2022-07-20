package ex29;

public class CustomerTest_ex {

	public static void main(String[] args) {
		// VIP, Gold, Silver
		// 속성 : 고객ID
		//		 고객이름
		//		 고객등급
		// 기능 : show() : 최초에 가입한 당신은 동성쇼핑몰 General 등급입니다.
		//		 VIP, Gold, Silver : 고객ID, 고객이름, 고객등급 출력
		// 고객 ID : 1, 2, 3
		// 고객이름 : "홍길동","이순신","브래드"
		// 고객등급: "VIP", "Gold", "Silver"
		
		// 위의 고객들을 생성하고 기능을 출력하세요
		
		// 일반 가입
		CustomerList_ex customerEx = new CustomerList_ex();
		customerEx.show();
		
		Silver_ex silverEx = new Silver_ex();
		silverEx.show();
		
		Gold_ex goldEx = new Gold_ex();
		goldEx.show();
		
		VIP_ex vipEx = new VIP_ex();
		vipEx.show();
		
	}

}
