package j06_조건;

public class SwitchCase1 {

	public static void main(String[] args) {

		switch(30) {
			case 10:
				System.out.println("10입니다.");
			case 20:
				System.out.println("20입니다.");
			case 30:
				System.out.println("30입니다.");
			case 40:
				System.out.println("40입니다.");
				break;
			case 50:
				System.out.println("50입니다.");
			default:
				System.out.println("필수사항");
		}
		
		System.out.println("스위치 케이스 밖");
	}

}
