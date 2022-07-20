
public class practice3_4_5 {

	public static void main(String[] args) {
		
		System.out.println("[연습문제 3-3]");
		int num = 456;
		System.out.println(num/100*100);
		System.out.println("===============");
		System.out.println("[연습문제 3-4]");
		
		int numOfApples = 123; // 사과의 개수
		int sizeOfBucket = 10; // ( ) 바구니의 크기 바구니에 담을 수 있는 사과의 개수
		int numOfBucket = 
		numOfApples/sizeOfBucket + (numOfApples%sizeOfBucket > 0 ? 1 : 0) ;
		System.out.println(" :"+numOfBucket); 
		//필요한 바구니의 수
		
		System.out.println("===============");
		System.out.println("[연습문제 3-5]");

		int num2 = 10;
		System.out.println(num > 0 ? "양수":  (num < 0 ? " 음수 " : "0"));

	}

}
