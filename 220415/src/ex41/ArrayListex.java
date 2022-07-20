package ex41;

import java.util.ArrayList;

public class ArrayListex {

	public static void main(String[] args) {
		ArrayList<Integer> arraylist = new ArrayList<>();
		
		// 추가
		arraylist.add(1);
		arraylist.add(2);
		
		// 출력
		arrayInfo(arraylist);
		
		// 인덱스 번호에 추가
		arraylist.add(1,10); // 인덱스 1에 값 10 추가
		// 출력
		arrayInfo(arraylist);
		
		arraylist.remove(1);
		//출력
		arrayInfo(arraylist);
		
	}
	
	// 출력을 위한 사용자 정의 메서드
	public static void arrayInfo(ArrayList<Integer> arraylist) {
		System.out.println("전체 값 : " + arraylist);
		// 인덱스 1의 값 출력
		System.out.println("1번 값 : " + arraylist.get(1));
		System.out.println("ArrayList 크기 : " + arraylist.size());
		System.out.println("-----------------------");
	}

}
