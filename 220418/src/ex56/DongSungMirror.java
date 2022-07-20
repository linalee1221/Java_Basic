package ex56;

public class DongSungMirror implements Mirror {
	@Override
	public void autoClose() {
		System.out.println("시동을 끄면 자동으로 접기");
	}
	
	@Override
	public void control() {
		System.out.println("거울의 각도 조절하기");
	}
}
