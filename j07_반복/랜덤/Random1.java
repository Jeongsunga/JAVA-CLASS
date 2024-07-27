package j07_반복.랜덤;

public class Random1 {

	public static void main(String[] args) {

		double rNum = Math.random();
		System.out.println(rNum);
		
		/*
		 * 난수 10개를 뽑아서
		 * 소수점 2번째 수까지만 출력하시오
		 */
		
		int i = 0;
		while (i < 10) {
			System.out.println((int)(Math.random() * 100));
			i++;
		}
	}

}
