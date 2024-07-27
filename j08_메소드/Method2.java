package j08_메소드;

public class Method2 {
	
	// 메소드의 종류
	
	// 반환이 없고 매개변수도 없는 메소드
	public static void test1() {
		System.out.println("test1 메소드 호출");
	}
	
	// 반환이 없고 매개변수가 하나인 메소드
	public static void test2(int num) {
		System.out.println("test2 메소드 호출");
		System.out.println("num: " + num);
	}
	
	// 반환이 없고 매개변수가 세 개인 메소드
	public static void test3(int num, int num1, int num2) {
		System.out.println("test3 메소드 호출");
		System.out.println("num: " + num);
		System.out.println("num1: " + num1);
		System.out.println("num2: " + num2);
	}
	
	// 반환이 있고 매개변수가 없는 메소드
	public static int test4() {
		System.out.println("test4 메소드 호출");
		return 100;
	}
	
	// 반환이 있고 매개변수도 있는 메소드
	public static String test5(String name, int age) {
		System.out.println("name: " + name);
		System.out.println("age: " + age);
		return name + age;
	}
	
	public static void main(String[] args) {
		test1();
		test2(10);
		test3(10, 100, 1000);
		test4();
		System.out.println(test4());
		test5("홍길동", 18);
		System.out.println(test5("홍길서", 16));
	}

}
