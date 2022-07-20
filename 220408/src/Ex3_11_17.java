import java.util.Scanner;

public class Ex3_11_17 {

	public static void main(String[] args) {
		
		System.out.println("[Ex3_11]");
		double pi = 3.141592; 
		double shortPi = Math.round(pi * 1000) / 1000.0;
		System.out.println(shortPi);
		
		System.out.println("=========================");
		System.out.println("[Ex3_12]");
		int x1 = 10;
		int y2 = 8;

		System.out.printf("%d을 %d로 나누면, %n", x1, y2); 
		System.out.printf("몫은 %d이고, 나머지는 %d입니다.%n", x1 / y2, x1 % y2); 
		
		System.out.println("=========================");
		System.out.println("[Ex3_13]");
		System.out.println(-10%8); 
		System.out.println(10%-8); 
		System.out.println(-10%-8);
		
		System.out.println("=========================");
		System.out.println("[Ex3_14]");
		String str1 = "abc";
		String str2 = new String("abc");

		System.out.printf("\"abc\"==\"abc\" ? %b%n", "abc"=="abc");
		System.out.printf(" str1==\"abc\" ? %b%n",    str1=="abc");
		System.out.printf(" str2==\"abc\" ? %b%n",    str2=="abc");
		System.out.printf("str1.equals(\"abc\") ? %b%n", str1.equals("abc"));
		System.out.printf("str2.equals(\"abc\") ? %b%n", str2.equals("abc")); 
		System.out.printf("str2.equals(\"ABC\") ? %b%n", str2.equals("ABC"));
		System.out.printf("str2.equalsIgnoreCase(\"ABC\") ? %b%n", str2.equalsIgnoreCase("ABC"));
		
		
		
		System.out.println("=========================");
		System.out.println("[Ex3_15]");
		Scanner scanner = new Scanner(System.in);
		char ch = ' ';

		System.out.printf("문자를 하나 입력하세요.>");

		String input = scanner.nextLine();
		ch = input.charAt(0);

		if('0' <= ch && ch <= '9') {
			System.out.printf("입력하신 문자는 숫자입니다.%n");
		}

		if(('a' <= ch && ch <= 'z') || ('A'<= ch && ch <= 'Z')) {
			System.out.printf("입력하신 문자는 영문자입니다.%n");
		}
		
		
		
		System.out.println("=========================");
		System.out.println("[Ex3_16]");
		boolean b = true; 
		char ch1 = 'C';
		
		System.out.printf("b=%b%n", b);
		System.out.printf("!b=%b%n", !b);
		System.out.printf("!!b=%b%n", !!b);
		System.out.printf("!!!b=%b%n", !!!b);
		System.out.println();

		System.out.printf("ch=%c%n", ch);
		System.out.printf("ch < 'a' || ch > 'z'=%b%n", ch < 'a' || ch > 'z');
	  	System.out.printf("!('a'<=ch && ch<='z')=%b%n", !('a'<= ch && ch<='z'));
	    System.out.printf("  'a'<=ch && ch<='z' =%b%n", 'a'<=ch && ch<='z');
		
	    
	    
		System.out.println("=========================");
		System.out.println("[Ex3_17]");
		
		int  x, y, z;
		int  absX, absY, absZ;
		char signX, signY, signZ;

		x = 10;
		y = -5;
		z = 0;

		absX = x >= 0 ? x : -x;  // x의 값이 음수이면, 양수로 만든다.
		absY = y >= 0 ? y : -y;
		absZ = z >= 0 ? z : -z;
		signX = x > 0 ? '+' : ( x==0 ? ' ' : '-');  // 조건 연산자를 중첩
		signY = y > 0 ? '+' : ( y==0 ? ' ' : '-'); 
		signZ = z > 0 ? '+' : ( z==0 ? ' ' : '-'); 

		System.out.printf("x=%c%d%n", signX, absX);
		System.out.printf("y=%c%d%n", signY, absY);
		System.out.printf("z=%c%d%n", signZ, absZ);
	}

}
