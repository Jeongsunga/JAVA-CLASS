package j13_다형성2;

public class Facebook implements Messenger{

	@Override
	public void send() {
		System.out.println("페이스북 메세지를 보냅니다.");
	}

	@Override
	public void receive() {
		System.out.println("페이스북 메세지를 받습니다.");
	}
	
	public void clickLike() {
		System.out.println("페이스북에서 '좋아요'를 누릅니다.");
	}
}
