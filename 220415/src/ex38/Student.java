package ex38;

public class Student extends AcademyPerson {
	
	private String course; 
	
	public Student(int num, String name, String course) {
		super(num, name);
		this.course = course;
	}

	public Student() {
	}

	@Override
	public void display() {
		System.out.println("학생번호 = " + getNum());
		System.out.println("학생이름 = " + getName());
		System.out.println("수강과정 = " + course);
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}
}
