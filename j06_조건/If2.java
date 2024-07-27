package j06_조건;

import java.util.Scanner;

public class If2 {

	public static void main(String[] args) {

		/*
		 * 입력 score
		 * 결과 result
		 * 
		 * 89보다 크면(A학점)
		 * 79보다 크면(B학점)
		 * 69보다 크면(C학점)
		 * 59보다 크면(D학점)
		 * 나머지는 (F학점)
		 * * 0보다 작거나 100보다 크면 (계산 불가)
		 */
		
		Scanner scanner = new Scanner(System.in);
		int score = 0;
		String result = null;
		
		System.out.print("시험 점수를 입력하세요: ");
		score = scanner.nextInt();
		
		if(score <0 || score > 100) {
			result = "계산 불가";
		}else if(score > 89) {
			result = "A학점";
		}else if(score > 79){
			result = "B학점";
		}else if(score > 69){
			result = "C학점";
		}else if(score > 59){
			result = "D학점";
		}else{
			result = "F학점";
		}
		
		System.out.println("최종 결과는 " + result + "입니다.");
		scanner.close();
	}

}
