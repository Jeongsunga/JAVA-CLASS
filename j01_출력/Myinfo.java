package j01_출력;

public class Myinfo {

	public static void main(String[] args) {

		int age;
		age = 10;
		
		int age2 = 20;
		
		char name1 = '정';
		char name2 = '승';
		char name3 = '아';
		
		// 자동완성 단축키 -> Ctrl + Space
		// 출력 -> sysout(syso) + Ctrl + Space
		// 선언은 무조건 한 번! 대입은 여러 번 가능!
		System.out.println(age);
		System.out.println(age2);
		
		System.out.println(name1);
		System.out.println(name2);
		System.out.println(name3);
		
		System.out.println(name1 + name2 + name3); // 아스키코드(ASCII)의 합

	}

}
