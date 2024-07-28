package j13_다형성2;

public class Instagram implements Messenger{

	@Override
	public void send() {
		System.out.println("인스타그램에서 메세지를 보냅니다.");
	}

	@Override
	public void receive() {
		System.out.println("인스타그램에서 메세지를 받습니다.");
	}
	
	public void feed() {
		System.out.println("인스타그램에서 피드를 올립니다.");
	}

}
