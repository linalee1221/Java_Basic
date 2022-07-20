package ex54;

public class Report {
	// 온갖 그래프 출력 기능 구현
	// 컬러, 흑백, 컬러+흑백 그리기 등의 기능이 추가 될 가능성이 있으므로
	// 다형성 메소드를 고려해야 함.
	// spring DI 형태(의존성 주입) : 생성자, setter
	public void drawing(Graph g) {
		g.draw();
	}
}
