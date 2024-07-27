package j07_반복.랜덤;

import java.util.Random;

public class Random3 {

	public static void main(String[] args) {

		Random random = new Random();
		
		int i = 0;
		int maxNum = 0;
		
		while(i < 10) {
			int rNum = random.nextInt(20) + 1;
			
			if(maxNum < rNum) {
				maxNum = rNum;
			}
			i++;
		}
		
		System.out.println("최댓값: " + maxNum);
		
		/*
		 * 1 ~ 20까지의 10개의 랜덤된 수 중 가장 큰 수를 출력하시오.
		 */
		
		
	}

}
