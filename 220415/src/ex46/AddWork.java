package ex46;

public class AddWork implements DBAccess {

	@Override
	public void connect() {
		System.out.println("DB 연결");
	}

	@Override
	public void disconnect() {
		System.out.println("DB 연결해제");
	}

	@Override
	public void work() {
		System.out.println("실행");
	}
	
}
