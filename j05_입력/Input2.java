package j05_입력;

import java.util.Scanner;

public class Input2 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		String str = null;
		int num = 0;
		
		System.out.print("오늘의 날씨를 서술하시오: ");
		str = scanner.nextLine(); // 띄어쓰기 포함
		System.out.print("오늘의 기온: ");
		num = scanner.nextInt();
		
		System.out.println("날씨: " + str);
		System.out.println("기온: " + num);
		
		scanner.close();
	}

}
