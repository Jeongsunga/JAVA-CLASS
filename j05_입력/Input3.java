package j05_입력;

import java.util.Scanner;

public class Input3 {

	public static void main(String[] args) {
		
		/*
		 * Scanner
		 * 
		 * <입력>								변수명
		 * 이름: 홍길동				next()		name
		 * 나이: 18					nextInt() 	age
		 * 주소: 부산 진구 전포동	nextLine()	address
		 * 연락처: 010-1234-5678	nextLine()	phone
		 * 
		 * <출력>
		 * 이름은 홍길동입니다.
		 * 나이는 18세입니다.
		 * 주소는 부산 진구 전포동입니다.
		 * 연락처는 010-1234-5678입니다.
		 */
		Scanner scanner = new Scanner(System.in);
		String name = null;
		int age = 0;
		String address = null;
		String phone = null;
		
		System.out.print("이름: ");
		name = scanner.next();
		System.out.print("나이: ");
		age = scanner.nextInt();
		scanner.nextLine();
		System.out.print("주소: ");
		address = scanner.nextLine();
		System.out.print("연락처: ");
		phone = scanner.nextLine();
		
		System.out.println("이름은 " + name + "입니다.");
		System.out.println("나이는 " + age + "세입니다.");
		System.out.println("주소는 " + address + "입니다.");
		System.out.println("연락처는 " + phone + "입니다.");
		
		scanner.close();
	}

}
