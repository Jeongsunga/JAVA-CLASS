package j06_조건;

public class If1 {

	public static void main(String[] args) {	
		
		
		// 돈이 있으면 택시를 타고, 없으면 걸어가라
		boolean money = false;
		boolean coin = true;
		
		if(money) {
			System.out.println("택시를 타고 가라");
		}
		
		if(!money){
			System.out.println("걸어가라");
		}
		
		// 중괄호 안에 실행문이 하나만 있는 경우 중괄호 생략 가능
		if(money) System.out.println("잔돈을 받아라");
		System.out.println("집 도착"); // if문에 걸리지 않는다.
		
		if (money) {
			System.out.println("택시를 타고 가라");
		}else {
			System.out.println("걸어가라");
			if(coin) {
				System.out.println("음료수 사먹어라");
			}else {
				System.out.println("그냥 집에 들어가라");
			}
		}
		
		/*
		 * if문의 기본 구조
		 * if(조건식){
		 * 		<수행할 문장1>;
		 * 		<수행할 문장2>;
		 * }else{
		 * 		<수행할 문장a>;
		 * 		<수행할 문장b>;
		 * ...
		 * }
		 */
		
	}

}
