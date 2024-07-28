package j11_상속;

public class Tiger extends Animal{
	
	public Tiger(){
		// super();가 생략되어 있음
		System.out.println("Tiger 객체 생성");
	}
	
	// 오버라이딩 : 재정의
	@Override
	public void move() {
		System.out.println("음악을 잘합니다.");
	}
}
