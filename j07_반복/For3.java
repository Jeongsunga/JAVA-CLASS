package j07_반복;

public class For3 {

	public static void main(String[] args) {

		/*
		 * str = abcdefjhijk
		 * 
		 * 출력
		 * a
		 * b
		 * c
		 * d
		 * e
		 * f
		 * g
		 * h
		 * i
		 * j
		 * k
		 */
		
		String str = "abcdefjhijk";
		for(int i = 0; i < str.length(); i++) {
			System.out.println(str.substring(i, i+1));
		}
	}

}
