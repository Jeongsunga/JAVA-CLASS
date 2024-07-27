package j06_조건;

import java.util.Scanner;

public class Baskin {

	public static void main(String[] args) {

		/*
		 * 어서오세요. 베스킨라빈스입니다.
		 * 
		 * <주문메뉴>
		 * 1. 싱글레귤러(3,900원)
		 * 2. 더블레귤러(7,300원)
		 * 3. 파인트(9,800원)
		 * 4. 쿼터(18,500원)
		 * 주문하실 메뉴를 선택해주세요 : 3
		 * 
		 * <아이스크림 종류>
		 * 1. 슈팅스타
		 * 2. 초코나무숲
		 * 3. 엄마는 외계인
		 * 4. 뉴욕치즈
		 * 5. 체리쥬빌레
		 * 6. 아몬드봉봉
		 * 7. 쿠키앤크림
		 * 8. 레인보우샤베트
		 * 9. 민트초코
		 * 10. 바람과 함께 사라지다
		 * 
		 * 아이스크림 1을 선택하시오 : 3
		 * 아이스크림 2을 선택하시오 : 2
		 * 아이스크림 3을 선택하시오 : 1
		 * 결제금액 9,800원을 지급하시오 : 7000
		 * 2,800원 추가 결제하십시오 : 2800
		 * (주문 취소 되었습니다.)
		 * (결제 금액 9,800원을 지급하십시오 : 9800)
		 * 결제되었습니다. 카운터에서 주문하신 음식(슈팅스타, 초코나무숲, 엄마는 외계인)을 받아가시면 됩니다.
		 */
		
		Scanner scanner = new Scanner(System.in);
		StringBuilder stringBuilder = new StringBuilder();
		
		int menu = 0;
		int pay = 0;
		int pay2 = 0;
		int pay3 = 0;
		int ice1 = 0;
		int ice2 = 0;
		int ice3 = 0;
		int ice4 = 0;
		
		System.out.println("어서오세요. 베스킨라빈스입니다.");
		System.out.println("<주문메뉴>\r\n"
				+ "1. 싱글레귤러(3,900원)\r\n"
				+ "2. 더블레귤러(7,300원)\r\n"
				+ "3. 파인트(9,800원)\r\n"
				+ "4. 쿼터(18,500원)");
		System.out.print("주문하실 메뉴를 선택해주세요 : ");
		menu = scanner.nextInt();
		
		if(menu == 1) {
			pay = 3900;
		}else if(menu == 2) {
			pay = 7300;
		}else if(menu == 3) {
			pay = 9800;
		}else if(menu == 4) {
			pay = 18500;
		}
		
		System.out.println("<아이스크림 종류>\r\n"
				+ "1. 슈팅스타\r\n"
				+ "2. 초코나무숲\r\n"
				+ "3. 엄마는 외계인\r\n"
				+ "4. 뉴욕치즈\r\n"
				+ "5. 체리쥬빌레\r\n"
				+ "6. 아몬드봉봉\r\n"
				+ "7. 쿠키앤크림\r\n"
				+ "8. 레인보우샤베트\r\n"
				+ "9. 민트초코\r\n"
				+ "10. 바람과 함께 사라지다");
		
		if(menu == 1) {
			System.out.print("아이스크림 1을 선택하시오 : ");
			ice1 = scanner.nextInt();
		}else if(menu == 2) {
			System.out.print("아이스크림 1을 선택하시오 : ");
			ice1 = scanner.nextInt();
			System.out.print("아이스크림 2을 선택하시오 : ");
			ice2 = scanner.nextInt();
		}else if(menu == 3) {
			System.out.print("아이스크림 1을 선택하시오 : ");
			ice1 = scanner.nextInt();
			System.out.print("아이스크림 2을 선택하시오 : ");
			ice2 = scanner.nextInt();
			System.out.print("아이스크림 3을 선택하시오 : ");
			ice3 = scanner.nextInt();
		}else if(menu == 4) {
			System.out.print("아이스크림 1을 선택하시오 : ");
			ice1 = scanner.nextInt();
			System.out.print("아이스크림 2을 선택하시오 : ");
			ice2 = scanner.nextInt();
			System.out.print("아이스크림 3을 선택하시오 : ");
			ice3 = scanner.nextInt();
			System.out.print("아이스크림 4을 선택하시오 : ");
			ice4 = scanner.nextInt();
		}
		
		if(ice1 == 1) {
			stringBuilder.append("슈팅스타");
		}else if(ice1 == 2) {
			stringBuilder.append("초코나무숲");
		}else if(ice1 == 3) {
			stringBuilder.append("엄마는 외계인");
		}else if(ice1 == 4) {
			stringBuilder.append("뉴욕치즈");
		}else if(ice1 == 5) {
			stringBuilder.append("체리쥬빌레");
		}else if(ice1 == 6) {
			stringBuilder.append("아몬드봉봉");
		}else if(ice1 == 7) {
			stringBuilder.append("쿠키앤크림");
		}else if(ice1 == 8) {
			stringBuilder.append("레인보우샤베트");
		}else if(ice1 == 9) {
			stringBuilder.append("민트초코");
		}else if(ice1 == 10) {
			stringBuilder.append("바람과 함께 사라지다");
		}
		
		if(ice2 == 1) {
			stringBuilder.append("슈팅스타");
		}else if(ice2 == 2) {
			stringBuilder.append("초코나무숲");
		}else if(ice2 == 3) {
			stringBuilder.append("엄마는 외계인");
		}else if(ice2 == 4) {
			stringBuilder.append("뉴욕치즈");
		}else if(ice2 == 5) {
			stringBuilder.append("체리쥬빌레");
		}else if(ice2 == 6) {
			stringBuilder.append("아몬드봉봉");
		}else if(ice2 == 7) {
			stringBuilder.append("쿠키앤크림");
		}else if(ice2 == 8) {
			stringBuilder.append("레인보우샤베트");
		}else if(ice2 == 9) {
			stringBuilder.append("민트초코");
		}else if(ice2 == 10) {
			stringBuilder.append("바람과 함께 사라지다");
		}
		
		if(ice3 == 1) {
			stringBuilder.append("슈팅스타");
		}else if(ice3 == 2) {
			stringBuilder.append("초코나무숲");
		}else if(ice3 == 3) {
			stringBuilder.append("엄마는 외계인");
		}else if(ice3 == 4) {
			stringBuilder.append("뉴욕치즈");
		}else if(ice3 == 5) {
			stringBuilder.append("체리쥬빌레");
		}else if(ice3 == 6) {
			stringBuilder.append("아몬드봉봉");
		}else if(ice3 == 7) {
			stringBuilder.append("쿠키앤크림");
		}else if(ice3 == 8) {
			stringBuilder.append("레인보우샤베트");
		}else if(ice3 == 9) {
			stringBuilder.append("민트초코");
		}else if(ice3 == 10) {
			stringBuilder.append("바람과 함께 사라지다");
		}
		
		if(ice4 == 1) {
			stringBuilder.append("슈팅스타");
		}else if(ice4 == 2) {
			stringBuilder.append("초코나무숲");
		}else if(ice4 == 3) {
			stringBuilder.append("엄마는 외계인");
		}else if(ice4 == 4) {
			stringBuilder.append("뉴욕치즈");
		}else if(ice4 == 5) {
			stringBuilder.append("체리쥬빌레");
		}else if(ice4 == 6) {
			stringBuilder.append("아몬드봉봉");
		}else if(ice4 == 7) {
			stringBuilder.append("쿠키앤크림");
		}else if(ice4 == 8) {
			stringBuilder.append("레인보우샤베트");
		}else if(ice4 == 9) {
			stringBuilder.append("민트초코");
		}else if(ice4 == 10) {
			stringBuilder.append("바람과 함께 사라지다");
		}
		
		System.out.print("결제금액 " + pay + "원을 지급하십시오.");
		pay2 = scanner.nextInt();
		
		if(pay > pay2) {
			System.out.print((pay - pay2) + "원 추가 결제하십시오 : ");
			pay3 = scanner.nextInt();
			if(pay == (pay2 + pay3)) {
				System.out.println("결제되었습니다.");
				System.out.println("결제되었습니다. 카운터에서 주문하신 음식(" + stringBuilder + ")을 받아가시면 됩니다.");
			} else {
				System.out.println("주문 취소 되었습니다.");
			}
		}else if(pay == pay2) {
			System.out.println("결제되었습니다.");
			System.out.println("결제되었습니다. 카운터에서 주문하신 음식(" + stringBuilder + ")을 받아가시면 됩니다.");
		}
		
		scanner.close();
	}

}
