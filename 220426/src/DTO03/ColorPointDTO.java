package DTO03;

public class ColorPointDTO extends DTO {
	
	String color; // 컬러

	// 컬러 저장용 메소드
	public void setColor(String color) {
		this.color = color;
	}

	@Override
	void showPoint() {
		super.showPoint(); // 부모의 점의 좌표 출력 메소드가 호출됨
	}
	
	
}
