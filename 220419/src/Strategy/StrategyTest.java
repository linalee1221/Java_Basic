package Strategy;

public class StrategyTest {

	public static void main(String[] args) {
		Strategy strategy = null;
		Soldier rambo = new Soldier();
		
		// 총을 람보에게 전달해서 전투를 수행하게 만드는 부분
		// 다형성 형태 : spring DI(의존성 주입) 형태
		strategy = new StrategyGun(); // print 출력 : "탕, 타당, 타다당"
			rambo.runContext(strategy);
			
		// 검을 람보에게 전달해서 전투를 수행하게 만드는 부분
			strategy = new StrategySword(); // print 출력 : "챙, 채챙, 채채챙"
			rambo.runContext(strategy);
			
		// 활을 람보에게 전달해서 전투를 수행하게 만드는 부분
			strategy = new StrategyBow(); // print 출력 : "슝, 쇄액, 최종병기"
			rambo.runContext(strategy);
			
	}

}
