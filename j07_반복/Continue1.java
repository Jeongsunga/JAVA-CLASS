package j07_반복;

import java.util.Scanner;

public class Continue1 {

	public static void main(String[] args) {

		for(int i = 0; i < 10; i++) {
			if(i % 2 == 0) {
				System.out.println("짝수입니다.");
				continue;
			}
			System.out.println(i);
		}
		
		// 짝수일 때 '짝수입니다'가 나오기
		
		/*
		 * 문제
		 * continue를 사용하여 1부터 입력받은 수까지의 홀수의 합을 구하시오.
		 */
		
		Scanner scanner = new Scanner(System.in);
		int num = 0;
		int sum = 0;
		
		System.out.print("숫자를 입력하시오: ");
		num = scanner.nextInt();
		
		for(int i = 0; i < num; i++) {
			int nowNum = i + 1;
			if(nowNum % 2 == 0) {
				continue;
			}
			sum += nowNum;
		}
		System.out.println("홀수들의 최종합 : " + sum);
		scanner.close();
	}

}
