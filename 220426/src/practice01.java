import java.util.Scanner;

public class practice01 {

	public static void main(String[] args) {
		// 1. arr 배열 중에서 인덱스가 1인 곳의 값 출력

		int[] arr = { 10, 20, 30, 50, 3, 60, -3 };
		System.out.println("문제 1.");
		System.out.println(arr[1]);
		System.out.println("============");

		// 2. arr 배열 중에서 값이 60인 곳의 인덱스 출력
		int[] arr2 = { 10, 20, 30, 50, 3, 60, -3 };
		System.out.println("문제 2.");
		System.out.println(arr[5]);
		System.out.println("============");

		// 3. arr 배열 안의 모든 값을 더하고, 총합과 평균을 출력
		int[] arr3 = { 10, 20, 30, 50, 3, 60, -2 };
		int total = 0;
		float avg = 0;
		int count = 0;

		for (int i = 0; i < arr3.length; i++) {
			total += arr3[i];
			count++;
		}
		avg = total / (float) count;
		
		System.out.println("문제 3.");
		System.out.println("총점 = " + total);
		System.out.println("평균 = " + avg);
		System.out.println("============");
		
		// 4. arr 배열의 인덱스가 3인 곳은 출력하지 말고, 나머지만 출력해보자.
		int[] arr4 = { 10, 20, 30, 50, 3, 60, -3 };
		System.out.println("문제 4.");
		for(int j=0; j<arr4.length; j++) {
			if(j == 3) {
				continue;
			}
			System.out.println("arr4[" + j + "] = " + arr4[j]);
		}
		System.out.println("============");
		
		// 5. arr 배열 안의 변경하고 싶은 값의 인덱스 번호를 입력받아, 그 값을 1000으로 변경해보자.
		int[] arr5 = { 10, 20, 30, 50, 3, 60, -3 };
		System.out.println("문제 5.");
		Scanner sc = new Scanner(System.in);
		// 선택한 인덱스 번호
		int choice = sc.nextInt();
		
		// 선택한 인덱스 번호의 값 = 1000
		arr[choice] = 1000;
		
		for(int k=0; k<arr.length; k++) {
			System.out.println(arr[k]);
		}
		System.out.println("============");
		
		// 6. 인덱스 번호 2개를 입력받아, 그 값을 서로 바꿔보자.
		int[] arr6 = { 10, 20, 30, 50, 3, 60, -3 };
		Scanner sc2 = new Scanner(System.in);
		
		// 선택한 인덱스 번호
		int choice1 = sc2.nextInt();
		int choice2 = sc2.nextInt();
		
		// 변수에 값을 서로 바꾸기 : swap
		// 임시 변수 tmp를 만들어야 함.
		int tmp = arr6[choice1];
		arr6[choice1] = arr6[choice2];
		arr6[choice2] = tmp;
		
		for(int a=0; a<arr6.length; a++) {
			System.out.println(arr6[a]);
		}
		System.out.println("============");
		
		// 7. arr 배열의 요소에서 최대값과 최소값을 구해보자.
		int[] arr7 = { 10, 20, 30, 50, 3, 60, -3 };
//		Arrays.sort(arr7);
//		System.out.println("최대값 : " + arr7[arr7.length - 1]);
//		System.out.println("최소값 : " + arr7[0]);

		int max = arr7[0];
		int min = arr7[0];
		
		for(int q=0; q<arr7.length; q++) {
			// 반복 마지막엔 max값에 최대값만 남음
			if(max<arr7[q]) {
				// max값이 작으면 큰 값을 수정함
				max = arr7[q];
			}
			
			// 반복 마지막엔 min값에 최소값만 남음
			if(min>arr7[q]) {
				// min값이 크면 작은 값을 수정함
				min = arr7[q];
			}
		}
		
		System.out.println("최대값 : " + max);
		System.out.println("최소값 : " + min);
		System.out.println("============");
		
		// 8. char 배열을 생성하여, 알파벳 A~Z까지 대입 후, 출력해보자. 알파벳은 26개.
		
		// 26개짜리 문자 배열 생성
		char[] arr8 = new char[26];
		
		for(int c=0; c<arr8.length; c++) {
			// 문자를 아스키코드 숫자로 변환
			arr8[c] = (char)(65 + c);
			System.out.print(arr8[c]);
		}

	}

}
