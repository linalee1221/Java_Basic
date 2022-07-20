package ex33;

public class Person {
	private int weight; // 다른 클래스에서 접근불가
	int age; // default, 같은 패키지에 있는 클래스에게만 공개
	protected int height; // 상속받는 클래스에게만 공개
	public String name; // 다른 패키지 포함 다른 누구에게나 공개
	
	// setter
	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	// getter
	public int getWeight() {
		return weight;
	}
}
