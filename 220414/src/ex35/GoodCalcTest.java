package ex35;

public class GoodCalcTest {

	public static void main(String[] args) {
		GoodCalc goodcalc = new GoodCalc();
		
		int[] avg = new int[] {2,3,4};
		
		System.out.println(goodcalc.add(2, 3));
		System.out.println(goodcalc.subtract(2, 3));
		System.out.println(goodcalc.average(avg));
	}

}
