package ex25;

public class StarcraftTest {

	public static void main(String[] args) {
		// 마린
		// 속성 : 키, 몸무게
		// 기능 : 걷기 : "걸어가고 있습니다."
		//		 총쏘기 : "총을 쏘고 있습니다."
		//		 스팀팩 : "스팀팩을 썼습니다."
		// 파이어뱃
		// 속성 : 키, 몸무게
		// 기능: 걷기 : "걸어가고 있습니다."
		//		불쏘기 : "불을 쏘고 있습니다."
		// 탱크
		// 속성 : 몸무게
		// 기능 : 운전 : "움직이고 있습니다."
		//		 시즈모드 : "시즈모드로 동작하였습니다."
		
		// 모든 기능을 출력해 주세요.
		
		Firebat firebat = new Firebat();
		Marin marin = new Marin();
		Tank tank = new Tank();
		
	
		firebat.fireShot();
		firebat.walking();
		
		marin.shotGun();
		marin.steamPack();
		marin.walking();
		
		tank.driving();
		tank.sizMode();
		
	}

}
