package j13_다형성.인터페이스;

public class Moniter implements HDMI{

	@Override
	public void connect() {
		System.out.println("HDMI를 통해 모니터를 연결합니다.");
	}

	@Override
	public void disConnect() {
		System.out.println("HDMI를 통해 연결된 모니터를 해제합니다.");
	}

}
