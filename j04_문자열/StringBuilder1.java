package j04_문자열;

public class StringBuilder1 {

	public static void main(String[] args) {

		StringBuilder stringBuilder = new StringBuilder(); // 문자를 담는 공간
		
		stringBuilder.append("이름: ");
		stringBuilder.append("홍길동");
		
		stringBuilder.delete(1, 2); // 1번부터 2번 전까지의 인덱스 삭제
		System.out.println(stringBuilder);
	}

}
