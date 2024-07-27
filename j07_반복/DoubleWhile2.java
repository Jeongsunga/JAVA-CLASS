package j07_반복;

import java.util.Scanner;

public class DoubleWhile2 {

	public static void main(String[] args) {

		/*
		 * 1교시
		 * 		1분
		 * 		2분
		 * 		...
		 * 		50분
		 * 		10분 쉬는 시간
		 * 		1분
		 * 		...
		 * 		10분
		 * 2교시
		 * 		1분
		 * 		2분
		 * 		...
		 * 		50분
		 * 		10분 쉬는 시간
		 * 		1분
		 * 		...
		 * 		10분
		 * 3교시
		 * 		1분
		 * 		2분
		 * 		...
		 * 		50분
		 * 		10분 쉬는 시간
		 * 		1분
		 * 		...
		 * 		10분
		 * 4교시
		 * 		1분
		 * 		2분
		 * 		...
		 * 		50분
		 * 		10분 쉬는 시간
		 * 		1분
		 * 		...
		 * 		10분
		 * 
		 * 점심을 드시겠습니까? (예 - 1, 아니오 - 2) : 1
		 * 30분 점심시간
		 * 		1분
		 * 		2분
		 * 		...
		 * 		30분
		 * 	30분 청소시간
		 * 		1분
		 * 		...
		 * 		30분
		 * 하교
		 */
		Scanner scanner = new Scanner(System.in);
		int lunch = 0;
		
		int i = 0;
		while(i < 4) {
			System.out.println((i + 1) + "교시");
			
			int j = 0;
			while(j < 61) {
				if(j < 50) {
					System.out.println("\t" + (j + 1) + "분");
				} else if(j == 50) {
					System.out.println("\t10분 쉬는 시간");
				} else if(j > 50) {
					System.out.println("\t" + (j - 50) + "분");
				}
				j++;
			}
			i++;
		}
		
		System.out.print("점심을 드시겠습니까? (예 - 1, 아니오 - 2) : ");
		lunch = scanner.nextInt();
		
		if(lunch == 1) {
			System.out.println("30분 점심시간");
			int k = 0;
			while(k < 30) {
				System.out.println("\t" + (k + 1) + "분");
				k++;
			}
		}
		
		System.out.println("30분 청소시간");
		int t = 0;
		while(t < 30) {
			System.out.println("\t" + (t + 1) + "분");
			t++;
		}
		System.out.println("하교");
		scanner.close();
	}

}
