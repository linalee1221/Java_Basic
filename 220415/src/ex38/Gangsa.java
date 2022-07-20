package ex38;

public class Gangsa extends AcademyPerson {
	
	private String subject; // 강의명
	
	public Gangsa() {
		
	}
	
	public Gangsa(int num, String name, String subject) {
		super(num, name);
		this.subject = subject;
	}
	
	@Override
	public void display() {
		System.out.println("강사번호 = " + getNum());
		System.out.println("강사이름 = " + getName());
		System.out.println("강의명 = " + subject);
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}


}
