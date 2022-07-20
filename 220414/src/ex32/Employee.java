package ex32;

public class Employee {
	
	public int no;
	public String name;
	
	// 기본생성자
	public Employee() {
		System.out.println("Employee() 실행");
	}

	// 매개변수 2개짜리 생성자
	public Employee(int no, String name) {
		this.no = no;
		this.name = name;
		System.out.println("Employee(int, String) 실행");
	}
	
	
	
	
}
