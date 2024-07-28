package j10_배열;

public class Array2 {

	public static void main(String[] args) {
		// 배열 생성 방법 1
		int[] numbers = new int[10];
		numbers[0] = 1;
		numbers[1] = 2;
		numbers[2] = 3;
		numbers[3] = 4;
		numbers[4] = 5;
		numbers[5] = 6;
		numbers[6] = 7;
		numbers[7] = 8;
		numbers[8] = 9;
		numbers[9] = 10;
		
		// 배열 생성 방법 2
		int[] numbers2 = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		// 배열 생성 방법 3
		int[] numbers3 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		/*
		 * 500개의 정수가 들어가는 배열을 만들고
		 * 값을 순차적으로 1부터 500까지 넣기
		 * 
		 * 그리고 순차적으로 값을 출력하기
		 */
		
		int[] numbers4 = new int[500];
		
		for(int i = 0; i < numbers4.length; i++) {
			numbers4[i] = i + 1;
		}
		
		for(int i = 0; i < numbers4.length; i++) {
			System.out.println(numbers4[i]);
		}
	}

}
