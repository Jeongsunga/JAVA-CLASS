package j07_반복.랜덤;

import java.util.Random;
import java.util.Scanner;

public class Random4 {

	public static void main(String[] args) {
		/*
		 * <스피또>
		 * 
		 * 그림 갯수 : 4 (2개 같다면 당첨)
		 * 
		 * 17번 구매만에 당첨되었습니다.
		 */
		
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		int photoNum = 0;
		int photo1 = 0;
		int photo2 = 0;
		int photo3 = 0;
		int winCount = 0;
		
		System.out.print("그림 갯수 : ");
		photoNum = scanner.nextInt();
		
		while(true) {
			photo1 = random.nextInt(photoNum) + 1;
			photo2 = random.nextInt(photoNum) + 1;
			photo3 = random.nextInt(photoNum) + 1;
			
			winCount++;
			
			if(photo1 == photo2) {
				System.out.println("당첨");
				break;
			}else if(photo2 == photo3) {
				System.out.println("당첨");
				break;
			}else if(photo1 == photo3) {
				System.out.println("당첨");
				break;
			}
		}
		
		System.out.println(winCount + "번 구매만에 당첨되었습니다.");
		scanner.close();
	}

}
