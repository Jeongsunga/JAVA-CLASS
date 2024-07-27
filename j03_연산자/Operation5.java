package j03_연산자;

public class Operation5 {

	public static void main(String[] args) {

		/*
		 * 특수기호, 대소문자, 숫자
		 */
		
		boolean symbol = true;
		boolean upper = false;
		boolean lower = true;
		boolean num = true;
		
		String result;
		
		result = !symbol ? "특수기호가 없습니다."
				: !upper ? "대문자가 없습니다."
				: !lower ? "소문자가 없습니다."
				: !num ? "숫자가 없습니다."
				: "적절한 비밀번호입니다.";
		
		System.out.println(result);
	}

}
