package arr;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListEx {

	public static void main(String[] args) {
		ArrayList<String> a = new ArrayList<String>();
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("이름을 입력하세요");
		
		// arraylist 입력값을 모두 저장
		for(int i=0; i<4; i++) {
			
			String s = scanner.next(); // 공백까지 입력받음
			a.add(s);
		}
		
		// arraylist 모두 출력
		for(int i=0; i<a.size(); i++) {
			String name = a.get(i);
			System.out.println(name + " ");
		}
	}
}
