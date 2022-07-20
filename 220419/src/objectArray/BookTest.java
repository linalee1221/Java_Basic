package objectArray;

public class BookTest {

	public static void main(String[] args) {
		// 배열의 선언(공간만 생성)
		Book[] book = new Book[5];
		
		// 배열의 값 저장
		book[0] = new Book("태백산맥", "조정래");
		book[1] = new Book("데미안", "헤르맛 헷세");
		book[2] = new Book("어떻게 살 것인가", "유시민");
		book[3] = new Book("토지", "박경리");
		book[4] = new Book("어린왕자", "생텍쥐베리");
		
		// 배열의 값 출력
		for(int i=0; i<book.length; i++) {
			System.out.println(book[i].getBookName());
			System.out.println(book[i].getAuthor());
		}
	}

}
