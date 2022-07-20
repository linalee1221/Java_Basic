package ex19;

public class BookTest {

	public static void main(String[] args) {
		Book javaBook = new Book();
		
		// getter와 setter를 이용해서 아래를 출력하세요.
		// title = "Java JDK", author = "황기태", ISBN = 3333
		// 책정보는 Java JDK, 황기태, 3333 입니다.
		
		javaBook.setTitle("Java JDK");
		javaBook.setAuthor("황기태");
		javaBook.setISBN(3333);
		
		System.out.println("책 정보는 " + javaBook.getTitle() 
							+ ", " + javaBook.getAuthor() 
							+ ", " + javaBook.getISBN() + " 입니다.");
		
	}

}
