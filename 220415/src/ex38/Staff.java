package ex38;

public class Staff extends AcademyPerson {
	
	private String department;
	
	public Staff() {
	}
	
	public Staff(int num, String name, String department) {
		super(num, name);
		this.department = department;
	}
	
	@Override
	public void display() {
		System.out.println("학생번호 = " + getNum());
		System.out.println("학생이름 = " + getName());
		System.out.println("부서 = " + department);
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}



}
