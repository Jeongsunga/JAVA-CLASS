package j03_연산자;

public class Operation2 {

	public static void main(String[] args) {

		// 관계 연산자
		System.out.println(10 > 5);
		boolean a = 10 > 5;
		System.out.println(a);
		
		boolean result = 10 == 5;
		System.out.println(result);
		
		boolean result2 = 10 >= 5;
		System.out.println(result2);
		
		boolean result3 = 10 != 5;
		System.out.println(result3);
		
		int num = 10;
		System.out.println(num < 5);
		System.out.println(5 > num);
		// 결과는 같으나 기준은 무조건 왼쪽!
		
		System.out.println("" + result + result2); // boolean끼리 덧셈은 오류
		
		/*
		 * 논리연산 : boolean끼리 연산하는 것
		 * AND 연산(&&) : 곱
		 * true && true -> true
		 * true && false -> false
		 * false && false -> false
		 * 
		 * OR 연산(||) : 합
		 * true || true -> true
		 * true || false -> true
		 * false || false -> false
		 * 
		 * NOT연산(!) : 부정
		 * !true -> false
		 * !false -> true
		 * 
		 * false는 0이 아니다. true는 1이 아니다.
		 * 편리상 가정하는 것이다.
		 */
		
		System.out.println(2000 % 4 == 0 && 2024 % 100 == 0);
	}

}
