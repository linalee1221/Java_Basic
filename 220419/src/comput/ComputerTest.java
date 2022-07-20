package comput;

public class ComputerTest {

	public static void main(String[] args) {
		Computer c1 = new DeskTop(); 
		Computer c2 = new NoteBook();
		Computer c3 = new WorkStation();
		
		c1.display(); // DeskTop Computer
		c1.typing(); // DeskTop Typing
		
		System.out.println();

		c2.display(); // NoteBook Computer
		c2.typing(); // NoteBook Typing
		
		System.out.println();
		
		c3.display(); // WorkStation Computer
		c3.typing(); // WorkStation Typing
		
		
	}

}
