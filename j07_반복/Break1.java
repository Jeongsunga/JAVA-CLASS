package j07_반복;

public class Break1 {

	public static void main(String[] args) {
		
		int i = 0;
		
		while(i < 10) {
			System.out.println(i);
			
			for(int j = 0; j < 3; j++) {
				System.out.println(j);
				if(j == 1) {
					System.out.println("break - for");
					break;
				}
			}
			
			if(i == 2) {
				System.out.println("break - while");
				break;
			}
			i++;
		}
	}

}
