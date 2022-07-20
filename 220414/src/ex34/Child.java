package ex34;

public class Child extends Parent {
	private int r = 300;
	
	public int getR() {
		return r;
	}

	public void setR(int r) {
		this.r = r;
	}

	public void display() {
		System.out.println(getY());
		System.out.println(getX());
		System.out.println("r = " + this.r);
	}
}
