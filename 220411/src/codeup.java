import java.util.Scanner;

public class codeup {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		String strResult = "";
		String strResult2 = "";
		
		for (int i = 0; i < a.length(); i++) {
			char cLetter = a.charAt(i);
			
			strResult += (int)(cLetter + 2);
			strResult2 += (char)((cLetter * 7) % 80 + 48);
		}
		
		System.out.println(strResult);
		System.out.println(strResult2);
	}
		
}
