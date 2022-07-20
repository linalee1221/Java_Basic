package ex27;

public class OverridingTest {

	public static void main(String[] args) {
		// 객체 만들기
		Weapon weapon = new Weapon();
		
		System.out.println("기본 무기의 살상 능력은 " + weapon.fire() + "입니다.");
		
		Cannon cannon = new Cannon();
		System.out.println("대포의 살상 능력은 " + cannon.fire() + "입니다.");
	}

}
