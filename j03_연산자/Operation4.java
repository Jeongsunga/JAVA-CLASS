package j03_연산자;

public class Operation4 {

	public static void main(String[] args) {
		
		// 삼항 연산자
		int num = 1000;
		System.out.println(num < 2000 ? "2000보다 작음" 
										: "2000보다 큼");
		char a = num < 2000 ? 'T' : 'F';
		System.out.println(a);
		
		int num2 = 1300;
		System.out.println(num2 > 2000 ? "2000보다 큼"
						: num2 > 1500 ? "1500보다 큼"
						: num2 > 1000 ? "1000보다 큼"
						: "1000보다 작음");
	}

}
