package templatemethod;

public class AnimalTest {

	public static void main(String[] args) {
		// 강아지, 고양이 클래스 만들기(Animal 상속)
		Animal bolt = new Dog();
		Animal kitty = new Cat();
		
		bolt.playWithOwner();
		
		System.out.println();
		System.out.println();
		
		kitty.playWithOwner();
	}

}
