package j07_반복;

import java.util.Scanner;

public class While2 {

	public static void main(String[] args) {

		/*
		 * 주문할 커피 수를 입력하시오: 5
		 * 
		 * 커피 1잔이 나왔습니다.
		 * (* 99잔 판매 가능합니다.)
		 * 커피 2잔이 나왔습니다.
		 * (* 98잔 판매 가능합니다.)
		 * ...
		 * 커피 5잔이 나왔습니다.
		 * (* 95잔 판매 가능합니다.)
		 */
		
		Scanner scanner = new Scanner(System.in);
		
		int shopCoffeeCount = 0;
		int orderCoffeeCount = 0;
		
		System.out.println("오늘의 판매 가능한 커피 수량 : ");
		shopCoffeeCount = scanner.nextInt();
		System.out.println("주문할 커피 수를 입력하시오 : ");
		orderCoffeeCount = scanner.nextInt();
		
		int i = 0;
		while(i < orderCoffeeCount) {
			System.out.println("커피" + (i + 1) + "잔이 나왔습니다.");
			System.out.println("*" + (shopCoffeeCount - (i + 1)) + "잔이 판매 가능합니다.");
			i++;
		}
		scanner.close();
	}

}
