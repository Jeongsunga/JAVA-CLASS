package j04_문자열;

public class String1 {

	public static void main(String[] args) {

		System.out.println("안녕하세요");
		
		// 철수가 말했습니다. "안녕"
		System.out.println("철수가 말했습니다. \"안녕\"");
		
		/*
		 * 기본 자료형 : int, double, char, bool
		 * 클래스 자료형(기능 제공) : String
		 */
		
		String address = "부산시 진구 가야동";
		System.out.println(address.indexOf("시"));
		
		String address2 = "부산시 동래구 사직동";
		int index = address2.indexOf("동");
		System.out.println(index); // 인덱스에 띄어쓰기도 포함
		
		int lastIndex = address2.lastIndexOf("동");
		System.out.println(lastIndex);
		
		String subAddress = address2.substring(0, 3);
		System.out.println(subAddress);
		System.out.println();
		
		/*
		 * 문제
		 * "부산광역시 서구 부민동"에서
		 * indexOf, lastIndexOf를 사용해서
		 * "부산광역시 서구"까지 출력
		 */
		
		String address3 = "부산광역시 서구 부민동";
		String subAddress2 = address3.substring(address3.indexOf("부"), address3.lastIndexOf("부") - 1);
		System.out.println(subAddress2);
		
		// 문자열 바꾸기
		String replaceAddress = address3.replace(" ", "-");
		System.out.println(replaceAddress);
		
		String replaceAddress2 = address3.replaceAll("부민", "전포");
		System.out.println(replaceAddress2);
	}

}
