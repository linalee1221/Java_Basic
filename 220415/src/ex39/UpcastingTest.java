package ex39;

public class UpcastingTest {

	public static void main(String[] args) {
//		Person p;
//		Student s = new Student("강동원");
		
		Person p = new Student("강동원"); // 다형성 
		Student s;
		
		s = (Student)p; // 다운캐스팅
		
		p = s; // 업캐스팅(위로 형변환) 다형성
		
		
		System.out.println(p.name);
		
//		p.grade = "A"; // 에러
//		p.department = "Com"; // 에러
		
//		System.out.println(s.name);
//		s.grade = "A";

	}

}
