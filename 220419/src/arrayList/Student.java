package arrayList;

import java.sql.Array;
import java.util.ArrayList;

public class Student {
	int StudentID;
	String studentName;
	ArrayList<Subject> subjectList;
	
	// 매개변수 2개짜리 생성자 정의
	public Student(int studentID, String studentName) {

		StudentID = studentID;
		this.studentName = studentName;
		subjectList = new ArrayList<Subject>();
		
	}
	
	// 과목을 저장할 메소드
	public void addSubject(String name, int score) {
		Subject subject = new Subject();
		
		// 과목에 정보를 저장하는 로직이 필요
		// 매개변수 name을 과목 객체에 저장
		// 매개변수 score를 과목 객체에 저장
		
		subject.setName(name);
		subject.setScorePoint(score);
		
		
		this.subjectList.add(subject); // 향상된 배열(Array List)에 과목 정보를 추가
		
	}
	
	public void showStudentInfo() {
		// 향상된 배열을 반복문을 돌려 정보 출력
		// for(Subject s : subjectList)
		// 1. 각 과목 점수 출력
		// "학생" + studentNAme + "의 " + 과목이름 + "과목 성적은 " + 과목점수 + "점 입니다."
		// 2. 과목의 점수를 다 더해서 총점을 출력
		
		int total = 0;
		
		
		
		for(Subject s : subjectList) {
			total += s.getScorePoint();
			System.out.println("학생" + studentName + "의 " + s.getName() + "과목 성적은 " + s.getScorePoint() + "점 입니다.");
		}
		
		System.out.println("=================================");
		System.out.println(studentName + " 학생의 총점은 " + total + "점 입니다.");
	}
}
