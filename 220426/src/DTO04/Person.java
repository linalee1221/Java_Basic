package DTO04;

public class Person {
	
	int age;
	String name;
	int height;
	int weight;
	
	// getter : 멤버변수 데이터 검색용
	public int getWeight() {
		return weight;
	}
	
	// setter : 저장용
	public void setWeight(int weight) {
		this.weight = weight;
	}
}
