package j06_조건;

import java.util.Scanner;

public class If3 {

	public static void main(String[] args) {

		/*
		 * x값을 입력하시오 : 4
		 * y값을 입력하시오 : -7
		 * 결과 : 4사분면 입니다.
		 * 
		 * x값을 입력하시오 : -4
		 * y값을 입력하시오 : 7
		 * 결과 : 2사분면 입니다.
		 * 
		 * x, y 값 중 하나라도 0이면 4사분면으로 표기하시오.
		 */
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("x값을 입력하시오 : ");
		int x_number = scanner.nextInt();
		System.out.print("y값을 입력하시오 : ");
		int y_number = scanner.nextInt();
		
		String result = null;
		
		if(x_number > 0 && y_number > 0) {
			result = "1사분면";
		} else if(x_number < 0 && y_number > 0) {
			result = "2사분면";
		} else if(x_number < 0 && y_number < 0) {
			result = "3사분면";
		} else {
			result = "4사분면";
		}
		
		System.out.println(result + "입니다.");
		scanner.close();
	}

}
