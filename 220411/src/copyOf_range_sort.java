import java.util.Arrays;

public class copyOf_range_sort {

	public static void main(String[] args) {
		int[] arr = {0,1,2,3,4};
		int[] arr2 = Arrays.copyOf(arr, arr.length);
		// 1st 매개변수: 배열
		// 2nd 매개변수 : 복사할 처음 index 번호
		// 3nd 매개변수: 복사할 끝 index + 1번호
		
		for (int i = 0; i < 5; i++) {
			System.out.print(arr2[i]+",");
		}
		
		System.out.println("");
		
		int[] arr3 = Arrays.copyOf(arr, 3);
		int[] arr4 = Arrays.copyOf(arr, 7);
		int[] arr5 = Arrays.copyOfRange(arr, 2, 4);
		
		for (int i = 0; i < 2; i++) {
			System.out.print(arr3[i] + ",");
		}
		
		int[] arr6 = Arrays.copyOfRange(arr, 0, 7);
		
		
		// 배열의 정렬 - sort
		System.out.println("");
		int[] arr7 = {3,2,0,1,4};
		Arrays.sort(arr7);
		System.out.println(Arrays.toString(arr7));
		
	
	}

}
