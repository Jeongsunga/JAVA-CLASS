package j09_클래스;

public class Car {
	
	String company;
	String model;
	String color;
	
	public Car() {
		System.out.println("기본 생성자 호출");
		/*
		 * 특징(암기 필수)
		 * 1. 생성자는 주소 값을 리턴
		 * 2. 생성자의 이름은 클래스명과 동일
		 * 3. 기본 생성자는 생략이 가능
		 */
	}
	
	void showCarInfo() {
		System.out.println("회사명: " + company);
		System.out.println("모델명: " + model);
		System.out.println("색상: " + color);
	}
	
	void changeColor(int num) {
		if(num == 1) {
			color = "red";
			System.out.println("색상이 red로 변경되었습니다.");
		}else if(num == 2) {
			color = "blue";
			System.out.println("색상이 blue로 변경되었습니다.");
		}else if(num == 3) {
			color = "orange";
			System.out.println("색상이 orange로 변경되었습니다.");
		}else {
			System.out.println("지원하지 않는 색상입니다.");
		}
	}
	
	void showModel(String model) {
		System.out.println(model);
		this.model = model;
	}
}
