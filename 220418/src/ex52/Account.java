package ex52;

public class Account {
	// 멤버변수 : 이름, 잔액, 패스워드
	private String name;
	private int balance;
	private int password;
	
	// 생성자 : 매개변수 3개짜리
	public Account(String name, int balance, int password) {
		this.name = name;
		this.balance = balance;
		this.password = password;
	}
	
	// 메소드 : doposit(입금액, 패스워드)
	// 매개변수 패스워드와 멤버변수 패스워드가 일치할 때만 
	// 입금액을 증가 시킴
	// 출력 1 : 이름 + "고객님" + 입금액 + "원이 입금되었습니다."
	// 출력 2 : "현재 잔액은 : " + 잔액 + "원 입니다." 
	// 비밀번호가 일치 하지 않을 때
	// 출력 1 : "비밀번호가 일치하지 않습니다."
	// 출력 2 : "다시 입력해 주세요."
	
	public void deposit(int money, int pwd) {
		if(pwd == this.password) {
			this.balance += money; // 잔액증가(잔액+입금액)
			System.out.println(this.name + " 고객님 " + money + "원이 입금되었습니다.");
			System.out.println("현재 잔액은 " + this.balance + "원 입니다." );
		} else {
			System.out.println("비밀번호가 일치하지 않습니다.");
			System.out.println("다시 입력해 주세요.");
		}
	}
}
