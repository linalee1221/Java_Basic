package ex38;

public class AcademyPerson {
	
	private int num;
	private String name;
	
	
	
	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	

	
	public AcademyPerson(int num, String name) {
		this.num = num;
		this.name = name;
	}
	
// 기본생성자
	public AcademyPerson() {
	}
// 매개변수 2개 생성자
	public void display() {
		System.out.println(" = " + num);
		System.out.println(" = " + name);
	}

}
