package multithread2;

public class BankTest {

	public static void main(String[] args) {
		DongsungBank r = new DongsungBank(); // 월드은행 생성
		
		Thread t1 = new Thread(r); // 1st Thread
		Thread t2 = new Thread(r); // 2nd Thread
		
		// 실행
		t1.start();
		t2.start();
	}
}
