package j14_최상위클래스;

public class ToStringMain {

	public static void main(String[] args) {

		ToString toString = new ToString();
		
		System.out.println(toString);
		System.out.println(toString.toString());
		// toString 메소드 생략되어 있었다.
		
		ToString2 toString2 = new ToString2(10, 20);
		System.out.println(toString2.toString());
		System.out.println(toString2); // toString만 재정의하면 클래스 내부의 값을 간단히 보여줌
	}

}
