import java.util.Scanner;

public class Ex4_1_7 {

	public static void main(String[] args) {
		
		System.out.println("[Ex4_1]");
		int score = 80;

		if (score > 60) {
			System.out.println("합격입니다.");
		}
		
		System.out.println("========================");
		System.out.println("[Ex4_2]");
		int x = 0;
		System.out.printf("x=%d 일 때, 참인 것은%n", x);

		if(x==0) System.out.println("x==0");
		if(x!=0) System.out.println("x!=0");
		if(!(x==0)) System.out.println("!(x==0)");
		if(!(x!=0)) System.out.println("!(x!=0)");

		x = 1;
		System.out.printf("x=%d 일 때, 참인 것은%n", x);

		if(x==0) System.out.println("x==0");
		if(x!=0) System.out.println("x!=0");
		if(!(x==0)) System.out.println("!(x==0)");
		if(!(x!=0)) System.out.println("!(x!=0)");
		
		System.out.println("========================");
		System.out.println("[Ex4_3]");
		
		System.out.print("숫자를 하나 입력하세요.>");
		Scanner scanner = new Scanner(System.in);
		int input = scanner.nextInt(); // 화면을 통해 입력받은 숫자를 input에 저장

		if(input==0) {
			System.out.println("입력하신 숫자는 0입니다.");	
		} else { // input!=0인 경우
			System.out.println("입력하신 숫자는 0이 아닙니다.");
		}
		
		System.out.println("========================");
		System.out.println("[Ex4_4]");
		
		int score1  = 0;   // 점수를 저장하기 위한 변수
		char grade =' ';  // 학점을 저장하기 위한 변수. 공백으로 초기화한다.

		System.out.print("점수를 입력하세요.>");
		Scanner scanner1 = new Scanner(System.in);
		score1 = scanner1.nextInt(); // 화면을 통해 입력받은 숫자를 score에 저장

		if (score1 >= 90) {         // score가 90점 보다 같거나 크면 A학점
			 grade = 'A';             
		} else if (score1 >=80) {   // score가 80점 보다 같거나 크면 B학점 
			 grade = 'B'; 
		} else if (score1 >=70) {   // score가 70점 보다 같거나 크면 C학점 
			 grade = 'C'; 
		} else {                   // 나머지는 D학점
			 grade = 'D'; 
		}
		System.out.println("당신의 학점은 "+ grade +"입니다.");
		
		
		System.out.println("========================");
		System.out.println("[Ex4_5]");
		
		int  score2 = 0;
		char grade2 = ' ', opt = '0';

		System.out.print("점수를 입력해주세요.>");

		Scanner scanner2 = new Scanner(System.in);
		score2 = scanner2.nextInt(); // 화면을 통해 입력받은 점수를 score에 저장

		System.out.printf("당신의 점수는 %d입니다.%n", score2);

		if (score2 >= 90) {           // score가 90점 보다 같거나 크면 A학점(grade)
			grade2 = 'A';
			if (score2 >= 98) {        // 90점 이상 중에서도 98점 이상은 A+
				opt = '+';	
			} else if (score2 < 94) {  // 90점 이상 94점 미만은 A-
				opt = '-';
			}
		} else if (score2 >= 80){     // score가 80점 보다 같거나 크면 B학점(grade)
			grade2 = 'B';
			if (score2 >= 88) {
				opt = '+';
			} else if (score2 < 84)	{
				opt = '-';
			}
		} else {                     // 나머지는 C학점(grade)
			grade2 = 'C';
		}	
		System.out.printf("당신의 학점은 %c%c입니다.%n", grade2, opt);
		
		
		System.out.println("========================");
		System.out.println("[Ex4_6]");
		
		System.out.print("현재 월을 입력하세요.>");

		Scanner scanner3 = new Scanner(System.in);
		int month = scanner3.nextInt();  // 화면을 통해 입력받은 숫자를 month에 저장

		switch(month) {
			case 3: 
			case 4: 
			case 5:
				System.out.println("현재의 계절은 봄입니다.");
				break;
			case 6: case 7: case 8:
				System.out.println("현재의 계절은 여름입니다.");
				break;
			case 9: case 10: case 11:
				System.out.println("현재의 계절은 가을입니다.");
				break;
			default:
	//		case 12:	case 1: case 2:
				System.out.println("현재의 계절은 겨울입니다.");
		}
		
		
		System.out.println("========================");
		System.out.println("[Ex4_7]");
		
		int num = 0;

		// 괄호{} 안의 내용을 5번 반복한다.
		for (int i = 1; i <= 5; i++) {
			num = (int) (Math.random() * 6) + 1;
			System.out.println(num);
		}
		
		
	}
	

}
