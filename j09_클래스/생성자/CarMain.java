package j09_클래스.생성자;

public class CarMain {

	public static void main(String[] args) {
		// 값 주입 2 - 생성자를 통한 값 주입
		Car car = new Car("현대", "쏘나타", "그레이");
		Car car2 = new Car();
		
		System.out.println(car.company);
		System.out.println(car.model);
		System.out.println(car.color);
	}

}
