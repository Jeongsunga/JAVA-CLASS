package j03_연산자;

public class Operation3 {

	public static void main(String[] args) {

		/*
		 * 윤년?
		 * 해당 년도가 4의 배수이고
		 * 100의 배수가 아니거나 400의 배수일 때
		 */
		
		int year = 2024;
		boolean result;
		
		result = (year % 4 == 0) && (year % 100 != 0 || year % 400 == 0);
		
		System.out.println(result);
	}

}
