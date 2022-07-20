package page463_2nd;

import java.util.*;

public class Ex12_2 {

	public static void main(String[] args) {
		ArrayList<Student> list = new ArrayList<Student>();
		list.add(new Student("자바왕",1,1));
		list.add(new Student("자바짱",1,2));
		list.add(new Student("홍길동",2,1));
		
		// 향상된 배열(ArrayList) -> Iterator 변환
		Iterator<Student> it = list.iterator();
		
		// Iterator : 향상된 for문과 비슷함
		while(it.hasNext()) {
			// Student s = (Student)it.next(); 지네릭스를 사용하지 않으면 형변환 필요
			Student s = it.next();
			System.out.println(s.name);
		}
	} // end main
}

class Student {
	String name = "";
	int ban;
	int no;
	
	Student(String name, int ban, int no) {
		this.name = name;
		this.ban = ban;
		this.no = no;
	}
}