package ex58;

import java.util.ArrayList;
import java.util.Collections;

public class Arraylist_Prac {
	
	static void print(ArrayList list1, ArrayList list2) {
		System.out.println("list1 : " + list1);
		System.out.println("list2 : " + list2);
		System.out.println("============================");
	}

	public static void main(String[] args) {
		ArrayList<Integer> list1 = new ArrayList<Integer>(10);
		
		// 항상 DB, 자료구조(Collection) : CRUD
		// C : Create (자료에 넣기)
		// R : Read (자료를 읽기)
		// U : Update (일부 자료를 수정하기)
		// D : Delete (자료를 삭제하기)
		
		// ArrayList 자료구조에 C : Create
		// list1 : [5,4,2,0,1,3]
		list1.add(new Integer(5));
		list1.add(new Integer(4));
		list1.add(new Integer(2));
		list1.add(new Integer(0));
		list1.add(new Integer(1));
		list1.add(new Integer(3));
		
		// list2 : [4,2,0]
		ArrayList list2 = new ArrayList(list1.subList(1, 4));
		
		// list1, list2 출력
		print(list1, list2);
		
		// 정렬메소드 호출
		Collections.sort(list1);
		Collections.sort(list2);
		
		// 정렬 후 호출
		print(list1, list2);
		
		// containsAll 매개변수의 arraylist가 포함되면 true, 아니면 false
		System.out.println("containsAll : list 2 : " + list1.containsAll(list2));
		
		list2.add("B");
		list2.add("c");
		list2.add(3, "A");
		
		print(list1, list2);
		
		// set : U (Update)
		// 3번째 위치에 "AA" 수정하기
		list2.set(3, "AA");
		
		print(list1, list2);
		
		System.out.println("retainAll(list2) : " + list1.retainAll(list2));
		
		// list2에서도 list1에 공통된 객체들을 삭제하기
		for(int i=list2.size()-1; i>=0; i--) {
			// get : R (Read)
			// contains : 자료 하나씩 비교해서 있으면 true, 없으면 false
			if(list1.contains(list2.get(i))) {
				// 인덱스 번호가 i인 곳에 자료를 삭제
				// D : Delete
				list2.remove(i);
			}
		}
		
		print(list1, list2);
	
		
	}
}
