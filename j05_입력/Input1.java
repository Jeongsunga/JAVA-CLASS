package j05_입력;

import java.util.Scanner;

public class Input1 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
				
		System.out.print("이름을 입력하시오: ");
		String name = scanner.next(); // 띄어쓰기 미포함
		System.out.println("이름: " + name);
		
		System.out.println(scanner.next()); // "홍 길 동" 입력 시 "홍"만 출력 
		scanner.close();

	}

}
