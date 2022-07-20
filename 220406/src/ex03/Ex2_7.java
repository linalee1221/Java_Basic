package ex03;

public class Ex2_7 {

	public static void main(String[] args) {
		String name = "Ja" + "va";
		String str = name + 8.0;
		
		System.out.println(name);
		System.out.println(str);
		System.out.println(7 + " ");
		System.out.println(" " + 7);
		System.out.println(7 + "");
		System.out.println("" + 7);
		System.out.println("" + "");
		System.out.println(7 + 7 + "");
		System.out.println("" + 7 + 7);
		
		System.out.println("----------------------");
		System.out.println("Ex2_8");
		
		int x = 10, y = 5;
		System.out.println("x="+x);
		System.out.println("y="+y);
		
		int tmp = x;
		x = y;
		y = tmp;
		System.out.println("x="+x);
		System.out.println("y="+y);
	}

}
