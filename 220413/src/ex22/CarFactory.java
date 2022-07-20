package ex22;

public class CarFactory {
	int num;
	String carName;
	
	CarFactory() {}
	
	CarFactory(int num,	String carName) {
		this.num = num;
		this.carName = carName;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getCarName() {
		return carName;
	}

	public void setCarName(String carName) {
		this.carName = carName;
	}
	
	
}
