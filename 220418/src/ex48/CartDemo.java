package ex48;

public class CartDemo {

	public static void main(String[] args) {
		// 생성자를 이용해서 정보를 저장하고 출력하기
		// Cart 클래스 생성
		// 멤버변수 : owner = "홍길동
		// Product 클래스 생성
		// 멤버변수 : no = "", name = "", price = 0, discountRate = 0.0
		// Product 생성자를 이용해서 초기화 하기
		// p1객체 : no = "a-111", name = "iPhone", price = 800000, discountRate = 0.001
		// p2객체 : no = "b-222", name = "iPad", price = 1000000, discountRate = 0.002
		
		// p1.info() : 출력(위에 정보가 출력되는 메소드)
		
		// Cart클래스의 mycart 객체 정보 getter 출력 
		
		Cart mycart = new Cart();
		Product p1 = new Product("a-111", "iPhone", 800000, 0.001);
		Product p2 = new Product("b-222", "iPad", 1000000, 0.002);
		
		
		mycart.setOwner("홍길동");
		p1.info(); // Product 클래스의 p1객체 정보를 출력
		System.out.println("mycart = " + mycart.getOwner());
		
	
		
	}

}
