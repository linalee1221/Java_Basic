package ex56;

public class MirrorTest {

	public static void main(String[] args) {
		TaejungMirror tm = new TaejungMirror();
		DongSungMirror ds = new DongSungMirror();
		
		Genesis g1 = new Genesis(tm);
		Genesis g2 = new Genesis(ds);
		
		// 기능 호출
		g1.powerOff();
		g2.powerOff();
	}

}
