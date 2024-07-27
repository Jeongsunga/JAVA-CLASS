package j02_상수;

public class Cast {

	public static void main(String[] args) {

		// 업캐스팅 - 묵시적 형변환
		char a = 'A';
		int b = a;
		double c = b; // 기본 자료형(소문자)
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		// 다운캐스팅 - 명시적 형변환
		int d = (int)c;
		char e = (char)d;
		
		System.out.println(d);
		System.out.println(e); 
		
		String str = "Hello"; // 클래스 자료형(대문자)
		System.out.println(str);
		
	}

}
