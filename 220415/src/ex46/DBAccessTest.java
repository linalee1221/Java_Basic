package ex46;

public class DBAccessTest {

	public static void main(String[] args) {
		// 객체 생성
		// CTRL + SHIFT + y = 소문자 바꾸기
		// CTRL + SHIFT + x = 대문자 바꾸기
		AddWork addwork = new AddWork();
		
		addwork.connect();
		addwork.disconnect();
		addwork.work();
	}

}
