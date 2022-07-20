package ex11;

import java.util.Scanner;

public class Exercise02 {

	public static void main(String[] args) {
		// 클래스를 작성해보세요
		// 3과목의 점수를 입력받아서 성적 평균을 출력해 보세요
		Scanner sc = new Scanner(System.in);
		
		System.out.println("수학, 과학, 영어 순으로 3개의 정수 입력");
		int math = sc.nextInt();
		int science = sc.nextInt();
		int english = sc.nextInt();
		
		// 아래 클래스를 작성
		Grade me = new Grade();
		System.out.println("평균은 " + me.average(math, science, english) + "점 입니다.");
	}

}
