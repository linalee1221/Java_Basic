package ex22;

public class CarTest {

	public static void main(String[] args) {
		CarFactory sonata = new CarFactory(1, "sonata");
		CarFactory avante = new CarFactory(2, "avante");
		CarFactory santafe = new CarFactory(3, "santafe");
		
		// getter 출력
		
		System.out.println(sonata.getNum() + "번 차량은 " + sonata.getCarName() + " 입니다.");
		System.out.println(avante.getNum() + "번 차량은 " + avante.getCarName() + " 입니다.");
		System.out.println(santafe.getNum() + "번 차량은 " + santafe.getCarName() + " 입니다.");
	}

}
