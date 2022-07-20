package ex47;

public class PersonDemo {

	public static void main(String[] args) {
		// 문제 1 : Person 클래스 만들기
		// 멤버변수 name : ""
		//        age : 0
		//        email : ""
		// setter를 이용해서 아래 값을 저장
		// 객체 p1 : name = "홍길동",
		//			age = 23,
		//			email = "hong@gmail.com"
		// 객체 p2 : name = "김유신",
		//			age = 44,
		//			email = "kim@gmail.com"
		// 출력 : getter 이용해서 print 출력
		
		Person p1 = new Person();
		Person p2 = new Person();
		
		p1.setName("홍길동");
		p1.setAge(23);
		p1.setEmail("hong@gmail.com");
		p2.setName("김유신");
		p2.setAge(44);
		p2.setEmail("kim@gmail.com");
		
		System.out.println("p1 = 이름은 " + p1.getName() + "이고, 나이는 " + p1.getAge() + "살이고, 이메일 주소는 " + p1.getEmail() + "입니다.");
		
		System.out.println("========================================================================");
		
		System.out.println("p2 = 이름은 " + p2.getName() + "이고, 나이는 " + p2.getAge() + "살이고, 이메일 주소는 " + p2.getEmail() + "입니다.");

		
	}

}
