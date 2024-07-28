package j10_배열;

import java.util.Scanner;

public class Array1 {

	public static void main(String[] args) {

		int num = 5;
		
		// 정수 배열
		int[] numbers = new int[5];
		System.out.println(numbers[4]);
		
		// 문자열 배열
		String[] strArray = new String[3];
		strArray[1] = "hi";
		System.out.println(strArray[1]);
		
		// 객체 배열
		Scanner[] scanArray = new Scanner[5];
		scanArray[1] = new Scanner(System.in);
	}

}
