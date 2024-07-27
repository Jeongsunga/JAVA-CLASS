package j07_반복.랜덤;

import java.util.Random;

public class Random2 {

	public static void main(String[] args) {

		Random random = new Random();
		
		int rNum = random.nextInt(10);	// 0 ~ 9까지의 수 랜덤하게 출력
		System.out.println(rNum);
	}

}
