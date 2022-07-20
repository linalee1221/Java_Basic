package multithread;

public class Account {
	int balance = 100; // 통장 잔액 1000원
	
	public void withDraw(int money) {
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