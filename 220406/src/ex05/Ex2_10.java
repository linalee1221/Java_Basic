package ex05;

import java.util.Scanner;

public class Ex2_10 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("두자리 정수를 하나 입력해주세요. > ");
		
		// 콘솔 입력에서 문자열 한 라인을 입력 받음
		String input = scanner.nextLine();
		int num = Integer.parseInt(input); // 입력받은 문자열을 숫자로 변환
		
		System.out.println("입력내용 : " + input);
		System.out.printf("num=%d%n", num);
	}

}
