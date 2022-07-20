package ex17;

public class PersonTest {

	public static void main(String[] args) {
		// name : "이순신", height = 175, weight = 75
		Person Kim = new Person("이순신", 175, 75);
				
		System.out.println("Kim의 이름은 " + Kim.getName() 
							+ "이고, 키는 " + Kim.getHeight() 
							+ "cm이고, 몸무게는 " + Kim.getWeight() + "kg 입니다.");
	}

}
