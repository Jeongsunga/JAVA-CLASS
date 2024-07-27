package j09_클래스.생성자;

public class Car {
	
	String company;
	String model;
	String color;
	
	/*
	 * 기본 생성자는 생략이 가능하다(생성자 오버로딩이 없을 시)
	 * 생성자를 하나라도 오버로딩한 경우에는
	 * 기본 생성자를 사용하려면 무조건 명시!! 해줘야 함
	 */
	
	public Car() {

	}
	
	public Car(String company, String model, String color) {
		this.company = company;
		this.model = model;
		this.color = color;
	}
}
