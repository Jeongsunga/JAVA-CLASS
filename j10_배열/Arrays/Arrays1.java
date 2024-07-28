package j10_배열.Arrays;

import java.util.Arrays;

public class Arrays1 {

	public static void main(String[] args) {

		int[] numbers1 = {1, 2, 3, 4, 5};
		int[] numbers2 = numbers1;
		
		System.out.println(numbers1);
		System.out.println(numbers2);
		
		System.out.println(numbers2[0]);
		numbers2[0] = 5;
		System.out.println(numbers2[0]);
		System.out.println(numbers1[0]);
		numbers1[1] = 10;
		System.out.println(numbers1[1]);
		System.out.println(numbers2[1]);
		
		/*
		 * Arrays 클래스 사용법
		 * - 배열을 관리해주는 객체
		 * 
		 * 1) 배열의 내용을 검색 후 인덱스를 반환하는 방법
		 * - binarySearch()
		 * 
		 * 2) 배열을 복사할 때 사용하는 메소드
		 * - copyOf(복사하고자 하는 배열, 새로 생성할 배열의 크기)
		 * 
		 * 3) 배열을 복사할 때 원하는 범위만 복사해주는 메소드
		 * - copyOfRange(복사하고자 하는 배열, 시작 인덱스, 마지막 인덱스)
		 * 
		 * 4) 배열을 초기화하고 원하는 값으로 모두 채우는 메소드
		 * - fill(초기화하고자 하는 배열, 채울 값)
		 * 
		 * 5) 배열을 정렬하는 방법
		 *  - sort(정렬하고자 하는 배열)
		 */
		
		int[] nums = {3, 6, 2, 7, 5, 3, 2, 1, 9};
		
		// 얕은 복사
		int[] nums2 = nums;
		printArray(nums);
		
		/*
		 * nums3 배열 만들기
		 * nums3 안의 내용은 nums 안의 내용과 동일하다.
		 * 단, 주소는 다르다.
		 */
		
		// 깊은 복사
		int[] nums3 = new int[nums.length];
		
		for(int i = 0; i < nums.length; i++) {
			nums3[i] = nums[i];
		}
		printArray(nums3);
		System.out.println(nums3);
		
		int[] nums4 = Arrays.copyOf(nums, nums.length);
		printArray(nums4);
		System.out.println(nums4);
		
		int[] nums5 = Arrays.copyOf(nums, nums.length + 2);
		printArray(nums5);
		
		// 범위 지정해서 복사
		int[] nums6 = Arrays.copyOfRange(nums, 1, 5);
		printArray(nums6);
		
		// 배열 정렬
		Arrays.sort(nums6);
		printArray(nums6);
		
		// 배열 초기화 후 채우기
		Arrays.fill(nums6, 10);
		printArray(nums6);
		
		// 값의 위치 찾기
		int index = Arrays.binarySearch(nums5, 2);
		System.out.println("찾은 인덱스: " + index);
	}
	
	public static void printArray(int[] arr) {
		System.out.print("Array: [");
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
			if(i != arr.length -1) {
				System.out.print(", ");
			}
		}
		System.out.println("]");
	}

}
