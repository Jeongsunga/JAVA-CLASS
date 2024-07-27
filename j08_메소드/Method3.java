package j08_메소드;

public class Method3 {
	
	/*
	 * 메소드 오버로딩
	 * : 매개변수의 형태(자료형과 개수)가 다르면 동일한 메소드명을
	 * 사용해서 메소드를 정의할 수 있다.
	 */
	
	public static void test1() {
		System.out.println("test1 메소드 호출");
	}
	
	public static void test1(int num) {
		System.out.println("test2 메소드 호출");
	}
	
	public static void test1(String name) {
		System.out.println("name을 매개변수로 받는 test1");
	}
	
	public static void test1(String name, String age) {
		System.out.println("name, age를 매개변수로 받는 test1");
		System.out.println("name" + name);
		System.out.println("age" + age);
	}
	
	public static void main(String[] args) {
		test1();
		test1(10);
		test1("홍길동");
		test1("홍길동", "18");
	}

}
