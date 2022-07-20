package ex16;

public class Exercise06 {

	public static void main(String[] args) {
		Student student1 = new Student(100, 85, 90);
		Student student2 = new Student(95, 80, 95);
		
		System.out.println("student1 총점 = " + student1.sum());
		System.out.println("student2 총점 = " + student2.sum());
	}

}
