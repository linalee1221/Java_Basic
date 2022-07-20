package ex27;

public class Cannon extends Weapon{
	
	
	@Override
	public int fire() {
		return 10; // 대포는 한 번에 10명 살상 가능
	}

}
