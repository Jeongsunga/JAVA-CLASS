package j06_조건;

import java.util.Scanner;

public class SwitchCase2 {

	public static void main(String[] args) {

		/*
		 * 점수를 입력하시오 : 86
		 * 학점 : B
		 * 
		 * 90점대는 A
		 * 80점대는 B
		 * 70점대는 C
		 * 60점대는 D
		 * 나머지는 F
		 */
		
		Scanner scanner = new Scanner(System.in);
		int num = 0;
		
		System.out.print("점수를 입력하시오 : ");
		num = scanner.nextInt();
		
		switch(num / 10) {
		case 10:
		case 9:
			System.out.println("학점은 A");
			break;
		case 8:
			System.out.println("학점은 B");
			break;
		case 7:
			System.out.println("학점은 C");
			break;
		case 6:
			System.out.println("학점은 D");
			break;
		default:
			System.out.println("학점은 F");
		}
		scanner.close();
	}

}
