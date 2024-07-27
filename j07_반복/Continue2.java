package j07_반복;

import java.util.Scanner;

public class Continue2 {

	public static void main(String[] args) {
		
		String name = "홍길동";
		System.out.println(name == "홍길동");
		System.out.println(name.substring(0, 1).equals("홍"));
		
		/*
		 * 문장을 입력하시오 : 안녕 친구들 나는 홍길동이야.
		 * 전체 텍스트 수 : 16
		 * 띄어쓰기 포함 안 한 텍스트 수 : 13
		 */
		
		Scanner scanner = new Scanner(System.in);
		String text = null;
		int textNum = 0;
		
		System.out.print("문장을 입력하시오 : ");
		text = scanner.nextLine();
		
		for(int i = 0; i < text.length(); i++) {
			if(text.substring(i, i + 1).equals(" ")) continue;
			textNum ++;
		}
		
		System.out.println("전체 텍스트 수 : " + text.length());
		System.out.println("띄어쓰기 포함 안 한 텍스트 수 : " + textNum);
		scanner.close();
	}

}
