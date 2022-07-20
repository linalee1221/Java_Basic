package ex35;

public class GoodCalc extends Calculator {

	@Override
	public int add(int a, int b) {
		return a + b;
	}

	@Override
	public int subtract(int a, int b) {
		return a - b;
	}

	@Override
	public int average(int[] a) {
		int sum = 0;
		for(int i=0; i<a.length; i++) {
			sum = sum+a[i];
		}
		return sum / a.length; // 평균
	}

}
