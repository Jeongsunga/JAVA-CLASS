package j07_반복;

public class While1 {

	public static void main(String[] args) {

		int i = 0;	// 초기문
		
		while(i < 5) {	// 조건문
			System.out.println(i);	// 실행문
			i++; // 후처리문
		}
		
		System.out.println("프로그램 종료");
		
		/*
		 * 홍길동1
		 * 홍길동2
		 * 홍길동3
		 * 홍길동4
		 * 홍길동5
		 */
		
		int num = 0;
		
		while(num < 5) {	// 반복 횟수가 기입되도록 맞춰줘야 함!
			System.out.println("홍길동" + (num + 1));
			num++;
		}
	}

}
