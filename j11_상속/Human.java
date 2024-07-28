package j11_상속;

public class Human extends Animal{
	
	public Human(){
		// super();가 생략되어 있음
		System.out.println("Human 객체 생성");
	}
	
	@Override
	public void move() {
		System.out.println("사람이 두 발로 걷습니다.");
	}
	public void readBooks() {
		System.out.println("사람이 책을 읽습니다.");
	}
}
