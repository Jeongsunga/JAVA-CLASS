package j03_연산자;

public class Operation6 {

	public static void main(String[] args) {

		/*
		 * score = 65
		 * 결과 result
		 * 
		 * 89보다 크면(A학점)
		 * 79보다 크면(B학점)
		 * 69보다 크면(C학점)
		 * 59보다 크면(D학점)
		 * 나머지는 (F학점)
		 * * 0보다 작거나 100보다 크면 (계산 불가)
		 */
		
		int score = 65;
		String result = (score < 0 || score > 100) ? "계산 불가"
						: score > 89 ? "A학점"
						: score > 79 ? "B학점"
						: score > 69 ? "C학점"
						: score > 59 ? "D학점"
						: "F학점";
						
		System.out.println(result);
	}

}
