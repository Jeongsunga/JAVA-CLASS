package j09_클래스;

public class ComputerMain {

	public static void main(String[] args) {

		// 클래스 : 틀
		System.out.println(new Computer());
		System.out.println(new Computer());	// 객체 2개 생성 -> 출력 주소 다름 
		
		Computer c1 = new Computer();
		Computer c2 = new Computer();
		System.out.println(c1);
		System.out.println(c2);
		
		c1.showInfo();	// 기본 값 : 0 or NULL
		// 주소 참조를 통한 값 주입
		c1.cpu = "i7";
		c2.cpu = "i5";
		
		c1.company = "SAMSUNG";
		c1.ram = 8;
		c1.year = 2024;
		c1.graphic = "RTX3060";
		
		c2.company = "LG";
		c2.ram = 16;
		c2.year = 2023;
		c2.graphic = "GTX1080";
		
		c1.showInfo();
		c2.showInfo();
		
		c1.addRam(16);
		c1.showInfo();
		
	}

}
