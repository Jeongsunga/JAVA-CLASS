package j14_최상위클래스;

public class StringEquals {

	public static void main(String[] args) {

		String name1 = "홍길동";
		String name2 = "홍길동"; // "홍길동"이라는 동일한 문자열을 가리킴
		String name3 = new String("홍길동"); // 주소 할당
		String name4 = name2;
		
		System.out.println(name1.toString());
		System.out.println(name2);
		System.out.println(name3);
		System.out.println(name4);
		
		// 주소 비교
		System.out.println(name1 == name2);
		System.out.println(name1 == name3);
		System.out.println(name3 == name4);
		System.out.println(name2 == name4);
		
		// 값(문자열) 비교 -> String
		System.out.println(name1.equals(name2));
		System.out.println(name1.equals(name3));
		System.out.println(name3.equals(name4));
		System.out.println(name2.equals(name4));
		
		Student s1 = new Student(20240001, "홍길동");
		Student s2 = new Student(20240001, "홍길동");
		Student s3 = new Student(20240002, "홍길서");
		Student s4 = new Student(20240002, "홍길동");
		
		// 주소 비교 -> Object
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
		System.out.println(s4.hashCode());	// 변수에 따른 16진수 주소 출력 -> 모두 다른 출력
	}

}
