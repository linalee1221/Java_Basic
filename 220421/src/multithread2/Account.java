package multithread2;

public class Account {
	int balance = 1000; // 통장 잔액 1000원
	
	// 통장에서 돈 인출하기 메소드
	// lock 설정
	public synchronized void withDraw(int money) {
		if(balance >= money) {
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				System.out.println("에러가 발생했습니다.");
			}
			balance -= money;
		}
	}
}
