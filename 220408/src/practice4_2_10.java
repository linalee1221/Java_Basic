import java.util.Scanner;

public class practice4_2_10 {

	public static void main(String[] args) {
		// 연습문제 4-2
		// 1부터 20까지의 정수 중에서 2 또는 3의 배수가 아닌 수의 총합
		
		int sum = 0;
		
		for(int i=0; i<=20; i++) {
			if(i%2!=0 && i%3!=0)// i가 2 또는 3의 배수가 아닐 때만 sum에 i를 더함
				sum += i;
		}
		
		System.out.println("sum=" + sum);
		
		// 연습문제 4-3
		// 1+(1+2)+(1+2+3)+(1+2+3+4)+...+(1+2+3+...+10)의 결과를 계산하시오
		
		int sum1 = 0;
		int totalSum = 0;
		
		for(int i2=1; i2<=10; i2++) {
			sum1 += i2;
			totalSum += sum1;
		}
		
		System.out.println("totalSum = " + totalSum);
		
		// 연습문제 4-4
		// 1+(-2)+3+(-4)+... , 과 같은 식으로 계속 더해나갔을 때 몇까지 더해야 총합이
		// 100 이상이 되는지 구하시오
		
		int sum2 = 0;
		int s = 1;
		int num1 = 0;
	
	
		for(int i3=1; sum2<100; i3++, s=-s) {
			num1 = i3 * s;
			sum2 += num1;
		}
		
		System.out.println("num1 = " + num1);
		System.out.println("sum2 = " + sum2);
		
		// 연습문제 4-5
		// 다음의 for문을 while문으로 변경하기
		
		for(int i4=0; i4<=10; i4++) {
			for(int j4=0; j4<=i4; j4++)
				System.out.print("*");
				System.out.println();
			}
		
		int i4_1 = 0;
		while (i4_1 <= 10) {
			int j4_1 = 0;
			while(j4_1<=i4_1) {
				System.out.print("*");
				j4_1++;
			}
			System.out.println();
			i4_1++;
		}
		
		// 연습문제 4-6
		// 두개의 주사위 합이 6이 될 때 모든 경우의 수 출력
		
		for(int i5=1; i5<=6; i5++)
			for(int j5=1;j5<=6;j5++)
				if(i5+j5==6)
					System.out.println(i5 + " + " + j5 + " = " + (i5+j5));

		
		
		// 연습문제 4-7
		// 숫자로 이루어진 문자열 str이 있을 때, 각 자리의 합을 더한 결과를 출력하세요.
		// 만약 문자열이 12345라면 1+2+3+4+5의 결과인 15를 출력하세요.
		
		String str = "12345";
		int sum6 = 0;
		
		for(int i6=0; i6<str.length(); i6++) {
			sum6 += str.charAt(i6) - '0';
		}
		
		System.out.println("sum6 = " + sum6);
		
		
		// 연습문제 4-8
		// Math.random() 1 6 value 을 이용해서 부터 사이의 임의의 정수를 변수에 저장하는
		// 코드를 완성하라 (1)에 알맞은 코드를 넣으시오
		
		int value = (int)(Math.random()*6)+1;
		System.out.println("value: " + value);
		
		
		// 연습문제 4-9
		// int 타입의 변수 num이 있을 때, 각 자리의 합을 더한 결과를 출력하는 코드
		// 만일 변수 num의 값이 12345라면 1+2+3+4+5의 결과인 15를 출력
		
		int num9 = 12345;
		int sum9 = 0;
		
		while(num9>0) {
			sum9 += num9%10;
			num9 /= 10;
		}
		
//		num9	num9/10		num9%10
//		12345	1234			5
//		1234	123				4
//		123		12				3
//		12		1				2
//		1		0				1
		
		System.out.println("sum9 = " + sum9);
		
//		연습문제 4-10
//		다음은 숫자맞추기 게임을 작성한 것이다 1과 100사이의 값을 반복적으로 입력
//		해서 컴퓨터가 생각한 값을 맞추면 게임이 끝난다 사용자가 값을 입력하면 컴퓨터는 자
//		신이 생각한 값과 비교해서 결과를 알려준다 사용자가 컴퓨터가 생각한 숫자를 맞추면 
//		게임이 끝나고 몇 번 만에 숫자를 맞췄는지 알려준다.
		
		int answer = (int)(Math.random() * 100) + 1;
		int input = 0;
		int count = 0;
		
		Scanner sc = new Scanner(System.in);
		
		do {
			count++;
			System.out.println("1과 100사이의 값을 입력하세요: ");
			input = sc.nextInt();
			
			if(answer > input) {
				System.out.println("더 큰 수를 입력하세요.");
			} else if (answer < input) {
				System.out.println("더 작은 수를 입력하세요.");
				System.out.println("시도 횟수는 " + count + " 입니다.");
				break;
			}
			
		} while(true);

	}

}
