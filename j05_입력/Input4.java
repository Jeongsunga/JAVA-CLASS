package j05_입력;

import java.util.Scanner;

public class Input4 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		String name = null;
		String name2 = null;

		System.out.print("입력: ");
		name = scanner.next();
		scanner.nextLine();
		System.out.print("입력2: ");
		name2 = scanner.nextLine();

		System.out.println();
		System.out.println(name);
		System.out.println(name2);
		
		scanner.close();
	}

}
