import java.util.Scanner;

public class Ex4_8_19 {

	public static void main(String[] args) {
		
		System.out.println("[Ex4_8]");
		for (int i = 1; i <= 3; i++) { // 괄호{}안의 문장을 3번 반복
			System.out.println("Hello");
		}
		
		System.out.println("===========================");
		System.out.println("[Ex4_9]");
		
		for(int i=1;i<=5;i++)
			System.out.println(i); // i의 값을 출력한다.

		for(int i=1;i<=5;i++)
			System.out.print(i);   // print()를 쓰면 가로로 출력된다.

		System.out.println();
		
		System.out.println("===========================");
		System.out.println("[Ex4_10]");
		
		int sum = 0;	// 합계를 저장하기 위한 변수.

		for(int i=1; i <= 5; i++) {
			sum += i ;	// sum = sum + i;
			System.out.printf("1부터 %2d 까지의 합: %2d%n", i, sum);
		}
		
		System.out.println("===========================");
		System.out.println("[Ex4_11]");
		
		for(int a=1; a<=5; a++) {
			for(int b=1; b<=a; b++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		
		System.out.println("===========================");
		System.out.println("[Ex4_12]");
		
		int i= 5;

		while(i--!=0) {
			System.out.println(i + " - I can do it.");
		}
		
		System.out.println("===========================");
		System.out.println("[Ex4_13]");
		
		int sum1 = 0;
		int i1 = 0;
		// i를 1씩 증가시켜서 sum에 계속 더해나간다.
		while (sum1 <= 100) {
			System.out.printf("%d - %d%n", i1, sum1);
			sum1 += ++i1;
		}
		
		System.out.println("===========================");
		System.out.println("[Ex4_14]");
		
		
		int num2 = 0, sum2 = 0;
		System.out.print("숫자를 입력하세요.(예:12345)>");

		Scanner scanner = new Scanner(System.in);
		String tmp = scanner.nextLine();  // 화면을 통해 입력받은 내용을 tmp에 저장
		num2 = Integer.parseInt(tmp);      // 입력받은 문자열(tmp)을 숫자로 변환

		while(num2!=0) {    
			// num을 10으로 나눈 나머지를 sum에 더함
			sum2 += num2%10; 	// sum = sum + num%10;
			System.out.printf("sum=%3d num=%d%n", sum2, num2);

			num2 /= 10;   // num = num / 10;  num을 10으로 나눈 값을 다시 num에 저장
		}

		System.out.println("각 자리수의 합:"+sum2);
		
		System.out.println("===========================");
		System.out.println("[Ex4_15]");
		
		
		int input  = 0, answer = 0;

		answer = (int)(Math.random() * 100) + 1; // 1~100 사이의 임의의 수를 저장
		Scanner scanner1 = new Scanner(System.in);

		do {
			System.out.print("1과 100사이의 정수를 입력하세요.>");
			input = scanner1.nextInt();

			if(input > answer) {
				System.out.println("더 작은 수로 다시 시도해보세요.");	
			} else if(input < answer) {
				System.out.println("더 큰 수로 다시 시도해보세요.");			
			}
		} while(input!=answer);

		System.out.println("정답입니다.");
		
		System.out.println("===========================");
		System.out.println("[Ex4_16]");
		
		
		int sum4 = 0;
		int i4   = 0;

		while(true) {
			if(sum4 > 100)
				break;
			++i4;
			sum4 += i4;
		} // end of while

		System.out.println("i=" + i4);
		System.out.println("sum=" + sum4);
		
		System.out.println("===========================");
		System.out.println("[Ex4_17]");
		
		for(int i5=0;i5 <= 10;i5++) {
			if (i5%3==0)
				continue;
			System.out.println(i5);
			
			
		System.out.println("===========================");
		System.out.println("[Ex4_18]");		
		
		
		int menu = 0;
		int num5  = 0;

		Scanner scanner4 = new Scanner(System.in);

		while(true) {
			System.out.println("(1) square");
			System.out.println("(2) square root");
			System.out.println("(3) log");
			System.out.print("원하는 메뉴(1~3)를 선택하세요.(종료:0)>");

			String tmp5 = scanner4.nextLine(); // 화면에서 입력받은 내용을 tmp에 저장
			menu = Integer.parseInt(tmp5);    // 입력받은 문자열(tmp)을 숫자로 변환

			if(menu==0) {
				System.out.println("프로그램을 종료합니다.");
				break;
			} else if (!(1 <= menu && menu <= 3)) {
				System.out.println("메뉴를 잘못 선택하셨습니다.(종료는 0)");
				continue;		
			}
			
			System.out.println("선택하신 메뉴는 "+ menu +"번입니다.");
			}
		}
		
		System.out.println("===========================");
		System.out.println("[Ex4_19]");	
		
	      // for문에 Loop1이라는 이름을 붙였다.
			Loop1 : for(int i6=2;i6 <=9;i6++) {	
					for(int j6=1;j6 <=9;j6++) {
						if(j6==5)
							break Loop1;
//							break;
//							continue Loop1;
//							continue;
						System.out.println(i6+"*"+ j6 +"="+ i6*j6);
					} // end of for i
					System.out.println();
			} // end of Loop1
	}

}
