package j13_다형성.인터페이스;

public class Mouse implements HDMI{

	@Override
	public void connect() {
		System.out.println("HDMI를 통해 마우스를 연결합니다.");
	}

	@Override
	public void disConnect() {
		System.out.println("HDMI를 통해 연결된 마우스를 해제합니다.");	
	}

}
