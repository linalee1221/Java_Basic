package page463_2nd;

import java.util.ArrayList;

// 지네릭스 테스트용 클래스들
class Fruit implements Eatable {
	public String toString() { return "Fruit"; }
}
class Apple extends Fruit { public String toString() { return "Apple"; }}
class Grape extends Fruit { public String toString() { return "Grape"; }}
class Toy { public String toString() { return "Toy"; }}

// 지네릭스 테스트용 인터페이스
interface Eatable {}

public class Ex12_3 {

	public static void main(String[] args) {
		FruitBox<Fruit> fruitBox = new FruitBox<Fruit>();
		FruitBox<Apple> appleBox = new FruitBox<Apple>();
		FruitBox<Grape> grapeBox = new FruitBox<Grape>();
		
		fruitBox.add(new Fruit());
		fruitBox.add(new Apple());
		fruitBox.add(new Grape());
		appleBox.add(new Apple());
		grapeBox.add(new Grape());
		
		System.out.println("fruitBox - " + fruitBox);
		System.out.println("appleBox - " + appleBox);
		System.out.println("grapeBox - " + grapeBox);
		
	} // end main
}

class FruitBox<T extends Fruit & Eatable> extends Box<T> {}

class Box<T> {
	ArrayList<T> list = new ArrayList<T>();
	void add(T item) {
		list.add(item);
	}
	
	
	T get(int i) {
		return list.get(i);
	}
	
	// 향상된 배열의 크기 cf) 배열의 length와 같음
	int size() {
		return list.size();
	}
	
	
	public String toString() {
		return list.toString();
	}
}