package j04_문자열;

public class StringBuilder2 {

	public static void main(String[] args) {

		String names = "홍길동님, 홍길서님, 홍길남님, 홍길북님";
		
		StringBuilder stringBuilder = new StringBuilder();
		
		// 홍길동/홍길서/홍길남/홍길북 출력하기
		
		// 풀이 1 (Me)
//		names = names.replaceAll("님, ", "/");
//		names = names.replace("님", "");
//		stringBuilder.append(names);

		
		// 풀이 2
//		stringBuilder.append(names.substring(0, 3));
//		stringBuilder.append("/");
//		stringBuilder.append(names.substring(6, 9));
//		stringBuilder.append("/");
//		stringBuilder.append(names.substring(12, 15));
//		stringBuilder.append("/");
//		stringBuilder.append(names.substring(18, 21));
		
		// 풀이 3
//		int index = names.indexOf("님");
//		stringBuilder.append(names.substring(index-3, index));
//		stringBuilder.append("/");
//		
//		index = names.indexOf("님", index + 1);
//		stringBuilder.append(names.substring(index-3, index));
//		stringBuilder.append("/");
//		
//		index = names.indexOf("님", index + 1);
//		stringBuilder.append(names.substring(index-3, index));
//		stringBuilder.append("/");
//		
//		index = names.indexOf("님", index + 1);
//		stringBuilder.append(names.substring(index-3, index));
		
		// 풀이 4 (Me)
		for(int i = 0; i < names.length(); i++) {
			int index = names.indexOf("님", i);
			stringBuilder.append(names.substring(index-3, index));
			stringBuilder.append("/");
			i = index;
		}
		System.out.println(stringBuilder);
		
		// 홍길동홍길서홍길남홍길북 삭제하기
		
		// 풀이 1 (Me)
		StringBuilder stringBuilder2 = new StringBuilder();
		stringBuilder2.append(names);
		for(int i = 0; i < stringBuilder2.length(); i++) {
			int index = stringBuilder2.indexOf("님");
			stringBuilder2.delete(index, index + 3);
			if(index == stringBuilder2.length() + 1)
				stringBuilder2.delete(index, index + 1);
			i = index;
		}
		System.out.println(stringBuilder2);
		
		// 풀이 2
//		StringBuilder stringBuilder2 = new StringBuilder();
//		stringBuilder2.append(names);
//		
//		int index2 = stringBuilder2.indexOf("님");
//		stringBuilder2.delete(index2, index2 + 3);
//		index2 = stringBuilder2.indexOf("님");
//		stringBuilder2.delete(index2, index2 + 3);
//		index2 = stringBuilder2.indexOf("님");
//		stringBuilder2.delete(index2, index2 + 3);
//		index2 = stringBuilder2.indexOf("님");
//		stringBuilder2.delete(index2, index2 + 1);
//		System.out.println(stringBuilder2);
	}

}
