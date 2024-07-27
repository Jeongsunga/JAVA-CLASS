package j09_클래스;

public class CarMain {

	public static void main(String[] args) {

		/*
		 * Car라는 틀을 만드시오
		 * 
		 * 변수
		 * company
		 * model
		 * color
		 * 
		 * 메소드
		 * showCarInfo()
		 * 		회사명: 000
		 * 		모델명: 000
		 * 		색상: 000
		 * 
		 * changeColor(1)
		 * 		색상이 red로 변경되었습니다.
		 * changeColor(2)
		 * 		색상이 blue로 변경되었습니다.
		 * changeColor(3)
		 * 		색상이 orange로 변경되었습니다.
		 * 
		 * 3대 자동차를 만드시오
		 * 현대자동차
		 * 쏘나타
		 * 화이트
		 * 
		 * 기아
		 * K5
		 * 블랙
		 * 
		 * 현대자동차
		 * 아반떼
		 * 그레이
		 */
		
		Car car1 = new Car();
		Car car2 = new Car();
		Car car3 = new Car();
		
		car1.company = "현대자동차";
		car1.color = "화이트";
		car1.model = "쏘나타";
		
		car2.company = "기아";
		car2.color = "블랙";
		car2.model = "K5";
		
		car3.company = "현대자동차";
		car3.color = "그레이";
		car3.model = "아반떼";
		
		car1.changeColor(2);
		
		car1.showCarInfo();
		car2.showCarInfo();
		car3.showCarInfo();
		
		car1.showModel("테슬라X");
		System.out.println(car1.model);
		
	}

}
