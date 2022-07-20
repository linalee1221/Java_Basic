package objectArrayChange;

import java.util.ArrayList;

public class BookTest {

	public static void main(String[] args) {
		
		ArrayList<Book> book = new ArrayList();
		
		// 배열의 값 저장
		book.add(new Book("태백산맥", "조정래"));
		book.add(new Book("데미안", "헤르맛 헷세"));
		book.add(new Book("어떻게 살 것인가", "유시민"));
		book.add(new Book("토지", "박경리"));
		book.add(new Book("어린왕자", "생텍쥐베리"));
		
		// 배열의 값 출력
		// 일반 for문
		System.out.println("<<일반 for문>>");
		for(int i=0; i<book.size(); i++) {
			Book b = book.get(i);
			b.getAuthor();
			b.getBookName();
			b.showBookInfo();
		}
		
		System.out.println("=========================");
		
		// 향상된 for문
		System.out.println("<<향상된 for문>>");
		for(Book b : book) {
			b.showBookInfo();
		}
	}

}
