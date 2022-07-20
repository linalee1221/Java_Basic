package multithread;

public class WorldBank implements Runnable {
	Account acc = new Account(); // 통장

	@Override
	public void run() {
		while(acc.balance > 0) {
			// 잔액 > 0 할 동안 반복
			int money = 100; // 100원 출금
			acc.withDraw(money); // 출금 메소드 호출
			// 현재 잔액 출력
			System.out.println("잔액(" + Thread.currentThread().getName() + ") : " + acc.balance);
		}
	}
}
