package ex17;

public class Person {
	
	String name;
	int height;
	int weight;
	
	Person(String name, int height, int weight) {
		this.name = name;
		this.height = height;
		this.weight = weight;
	}
	
	
	String getName() {
		return this.name;
	}
	
	int getHeight() {
		return this.height;
	}
	int getWeight() {
		return this.weight;
	}
	
	
	// setter 메소드 : 멤버변수의 값을 저장
	void setName(String name) {
		this.name = name;
	}
	void setHeight(int height) {
		this.height = height;
	}
	void setWeight(int weight) {
		this.weight = weight;
	}

}
