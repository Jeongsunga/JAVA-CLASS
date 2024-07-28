package j13_다형성2;

public class MessengerMiddleWare {

	/*
	 * messenger를 받는다.
	 * 
	 * 메소드1
	 * sendMessage()
	 * 
	 * 메소드2
	 * receiveMessage()
	 * 
	 * 메소드3
	 * runAdds()
	 */
	
	private Messenger messenger;

	public MessengerMiddleWare(Messenger messenger) {
		this.messenger = messenger;
	}
	
	public void sendMessage() {
		messenger.send();
	}
	
	public void receiveMessage() {
		messenger.receive();
	}
	
	public void runAdds() {
		if(messenger instanceof Facebook) {
			((Facebook)messenger).clickLike();
		} else if(messenger instanceof KakaoTalk) {
			((KakaoTalk)messenger).sendPresent();
		} else if(messenger instanceof Instagram) {
			((Instagram)messenger).feed();
		} else {
			System.out.println("추가 기능이 없습니다.");
		}
	}
}
