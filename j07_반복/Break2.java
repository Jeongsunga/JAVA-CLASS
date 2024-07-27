package j07_반복;

import java.util.Scanner;

public class Break2 {

	public static void main(String[] args) {

		/*
		 * 커피 : 300
		 * 우유 : 3000
		 * 
		 * 아메리카노(-50)
		 * 라떼(-50, -300)
		 * 
		 * 어서오세요. 카페입니다.
		 * 주문하실 음료를 선택해주세요(1. 아메리카노, 2. 라떼) : 1
		 * 아메리카노 나왔습니다.
		 * 
		 * 금일 주문정보
		 * 아메리카노 : 1
		 * 라떼 : 0
		 * 
		 * 어서오세요. 카페입니다.
		 * 주문하실 음료를 선택해주세요(1. 아메리카노, 2. 라떼) : 2
		 * 라떼 나왔습니다.
		 * 
		 * 금일 주문정보
		 * 아메리카노 : 1
		 * 라떼 : 1
		 * 
		 * ...
		 * 커피나 우유가 다 떨어지면
		 * 
		 * 재료소진으로 주문 마감합니다.
		 */
		
		Scanner scanner = new Scanner(System.in);
		
		int coffee = 300;
		int milk = 3000;
		int choiceNum = 0;
		
		while(true) {
			System.out.println("어서오세요. 카페입니다.");
			System.out.print("주문하실 음료를 선택해주세요(1. 아메리카노, 2. 라떼) : ");
			choiceNum = scanner.nextInt();
			
			if(choiceNum == 1) {
				coffee -= 50;
				System.out.println("아메리카노 나왔습니다.");	
			}else if(choiceNum == 2) {
				coffee -= 50;
				milk -= 300;
				System.out.println("라떼 나왔습니다.");	
			}else {
				continue;
			}
			
			if(coffee == 0 || milk == 0) {
				System.out.println("재료소진으로 주문 마감합니다.");
				break;
			}
		}
		
		scanner.close();
	}

}
