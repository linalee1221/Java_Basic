
public class StringExe {

	public static void main(String[] args) {
		// 1. 자바 String 유용한 메소드 정리
		// 	  substring : 문자열 자르기
		//    substring(int start) : start부터 끝까지 문자열을 자름
		//    substring(int start, int end) : start부터 end까지 자름
		//    return값 : 잘린 문자열
		System.out.println("=====================================");
		String tmp_str = "abcdefgh";
		String sub1 = tmp_str.substring(5);
		String sub2 = tmp_str.substring(1,4); // end는 포함되지 않는다.
		
		System.out.println("sub1 = " + sub1);
		System.out.println("sub2 = " + sub2);
		System.out.println("=====================================");
		// 2. length : 문자열의 길이 구하기
		// 사용법 : length()
		// return값 : 정수로 문자열 길이를 반환
		
		String string1 = "java";
		String string2 = "메소드 설명";
		
		System.out.println("string1.length() = " + string1.length());
		System.out.println("string2.length() = " + string2.length());
		
		System.out.println("=====================================");
		// 3. split : 문자열 나누기
		// String[] split(String divider)
		// 함수의 설명 : 문자열을 자를 분리자로 나누고 문자열 배열에 담아서 반환함
		// 1st 매개변수 : 분리자
		// return값 : 분리자로 잘린 문자열 배열
		
		String str_num = "123^4567^890";
		String[] arr = str_num.split("\\^");
		
		System.out.println("arr[0] = " + arr[0]);
		System.out.println("arr[1] = " + arr[1]);
		System.out.println("arr[2] = " + arr[2]);
		System.out.println("=====================================");
		// 4. equals : 문자열 일치 여부 검사
		// boolean equals(Object obj)
		// 1st 매개변수 : 문자열 객체가 들어옴
		// return값 : 일치하면 참(true), 틀리면 거짓(false)
		String s = "Hello Java";
		boolean c1 = s.equals("Hello Java");
		boolean c2 = s.equals("hello java");
		
		// 문자열 비교 if("abc" == "abc") (X)
		// 문자열 비교 if("abc".equals("abc") == true) (O)
		// 참고사항) if('a' == 'a') (O)
		System.out.println("c1 = " + c1);
		System.out.println("c2 = " + c2);
		
		System.out.println("=====================================");
		// 5. contains : 문자열에 포함된 문자가 있는지 검사
		// boolean contain(문자열)
		// 1st 매개변수 : 검사할 문자열
		// return값 : 검사할 문자열이 있으면 true, 없으면 false
		String string3 = "abcdefgh";
		boolean a1 = string3.contains("efg");
		boolean a2 = string3.contains("xy");
		
		System.out.println("a1 = " + a1);
		System.out.println("a2 = " + a2);
		
		System.out.println("=====================================");
		// 6. startWith, endsWith : 문자열 시작 또는 끝 부분에 일치하는 문자열이 있는지 검사
		// boolean startWith(String s) : 문자열 s로 시작하는지 검사(맞으면 true, 틀리면 false)
		// boolean endsWith(String s) : 문자열 s로 끝나는지 검사(맞으면 true, 틀리면 false)
		String string4 = "http://www.naver.com";
		boolean b1 = string4.startsWith("http");
		boolean b2 = string4.endsWith("co.kr");
		
		System.out.println("b1 = " + b1);
		System.out.println("b2 = " + b2);
		
		System.out.println("=====================================");
		// 7. replace : 문자열을 임의의 문자열로 바꾸기
		// String replace(원래 문자열, 바꿀 문자열)
		// return 값 : 바뀐 문자열
		String tmp_str2 = "ABCDEF";
		
		String string5 = tmp_str2.replace("DE", "XX");
		
		System.out.println("string5 = " + string5);
		
		System.out.println("=====================================");
		// 8. trim : 문자열 좌우의 공백 없애기
		// String trim()
		// return값 : 문자열 처음과 끝의 공백을 없앤 문자열
		
		String tmp_str3 = "  Hello java Test  ";
		String trim_test = tmp_str3.trim();
		
		System.out.println("trim_test = " + trim_test);
		
		System.out.println("=====================================");
		// 9. toLowerCase : 문자열의 대문자를 소문자로 바꾸기
		// String toLowerCase()
		// return값 : 소문자로 모두 바꾼 문자열
		
		String tmp_str4 = "Java Programming Test";
		String tmp_lower = tmp_str4.toLowerCase();
		
		System.out.println("tmp_lower = " + tmp_lower);
		
		System.out.println("=====================================");
		// 10. toUpperCase : 문자열의 소문자를 대문자로 바꾸기
		// String toUpperCase()
		// return값 : 대문자로 모두 바꾼 문자열
		
		String tmp_str5 = "java programming test";
		String tmp_upper = tmp_str5.toUpperCase();
		
		System.out.println("tmp_upper = " + tmp_upper);
		
		System.out.println("=====================================");
		// 11. charAt() : 문자열에서 매개변수의 index번호에 해당하는 문자 하나를 반환
		// char charAt(int index)
		// 1st 매개변수 : 문자열 유사배열의 index번호
		// return값 : 문자열 index번호에 해당하는 문자 하나(char)
		String str = "abcdefg";
		
		char chr = str.charAt(1);
		char chr2 = str.charAt(str.length() - 1);
		
		System.out.println("chr = " + chr);
		System.out.println("chr2 = " + chr2);
		
		System.out.println("=====================================");
		// 12. indexOf(찾을 문자열) : 문자열 중 찾을 문자열이 나오는 첫 index번호를 반환
		// int indexof(String str)
		// 1st 매개변수 : 찾을 문자열
		// 리턴값: 정수, 찾은 문자열의 첫번째 index번호, 없으면 -1
		String str2 = "abcdefg hi";
		
		int index = str2.indexOf("a");
		int index2 = str2.indexOf("hi");
		int index3 = str2.indexOf("j");
		
		System.out.println("index = " + index);
		System.out.println("index2 = " + index2);
		System.out.println("index3 = " + index3);
	}

}
