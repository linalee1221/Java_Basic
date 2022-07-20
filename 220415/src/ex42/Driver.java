package ex42;

public class Driver {

	public static void main(String[] args) {
		동물[] 동물들 = new 동물[5];
		
		동물들[0] = new 쥐();
		동물들[1] = new 고양이();
		동물들[2] = new 강아지();
		동물들[3] = new 송아지();
		동물들[4] = new 병아리();
		
		
		for(int i=0; i<동물들.length; i++) {
			// 쥐 print 출력메세지 : "나는 쥐! 찍찍"
			// 고양이 print 출력메세지 : "나는 고양이! 야옹"
			// 강아지 print 출력메세지 : "나는 강아지! 멍멍"
			// 송아지 print 출력메세지 : "나는 송아지! 음메"
			// 병아리 print 출력메세지 : "나는 병아리! 삐약"
			동물들[i].물어보세요();
		}
		
	}

}
